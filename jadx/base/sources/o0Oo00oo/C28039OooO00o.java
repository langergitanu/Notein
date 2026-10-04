package o0Oo00oo;

import android.content.res.Configuration;
import android.os.Build;
import androidx.core.app.OooO;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOOO0;
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo00oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28039OooO00o {
    public static final boolean OooO00o(C33163OooO0oO c33163OooO0oO) {
        try {
            Configuration configuration = c33163OooO0oO.getResources().getConfiguration();
            OooOOO0.OooO0o(configuration, "getConfiguration(...)");
            Class<?> cls = configuration.getClass();
            return cls.getField("SEM_DESKTOP_MODE_ENABLED").getInt(cls) == cls.getField("semDesktopModeEnabled").getInt(configuration);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean OooO0O0() {
        return C33595OooOOo.OooOOo(Build.MANUFACTURER, "HONOR", true) && !OooO0OO();
    }

    public static final boolean OooO0OO() {
        String str = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            OooOOO0.OooO0o(declaredMethod, "getDeclaredMethod(...)");
            Object objInvoke = declaredMethod.invoke(cls, "ro.build.version.emui");
            if (objInvoke instanceof String) {
                str = (String) objInvoke;
            }
        } catch (ClassNotFoundException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HONOR");
            c20358OooO00o.OooO0Oo(e, "getBuildVersion ClassNotFoundException", new Object[0]);
        } catch (IllegalAccessException e2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("HONOR");
            c20358OooO00o2.OooO0Oo(e2, "getBuildVersion IllegalAccessException", new Object[0]);
        } catch (NoSuchMethodException e3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("HONOR");
            c20358OooO00o3.OooO0Oo(e3, "getBuildVersion NoSuchMethodException", new Object[0]);
        } catch (InvocationTargetException e4) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("HONOR");
            c20358OooO00o4.OooO0Oo(e4, "getBuildVersion InvocationTargetException", new Object[0]);
        } catch (Exception e5) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("HONOR");
            c20358OooO00o5.OooO0Oo(e5, "getBuildVersion Exception", new Object[0]);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o6.OooO0o0(OooO.OooO0O0(c20358OooO00o6, "HONOR", "getBuildVersion, buildVersion ", str), new Object[0]);
        return (str != null ? C33599OooOo0O.OooOoOO(str, "MagicUI", false) : false) || (str != null ? C33599OooOo0O.OooOoOO(str, "MagicOS", false) : false);
    }

    public static final boolean OooO0Oo() {
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        return C33599OooOo0O.OooOoOO(BRAND, "Xiaomi", true);
    }
}
