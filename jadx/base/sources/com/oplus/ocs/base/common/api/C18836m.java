package com.oplus.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.internal.ClientSettings;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.m */
/* JADX INFO: loaded from: classes9.dex */
public class C18836m implements OplusApiClient {

    /* JADX INFO: renamed from: a */
    private static final String f57546a = "m";

    /* JADX INFO: renamed from: b */
    private Lock f57547b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    private Api f57548c;

    /* JADX INFO: renamed from: d */
    private Api.Client f57549d;

    public C18836m(Context context, Api api, Api.ApiOptions apiOptions, ClientSettings clientSettings) {
        this.f57548c = api;
        this.f57549d = api.getClientBuilder().buildClient(context, Looper.getMainLooper(), clientSettings, apiOptions);
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public <T> void addQueue(TaskListenerHolder<T> taskListenerHolder) {
        Api.Client client = this.f57549d;
        if (client != null) {
            client.addQueue(taskListenerHolder);
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public void connect() {
        this.f57547b.lock();
        try {
            try {
                Api.Client client = this.f57549d;
                if (client != null) {
                    client.connect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.f57547b.unlock();
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public void disconnect() {
        this.f57547b.lock();
        try {
            try {
                Api.Client client = this.f57549d;
                if (client != null && client.isConnected()) {
                    this.f57549d.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.f57547b.unlock();
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public Api getApi() {
        return this.f57548c;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public AuthResult getAuthResult() {
        Api.Client client = this.f57549d;
        if (client != null) {
            return client.getAuthResult();
        }
        return null;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public Looper getLooper() {
        Api.Client client = this.f57549d;
        if (client != null) {
            return client.getLooper();
        }
        return null;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public IBinder getRemoteService() {
        Api.Client client = this.f57549d;
        if (client != null) {
            return client.getRemoteService();
        }
        return null;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public int getRemoteVersion() {
        Api.Client client = this.f57549d;
        if (client != null) {
            return client.getMinApkVersion();
        }
        return 0;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public boolean isConnected() {
        Api.Client client = this.f57549d;
        if (client != null) {
            return client.isConnected();
        }
        return false;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public boolean isConnecting() {
        Api.Client client = this.f57549d;
        if (client != null) {
            return client.isConnecting();
        }
        return false;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public void setOnCapabilityAuthListener(InterfaceC18832i interfaceC18832i) {
        Api.Client client = this.f57549d;
        if (client != null) {
            client.setOnCapabilityAuthListener(interfaceC18832i);
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public void setOnClearListener(InterfaceC18833j interfaceC18833j) {
        Api.Client client = this.f57549d;
        if (client != null) {
            client.setOnClearListener(interfaceC18833j);
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public void setOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener, Handler handler) {
        Api.Client client = this.f57549d;
        if (client != null) {
            client.setOnConnectionFailedListener(onConnectionFailedListener, handler);
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApiClient
    public void setOnConnectionSucceedListener(OnConnectionSucceedListener onConnectionSucceedListener, Handler handler) {
        Api.Client client = this.f57549d;
        if (client != null) {
            client.setOnConnectionSucceedListener(onConnectionSucceedListener, handler);
        }
    }
}
