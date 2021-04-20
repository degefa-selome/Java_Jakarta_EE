set -eo
curl https://downloads.apache.org/tomcat/tomcat-10/v10.0.5/bin/apache-tomcat-10.0.5.tar.gz -o /tmp/apache-tomcat-10.0.5.tar.gz
mkdir /opt/tomcat
tar xzvf /tmp/apache-tomcat*tar.gz -C /opt/tomcat --strip-components=1
ls /opt/tomcat && ls /opt/tomcat/bin
echo "== showing /opt/tomcat/conf =="
ls /opt/tomcat/conf
echo "== Removng default tomcat-users.xml =="
cp .github/scripts/tomcat_user.xml /opt/tomcat/conf/tomcat-users.xml
cp .github/scripts/maven-settings.xml /usr/share/apache-maven-3.6.3/conf/settings.xml
