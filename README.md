# Preresquities

Install JHipster - http://www.jhipster.tech/installation/

# Running

1. Service discovery and settings repository (run in `jhipster-registry` directory):

		docker-compose -f jhipster-registr.yml up


1. Bookstore microservice (run in `bookstore` directory):

		./mvnw


1. Microservice gateway (run in `gateway` directory):

		yarn
		yarn webpack:build
		./mvnw
