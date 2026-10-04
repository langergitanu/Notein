package com.huawei.agconnect.https;

import android.content.Context;
import com.huawei.agconnect.https.Service;
import com.huawei.agconnect.https.connector.C17662a;
import com.huawei.agconnect.https.connector.HttpsPlatform;
import java.util.concurrent.Executor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public class HttpsKit {
    private OkHttpClient client;
    private Executor executor;

    public static final class Builder {
        OkHttpClient client;
        Executor executor;

        public HttpsKit build() {
            if (this.client == null) {
                this.client = new OkHttpClient();
            }
            if (this.executor == null) {
                this.executor = InterfaceC17664e.f52255a.mo75648a();
            }
            return new HttpsKit(this.client, this.executor);
        }

        public Builder client(OkHttpClient okHttpClient) {
            this.client = okHttpClient;
            return this;
        }

        public Builder executor(Executor executor) {
            this.executor = executor;
            return this;
        }
    }

    private HttpsKit(OkHttpClient okHttpClient, Executor executor) {
        this.client = okHttpClient;
        this.executor = executor;
    }

    public OkHttpClient client() {
        return this.client;
    }

    public Service create(Context context) {
        HttpsPlatform.getInstance().init(C17662a.m75645a(context));
        return Service.Factory.get(this);
    }

    public Executor executor() {
        return this.executor;
    }
}
