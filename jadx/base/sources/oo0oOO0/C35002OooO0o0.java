package oo0oOO0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.net.ConnectivityManagerCompat;
import o00O0O0o.OooOO0O;
import o00O0OOo.C24853OooO0O0;
import o00oOOo.InterfaceC25590OooO00o;

/* JADX INFO: renamed from: oo0oOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C35002OooO0o0 extends AbstractC35000OooO0Oo<C24853OooO0O0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f125697OooO = OooOO0O.OooO0o0("NetworkStateTracker");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConnectivityManager f125698OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f125699OooO0oo;

    /* JADX INFO: renamed from: oo0oOO0.OooO0o0$OooO00o */
    public class OooO00o extends ConnectivityManager.NetworkCallback {
        public OooO00o() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            OooOO0O.OooO0OO().OooO00o(C35002OooO0o0.f125697OooO, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
            C35002OooO0o0 c35002OooO0o0 = C35002OooO0o0.this;
            c35002OooO0o0.OooO0OO(c35002OooO0o0.OooO0o());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            OooOO0O.OooO0OO().OooO00o(C35002OooO0o0.f125697OooO, "Network connection lost", new Throwable[0]);
            C35002OooO0o0 c35002OooO0o0 = C35002OooO0o0.this;
            c35002OooO0o0.OooO0OO(c35002OooO0o0.OooO0o());
        }
    }

    public C35002OooO0o0(Context context, InterfaceC25590OooO00o interfaceC25590OooO00o) {
        super(context, interfaceC25590OooO00o);
        this.f125698OooO0oO = (ConnectivityManager) this.f125690OooO0O0.getSystemService("connectivity");
        this.f125699OooO0oo = new OooO00o();
    }

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final C24853OooO0O0 OooO00o() {
        return OooO0o();
    }

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final void OooO0Oo() {
        String str = f125697OooO;
        try {
            OooOO0O.OooO0OO().OooO00o(str, "Registering network callback", new Throwable[0]);
            this.f125698OooO0oO.registerDefaultNetworkCallback(this.f125699OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            OooOO0O.OooO0OO().OooO0O0(str, "Received exception while registering network callback", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24853OooO0O0 OooO0o() {
        boolean z;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f125698OooO0oO;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            OooOO0O.OooO0OO().OooO0O0(f125697OooO, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            z = networkCapabilities.hasCapability(16);
        }
        boolean zIsActiveNetworkMetered = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        C24853OooO0O0 c24853OooO0O0 = new C24853OooO0O0();
        c24853OooO0O0.f84400OooO00o = z3;
        c24853OooO0O0.f84401OooO0O0 = z;
        c24853OooO0O0.f84402OooO0OO = zIsActiveNetworkMetered;
        c24853OooO0O0.f84403OooO0Oo = z2;
        return c24853OooO0O0;
    }

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final void OooO0o0() {
        String str = f125697OooO;
        try {
            OooOO0O.OooO0OO().OooO00o(str, "Unregistering network callback", new Throwable[0]);
            this.f125698OooO0oO.unregisterNetworkCallback(this.f125699OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            OooOO0O.OooO0OO().OooO0O0(str, "Received exception while unregistering network callback", e);
        }
    }
}
