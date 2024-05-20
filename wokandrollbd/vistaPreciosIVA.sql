-- vista para calcular el precio con iva de los productos
USE wokandroll;
CREATE VIEW ProductosConIVA AS
SELECT 
    IdProducto,
    nombre,
    precioSinIVA,
    tipoIVA,
    CASE tipoIVA
        WHEN 'IVA_DIEZ' THEN ROUND(precioSinIVA * 1.10, 2)
        WHEN 'IVA_VEINTIUNO' THEN ROUND(precioSinIVA * 1.21, 2)
        ELSE precioSinIVA
    END AS precioConIVA
FROM productos;