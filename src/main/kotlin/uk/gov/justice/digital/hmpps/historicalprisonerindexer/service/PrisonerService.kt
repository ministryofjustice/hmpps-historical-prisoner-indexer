package uk.gov.justice.digital.hmpps.historicalprisonerindexer.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.historicalprisonerindexer.model.PrisonerDetails
import uk.gov.justice.digital.hmpps.historicalprisonerindexer.repository.PrisonerDetailsRepository

@Service
class PrisonerService(private val prisonerDetailsRepository: PrisonerDetailsRepository) {
  companion object {
    val log: Logger = LoggerFactory.getLogger(this::class.java)
  }

  fun getOffenders(): MutableIterable<PrisonerDetails> {
    return prisonerDetailsRepository.findAll()
  }
}
