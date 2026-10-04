package io.opentelemetry.api.baggage;

import androidx.concurrent.futures.OooO00o;

/* JADX INFO: loaded from: classes10.dex */
final class AutoValue_ImmutableEntryMetadata extends ImmutableEntryMetadata {
    private final String value;

    public AutoValue_ImmutableEntryMetadata(String str) {
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEntryMetadata) {
            return this.value.equals(((ImmutableEntryMetadata) obj).getValue());
        }
        return false;
    }

    @Override // io.opentelemetry.api.baggage.ImmutableEntryMetadata, io.opentelemetry.api.baggage.BaggageEntryMetadata
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public String toString() {
        return OooO00o.OooO0OO(new StringBuilder("ImmutableEntryMetadata{value="), this.value, "}");
    }
}
