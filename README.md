newvalia
========

Requirements:

jdk 1.8
maven 3.2.2
mongoDB version : mongodb-win32-x86_64-2008plus-2.6.6 (obviously this windows version)

This project is totally parametrizable, if you want it to run under maven,
you must include some params in you launch configuration.

This params are set in parent pom:

<db.host>${url}</db.host>
<db.port>${port}</db.port>
<db.user>${user}</db.user>
<db.password>${password}</db.password>

and these variables are set in init.properties in core/web module, and later passed through maven run command.

db.host=${db.host}
db.port=${db.port}
db.user=${db.user}
db.password=${db.password}
db.name=${db.name}

Below there are basic launch maven configutations.

1. to run a simply install you must add this params:

clean install -Duser=youruser -Dpassword=yourpasswd -Durl=yourmongourl -Dport=yourmongoport

2. to run under maven tomcat:

tomcat7:run -Duser=youruser -Dpassword=yourpasswd -Durl=yourmongourl -Dport=yourmongoport


Project based in spring/mongodb and angularJS in frontend.

Basically it is focused to use some many other projects that I have in mind.

I will begin to add configurations

This is current build status: 
<a href='https://jenkins-newvaliashop.rhcloud.com:443/job/newvalia/13/'>Image: <img src='https://jenkins-newvaliashop.rhcloud.com:443/buildStatus/icon?job=newvalia&build=13'></a>
