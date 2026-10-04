package o0oo0oo;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0oo0oo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31398Oooo0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f112113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f112114OooO0O0;

    public C31398Oooo0OO(boolean z, boolean z2) {
        this.f112113OooO00o = z;
        this.f112114OooO0O0 = z2;
    }

    public C31401Oooo0oO OooO00o(AbstractC31397Oooo0O0 abstractC31397Oooo0O0) {
        return new C31401Oooo0oO(abstractC31397Oooo0O0);
    }

    public C31401Oooo0oO OooO0O0(File file) throws IOException {
        C31395Oooo00O c31395Oooo00O = new C31395Oooo00O(file);
        try {
            return OooO0OO(c31395Oooo00O);
        } catch (IOException e) {
            c31395Oooo00O.close();
            throw e;
        }
    }

    public C31401Oooo0oO OooO0OO(AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        C31400Oooo0o0 c31363OooO0o;
        C31401Oooo0oO c31401Oooo0oOOooO00o = OooO00o(abstractC31397Oooo0O0);
        c31401Oooo0oOOooO00o.o0000o0(abstractC31397Oooo0O0.OooOOoo());
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        boolean z = false;
        for (int i = 0; i < iOoOO; i++) {
            String strOooo00o = abstractC31397Oooo0O0.Oooo00o(4, C31413OooO0O0.f112169OooO00o);
            if (strOooo00o.equals("cmap")) {
                c31363OooO0o = new C31364OooO0o0(c31401Oooo0oOOooO00o);
            } else if (strOooo00o.equals("glyf")) {
                C31378OooOOOo c31378OooOOOo = new C31378OooOOOo(c31401Oooo0oOOooO00o);
                c31378OooOOOo.f112052OooOO0 = 0;
                c31363OooO0o = c31378OooOOOo;
            } else if (strOooo00o.equals("head")) {
                c31363OooO0o = new C31380OooOOo0(c31401Oooo0oOOooO00o);
            } else if (strOooo00o.equals("hhea")) {
                c31363OooO0o = new C31379OooOOo(c31401Oooo0oOOooO00o);
            } else if (strOooo00o.equals("hmtx")) {
                c31363OooO0o = new C31381OooOOoo(c31401Oooo0oOOooO00o);
            } else if (strOooo00o.equals("loca")) {
                c31363OooO0o = new C31384OooOo00(c31401Oooo0oOOooO00o);
            } else if (strOooo00o.equals("maxp")) {
                c31363OooO0o = new C31386OooOo0o(c31401Oooo0oOOooO00o);
            } else if (strOooo00o.equals("name")) {
                C31387OooOoO c31387OooOoO = new C31387OooOoO(c31401Oooo0oOOooO00o);
                c31387OooOoO.f112075OooO0oo = null;
                c31363OooO0o = c31387OooOoO;
            } else if (strOooo00o.equals("OS/2")) {
                C31389OooOoOO c31389OooOoOO = new C31389OooOoOO(c31401Oooo0oOOooO00o);
                c31389OooOoOO.f112087OooOO0 = new byte[10];
                c31389OooOoOO.f112090OooOOO = 0L;
                c31389OooOoOO.f112092OooOOOO = 0L;
                c31363OooO0o = c31389OooOoOO;
            } else if (strOooo00o.equals("post")) {
                Oooo000 oooo000 = new Oooo000(c31401Oooo0oOOooO00o);
                oooo000.f112104OooO = null;
                c31363OooO0o = oooo000;
            } else {
                c31363OooO0o = strOooo00o.equals("DSIG") ? new C31363OooO0o(c31401Oooo0oOOooO00o) : strOooo00o.equals("kern") ? new C31385OooOo0O(c31401Oooo0oOOooO00o) : strOooo00o.equals("vhea") ? new C31402Oooo0oo(c31401Oooo0oOOooO00o) : strOooo00o.equals("vmtx") ? new C31394Oooo(c31401Oooo0oOOooO00o) : strOooo00o.equals("VORG") ? new C31404OoooO00(c31401Oooo0oOOooO00o) : strOooo00o.equals("GSUB") ? new C31372OooOOOO(c31401Oooo0oOOooO00o) : OooO0Oo(c31401Oooo0oOOooO00o, strOooo00o);
            }
            c31363OooO0o.f112118OooO00o = strOooo00o;
            abstractC31397Oooo0O0.Oooo0OO();
            c31363OooO0o.f112119OooO0O0 = abstractC31397Oooo0O0.Oooo0OO();
            long jOooo0OO = abstractC31397Oooo0O0.Oooo0OO();
            c31363OooO0o.f112120OooO0OO = jOooo0OO;
            C31400Oooo0o0 c31400Oooo0o0 = (jOooo0OO != 0 || strOooo00o.equals("glyf")) ? c31363OooO0o : null;
            if (c31400Oooo0o0 != null) {
                if (c31400Oooo0o0.f112119OooO0O0 + c31400Oooo0o0.f112120OooO0OO > c31401Oooo0oOOooO00o.f112125OooOoO.OooOOO0()) {
                    Log.w("PdfBox-Android", "Skip table '" + c31400Oooo0o0.f112118OooO00o + "' which goes past the file size; offset: " + c31400Oooo0o0.f112119OooO0O0 + ", size: " + c31400Oooo0o0.f112120OooO0OO + ", font size: " + c31401Oooo0oOOooO00o.f112125OooOoO.OooOOO0());
                } else {
                    c31401Oooo0oOOooO00o.f112126OooOoO0.put(c31400Oooo0o0.f112118OooO00o, c31400Oooo0o0);
                }
            }
        }
        if (!this.f112114OooO0O0) {
            for (C31400Oooo0o0 c31400Oooo0o02 : c31401Oooo0oOOooO00o.f112126OooOoO0.values()) {
                if (!c31400Oooo0o02.f112121OooO0Oo) {
                    c31401Oooo0oOOooO00o.o0000Oo0(c31400Oooo0o02);
                }
            }
            if ((this instanceof C31391OooOoo0) && c31401Oooo0oOOooO00o.f112126OooOoO0.containsKey("CFF ")) {
                z = true;
            }
            if (c31401Oooo0oOOooO00o.Oooo000() == null) {
                throw new IOException("head is mandatory");
            }
            if (c31401Oooo0oOOooO00o.Oooo00o() == null) {
                throw new IOException("hhead is mandatory");
            }
            if (((C31386OooOo0o) c31401Oooo0oOOooO00o.o0Oo0oo("maxp")) == null) {
                throw new IOException("maxp is mandatory");
            }
            if (c31401Oooo0oOOooO00o.o00Oo0() == null && !this.f112113OooO00o) {
                throw new IOException("post is mandatory");
            }
            if (!z) {
                if (((C31384OooOo00) c31401Oooo0oOOooO00o.o0Oo0oo("loca")) == null) {
                    throw new IOException("loca is mandatory");
                }
                if (c31401Oooo0oOOooO00o.OooOooo() == null) {
                    throw new IOException("glyf is mandatory");
                }
            }
            if (((C31387OooOoO) c31401Oooo0oOOooO00o.o0Oo0oo("name")) == null && !this.f112113OooO00o) {
                throw new IOException("name is mandatory");
            }
            if (c31401Oooo0oOOooO00o.Oooo0() == null) {
                throw new IOException("hmtx is mandatory");
            }
            if (!this.f112113OooO00o && ((C31364OooO0o0) c31401Oooo0oOOooO00o.o0Oo0oo("cmap")) == null) {
                throw new IOException("cmap is mandatory");
            }
        }
        return c31401Oooo0oOOooO00o;
    }

    public C31400Oooo0o0 OooO0Oo(C31401Oooo0oO c31401Oooo0oO, String str) {
        return new C31400Oooo0o0(c31401Oooo0oO);
    }
}
