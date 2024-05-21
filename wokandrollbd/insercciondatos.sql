-- Insert TiposProductos
INSERT INTO tipoproducto (IdTipoProducto, nomTipoProducto, nomCategoria) VALUES
(1, 'Sushi', 'COMIDAS'),
(2, 'Ramen', 'COMIDAS'),
(3, 'Otros', 'COMIDAS'),
(4, 'Alcohol', 'BEBIDAS'),
(5, 'Refrescos', 'BEBIDAS'),
(6, 'Otros', 'BEBIDAS'),
(7, 'Tradicionales', 'POSTRES'),
(8, 'Varios', 'POSTRES'),
(9, 'Helados', 'POSTRES');

-- Insert Productos
INSERT INTO productos (nombre, precioSinIVA, tipoIVA, stock,  IdTipoProducto) VALUES
('Sushi Nigiri Salmón', 8.50, 'IVA_DIEZ', 50, 1),
('Sushi Uramaki de pollo crujiente', 10.00, 'IVA_DIEZ', 40, 1),
('Ramen Tonkotsu', 12.00, 'IVA_DIEZ', 30, 2),
('Ramen Shoyu', 11.50, 'IVA_DIEZ', 35, 2),
('Pad Thai de Pollo', 11.00, 'IVA_DIEZ', 50, 3),
('Pad Thai de Gambas', 12.50, 'IVA_DIEZ', 45, 3),
('Cerveza Asahi', 3.50, 'IVA_VEINTIUNO', 100, 4),
('Cerveza Kirin', 3.75, 'IVA_VEINTIUNO', 90, 4),
('Sake Junmai', 15.00, 'IVA_VEINTIUNO', 30, 4),
('Sake Daiginjo', 20.00, 'IVA_VEINTIUNO', 25, 4),
('Té Verde', 2.50, 'IVA_DIEZ', 70, 6),
('Té Oolong', 3.00, 'IVA_DIEZ', 60, 6),
('Coca cola zero', 10.00, 'IVA_DIEZ', 50, 5),
('Fanta de limon', 11.00, 'IVA_DIEZ', 45, 5),
('Bubble Tea de Taro', 5.00, 'IVA_DIEZ', 40, 6),
('Bubble Tea de Mango', 5.50, 'IVA_DIEZ', 35, 6),
('Mochi de Té Verde', 4.00, 'IVA_DIEZ', 60, 7),
('Mochi de Fresa', 4.50, 'IVA_DIEZ', 55, 7),
('Tarta de Matcha', 6.00, 'IVA_DIEZ', 40, 8),
('Profiteroles', 6.50, 'IVA_DIEZ', 35, 8),
('Macedonia de frutas de temporada', 5.00, 'IVA_DIEZ', 50, 8),
('Tangyuan de Sésamo Negro', 5.50, 'IVA_DIEZ', 45, 7),
('Helado de Té Verde', 3.50, 'IVA_DIEZ', 70, 9),
('Helado de Sésamo Negro', 4.00, 'IVA_DIEZ', 65, 9);

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