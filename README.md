# Preresquities

1. Install JHipster - http://www.jhipster.tech/installation/

1. [Docker installation](https://docs.docker.com/install/) is recommended.

# Running

1. Service discovery and settings repository (run in [jhipster-registry](jhipster-registry) directory):

        docker-compose -f jhipster-registr.yml up


1. Bookstore microservice (run in [bookstore](bookstore) directory):

        ./mvnw


1. Microservice gateway (run in [gateway](gateway) directory):

        yarn
        yarn webpack:build
        ./mvnw
