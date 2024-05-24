INSERT INTO tb_level(name) VALUES ('Bronze');
INSERT INTO tb_level(name) VALUES ('Prata');
INSERT INTO tb_level(name) VALUES ('Ouro');

INSERT INTO tb_region(name) VALUES ('Norte');
INSERT INTO tb_region(name) VALUES ('Nordeste');
INSERT INTO tb_region(name) VALUES ('Centro-Oeste');
INSERT INTO tb_region(name) VALUES ('Sudeste');
INSERT INTO tb_region(name) VALUES ('Sul');

INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('14.591.464/0001-20',3, 'Supermercado Bom Preço', 'contato@bompreco.com','(55) 5559-8719',2);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('23.875.321/0001-98',2, 'Distribuidora Mega Bebidas', 'contato@megabebidas.com','(22) 3456-7890',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('38.206.946/0001-14',1, 'Restaurante Sabor Caseiro', 'contato@saborcaseiro.com','(44) 5678-9012',3);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('41.739.582/0001-07',2, 'Lanchonete Top Lanches', 'contato@toplanches.com','(33) 4567-8901',4);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('55.820.376/0001-33',3, 'Hotel Estrela do Norte', 'contato@estreladonorte.com','(55) 6789-0123',5);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('69.153.284/0001-61',2, 'Padaria Delícia', 'contato@padariadelicia.com','(66) 7890-1234',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('73.499.205/0001-48',1, 'Farmácia Popular', 'contato@farmaciapopular.com','(77) 8901-2345',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('84.762.931/0001-26',1, 'Loja de Conveniência Rápida', 'contato@convenienciarapida.com','(88) 9012-3456',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('98.240.173/0001-92',2, 'Mercado Econômico', 'contato@mercadoeconomico.com','(99) 0123-4567',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('10.759.833/0001-65',1, 'Mercearia Familiar', 'contato@merceariafamiliar.com','(10) 1234-5678',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('12.658.194/0001-09',3, 'Supermercado Top', 'contato@supermercadotop.com','(20) 2345-6789',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('27.914.603/0001-70',3, 'Quitanda Saudável', 'contato@quitandazsaudavel.com','(30) 3456-7890',1);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('32.685.917/0001-83',2, 'Loja de Orgânicos Natureza', 'contato@orgaonatureza.com','(40) 4567-8901',2);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('47.538.026/0001-41',1, 'Minimercado Veloz', 'contato@minimercadoveloz.com','(50) 5678-9012',3);
INSERT INTO tb_client(Cnpj,level_id, name, email,phone_number,region_id) VALUES ('58.201.735/0001-52',3, 'Empório da Economia', 'contato@emporiodaeconomia.com','(60) 6789-0123',3);


INSERT INTO tb_product(name,quantity_ml, stock_quantity,stock_Max,category,price)VALUES ('Garrafa Coca-Cola', 2000, 90,200,'Refrigerantes',10.00);
INSERT INTO tb_product(name,quantity_ml, stock_quantity,stock_Max,category,price)VALUES ('Garrafa Fanta Uva', 350, 120,200,'Refrigerantes',9.00);
INSERT INTO tb_product(name,quantity_ml, stock_quantity,stock_Max,category,price)VALUES ('Garrafa Fanta Laranja', 1000, 100,150,'Refrigerantes',9.00);
INSERT INTO tb_product(name,quantity_ml, stock_quantity,stock_Max,category,price)VALUES ('Lata Schweppes', 1000, 100,100,'Refrigerantes',5.00);
INSERT INTO tb_product(name,quantity_ml, stock_quantity,stock_Max,category,price)VALUES ('Água Mineral Bonafont', 2000, 100,250,'Águas',3.50);
INSERT INTO tb_product(name,quantity_ml, stock_quantity,stock_Max,category,price)VALUES ('Água Mineral Bonafont', 2000, 100,250,'Águas',3.50);
