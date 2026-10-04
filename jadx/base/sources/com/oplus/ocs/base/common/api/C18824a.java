package com.oplus.ocs.base.common.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import com.coloros.ocs.base.OooO00o;
import com.coloros.ocs.base.OooO0O0;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.utils.C18861a;
import com.oplus.ocs.base.utils.ServiceCheck;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.a */
/* JADX INFO: loaded from: classes9.dex */
class C18824a implements InterfaceC18828e {

    /* JADX INFO: renamed from: c */
    private OooO0O0 f57486c;

    /* JADX INFO: renamed from: d */
    private Context f57487d;

    /* JADX INFO: renamed from: e */
    private String f57488e;

    /* JADX INFO: renamed from: f */
    private HandlerC18826c f57489f;

    /* JADX INFO: renamed from: g */
    private InterfaceC18834k f57490g;

    /* JADX INFO: renamed from: a */
    private final String f57484a = "a";

    /* JADX INFO: renamed from: b */
    private a f57485b = null;

    /* JADX INFO: renamed from: h */
    private IBinder.DeathRecipient f57491h = new IBinder.DeathRecipient() { // from class: com.oplus.ocs.base.common.api.a.4
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            IBinder iBinderAsBinder;
            C18861a.m80548d(C18824a.this.f57484a, "binderDied()");
            C18824a.m80488g(C18824a.this);
            if (C18824a.this.f57486c == null || (iBinderAsBinder = C18824a.this.f57486c.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) {
                return;
            }
            iBinderAsBinder.unlinkToDeath(C18824a.this.f57491h, 0);
            C18824a.this.f57486c = null;
        }
    };

    /* JADX INFO: renamed from: com.oplus.ocs.base.common.api.a$a */
    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OooO0O0 oooO0O0;
            C18861a.m80545a(C18824a.this.f57484a, "onServiceConnected");
            try {
                C18824a c18824a = C18824a.this;
                int i = OooO0O0.OooO00o.f67229OooO0o0;
                if (iBinder == null) {
                    oooO0O0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coloros.ocs.base.IServiceBroker");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0O0)) {
                        OooO0O0.OooO00o.C19101OooO00o c19101OooO00o = new OooO0O0.OooO00o.C19101OooO00o();
                        c19101OooO00o.f67230OooO0o0 = iBinder;
                        oooO0O0 = c19101OooO00o;
                    } else {
                        oooO0O0 = (OooO0O0) iInterfaceQueryLocalInterface;
                    }
                }
                c18824a.f57486c = oooO0O0;
                C18824a.this.f57486c.asBinder().linkToDeath(C18824a.this.f57491h, 0);
                C18824a.this.f57489f.sendEmptyMessage(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (C18824a.this.f57490g != null) {
                C18824a.this.f57490g.onStateChange(13);
            }
            C18824a.m80488g(C18824a.this);
            C18824a.this.f57486c = null;
        }

        public /* synthetic */ a(C18824a c18824a, byte b) {
            this();
        }
    }

    public C18824a(Context context, String str, HandlerC18826c handlerC18826c, InterfaceC18834k interfaceC18834k) {
        this.f57487d = context;
        this.f57488e = str;
        this.f57489f = handlerC18826c;
        this.f57490g = interfaceC18834k;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ a m80488g(C18824a c18824a) {
        c18824a.f57485b = null;
        return null;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: b */
    public final boolean mo80490b() {
        return false;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: c */
    public final void mo80491c() {
        if (this.f57485b == null || this.f57487d.getApplicationContext() == null) {
            return;
        }
        try {
            this.f57487d.getApplicationContext().unbindService(this.f57485b);
            this.f57486c = null;
        } catch (Exception e) {
            C18861a.m80548d(this.f57484a, "out unbind get an exception " + e.getMessage());
        }
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: d */
    public final void mo80492d() {
        IBinder iBinderAsBinder;
        try {
            OooO0O0 oooO0O0 = this.f57486c;
            if (oooO0O0 == null || (iBinderAsBinder = oooO0O0.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) {
                return;
            }
            this.f57486c.OooO0OO(this.f57488e, new OooO00o.AbstractBinderC19099OooO00o() { // from class: com.oplus.ocs.base.common.api.a.3
                @Override // com.coloros.ocs.base.OooO00o
                public final void onFail(int i) {
                    C18824a.this.m80479a(i);
                }

                @Override // com.coloros.ocs.base.OooO00o
                public final void onSuccess(CapabilityInfo capabilityInfo) {
                    if (capabilityInfo == null) {
                        C18824a.this.m80479a(7);
                    } else {
                        C18824a.m80482a(C18824a.this, capabilityInfo);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            C18861a.m80548d(this.f57484a, "the exception that service broker authenticates is" + e.getMessage());
            m80479a(7);
        }
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: a */
    public final boolean mo80489a() {
        InterfaceC18834k interfaceC18834k = this.f57490g;
        if (interfaceC18834k != null) {
            interfaceC18834k.onStateChange(2);
        }
        if (ServiceCheck.m80542b(this.f57487d)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.oplus.ocs.base.common.api.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    C18824a.m80480a(C18824a.this);
                }
            });
        } else {
            try {
                if (this.f57487d.getApplicationContext() != null) {
                    this.f57485b = new a(this, (byte) 0);
                    Context applicationContext = this.f57487d.getApplicationContext();
                    Intent intent = new Intent("com.coloros.opencapabilityservice");
                    intent.setComponent(new ComponentName("com.coloros.ocs.opencapabilityservice", "com.coloros.ocs.opencapabilityservice.service.ColorOcsService"));
                    boolean zBindService = applicationContext.bindService(intent, this.f57485b, 1);
                    C18861a.m80546b(this.f57484a, "connect state ".concat(String.valueOf(zBindService)));
                    if (!zBindService) {
                        m80479a(3);
                    }
                } else {
                    InterfaceC18834k interfaceC18834k2 = this.f57490g;
                    if (interfaceC18834k2 != null) {
                        interfaceC18834k2.onStateChange(2);
                    }
                    m80479a(1009);
                }
            } catch (Exception e) {
                C18861a.m80548d(this.f57484a, "out bind get an exception " + e.getMessage());
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m80479a(int i) {
        C18861a.m80546b(this.f57484a, "errorCode ".concat(String.valueOf(i)));
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        this.f57489f.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80480a(C18824a c18824a) {
        Context context = c18824a.f57487d;
        new InternalClient(context, context.getPackageName(), c18824a.f57488e, Process.myPid(), true, true, new IAuthenticationListener.Stub() { // from class: com.oplus.ocs.base.common.api.a.2
            @Override // com.oplus.ocs.base.IAuthenticationListener
            public final void onFail(int i) throws RemoteException {
                C18861a.m80547c(C18824a.this.f57484a, "handleAsyncAuthenticate, onFailed errorCode: ".concat(String.valueOf(i)));
                C18824a.this.m80479a(i);
            }

            @Override // com.oplus.ocs.base.IAuthenticationListener
            public final void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
                C18861a.m80546b(C18824a.this.f57484a, "handleAsyncAuthenticate, onSuccess");
                C18824a.m80482a(C18824a.this, capabilityInfo);
            }
        }).connect();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80482a(C18824a c18824a, CapabilityInfo capabilityInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = capabilityInfo;
        c18824a.f57489f.sendMessage(messageObtain);
    }
}
