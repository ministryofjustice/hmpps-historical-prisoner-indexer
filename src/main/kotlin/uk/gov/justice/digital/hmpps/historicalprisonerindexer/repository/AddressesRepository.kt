package uk.gov.justice.digital.hmpps.historicalprisonerindexer.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import uk.gov.justice.digital.hmpps.historicalprisonerindexer.model.Addresses

@Repository
interface AddressesRepository : CrudRepository<Addresses, Long>
