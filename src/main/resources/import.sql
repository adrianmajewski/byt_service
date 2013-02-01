UPDATE "SEQUENCE" SET SEQ_COUNT = 50 WHERE SEQ_NAME = 'SEQ_GEN_TABLE';
INSERT INTO "STATUS" VALUES (1, 'Towar przyjęty od klienta do naprawy', 'Przyjęty');
INSERT INTO "STATUS" VALUES (2, 'Towar wysłany do serwisu zewnętrznego', 'Wysł. do serw. zew.');
INSERT INTO "STATUS" VALUES (3, 'Towar przyjęty z serwisu zewnętrznego', 'Przyjęty z serw. zew.');
INSERT INTO "STATUS" VALUES (4, 'Towar wydany klientowi', 'Wydany');
INSERT INTO "COMMISSION" VALUES (1, 'Jan Kowalski, Gdańsk, Willowa 15', 'Popsuty laptop marki DELL', '123GD', 1);
INSERT INTO "COMMISSION" VALUES (2, 'Jan Domański, Gdańsk, Willowa 18', 'Popsuty laptop marki LAPTOP', '124GD', 2);
INSERT INTO "COMMISSION" VALUES (3, 'Bogdan Marchew, Gdańsk, Dworcowa 15', 'Monitor Acer - trzeba było gówna nie kupować', '125GD', 3);
INSERT INTO "COMMISSION" VALUES (4, 'Mościbrodzki, Gdańsk, PJWSTK', 'Laptop z szczątkami studenta marki HP - imho. studentowi zostało pewnie mało HP', '126GD', 2);
INSERT INTO "USER_T" VALUES (1, 'user', 'user');