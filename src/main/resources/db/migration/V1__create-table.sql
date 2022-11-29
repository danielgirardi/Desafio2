CREATE TABLE IF NOT EXISTS public."Product"
(
    code character varying(255) COLLATE pg_catalog."default" NOT NULL,
    category character varying(255) COLLATE pg_catalog."default",
    codigo_barra bigint,
    color character varying(255) COLLATE pg_catalog."default",
    description character varying(255) COLLATE pg_catalog."default",
    manufactoring_date character varying(255) COLLATE pg_catalog."default",
    material character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    price double precision,
    quantity integer,
    serie character varying(255) COLLATE pg_catalog."default",
    tax double precision,
    validation_date character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT products_pkey PRIMARY KEY (code)
)


TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Product"
    OWNER to postgres;