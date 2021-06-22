INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('zarina','$2a$10$axv9BSlAVJPBh2OiSAsA5OF.xPHkKu2NSaflV1uGp5wP0kzahGIPO',true, 'Zarina', 'Fuentes','zarinafuentescov@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$0PqcQ2DTeo4VqLOJTAgV6OgRmFNrQfP3dXr5IsO9qp1kI5Nq8qhAG',true, 'John', 'Doe','jhon.doe@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
