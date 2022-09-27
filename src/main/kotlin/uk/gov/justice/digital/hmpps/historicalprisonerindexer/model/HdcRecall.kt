package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "HDC_RECALL", schema = "HPA")
data class HdcRecall(
  @Id
  @GeneratedValue(generator = "PK_HDC_RECALL")
  @Column(name = "PK_HDC_RECALL", nullable = false)
  val hdcRecall: Long = 0,

  val prisonNumber: String? = null,
  val createdDate: LocalDate? = null,
  val curfewDate: LocalDate? = null,
  val outcomeDate: LocalDate? = null,
  val outcome: String? = null,
  val reason: String? = null
)
