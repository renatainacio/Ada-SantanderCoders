package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VotoObrigatorioTest {

    @ParameterizedTest
    @MethodSource(value="geraIdadesMenor16")
    void menorDe16DeveSerSemDireito(int idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(idade));
    }

    @ParameterizedTest
    @MethodSource(value="geraIdadesEntre18E70")
    void entre18E70DeveSerObrigatorio(int idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(idade));
    }

    @ParameterizedTest
    @MethodSource(value="geraIdadesEntre16E18OuMaiorDe70")
    void entre16E18OuMaiorDe70DeveSerFacultativo(int idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(idade));
    }

    public static Stream<Arguments> geraIdadesMenor16() {

        return Stream.of(
                Arguments.of(0, "Sem direito a votar"),
                Arguments.of(2, "Sem direito a votar"),
                Arguments.of(5, "Sem direito a votar"),
                Arguments.of(10, "Sem direito a votar"),
                Arguments.of(15, "Sem direito a votar"));
    }

    public static Stream<Arguments> geraIdadesEntre18E70(){

        return Stream.of(
                Arguments.of(18, "Voto obrigatório"),
                Arguments.of(20, "Voto obrigatório"),
                Arguments.of(40, "Voto obrigatório"),
                Arguments.of(69, "Voto obrigatório"),
                Arguments.of(70, "Voto obrigatório"));
    }

    public static Stream<Arguments> geraIdadesEntre16E18OuMaiorDe70(){
        return Stream.of(
                Arguments.of(16, "Voto facultativo"),
                Arguments.of(16, "Voto facultativo"),
                Arguments.of(17, "Voto facultativo"),
                Arguments.of(71, "Voto facultativo"),
                Arguments.of(80, "Voto facultativo"),
                Arguments.of(90, "Voto facultativo"));
    }
}