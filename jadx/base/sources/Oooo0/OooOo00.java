package Oooo0;

import Oooo0O0.C20935Oooo00o;
import Oooo0oO.C21035OooOOo;
import Oooo0oO.InterfaceC21033OooOOOO;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import o000oOoO.C24633OooO00o;
import o00Oo0oO.C25050OooO0O0;
import o00o0o.AbstractC25434OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33962Oooo;
import oO0oO00.C33973OoooO00;
import oOo000Oo.C34434OooOoO;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34474OooOoo0;
import ooOOoOO0.C35133OooOoOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements InterfaceC25586OooO0O0 {
    public static String OooO(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith("result={") && strArrSplit[i].endsWith("}")) {
                String str2 = strArrSplit[i];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split("&");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArrSplit2.length) {
                        break;
                    }
                    if (strArrSplit2[i2].startsWith("trade_token=\"") && strArrSplit2[i2].endsWith("\"")) {
                        strSubstring = androidx.core.content.OooO0OO.OooO00o(1, 13, strArrSplit2[i2]);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith("trade_token=")) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                    i2++;
                }
            }
        }
        return strSubstring;
    }

    public static final void OooO0oO(C20935Oooo00o c20935Oooo00o, C24633OooO00o c24633OooO00o, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) throws Throwable {
        int i2;
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(-1985516685);
        if ((i & 112) == 0) {
            i2 = (c21035OooOOoOooOOO0.OooOo0o(c24633OooO00o) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && c21035OooOOoOooOOO0.OooO00o()) {
            c21035OooOOoOooOOO0.OooO0o();
        } else {
            c24633OooO00o.invoke(c21035OooOOoOooOOO0, Integer.valueOf((i2 >> 3) & 14));
        }
        Oooo0oO.o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new C20822OooOOoo(c20935Oooo00o, c24633OooO00o, i);
    }

    public static final C33962Oooo OooO0oo(String str, InterfaceC33911OooO0OO interfaceC33911OooO0OO) {
        return new C33962Oooo(str, new C33973OoooO00(interfaceC33911OooO0OO));
    }

    public static final void OooOO0(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List OooOO0O(ArrayList arrayList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (size == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(oOo000Oo.OooOo.Oooo0oO(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static int OooOO0o(Context context) {
        if (OooOOO0(context) != 0) {
            String MANUFACTURER = Build.MANUFACTURER;
            kotlin.jvm.internal.OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
            if ((!C33599OooOo0O.OooOoOO(MANUFACTURER, "HUAWEI", false) || Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0) && ((TextUtils.isEmpty(C25050OooO0O0.OooO0o0("ro.miui.ui.version.name")) || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) == 0) && ((!C33599OooOo0O.OooOoOO(MANUFACTURER, "VIVO", false) && !C33599OooOo0O.OooOoOO(MANUFACTURER, "vivo", false)) || Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) == 0))) {
                Object systemService = context.getSystemService("window");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
                }
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                int i2 = displayMetrics.widthPixels;
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics2);
                int i3 = displayMetrics2.heightPixels;
                int i4 = displayMetrics2.widthPixels;
                if (OooOOO0(context) + i3 <= i && (i2 - i4 > 0 || i - i3 > 0)) {
                    return OooOOO0(context);
                }
            }
        }
        return 0;
    }

    public static final Object OooOOO(AbstractC34457OooO0OO abstractC34457OooO0OO, String discriminator, C34474OooOoo0 c34474OooOoo0, InterfaceC33910OooO0O0 interfaceC33910OooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34457OooO0OO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(discriminator, "discriminator");
        return new C35133OooOoOO(abstractC34457OooO0OO, c34474OooOoo0, discriminator, interfaceC33910OooO0O0.getDescriptor()).OooOooo(interfaceC33910OooO0O0);
    }

    public static int OooOOO0(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", TelemetryEventStrings.C18741Os.OS_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public AbstractC25434OooO00o OooO00o() {
        return null;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public AbstractC25434OooO00o OooO0O0() {
        return null;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public void OooO0OO(int i, AbstractC25434OooO00o bitmapReference) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmapReference, "bitmapReference");
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public boolean OooO0Oo(int i) {
        return false;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public AbstractC25434OooO00o OooO0o(int i) {
        return null;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public void OooO0o0(int i, AbstractC25434OooO00o bitmapReference) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmapReference, "bitmapReference");
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public void clear() {
    }
}
