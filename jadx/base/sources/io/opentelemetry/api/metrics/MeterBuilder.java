package io.opentelemetry.api.metrics;

/* JADX INFO: loaded from: classes10.dex */
public interface MeterBuilder {
    Meter build();

    MeterBuilder setInstrumentationVersion(String str);

    MeterBuilder setSchemaUrl(String str);
}
