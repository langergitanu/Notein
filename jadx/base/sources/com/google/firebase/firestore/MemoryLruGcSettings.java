package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes8.dex */
public final class MemoryLruGcSettings implements MemoryGarbageCollectorSettings {
    private long sizeBytes;

    public static class Builder {
        private long sizeBytes;

        public MemoryLruGcSettings build() {
            return new MemoryLruGcSettings(this.sizeBytes);
        }

        public Builder setSizeBytes(long j) {
            this.sizeBytes = j;
            return this;
        }

        private Builder() {
            this.sizeBytes = 104857600L;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MemoryLruGcSettings.class == obj.getClass() && this.sizeBytes == ((MemoryLruGcSettings) obj).sizeBytes;
    }

    public long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        long j = this.sizeBytes;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "MemoryLruGcSettings{cacheSize=" + getSizeBytes() + "}";
    }

    private MemoryLruGcSettings(long j) {
        this.sizeBytes = j;
    }
}
