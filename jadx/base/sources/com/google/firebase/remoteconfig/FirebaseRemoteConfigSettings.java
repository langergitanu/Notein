package com.google.firebase.remoteconfig;

import com.aspose.slides.C22200OooO0o0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* JADX INFO: loaded from: classes8.dex */
public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    public static class Builder {
        private long fetchTimeoutInSeconds = 60;
        private long minimumFetchInterval = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.fetchTimeoutInSeconds;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.minimumFetchInterval;
        }

        public Builder setFetchTimeoutInSeconds(long j) throws IllegalArgumentException {
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
            }
            this.fetchTimeoutInSeconds = j;
            return this;
        }

        public Builder setMinimumFetchIntervalInSeconds(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(C22200OooO0o0.OooO0O0(j, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
            }
            this.minimumFetchInterval = j;
            return this;
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.fetchTimeoutInSeconds = builder.fetchTimeoutInSeconds;
        this.minimumFetchInterval = builder.minimumFetchInterval;
    }
}
