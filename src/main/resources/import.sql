insert into dia (nome) values ('domingo');
insert into dia (nome) values ('segunda');
insert into dia (nome) values ('terça');
insert into dia (nome) values ('quarta');
insert into dia (nome) values ('quinta');
insert into dia (nome) values ('sexta');
insert into dia (nome) values ('sábado');


insert into periodo ( id_dia, data_hora,id_cidade, temp_max, temp_min, humidade_ar, descricao) values (1,'10/03/2019 00:03',1, '27°C', '20°C','15mm','Sol com muitas nuvens. Pancadas de chuva à tarde e à noite.');
insert into periodo ( id_dia,data_hora, id_cidade, temp_max,temp_min, humidade_ar, descricao) values (2, '11/03/2019 12:30',1, '28°C', '18°C','10mm','Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.');
insert into periodo ( id_dia,data_hora,id_cidade, temp_max, temp_min, humidade_ar, descricao) values (3, '12/03/2019 03:15',1, '29°C', '19°C','15mm','Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.');
insert into periodo ( id_dia,data_hora,id_cidade, temp_max, temp_min, humidade_ar, descricao) values (4, '13/03/2019 14:45',1, '30°C', '20°C','15mm','Sol com algumas nuvens. Chove rápido durante o dia e à noite.');
insert into periodo ( id_dia,data_hora,id_cidade, temp_max, temp_min, humidade_ar, descricao) values (5, '14/03/2019 22:33',1, '29°C', '20°C','10mm','Sol com aumento de nuvens ao longo do dia. À noite ocorrem pancadas de chuva.');
insert into periodo ( id_dia,data_hora,id_cidade, temp_max, temp_min, humidade_ar, descricao) values (6, '15/03/2019 06:23',1, '26°C', '19°C','14mm','Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.');
insert into periodo ( id_dia,data_hora,id_cidade, temp_max, temp_min, humidade_ar, descricao) values (7, '16/03/2019 18:08',1, '27°C', '20°C','5mm','Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.');

insert into cidade ( nome, longitude, latitude) values ('São Paulo','562473','56463');

--adicione um usuário
insert into usuario (id, login, senha) values (1, 'admin', 'admin')
insert into usuario (id, login, senha) values (2, 'peixe', 'peixe')