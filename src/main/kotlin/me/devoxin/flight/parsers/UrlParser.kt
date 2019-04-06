package me.devoxin.flight.parsers

import me.devoxin.flight.Context
import java.net.URL
import java.util.*

class UrlParser : Parser<URL> {

    override fun parse(ctx: Context, param: String): Optional<URL> {
        return try {
            Optional.of(URL(param))
        } catch (e: Throwable) {
            Optional.empty()
        }
    }

}