CREATE TABLE USUARIO(
             ID_USUARIO INTEGER PRIMARY KEY AUTO_INCREMENT,
             NOMBRE VARCHAR(120),
             EDAD INTEGER(120),
             SALDO FLOAT);
CREATE TABLE DIRECCION(
             ID_DIRECCION INTEGER PRIMARY KEY AUTO_INCREMENT, ID_USUARIO INTEGER, 
             CALLE VARCHAR(120),
             COLONIA VARCHAR(120),
             ESTADO VARCHAR(120),
              CP    INTEGER, 
           CONSTRAINT  FOREIGN KEY(ID_USUARIO)REFERENCES USUARIO(ID_USUARIO)

);
