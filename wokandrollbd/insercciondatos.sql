-- Insert TiposProductos
INSERT INTO tipoproducto (IdTipoProducto, nomTipoProducto, nomCategoria) VALUES
(1, 'Sushi', 'COMIDAS'),
(2, 'Ramen', 'COMIDAS'),
(3, 'Dim Sum', 'COMIDAS'),
(4, 'Pho', 'COMIDAS'),
(5, 'Pad Thai', 'COMIDAS'),
(6, 'Cerveza', 'BEBIDAS'),
(7, 'Sake', 'BEBIDAS'),
(8, 'Té', 'BEBIDAS'),
(9, 'Soju', 'BEBIDAS'),
(10, 'Bubble Tea', 'BEBIDAS'),
(11, 'Mochi', 'POSTRES'),
(12, 'Tarta', 'POSTRES'),
(13, 'Bolas de sésamo', 'POSTRES'),
(14, 'Tangyuan', 'POSTRES'),
(15, 'Helado', 'POSTRES');

-- Insert Productos
INSERT INTO productos (nombre, precioSinIVA, tipoIVA, stock, IdProducto) VALUES
('Sushi nigiri salmón', 10.00, 'IVA_DIEZ', 50, 1),
('Ramen curry', 8.00, 'IVA_DIEZ', 50, 2),
('Dim Sum', 7.00, 'IVA_DIEZ', 50, 3),
('Pho', 9.00, 'IVA_DIEZ', 50, 4),
('Pad Thai', 9.50, 'IVA_DIEZ', 50, 5),
('Cerveza estrella galicia', 3.00, 'IVA_VEINTIUNO', 100, 6),
('Sake', 15.00, 'IVA_VEINTIUNO', 100, 7),
('Té verde', 2.50, 'IVA_VEINTIUNO', 100, 8),
('Soju', 13.00, 'IVA_VEINTIUNO', 100, 9),
('Bubble Tea anko', 4.50, 'IVA_VEINTIUNO', 100, 10),
('Mochi fresa', 4.00, 'IVA_DIEZ', 30, 11),
('Tarta de queso japonesa', 4.50, 'IVA_DIEZ', 30, 12),
('Bolas de sésamo', 4.00, 'IVA_DIEZ', 30, 13),
('Tangyuan', 4.50, 'IVA_DIEZ', 30, 14),
('Helado de té verde', 3.50, 'IVA_DIEZ', 30, 15),
('Sushi nigiri atún', 9.50, 'IVA_DIEZ', 50, 1),
('Ramen de miso', 12.00, 'IVA_DIEZ', 30, 2),
('Té verde', 2.50, 'IVA_DIEZ', 100, 8),
('Cerveza Kirin', 3.00, 'IVA_DIEZ', 70, 6),
('Tartar de salmón', 11.00, 'IVA_DIEZ', 15, 1),
('Curry rojo tailandés', 13.50, 'IVA_DIEZ', 20, 5),
('Baozi', 5.00, 'IVA_DIEZ', 30, 4),
('Mochi de fresa', 4.50, 'IVA_DIEZ', 60, 11),
('Tapioca Bubble Tea', 4.75, 'IVA_DIEZ', 40, 10),
('Helado de limón', 3.50, 'IVA_DIEZ', 50, 15),
('Rollitos Primavera', 6.00, 'IVA_DIEZ', 45, 3);


-- Insert Tickets
INSERT INTO tickets (numeroPedido, codTransaccion, fechaOperacion, horaOperacion, importeTotal) VALUES
(1, 'TRANS001', '2024-03-23','12:15:05', 23.50),
(2, 'TRANS002', '2024-03-24','12:15:05', 20.00),
(3, 'TRANS003', '2024-03-24','12:25:05', 30.00),
(4, 'TRANS004','2024-03-25','12:05:05', 25.00),
(5, 'TRANS005', '2024-03-25','12:15:05', 28.50);

-- Insert TPV
INSERT INTO tpv (passAdministrador, direccion, fechaSistema, horaSistema) VALUES
('Ab*+34', 'Calle falsa, 123', '2024-03-23','12:15:05');