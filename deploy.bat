set USER_NAME=brique
set API_VERSION=0.0.1-SNAPSHOT
set JAR_PATH=C:\Users\%USER_NAME%\.m2\repository\com\brique\admc-api\%API_VERSION%
set EXEC_JAR=admc-api-%API_VERSION%.jar
set SRC_PATH=C:\admc\admc-api
set HOST_URL=administrator@192.168.0.37
set TARGET_PATH=C:\admc\admc-api
set HOST_PW=Brique0901#$

call mvnw install -DskipTests
call pscp -pw %HOST_PW% -P 22 %JAR_PATH%\%EXEC_JAR% %HOST_URL%:%TARGET_PATH%
call pscp -pw %HOST_PW% -P 22 -r %SRC_PATH%\config %HOST_URL%:%TARGET_PATH%
call plink -ssh %HOST_URL% -pw %HOST_PW% %TARGET_PATH%\start-docker.bat