package io.opentelemetry.api.trace;

/* JADX INFO: loaded from: classes10.dex */
public class NoopTracerProvider {
    public static TracerProvider getInstance() {
        return DefaultTracerProvider.getInstance();
    }
}
