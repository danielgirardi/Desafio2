# Desafio2

O PROGRAMA POSSUI CINCO FUNCÇÕES, SEGUE ABAIXO:

1 - API (findall): responsável por buscar todos os produtos disponíveis no estoque;
2 - API (addProduct): responsável por adicional novos produtos no estoque;
3 - API (importProducts): responsável por buscar todos os produtos do arquivo CSV
4 - API (removeProduct): responsável por remover o produto desejado. OBS: deverá o usuário adicionar a senha aleatória gerada para inserir na URL 
5 - API (editProduct): responsável por atualizar algum determinado produto do estoque;

INFORMAÇÕES SOBRE INTEGRAÇÃO:
 
- API (findall): curl --location --request GET 'http://localhost:8080/stockManagement/findAllProducts/'
 
- API (addProduct): curl --location --request POST 'http://localhost:8080/stockManagement/addProduct' \
--header 'Content-Type: application/json' \
--data-raw ' {
        "name": "alicate",
        "price": 49.0,
        "quantity": 5,
        "category": "ferramenta",
        "codigoBarra": 123456,
        "serie": "n/a",
        "description": "descricao 3",
        "tax": 0.3,
        "manufacturingDate": "2021/11/20",
        "validationDate": "2023/10/10",
        "color": "amarelo",
        "material": "ferro"
    }'
    
- API (importProducts): curl --location --request POST 'http://localhost:8080/stockManagement/importProducts' \
--form 'file=@"/C:/Daniel_Girardi/Projetos/Desafio_1/src/main/resources/estoque.csv"'

- API (removeProduct): curl --location --request DELETE 'http://localhost:8080/stockManagement/removeProduct/vR27yGgm' \
--data-raw ''

- API (editProduct): curl --location --request PATCH 'http://localhost:8080/stockManagement/editProduct/uHhHGp4i' \
--header 'Content-Type: application/json' \
--data-raw '{
    
    "name": "alicate_alterado2",
    "price": 49.0,
    "quantity": 5,
    "category": "ferramenta",
    "codigoBarra": 123456,
    "serie": "n/a",
    "description": "descricao 3",
    "tax": 0.3,
    "manufacturingDate": "2021/11/20",
    "validationDate": "2023/10/10",
    "color": "amarelo",
    "material": "ferro"
}' 
