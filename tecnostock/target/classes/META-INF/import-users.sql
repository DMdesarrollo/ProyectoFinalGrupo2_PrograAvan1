INSERT INTO USER_(LOGIN, PASSWORD, NAME) VALUES ('admin', 'admin', 'Administrador');
INSERT INTO USER_(LOGIN, PASSWORD, NAME) VALUES ('user', 'user', 'Usuario normal');

INSERT INTO USER_IN_GROUP(USER_, GROUP_) VALUES ('admin', 'admin');
INSERT INTO USER_IN_GROUP(USER_, GROUP_) VALUES ('user', 'user');