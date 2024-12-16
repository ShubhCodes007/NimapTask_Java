# NimapTask_Java

# Description
This is a *SpringBoot application* There is a **One-to-Many relationship* (i.e., one Category can have multiple Products) and this
project uses *Oracle RDB*.
It implements basic *CRUD operations* for both products and categories while showcasing server-side pagination and a one-to-many relationship between categories and products.   

**#Technologies Used**
Java : JDK Version 17
SpingBoot: 3.3.6 Version
Oracle : Version 21C

**Dependencies Used**
Spring Web Services
Oracle
Spring JPA

**Application Properties** For Database Configuration
# Database Configuration
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:orcl
spring.datasource.username=c##hr
spring.datasource.password=hr
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

# Dialect(Hibernate Properties)
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect


