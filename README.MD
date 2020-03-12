# Atividade - FIAP - Pós-Graduação em Engenharia de Software

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
sudo docker build -t dvriesman/fiap-nubank-api
```

## Para rodar com docker
```
docker run --name myapp -p 8080:8080 dvriesman/fiap-nubank-api
```

## Testes da API
```
curl -H "Content-type:application/json" -XPOST http://localhost:8080/listSpending -d '{"username":"denny", "initialDate":"2010-01-01 00:00:00", "finalDate":"2011-02-01 00:00:00"}'
```

## Novos dados para testes.
- Na classe Application.java, pode ser configurado novas entradas no banco de dados em memória.



