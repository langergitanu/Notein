package o000OoOO;

import OooOOO0.AbstractC20449OooO0Oo;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21362o00oO0o;
import Oooooo0.C21403OooO0oO;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.android.billingclient.api.C22189OoooO0;
import kotlin.jvm.internal.OooOOO0;
import o000000o.AbstractC24088OooO0oO;
import o000000o.C24091OooOOOo;
import o000000o.C24093OooOOo0;
import o000000o.OooOOOO;
import o00000O0.C24108OooO0Oo;
import o00000O0.C24109OooO0o0;
import o00000o0.C24113OooO00o;
import o00000o0.C24116OooO0Oo;
import o00000o0.C24117OooO0o0;
import o00000o0.C24119OooO0oo;
import o00000o0.C24120OooOO0o;
import o00000o0.OooO;
import o00000o0.OooOO0;
import o00000o0.OooOO0O;
import o00000o0.OooOOO;
import o0000Ooo.EnumC24238OooOOO;
import o00o00Oo.InterfaceC25263OooO0oo;
import oO00ooO.C32442OooOO0o;
import oo0o0Oo.C34678OooO;
import oo0o0Oo.C34686OooO0oo;
import oo0o0Oo.C34690OooOOO;
import oo0o0Oo.C34691OooOOO0;
import oo0o0Oo.C34692OooOOOO;
import oo0o0Oo.C34698OooOo00;

