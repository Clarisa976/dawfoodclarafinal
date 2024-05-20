create database if not exists wokandroll;
use wokandroll;

CREATE TABLE IF NOT EXISTS tipoproducto(
	IdTipoProducto INT NOT NULL AUTO_INCREMENT,
    nomTipoProducto varchar(100) DEFAULT NULL,
    nomCategoria ENUM ('COMIDAS','BEBIDAS', 'POSTRES') NOT NULL,
  PRIMARY KEY (IdTipoProducto)
);

CREATE TABLE IF NOT EXISTS productos (
    IdProducto INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    precioSinIVA DECIMAL(5, 2) DEFAULT NULL,
    tipoIVA ENUM ('IVA_DIEZ', 'IVA_VEINTIUNO') DEFAULT NULL,
   -- precioConIVA ,
    stock INT DEFAULT NULL,
    IdTipoProducto INT DEFAULT NULL,
	PRIMARY KEY (IdProducto),
    KEY fk_productos_tipoproducto (IdTipoProducto),
    CONSTRAINT fk_productos_tipoproducto FOREIGN KEY (IdTipoProducto) 
		REFERENCES tipoproducto (IdTipoProducto) ON UPDATE CASCADE    
);


CREATE TABLE IF NOT EXISTS tpv (
    IdTpv INT NOT NULL AUTO_INCREMENT,
    passAdministrador VARCHAR(6) NOT NULL,
    direccion VARCHAR(200) DEFAULT NULL,
    fechaSistema DATE DEFAULT NULL,
    horaSistema TIME DEFAULT NULL,
    PRIMARY KEY (IdTpv)
);


CREATE TABLE IF NOT EXISTS tickets (
    IdTicket INT NOT NULL AUTO_INCREMENT,
    IdTpv INT DEFAULT NULL,
    numeroPedido INT,
    codTransaccion VARCHAR(150) NOT NULL,    
    fechaOperacion DATE DEFAULT NULL,
    horaOperacion Time DEFAULT NULL,
    importeTotal DECIMAL(10, 2) DEFAULT NULL,
    PRIMARY KEY (IdTicket),
    KEY fk_ticket_tpv (IdTpv),
    CONSTRAINT fk_ticket_tpv FOREIGN KEY (IdTpv) 
		REFERENCES tpv (IdTpv) ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS detalletickets (
    IdTicket INT,
    IdProducto INT,
    cantidadProducto INT,
    PRIMARY KEY (IdProducto, IdTicket),
    KEY fk_detalleventa_ticket (IdTicket),
    CONSTRAINT fk_detalleVenta_productos FOREIGN KEY (IdProducto) 
			REFERENCES productos (IdProducto) ON UPDATE CASCADE,
    CONSTRAINT fk_detalleventa_ticket FOREIGN KEY (IdTicket) 
			REFERENCES tickets (IdTicket) ON UPDATE CASCADE
);
