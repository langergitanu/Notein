package io.opentelemetry.api.baggage;

import io.opentelemetry.api.internal.ValidationUtil;

/* JADX INFO: loaded from: classes10.dex */
abstract class ImmutableEntryMetadata implements BaggageEntryMetadata {
    static final ImmutableEntryMetadata EMPTY = create("");

    public static ImmutableEntryMetadata create(String str) {
        if (str != null) {
            return new AutoValue_ImmutableEntryMetadata(str);
        }
        ValidationUtil.log("metadata is null");
        return EMPTY;
    }

    @Override // io.opentelemetry.api.baggage.BaggageEntryMetadata
    public abstract String getValue();
}
