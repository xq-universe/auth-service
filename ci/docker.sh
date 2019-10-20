#!/bin/bash
set -e -u

REPOSITORY='xquniverse/auth-service'
VERSION=`cat VERSION`

echo 'Login to docker registry'
docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}

echo 'Build docker image'
docker build --build-arg version=${VERSION} -t ${REPOSITORY} .

echo 'Tag image'
docker tag ${REPOSITORY}:latest ${REPOSITORY}:${VERSION}

echo 'Push image'
docker push ${REPOSITORY}:latest
docker push ${REPOSITORY}:${VERSION}

echo "Build and push docker image ${REPOSITORY}:${VERSION} to docker registry"
