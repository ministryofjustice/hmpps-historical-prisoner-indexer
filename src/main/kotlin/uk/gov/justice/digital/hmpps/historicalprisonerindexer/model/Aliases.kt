package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ALIASES", schema = "HPA")
data class Aliases(
  @Id
  @GeneratedValue(generator = "ALIAS_ID")
  @Column(name = "ALIAS_ID", nullable = false)
  val aliasId: Long = 0,

  @Column(name = "PK_PRISON_NUMBER", nullable = false)
  val prisonNumber: String? = null,
  val Aliases: String? = null

)
