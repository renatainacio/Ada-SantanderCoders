package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VotoObrigatorioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/sem-direito-a-voto.csv", numLinesToSkip = 1)
    void menorDe16DeveSerSemDireito(String idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(Integer.parseInt(idade)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/voto-obrigatorio.csv", numLinesToSkip = 1)
    void entre18E70DeveSerObrigatorio(String idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(Integer.parseInt(idade)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/voto-facultativo.csv", numLinesToSkip = 1)
    void entre16E18OuMaiorDe70DeveSerFacultativo(String idade, String expected) {
        assertEquals(expected, VotoObrigatorio.checarObrigatoriedade(Integer.parseInt(idade)));
    }
}