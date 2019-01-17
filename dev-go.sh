#! /bin/sh

#set -x
set -eo pipefail
shopt -s nullglob

docker -v

docker-compose -v

echo '\n-----------------------\n'

echo ' gradle clear 清除编译信息...'

./gradlew clean

echo '\n'

echo ' gradle build 重新编译服务...'

./gradlew build

echo '服务编译完成...'

echo '\n'

echo '编译docker 服务....'

docker-compose -f docker-compose/basic-compose.yml build

echo '服务编译完成...'

echo '\n'

echo '启动docker 服务....'

docker-compose -f docker-compose/basic-compose.yml up -d

echo '服务编译完成...'

