package io.opentelemetry.api.metrics;

/* JADX INFO: loaded from: classes10.dex */
public interface LongHistogramBuilder {
    LongHistogram build();

    LongHistogramBuilder setDescription(String str);

    LongHistogramBuilder setUnit(String str);
}
