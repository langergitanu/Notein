package com.oplus.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.ConnectionResult;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.utils.C18861a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseClient<T extends IBinder> implements Api.Client, InterfaceC18834k {

    /* JADX INFO: renamed from: a */
    static final String f57452a = "BaseClient";

    /* JADX INFO: renamed from: c */
    CapabilityInfo f57454c;

    /* JADX INFO: renamed from: e */
    InterfaceC18833j f57456e;

    /* JADX INFO: renamed from: f */
    InterfaceC18832i f57457f;

    /* JADX INFO: renamed from: h */
    InterfaceC18828e f57459h;

    /* JADX INFO: renamed from: i */
    private Context f57460i;

    /* JADX INFO: renamed from: j */
    private Looper f57461j;

    /* JADX INFO: renamed from: k */
    private HandlerC18826c f57462k;

    /* JADX INFO: renamed from: b */
    volatile int f57453b = 4;

    /* JADX INFO: renamed from: d */
    Queue<TaskListenerHolder> f57455d = new LinkedList();

    /* JADX INFO: renamed from: g */
    HandlerC18827d f57458g = null;

    public BaseClient(Context context, Looper looper) {
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        this.f57460i = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        this.f57461j = looper;
        this.f57462k = HandlerC18826c.m80496a(this);
        C18825b.m80493a();
        this.f57459h = C18825b.m80495a(this.f57460i, getClientName(), this.f57462k, this);
    }

    /* JADX INFO: renamed from: a */
    private void m80470a() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static CapabilityInfo m80472b(int i) {
        return new CapabilityInfo(new ArrayList(), 1, new AuthResult("", 0, 0, i, new byte[0]));
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public <T> void addQueue(TaskListenerHolder<T> taskListenerHolder) {
        if (isConnected()) {
            m80475a(taskListenerHolder);
        } else if (this.f57453b == 13) {
            m80471a(taskListenerHolder, true);
        } else {
            m80471a(taskListenerHolder, false);
        }
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public void connect() {
        InterfaceC18828e interfaceC18828e = this.f57459h;
        if (interfaceC18828e != null) {
            interfaceC18828e.mo80489a();
            return;
        }
        this.f57454c = m80472b(3);
        m80473a(3);
        InterfaceC18833j interfaceC18833j = this.f57456e;
        if (interfaceC18833j != null) {
            interfaceC18833j.mo80506a();
        }
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public void disconnect() {
        this.f57459h.mo80491c();
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public AuthResult getAuthResult() {
        return this.f57454c.getAuthResult();
    }

    public abstract String getClientName();

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public Looper getLooper() {
        return this.f57461j;
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public int getMinApkVersion() {
        m80470a();
        return this.f57454c.getVersion();
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public T getRemoteService() {
        m80470a();
        return (T) this.f57454c.getBinder();
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public boolean isConnected() {
        return this.f57453b == 1;
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public boolean isConnecting() {
        return this.f57453b == 2;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18834k
    public void onStateChange(int i) {
        this.f57453b = i;
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public void setOnCapabilityAuthListener(InterfaceC18832i interfaceC18832i) {
        this.f57457f = interfaceC18832i;
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public void setOnClearListener(InterfaceC18833j interfaceC18833j) {
        this.f57456e = interfaceC18833j;
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public void setOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener, Handler handler) {
        CapabilityInfo capabilityInfo = this.f57454c;
        if (capabilityInfo == null || capabilityInfo.getAuthResult() == null || this.f57454c.getAuthResult().getErrrorCode() == 1001) {
            m80474a(handler);
            this.f57458g.f57502b = onConnectionFailedListener;
        } else if (onConnectionFailedListener != null) {
            onConnectionFailedListener.onConnectionFailed(new ConnectionResult(this.f57454c.getAuthResult().getErrrorCode()));
        }
    }

    @Override // com.oplus.ocs.base.common.api.Api.Client
    public void setOnConnectionSucceedListener(final OnConnectionSucceedListener onConnectionSucceedListener, Handler handler) {
        CapabilityInfo capabilityInfo = this.f57454c;
        if (capabilityInfo == null || capabilityInfo.getAuthResult() == null || this.f57454c.getAuthResult().getErrrorCode() != 1001) {
            m80474a(handler);
            this.f57458g.f57501a = onConnectionSucceedListener;
        } else if (onConnectionSucceedListener != null) {
            if (handler == null) {
                onConnectionSucceedListener.onConnectionSucceed();
            } else {
                handler.post(new Runnable() { // from class: com.oplus.ocs.base.common.api.BaseClient.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConnectionSucceedListener.onConnectionSucceed();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80474a(Handler handler) {
        HandlerC18827d handlerC18827d = this.f57458g;
        if (handlerC18827d == null) {
            if (handler == null) {
                this.f57458g = new HandlerC18827d(this.f57461j, this.f57462k);
                return;
            } else {
                this.f57458g = new HandlerC18827d(handler.getLooper(), this.f57462k);
                return;
            }
        }
        if (handler == null || handlerC18827d.getLooper() == handler.getLooper()) {
            return;
        }
        C18861a.m80545a(f57452a, "the new handler looper is not the same as the old one.");
    }

    /* JADX INFO: renamed from: a */
    private void m80471a(TaskListenerHolder taskListenerHolder, boolean z) {
        this.f57455d.add(taskListenerHolder);
        if (z) {
            connect();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80475a(TaskListenerHolder taskListenerHolder) {
        CapabilityInfo capabilityInfo = this.f57454c;
        if (capabilityInfo == null || capabilityInfo.getAuthResult() == null) {
            return;
        }
        if (this.f57454c.getAuthResult().getErrrorCode() == 1001) {
            taskListenerHolder.setErrorCode(0);
        } else {
            taskListenerHolder.setErrorCode(this.f57454c.getAuthResult().getErrrorCode());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80473a(int i) {
        C18861a.m80545a(f57452a, "handleAuthenticateFailure");
        if (this.f57458g == null) {
            m80474a((Handler) null);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        messageObtain.arg1 = i;
        this.f57458g.sendMessage(messageObtain);
    }
}
