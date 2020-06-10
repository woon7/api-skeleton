set SOURCE_PATH=C:\admc\admc-api
set TARGET_PATH=/admc/admc-api
set API_VERSION=0.0.1-SNAPSHOT
set EX_PORT=8080
set IN_PORT=8080
set CONTAINER_NAME=admc-api
set IMAGE_NAME=openjdk:8u252-jre-slim
set VM_OPT=-Dspring.profiles.active=op
set JAVA_CMD=java -jar %VM_OPT% admc-api-%API_VERSION%.jar
set TOTAL_CMD=/bin/bash -c "cd %TARGET_PATH% && %JAVA_CMD%"

docker rm -f %CONTAINER_NAME%
docker run --restart=always -d -p %EX_PORT%:%IN_PORT% -v %SOURCE_PATH%:%TARGET_PATH% --name %CONTAINER_NAME% %IMAGE_NAME% %TOTAL_CMD%