package snippet;

public class Snippet {
	#configura��o do banco
	spring.datasource.url=jdbc:postgresql://localhost:5432/cadspring
	spring.datasource.username=postgres
	spring.datasource.password=eder
	
	# Configura��o para mostrar o SQL no console
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.format_sql=true
	spring.jpa.hibernate.ddl-auto=update
}

