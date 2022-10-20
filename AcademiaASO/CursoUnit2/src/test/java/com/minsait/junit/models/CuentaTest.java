package com.minsait.junit.models;

import com.minsait.junit.exceptions.DineroInsuficienteException;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    Cuenta cuenta;

    TestInfo testInfo;
    TestReporter testReporter;




    @BeforeEach
    void setUp(TestInfo testInfo, TestReporter testReporter) {
        this.cuenta= new  Cuenta("Ricardo", new BigDecimal("1000.61"));
        testReporter.publishEntry("Iniciando el método");
        this.testInfo= testInfo;
        this.testReporter= testReporter;
        testReporter.publishEntry("ejecutando " + Objects.requireNonNull(testInfo.getTestMethod().orElse(null)).getName());

    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando el método de prueba");

    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Iniciando todos los test!");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("finalizando todos los test!");

    }

    @Nested
    @DisplayName("metodos de prueba dentro de esta clase nombre y el saldo")
    class CuentaNombreSaldoTest{

        @Test
        @DisplayName("Test de la cuenta!")
        void testNombreCuenta() {
            String esperado = "Ricardo";
            String real=cuenta.getPersona();
            assertNotNull(real);
            assertEquals(esperado, real);
            assertTrue(real.equals(esperado));

        }

        @Test
        void testNombreCuenta2() {
            Cuenta cuenta = new Cuenta("Alex", new BigDecimal("1000.61"));
//            cuenta.setPersona("Alex");
            String esperado = "Alex";
            String real = cuenta.getPersona();
            assertNotNull(real);
            Assertions.assertEquals(esperado, real);
            assertTrue(real.equals(esperado));
        }

        @Test
        void testSaldoCuenta(){
            assertNotNull(cuenta.getSaldo());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO)<0);
            assertEquals("1000.61",cuenta.getSaldo().toPlainString());
        }

        @Test
        void testSaldoCuentaAlex(){
            assertNotNull(cuenta.getSaldo());
            Cuenta cuenta1 = new Cuenta("Alex", new BigDecimal("1000.61"));
            assertEquals(1000.61, cuenta1.getSaldo().doubleValue());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO)<0);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);
        }

        @Test
        void testReferencia(){
            Cuenta cuenta2 = new Cuenta("Ricardo", new BigDecimal("1000.61"));
            assertEquals(cuenta, cuenta2);
        }

        @Test
        void testReferenciaCuenta() {
            Cuenta cuenta = new Cuenta("John Doe", new BigDecimal("1000.61"));
            Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("1000.61"));

            Banco banco = new Banco();
            banco.addCuenta(cuenta);
            banco.addCuenta(cuenta1);

            //assertNotEquals(cuenta, cuenta1);
            assertEquals(cuenta, cuenta1);

        }
    }


    @Nested
    @DisplayName("Test Operaciones Cuenta")
    class testOperacionesCuenta{


        @Test
        void testRetiroCuenta() {
            cuenta.retirar(new BigDecimal(500));
            assertNotNull( cuenta.getSaldo());
            assertEquals(500.61,cuenta.getSaldo().doubleValue());
        }

        @Test
        void tesDebitoCuenta() {
            Cuenta cuenta = new Cuenta("Alex", new BigDecimal("1000.61"));
            cuenta.retirar(new BigDecimal(100));
            assertNotNull(cuenta.getSaldo());
           // assertEquals("900.61", cuenta.getSaldo().intValue());
            assertEquals("900.61", cuenta.getSaldo().toPlainString());

        }

        @Test
        void testCreditoCuenta() {
            Cuenta cuenta = new Cuenta("Alex", new BigDecimal("1000.61"));
            cuenta.depositar(new BigDecimal(100));
            assertNotNull(cuenta.getSaldo());
           // assertEquals("1100.61", cuenta.getSaldo().intValue());
            assertEquals("1100.61", cuenta.getSaldo().toPlainString());
        }

        @Test
        void testDepositarCuenta() {
            cuenta.depositar(new BigDecimal(500));
            assertEquals(1500.61,cuenta.getSaldo().doubleValue());

        }




        @Test
        void testTransferirEntreCuentas() {
            Cuenta cuenta2 = new Cuenta("Bill Gates", new BigDecimal(10000));
            Banco banco = new Banco();
            banco.setNombre("BBVA");

            banco.transferir(cuenta2, cuenta, new BigDecimal(9000));

            assertEquals(1000,cuenta2.getSaldo().doubleValue());
            assertEquals(10000.61, cuenta.getSaldo().doubleValue());

        }

    }

    @Test
    void testException(){
        Exception exception=assertThrows(DineroInsuficienteException.class, ()->{
            cuenta.retirar(new BigDecimal(1500));
        });
        assertEquals("Dinero insuficiente", exception.getMessage());
        assertTrue(exception.getClass().equals(DineroInsuficienteException.class));

    }


    @Test
    void testRelacionBancoCuentas() {
        Cuenta cuenta2 = new Cuenta("Bill Gates", new BigDecimal(10000));
        Banco banco = new Banco();
        banco.addCuenta(cuenta);
        banco.addCuenta(cuenta2);
        banco.setNombre("BBVA");

        banco.transferir(cuenta2,cuenta, new BigDecimal(9000));

        assertAll(
                ()-> assertEquals(10000.61, cuenta.getSaldo().doubleValue(), ()-> "El saldo no es correcto"),
                ()-> assertEquals(1000, cuenta2.getSaldo().intValue()),
                ()-> assertEquals(2,banco.getCuentas().size()),
                ()-> assertEquals(banco.getNombre(), cuenta.getBanco().getNombre()),
                ()-> assertEquals(banco.getNombre(), cuenta2.getBanco().getNombre()),

                ()-> assertEquals(cuenta.getPersona(),banco.getCuentas().stream()
                .filter(c-> c.getPersona().equals("Ricardo")).findFirst().get().getPersona())


        );


    }
}