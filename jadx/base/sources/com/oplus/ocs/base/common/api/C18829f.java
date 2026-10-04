package com.oplus.ocs.base.common.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.coloros.ocs.base.OooO00o;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.utils.C18861a;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.f */
/* JADX INFO: loaded from: classes9.dex */
class C18829f implements InterfaceC18828e {

    /* JADX INFO: renamed from: b */
    private Context f57506b;

    /* JADX INFO: renamed from: c */
    private ServiceConnection f57507c;

    /* JADX INFO: renamed from: d */
    private IAuthenticationListener f57508d;

    /* JADX INFO: renamed from: e */
    private InternalClient f57509e;

    /* JADX INFO: renamed from: a */
    private final String f57505a = "f";

    /* JADX INFO: renamed from: f */
    private OooO00o f57510f = new OooO00o.AbstractBinderC19099OooO00o() { // from class: com.oplus.ocs.base.common.api.f.1
        @Override // com.coloros.ocs.base.OooO00o
        public final void onFail(int i) throws RemoteException {
            if (C18829f.this.f57508d != null) {
                C18829f.this.f57508d.onFail(i);
            }
        }

        @Override // com.coloros.ocs.base.OooO00o
        public final void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
            if (C18829f.this.f57508d != null) {
                if (capabilityInfo == null) {
                    C18829f.this.f57508d.onFail(7);
                } else {
                    C18829f.this.f57508d.onSuccess(capabilityInfo);
                }
            }
        }
    };

    /* JADX INFO: renamed from: com.oplus.ocs.base.common.api.f$a */
    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (C18829f.this.f57509e != null) {
                    C18829f.this.f57509e.serviceUnbind();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C18861a.m80546b(C18829f.this.f57505a, "onServiceDisconnected()");
            C18829f.m80500d(C18829f.this);
        }

        public /* synthetic */ a(C18829f c18829f, byte b) {
            this();
        }
    }

    public C18829f(Context context, InternalClient internalClient, IAuthenticationListener iAuthenticationListener) {
        this.f57506b = context;
        this.f57509e = internalClient;
        this.f57508d = iAuthenticationListener;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: d */
    public final void mo80492d() {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ServiceConnection m80500d(C18829f c18829f) {
        c18829f.f57507c = null;
        return null;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: a */
    public final boolean mo80489a() {
        IAuthenticationListener iAuthenticationListener;
        byte b = 0;
        try {
            if (this.f57506b.getApplicationContext() == null) {
                IAuthenticationListener iAuthenticationListener2 = this.f57508d;
                if (iAuthenticationListener2 != null) {
                    iAuthenticationListener2.onFail(1009);
                }
                return false;
            }
            this.f57507c = new a(this, b);
            Context applicationContext = this.f57506b.getApplicationContext();
            OooO00o oooO00o = this.f57510f;
            Intent serviceIntent = this.f57509e.getServiceIntent("com.coloros.opencapabilityservice", "com.coloros.ocs.opencapabilityservice", "com.coloros.ocs.opencapabilityservice.service.ColorOcsService");
            if (oooO00o != null) {
                Bundle bundle = new Bundle();
                bundle.putBinder("internal_binder", oooO00o.asBinder());
                serviceIntent.putExtra("internal_bundle", bundle);
            }
            boolean zBindService = applicationContext.bindService(serviceIntent, this.f57507c, 1);
            C18861a.m80548d(this.f57505a, "connect state - ".concat(String.valueOf(zBindService)));
            if (!zBindService && (iAuthenticationListener = this.f57508d) != null) {
                iAuthenticationListener.onFail(3);
            }
            return zBindService;
        } catch (Exception e) {
            C18861a.m80548d(this.f57505a, "in bind get an exception " + e.getMessage());
            return false;
        }
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: b */
    public final boolean mo80490b() {
        IAuthenticationListener iAuthenticationListener;
        byte b = 0;
        try {
            if (this.f57506b.getApplicationContext() == null) {
                IAuthenticationListener iAuthenticationListener2 = this.f57508d;
                if (iAuthenticationListener2 != null) {
                    iAuthenticationListener2.onFail(1009);
                }
                return false;
            }
            this.f57507c = new a(this, b);
            boolean zBindService = this.f57506b.getApplicationContext().bindService(this.f57509e.getServiceIntent4Stat("com.coloros.opencapabilityservice", "com.coloros.ocs.opencapabilityservice", "com.coloros.ocs.opencapabilityservice.service.ColorOcsService"), this.f57507c, 1);
            C18861a.m80548d(this.f57505a, "connect stat state - ".concat(String.valueOf(zBindService)));
            if (zBindService || (iAuthenticationListener = this.f57508d) == null) {
                return zBindService;
            }
            iAuthenticationListener.onFail(3);
            return zBindService;
        } catch (Exception e) {
            C18861a.m80548d(this.f57505a, "in bind get an exception " + e.getMessage());
            return false;
        }
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: c */
    public final void mo80491c() {
        if (this.f57507c == null) {
            C18861a.m80548d(this.f57505a, "mServiceConnectionImpl is null");
            return;
        }
        if (this.f57506b.getApplicationContext() != null) {
            try {
                this.f57506b.getApplicationContext().unbindService(this.f57507c);
            } catch (Exception e) {
                C18861a.m80548d(this.f57505a, "in unbind get an exception " + e.getMessage());
            }
        }
    }
}
