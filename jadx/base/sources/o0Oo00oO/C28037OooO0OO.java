package o0Oo00oO;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOOO0;
import o0o00ooo.C30152OooOO0O;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33661OoooooO;
import oO0o0OO.ExecutorC33648OoooOOO;

/* JADX INFO: renamed from: o0Oo00oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28037OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f99397OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f99398OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f99399OooO0OO = 0;

    public static C30152OooOO0O OooO00o(String noteId, String str) {
        OooOOO0.OooO0oO(noteId, "noteId");
        return new C30152OooOO0O(noteId, str);
    }

    public static final AbstractC33630OooOooO OooO0O0(Executor executor) {
        AbstractC33630OooOooO abstractC33630OooOooO;
        ExecutorC33648OoooOOO executorC33648OoooOOO = executor instanceof ExecutorC33648OoooOOO ? (ExecutorC33648OoooOOO) executor : null;
        return (executorC33648OoooOOO == null || (abstractC33630OooOooO = executorC33648OoooOOO.f121327OooOo0o) == null) ? new C33661OoooooO(executor) : abstractC33630OooOooO;
    }

    public static final boolean OooO0OO(Context context) {
        OooOOO0.OooO0oO(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return (networkCapabilities == null || !networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1)) ? false : true;
    }
}
