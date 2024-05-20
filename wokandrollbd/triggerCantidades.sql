-- trigger para controlar el stock
use wokandroll;
DELIMITER $$
CREATE TRIGGER control_stock
BEFORE INSERT
ON detalletickets FOR EACH ROW
	BEGIN
	   DECLARE stock_actual INT; -- creamos una variable en la que se almacenará el stock actual
	   SELECT stock INTO stock_actual FROM productos WHERE IdProducto = NEW.IdProducto;
		   IF NEW.cantidadProducto > stock_actual THEN
           -- Si la cantidad de que vamos a vender es mayor al stock que tenemos salta el mensaje
           -- sino se pone el nuevo stock restandole la cantidad que vamos a vender
			  SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No hay suficiente stock';
		  
		   END IF;
	END $$
DELIMITER ;

-- trigger para restar el stock
USE wokandroll;
DELIMITER $$

CREATE TRIGGER actualizar_stock
AFTER INSERT ON detalletickets
FOR EACH ROW
BEGIN
   UPDATE productos
   SET stock = stock - NEW.cantidadProducto
   WHERE IdProducto = NEW.IdProducto;
END $$

DELIMITER ;

