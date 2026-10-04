package com.oplus.ocs.base.common.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.miui.penengine.p596e.C18773h;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.utils.C18861a;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.h */
/* JADX INFO: loaded from: classes9.dex */
class C18831h implements InterfaceC18828e {

    /* JADX INFO: renamed from: a */
    private final String f57526a = C18773h.f57233c;

    /* JADX INFO: renamed from: b */
    private Context f57527b;

    /* JADX INFO: renamed from: c */
    private ServiceConnection f57528c;

    /* JADX INFO: renamed from: d */
    private IAuthenticationListener f57529d;

    /* JADX INFO: renamed from: e */
    private InternalClient f57530e;

    /* JADX INFO: renamed from: com.oplus.ocs.base.common.api.h$a */
    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (C18831h.this.f57530e != null) {
                    C18831h.this.f57530e.serviceUnbind();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C18861a.m80546b(C18831h.this.f57526a, "onServiceDisconnected()");
            C18831h.m80505c(C18831h.this);
        }

        public /* synthetic */ a(C18831h c18831h, byte b) {
            this();
        }
    }

    public C18831h(Context context, InternalClient internalClient, IAuthenticationListener iAuthenticationListener) {
        this.f57527b = context;
        this.f57530e = internalClient;
        this.f57529d = iAuthenticationListener;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ServiceConnection m80505c(C18831h c18831h) {
        c18831h.f57528c = null;
        return null;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: d */
    public final void mo80492d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: a */
    public final boolean mo80489a() {
        IAuthenticationListener iAuthenticationListener;
        boolean zBindService = false;
        Object[] objArr = 0;
        try {
        } catch (Exception e) {
            C18861a.m80548d(this.f57526a, "in bind get an exception " + e.getMessage());
        }
        if (this.f57527b.getApplicationContext() == null) {
            IAuthenticationListener iAuthenticationListener2 = this.f57529d;
            if (iAuthenticationListener2 != null) {
                iAuthenticationListener2.onFail(1009);
            }
            return false;
        }
        this.f57528c = new a(this, objArr == true ? 1 : 0);
        Context applicationContext = this.f57527b.getApplicationContext();
        IAuthenticationListener iAuthenticationListener3 = this.f57529d;
        Intent serviceIntent = this.f57530e.getServiceIntent("com.oplus.ocs.openauthenticate", "com.oplus.ocs", "com.oplus.ocs.service.OpenAuthenticateService");
        if (iAuthenticationListener3 != null) {
            Bundle bundle = new Bundle();
            bundle.putBinder("internal_binder", iAuthenticationListener3.asBinder());
            serviceIntent.putExtra("internal_bundle", bundle);
        }
        zBindService = applicationContext.bindService(serviceIntent, this.f57528c, 1);
        C18861a.m80548d(this.f57526a, "connect state - ".concat(String.valueOf(zBindService)));
        if (zBindService || (iAuthenticationListener = this.f57529d) == null) {
            return zBindService;
        }
        try {
            iAuthenticationListener.onFail(3);
        } catch (Exception unused) {
        }
        return zBindService;
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: b */
    public final boolean mo80490b() {
        IAuthenticationListener iAuthenticationListener;
        byte b = 0;
        try {
            if (this.f57527b.getApplicationContext() == null) {
                IAuthenticationListener iAuthenticationListener2 = this.f57529d;
                if (iAuthenticationListener2 != null) {
                    iAuthenticationListener2.onFail(1009);
                }
                return false;
            }
            this.f57528c = new a(this, b);
            boolean zBindService = this.f57527b.getApplicationContext().bindService(this.f57530e.getServiceIntent4Stat("com.oplus.ocs.openauthenticate", "com.oplus.ocs", "com.oplus.ocs.service.OpenAuthenticateService"), this.f57528c, 1);
            C18861a.m80548d(this.f57526a, "connect stat state - ".concat(String.valueOf(zBindService)));
            if (zBindService || (iAuthenticationListener = this.f57529d) == null) {
                return zBindService;
            }
            iAuthenticationListener.onFail(3);
            return zBindService;
        } catch (Exception e) {
            C18861a.m80548d(this.f57526a, "in bind get an exception " + e.getMessage());
            return false;
        }
    }

    @Override // com.oplus.ocs.base.common.api.InterfaceC18828e
    /* JADX INFO: renamed from: c */
    public final void mo80491c() {
        if (this.f57528c == null) {
            C18861a.m80548d(this.f57526a, "mServiceConnectionImpl is null");
            return;
        }
        if (this.f57527b.getApplicationContext() != null) {
            try {
                this.f57527b.getApplicationContext().unbindService(this.f57528c);
            } catch (Exception e) {
                C18861a.m80548d(this.f57526a, "in unbind get an exception " + e.getMessage());
            }
        }
    }
}
