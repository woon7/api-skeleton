set JAR_PATH=C:\Users\brique\.m2\repository\com\brique\admc-api\0.0.1-SNAPSHOT
set SOURCE_PATH=C:\admc\admc-api
set TARGET_PATH=administrator@192.168.0.37:C:\admc\admc-api
set HOST_PASSWORD=Brique0901#$

call mvnw install -DskipTests
call pscp -pw %HOST_PASSWORD% %JAR_PATH%\admc-api-*.jar %TARGET_PATH%
call pscp -pw %HOST_PASSWORD% -r %SOURCE_PATH%\config %TARGET_PATH%