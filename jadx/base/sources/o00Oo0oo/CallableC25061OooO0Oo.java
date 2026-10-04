package o00Oo0oo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o00Oo0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC25061OooO0Oo implements Callable<NetworkInfo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f85087OooOo0o;

    public CallableC25061OooO0Oo(Context context) {
        this.f85087OooOo0o = context;
    }

    @Override // java.util.concurrent.Callable
    public final NetworkInfo call() throws Exception {
        return ((ConnectivityManager) this.f85087OooOo0o.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
    }
}
