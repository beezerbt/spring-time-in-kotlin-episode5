# Spring Time in Kotlin, Episode 5: Integration testing with TestContainers

This is a demo project used in [the 5th episode of Spring Time in Kotlin series](https://www.youtube.com/watch?v=0jWo3o7r-W4) at the official [Kotlin YouTube channel](https://www.youtube.com/kotlin)

In this episode:
- We start using PostgreSQL database instead of H2
- Use TestContainers for testing
- Lean more about Kotlin and Java interoperability

## Running the Tests
Here we will outline how best to get started on Windows for running the
tests.
### Windows Docker Desktop Pre-Requisites
1. Docker Desktop (https://docs.docker.com/desktop/install/windows-install/)
   2. Admin rights on your host 
   3. (Optional) Dockerhub account
   4. WSL (1 or 2) installed on desktop computer
   5. Same user starting Intellij on Windows should be part of the Docker User Group on Windows
      6. Without this, it becomes very difficult if not impossible to have Intellij
      successfully connect to Docker Desktop successfully (tried multiple combinations)
### Windows Podman 
1. Podman for Windows https://github.com/containers/podman/blob/main/docs/tutorials/podman-for-windows.md)<br>
If you do not have Admin rights to your host Podman is for you

## Running the Application

First, start PostgreSQL database by running this command (assuming you have Docker installed on the machine):

    docker run -e POSTGRES_PASSWORD=password -e POSTGRES_USER=sa -p 5432:5432 -d postgres

Now you can launch Spring Boot application:

    ./gradlew bootRun
