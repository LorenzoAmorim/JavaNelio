# Resumo da aula
## • Cláusula throws: propaga a exceção ao invés de trata-la

## • Cláusula throw: lança a exceção / "corta" o método

## • Exception: compilador obriga a tratar ou propagar

## • RuntimeException: compilador não obriga

## • O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas

## • Vantagens:
### • Lógica delegada
### • Construtores podem ter tratamento de exceções
### • Possibilidade de auxílio do compilador (Exception)
### • Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco catch correspondente.
### • É possível capturar inclusive outras exceções de sistema