package com.google.firebase.inappmessaging.model;

import android.support.v4.media.session.OooO00o;
import androidx.transition.C22101OooOOOo;
import com.google.firebase.inappmessaging.model.RateLimit;

/* JADX INFO: loaded from: classes8.dex */
final class AutoValue_RateLimit extends RateLimit {
    private final long limit;
    private final String limiterKey;
    private final long timeToLiveMillis;

    public static final class Builder extends RateLimit.Builder {
        private long limit;
        private String limiterKey;
        private byte set$0;
        private long timeToLiveMillis;

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit build() {
            String str;
            if (this.set$0 == 3 && (str = this.limiterKey) != null) {
                return new AutoValue_RateLimit(str, this.limit, this.timeToLiveMillis);
            }
            StringBuilder sb = new StringBuilder();
            if (this.limiterKey == null) {
                sb.append(" limiterKey");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" limit");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" timeToLiveMillis");
            }
            throw new IllegalStateException(C22101OooOOOo.OooO0OO("Missing required properties:", sb));
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit.Builder setLimit(long j) {
            this.limit = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit.Builder setLimiterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null limiterKey");
            }
            this.limiterKey = str;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit.Builder setTimeToLiveMillis(long j) {
            this.timeToLiveMillis = j;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RateLimit) {
            RateLimit rateLimit = (RateLimit) obj;
            if (this.limiterKey.equals(rateLimit.limiterKey()) && this.limit == rateLimit.limit() && this.timeToLiveMillis == rateLimit.timeToLiveMillis()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.limiterKey.hashCode() ^ 1000003) * 1000003;
        long j = this.limit;
        long j2 = this.timeToLiveMillis;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public long limit() {
        return this.limit;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public String limiterKey() {
        return this.limiterKey;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public long timeToLiveMillis() {
        return this.timeToLiveMillis;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RateLimit{limiterKey=");
        sb.append(this.limiterKey);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", timeToLiveMillis=");
        return OooO00o.OooO00o(this.timeToLiveMillis, "}", sb);
    }

    private AutoValue_RateLimit(String str, long j, long j2) {
        this.limiterKey = str;
        this.limit = j;
        this.timeToLiveMillis = j2;
    }
}
