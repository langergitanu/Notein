package o0Oo0oo;

import OoooOoO.InterfaceC21233OooO0o;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import o00oO0O.C25503OooOoOO;
import o00oO0O.o0Oo0oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34047Oooo0o0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.InterfaceC34042Oooo00O;
import oO0oOOoo.C34133OooO00o;
import oOO000oO.C34336OooO0o;
import oOO000oo.C34340OooO0OO;
import oOO000oo.C34342OooO0o;
import oOO000oo.C34343OooO0o0;

/* JADX INFO: renamed from: o0Oo0oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28395OooOOo0 {
    public static void OooO00o(StringBuffer stringBuffer, C34133OooO00o c34133OooO00o, Hashtable hashtable) {
        String str = (String) hashtable.get(c34133OooO00o.f122667OooOo0o);
        if (str == null) {
            str = c34133OooO00o.f122667OooOo0o.f122357OooOo0o;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(OooO0oO(c34133OooO00o.f122666OooOo));
    }

    public static String OooO0O0(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        String strOooO0oO = OooO0oO(interfaceC34019OooO0oO);
        if (strOooO0oO.length() > 0 && strOooO0oO.charAt(0) == '#') {
            try {
                try {
                    InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOOO = AbstractC34036OooOoOO.OooOOO(C34343OooO0o0.f123274OooO00o.OooO0O0(1, strOooO0oO.length() - 1, strOooO0oO));
                    if (interfaceC34019OooO0oOOooOOO instanceof InterfaceC34042Oooo00O) {
                        strOooO0oO = ((InterfaceC34042Oooo00O) interfaceC34019OooO0oOOooOOO).getString();
                    }
                } catch (Exception e) {
                    throw new C34340OooO0OO("exception decoding Hex string: " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new IllegalStateException("unknown encoding in name: " + e2);
            }
        }
        String strOooO0O0 = C34336OooO0o.OooO0O0(strOooO0oO);
        int length = strOooO0O0.length();
        if (length < 2) {
            return strOooO0O0;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && strOooO0O0.charAt(i2) == '\\' && strOooO0O0.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && strOooO0O0.charAt(i4 - 1) == '\\' && strOooO0O0.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            strOooO0O0 = strOooO0O0.substring(i2, i4 + 1);
        }
        if (strOooO0O0.indexOf("  ") < 0) {
            return strOooO0O0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char cCharAt = strOooO0O0.charAt(0);
        stringBuffer.append(cCharAt);
        for (int i5 = 1; i5 < strOooO0O0.length(); i5++) {
            char cCharAt2 = strOooO0O0.charAt(i5);
            if (cCharAt != ' ' || cCharAt2 != ' ') {
                stringBuffer.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static final C25503OooOoOO OooO0OO(C25503OooOoOO c25503OooOoOO, InterfaceC32507OooOO0o selector) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c25503OooOoOO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        for (C25503OooOoOO c25503OooOoOOOooOOoo = c25503OooOoOO.OooOOoo(); c25503OooOoOOOooOOoo != null; c25503OooOoOOOooOOoo = c25503OooOoOOOooOOoo.OooOOoo()) {
            if (((Boolean) selector.invoke(c25503OooOoOOOooOOoo)).booleanValue()) {
                return c25503OooOoOOOooOOoo;
            }
        }
        return null;
    }

    public static final void OooO0Oo(C25503OooOoOO c25503OooOoOO, ArrayList arrayList) {
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo00 = c25503OooOoOO.OooOo00();
        int i = oooO0O0OooOo00.f59746OooOoO0;
        if (i > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo00.f59745OooOo0o;
            int i2 = 0;
            do {
                C25503OooOoOO c25503OooOoOO2 = c25503OooOoOOArr[i2];
                o0Oo0oo o0oo0ooOooO0o = OooO0o(c25503OooOoOO2);
                if (o0oo0ooOooO0o != null) {
                    arrayList.add(o0oo0ooOooO0o);
                } else {
                    OooO0Oo(c25503OooOoOO2, arrayList);
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [OoooOoO.OooO0o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final o0Oo0oo OooO0o(C25503OooOoOO c25503OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c25503OooOoOO, "<this>");
        InterfaceC21233OooO0o.OooO0OO oooO0OO = c25503OooOoOO.f86970o000oOoO.f87088OooO0o0;
        int i = oooO0OO.f61606OooOoO0 & 8;
        ?? r1 = oooO0OO;
        if (i != 0) {
            while (r1 != 0) {
                if ((r1.f61603OooOo & 8) != 0 && (r1 instanceof o0Oo0oo)) {
                    break;
                }
                if ((r1.f61606OooOoO0 & 8) == 0) {
                    break;
                }
                r1 = r1.f61607OooOoOO;
            }
            r1 = 0;
        } else {
            r1 = 0;
        }
        return (o0Oo0oo) r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [OoooOoO.OooO0o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final o0Oo0oo OooO0o0(C25503OooOoOO c25503OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c25503OooOoOO, "<this>");
        InterfaceC21233OooO0o.OooO0OO oooO0OO = c25503OooOoOO.f86970o000oOoO.f87088OooO0o0;
        int i = oooO0OO.f61606OooOoO0 & 8;
        ?? r1 = oooO0OO;
        if (i != 0) {
            while (r1 != 0) {
                if ((r1.f61603OooOo & 8) == 0 || !(r1 instanceof o0Oo0oo) || !((o0Oo0oo) r1).OooOoO().f100642OooOo) {
                    if ((r1.f61606OooOoO0 & 8) == 0) {
                        break;
                    }
                    r1 = r1.f61607OooOoOO;
                } else {
                    break;
                }
            }
            r1 = 0;
        } else {
            r1 = 0;
        }
        return (o0Oo0oo) r1;
    }

    public static String OooO0oO(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(interfaceC34019OooO0oO instanceof InterfaceC34042Oooo00O) || (interfaceC34019OooO0oO instanceof AbstractC34047Oooo0o0)) {
            try {
                stringBuffer.append('#');
                byte[] bArrOooO0oO = interfaceC34019OooO0oO.OooO0o().OooO0oO();
                C34342OooO0o c34342OooO0o = C34343OooO0o0.f123274OooO00o;
                stringBuffer.append(C34336OooO0o.OooO00o(C34343OooO0o0.OooO0OO(bArrOooO0oO, bArrOooO0oO.length)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((InterfaceC34042Oooo00O) interfaceC34019OooO0oO).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            stringBuffer.append(string);
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            char cCharAt = stringBuffer.charAt(i);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        break;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, IOUtils.DIR_SEPARATOR_WINDOWS);
        }
        return stringBuffer.toString();
    }
}
