package OooooOO;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: OooooOO.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21344OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Method f61757OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Method f61758OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f61759OooO0OO;

    public static void OooO00o(Canvas canvas, boolean z) {
        Method method;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C21347Ooooo00.f61760OooO00o.OooO00o(canvas, z);
            return;
        }
        if (!f61759OooO0OO) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f61757OooO00o = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f61758OooO0O0 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f61757OooO00o = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f61758OooO0O0 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f61757OooO00o;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f61758OooO0O0;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f61759OooO0OO = true;
        }
        if (z) {
            try {
                Method method4 = f61757OooO00o;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f61758OooO0O0) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
