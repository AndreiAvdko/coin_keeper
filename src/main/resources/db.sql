-- we don't know how to generate root <with-no-name> (class Root) :(

comment on database postgres is 'default administrative connection database';

create table public.account
(
    id    integer generated always as identity (maxvalue 10000)
        constraint account_pk
            primary key,
    name  varchar,
    value integer
);

alter table public.account
    owner to root;

create table public.spend
(
    id             integer generated always as identity (maxvalue 10000)
        constraint spend_pk
            primary key,
    account_id     integer
        constraint spend_account_id_fk
            references public.account,
    spend_category varchar,
    spend          integer,
    description    varchar
);

alter table public.spend
    owner to root;

