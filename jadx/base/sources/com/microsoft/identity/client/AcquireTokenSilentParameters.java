package com.microsoft.identity.client;

import com.microsoft.identity.client.TokenParameters;

/* JADX INFO: loaded from: classes9.dex */
public class AcquireTokenSilentParameters extends TokenParameters {
    private SilentAuthenticationCallback mCallback;
    private boolean mForceRefresh;

    public static class Builder extends TokenParameters.Builder<Builder> {
        private SilentAuthenticationCallback mCallback;
        private boolean mForceRefresh;

        public Builder forceRefresh(boolean z) {
            this.mForceRefresh = z;
            return self();
        }

        @Override // com.microsoft.identity.client.TokenParameters.Builder
        public Builder self() {
            return this;
        }

        public Builder withCallback(SilentAuthenticationCallback silentAuthenticationCallback) {
            this.mCallback = silentAuthenticationCallback;
            return this;
        }

        @Override // com.microsoft.identity.client.TokenParameters.Builder
        public AcquireTokenSilentParameters build() {
            return new AcquireTokenSilentParameters(this);
        }
    }

    public AcquireTokenSilentParameters(Builder builder) {
        super(builder);
        this.mForceRefresh = builder.mForceRefresh;
        this.mCallback = builder.mCallback;
    }

    public SilentAuthenticationCallback getCallback() {
        return this.mCallback;
    }

    public boolean getForceRefresh() {
        return this.mForceRefresh;
    }

    public void setCallback(SilentAuthenticationCallback silentAuthenticationCallback) {
        this.mCallback = silentAuthenticationCallback;
    }

    public void setForceRefresh(boolean z) {
        this.mForceRefresh = z;
    }
}
