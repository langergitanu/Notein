package o00o00Oo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o00o00Oo.InterfaceC25257OooO0O0;
import o00o0O0.C25312OooO0o;
import o00o0O0.C25316OooOO0o;
import o00o0O0.InterfaceC25314OooO0oO;

/* JADX INFO: renamed from: o00o00Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25272OooOOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile C25272OooOOo0 f86010OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f86011OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f86012OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86013OooO0OO;

    /* JADX INFO: renamed from: o00o00Oo.OooOOo0$OooO00o */
    public class OooO00o implements InterfaceC25314OooO0oO<ConnectivityManager> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f86014OooO00o;

        public OooO00o(Context context) {
            this.f86014OooO00o = context;
        }

        @Override // o00o0O0.InterfaceC25314OooO0oO
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f86014OooO00o.getSystemService("connectivity");
        }
    }

    /* JADX INFO: renamed from: o00o00Oo.OooOOo0$OooO0O0 */
    public class OooO0O0 implements InterfaceC25257OooO0O0.OooO00o {
        public OooO0O0() {
        }

        @Override // o00o00Oo.InterfaceC25257OooO0O0.OooO00o
        public final void OooO00o(boolean z) {
            ArrayList arrayList;
            C25316OooOO0o.OooO00o();
            synchronized (C25272OooOOo0.this) {
                arrayList = new ArrayList(C25272OooOOo0.this.f86012OooO0O0);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC25257OooO0O0.OooO00o) it.next()).OooO00o(z);
            }
        }
    }

    /* JADX INFO: renamed from: o00o00Oo.OooOOo0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f86016OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f86017OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C25312OooO0o f86018OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f86019OooO0Oo = new OooO00o();

        /* JADX INFO: renamed from: o00o00Oo.OooOOo0$OooO0OO$OooO00o */
        public class OooO00o extends ConnectivityManager.NetworkCallback {
            public OooO00o() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                C25316OooOO0o.OooO0o().post(new RunnableC25271OooOOo(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                C25316OooOO0o.OooO0o().post(new RunnableC25271OooOOo(this, false));
            }
        }

        public OooO0OO(C25312OooO0o c25312OooO0o, OooO0O0 oooO0O0) {
            this.f86018OooO0OO = c25312OooO0o;
            this.f86017OooO0O0 = oooO0O0;
        }
    }

    public C25272OooOOo0(Context context) {
        this.f86011OooO00o = new OooO0OO(new C25312OooO0o(new OooO00o(context)), new OooO0O0());
    }

    public static C25272OooOOo0 OooO00o(Context context) {
        if (f86010OooO0Oo == null) {
            synchronized (C25272OooOOo0.class) {
                try {
                    if (f86010OooO0Oo == null) {
                        f86010OooO0Oo = new C25272OooOOo0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f86010OooO0Oo;
    }

    public final void OooO0O0() {
        if (this.f86013OooO0OO || this.f86012OooO0O0.isEmpty()) {
            return;
        }
        OooO0OO oooO0OO = this.f86011OooO00o;
        C25312OooO0o c25312OooO0o = oooO0OO.f86018OooO0OO;
        boolean z = false;
        oooO0OO.f86016OooO00o = ((ConnectivityManager) c25312OooO0o.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c25312OooO0o.get()).registerDefaultNetworkCallback(oooO0OO.f86019OooO0Oo);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f86013OooO0OO = z;
    }
}
