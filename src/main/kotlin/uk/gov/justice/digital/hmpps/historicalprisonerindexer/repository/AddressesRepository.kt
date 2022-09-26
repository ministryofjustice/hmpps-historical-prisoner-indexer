package uk.gov.justice.digital.hmpps.historicalprisonerindexer.repository

import uk.gov.justice.digital.hmpps.historicalprisonerindexer.model.Addresses
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressesRepository : CrudRepository<Addresses, Long>
