package controllers;

import models.Book;

import java.util.*;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparador = (b1, b2) -> {
            int cmpTitulo = b2.getTitulo().compareTo(b1.getTitulo()); 
            if (cmpTitulo != 0) return cmpTitulo;

            int cmpAnio = Integer.compare(b1.getAnio(), b2.getAnio()); 
            if (cmpAnio != 0) return cmpAnio;
            return 0;
        };

        Set<Book> conjuntoOrdenado = new TreeSet<>(comparador);
        conjuntoOrdenado.addAll(libros);
        return conjuntoOrdenado;
    }
}
