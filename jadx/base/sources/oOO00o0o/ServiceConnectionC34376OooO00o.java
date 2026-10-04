package oOO00o0o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.hihonor.honorid.core.helper.handler.ErrorStatus;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o0OoOoOo.InterfaceC29215OooO0O0;
import oOO00Ooo.C34365OooO0O0;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: renamed from: oOO00o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ServiceConnectionC34376OooO00o implements ServiceConnection {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static ServiceConnectionC34376OooO00o f123363OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final AtomicInteger f123364Oooo000 = new AtomicInteger();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final ExecutorService f123365Oooo00O = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC29215OooO0O0 f123367OooOo0o;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Context f123372OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final HandlerC20357OooO00o f123373OooOooO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicBoolean f123366OooOo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final LinkedBlockingQueue f123369OooOoO0 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicInteger f123368OooOoO = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public CountDownLatch f123370OooOoOO = null;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f123371OooOoo = 0;

    /* JADX INFO: renamed from: oOO00o0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public class HandlerC20357OooO00o extends Handler {
        public HandlerC20357OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "msg.what: " + message.what);
            int i = message.what;
            if (i == 3001) {
                if (ServiceConnectionC34376OooO00o.this.f123368OooOoO.get() == 2) {
                    ServiceConnectionC34376OooO00o.OooO0O0(ServiceConnectionC34376OooO00o.this);
                    return;
                } else {
                    if (ServiceConnectionC34376OooO00o.this.f123368OooOoO.get() == 0) {
                        ServiceConnectionC34376OooO00o.this.OooO0Oo();
                        return;
                    }
                    return;
                }
            }
            if (i == 3002) {
                ServiceConnectionC34376OooO00o.this.f123368OooOoO.set(2);
                ServiceConnectionC34376OooO00o.OooO0O0(ServiceConnectionC34376OooO00o.this);
                return;
            }
            if (i == 3003) {
                ServiceConnectionC34376OooO00o.this.f123368OooOoO.set(0);
                ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o = ServiceConnectionC34376OooO00o.this;
                synchronized (serviceConnectionC34376OooO00o.f123369OooOoO0) {
                    serviceConnectionC34376OooO00o.f123367OooOo0o = null;
                }
                return;
            }
            if (i == 3004) {
                C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "MSG_FINISH_TASK, unbind");
                ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o2 = ServiceConnectionC34376OooO00o.this;
                serviceConnectionC34376OooO00o2.getClass();
                C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "unbind Service");
                try {
                    serviceConnectionC34376OooO00o2.f123372OooOoo0.unbindService(serviceConnectionC34376OooO00o2);
                } catch (Exception unused) {
                    C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "unbind service error");
                }
                synchronized (serviceConnectionC34376OooO00o2.f123369OooOoO0) {
                    serviceConnectionC34376OooO00o2.f123367OooOo0o = null;
                }
                ServiceConnectionC34376OooO00o.this.f123368OooOoO.set(0);
                return;
            }
            if (i == 3005) {
                C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "MSG_START_SERVICE_FAILED all login return failed");
                ServiceConnectionC34376OooO00o.this.f123368OooOoO.set(0);
                ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o3 = ServiceConnectionC34376OooO00o.this;
                serviceConnectionC34376OooO00o3.getClass();
                C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "onBindServiceFailed");
                synchronized (serviceConnectionC34376OooO00o3.f123369OooOoO0) {
                    while (true) {
                        try {
                            AbstractRunnableC34378OooO0OO abstractRunnableC34378OooO0OO = (AbstractRunnableC34378OooO0OO) serviceConnectionC34376OooO00o3.f123369OooOoO0.poll();
                            if (abstractRunnableC34378OooO0OO != null) {
                                ServiceConnectionC34376OooO00o.f123364Oooo000.decrementAndGet();
                                abstractRunnableC34378OooO0OO.OooO0O0(new ErrorStatus(40, "start APK service ERROR"));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public ServiceConnectionC34376OooO00o(Context context) {
        HandlerThread handlerThread = new HandlerThread("AIDLClientInvokeManager");
        this.f123372OooOoo0 = context.getApplicationContext();
        handlerThread.start();
        this.f123373OooOooO = new HandlerC20357OooO00o(handlerThread.getLooper());
    }

    public static ServiceConnectionC34376OooO00o OooO00o(Context context) {
        ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o;
        if (context == null) {
            return null;
        }
        synchronized (ServiceConnectionC34376OooO00o.class) {
            try {
                if (f123363OooOooo == null) {
                    C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "AIDLClientInvokeManager init");
                    f123363OooOooo = new ServiceConnectionC34376OooO00o(context);
                }
                serviceConnectionC34376OooO00o = f123363OooOooo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnectionC34376OooO00o;
    }

    public static void OooO0O0(ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o) {
        serviceConnectionC34376OooO00o.getClass();
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "doTask");
        synchronized (serviceConnectionC34376OooO00o.f123369OooOoO0) {
            while (true) {
                AbstractRunnableC34378OooO0OO abstractRunnableC34378OooO0OO = (AbstractRunnableC34378OooO0OO) serviceConnectionC34376OooO00o.f123369OooOoO0.poll();
                if (abstractRunnableC34378OooO0OO != null) {
                    try {
                        try {
                            f123365Oooo00O.submit(abstractRunnableC34378OooO0OO);
                        } catch (NullPointerException unused) {
                            C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "Execute submit NullPointerException!");
                        }
                    } catch (RejectedExecutionException unused2) {
                        C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "Execute submit RejectedExecutionException!");
                    } catch (Exception unused3) {
                        C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "Execute submit Exception!");
                    }
                }
            }
        }
    }

    public static void OooO0OO(ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o) {
        serviceConnectionC34376OooO00o.getClass();
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "onServiceConnectedTimeout");
        AtomicBoolean atomicBoolean = serviceConnectionC34376OooO00o.f123366OooOo;
        if (atomicBoolean.get()) {
            return;
        }
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "unbind Service");
        try {
            serviceConnectionC34376OooO00o.f123372OooOoo0.unbindService(serviceConnectionC34376OooO00o);
        } catch (Exception unused) {
            C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "unbind service error");
        }
        synchronized (serviceConnectionC34376OooO00o.f123369OooOoO0) {
            serviceConnectionC34376OooO00o.f123367OooOo0o = null;
        }
        int i = serviceConnectionC34376OooO00o.f123371OooOoo;
        if (i < 3) {
            serviceConnectionC34376OooO00o.f123371OooOoo = i + 1;
            serviceConnectionC34376OooO00o.OooO0Oo();
        } else {
            atomicBoolean.set(true);
            serviceConnectionC34376OooO00o.f123373OooOooO.sendEmptyMessage(AuthApiStatusCodes.AUTH_URL_RESOLUTION);
        }
    }

    public final void OooO0Oo() {
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "startService");
        this.f123368OooOoO.set(1);
        this.f123366OooOo.set(false);
        this.f123370OooOoOO = new CountDownLatch(1);
        new Thread(new RunnableC34377OooO0O0(this)).start();
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "begin to bindService");
        Intent intent = new Intent();
        Context context = this.f123372OooOoo0;
        C34365OooO0O0.OooO00o(context).getClass();
        intent.setAction("com.hihonor.id.HonorInvokeService");
        intent.setPackage("com.hihonor.id");
        try {
            if (context.bindService(intent, this, 1)) {
                return;
            }
            C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "bind service failed");
        } catch (Exception unused) {
            C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "bind service exception");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "onServiceConnected");
        try {
            this.f123371OooOoo = 0;
            this.f123367OooOo0o = InterfaceC29215OooO0O0.OooO00o.OooOo0(iBinder);
            this.f123366OooOo.set(true);
            this.f123373OooOooO.sendEmptyMessage(3002);
            this.f123370OooOoOO.countDown();
        } catch (RuntimeException unused) {
            C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "onServiceConnected RuntimeException!");
        } catch (Exception unused2) {
            C34370OooO0o0.OooO0OO("AIDLClientInvokeManager", "onServiceConnected Exception!");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "onServiceDisconnected");
        this.f123371OooOoo = 0;
        this.f123373OooOooO.sendEmptyMessage(3003);
    }
}
