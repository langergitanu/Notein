package com.huawei.hms.network.restclient;

import com.huawei.hms.network.NetworkKitProvider;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.SubmitAdapter;
import com.huawei.hms.network.restclient.internal.IRestClientBuilder;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public abstract class RestClient {

    public static final class Builder extends IRestClientBuilder {
        IRestClientBuilder delegateBuilder = NetworkKitProvider.getEnableProvider().createRestClientBuilder();

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public Builder addConverterFactory(Converter.Factory factory) {
            this.delegateBuilder.addConverterFactory(factory);
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public Builder addSubmitAdapterFactory(SubmitAdapter.Factory factory) {
            this.delegateBuilder.addSubmitAdapterFactory(factory);
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public Builder baseUrl(String str) {
            this.delegateBuilder.baseUrl(str);
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public RestClient build() {
            return this.delegateBuilder.build();
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public Builder callbackExecutor(Executor executor) {
            this.delegateBuilder.callbackExecutor(executor);
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public Builder httpClient(HttpClient httpClient) {
            this.delegateBuilder.httpClient(httpClient);
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public Builder validateEagerly(boolean z) {
            this.delegateBuilder.validateEagerly(z);
            return this;
        }
    }

    public abstract <T> T create(Class<T> cls);

    public abstract IRestClientBuilder newBuilder();
}
