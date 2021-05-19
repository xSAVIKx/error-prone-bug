package com.acme;

import com.google.common.flogger.FluentLogger;

public final class FloggerToStringFailure {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    void compilationFails() {
        logger.atInfo().log("This is formatted with toString() %s value", toString());
    }
}
