package o000oooo;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o000oooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24765OooO0Oo implements oO0O000o.OooO00o {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Class<?> returnType;
        try {
            Method method = (Method) C24767OooO0o0.f83973OooOoO0.getValue();
            if (method == null || (returnType = method.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
