package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "HDC_INFO", schema = "HPA")
data class HdcInfo(
  @Id
  @GeneratedValue(generator = "PK_HDC_INFO")
  @Column(name = "PK_HDC_INFO", nullable = false)
  val hdcInfo: Long = 0,

  val prisonNumber: String? = null,
  val date: LocalDate? = null,
  val stage: String? = null,
  val status: String? = null,
  val reason: String? = null
)
