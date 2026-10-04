package io.opentelemetry.context;

import io.opentelemetry.context.ThreadLocalContextStorage;

/* JADX INFO: loaded from: classes10.dex */
public interface Scope extends AutoCloseable {
    static Scope noop() {
        return ThreadLocalContextStorage.NoopScope.INSTANCE;
    }

    @Override // java.lang.AutoCloseable
    void close();
}
