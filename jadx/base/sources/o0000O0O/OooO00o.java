package o0000O0O;

import OooO0o.C20424OooO0Oo;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    public static int OooO00o(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void OooO0O0(androidx.constraintlayout.widget.OooO00o oooO00o, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + oooO00o.f63969OooO0O0;
        try {
            int iOrdinal = oooO00o.f63970OooO0OO.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (iOrdinal) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((OooO00o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (OooO00o((int) (fArr[3] * 255.0f)) << 24) | (OooO00o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | OooO00o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iOooO00o = (OooO00o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (OooO00o((int) (fArr[3] * 255.0f)) << 24) | (OooO00o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | OooO00o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iOooO00o);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + oooO00o.f63969OooO0O0);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Cannot access method ", str, " on View \"");
            sbOooO0o0.append(o000OO.OooO00o.OooO0OO(view));
            sbOooO0o0.append("\"");
            Log.e("CustomSupport", sbOooO0o0.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0("No method ", str, " on View \"");
            sbOooO0o02.append(o000OO.OooO00o.OooO0OO(view));
            sbOooO0o02.append("\"");
            Log.e("CustomSupport", sbOooO0o02.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbOooO0o03 = C20424OooO0Oo.OooO0o0("Cannot invoke method ", str, " on View \"");
            sbOooO0o03.append(o000OO.OooO00o.OooO0OO(view));
            sbOooO0o03.append("\"");
            Log.e("CustomSupport", sbOooO0o03.toString(), e3);
        }
    }
}
