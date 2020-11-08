insert into USERS (USERNAME, PASSWORD, ENABLED) values ('ducobu', '{noop}vacances', true);
insert into USERS (USERNAME, PASSWORD, ENABLED) values ('latouche', '{noop}hyménomycètes', true);

insert into AUTHORITIES (USERNAME, AUTHORITY) VALUES ( 'ducobu', 'ROLE_USER' );
insert into AUTHORITIES (USERNAME, AUTHORITY) VALUES ( 'latouche', 'ROLE_USER' );
insert into AUTHORITIES (USERNAME, AUTHORITY) VALUES ( 'latouche', 'ROLE_ADMIN' );
