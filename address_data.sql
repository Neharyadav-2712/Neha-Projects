-- use startersql;
-- INSERT INTO addresses (user_id, street, city, state, pincode) VALUES
-- (1,  'Street1',  'Delhi',       'Delhi',        '110001'),
-- (2,  'Street2',  'Mumbai',      'Maharashtra',  '400001'),
-- (3,  'Street3',  'Kolkata',     'West Bengal',  '700001'),
-- (4,  'Street4',  'Chennai',     'Tamil Nadu',   '600001'),
-- (5,  'Street5',  'Bengaluru',   'Karnataka',    '560001'),
-- (6,  'Street6',  'Hyderabad',   'Telangana',    '500001'),
-- (7,  'Street7',  'Pune',        'Maharashtra',  '411001'),
-- (8,  'Street8',  'Jaipur',      'Rajasthan',    '302001'),
-- (9,  'Street9',  'Lucknow',     'Uttar Pradesh','226001'),
-- (10, 'Street10', 'Kanpur',      'Uttar Pradesh','208001'),
-- (11, 'Street11', 'Bhopal',      'Madhya Pradesh','462001'),
-- (12, 'Street12', 'Patna',       'Bihar',        '800001'),
-- (13, 'Street13', 'Chandigarh',  'Chandigarh',   '160001'),
-- (14, 'Street14', 'Surat',       'Gujarat',      '395001'),
-- (15, 'Street15', 'Dehradun',    'Uttarakhand',  '248001');

 select * from users;
 select * from addresses;

select users.name, addresses.city from users
right join addresses on users.id = addresses.user_id;


-- select count(*) uers_count from users;
-- select count(*)  addresses_count from addresses;


