package demo

import org.testcontainers.containers.GenericContainer
import org.testcontainers.utility.DockerImageName


//1.5.20
/*fun postgres(version: String, options: JdbcDatabaseContainer<Nothing>.() -> Unit) =
    PostgreSQLContainer<Nothing>(DockerImageName.parse("postgres:$version")).apply(options)*/

fun mapPortBindings():MutableList<String> {
    val portBindings: MutableList<String> = ArrayList()
    portBindings.add("3000:3000") // hostPort:containerPort
    return portBindings
}

fun mockoon(version: String): GenericContainer<Nothing> =
        GenericContainer<Nothing>(
                DockerImageName.parse("mockoon/cli:$version")).apply {
                    portBindings = mapPortBindings() // hostPort:containerPort
            withCommand("-d https://raw.githubusercontent.com/mockoon/mock-samples/main/samples/generate-mock-data.json --port 3000")
        }

//1.5.30 (doesn't work yet: One type argument expected for class JdbcDatabaseContainer<SELF : JdbcDatabaseContainer<SELF!>!>)
//fun postgresContainer(version: String, options: JdbcDatabaseContainer.() -> Unit) =
//    PostgreSQLContainer(DockerImageName.parse("postgres:$version")).apply(options)

