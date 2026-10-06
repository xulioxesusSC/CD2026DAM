# Apuntes do tema 1

## Ciclo de vida de programa simple

## Requisitos (análisis)

- Programa de terminal que pida 2 números e devolva a suma.

- Debe funcionar con números con comas

- Debe detectar que se escriben letras

- Escrito en C

## Diseño

Un solo archivo chamado suma.c escrito en c

## Implementación

```c
#include <stdio.h>

int main() {
    int num1, num2, suma;

    printf("Introduce o primeiro número: ");
    scanf("%d", &num1);

    printf("Introduce o segundo número: ");
    scanf("%d", &num2);

    suma = num1 + num2;

    printf("A suma é: %d\n", suma);

    return 0;
}
```

