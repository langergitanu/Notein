package com.oplus.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.HandlerC18820a;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.Api.ApiOptions;
import com.oplus.ocs.base.internal.ClientSettings;
import com.oplus.ocs.base.utils.C18861a;
import com.oplus.ocs.base.utils.C18864d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.l */
/* JADX INFO: loaded from: classes9.dex */
class C18835l<O extends Api.ApiOptions> implements Handler.Callback {

    /* JADX INFO: renamed from: c */
    static Map<Api.ClientKey, OplusApiClient> f57532c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private static final String f57533d = "l";

    /* JADX INFO: renamed from: f */
    private static volatile C18835l f57534f;

    /* JADX INFO: renamed from: a */
    Context f57535a;

    /* JADX INFO: renamed from: b */
    HandlerC18820a f57536b;

    /* JADX INFO: renamed from: e */
    private Looper f57537e;

    private C18835l(Context context, Looper looper) {
        if (context.getApplicationContext() != null) {
            this.f57535a = context.getApplicationContext();
        } else {
            this.f57535a = context;
        }
        this.f57537e = looper;
        this.f57536b = new HandlerC18820a(this.f57537e, this);
    }

    /* JADX INFO: renamed from: a */
    public static C18835l m80507a(Context context) {
        if (f57534f == null) {
            synchronized (C18835l.class) {
                try {
                    if (f57534f == null) {
                        HandlerThread handlerThread = new HandlerThread("OplusApiManager", 9);
                        handlerThread.start();
                        if (handlerThread.getLooper() != null) {
                            f57534f = new C18835l(context, handlerThread.getLooper());
                        } else {
                            f57534f = new C18835l(context, Looper.getMainLooper());
                        }
                    }
                } finally {
                }
            }
        }
        return f57534f;
    }

    /* JADX INFO: renamed from: b */
    public static IBinder m80512b(OplusApi oplusApi) {
        OplusApiClient oplusApiClient;
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return null;
        }
        return oplusApiClient.getRemoteService();
    }

    /* JADX INFO: renamed from: c */
    public static int m80513c(OplusApi oplusApi) {
        OplusApiClient oplusApiClient;
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return 0;
        }
        return oplusApiClient.getRemoteVersion();
    }

    /* JADX INFO: renamed from: d */
    public static AuthResult m80514d(OplusApi oplusApi) {
        OplusApiClient oplusApiClient;
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return null;
        }
        return oplusApiClient.getAuthResult();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m80515e(OplusApi oplusApi) {
        OplusApiClient oplusApiClient;
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return false;
        }
        return oplusApiClient.isConnected();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        OplusApiClient oplusApiClient;
        Api api;
        OplusApiClient oplusApiClient2;
        C18861a.m80545a(f57533d, "handle message " + message.what);
        int i = message.what;
        if (i == 0) {
            Api api2 = (Api) message.obj;
            if (api2 == null || api2.getClientKey() == null || (oplusApiClient = f57532c.get(api2.getClientKey())) == null) {
                return false;
            }
            oplusApiClient.connect();
            return false;
        }
        if (i != 1 || (api = (Api) message.obj) == null || api.getClientKey() == null || (oplusApiClient2 = f57532c.get(api.getClientKey())) == null) {
            return false;
        }
        oplusApiClient2.disconnect();
        m80508a(api.getClientKey());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m80516a(Api api) {
        Message messageObtainMessage = this.f57536b.obtainMessage();
        messageObtainMessage.what = 0;
        messageObtainMessage.obj = api;
        this.f57536b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: a */
    public final void m80518a(final OplusApi oplusApi, ClientSettings clientSettings) {
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        C18864d.m80554a(clientSettings, "clientsettings not be null");
        if (f57532c.containsKey(oplusApi.getApi().getClientKey())) {
            return;
        }
        C18836m c18836m = new C18836m(this.f57535a, oplusApi.getApi(), oplusApi.f57471a, clientSettings);
        c18836m.setOnClearListener(new InterfaceC18833j() { // from class: com.oplus.ocs.base.common.api.l.1
            @Override // com.oplus.ocs.base.common.api.InterfaceC18833j
            /* JADX INFO: renamed from: a */
            public final void mo80506a() {
                C18835l.m80508a(oplusApi.getApi().getClientKey());
            }
        });
        c18836m.setOnCapabilityAuthListener(new InterfaceC18832i() { // from class: com.oplus.ocs.base.common.api.l.2
            @Override // com.oplus.ocs.base.common.api.InterfaceC18832i
            /* JADX INFO: renamed from: a */
            public final void mo80476a(CapabilityInfo capabilityInfo) {
                if (capabilityInfo != null) {
                    oplusApi.checkAuthResult(capabilityInfo);
                }
            }
        });
        f57532c.put(oplusApi.getApi().getClientKey(), c18836m);
        m80516a(oplusApi.getApi());
    }

    /* JADX INFO: renamed from: a */
    public static void m80509a(OplusApi oplusApi) {
        CapabilityInfo capabilityInfo = CapabilityApiClient.getCapabilityInfo(oplusApi.getApi());
        if (capabilityInfo != null) {
            oplusApi.checkAuthResult(capabilityInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80517a(OplusApi oplusApi, final OnConnectionSucceedListener onConnectionSucceedListener, Handler handler) {
        OplusApiClient oplusApiClient;
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return;
        }
        if (oplusApi.isConnected()) {
            new Handler(handler == null ? Looper.getMainLooper() : handler.getLooper()) { // from class: com.oplus.ocs.base.common.api.l.4
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    OnConnectionSucceedListener onConnectionSucceedListener2 = onConnectionSucceedListener;
                    if (onConnectionSucceedListener2 != null) {
                        onConnectionSucceedListener2.onConnectionSucceed();
                    }
                }
            }.sendEmptyMessage(0);
        } else {
            oplusApiClient.setOnConnectionSucceedListener(onConnectionSucceedListener, handler);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m80510a(OplusApi oplusApi, OnConnectionFailedListener onConnectionFailedListener, Handler handler) {
        OplusApiClient oplusApiClient;
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return;
        }
        oplusApiClient.setOnConnectionFailedListener(onConnectionFailedListener, handler);
    }

    /* JADX INFO: renamed from: a */
    public static <T> void m80511a(OplusApi oplusApi, TaskListenerHolder<T> taskListenerHolder) {
        OplusApiClient oplusApiClient;
        C18861a.m80545a(f57533d, "addQueue ".concat(oplusApi.getClass().getSimpleName()));
        C18864d.m80554a(oplusApi, "oplusApi not be null");
        if (!f57532c.containsKey(oplusApi.getApi().getClientKey()) || (oplusApiClient = f57532c.get(oplusApi.getApi().getClientKey())) == null) {
            return;
        }
        oplusApiClient.addQueue(taskListenerHolder);
    }

    /* JADX INFO: renamed from: a */
    public static void m80508a(Api.ClientKey clientKey) {
        f57532c.remove(clientKey);
    }
}
