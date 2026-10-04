package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21545OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f62972OooO00o = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f62973OooO0O0 = new int[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Rect f62974OooO0OO = new Rect();

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final boolean f62975OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Method f62976OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Field f62977OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Field f62978OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final Field f62979OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final Field f62980OooO0o0;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                } catch (ClassNotFoundException unused) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchFieldException unused2) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchMethodException unused3) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                }
            } catch (ClassNotFoundException unused4) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused5) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused6) {
                method = null;
                field = null;
            }
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField("right");
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                    field3 = null;
                }
                try {
                    field4 = cls.getField("bottom");
                    z = true;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                    field4 = null;
                    z = false;
                }
            } catch (ClassNotFoundException unused9) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchFieldException unused10) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchMethodException unused11) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            }
            if (z) {
                f62976OooO0O0 = method;
                f62977OooO0OO = field;
                f62978OooO0Oo = field2;
                f62980OooO0o0 = field3;
                f62979OooO0o = field4;
                f62975OooO00o = true;
                return;
            }
            f62976OooO0O0 = null;
            f62977OooO0OO = null;
            f62978OooO0Oo = null;
            f62980OooO0o0 = null;
            f62979OooO0o = null;
            f62975OooO00o = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooO$OooO0O0 */
    public static class OooO0O0 {
        public static Insets OooO00o(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void OooO00o(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f62972OooO00o);
        } else {
            drawable.setState(f62973OooO0O0);
        }
        drawable.setState(state);
    }

    public static Rect OooO0O0(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsOooO00o = OooO0O0.OooO00o(drawable);
            return new Rect(insetsOooO00o.left, insetsOooO00o.top, insetsOooO00o.right, insetsOooO00o.bottom);
        }
        Drawable drawableUnwrap = DrawableCompat.unwrap(drawable);
        if (i >= 29) {
            boolean z = OooO00o.f62975OooO00o;
        } else if (OooO00o.f62975OooO00o) {
            try {
                Object objInvoke = OooO00o.f62976OooO0O0.invoke(drawableUnwrap, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(OooO00o.f62977OooO0OO.getInt(objInvoke), OooO00o.f62978OooO0Oo.getInt(objInvoke), OooO00o.f62980OooO0o0.getInt(objInvoke), OooO00o.f62979OooO0o.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f62974OooO0OO;
    }

    public static PorterDuff.Mode OooO0OO(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
