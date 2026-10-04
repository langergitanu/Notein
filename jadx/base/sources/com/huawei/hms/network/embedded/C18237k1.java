package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextCompat;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o0O00o.AbstractC25843OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18237k1 extends AbstractC25843OooO00o implements InterfaceC18111b1 {

    /* JADX INFO: renamed from: d */
    public long f55391d;

    /* JADX INFO: renamed from: a */
    public String f55388a = "EventModel";

    /* JADX INFO: renamed from: b */
    public int f55389b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f55390c = true;

    /* JADX INFO: renamed from: e */
    public long f55392e = C18126c2.f54377z;

    /* JADX INFO: renamed from: f */
    public List<String> f55393f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f55394g = false;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!ContextCompat.checkSelfPermission(ContextHolder.getAppContext(), "android.permission.ACCESS_NETWORK_STATE")) {
                Logger.m76958d(C18237k1.this.f55388a, "has no pomission to access network state");
                return;
            }
            C18237k1.this.m78956f();
            C18237k1.this.f55391d = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k1$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C18237k1.this.m78957g()) {
                return;
            }
            C18237k1.this.m78955e();
            C18237k1.this.f55394g = true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k1$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f55397a;

        public c(Context context) {
            this.f55397a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18237k1.this.m78958a(this.f55397a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k1$d */
    public static class d extends Callback {
        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit submit, Throwable th) {
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            response.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m78955e() {
        ContextHolder.getAppContext().unregisterReceiver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m78956f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ContextHolder.getAppContext().registerReceiver(this, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m78957g() {
        return this.f55394g;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: b */
    public void mo77922b() {
        C18396w0.m79812a().m79813a(new a());
    }

    /* JADX INFO: renamed from: c */
    public void m78959c() {
        this.f55393f = NetworkKitInnerImpl.getInstance().getHostsInConnectionPool();
    }

    /* JADX INFO: renamed from: d */
    public void m78960d() {
        for (String str : this.f55393f) {
            if (!TextUtils.isEmpty(str)) {
                Logger.m76958d(this.f55388a, "prefetch domain : " + str);
                C18435z0.m80017b().m80020a(str, 1, new d());
            }
        }
    }

    @Override // o0O00o.AbstractC25843OooO00o
    public void onReceiveMsg(Context context, Intent intent) {
        C18396w0.m79812a().m79814b(new c(context));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77919a() {
        C18396w0.m79812a().m79813a(new b());
    }

    /* JADX INFO: renamed from: a */
    public void m78958a(Context context) {
        int primaryNetworkType = NetworkUtil.getPrimaryNetworkType(context);
        boolean zIsNetworkAvailable = NetworkUtil.isNetworkAvailable(context);
        if (this.f55390c) {
            this.f55389b = primaryNetworkType;
            this.f55390c = false;
            return;
        }
        int i = this.f55389b;
        if (i == primaryNetworkType) {
            return;
        }
        if (i == -1 || i == 0) {
            Logger.m76958d(this.f55388a, "network recovery");
            if (System.currentTimeMillis() - this.f55391d < this.f55392e && zIsNetworkAvailable) {
                m78960d();
            }
        } else {
            m78959c();
            NetworkKit.getInstance().evictAllConnections();
            if (zIsNetworkAvailable) {
                Logger.m76958d(this.f55388a, "network type changed");
                m78960d();
            } else {
                Logger.m76958d(this.f55388a, "network disconnected");
                this.f55391d = System.currentTimeMillis();
            }
        }
        this.f55389b = primaryNetworkType;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77920a(C18153e1 c18153e1) {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77921a(RequestContext requestContext) {
    }
}
