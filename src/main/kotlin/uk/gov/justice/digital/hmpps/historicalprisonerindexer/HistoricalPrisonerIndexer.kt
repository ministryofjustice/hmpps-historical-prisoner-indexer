package uk.gov.justice.digital.hmpps.historicalprisonerindexer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HistoricalPrisonerIndexer

fun main(args: Array<String>) {
  runApplication<HistoricalPrisonerIndexer>(*args)
}
