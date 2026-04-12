<h1 align="center">API Contabilidade Pública</h1>

<p align="center">
  <img src="https://img.shields.io/badge/STATUS-FINALIZADO-black?style=for-the-badge&logoColor=white" alt="Status" />
  <img src="https://img.shields.io/badge/STACK-JAVA_SPRING-black?style=for-the-badge&logo=spring&logoColor=white" alt="Stack" />
  <img src="https://img.shields.io/badge/DOCS-SWAGGER-black?style=for-the-badge&logo=swagger&logoColor=white" alt="Swagger" />
</p>

---

<h2 style="border-bottom: none; padding-bottom: 0; text-align: center;">Sobre o Projeto</h2>

<p align="center">
API REST desenvolvida para emular o back-end de um sistema contábil governamental. O foco principal do projeto é simular fluxos e regras de negócio complexas da gestão pública, implementando o ciclo completo de despesas: <strong>Empenhos, Liquidações e Pagamentos</strong>.
</p>

---

<h2 style="border-bottom: none; padding-bottom: 0; text-align: center;">Arquitetura</h2>

<p align="center">O projeto segue uma arquitetura em camadas bem definida para separar responsabilidades, facilitar a manutenção e garantir um design limpo:</p>

<p align="center">
  • <strong><code>resource</code>:</strong> Controladores REST que expõem os endpoints da API.<br>
  • <strong><code>service</code>:</strong> Onde residem as regras de negócio complexas (validação de saldos, transações financeiras).<br>
  • <strong><code>repository</code>:</strong> Interfaces do Spring Data JPA para comunicação direta com o banco de dados.<br>
  • <strong><code>entity</code>:</strong> Modelagem do domínio refletindo a estrutura das tabelas.<br>
  • <strong><code>dto</code> & <code>mapper</code>:</strong> Isolamento entre os dados internos da aplicação e os dados expostos/recebidos na API, garantindo segurança na transferência de dados.<br>
  • <strong><code>enums</code>:</strong> Tipagem forte para domínios fechados e padronização.
</p>

---

<h2 style="border-bottom: none; padding-bottom: 0; text-align: center;">Documentação</h2>

<p align="center">
A API está totalmente documentada utilizando <strong>Swagger/OpenAPI</strong>. Isso permite que qualquer pessoa execute a aplicação e teste os endpoints, payloads de requisição e respostas esperadas diretamente pela interface do Swagger UI.
</p>

---

<h2 style="border-bottom: none; padding-bottom: 0; text-align: center;">Stack Tecnológica</h2>

<p align="center">
  <img src="https://img.shields.io/badge/Java-000000?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-000000?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/PostgreSQL-000000?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <img src="https://img.shields.io/badge/Swagger-000000?style=for-the-badge&logo=swagger&logoColor=white" alt="Swagger" />
</p>

---

<p align="center">
Desenvolvido por <a href="https://github.com/Xandetds">Alexandre Tibes</a>.
</p>
