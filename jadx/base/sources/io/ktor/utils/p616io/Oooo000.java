package io.ktor.utils.p616io;

import OooO0O0.OooO0o;
import OooOOOo.OooOOOO;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0o.C31610OooO;
import o0ooOoo.C31669OooO00o;
import o0ooo0.AbstractC31720OooOOOo;
import o0oooO00.AbstractC31793OooO00o;
import o0oooO00.C31803OooOO0o;
import o0oooO00.C31807OooOOOo;
import o0oooO0O.AbstractC31817OooO0oo;
import o0oooO0O.C31811OooO0O0;
import oO0O00oo.OooO;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 {
    public static final void OooO00o(Throwable th) throws Throwable {
        Throwable thOooO0O0;
        try {
            thOooO0O0 = o00oO0O.OooO0O0(th, th);
        } catch (Throwable unused) {
            thOooO0O0 = null;
        }
        if (thOooO0O0 != null) {
            throw thOooO0O0;
        }
    }

    public static void OooO0O0(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "radix ", " was not in valid range ");
            sbOooO0OO.append(new OooO(2, 36, 1));
            throw new IllegalArgumentException(sbOooO0OO.toString());
        }
    }

    public static boolean OooO0OO(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static void OooO0Oo(C31811OooO0O0 c31811OooO0O0, ArrayList arrayList, C31669OooO00o c31669OooO00o, HashMap map) {
        C31610OooO c31610OooOOooO00o = c31811OooO0O0.OooO00o();
        for (AbstractC31793OooO00o abstractC31793OooO00o : c31669OooO00o.f113203OooOo) {
            if (abstractC31793OooO00o instanceof C31803OooOO0o) {
                C31807OooOOOo c31807OooOOOoOooO0O0 = abstractC31793OooO00o.OooO0O0();
                if (c31807OooOOOoOooO0O0 != null && c31807OooOOOoOooO0O0.OooO0OO() != null) {
                    C31610OooO c31610OooOOooO0OO = c31807OooOOOoOooO0O0.OooO0OO();
                    c31610OooOOooO0OO.getClass();
                    C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) c31610OooOOooO0OO.f113005OooOo0o.o0000O0O(C31441OooOO0.f112300o0000o);
                    for (C31441OooOO0 c31441OooOO0 : c31436OooO0Oo == null ? Collections.EMPTY_SET : c31436OooO0Oo.f112222OooOoO0.keySet()) {
                        boolean zStartsWith = c31441OooOO0.f112461OooOo.startsWith("+");
                        String str = c31441OooOO0.f112461OooOo;
                        if (zStartsWith) {
                            Log.d("PdfBox-Android", "font resource for widget was a subsetted font - ignored: " + str);
                        } else {
                            try {
                                if (c31610OooOOooO00o.OooO0O0(c31441OooOO0) == null) {
                                    AbstractC31720OooOOOo abstractC31720OooOOOoOooO0O0 = c31610OooOOooO0OO.OooO0O0(c31441OooOO0);
                                    C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112300o0000o;
                                    C31436OooO0Oo c31436OooO0Oo2 = c31610OooOOooO00o.f113005OooOo0o;
                                    C31436OooO0Oo c31436OooO0Oo3 = (C31436OooO0Oo) c31436OooO0Oo2.o0000O0O(c31441OooOO02);
                                    if (c31436OooO0Oo3 == null) {
                                        c31436OooO0Oo3 = new C31436OooO0Oo();
                                        c31436OooO0Oo2.o000OoOO(c31441OooOO02, c31436OooO0Oo3);
                                    }
                                    c31436OooO0Oo3.o000OoOo(c31441OooOO0, abstractC31720OooOOOoOooO0O0);
                                    Log.d("PdfBox-Android", "qdded font resource to AcroForm from widget for font name " + str);
                                }
                            } catch (IOException unused) {
                                Log.d("PdfBox-Android", "unable to add font to AcroForm for font name " + str);
                            }
                        }
                    }
                }
                C31441OooOO0 c31441OooOO03 = C31441OooOO0.f112376o00O00o;
                C31436OooO0Oo c31436OooO0Oo4 = abstractC31793OooO00o.f113422OooOo0o;
                AbstractC31817OooO0oo abstractC31817OooO0ooOooO00o = null;
                if (c31436OooO0Oo4.Oooo0OO(c31441OooOO03) != null) {
                    C31436OooO0Oo c31436OooO0OoOooo0OO = ((C31803OooOO0o) abstractC31793OooO00o).f113422OooOo0o.Oooo0OO(c31441OooOO03);
                    while (true) {
                        C31441OooOO0 c31441OooOO04 = C31441OooOO0.f112376o00O00o;
                        if (c31436OooO0OoOooo0OO.f112222OooOoO0.containsKey(c31441OooOO04)) {
                            c31436OooO0OoOooo0OO = c31436OooO0OoOooo0OO.Oooo0OO(c31441OooOO04);
                            if (c31436OooO0OoOooo0OO == null) {
                                break;
                            }
                        } else if (map.get(c31436OooO0OoOooo0OO.o000OOo0(C31441OooOO0.f112408o00OO0O)) == null && (abstractC31817OooO0ooOooO00o = OooOOOO.OooO00o(c31811OooO0O0, c31436OooO0OoOooo0OO, null)) != null) {
                            map.put(abstractC31817OooO0ooOooO00o.OooO00o(), abstractC31817OooO0ooOooO00o);
                        }
                    }
                    if (abstractC31817OooO0ooOooO00o != null) {
                        arrayList.add(abstractC31817OooO0ooOooO00o);
                    }
                } else {
                    arrayList.add(OooOOOO.OooO00o(c31811OooO0O0, c31436OooO0Oo4, null));
                }
            }
        }
    }

    public static String OooO0o(char c) {
        String strValueOf = String.valueOf(c);
        OooOOO0.OooO0o0(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        OooOOO0.OooO0o(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static boolean OooO0o0(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
