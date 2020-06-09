set USER_NAME=Enter
set JAR_PATH=C:\Users\%USER_NAME%\.m2\repository\com\brique\admc-api\0.0.1-SNAPSHOT
set SOURCE_PATH=C:\admc\admc-api
set HOST_URL=administrator@office.brique.kr
set TARGET_PATH=C:\admc\admc-api
set HOST_PASSWORD=Brique0901#$
set EXEC_JAR=admc-api-*.jar

call mvnw install -DskipTests
call pscp -pw %HOST_PASSWORD% -P 3322 %JAR_PATH%\%EXEC_JAR% %HOST_URL%:%TARGET_PATH%
call pscp -pw %HOST_PASSWORD% -P 3322 -r %SOURCE_PATH%\config %HOST_URL%:%TARGET_PATH%