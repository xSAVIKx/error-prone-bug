package com.acme;

/**
 * Field names to use as keys in the MDC map.
 *
 * @implNote We do want to use lowercase enum names to avoid creating a custom field.
 */
public enum Diagnostics {

    /**
     * Identifier of the user who performs a particular action in the system.
     */
    actor,

    /**
     * GCloud-provided {@code traceId} in the format {@code projects/<projectId>/traces/<traceId>}.
     */
    gcloudTrace,

    /**
     * The ID of the HTTP session used by the associated request.
     */
    session,

    /**
     * The request URL that a user performed the call to.
     */
    url
}
