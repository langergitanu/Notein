package com.microsoft.identity.client;

import com.microsoft.identity.client.TokenParameters;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceCodeFlowParameters extends TokenParameters {

    public static class Builder extends TokenParameters.Builder<Builder> {
        @Override // com.microsoft.identity.client.TokenParameters.Builder
        public Builder self() {
            return this;
        }

        @Override // com.microsoft.identity.client.TokenParameters.Builder
        public DeviceCodeFlowParameters build() {
            return new DeviceCodeFlowParameters(this);
        }
    }

    public DeviceCodeFlowParameters(Builder builder) {
        super(builder);
    }
}
