#Challenge-Java-Advanced - Projeto AgroSense - SPRINT 1 

Integrantes:

Charles Pinto da Silveira Carvalho (550113) 

Antonio Augusto Gomes dos Santos (550344)

Raphael Torres Gonçalves (99354)

Camilla Ribeiro Santana (99491)

Luan Ribeiro Dias (94156)

Cronograma:
| Etapas | Sprint 1 | Sprint 2 | Sprint 3 | Sprint 4 |
| --- | --- | --- | --- | --- |
| Planejamento e Definição do Projeto | Camilla | Camilla | Camilla | Camilla |
| API utilizando Spring Boot Java | Charles | Charles | Charles | Charles |
| Manutenção Banco de Dados | Luan | Luan | Luan | Luan |
| Conexão interface Java com a IA Generativa | Charles/Raphael | Charles/Raphael | Charles/Raphael | Charles/Raphael |
| Criação da aplicação web/mobile | Antonio | Antonio | Antonio | Antonio |
| Elaboração da IA Generativa | Raphael | Raphael | Raphael | Raphael |

Instruções para Rodar a Aplicação:
Clone o repositório do projeto do GitHub para sua máquina local.
Certifique-se de ter o ambiente Java e Maven configurados.
Abra o projeto em sua IDE preferida.
Execute o comando mvn clean install para baixar as dependências do projeto.
Configure o arquivo application.properties com as informações de conexão com o banco de dados.
Execute a aplicação.

Imagem dos Diagramas:
No arquivo ZIP

Link para Vídeo de Apresentação:
https://www.youtube.com/watch?v=he133ADJDcA

Endpoints da API:
Usuários:
Listar todos os usuários: GET /usuarios
Buscar usuário por ID: GET /usuarios/{id}
Criar um novo usuário: POST /usuarios
Atualizar usuário por ID: PUT /usuarios/{id}
Excluir usuário por ID: DELETE /usuarios/{id}
Fornecedores:
Listar todos os fornecedores: GET /fornecedores
Buscar fornecedor por ID: GET /fornecedores/{id}
Criar um novo fornecedor: POST /fornecedores
Atualizar fornecedor por ID: PUT /fornecedores/{id}
Excluir fornecedor por ID: DELETE /fornecedores/{id}
Vegetais:
Listar todos os vegetais: GET /vegetais
Buscar vegetal por ID: GET /vegetais/{id}
Criar um novo vegetal: POST /vegetais
Atualizar vegetal por ID: PUT /vegetais/{id}
Excluir vegetal por ID: DELETE /vegetais/{id}

#Challenge-Java-Advanced - Projeto AgroSense - SPRINT 2

O Cronograma se manteve o mesmo. Houveram algumas alterações na estrutura do projeto por conta de algumas alterações no Banco de Dados. Essas mudanças serão enviadas no arquivo Zip.
A principal mudança refere-se à retirada da Classe "Fornecedor" e a alteração da Classe "Usuário" para "Cliente". Além disso, foram testados todos os EndPoints da API e as fotos serão anexadas com a descrição dos EndPoints.

Instruções para Rodar a Aplicação:
Clone o repositório do projeto do GitHub para sua máquina local.
Certifique-se de ter o ambiente Java e Maven configurados.
Abra o projeto em sua IDE preferida.
Execute o comando mvn clean install para baixar as dependências do projeto.
Configure o arquivo application.properties com as informações de conexão com o banco de dados.
Execute a aplicação.

Endpoints da API:
Clientes:
Listar todos os Clientes: GET /clientes
![GET Clientes](https://github.com/CharCarvalho/Challenge-Java-Advanced/assets/126685062/a551708f-17a9-4cf0-839e-ddbe1555ade4)

Buscar clientes por ID: GET /clientes/{id}
Criar um novo clientes: POST /clientes
Atualizar clientes por ID: PUT /clientes/{id}
Excluir clientes por ID: DELETE /clientes/{id}
Vegetais:
Listar todos os vegetais: GET /vegetais
Buscar vegetal por ID: GET /vegetais/{id}
Criar um novo vegetal: POST /vegetais
Atualizar vegetal por ID: PUT /vegetais/{id}
Excluir vegetal por ID: DELETE /vegetais/{id}
