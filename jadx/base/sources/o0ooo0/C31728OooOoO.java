package o0ooo0;

import OooO0o.C20424OooO0Oo;
import android.graphics.Path;
import android.util.Log;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.client.internal.MsalUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o0oo0o0O.InterfaceC31321OooO00o;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0o0o.C31325OooO0OO;
import o0oo0ooO.C31406OooO00o;
import o0oo0ooO.C31409OooO0Oo;
import o0oo0ooO.C31410OooO0o;
import o0oo0ooo.C31412OooO00o;
import o0ooO00.C31416OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0ooo0O.AbstractC31753OooO0OO;
import o0ooo0O.C31750OooO;
import o0ooo0O.C31754OooO0Oo;
import o0ooo0O.C31758OooO0oo;
import o0ooo0O.C31759OooOO0;
import o0ooo0O.C31760OooOO0O;
import o0ooo0O.C31761OooOO0o;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31728OooOoO extends AbstractC31726OooOo0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final HashMap f113337Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final C31728OooOoO f113338Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final C31728OooOoO f113339Oooo0oo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C31837OooO0OO f113340Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final InterfaceC31322OooO0O0 f113341Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final boolean f113342Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C31416OooO00o f113343Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C31412OooO00o f113344Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final AbstractMap f113345Oooo0o0;

    static {
        HashMap map = new HashMap();
        f113337Oooo0o = map;
        map.put("ff", "f_f");
        map.put("ffi", "f_f_i");
        map.put("ffl", "f_f_l");
        map.put(TranslateLanguage.FINNISH, "f_i");
        map.put("fl", "f_l");
        map.put("st", "s_t");
        map.put("IJ", "I_J");
        map.put("ij", "i_j");
        map.put("ellipsis", "elipsis");
        new C31728OooOoO("Times-Roman");
        new C31728OooOoO("Times-Bold");
        new C31728OooOoO("Times-Italic");
        new C31728OooOoO("Times-BoldItalic");
        f113338Oooo0oO = new C31728OooOoO("Helvetica");
        new C31728OooOoO("Helvetica-Bold");
        new C31728OooOoO("Helvetica-Oblique");
        new C31728OooOoO("Helvetica-BoldOblique");
        new C31728OooOoO("Courier");
        new C31728OooOoO("Courier-Bold");
        new C31728OooOoO("Courier-Oblique");
        new C31728OooOoO("Courier-BoldOblique");
        new C31728OooOoO("Symbol");
        f113339Oooo0oo = new C31728OooOoO("ZapfDingbats");
    }

    public C31728OooOoO(String str) {
        String name;
        super(str);
        new HashSet();
        if ("ZapfDingbats".equals(str)) {
            this.f113326OooOooo = C31754OooO0Oo.f113394OooO0o0;
        } else {
            this.f113326OooOooo = C31754OooO0Oo.f113393OooO0Oo;
        }
        this.f113309OooOo0o.o000OoOO(C31441OooOO0.f112404o00OO0, C31441OooOO0.f112416o00OOO0);
        this.f113309OooOo0o.o000OooO(C31441OooOO0.f112259OoooO0O, str);
        if ("ZapfDingbats".equals(str)) {
            this.f113325OooOooO = C31761OooOO0o.f113408OooOoO;
        } else if ("Symbol".equals(str)) {
            this.f113325OooOooO = C31750OooO.f113386OooOoO;
        } else {
            this.f113325OooOooO = C31760OooOO0O.f113406OooOoO;
            this.f113309OooOo0o.o000OoOO(C31441OooOO0.f112291o0000O0O, C31441OooOO0.f112425o00OOoo);
        }
        this.f113345Oooo0o0 = new ConcurrentHashMap();
        C31714OooOO0<InterfaceC31322OooO0O0> c31714OooOO0OooO0oO = ((C31713OooO0oo) C31705OooO.OooO00o()).OooO0oO(OooOo(), this.f113310OooOoO);
        T t = c31714OooOO0OooO0oO.f113273OooO00o;
        this.f113341Oooo00O = t;
        if (c31714OooOO0OooO0oO.f113274OooO0O0) {
            try {
                name = t.getName();
            } catch (IOException unused) {
                name = MsalUtils.QUERY_STRING_SYMBOL;
            }
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Using fallback font ", name, " for base font ");
            sbOooO0o0.append(OooOo());
            Log.w("PdfBox-Android", sbOooO0o0.toString());
        }
        this.f113342Oooo00o = false;
        this.f113343Oooo0O0 = new C31416OooO00o();
    }

    public static int OooOo0o(int i, byte[] bArr) {
        byte b;
        while (i > 0) {
            if (bArr[i] == 101 && bArr[i + 1] == 120 && bArr[i + 2] == 101 && bArr[i + 3] == 99) {
                int i2 = i + 4;
                while (i2 < bArr.length && ((b = bArr[i2]) == 13 || b == 10 || b == 32 || b == 9)) {
                    i2++;
                }
                return i2;
            }
            i--;
        }
        return i;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo, o0ooo0.InterfaceC31721OooOOo
    public final C31837OooO0OO OooO00o() {
        List<Number> listOooO00o;
        C31837OooO0OO c31837OooO0OO = AbstractC31720OooOOOo.f113307OooOoo;
        if (this.f113340Oooo0 == null) {
            try {
                listOooO00o = this.f113341Oooo00O.OooO00o();
            } catch (IOException unused) {
                this.f113340Oooo0 = c31837OooO0OO;
                listOooO00o = null;
            }
            if (listOooO00o == null || listOooO00o.size() != 6) {
                return c31837OooO0OO;
            }
            this.f113340Oooo0 = new C31837OooO0OO(listOooO00o.get(0).floatValue(), listOooO00o.get(1).floatValue(), listOooO00o.get(2).floatValue(), listOooO00o.get(3).floatValue(), listOooO00o.get(4).floatValue(), listOooO00o.get(5).floatValue());
        }
        return this.f113340Oooo0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final float OooO0O0(int i) throws IOException {
        String strOooOoO0 = OooOoO0(this.f113325OooOooO.OooO0Oo(i));
        if (!this.f113342Oooo00o && ".notdef".equals(strOooOoO0)) {
            return 250.0f;
        }
        float[] fArr = {this.f113341Oooo00O.OooOOoo(strOooOoO0), 0.0f};
        this.f113343Oooo0O0.OooO0O0(fArr, fArr);
        return fArr[0];
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31412OooO00o OooO0OO() throws IOException {
        C31676OooO0oo c31676OooO0ooOooO00o;
        if (this.f113344Oooo0OO == null) {
            C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
            this.f113344Oooo0OO = (c31722OooOOo0 == null || (c31676OooO0ooOooO00o = c31722OooOOo0.OooO00o()) == null || (c31676OooO0ooOooO00o.OooO0O0() == 0.0f && c31676OooO0ooOooO00o.OooO0OO() == 0.0f && c31676OooO0ooOooO00o.OooO0Oo() == 0.0f && c31676OooO0ooOooO00o.OooO0o0() == 0.0f)) ? this.f113341Oooo00O.OooO0OO() : new C31412OooO00o(c31676OooO0ooOooO00o.OooO0O0(), c31676OooO0ooOooO00o.OooO0OO(), c31676OooO0ooOooO00o.OooO0Oo(), c31676OooO0ooOooO00o.OooO0o0());
        }
        return this.f113344Oooo0OO;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return this.f113342Oooo00o;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final byte[] OooO0o(int i) throws IOException {
        Integer numValueOf = Integer.valueOf(i);
        AbstractMap abstractMap = this.f113345Oooo0o0;
        byte[] bArr = (byte[]) abstractMap.get(numValueOf);
        if (bArr != null) {
            return bArr;
        }
        String strOooO00o = this.f113326OooOooo.OooO00o(i);
        boolean zOooOOO0 = OooOOO0();
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113341Oooo00O;
        if (zOooOOO0) {
            if (!this.f113325OooOooO.f113391OooOo.containsKey(strOooO00o)) {
                throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s, encoding: %s", Integer.valueOf(i), strOooO00o, OooOo(), this.f113325OooOooO.OooO0O0()));
            }
            if (".notdef".equals(strOooO00o)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in the font %s", Integer.valueOf(i), OooOo()));
            }
        } else {
            if (!this.f113325OooOooO.f113391OooOo.containsKey(strOooO00o)) {
                throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s (generic: %s), encoding: %s", Integer.valueOf(i), strOooO00o, OooOo(), interfaceC31322OooO0O0.getName(), this.f113325OooOooO.OooO0O0()));
            }
            String strOooOoO0 = OooOoO0(strOooO00o);
            if (strOooOoO0.equals(".notdef") || !interfaceC31322OooO0O0.OooOOo0(strOooOoO0)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in the font %s (generic: %s)", Integer.valueOf(i), OooOo(), interfaceC31322OooO0O0.getName()));
            }
        }
        int iIntValue = ((Integer) Collections.unmodifiableMap(this.f113325OooOooO.f113391OooOo).get(strOooO00o)).intValue();
        if (iIntValue < 0) {
            throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s (generic: %s), encoding: %s", Integer.valueOf(i), strOooO00o, OooOo(), interfaceC31322OooO0O0.getName(), this.f113325OooOooO.OooO0O0()));
        }
        byte[] bArr2 = {(byte) iIntValue};
        abstractMap.put(Integer.valueOf(i), bArr2);
        return bArr2;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final int OooOOOO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        return byteArrayInputStream.read();
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final Path OooOOoo(String str) throws IOException {
        return (!str.equals(".notdef") || this.f113342Oooo00o) ? this.f113341Oooo00O.OooOOO0(OooOoO0(str)) : new Path();
    }

    public final String OooOo() {
        return this.f113309OooOo0o.o000OOO(C31441OooOO0.f112259OoooO0O);
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final AbstractC31753OooO0OO OooOo0O() throws IOException {
        C31325OooO0OO c31325OooO0OO;
        if (!this.f113342Oooo00o && (c31325OooO0OO = this.f113311OooOoO0) != null) {
            return new C31759OooOO0(c31325OooO0OO);
        }
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113341Oooo00O;
        return interfaceC31322OooO0O0 instanceof InterfaceC31321OooO00o ? C31759OooOO0.OooO0o0(((InterfaceC31321OooO00o) interfaceC31322OooO0O0).OooO0O0()) : C31758OooO0oo.f113404OooOoO;
    }

    public final int OooOoO(int i, byte[] bArr) {
        int iMax = Math.max(0, i - 4);
        if (iMax <= 0 || iMax > bArr.length - 4) {
            iMax = bArr.length - 4;
        }
        int iOooOo0o = OooOo0o(iMax, bArr);
        if (iOooOo0o == 0 && i > 0) {
            iOooOo0o = OooOo0o(bArr.length - 4, bArr);
        }
        if (i - iOooOo0o == 0 || iOooOo0o <= 0) {
            return i;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Ignored invalid Length1 ", " for Type 1 font ");
        sbOooO0OO.append(OooOo());
        Log.w("PdfBox-Android", sbOooO0OO.toString());
        return iOooOo0o;
    }

    public final String OooOoO0(String str) throws IOException {
        Integer num;
        if (!this.f113342Oooo00o) {
            InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113341Oooo00O;
            if (!interfaceC31322OooO0O0.OooOOo0(str)) {
                String str2 = (String) f113337Oooo0o.get(str);
                if (str2 != null && !str.equals(".notdef") && interfaceC31322OooO0O0.OooOOo0(str2)) {
                    return str2;
                }
                String strOooO0OO = this.f113326OooOooo.OooO0OO(str);
                if (strOooO0OO != null && strOooO0OO.length() == 1) {
                    String strOooO0Oo = OooO0O0.OooO0O0.OooO0Oo(strOooO0OO.codePointAt(0));
                    if (interfaceC31322OooO0O0.OooOOo0(strOooO0Oo)) {
                        return strOooO0Oo;
                    }
                    if ("SymbolMT".equals(interfaceC31322OooO0O0.getName()) && (num = (Integer) Collections.unmodifiableMap(C31750OooO.f113386OooOoO.f113391OooOo).get(str)) != null) {
                        String strOooO0Oo2 = OooO0O0.OooO0O0.OooO0Oo(num.intValue() + 61440);
                        if (interfaceC31322OooO0O0.OooOOo0(strOooO0Oo2)) {
                            return strOooO0Oo2;
                        }
                    }
                }
                return ".notdef";
            }
        }
        return str;
    }

    public final int OooOoOO(int i, int i2, byte[] bArr) {
        if (i2 >= 0 && i2 <= bArr.length - i) {
            return i2;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i2, "Ignored invalid Length2 ", " for Type 1 font ");
        sbOooO0OO.append(OooOo());
        Log.w("PdfBox-Android", sbOooO0OO.toString());
        return bArr.length - i;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final String getName() {
        return OooOo();
    }

    public C31728OooOoO(C31436OooO0Oo c31436OooO0Oo) throws Throwable {
        int i;
        super(c31436OooO0Oo);
        this.f113345Oooo0o0 = new HashMap();
        C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
        C31409OooO0Oo c31409OooO0OoOooO0OO = null;
        if (c31722OooOOo0 != null) {
            if (c31722OooOOo0.OooO0O0() == null) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31722OooOOo0.f113315OooOo0o.o0000O0O(C31441OooOO0.f112308o0000oo0);
                C31668OooO c31668OooO = abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo ? new C31668OooO((C31448OooOOo) abstractC31434OooO0O0O0000O0O) : null;
                if (c31668OooO != null) {
                    try {
                        C31448OooOOo c31448OooOOo = c31668OooO.f113202OooOo0o;
                        int iO000O00O = c31448OooOOo.o000O00O(C31441OooOO0.f112341o000Oooo, null, -1);
                        int iO000O00O2 = c31448OooOOo.o000O00O(C31441OooOO0.f112343o000o000, null, -1);
                        byte[] bArrOooO00o = c31668OooO.OooO00o();
                        if (bArrOooO00o.length != 0) {
                            int iOooOoO = OooOoO(iO000O00O, bArrOooO00o);
                            int iOooOoOO = OooOoOO(iOooOoO, iO000O00O2, bArrOooO00o);
                            if ((bArrOooO00o[0] & 255) == 128) {
                                c31409OooO0OoOooO0OO = C31409OooO0Oo.OooO0o(bArrOooO00o);
                            } else {
                                if (iOooOoO < 0 || iOooOoO > (i = iOooOoO + iOooOoOO)) {
                                    throw new IOException("Invalid length data, actual length: " + bArrOooO00o.length + ", /Length1: " + iOooOoO + ", /Length2: " + iOooOoOO);
                                }
                                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrOooO00o, 0, iOooOoO);
                                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrOooO00o, iOooOoO, i);
                                if (iOooOoO > 0 && iOooOoOO > 0) {
                                    c31409OooO0OoOooO0OO = new C31410OooO0o().OooO0OO(bArrCopyOfRange, bArrCopyOfRange2);
                                }
                            }
                        } else {
                            throw new IOException("Font data unavailable");
                        }
                    } catch (C31406OooO00o unused) {
                        Log.w("PdfBox-Android", "Can't read damaged embedded Type1 font " + c31722OooOOo0.OooO0OO());
                    } catch (IOException e) {
                        Log.e("PdfBox-Android", "Can't read the embedded Type1 font " + c31722OooOOo0.OooO0OO(), e);
                    }
                }
            } else {
                throw new IllegalArgumentException("Use PDType1CFont for FontFile3");
            }
        }
        this.f113342Oooo00o = c31409OooO0OoOooO0OO != null;
        if (c31409OooO0OoOooO0OO != null) {
            this.f113341Oooo00O = c31409OooO0OoOooO0OO;
        } else {
            C31714OooOO0<InterfaceC31322OooO0O0> c31714OooOO0OooO0oO = ((C31713OooO0oo) C31705OooO.OooO00o()).OooO0oO(OooOo(), c31722OooOOo0);
            T t = c31714OooOO0OooO0oO.f113273OooO00o;
            this.f113341Oooo00O = t;
            if (c31714OooOO0OooO0oO.f113274OooO0O0) {
                Log.w("PdfBox-Android", "Using fallback font " + t.getName() + " for " + OooOo());
            }
        }
        OooOo0();
        C31416OooO00o c31416OooO00oOooO00o = OooO00o().OooO00o();
        this.f113343Oooo0O0 = c31416OooO00oOooO00o;
        c31416OooO00oOooO00o.OooO00o();
    }
}
