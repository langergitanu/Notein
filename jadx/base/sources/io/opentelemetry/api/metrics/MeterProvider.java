package io.opentelemetry.api.metrics;

/* JADX INFO: loaded from: classes10.dex */
public interface MeterProvider {
    static MeterProvider noop() {
        return DefaultMeterProvider.getInstance();
    }

    default Meter get(String str) {
        return meterBuilder(str).build();
    }

    MeterBuilder meterBuilder(String str);
}
