package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class VotoObrigatorioTest {

    @ParameterizedTest
    @ValueSource(ints = {-324, -125, -42, -5, -1})
    void idadeNegativaDeveGerarExcecao(int idade) {
        IdadeException thrown = assertThrows(IdadeException.class,
                () -> VotoObrigatorio.checarObrigatoriedade(idade));
        assertEquals("Idade inválida", thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {126, 130, 150, 1450})
    void idadeExageradaDeveGerarExcecao(int idade) {
        IdadeException thrown = assertThrows(IdadeException.class,
                () -> VotoObrigatorio.checarObrigatoriedade(idade));
        assertEquals("Idade inválida", thrown.getMessage());
    }

}