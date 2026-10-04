package o0ooo0;

import android.graphics.Path;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o0oo0o0o.C31325OooO0OO;
import o0oo0oo.C31362OooO0Oo;
import o0oo0oo.C31364OooO0o0;
import o0oo0oo.C31368OooOO0O;
import o0oo0oo.C31381OooOOoo;
import o0oo0oo.C31382OooOo;
import o0oo0oo.C31398Oooo0OO;
import o0oo0oo.C31401Oooo0oO;
import o0oo0oo.Oooo000;
import o0oo0ooo.C31412OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0ooo0O.AbstractC31753OooO0OO;
import o0ooo0O.C31751OooO00o;
import o0ooo0O.C31752OooO0O0;
import o0ooo0O.C31754OooO0Oo;
import o0ooo0O.C31755OooO0o;
import o0ooo0O.C31757OooO0oO;
import o0ooo0O.C31758OooO0oo;
import o0ooo0O.C31759OooOO0;
import o0ooo0O.C31760OooOO0O;

/* JADX INFO: renamed from: o0ooo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31727OooOo0o extends AbstractC31726OooOo0O implements InterfaceC31731OooOoo {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final HashMap f113328Oooo0oo = new HashMap(250);

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C31362OooO0Oo f113329Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C31362OooO0Oo f113330Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C31362OooO0Oo f113331Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f113332Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public HashMap f113333Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f113334Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C31401Oooo0oO f113335Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public C31412OooO00o f113336Oooo0oO;

    static {
        for (Map.Entry entry : Collections.unmodifiableMap(C31755OooO0o.f113399OooOoo0.f113392OooOo0o).entrySet()) {
            HashMap map = f113328Oooo0oo;
            if (!map.containsKey(entry.getValue())) {
                map.put(entry.getValue(), entry.getKey());
            }
        }
    }

    public C31727OooOo0o(C31436OooO0Oo c31436OooO0Oo) throws IOException {
        super(c31436OooO0Oo);
        C31401Oooo0oO c31401Oooo0oOOooO0OO = null;
        this.f113330Oooo00O = null;
        this.f113331Oooo00o = null;
        this.f113329Oooo0 = null;
        this.f113332Oooo0O0 = false;
        C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
        if (c31722OooOOo0 != null) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31722OooOOo0.f113315OooOo0o.o0000O0O(C31441OooOO0.f112309o0000ooO);
            C31668OooO c31668OooO = abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo ? new C31668OooO((C31448OooOOo) abstractC31434OooO0O0O0000O0O) : null;
            if (c31668OooO != null) {
                try {
                    c31401Oooo0oOOooO0OO = new C31398Oooo0OO(true, false).OooO0OO(new C31382OooOo(c31668OooO.f113202OooOo0o.o000o00O()));
                } catch (IOException e) {
                    Log.w("PdfBox-Android", "Could not read embedded TTF for font " + OooOo(), e);
                }
            }
        }
        this.f113334Oooo0o = c31401Oooo0oOOooO0OO != null;
        if (c31401Oooo0oOOooO0OO == null) {
            C31714OooOO0<C31401Oooo0oO> c31714OooOO0OooO0oo = ((C31713OooO0oo) C31705OooO.OooO00o()).OooO0oo(OooOo(), this.f113310OooOoO);
            C31401Oooo0oO c31401Oooo0oO = (C31401Oooo0oO) c31714OooOO0OooO0oo.f113273OooO00o;
            if (c31714OooOO0OooO0oo.f113274OooO0O0) {
                Log.w("PdfBox-Android", "Using fallback font '" + c31401Oooo0oO + "' for '" + OooOo() + "'");
            }
            c31401Oooo0oOOooO0OO = c31401Oooo0oO;
        }
        this.f113335Oooo0o0 = c31401Oooo0oOOooO0OO;
        OooOo0();
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final float OooO0O0(int i) throws IOException {
        int iOooOo0o = OooOo0o(i);
        C31401Oooo0oO c31401Oooo0oO = this.f113335Oooo0o0;
        C31381OooOOoo c31381OooOOooOooo0 = c31401Oooo0oO.Oooo0();
        float fOooO0O0 = c31381OooOOooOooo0 != null ? c31381OooOOooOooo0.OooO0O0(iOooOo0o) : 250;
        float fO0000O0O = c31401Oooo0oO.o0000O0O();
        return fO0000O0O != 1000.0f ? (1000.0f / fO0000O0O) * fOooO0O0 : fOooO0O0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31412OooO00o OooO0OO() throws IOException {
        C31676OooO0oo c31676OooO0ooOooO00o;
        if (this.f113336Oooo0oO == null) {
            C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
            this.f113336Oooo0oO = (c31722OooOOo0 == null || (c31676OooO0ooOooO00o = c31722OooOOo0.OooO00o()) == null) ? this.f113335Oooo0o0.OooO0OO() : new C31412OooO00o(c31676OooO0ooOooO00o.OooO0O0(), c31676OooO0ooOooO00o.OooO0OO(), c31676OooO0ooOooO00o.OooO0Oo(), c31676OooO0ooOooO00o.OooO0o0());
        }
        return this.f113336Oooo0oO;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return this.f113334Oooo0o;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final byte[] OooO0o(int i) throws IOException {
        AbstractC31753OooO0OO abstractC31753OooO0OO = this.f113325OooOooO;
        C31401Oooo0oO c31401Oooo0oO = this.f113335Oooo0o0;
        if (abstractC31753OooO0OO != null) {
            if (!abstractC31753OooO0OO.f113391OooOo.containsKey(this.f113326OooOooo.OooO00o(i))) {
                throw new IllegalArgumentException(String.format("U+%04X is not available in this font's encoding: %s", Integer.valueOf(i), this.f113325OooOooO.OooO0O0()));
            }
            String strOooO00o = this.f113326OooOooo.OooO00o(i);
            Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f113325OooOooO.f113391OooOo);
            if (c31401Oooo0oO.OooOOo0(strOooO00o) || c31401Oooo0oO.OooOOo0(OooO0O0.OooO0O0.OooO0Oo(i))) {
                return new byte[]{(byte) ((Integer) mapUnmodifiableMap.get(strOooO00o)).intValue()};
            }
            throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i), OooOo()));
        }
        String strOooO00o2 = this.f113326OooOooo.OooO00o(i);
        if (!c31401Oooo0oO.OooOOo0(strOooO00o2)) {
            throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i), OooOo()));
        }
        int iO0000O = c31401Oooo0oO.o0000O(strOooO00o2);
        HashMap map = this.f113333Oooo0OO;
        if (map == null) {
            this.f113333Oooo0OO = new HashMap();
            for (int i2 = 0; i2 <= 255; i2++) {
                int iOooOo0o = OooOo0o(i2);
                if (!this.f113333Oooo0OO.containsKey(Integer.valueOf(iOooOo0o))) {
                    this.f113333Oooo0OO.put(Integer.valueOf(iOooOo0o), Integer.valueOf(i2));
                }
            }
            map = this.f113333Oooo0OO;
        }
        Integer num = (Integer) map.get(Integer.valueOf(iO0000O));
        if (num != null) {
            return new byte[]{(byte) num.intValue()};
        }
        throw new IllegalArgumentException(String.format("U+%04X is not available in this font's Encoding", Integer.valueOf(i)));
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final int OooOOOO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        return byteArrayInputStream.read();
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final Path OooOOoo(String str) throws IOException {
        C31368OooOO0O c31368OooOO0OOooO0O0;
        C31401Oooo0oO c31401Oooo0oO = this.f113335Oooo0o0;
        int iO0000O = c31401Oooo0oO.o0000O(str);
        if (iO0000O == 0) {
            iO0000O = 0;
            try {
                int i = Integer.parseInt(str);
                if (i <= c31401Oooo0oO.Oooo0OO()) {
                    iO0000O = i;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (iO0000O != 0 && (c31368OooOO0OOooO0O0 = c31401Oooo0oO.OooOooo().OooO0O0(iO0000O)) != null) {
            return c31368OooOO0OOooO0O0.OooO00o();
        }
        return new Path();
    }

    public final String OooOo() {
        return this.f113309OooOo0o.o000OOO(C31441OooOO0.f112259OoooO0O);
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final AbstractC31753OooO0OO OooOo0O() throws IOException {
        String[] strArr;
        C31325OooO0OO c31325OooO0OO;
        if (!this.f113334Oooo0o && (c31325OooO0OO = this.f113311OooOoO0) != null) {
            return new C31759OooOO0(c31325OooO0OO);
        }
        if (OooOo00() != null && !OooOo00().booleanValue()) {
            return C31758OooO0oo.f113404OooOoO;
        }
        String str = (String) C31733OooOooO.f113356OooO00o.get(OooOo());
        if (OooOOO0() && !str.equals("Symbol") && !str.equals("ZapfDingbats")) {
            return C31758OooO0oo.f113404OooOoO;
        }
        Oooo000 oooo000O00Oo0 = this.f113335Oooo0o0.o00Oo0();
        HashMap map = new HashMap();
        for (int i = 0; i <= 256; i++) {
            int iOooOo0o = OooOo0o(i);
            if (iOooOo0o > 0) {
                String string = null;
                if (oooo000O00Oo0 != null && iOooOo0o >= 0 && (strArr = oooo000O00Oo0.f112104OooO) != null && iOooOo0o < strArr.length) {
                    string = strArr[iOooOo0o];
                }
                if (string == null) {
                    string = Integer.toString(iOooOo0o);
                }
                map.put(Integer.valueOf(i), string);
            }
        }
        C31751OooO00o c31751OooO00o = new C31751OooO00o();
        for (Map.Entry entry : map.entrySet()) {
            c31751OooO00o.OooO00o(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
        }
        return c31751OooO00o;
    }

    public final int OooOo0o(int i) throws IOException {
        C31362OooO0Oo c31362OooO0Oo;
        Integer num;
        String strOooO0OO;
        boolean z = this.f113332Oooo0O0;
        int iOooO0O0 = 0;
        boolean z2 = true;
        C31401Oooo0oO c31401Oooo0oO = this.f113335Oooo0o0;
        if (!z) {
            C31364OooO0o0 c31364OooO0o0 = (C31364OooO0o0) c31401Oooo0oO.o0Oo0oo("cmap");
            if (c31364OooO0o0 != null) {
                for (C31362OooO0Oo c31362OooO0Oo2 : c31364OooO0o0.f111984OooO0o) {
                    int i2 = c31362OooO0Oo2.f111974OooO00o;
                    if (3 == i2) {
                        int i3 = c31362OooO0Oo2.f111975OooO0O0;
                        if (1 == i3) {
                            this.f113330Oooo00O = c31362OooO0Oo2;
                        } else if (i3 == 0) {
                            this.f113331Oooo00o = c31362OooO0Oo2;
                        }
                    } else if (1 == i2 && c31362OooO0Oo2.f111975OooO0O0 == 0) {
                        this.f113329Oooo0 = c31362OooO0Oo2;
                    } else if (i2 == 0 && c31362OooO0Oo2.f111975OooO0O0 == 0) {
                        this.f113330Oooo00O = c31362OooO0Oo2;
                    }
                }
            }
            this.f113332Oooo0O0 = true;
        }
        if (this.f113327Oooo000 == null) {
            Boolean boolOooOo00 = OooOo00();
            if (boolOooOo00 == null) {
                if (OooOOO0()) {
                    String str = (String) C31733OooOooO.f113356OooO00o.get(getName());
                    if (!str.equals("Symbol") && !str.equals("ZapfDingbats")) {
                        z2 = false;
                    }
                    boolOooOo00 = Boolean.valueOf(z2);
                } else {
                    AbstractC31753OooO0OO abstractC31753OooO0OO = this.f113325OooOooO;
                    if (abstractC31753OooO0OO == null) {
                        boolOooOo00 = Boolean.TRUE;
                    } else if ((abstractC31753OooO0OO instanceof C31760OooOO0O) || (abstractC31753OooO0OO instanceof C31757OooO0oO) || (abstractC31753OooO0OO instanceof C31758OooO0oo)) {
                        boolOooOo00 = Boolean.FALSE;
                    } else if (abstractC31753OooO0OO instanceof C31752OooO0O0) {
                        for (String str2 : ((C31752OooO0O0) abstractC31753OooO0OO).f113390OooOoOO.values()) {
                            if (!".notdef".equals(str2) && (!C31760OooOO0O.f113406OooOoO.f113391OooOo.containsKey(str2) || !C31757OooO0oO.f113402OooOoO.f113391OooOo.containsKey(str2) || !C31758OooO0oo.f113404OooOoO.f113391OooOo.containsKey(str2))) {
                                boolOooOo00 = Boolean.TRUE;
                                break;
                            }
                        }
                        boolOooOo00 = Boolean.FALSE;
                    } else {
                        boolOooOo00 = null;
                    }
                }
            }
            if (boolOooOo00 != null) {
                this.f113327Oooo000 = boolOooOo00;
            } else {
                this.f113327Oooo000 = Boolean.TRUE;
            }
        }
        if (this.f113327Oooo000.booleanValue()) {
            C31362OooO0Oo c31362OooO0Oo3 = this.f113330Oooo00O;
            if (c31362OooO0Oo3 != null) {
                AbstractC31753OooO0OO abstractC31753OooO0OO2 = this.f113325OooOooO;
                if ((abstractC31753OooO0OO2 instanceof C31760OooOO0O) || (abstractC31753OooO0OO2 instanceof C31757OooO0oO)) {
                    String strOooO0Oo = abstractC31753OooO0OO2.OooO0Oo(i);
                    if (!".notdef".equals(strOooO0Oo)) {
                        String strOooO0OO2 = C31754OooO0Oo.f113393OooO0Oo.OooO0OO(strOooO0Oo);
                        if (strOooO0OO2 != null) {
                            iOooO0O0 = this.f113330Oooo00O.OooO0O0(strOooO0OO2.codePointAt(0));
                        }
                    }
                } else {
                    iOooO0O0 = c31362OooO0Oo3.OooO0O0(i);
                }
            }
            C31362OooO0Oo c31362OooO0Oo4 = this.f113331Oooo00o;
            if (c31362OooO0Oo4 != null) {
                iOooO0O0 = c31362OooO0Oo4.OooO0O0(i);
                if (i >= 0 && i <= 255) {
                    if (iOooO0O0 == 0) {
                        iOooO0O0 = this.f113331Oooo00o.OooO0O0(61440 + i);
                    }
                    if (iOooO0O0 == 0) {
                        iOooO0O0 = this.f113331Oooo00o.OooO0O0(61696 + i);
                    }
                    if (iOooO0O0 == 0) {
                        iOooO0O0 = this.f113331Oooo00o.OooO0O0(61952 + i);
                    }
                }
            }
            return (iOooO0O0 != 0 || (c31362OooO0Oo = this.f113329Oooo0) == null) ? iOooO0O0 : c31362OooO0Oo.OooO0O0(i);
        }
        String strOooO0Oo2 = this.f113325OooOooO.OooO0Oo(i);
        if (!".notdef".equals(strOooO0Oo2)) {
            if (this.f113330Oooo00O != null && (strOooO0OO = C31754OooO0Oo.f113393OooO0Oo.OooO0OO(strOooO0Oo2)) != null) {
                iOooO0O0 = this.f113330Oooo00O.OooO0O0(strOooO0OO.codePointAt(0));
            }
            if (iOooO0O0 == 0 && this.f113329Oooo0 != null && (num = (Integer) f113328Oooo0oo.get(strOooO0Oo2)) != null) {
                iOooO0O0 = this.f113329Oooo0.OooO0O0(num.intValue());
            }
            return iOooO0O0 == 0 ? c31401Oooo0oO.o0000O(strOooO0Oo2) : iOooO0O0;
        }
        return 0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final String getName() {
        return OooOo();
    }

    @Override // o0ooo0.InterfaceC31731OooOoo
    public final Path getPath(int i) throws IOException {
        C31368OooOO0O c31368OooOO0OOooO0O0 = this.f113335Oooo0o0.OooOooo().OooO0O0(OooOo0o(i));
        return c31368OooOO0OOooO0O0 == null ? new Path() : c31368OooOO0OOooO0O0.OooO00o();
    }
}
