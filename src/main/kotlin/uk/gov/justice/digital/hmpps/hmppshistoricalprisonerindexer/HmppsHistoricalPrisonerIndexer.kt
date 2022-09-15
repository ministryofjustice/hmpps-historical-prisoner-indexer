package uk.gov.justice.digital.hmpps.hmppshistoricalprisonerindexer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication()
class HmppsHistoricalPrisonerIndexer

fun main(args: Array<String>) {
  runApplication<HmppsHistoricalPrisonerIndexer>(*args)
}
