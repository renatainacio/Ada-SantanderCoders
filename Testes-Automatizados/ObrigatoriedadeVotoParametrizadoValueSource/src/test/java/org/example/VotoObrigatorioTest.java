package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class VotoObrigatorioTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 5, 10, 15})
    void menorDe16DeveSerSemDireito(int idade) {
        assertEquals("Sem direito a votar", VotoObrigatorio.checarObrigatoriedade(idade));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 25, 40, 69, 70})
    void entre18E70DeveSerObrigatorio(int idade) {
        assertEquals("Voto obrigatório", VotoObrigatorio.checarObrigatoriedade(idade));
    }

    @ParameterizedTest
    @ValueSource(ints = {16, 17, 71, 80, 90})
    void entre16E18OuMaiorDe70DeveSerFacultativo(int idade) {
        assertEquals("Voto facultativo", VotoObrigatorio.checarObrigatoriedade(idade));
    }
}