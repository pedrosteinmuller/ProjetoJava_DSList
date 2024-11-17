# ProjetoJava_DSList :book:

## Descrição do Projeto :page_facing_up:

Este repositório contém o projeto **DSList**, que foi desenvolvido como parte de um curso de aprendizado de **Spring Framework** e **Java**. O objetivo principal do projeto é construir uma aplicação de lista de tarefas, utilizando **Spring Boot** e **Spring Data JPA** para persistência de dados, aplicando conceitos de arquitetura de software moderna, como o padrão **REST** e **DTOs**. Durante o curso, foram explorados diversos conceitos e práticas que são fundamentais para o desenvolvimento de sistemas web eficientes e escaláveis.

### Tecnologias utilizadas :computer:
- **Java 17**
- **Spring Boot** (com foco em APIs REST)
- **Spring Data JPA**
- **H2 Database** (para ambiente de desenvolvimento)
- **Docker** (para ambiente local com Docker Compose)
- **CI/CD** (Integração e Entrega Contínua)

## Modelo de domínio DSList

![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## O que aprendi no curso :books:

Durante o curso, aprendi diversos conceitos e práticas fundamentais para o desenvolvimento de sistemas modernos, sendo que os tópicos abordados foram distribuídos ao longo de 3 dias intensivos de aprendizado.

### **Dia 1 - Fundamentos de APIs e Estrutura de Projetos Spring** :bulb:

- **Sistemas Web e recursos**: Entendimento dos princípios de comunicação cliente/servidor, utilizando protocolos como HTTP/JSON e o padrão REST para construção de APIs Web.
- **Estruturação de projeto Spring REST**: Como organizar um projeto Spring Boot para criar uma API RESTful robusta.
- **Entidades e ORM**: Mapeamento de objetos Java para tabelas de banco de dados com **JPA** e utilização do **Spring Data JPA** para simplificar o acesso aos dados.
- **Database Seeding**: Processo de inserção de dados iniciais no banco de dados para testar a aplicação.
- **Padrão Camadas**: Separação do código em camadas bem definidas (Controller, Service, Repository) para facilitar a manutenção e escalabilidade.
- **DTO (Data Transfer Object)**: Uso de DTOs para abstrair dados e evitar problemas de desempenho com a transferência de grandes quantidades de dados.

### **Dia 2 - Relacionamentos e Consultas Avançadas** :zap:

- **Relacionamento N-N**: Implementação de relacionamentos **muitos para muitos** entre entidades usando o Spring Data JPA.
- **Classe de Associação e Embedded Id**: Como criar classes de associação e usar **EmbeddedId** para tratar chaves compostas.
- **Consultas SQL no Spring Data JPA**: Como realizar consultas complexas usando o **Spring Data JPA** e realizar **projeções** para otimizar a transferência de dados.

### **Dia 3 - Melhores Práticas para Desenvolvimento e Deploy** :rocket:

- **Dicas de Portfólio e Currículo**: Orientações sobre como organizar e apresentar um portfólio de projetos de maneira profissional.
- **Perfis de Projeto**: Como configurar perfis de ambientes (ex: `dev`, `prod`) no **Spring Boot** para ajustar a configuração do sistema de acordo com o ambiente.
- **Ambiente Local com Docker Compose**: Como configurar o Docker Compose para rodar uma instância de banco de dados localmente, facilitando o desenvolvimento e testes.
- **Processo de Homologação Local**: Como configurar e testar a aplicação em um ambiente de homologação local.
- **Processo de Deploy com CI/CD**: Como automatizar o processo de **deploy** usando pipelines de **Integração Contínua** e **Entrega Contínua**.
- **Configuração de CORS**: Como configurar o **CORS** (Cross-Origin Resource Sharing) para permitir ou restringir o acesso a APIs de diferentes origens.

## Como Rodar o Projeto :runner:

### 1. Pré-requisitos :package:

Antes de rodar o projeto, é necessário ter o seguinte instalado em sua máquina:
- **Java 17** ou superior
- **Spring Tools Suite** (ou qualquer outra IDE compatível com Spring Boot)
- **Docker** (para rodar o ambiente de banco de dados local, se necessário)

### 2. Clonar o Repositório :arrow_down:

Clone este repositório para sua máquina local utilizando o seguinte comando Git:

```git clone git@github.com:pedrosteinmuller/ProjetoJava_DSList.git```

### 4. Rodando o Projeto no Spring Tools Suite :wrench:

1. Abra o **Spring Tools Suite (STS)** ou sua IDE favorita.
2. Selecione a opção **Import Project** e escolha a pasta onde você clonou o repositório.
3. Escolha o tipo de projeto **Existing Maven Projects** e importe o projeto.
4. Após a importação, execute o projeto clicando com o botão direito na classe principal do Spring Boot (`DslistApplication.java`) e selecionando **Run As > Spring Boot App**.
5. A aplicação estará rodando localmente no endereço: `http://localhost:8080`.

### 5. Testando a API :test_tube:

Você pode testar as endpoints da API utilizando ferramentas como **Postman** ou **cURL**. As principais rotas da API estão definidas conforme o modelo de domínio mostrado acima.

