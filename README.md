# Auth service
This is a server for auth things.

## Current Status:

[![Java 11](https://img.shields.io/badge/Java-11-brightgreen.svg)]()
[![SpringBoot 2.2](https://img.shields.io/badge/SpringBoot-2.2-brightgreen.svg)]()
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)]()
[![Docker Pulls](https://img.shields.io/docker/pulls/xquniverse/auth-service.svg)](https://hub.docker.com/r/xquniverse/auth-service/)
[![Docker Stars](https://img.shields.io/docker/stars/xquniverse/auth-service.svg)](https://hub.docker.com/r/xquniverse/auth-service/)
[![Docker image](https://images.microbadger.com/badges/image/xquniverse/auth-service.svg)](https://microbadger.com/images/xquniverse/auth-service)
[![Build Status](https://circleci.com/gh/xq-universe/auth-service.svg?style=svg)](https://circleci.com/gh/xq-universe/auth-service)

## Development:

### Compile

```
$> ./gradlew clean build
```

### Start with gradle

```
$> ./gradlew bootRun
```

### Start with docker

```
$> docker-compose build && docker-compose up -d
```

### Start with publish docker image

```sh
$> docker pull xquniverse/auth-service
$> docker run --name auth-server -d -p 8001:8001 xquniverse/auth-service
```

### Access the online site

```sh
$> open https://xq-universe-auth-service.herokuapp.com/
```

## License

auth-service is released under the [MIT license](https://github.com/xq-universe/auth-service/blob/master/LICENSE).
