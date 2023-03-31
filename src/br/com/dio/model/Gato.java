package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String name;
    private String color;
    private int idade;

    public Gato() {}

    public Gato(String name, String color, int idade) {
        this.name = name;
        this.color = color;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return idade == gato.idade && Objects.equals(name, gato.name) && Objects.equals(color, gato.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", idade=" + idade +
                '}';
    }
}
