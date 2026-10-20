package eu.kanade.tachiyomi.torrentutils

import eu.kanade.tachiyomi.torrentutils.model.TorrentFile
import eu.kanade.tachiyomi.torrentutils.model.TorrentInfo

/**
 * Access to the app's built-in torrent server. Implemented by the app at runtime.
 */
@Suppress("unused", "UNUSED_PARAMETER")
object TorrentUtils {
    /**
     * Loads the torrent behind [url] (a magnet link or a .torrent URL) into the torrent server,
     * starting the server if needed, and returns its file list. Blocking.
     */
    fun getTorrentInfo(
        url: String,
        title: String,
    ): TorrentInfo = throw Exception("Stub!")

    /**
     * Local URL that serves the raw bytes of [file] from the torrent server. Call
     * [keepServerAlive] before each request so the server is up.
     */
    fun getStreamUrl(file: TorrentFile): String = throw Exception("Stub!")

    /**
     * Starts the torrent server if needed and postpones its idle stop. Blocking.
     *
     * @return true if the server is reachable.
     */
    fun keepServerAlive(): Boolean = throw Exception("Stub!")
}
