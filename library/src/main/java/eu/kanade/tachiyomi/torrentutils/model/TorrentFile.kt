package eu.kanade.tachiyomi.torrentutils.model

@Suppress("unused")
data class TorrentFile(
    val path: String,
    val indexFile: Int,
    val size: Long,
    private val torrentHash: String,
    private val trackers: List<String> = emptyList(),
) {
    fun toMagnetURI(): String = throw Exception("Stub!")
}
