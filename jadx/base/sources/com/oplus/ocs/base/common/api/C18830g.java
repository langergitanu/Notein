package com.oplus.ocs.base.common.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.IServiceBroker;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.utils.C18861a;
import com.oplus.ocs.base.utils.ServiceCheck;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.g */
/* JADX INFO: loaded from: classes9.dex */
final class C18830g implements InterfaceC18828e {

    /* JADX INFO: renamed from: c */
    IServiceBroker f57515c;

    /* JADX INFO: renamed from: d */
    Context f57516d;

    /* JADX INFO: renamed from: e */
    String f57517e;

    /* JADX INFO: renamed from: f */
    HandlerC18826c f57518f;

    /* JADX INFO: renamed from: g */
    InterfaceC18834k f57519g;

    /* JADX INFO: renamed from: a */
    final String f57513a = "a";

    /* JADX INFO: renamed from: b */
    a f57514b = null;

    /* JADX INFO: renamed from: h */
    IBinder.DeathRecipient f57520h = new IBinder.DeathRecipient() { // from class: com.oplus.ocs.base.common.api.g.4
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            IBinder iBinderAsBinder;
            C18861a.m80548d(C18830g.this.f57513a, "binderDied()");
            C18830g c18830g = C18830g.this;
            c18830g.f57514b = null;
            IServiceBroker iServiceBroker = c18830g.f57515c;
            if (iServiceBroker == null || (iBinderAsBinder = iServiceBroker.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) {
                return;
            }
            iBinderAsBinder.unlinkToDeath(C18830g.this.f57520h, 0);
            C18830g.this.f57515c = null;
        }
    };

    /* JADX INFO: renamed from: com.oplus.ocs.base.common.api.g$a */
    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C18861a.m80545a(C18830g.this.f57513a, "new ocs onServiceConnected");
            try {
                C18830g.this.f57515c = IServiceBroker.Stub.asInterface(iBinder);
                C18830g.this.f57515c.asBinder().linkToDeath(C18830g.this.f57520h, 0);
                C18830g.this.f57518f.sendEmptyMessage(3);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            InterfaceC18834k interfaceC18834k = C18830g.this.f57519g;
            if (interfaceC18834k != null) {
                interfaceC18834k.onStateChange(13);
            }
            C18830g c18830g = C18830g.this;
            c18830g.f57514b = null;
            c18830g.f57515c = null;
        }

        public /* synthetic */ a(C18830g c18830g, byte b) {
            this();
        }
    }

    public C18830g(Context context, String str, HandlerC18826c handlerC18826c, InterfaceC18834k interfaceC18834k) {
        this.f57516d = context;
        this.f57517e = str;
        this.f57518f = handlerC18826c;
        this.f57519g = interfaceC18834k;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: a */
    public final boolean mo80489a() {
        InterfaceC18834k interfaceC18834k = this.f57519g;
        if (interfaceC18834k != null) {
            interfaceC18834k.onStateChange(2);
        }
        if (ServiceCheck.m80542b(this.f57516d)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.oplus.ocs.base.common.api.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    final C18830g c18830g = C18830g.this;
                    Context context = c18830g.f57516d;
                    new InternalClient(context, context.getPackageName(), c18830g.f57517e, Process.myPid(), true, true, new IAuthenticationListener.Stub() { // from class: com.oplus.ocs.base.common.api.g.2
                        @Override // com.oplus.ocs.base.IAuthenticationListener
                        public final void onFail(int i) throws RemoteException {
                            C18861a.m80547c(C18830g.this.f57513a, "handleAsyncAuthenticate, onFailed errorCode: ".concat(String.valueOf(i)));
                            C18830g.this.m80502a(i);
                        }

                        @Override // com.oplus.ocs.base.IAuthenticationListener
                        public final void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
                            C18861a.m80546b(C18830g.this.f57513a, "handleAsyncAuthenticate, onSuccess");
                            C18830g.m80501a(C18830g.this, capabilityInfo);
                        }
                    }).connect();
                }
            });
        } else {
            try {
                if (this.f57516d.getApplicationContext() != null) {
                    this.f57514b = new a(this, (byte) 0);
                    Context applicationContext = this.f57516d.getApplicationContext();
                    Intent intent = new Intent("com.oplus.ocs.openauthenticate");
                    intent.setComponent(new ComponentName("com.oplus.ocs", "com.oplus.ocs.service.OpenAuthenticateService"));
                    boolean zBindService = applicationContext.bindService(intent, this.f57514b, 1);
                    C18861a.m80546b(this.f57513a, "connect state ".concat(String.valueOf(zBindService)));
                    if (!zBindService) {
                        m80502a(3);
                    }
                } else {
                    InterfaceC18834k interfaceC18834k2 = this.f57519g;
                    if (interfaceC18834k2 != null) {
                        interfaceC18834k2.onStateChange(2);
                    }
                    m80502a(1009);
                }
            } catch (Exception e) {
                C18861a.m80548d(this.f57513a, "out bind get an exception " + e.getMessage());
            }
        }
        return true;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: b */
    public final boolean mo80490b() {
        return false;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: c */
    public final void mo80491c() {
        if (this.f57514b == null || this.f57516d.getApplicationContext() == null) {
            return;
        }
        try {
            this.f57516d.getApplicationContext().unbindService(this.f57514b);
            this.f57515c = null;
        } catch (Exception e) {
            C18861a.m80548d(this.f57513a, "out unbind get an exception " + e.getMessage());
        }
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: d */
    public final void mo80492d() {
        IBinder iBinderAsBinder;
        try {
            IServiceBroker iServiceBroker = this.f57515c;
            if (iServiceBroker == null || (iBinderAsBinder = iServiceBroker.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) {
                return;
            }
            this.f57515c.handleAuthentication(this.f57517e, "1.0.11", new IAuthenticationListener.Stub() { // from class: com.oplus.ocs.base.common.api.g.3
                @Override // com.oplus.ocs.base.IAuthenticationListener
                public final void onFail(int i) {
                    C18830g.this.m80502a(i);
                }

                @Override // com.oplus.ocs.base.IAuthenticationListener
                public final void onSuccess(CapabilityInfo capabilityInfo) {
                    C18830g.m80501a(C18830g.this, capabilityInfo);
                }
            });
        } catch (Exception e) {
            C18861a.m80548d(this.f57513a, "the exception that service broker authenticates is" + e.getMessage());
            m80502a(7);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80502a(int i) {
        C18861a.m80546b(this.f57513a, "errorCode ".concat(String.valueOf(i)));
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        this.f57518f.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80501a(C18830g c18830g, CapabilityInfo capabilityInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = capabilityInfo;
        c18830g.f57518f.sendMessage(messageObtain);
    }
}
