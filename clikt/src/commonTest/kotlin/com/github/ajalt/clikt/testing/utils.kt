package com.github.ajalt.clikt.testing

import com.github.ajalt.clikt.core.UsageError

val Throwable.formattedMessage: String? get() = (this as? UsageError)?.formatMessage() ?: message
