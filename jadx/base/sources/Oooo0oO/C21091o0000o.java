package Oooo0oO;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.aspose.words.WarningType;
import java.util.ArrayList;
import o0000Ooo.C24226OooO;
import o00oO0O.AbstractC25516Oooo0OO;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32204Oooo00o;
import oO00ooO.C32442OooOO0o;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33318OooOoO0;
import oO0Ooo.C33330Oooo0o;
import oo000o.AbstractC34622OooO00o;
import oo000o.C34629OooO0oo;

/* JADX INFO: renamed from: Oooo0oO.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21091o0000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61139OooO00o = 0;

    public static final int OooO(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int OooO00o(AbstractC25516Oooo0OO abstractC25516Oooo0OO, AbstractC34622OooO00o abstractC34622OooO00o) {
        AbstractC25516Oooo0OO abstractC25516Oooo0OOO00000O = abstractC25516Oooo0OO.o00000O();
        if (abstractC25516Oooo0OOO00000O == null) {
            throw new IllegalStateException(("Child of " + abstractC25516Oooo0OO + " cannot be null when calculating alignment line").toString());
        }
        if (abstractC25516Oooo0OO.o0000Ooo().OooO0O0().containsKey(abstractC34622OooO00o)) {
            Integer num = abstractC25516Oooo0OO.o0000Ooo().OooO0O0().get(abstractC34622OooO00o);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iO00000O0 = abstractC25516Oooo0OOO00000O.o00000O0(abstractC34622OooO00o);
            if (iO00000O0 != Integer.MIN_VALUE) {
                abstractC25516Oooo0OOO00000O.f87023OooOoOO = true;
                abstractC25516Oooo0OO.f87024OooOoo0 = true;
                abstractC25516Oooo0OO.o0000O00();
                abstractC25516Oooo0OOO00000O.f87023OooOoOO = false;
                abstractC25516Oooo0OO.f87024OooOoo0 = false;
                if (abstractC34622OooO00o instanceof C34629OooO0oo) {
                    long jO00000oo = abstractC25516Oooo0OOO00000O.o00000oo();
                    int i = C24226OooO.f81469OooO0OO;
                    return iO00000O0 + ((int) (jO00000oo & 4294967295L));
                }
                long jO00000oo2 = abstractC25516Oooo0OOO00000O.o00000oo();
                int i2 = C24226OooO.f81469OooO0OO;
                return iO00000O0 + ((int) (jO00000oo2 >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean OooO0O0(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public static final int OooO0OO(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int OooO0Oo(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final boolean OooO0o(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    public static final boolean OooO0o0(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & WarningType.HINT) != 0;
    }

    public static final boolean OooO0oO(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final int OooO0oo(ArrayList arrayList, int i, int i2) {
        int iOooOOOo = OooOOOo(arrayList, i, i2);
        return iOooOOOo >= 0 ? iOooOOOo : -(iOooOOOo + 1);
    }

    public static final int OooOO0(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final int OooOO0O(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 4];
        int i4 = 1;
        switch (iArr[i2 + 1] >> 28) {
            case 0:
                i4 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        return i4 + i3;
    }

    public static final void OooOO0o(int[] iArr, int i, int i2) {
        C21038OooOo.OooO0oO(i2 >= 0);
        iArr[(i * 5) + 3] = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC33320OooOoo OooOOO(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        if (abstractC33320OooOoo instanceof oO0Ooo.o00Ooo) {
            return ((oO0Ooo.o00Ooo) abstractC33320OooOoo).o0OoOo0();
        }
        return null;
    }

    public static final void OooOOO0(int[] iArr, int i, int i2) {
        C21038OooOo.OooO0oO(i2 >= 0 && i2 < 67108863);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final AbstractC33354o00o0O OooOOOO(AbstractC33354o00o0O abstractC33354o00o0O, AbstractC33320OooOoo origin) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33354o00o0O, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(origin, "origin");
        return OooOOo(abstractC33354o00o0O, OooOOO(origin));
    }

    public static final int OooOOOo(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C21025OooO0o0) arrayList.get(i4)).f60884OooO00o;
            if (i5 < 0) {
                i5 += i2;
            }
            int iOooO = kotlin.jvm.internal.OooOOO0.OooO(i5, i);
            if (iOooO < 0) {
                i3 = i4 + 1;
            } else {
                if (iOooO <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC33354o00o0O OooOOo(AbstractC33354o00o0O abstractC33354o00o0O, AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33354o00o0O, "<this>");
        if (abstractC33354o00o0O instanceof oO0Ooo.o00Ooo) {
            return OooOOo(((oO0Ooo.o00Ooo) abstractC33354o00o0O).getOrigin(), abstractC33320OooOoo);
        }
        if (abstractC33320OooOoo == null || abstractC33320OooOoo.equals(abstractC33354o00o0O)) {
            return abstractC33354o00o0O;
        }
        if (abstractC33354o00o0O instanceof AbstractC33328Oooo0O0) {
            return new C33330Oooo0o((AbstractC33328Oooo0O0) abstractC33354o00o0O, abstractC33320OooOoo);
        }
        if (abstractC33354o00o0O instanceof AbstractC33316OooOo0o) {
            return new C33318OooOoO0((AbstractC33316OooOo0o) abstractC33354o00o0O, abstractC33320OooOoo);
        }
        throw new C32442OooOO0o();
    }

    public static final void OooOOo0(C32132OooO0Oo c32132OooO0Oo, String urlString) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(urlString, "urlString");
        C32204Oooo00o.OooO0O0(c32132OooO0Oo.f115203OooO00o, urlString);
    }
}
