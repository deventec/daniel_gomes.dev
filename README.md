# Gerenciador de Tarefas API

API RESTful desenvolvida em Spring Boot para o gerenciamento de tarefas pessoais, implementando as operações básicas de CRUD via métodos HTTP.

## Base URL
`http://localhost:8080/api/tarefas`

## Endpoints

| Método HTTP | Endpoint | Descrição | Status de Sucesso | Status de Falha |
| :--- | :--- | :--- | :--- | :--- |
| **GET** | `/` | Retorna a lista de todas as tarefas cadastradas. | `200 OK` | N/A |
| **POST** | `/` | Cria uma nova tarefa. Requer JSON no corpo. | `201 Created` | `400 Bad Request` |
| **PUT** | `/{id}` | Atualiza uma tarefa existente pelo ID. Requer JSON. | `200 OK` | `404 Not Found` |
| **DELETE**| `/{id}` | Deleta uma tarefa existente pelo ID. | `204 No Content` | `404 Not Found` |

### Teste da API
Utilize ferramentas como `Insomnia, Postman` ou qualquer ferramenta da sua preferência para testar cada método HTTP.

#### Exemplo de Corpo da Requisição (JSON para POST/PUT)
```json
{
  "titulo": "String (Estudar Português)",
  "descricao": "String (Praticar Preposições)",
  "concluida": "Boolean (true ou false)"
}
