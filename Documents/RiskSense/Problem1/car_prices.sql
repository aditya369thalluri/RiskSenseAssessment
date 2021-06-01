/*

-- Create a Table to store car prices.

CREATE TABLE car_prices (
    manufacturer  VARCHAR(50),
  	model VARCHAR(50),
    price DECIMAL,
  	PRIMARY KEY(manufacturer,model)
);



-- Insert Rows into the table.

INSERT INTO car_prices VALUES('Toyota','Camry',16000);
INSERT INTO car_prices VALUES('Toyota','Highlander',22000);
INSERT INTO car_prices VALUES('Honda','Pilot',24000);
INSERT INTO car_prices VALUES('Honda','Accord',17000);
INSERT INTO car_prices VALUES('Toyota','Innova',22000);
INSERT INTO car_prices VALUES('Honda','Civic',24000);

*/




-- For every manufacturer, select the model with the highest price.

SELECT DISTINCT ON (manufacturer) manufacturer,
       model,
       price     
FROM   car_prices
WHERE  ( manufacturer, price ) IN (SELECT manufacturer,
                                          Max(price)
                                   FROM   car_prices
                                   GROUP  BY manufacturer);

