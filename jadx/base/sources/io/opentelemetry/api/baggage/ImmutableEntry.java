package io.opentelemetry.api.baggage;

/* JADX INFO: loaded from: classes10.dex */
abstract class ImmutableEntry implements BaggageEntry {
    public static ImmutableEntry create(String str, BaggageEntryMetadata baggageEntryMetadata) {
        return new AutoValue_ImmutableEntry(str, baggageEntryMetadata);
    }
}
