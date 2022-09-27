package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "COURT_HEARINGS", schema = "HPA")
data class CourtHearings(
  @Id
  @GeneratedValue(generator = "PK_COURT_HEARING")
  @Column(name = "PK_COURT_HEARING", nullable = false)
  val courtHearing: Long = 0,

  val prisonNumber: String? = null,
  val date: LocalDate? = null,
  val Court: String? = null
)
