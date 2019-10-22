#!/bin/bash
set -e -u

APP_NAME='xq-universe-auth-service'
APP_VERSION=`cat VERSION`

echo 'Config user name & user email'
name=$(git log -1 --pretty=format:"%an")
email=$(git log -1 --pretty=format:"%ae")
git config user.name "$name"
git config user.email "$email"

echo 'Commit build files'
mv build/libs/auth-service-$(APP_VERSION).jar auth-service.jar
git add -f auth-service.jar
git commit -m "Deploy v$APP_VERSION"

echo 'Deploy code to heroku'
git push -f https://heroku:$HEROKU_API_KEY@git.heroku.com/$APP_NAME.git master
