package io.opentelemetry.api.metrics;

/* JADX INFO: loaded from: classes10.dex */
public class NoopMeterProvider {
    public static MeterProvider getInstance() {
        return DefaultMeterProvider.getInstance();
    }
}
