--TODO: probablement sous autre folder to put, or with other name!

---- Table: public.film
--
---- DROP TABLE IF EXISTS public.film;
--
--CREATE TABLE IF NOT EXISTS public.film
--(
--    film_id bigint NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
--    prix bigint NOT NULL,
--    stock bigint NOT NULL,
--    title character varying(255) COLLATE pg_catalog."default" NOT NULL,
--    langue_fk bigint,
--    CONSTRAINT film_pkey PRIMARY KEY (film_id),
--    CONSTRAINT fks9kv6nbb9i7si70loe9rymnhb FOREIGN KEY (langue_fk)
--        REFERENCES public.langue (langue_id) MATCH SIMPLE
--        ON UPDATE NO ACTION
--        ON DELETE NO ACTION
--)
--
--TABLESPACE pg_default;
--
--ALTER TABLE IF EXISTS public.film
--    OWNER to postgres;