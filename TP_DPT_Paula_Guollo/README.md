## Como compilar e executar

A partir da pasta `TP_DPT_Paula_Guollo`:

```bash
find src -name "*.java" | xargs javac
java -cp src app.Main
```

## Tipos de acesso

| Perfil        | Acesso                         |
|---------------|---------------------------------|
| Cliente       | Público, sem necessidade de login |
| Rececionista  | Login com perfil `GESTAO`       |
| Guia          | Login com perfil `GUIA`         |
| Administrador | Login com perfil `ADMIN`        |

Exemplo de credenciais (ver `resources/logins.csv`):

- Administrador: `admin` / `admin123`
- Rececionista: `rececao` / `rec123`
- Guia: `G01` / `gui@g01`

## Funcionalidades implementadas

Conforme o enunciado, cada tipo de utilizador tem **uma funcionalidade totalmente implementada** (as restantes ficam apenas com a assinatura do método, prontas a implementar):

- **Cliente** → Consultar Quartos Disponíveis
- **Rececionista** → Consultar Quartos Reservados
- **Guia** → Consultar Histórico de Experiências
- **Administrador** → Consultar Quarto com Melhor Preço/Semana

O login é sempre totalmente funcional, validando as credenciais a partir do `resources/logins.csv`.

## Javadoc

A documentação Javadoc de todas as classes está gerada na pasta `docs/`. Para consultar, abrir o ficheiro `docs/index.html` no navegador.

Para gerar novamente (caso o código seja alterado):

```bash
javadoc -d docs -sourcepath src -subpackages app:controllers:models:repositories:tools:views
```
