# apiBackendBetta
Teste Betta Tecnologia
--------------------------------------------------------------------
## Tecnologias e ferramentas utilizadas
<p>Eclipse IDE</p>
<p>Java</p>
<p>Maven</p>
<p>Spring boot</p>
<p>H2 DataBase</p>
<p>Jpa</p>
<p>Tomcat</p>
<p>Spring-boot-starter-jdbc</p>

<p>Angular JS para front end</>
  
--------------------------------------------------------------------

### Executando aplicação backend

<p>Instalar o mvn</p>
<p>abrir pasta do projeto exemplo: C:\Users\rafaa\workspace\apiBackendBetta></p>
<p>Executar seguintes comandos: </p>
<p>mvn test</p>
<p>mvn clean install</p>
<p>mvn clean install and mvn springboot:run</p>
<p><em><strong>Abra seu navegador e acesse a api</strong></em></p>
<p><em><strong>http://localhost:8080</strong></em></p>

--------------------------------------------------------------------

#### Executando aplicação frontEnd

<p>Instalar o npm</p>
<p>npm install -g @angular/cli</p>
<p>abrir pasta do projeto exemplo: C:\Users\rafaa\workspace\frontEnd-betta></p>
<p>Executar seguintes comandos: </p>
<p>ng serve</p>
<p>Com esse comando o servidor Angular está de pé</p>
<p><em><strong>Abra seu navegador e acesse a aplicação frontEnd</strong></em></p>
<p><em><strong>http://localhost:4200</strong></em></p>

--------------------------------------------------------------------

##### Acessando o console do H2 DATABASE

<p>Após subir o projeto apiBackendBetta</p>
<p><em><strong>Abra seu navegador e acesse:</strong></em></p>
<p><em><strong>http://localhost:8080/console</strong></em></p>

--------------------------------------------------------------------


###### <strong>Endpoints webservice apiBackendBetta</strong>
<p><em><strong>http://localhost:8080/products/getAllProducts      - Lista todos Produtos</strong></em></p>
<p><em><strong>http://localhost:8080/products/saveProduct         - Salva Produto</strong></em></p>
<p><em><strong>http://localhost:8080/products/updateProduct       - Update Produto</strong></em></p>
<p><em><strong>http://localhost:8080/products/getProduct/{id}     - Recebe um Produto por ID</strong></em></p>
<p><em><strong>http://localhost:8080/products/deleteProduct/{id}  - Deleta Produto</strong></em></p>

<p><em><strong>http://localhost:8080/images/getAllImages              - Lista todas imagens</strong></em></p>
<p><em><strong>http://localhost:8080/images/saveImage                 - Salve imagem por produto</strong></em></p>
<p><em><strong>http://localhost:8080/images/getImagesByProduct/{id}   - Recebe todas imagens por id do produto</strong></em></p>
<p><em><strong>http://localhost:8080/images/updateImage               - Salva imagem do produto</strong></em></p>
<p><em><strong>http://localhost:8080/images/deleteImage/{id}          - Deleta Imagem</strong></em></p>
<p><em><strong>http://localhost:8080/images/getImage/{id}             - Recebe determinada imagem por id</strong></em></p>

--------------------------------------------------------------------


