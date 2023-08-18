package demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.testcontainers.containers.GenericContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
class IntegrationTests {
    companion object {
        /* @Container
         val container = postgres("13-alpine") {
             withDatabaseName("db")
             withUsername("user")
             withPassword("password")
             withInitScript("sql/schema.sql")
         }*/
        @Container
        val mockoonContainer = mockoon("latest")
    }

    /*   @Test
       fun `container is up and running`() {
           Assertions.assertTrue(container.isRunning)
       }*/
    @Test
    fun `mockoon container is up and running`() {
        //mockoonContainer.start()
        Assertions.assertTrue(mockoonContainer.isRunning)
        println("hi there")
    }
}