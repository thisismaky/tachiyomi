package eu.kanade.tachiyomi.extension.model


interface SExtension {

    var url: String

    var name: String

    var lang: String

    var version: String


    companion object {
        fun create(): SExtension {
            return SExtensionImpl()
        }
    }
}