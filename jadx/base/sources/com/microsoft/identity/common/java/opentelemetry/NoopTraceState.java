package com.microsoft.identity.common.java.opentelemetry;

import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.TraceStateBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes9.dex */
public class NoopTraceState implements TraceState {
    private static final Map<String, String> EMPTY = Collections.EMPTY_MAP;

    public static class NoopTraceStateBuilder {
        public NoopTraceState build() {
            return new NoopTraceState();
        }

        public String toString() {
            return "NoopTraceState.NoopTraceStateBuilder()";
        }
    }

    public static NoopTraceStateBuilder builder() {
        return new NoopTraceStateBuilder();
    }

    @Override // io.opentelemetry.api.trace.TraceState
    public Map<String, String> asMap() {
        return EMPTY;
    }

    @Override // io.opentelemetry.api.trace.TraceState
    public void forEach(BiConsumer<String, String> biConsumer) {
    }

    @Override // io.opentelemetry.api.trace.TraceState
    public String get(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.trace.TraceState
    public boolean isEmpty() {
        return true;
    }

    @Override // io.opentelemetry.api.trace.TraceState
    public int size() {
        return 0;
    }

    @Override // io.opentelemetry.api.trace.TraceState
    public TraceStateBuilder toBuilder() {
        return new com.microsoft.identity.common.java.opentelemetry.NoopTraceStateBuilder();
    }
}
