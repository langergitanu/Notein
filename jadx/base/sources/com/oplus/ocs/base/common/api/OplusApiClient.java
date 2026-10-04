package com.oplus.ocs.base.common.api;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.oplus.ocs.base.common.AuthResult;

/* JADX INFO: loaded from: classes9.dex */
public interface OplusApiClient {
    <T> void addQueue(TaskListenerHolder<T> taskListenerHolder);

    void connect();

    void disconnect();

    Api getApi();

    AuthResult getAuthResult();

    Looper getLooper();

    IBinder getRemoteService();

    int getRemoteVersion();

    boolean isConnected();

    boolean isConnecting();

    void setOnCapabilityAuthListener(InterfaceC18832i interfaceC18832i);

    void setOnClearListener(InterfaceC18833j interfaceC18833j);

    void setOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener, Handler handler);

    void setOnConnectionSucceedListener(OnConnectionSucceedListener onConnectionSucceedListener, Handler handler);
}
