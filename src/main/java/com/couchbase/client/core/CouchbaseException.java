package com.couchbase.client.core;


public class CouchbaseException extends RuntimeException {

    public CouchbaseException() {
    }

    public CouchbaseException(String message) {
        super(message);
    }

    public CouchbaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public CouchbaseException(Throwable cause) {
        super(cause);
    }

    public CouchbaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
