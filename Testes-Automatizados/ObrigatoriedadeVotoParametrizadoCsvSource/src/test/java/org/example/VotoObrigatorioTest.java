package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VotoObrigatorioTest {

    @ParameterizedTest
    @CsvSource(value = {
            "0, Sem direito a votar",
            "1, Sem direito a votar",
            "2, Sem direito a votar",
            "5, Sem direito a votar",
            "10, Sem direito a votar",
            "15, Sem direito a votar"})
    void menorDe16DeveSerSemDireito(int idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(idade));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "18, Voto obrigatório",
            "25, Voto obrigatório",
            "40, Voto obrigatório",
            "69, Voto obrigatório",
            "70, Voto obrigatório"})
    void entre18E70DeveSerObrigatorio(int idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(idade));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "16, Voto facultativo",
            "17, Voto facultativo",
            "71, Voto facultativo",
            "80, Voto facultativo",
            "90, Voto facultativo"})
    void entre16E18OuMaiorDe70DeveSerFacultativo(int idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(idade));
    }
}