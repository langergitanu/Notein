package io.opentelemetry.api.metrics;

import io.opentelemetry.api.common.Attributes;

/* JADX INFO: loaded from: classes10.dex */
public interface ObservableLongMeasurement extends ObservableMeasurement {
    void record(long j);

    void record(long j, Attributes attributes);
}
