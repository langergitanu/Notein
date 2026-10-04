package androidx.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.transition.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22113OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f66403OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Field f66404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f66405OooO0OO;

    /* JADX INFO: renamed from: androidx.transition.OooOooO$OooO00o */
    public static class OooO00o {
        public static float OooO00o(View view) {
            return view.getTransitionAlpha();
        }

        public static void OooO0O0(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    public float OooO00o(View view) {
        if (f66403OooO00o) {
            try {
                return OooO00o.OooO00o(view);
            } catch (NoSuchMethodError unused) {
                f66403OooO00o = false;
            }
        }
        return view.getAlpha();
    }

    public void OooO0O0(View view, float f) {
        if (f66403OooO00o) {
            try {
                OooO00o.OooO0O0(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f66403OooO00o = false;
            }
        }
        view.setAlpha(f);
    }

    public void OooO0OO(View view, int i) {
        if (!f66405OooO0OO) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f66404OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f66405OooO0OO = true;
        }
        Field field = f66404OooO0O0;
        if (field != null) {
            try {
                f66404OooO0O0.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
