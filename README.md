# Api_Java
Esse é um projeto inicial da minha primeira API em JAVA. Tem apenas 2 endpoint {GET: trazer todos os cursos cadastrados no SERVIÇO}  e  {POST: criar/cadastrar novos cursos no SERVIÇO}


Galera, este é o primeiro projeto em JAVA, então criar uma API, que tem como objetivo  ser um sistema de cadastro escolar envo envolvendo cadastro de aluno, curso, materia e grade curricular;

Inicialmente você deverá dar um :
git clone  no projeto.

Em seguida configure seu locahost no aqruivo Application properties assim:

# habilitar o h2 console
spring.h2.console.enabled = true

#Definir o caminho da aplicação H2
spring.h2.console.path=/h2

# mostrar as queries
spring.jpa.show-sql=true

# formatar o SQL
spring.jpa.properties.hibernate.format_sql=true

# mostrar os parametros das queries
logging.level.org.hibernate.type=trace

Após isso, instale o postman ou use como extensão do chrome.

No POSTMAN selecione o método GET e passe como parametro: http://localhost:8060/cursos 

ou 

selecione o método POST e passe como parametro: http://localhost:8060/cursos/criar 

{
	"nome" : "Graguação em .... ",
	"area" : "....."
}
