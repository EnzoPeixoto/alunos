# Projeto de Cadastro de Alunos em Modalidades Esportivas

Este projeto é uma aplicação web robusta para o **cadastro e gestão de alunos em modalidades esportivas**, desenvolvida com **Spring Boot** e **MySQL**. A aplicação oferece uma interface intuitiva para:

*   **Cadastrar novos alunos** com detalhes como nome, idade, e-mail e modalidade esportiva.
*   **Visualizar e gerenciar** todos os alunos e suas respectivas modalidades.
*   **Manter um registro organizado** das modalidades esportivas disponíveis.

## Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e ferramentas:

| Categoria | Tecnologia | Versão | Descrição |
| :-------- | :--------- | :----- | :-------- |
| **Framework** | Spring Boot | 3.3.0 | Facilita o desenvolvimento de aplicações Spring, com configuração mínima. |
| **Linguagem** | Java | 17 | Linguagem de programação principal. |
| **Web** | Spring Web | - | Módulo do Spring para construção de aplicações web, incluindo RESTful APIs e MVC. |
| **Persistência** | Spring Data JPA | - | Abstração para acesso a dados, simplificando a interação com bancos de dados relacionais. |
| **Banco de Dados** | MySQL | - | Sistema de gerenciamento de banco de dados relacional. |
| **Driver JDBC** | MySQL Connector/J | - | Driver de conectividade para MySQL. |
| **Template Engine** | Thymeleaf | - | Motor de template server-side para renderização de páginas web. |
| **Build Tool** | Maven | - | Ferramenta para automação de construção e gerenciamento de dependências. |
| **Desenvolvimento** | Spring Boot DevTools | - | Ferramentas para agilizar o desenvolvimento, como reinício automático da aplicação. |
| **Testes** | Spring Boot Starter Test | - | Ferramentas para facilitar a escrita de testes unitários e de integração. |

## Arquitetura da Aplicação

A aplicação adota o padrão **Model-View-Controller (MVC)**, organizando o código em camadas para uma clara separação de responsabilidades:

*   **Model:** Entidades (`Student`, `SportModal`) e Repositórios (interfaces `JpaRepository`) para gestão de dados.
*   **View:** Templates HTML com **Thymeleaf** para a interface do usuário.
*   **Controller:** Gerencia as requisições web e o fluxo da aplicação (`RegisterController`, `SportModalController`, `StudentController`).
*   **Services:** Contém a lógica de negócio principal.

## Estrutura de Pastas

A estrutura de pastas do projeto segue as convenções do Spring Boot:

```
src/
├── main/
│   ├── java/
│   │   └── com/cadastroalunos/alunos/
│   │       ├── config/             # Configurações
│   │       ├── controllers/        # Controladores web
│   │       ├── entities/           # Entidades JPA
│   │       ├── repositories/       # Acesso a dados
│   │       ├── services/           # Lógica de negócio
│   │       └── AlunosApplication.java # Ponto de entrada da aplicação
│   └── resources/
│       ├── static/                 # Arquivos estáticos (CSS)
│       ├── templates/              # Templates HTML (Thymeleaf)
│       └── application.properties  # Configurações do ambiente
└── test/
    └── java/
        └── com/cadastroalunos/alunos/ # Testes
```

## Pré-requisitos

Para executar este projeto, você precisará ter instalado:

*   **Java Development Kit (JDK) 17** ou superior.
*   **Maven** (gerenciador de dependências e build).
*   **MySQL Server** (versão 8 ou superior).

## Como Executar o Projeto

Siga os passos abaixo para configurar e executar a aplicação localmente:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/EnzoPeixoto/alunos.git
    cd alunos
    ```

2.  **Configurar o Banco de Dados MySQL:**
    *   Crie um banco de dados chamado `alunosdb` no seu servidor MySQL.
    *   As credenciais de acesso ao banco de dados estão configuradas no arquivo `src/main/resources/application.properties`:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/alunosdb
        spring.datasource.username=root
        spring.datasource.password=24843
        spring.jpa.hibernate.ddl-auto=update
        ```
        **Nota:** A propriedade `spring.jpa.hibernate.ddl-auto=update` fará com que o Hibernate crie ou atualize automaticamente o esquema do banco de dados com base nas entidades JPA ao iniciar a aplicação. Certifique-se de que o usuário `root` tenha permissões adequadas ou ajuste as credenciais conforme necessário.

3.  **Compilar e Executar a Aplicação:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

    A aplicação estará disponível em `http://localhost:8080`.

## Configuração do Banco de Dados

O projeto utiliza **MySQL** e suas configurações estão em `src/main/resources/application.properties`:

*   `spring.datasource.url`: `jdbc:mysql://localhost:3306/alunosdb`
*   `spring.datasource.username`: `root`
*   `spring.datasource.password`: `24843`
*   `spring.jpa.hibernate.ddl-auto`: `update` (cria/atualiza o esquema do banco de dados automaticamente).

## Exemplos de Uso

Após iniciar a aplicação, você pode acessar as seguintes URLs no seu navegador:

*   **Página de Cadastro de Alunos:** `http://localhost:8080/cadastro`
*   **Página de Listagem de Alunos:** `http://localhost:8080/list`

## Possíveis Melhorias Futuras

Algumas melhorias que podem ser implementadas no futuro incluem:

*   **Autenticação e Autorização:** Implementar um sistema de login para usuários e controle de acesso baseado em papéis.
*   **Validação de Formulários:** Adicionar validações mais robustas nos formulários de entrada de dados.
*   **Tratamento de Erros:** Melhorar o tratamento de exceções e exibir mensagens de erro mais amigáveis.
*   **Interface do Usuário:** Aprimorar a experiência do usuário com um design mais moderno e responsivo.
*   **Testes Abrangentes:** Expandir a cobertura de testes unitários e de integração.
*   **Dockerização:** Empacotar a aplicação em um contêiner Docker para facilitar a implantação.

## Autor

**Enzo Peixoto**

*Este README foi gerado com o auxílio de Manus AI.*

## Referências

*   [Repositório GitHub do Projeto](https://github.com/EnzoPeixoto/alunos)