/* JADX INFO: renamed from: o000OoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24539OooO0OO implements InterfaceC25263OooO0oo {
    public static boolean OooO0O0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Boolean bool = (Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, str, Boolean.FALSE);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] OooO0OO(int i) {
        return i == 126 ? new byte[]{126} : new byte[]{(byte) 95, (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static int OooO0Oo(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Integer num = (Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, 0);
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static final C34698OooOo00 OooO0o0(C34698OooOo00 style, EnumC24238OooOOO direction) {
        int i;
        OooOOO0.OooO0oO(style, "style");
        OooOOO0.OooO0oO(direction, "direction");
        int i2 = C34692OooOOOO.f124961OooO0o0;
        C34691OooOOO0 style2 = style.f124982OooO00o;
        OooOOO0.OooO0oO(style2, "style");
        OooOO0O oooOO0OOooO0OO = style2.f124943OooO00o.OooO0OO(C34690OooOOO.f124941OooOo0o);
        long j = style2.f124944OooO0O0;
        if (C22189OoooO0.OooO0Oo(j)) {
            j = C34692OooOOOO.f124957OooO00o;
        }
        long j2 = j;
        C24093OooOOo0 c24093OooOOo0 = style2.f124945OooO0OO;
        if (c24093OooOOo0 == null) {
            c24093OooOOo0 = C24093OooOOo0.f81191OooOoO0;
        }
        C24093OooOOo0 c24093OooOOo02 = c24093OooOOo0;
        OooOOOO oooOOOO = style2.f124946OooO0Oo;
        OooOOOO oooOOOO2 = new OooOOOO(oooOOOO != null ? oooOOOO.f81185OooO00o : 0);
        C24091OooOOOo c24091OooOOOo = style2.f124948OooO0o0;
        C24091OooOOOo c24091OooOOOo2 = new C24091OooOOOo(c24091OooOOOo != null ? c24091OooOOOo.f81186OooO00o : 1);
        AbstractC24088OooO0oO abstractC24088OooO0oO = style2.f124947OooO0o;
        if (abstractC24088OooO0oO == null) {
            abstractC24088OooO0oO = AbstractC24088OooO0oO.f81174OooOo0o;
        }
        AbstractC24088OooO0oO abstractC24088OooO0oO2 = abstractC24088OooO0oO;
        String str = style2.f124949OooO0oO;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = style2.f124950OooO0oo;
        if (C22189OoooO0.OooO0Oo(j3)) {
            j3 = C34692OooOOOO.f124958OooO0O0;
        }
        long j4 = j3;
        C24113OooO00o c24113OooO00o = style2.f124942OooO;
        C24113OooO00o c24113OooO00o2 = new C24113OooO00o(c24113OooO00o != null ? c24113OooO00o.f81258OooO00o : 0.0f);
        C24120OooOO0o c24120OooOO0o = style2.f124951OooOO0;
        if (c24120OooOO0o == null) {
            c24120OooOO0o = C24120OooOO0o.f81279OooO0OO;
        }
        C24120OooOO0o c24120OooOO0o2 = c24120OooOO0o;
        C24108OooO0Oo c24108OooO0OoOooO00o = style2.f124952OooOO0O;
        if (c24108OooO0OoOooO00o == null) {
            c24108OooO0OoOooO00o = C24109OooO0o0.f81245OooO00o.OooO00o();
        }
        C24108OooO0Oo c24108OooO0Oo = c24108OooO0OoOooO00o;
        long j5 = C21348Ooooo0o.f61766OooO0oO;
        long j6 = style2.f124953OooOO0o;
        if (j6 == j5) {
            j6 = C34692OooOOOO.f124959OooO0OO;
        }
        long j7 = j6;
        OooO oooO = style2.f124955OooOOO0;
        if (oooO == null) {
            oooO = OooO.f81254OooO0O0;
        }
        OooO oooO2 = oooO;
        C21362o00oO0o c21362o00oO0o = style2.f124954OooOOO;
        if (c21362o00oO0o == null) {
            c21362o00oO0o = C21362o00oO0o.f61780OooO0Oo;
        }
        C21362o00oO0o c21362o00oO0o2 = c21362o00oO0o;
        AbstractC20449OooO0Oo abstractC20449OooO0Oo = style2.f124956OooOOOO;
        if (abstractC20449OooO0Oo == null) {
            abstractC20449OooO0Oo = C21403OooO0oO.f61923OooOo0o;
        }
        C34691OooOOO0 c34691OooOOO0 = new C34691OooOOO0(oooOO0OOooO0OO, j2, c24093OooOOo02, oooOOOO2, c24091OooOOOo2, abstractC24088OooO0oO2, str2, j4, c24113OooO00o2, c24120OooOO0o2, c24108OooO0Oo, j7, oooO2, c21362o00oO0o2, abstractC20449OooO0Oo);
        int i3 = C34678OooO.f124877OooO0O0;
        C34686OooO0oo style3 = style.f124983OooO0O0;
        OooOOO0.OooO0oO(style3, "style");
        C24119OooO0oo c24119OooO0oo = new C24119OooO0oo(style3.f124937OooOO0);
        OooOO0 oooOO02 = style3.f124930OooO0O0;
        if (oooOO02 != null && oooOO02.f81275OooO00o == 3) {
            int iOrdinal = direction.ordinal();
            if (iOrdinal == 0) {
                i = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                i = 5;
            }
        } else if (oooOO02 == null) {
            int iOrdinal2 = direction.ordinal();
            if (iOrdinal2 == 0) {
                i = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new C32442OooOO0o();
                }
                i = 2;
            }
        } else {
            i = oooOO02.f81275OooO00o;
        }
        OooOO0 oooOO03 = new OooOO0(i);
        long j8 = style3.f124931OooO0OO;
        if (C22189OoooO0.OooO0Oo(j8)) {
            j8 = C34678OooO.f124876OooO00o;
        }
        long j9 = j8;
        o00000o0.OooOOO0 oooOOO0 = style3.f124932OooO0Oo;
        if (oooOOO0 == null) {
            oooOOO0 = o00000o0.OooOOO0.f81286OooO0OO;
        }
        o00000o0.OooOOO0 oooOOO02 = oooOOO0;
        C24117OooO0o0 c24117OooO0o0 = new C24117OooO0o0(style3.f124938OooOO0O);
        C24116OooO0Oo c24116OooO0Oo = new C24116OooO0Oo(style3.f124939OooOO0o);
        OooOOO oooOOO = style3.f124928OooO;
        if (oooOOO == null) {
            oooOOO = OooOOO.f81282OooO0OO;
        }
        return new C34698OooOo00(c34691OooOOO0, new C34686OooO0oo(c24119OooO0oo, oooOO03, j9, oooOOO02, style3.f124934OooO0o0, style3.f124933OooO0o, c24117OooO0o0, c24116OooO0Oo, oooOOO), style.f124984OooO0OO);
    }

    @Override // o00o00Oo.InterfaceC25263OooO0oo
    public void OooO00o(ActivityC21897OooOo0 activityC21897OooOo0) {
    }
}
