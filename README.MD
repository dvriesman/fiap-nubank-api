# Atividade - Pós-Graduação em Engenharia de Software

## Microserviço

Esse serviço é bem simples, só para fins de atividade.
Basicamente busca num repositório JPA o sumário de valores de 
gastos de cartão de crédito por categoria.

## Para compilar
```
./gradlew build
```

## Para rodar local
```
./gradlew bootRun
```

## Para gerar o container docker
```
docker build dvriesman/fiap-nubank-api:1.0 . --no-cache
```


