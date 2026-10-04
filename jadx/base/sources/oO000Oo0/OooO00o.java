package oO000Oo0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import java.util.concurrent.TimeUnit;
import oO0OO0OO.C32908OooO0oO;
import oO0OOo0o.AbstractC33081Oooo;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0OOo0o.AbstractC33099OoooO00;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.OooO0o;
import oO0OOo0o.OooOOO;
import oO0OOo0o.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends OooOo<OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC33081Oooo<?> f114820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f114821OooO0O0;

    /* JADX INFO: renamed from: oO000Oo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20194OooO00o extends AbstractC33093Oooo0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33093Oooo0oo f114822OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f114823OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ConnectivityManager f114824OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f114825OooO0Oo = new Object();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Runnable f114826OooO0o0;

        /* JADX INFO: renamed from: oO000Oo0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC20195OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f114828OooOo0o;

            public RunnableC20195OooO00o(OooO0OO oooO0OO) {
                this.f114828OooOo0o = oooO0OO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20194OooO00o.this.f114824OooO0OO.unregisterNetworkCallback(this.f114828OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo0.OooO00o$OooO00o$OooO0O0 */
        public class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C32072OooO0Oo f114830OooOo0o;

            public OooO0O0(C32072OooO0Oo c32072OooO0Oo) {
                this.f114830OooOo0o = c32072OooO0Oo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20194OooO00o.this.f114823OooO0O0.unregisterReceiver(this.f114830OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo0.OooO00o$OooO00o$OooO0OO */
        public class OooO0OO extends ConnectivityManager.NetworkCallback {
            public OooO0OO() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                C20194OooO00o.this.f114822OooO00o.OooO();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onBlockedStatusChanged(Network network, boolean z) {
                if (z) {
                    return;
                }
                C20194OooO00o.this.f114822OooO00o.OooO();
            }
        }

        /* JADX INFO: renamed from: oO000Oo0.OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        public class C32072OooO0Oo extends BroadcastReceiver {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public boolean f114832OooO00o = false;

            public C32072OooO0Oo() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.f114832OooO00o;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f114832OooO00o = z2;
                if (!z2 || z) {
                    return;
                }
                C20194OooO00o.this.f114822OooO00o.OooO();
            }
        }

        public C20194OooO00o(AbstractC33093Oooo0oo abstractC33093Oooo0oo, Context context) {
            this.f114822OooO00o = abstractC33093Oooo0oo;
            this.f114823OooO0O0 = context;
            if (context == null) {
                this.f114824OooO0OO = null;
                return;
            }
            this.f114824OooO0OO = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                OooOOO();
            } catch (SecurityException e) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
            }
        }

        @Override // oO0OOo0o.AbstractC33093Oooo0oo
        public final void OooO() {
            this.f114822OooO00o.OooO();
        }

        @Override // oO0OOo0o.AbstractC33060OooO0Oo
        public final String OooO00o() {
            return this.f114822OooO00o.OooO00o();
        }

        @Override // oO0OOo0o.AbstractC33060OooO0Oo
        public final <RequestT, ResponseT> OooO0o<RequestT, ResponseT> OooO0oO(C33101OoooOO0<RequestT, ResponseT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
            return this.f114822OooO00o.OooO0oO(c33101OoooOO0, oooO0OO);
        }

        @Override // oO0OOo0o.AbstractC33093Oooo0oo
        public final boolean OooO0oo(long j) throws InterruptedException {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return this.f114822OooO00o.OooO0oo(j);
        }

        @Override // oO0OOo0o.AbstractC33093Oooo0oo
        public final OooOOO OooOO0() {
            return this.f114822OooO00o.OooOO0();
        }

        @Override // oO0OOo0o.AbstractC33093Oooo0oo
        public final void OooOO0O(OooOOO oooOOO, RunnableC22702OooOOo0 runnableC22702OooOOo0) {
            this.f114822OooO00o.OooOO0O(oooOOO, runnableC22702OooOOo0);
        }

        @Override // oO0OOo0o.AbstractC33093Oooo0oo
        public final AbstractC33093Oooo0oo OooOO0o() {
            synchronized (this.f114825OooO0Oo) {
                try {
                    Runnable runnable = this.f114826OooO0o0;
                    if (runnable != null) {
                        runnable.run();
                        this.f114826OooO0o0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f114822OooO00o.OooOO0o();
        }

        public final void OooOOO() {
            ConnectivityManager connectivityManager = this.f114824OooO0OO;
            if (connectivityManager != null) {
                OooO0OO oooO0OO = new OooO0OO();
                connectivityManager.registerDefaultNetworkCallback(oooO0OO);
                this.f114826OooO0o0 = new RunnableC20195OooO00o(oooO0OO);
            } else {
                C32072OooO0Oo c32072OooO0Oo = new C32072OooO0Oo();
                this.f114823OooO0O0.registerReceiver(c32072OooO0Oo, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f114826OooO0o0 = new OooO0O0(c32072OooO0Oo);
            }
        }

        @Override // oO0OOo0o.AbstractC33093Oooo0oo
        public final AbstractC33093Oooo0oo OooOOO0() {
            synchronized (this.f114825OooO0Oo) {
                try {
                    Runnable runnable = this.f114826OooO0o0;
                    if (runnable != null) {
                        runnable.run();
                        this.f114826OooO0o0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f114822OooO00o.OooOOO0();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                ((AbstractC33099OoooO00) C32908OooO0oO.class.asSubclass(AbstractC33099OoooO00.class).getConstructor(new Class[0]).newInstance(new Object[0])).getClass();
            } catch (Exception e) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
            }
        } catch (ClassCastException e2) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
        }
    }

    public OooO00o(AbstractC33081Oooo<?> abstractC33081Oooo) {
        this.f114820OooO00o = (AbstractC33081Oooo) Preconditions.checkNotNull(abstractC33081Oooo, "delegateBuilder");
    }

    @Override // oO0OOo0o.AbstractC33073OooOo0o, oO0OOo0o.AbstractC33081Oooo
    public final AbstractC33093Oooo0oo OooO00o() {
        return new C20194OooO00o(this.f114820OooO00o.OooO00o(), this.f114821OooO0O0);
    }

    @Override // oO0OOo0o.AbstractC33073OooOo0o
    public final AbstractC33081Oooo<?> OooO0o0() {
        return this.f114820OooO00o;
    }
}
