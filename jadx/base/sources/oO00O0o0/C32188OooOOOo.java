package oO00O0o0;

import OooOoOO.C20519OooO0Oo;
import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32443OooOOO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO00O0o0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32188OooOOOo {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<C32186OooO0oo> OooO00o(String str) {
        int i;
        C32443OooOOO c32443OooOOO;
        C32443OooOOO c32443OooOOO2;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (str == null) {
            return c34434OooOoO;
        }
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, OooOOO.f115535OooOo0o);
        for (int i2 = 0; i2 <= C33599OooOo0O.Oooo000(str); i2 = i) {
            InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, OooOOOO.f115536OooOo0o);
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i <= C33599OooOo0O.Oooo000(str)) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) interfaceC32440OooOO0OooO0O0.getValue()).add(new C32186OooO0oo(OooO0OO(i2, numValueOf != null ? numValueOf.intValue() : i, str), interfaceC32440OooOO0OooO0O02.isInitialized() ? (List) interfaceC32440OooOO0OooO0O02.getValue() : c34434OooOoO));
                        i++;
                    } else {
                        char c = ';';
                        if (cCharAt == ';') {
                            if (numValueOf == null) {
                                numValueOf = Integer.valueOf(i);
                            }
                            int i3 = i + 1;
                            int i4 = i3;
                            while (i4 <= C33599OooOo0O.Oooo000(str)) {
                                char cCharAt2 = str.charAt(i4);
                                if (cCharAt2 != '=') {
                                    char c2 = c;
                                    if (cCharAt2 == c2 || cCharAt2 == ',') {
                                        OooO0O0(interfaceC32440OooOO0OooO0O02, str, i3, i4, "");
                                        break;
                                    }
                                    i4++;
                                    c = c2;
                                } else {
                                    int i5 = i4 + 1;
                                    if (str.length() == i5) {
                                        c32443OooOOO2 = new C32443OooOOO(Integer.valueOf(i5), "");
                                    } else {
                                        char c3 = '\"';
                                        if (str.charAt(i5) == '\"') {
                                            int i6 = i4 + 2;
                                            StringBuilder sb = new StringBuilder();
                                            while (i6 <= C33599OooOo0O.Oooo000(str)) {
                                                char cCharAt3 = str.charAt(i6);
                                                if (cCharAt3 == c3) {
                                                    int i7 = i6 + 1;
                                                    int i8 = i7;
                                                    while (i8 < str.length() && str.charAt(i8) == ' ') {
                                                        i8++;
                                                    }
                                                    if (i8 == str.length() || str.charAt(i8) == ';') {
                                                        Integer numValueOf2 = Integer.valueOf(i7);
                                                        String string = sb.toString();
                                                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "builder.toString()");
                                                        c32443OooOOO = new C32443OooOOO(numValueOf2, string);
                                                        break;
                                                    }
                                                }
                                                if (cCharAt3 != '\\' || i6 >= C33599OooOo0O.Oooo000(str) - 2) {
                                                    sb.append(cCharAt3);
                                                    i6++;
                                                } else {
                                                    sb.append(str.charAt(i6 + 1));
                                                    i6 += 2;
                                                }
                                                c3 = '\"';
                                            }
                                            Integer numValueOf3 = Integer.valueOf(i6);
                                            String string2 = sb.toString();
                                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "builder.toString()");
                                            c32443OooOOO = new C32443OooOOO(numValueOf3, "\"".concat(string2));
                                        } else {
                                            int i9 = i5;
                                            while (i9 <= C33599OooOo0O.Oooo000(str)) {
                                                char cCharAt4 = str.charAt(i9);
                                                if (cCharAt4 == ';' || cCharAt4 == ',') {
                                                    c32443OooOOO = new C32443OooOOO(Integer.valueOf(i9), OooO0OO(i5, i9, str));
                                                    break;
                                                }
                                                i9++;
                                            }
                                            c32443OooOOO = new C32443OooOOO(Integer.valueOf(i9), OooO0OO(i5, i9, str));
                                        }
                                        c32443OooOOO2 = c32443OooOOO;
                                    }
                                    int iIntValue = ((Number) c32443OooOOO2.f116638OooOo0o).intValue();
                                    OooO0O0(interfaceC32440OooOO0OooO0O02, str, i3, i4, (String) c32443OooOOO2.f116637OooOo);
                                    i = iIntValue;
                                }
                            }
                            OooO0O0(interfaceC32440OooOO0OooO0O02, str, i3, i4, "");
                            i = i4;
                        } else {
                            i++;
                        }
                    }
                } else {
                    ((ArrayList) interfaceC32440OooOO0OooO0O0.getValue()).add(new C32186OooO0oo(OooO0OO(i2, numValueOf != null ? numValueOf.intValue() : i, str), interfaceC32440OooOO0OooO0O02.isInitialized() ? (List) interfaceC32440OooOO0OooO0O02.getValue() : c34434OooOoO));
                }
            }
        }
        return interfaceC32440OooOO0OooO0O0.isInitialized() ? (List) interfaceC32440OooOO0OooO0O0.getValue() : c34434OooOoO;
    }

    public static final void OooO0O0(InterfaceC32440OooOO0<? extends ArrayList<OooO>> interfaceC32440OooOO0, String str, int i, int i2, String str2) {
        String strOooO0OO = OooO0OO(i, i2, str);
        if (strOooO0OO.length() == 0) {
            return;
        }
        interfaceC32440OooOO0.getValue().add(new OooO(strOooO0OO, str2));
    }

    public static final String OooO0OO(int i, int i2, String str) {
        String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return C33599OooOo0O.Oooooo0(strSubstring).toString();
    }
}
