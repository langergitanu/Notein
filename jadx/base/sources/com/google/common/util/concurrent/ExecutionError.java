package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
public class ExecutionError extends Error {
    private static final long serialVersionUID = 0;

    public ExecutionError() {
    }

    public ExecutionError(String str) {
        super(str);
    }

    public ExecutionError(String str, Error error) {
        super(str, error);
    }

    public ExecutionError(Error error) {
        super(error);
    }
}
