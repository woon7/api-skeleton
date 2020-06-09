set USER_NAME=brique
set JAR_PATH=C:\Users\%USER_NAME%\.m2\repository\com\brique\admc-api\0.0.1-SNAPSHOT
set SOURCE_PATH=C:\admc\admc-api
set HOST_URL=administrator@192.168.0.37
set TARGET_PATH=C:\admc\admc-api
set HOST_PASSWORD=Brique0901#$
set EXEC_JAR=admc-api-*.jar

call mvnw install -DskipTests
call pscp -pw %HOST_PASSWORD% -P 22 %JAR_PATH%\%EXEC_JAR% %HOST_URL%:%TARGET_PATH%
call pscp -pw %HOST_PASSWORD% -P 22 -r %SOURCE_PATH%\config %HOST_URL%:%TARGET_PATH%