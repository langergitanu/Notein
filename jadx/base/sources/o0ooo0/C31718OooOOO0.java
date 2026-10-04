package o0ooo0;

import android.graphics.Path;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import o0oo0oO.C31327OooO0O0;
import o0oo0oo.C31368OooOO0O;
import o0oo0oo.C31381OooOOoo;
import o0oo0oo.C31382OooOo;
import o0oo0oo.C31391OooOoo0;
import o0oo0oo.C31392OooOooO;
import o0oo0oo.C31401Oooo0oO;
import o0oo0oo.InterfaceC31361OooO0OO;
import o0oo0ooo.C31412OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31718OooOOO0 extends AbstractC31715OooOO0O {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C31401Oooo0oO f113298OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final InterfaceC31361OooO0OO f113299Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int[] f113300Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final boolean f113301Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final boolean f113302Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C31837OooO0OO f113303Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C31412OooO00o f113304Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final HashSet f113305Oooo0o0;

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C31718OooOOO0(C31436OooO0Oo c31436OooO0Oo, OooOo oooOo, C31401Oooo0oO c31401Oooo0oO) throws IOException {
        boolean z;
        super(c31436OooO0Oo, oooOo);
        this.f113305Oooo0o0 = new HashSet();
        C31722OooOOo0 c31722OooOOo0OooOO0 = OooOO0();
        if (c31401Oooo0oO != null) {
            this.f113298OooOooo = c31401Oooo0oO;
            this.f113301Oooo00O = true;
            this.f113302Oooo00o = false;
        } else {
            C31401Oooo0oO c31401Oooo0oO2 = null;
            if (c31722OooOOo0OooOO0 != null) {
                C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112309o0000ooO;
                C31436OooO0Oo c31436OooO0Oo2 = c31722OooOOo0OooOO0.f113315OooOo0o;
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo2.o0000O0O(c31441OooOO0);
                C31668OooO c31668OooO = abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo ? new C31668OooO((C31448OooOOo) abstractC31434OooO0O0O0000O0O) : null;
                c31668OooO = c31668OooO == null ? c31722OooOOo0OooOO0.OooO0O0() : c31668OooO;
                if (c31668OooO == null) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo2.o0000O0O(C31441OooOO0.f112308o0000oo0);
                    c31668OooO = abstractC31434OooO0O0O0000O0O2 instanceof C31448OooOOo ? new C31668OooO((C31448OooOOo) abstractC31434OooO0O0O0000O0O2) : null;
                }
                if (c31668OooO != null) {
                    try {
                        C31392OooOooO c31392OooOooO = (C31392OooOooO) new C31391OooOoo0(true, false).OooO0OO(new C31382OooOo(c31668OooO.f113202OooOo0o.o000o00O()));
                        try {
                            if (c31392OooOooO.f112126OooOoO0.containsKey("CFF ")) {
                                Log.w("PdfBox-Android", "Found CFF/OTF but expected embedded TTF font " + c31722OooOOo0OooOO0.OooO0OO());
                                z = true;
                            } else {
                                z = false;
                            }
                            c31401Oooo0oO2 = c31392OooOooO;
                        } catch (IOException e) {
                            e = e;
                            c31401Oooo0oO2 = c31392OooOooO;
                            Log.w("PdfBox-Android", "Could not read embedded OTF for font " + OooO0oo(), e);
                            z = true;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                } else {
                    z = false;
                }
                this.f113301Oooo00O = c31401Oooo0oO2 != null;
                this.f113302Oooo00o = z;
                if (c31401Oooo0oO2 == null) {
                    C31706OooO00o c31706OooO00oOooO0Oo = ((C31713OooO0oo) C31705OooO.OooO00o()).OooO0Oo(OooO0oo(), OooOO0(), OooO());
                    T t = c31706OooO00oOooO0Oo.f113273OooO00o;
                    c31401Oooo0oO2 = t != 0 ? (C31401Oooo0oO) t : (C31401Oooo0oO) c31706OooO00oOooO0Oo.f113243OooO0OO;
                    if (c31706OooO00oOooO0Oo.f113274OooO0O0) {
                        Log.w("PdfBox-Android", "Using fallback font " + c31401Oooo0oO2.getName() + " for CID-keyed TrueType font " + OooO0oo());
                    }
                }
                this.f113298OooOooo = c31401Oooo0oO2;
            }
        }
        this.f113299Oooo0 = this.f113298OooOooo.o0000oO(false);
        this.f113300Oooo000 = OooOO0O();
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31837OooO0OO OooO00o() {
        if (this.f113303Oooo0O0 == null) {
            this.f113303Oooo0O0 = new C31837OooO0OO(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        }
        return this.f113303Oooo0O0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final float OooO0O0(int i) throws IOException {
        int iOooO0o = OooO0o(i);
        C31401Oooo0oO c31401Oooo0oO = this.f113298OooOooo;
        C31381OooOOoo c31381OooOOooOooo0 = c31401Oooo0oO.Oooo0();
        int iOooO0O0 = c31381OooOOooOooo0 != null ? c31381OooOOooOooo0.OooO0O0(iOooO0o) : 250;
        int iO0000O0O = c31401Oooo0oO.o0000O0O();
        if (iO0000O0O != 1000) {
            iOooO0O0 = (int) ((1000.0f / iO0000O0O) * iOooO0O0);
        }
        return iOooO0O0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31412OooO00o OooO0OO() throws IOException {
        C31676OooO0oo c31676OooO0ooOooO00o;
        if (this.f113304Oooo0OO == null) {
            this.f113304Oooo0OO = (OooOO0() == null || (c31676OooO0ooOooO00o = OooOO0().OooO00o()) == null || (Float.compare(c31676OooO0ooOooO00o.OooO0O0(), 0.0f) == 0 && Float.compare(c31676OooO0ooOooO00o.OooO0OO(), 0.0f) == 0 && Float.compare(c31676OooO0ooOooO00o.OooO0Oo(), 0.0f) == 0 && Float.compare(c31676OooO0ooOooO00o.OooO0o0(), 0.0f) == 0)) ? this.f113298OooOooo.OooO0OO() : new C31412OooO00o(c31676OooO0ooOooO00o.OooO0O0(), c31676OooO0ooOooO00o.OooO0OO(), c31676OooO0ooOooO00o.OooO0Oo(), c31676OooO0ooOooO00o.OooO0o0());
        }
        return this.f113304Oooo0OO;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return this.f113301Oooo00O;
    }

    @Override // o0ooo0.AbstractC31715OooOO0O
    public final int OooO0o(int i) throws IOException {
        boolean z = this.f113301Oooo00O;
        int[] iArr = this.f113300Oooo000;
        if (z) {
            int iOooO0o0 = OooO0o0(i);
            if (iArr != null) {
                if (iOooO0o0 < iArr.length) {
                    return iArr[iOooO0o0];
                }
            } else if (iOooO0o0 < this.f113298OooOooo.Oooo0OO()) {
                return iOooO0o0;
            }
        } else {
            if (iArr == null || this.f113302Oooo00o) {
                String strOooOo0 = this.f113276OooOo0o.OooOo0(i);
                if (strOooOo0 != null) {
                    if (strOooOo0.length() > 1) {
                        Log.w("PdfBox-Android", "Trying to map multi-byte character using 'cmap', result will be poor");
                    }
                    return this.f113299Oooo0.OooO0O0(strOooOo0.codePointAt(0));
                }
                HashSet hashSet = this.f113305Oooo0o0;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    Log.w("PdfBox-Android", "Failed to find a character mapping for " + i + " in " + OooO0oo());
                }
                return OooO0o0(i);
            }
            Log.w("PdfBox-Android", "Using non-embedded GIDs in font " + OooO0oo());
            int iOooO0o02 = OooO0o0(i);
            if (iOooO0o02 < iArr.length) {
                return iArr[iOooO0o02];
            }
        }
        return 0;
    }

    @Override // o0ooo0.AbstractC31715OooOO0O
    public final int OooO0o0(int i) {
        String str;
        C31327OooO0O0 c31327OooO0O0 = this.f113276OooOo0o.f113318OooOooo;
        if (c31327OooO0O0.f111860OooO.isEmpty() && c31327OooO0O0.f111869OooOO0.isEmpty()) {
            HashMap map = c31327OooO0O0.f111867OooO0oO;
            if (!map.isEmpty() && (str = (String) map.get(Integer.valueOf(i))) != null) {
                return str.codePointAt(0);
            }
        }
        return c31327OooO0O0.OooO0O0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // o0ooo0.AbstractC31715OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] OooO0oO(int i) {
        int iOooO0O0;
        boolean z = this.f113301Oooo00O;
        InterfaceC31361OooO0OO interfaceC31361OooO0OO = this.f113299Oooo0;
        if (z) {
            OooOo oooOo = this.f113276OooOo0o;
            if (oooOo.f113318OooOooo.f111861OooO00o.startsWith("Identity-")) {
                iOooO0O0 = interfaceC31361OooO0OO != null ? interfaceC31361OooO0OO.OooO0O0(i) : -1;
                if (iOooO0O0 == -1) {
                    byte[] bArr = (byte[]) oooOo.f113308OooOo.f111868OooO0oo.get(Character.toString((char) i));
                    if (bArr != null) {
                        return bArr;
                    }
                    iOooO0O0 = 0;
                }
            } else {
                C31327OooO0O0 c31327OooO0O0 = oooOo.f113320Oooo000;
                if (c31327OooO0O0 != null) {
                    iOooO0O0 = c31327OooO0O0.OooO0O0(i);
                }
                if (iOooO0O0 == -1) {
                }
            }
        } else {
            iOooO0O0 = interfaceC31361OooO0OO.OooO0O0(i);
        }
        if (iOooO0O0 != 0) {
            return new byte[]{(byte) ((iOooO0O0 >> 8) & 255), (byte) (iOooO0O0 & 255)};
        }
        throw new IllegalArgumentException(String.format("No glyph for U+%04X (%c) in font %s", Integer.valueOf(i), Character.valueOf((char) i), OooO0oo()));
    }

    @Override // o0ooo0.InterfaceC31731OooOoo
    public final Path getPath(int i) throws IOException {
        C31401Oooo0oO c31401Oooo0oO = this.f113298OooOooo;
        if (c31401Oooo0oO instanceof C31392OooOooO) {
            C31392OooOooO c31392OooOooO = (C31392OooOooO) c31401Oooo0oO;
            if (c31392OooOooO.f112126OooOoO0.containsKey("CFF ")) {
                return c31392OooOooO.o0000ooO().f111972OooO0o.OooO0o0(OooO0o(i)).OooO00o();
            }
        }
        C31368OooOO0O c31368OooOO0OOooO0O0 = c31401Oooo0oO.OooOooo().OooO0O0(OooO0o(i));
        return c31368OooOO0OOooO0O0 != null ? c31368OooOO0OOooO0O0.OooO00o() : new Path();
    }
}
