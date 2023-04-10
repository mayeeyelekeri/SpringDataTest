#!/bin/bash 
properties_file=$1 
dest_properties_file=$2

mysql_host=$3 
mysql_database=$4 
mysql_user=$5
mysql_password=$6

echo "inside create_properties_file.sh" 
echo "properties file $properties_file"
echo "all properties $*" 
echo "mysql_user = $mysql_user"
echo "dest properties file $dest_properties_file"

echo "spring.datasource.url=jdbc:mysql://$mysql_host/$mysql_database" >> $properties_file
echo "spring.datasource.username=$mysql_user" >> $properties_file
echo "spring.datasource.password=$mysql_password" >> $properties_file
echo "spring.jpa.hibernate.ddl-auto=none" >> $properties_file
echo "spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl" >> $properties_file
echo "spring.jpa.properties.hibernate.id.new_generator_mappings=false" >> $properties_file

echo "spring.redis.host=redis" >> $properties_file
echo "spring.redis.port=6379" >> $properties_file

cat $properties_file

cp $properties_file $dest_properties_file 

cat $dest_properties_file