:: Client
set USER_NAME=brique
set API_NAME=admc-api
set API_VERSION=0.0.1-SNAPSHOT
set JAR_PATH=C:\Users\%USER_NAME%\.m2\repository\com\brique\%API_NAME%\%API_VERSION%
set EXEC_JAR=%API_NAME%-%API_VERSION%.jar
set SOURCE_PATH=C:\admc\%API_NAME%
set HOST_URL=administrator@192.168.0.37
set TARGET_PATH=C:\admc\%API_NAME%
set HOST_PW=Brique0901#$
set SCP_PORT=22

:: Command
call mvnw install -DskipTests
call plink -batch -ssh %HOST_URL% -pw %HOST_PW% del /f %TARGET_PATH%\%EXEC_JAR%
call pscp -pw %HOST_PW% -P %SCP_PORT% %JAR_PATH%\%EXEC_JAR% %HOST_URL%:%TARGET_PATH%
call pscp -pw %HOST_PW% -P %SCP_PORT% -r %SOURCE_PATH%\config %HOST_URL%:%TARGET_PATH%
call plink -batch -ssh %HOST_URL% -pw %HOST_PW% %TARGET_PATH%\start-docker.bat