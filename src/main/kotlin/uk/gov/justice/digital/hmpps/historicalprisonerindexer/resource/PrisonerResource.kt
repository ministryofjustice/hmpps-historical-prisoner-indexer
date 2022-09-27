package uk.gov.justice.digital.hmpps.historicalprisonerindexer.resource

import org.springframework.http.MediaType
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.digital.hmpps.historicalprisonerindexer.model.PrisonerDetails
import uk.gov.justice.digital.hmpps.historicalprisonerindexer.service.PrisonerService

@RestController
@RequestMapping("/historical-prisoner", produces = [MediaType.APPLICATION_JSON_VALUE])
class PrisonerResource(private val prisonerService: PrisonerService) {

  @PreAuthorize("hasRole('HISTORICAL_PRISONER_INDEX')")
  @GetMapping("/offenders")
  fun getOffenders(): MutableIterable<PrisonerDetails> = prisonerService.getOffenders()
}
