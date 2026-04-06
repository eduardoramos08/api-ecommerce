ALTER TABLE categorias ADD ativo TINYINT;

UPDATE categorias SET ativo = 1;

ALTER TABLE categorias MODIFY COLUMN ativo TINYINT NOT NULL;