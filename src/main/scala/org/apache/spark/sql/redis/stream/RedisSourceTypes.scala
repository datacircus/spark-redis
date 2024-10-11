package org.apache.spark.sql.redis.stream

import java.util.{List => JList, Map => JMap}
import redis.clients.jedis.resps.{StreamEntry => JStreamEntry}
import redis.clients.jedis.StreamEntryID

/**
  * @author The Viet Nguyen
  */
object RedisSourceTypes {

  type StreamEntry = (StreamEntryID, JMap[String, String])
  type StreamEntryBatch = JMap.Entry[String, JList[JStreamEntry]]
  type StreamEntryBatches = JList[StreamEntryBatch]
}
