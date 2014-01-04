package com.dius.pact.model

object Fixtures {
  val provider = Provider("test_provider")
  val consumer = Consumer("test_consumer")

  val request = Request(Get, "/",
    Some(Map("testreqheader" -> "testreqheadervalue")),
    Some("""{"test":true}"""))

  val response = Response(200,
    Some(Map("testreqheader" -> "testreqheaderval")),
    Some("""{"responsetest":true}"""))

  val interaction = Interaction(
    description = "test interaction",
    providerState = "test state",
    request = request,
    response = response
  )

  val interactions = List(interaction)

  val pact: Pact = Pact(
    provider = provider,
    consumer = consumer,
    interactions = interactions
  )
}
