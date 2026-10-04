package oO0o0OOO;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;

/* JADX INFO: renamed from: oO0o0OOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33688OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f121431OooO00o = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objOooO00o;
        try {
            objOooO00o = new C33685OooO0o(OooO00o(Looper.getMainLooper()));
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = null;
        }
    }

    public static final Handler OooO00o(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
