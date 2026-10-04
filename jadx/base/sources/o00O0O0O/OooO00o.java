package o00O0O0O;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84223OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84224OooO0O0 = 0;

    public static boolean OooO00o(Method method, InterfaceC34595OooO0Oo clazz) {
        OooOOO0.OooO0oO(clazz, "clazz");
        return method.getReturnType().equals(C24217OooO0O0.OooO0Oo(clazz));
    }

    public static final boolean OooO0O0(String str, oO0O000o.OooO00o oooO00o) {
        try {
            boolean zBooleanValue = ((Boolean) oooO00o.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }
}
