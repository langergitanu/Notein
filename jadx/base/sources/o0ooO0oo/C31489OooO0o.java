package o0ooO0oo;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31438OooO0o0;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31444OooOOO;
import o0ooO0Oo.C31445OooOOO0;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31462OooO0oo;
import o0ooO0o.InterfaceC31461OooO0oO;
import o0ooO0oo.C31495OooOO0o;
import o0ooOO0o.C31611OooO00o;

/* JADX INFO: renamed from: o0ooO0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31489OooO0o extends C31486OooO0O0 {
    public C31489OooO0o(InterfaceC31461OooO0oO interfaceC31461OooO0oO, C31462OooO0oo c31462OooO0oo) throws IOException {
        super(interfaceC31461OooO0oO);
        this.f112637OooO = interfaceC31461OooO0oO.length();
        String property = System.getProperty("com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange");
        if (property != null) {
            try {
                int i = Integer.parseInt(property);
                if (i > 15) {
                    this.f112651OooOOoo = i;
                }
            } catch (NumberFormatException unused) {
                Log.w("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + "'");
            }
        }
        this.f112627OooO0OO = new C31438OooO0o0(c31462OooO0oo);
    }

    public final void OoooOOO() throws Throwable {
        C31436OooO0Oo c31436OooO0OoOooo0o;
        boolean z;
        boolean z2;
        C31436OooO0Oo c31436OooO0OoOoooO0;
        C31436OooO0Oo c31436OooO0OoOoooO02;
        boolean z3 = this.f112642OooOO0;
        try {
            long jOooOoo0 = OooOoo0();
            if (jOooOoo0 > -1) {
                c31436OooO0OoOooo0o = Oooo0o(jOooOoo0);
                z = false;
            } else {
                z = z3;
                c31436OooO0OoOooo0o = null;
            }
        } catch (IOException e) {
            if (!z3) {
                throw e;
            }
            c31436OooO0OoOooo0o = null;
            z = true;
        }
        if (c31436OooO0OoOooo0o != null && c31436OooO0OoOooo0o.o0OoO0o(C31441OooOO0.f112388o00O0Oo) == null) {
            z = z3;
        }
        if (z) {
            OooOo();
            if (this.f112646OooOOO0 != null) {
                C31495OooOO0o c31495OooOO0o = this.f112653OooOo00;
                Iterator it = c31495OooOO0o.f112670OooO00o.values().iterator();
                while (it.hasNext()) {
                    ((C31495OooOO0o.OooO0O0) it.next()).f112678OooO0OO.clear();
                }
                c31495OooOO0o.f112671OooO0O0 = null;
                c31495OooOO0o.f112672OooO0OO = null;
                c31495OooOO0o.OooO00o(0L, C31495OooOO0o.OooO00o.f112674OooOo0o);
                for (Map.Entry entry : this.f112646OooOOO0.entrySet()) {
                    c31495OooOO0o.OooO0OO((C31444OooOOO) entry.getKey(), ((Long) entry.getValue()).longValue());
                }
                c31495OooOO0o.OooO0O0(0L);
                C31495OooOO0o.OooO0O0 oooO0O0 = c31495OooOO0o.f112672OooO0OO;
                c31436OooO0OoOooo0o = oooO0O0 == null ? null : oooO0O0.f112676OooO00o;
                C31438OooO0o0 c31438OooO0o0 = this.f112627OooO0OO;
                if (c31438OooO0o0 == null) {
                    throw new IOException("You must parse the document first before calling getDocument()");
                }
                c31438OooO0o0.f112230OooOoo0 = c31436OooO0OoOooo0o;
                InterfaceC31461OooO0oO interfaceC31461OooO0oO = this.f112638OooO0o;
                long position = interfaceC31461OooO0oO.getPosition();
                interfaceC31461OooO0oO.seek(6L);
                while (true) {
                    if (interfaceC31461OooO0oO.OooOOOo()) {
                        interfaceC31461OooO0oO.seek(position);
                        if (!OoooO(c31436OooO0OoOooo0o)) {
                            OooOo0o();
                            OoooO(c31436OooO0OoOooo0o);
                            z2 = true;
                        }
                    } else {
                        if (OooOooO(C31486OooO0O0.f112634OooOoo)) {
                            interfaceC31461OooO0oO.seek(interfaceC31461OooO0oO.getPosition() + ((long) 7));
                            try {
                                OooOo0();
                                C31436OooO0Oo c31436OooO0OoOooO = OooO();
                                C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112388o00O0Oo;
                                AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o = c31436OooO0OoOooO.o0OoO0o(c31441OooOO0);
                                C31445OooOOO0 c31445OooOOO0 = abstractC31434OooO0O0O0OoO0o instanceof C31445OooOOO0 ? (C31445OooOOO0) abstractC31434OooO0O0O0OoO0o : null;
                                boolean z4 = (c31445OooOOO0 == null || (c31436OooO0OoOoooO02 = OoooO0(c31445OooOOO0)) == null || !C31441OooOO0.f112266Ooooo00.equals(c31436OooO0OoOoooO02.o0Oo0oo(C31441OooOO0.f112403o00OO))) ? false : true;
                                C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112328o000OOo0;
                                AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o2 = c31436OooO0OoOooO.o0OoO0o(c31441OooOO02);
                                C31445OooOOO0 c31445OooOOO02 = abstractC31434OooO0O0O0OoO0o2 instanceof C31445OooOOO0 ? (C31445OooOOO0) abstractC31434OooO0O0O0OoO0o2 : null;
                                boolean z5 = (c31445OooOOO02 == null || (c31436OooO0OoOoooO0 = OoooO0(c31445OooOOO02)) == null || !C31486OooO0O0.OooOoo(c31436OooO0OoOoooO0)) ? false : true;
                                if (z4 && z5) {
                                    c31436OooO0OoOooo0o.o000OoOO(c31441OooOO0, c31445OooOOO0);
                                    c31436OooO0OoOooo0o.o000OoOO(c31441OooOO02, c31445OooOOO02);
                                    C31441OooOO0 c31441OooOO03 = C31441OooOO0.f112322o000OO;
                                    if (c31436OooO0OoOooO.f112222OooOoO0.containsKey(c31441OooOO03)) {
                                        AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o3 = c31436OooO0OoOooO.o0OoO0o(c31441OooOO03);
                                        C31445OooOOO0 c31445OooOOO03 = abstractC31434OooO0O0O0OoO0o3 instanceof C31445OooOOO0 ? (C31445OooOOO0) abstractC31434OooO0O0O0OoO0o3 : null;
                                        if (c31445OooOOO03 != null && OoooO0(c31445OooOOO03) != null) {
                                            c31436OooO0OoOooo0o.o000OoOO(c31441OooOO03, c31445OooOOO03);
                                        }
                                    }
                                    C31441OooOO0 c31441OooOO04 = C31441OooOO0.f112320o000O0oO;
                                    if (!c31436OooO0OoOooO.f112222OooOoO0.containsKey(c31441OooOO04)) {
                                        break;
                                    }
                                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o4 = c31436OooO0OoOooO.o0OoO0o(c31441OooOO04);
                                    if (!(abstractC31434OooO0O0O0OoO0o4 instanceof C31433OooO00o)) {
                                        break;
                                    }
                                    c31436OooO0OoOooo0o.o000OoOO(c31441OooOO04, abstractC31434OooO0O0O0OoO0o4);
                                    break;
                                }
                            } catch (IOException unused) {
                                continue;
                            }
                        }
                        interfaceC31461OooO0oO.read();
                    }
                }
                z2 = false;
                Oooo0oo();
                if (!z2) {
                    OooOo0o();
                }
            } else {
                c31436OooO0OoOooo0o = null;
            }
            this.f112644OooOO0o = true;
        } else {
            Oooo0oo();
            HashMap map = this.f112646OooOOO0;
            if (map != null && !map.isEmpty()) {
                OooOo0o();
            }
        }
        for (AbstractC31434OooO0O0 abstractC31434OooO0O0 : c31436OooO0OoOooo0o.f112222OooOoO0.values()) {
            if (abstractC31434OooO0O0 instanceof C31445OooOOO0) {
                Oooo0OO((C31445OooOOO0) abstractC31434OooO0O0, false);
            }
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o5 = c31436OooO0OoOooo0o.o0OoO0o(C31441OooOO0.f112388o00O0Oo);
        C31445OooOOO0 c31445OooOOO04 = abstractC31434OooO0O0O0OoO0o5 instanceof C31445OooOOO0 ? (C31445OooOOO0) abstractC31434OooO0O0O0OoO0o5 : null;
        if (c31445OooOOO04 == null) {
            throw new IOException("Missing root object specification in trailer.");
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O02 = c31445OooOOO04.f112467OooOo;
        if (!(abstractC31434OooO0O02 instanceof C31436OooO0Oo)) {
            throw new IOException("Expected root dictionary, but got this: " + abstractC31434OooO0O02);
        }
        C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) abstractC31434OooO0O02;
        if (z3) {
            C31441OooOO0 c31441OooOO05 = C31441OooOO0.f112403o00OO;
            if (!c31436OooO0Oo.f112222OooOoO0.containsKey(c31441OooOO05)) {
                c31436OooO0Oo.o000OoOO(c31441OooOO05, C31441OooOO0.f112266Ooooo00);
            }
        }
        Oooo00O(c31436OooO0Oo);
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0OoOooo0o.o0000O0O(C31441OooOO0.f112328o000OOo0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            Oooo00O((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O);
        }
        if (this.f112644OooOO0o) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112375o00O00Oo);
            if (abstractC31434OooO0O0O0000O0O2 instanceof C31436OooO0Oo) {
                C31486OooO0O0.OooOoO0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O2, new HashSet());
            }
        }
        if (!(c31436OooO0Oo.o0000O0O(C31441OooOO0.f112375o00O00Oo) instanceof C31436OooO0Oo)) {
            throw new IOException("Page tree root must be a dictionary");
        }
        this.f112627OooO0OO.getClass();
        this.f112643OooOO0O = true;
    }

    public final void OoooOOo() throws IOException {
        try {
            if (!Oooo0("%PDF-", "1.4") && !Oooo0("%FDF-", "1.0")) {
                throw new IOException("Error: Header doesn't contain versioninfo");
            }
            if (this.f112643OooOO0O) {
                return;
            }
            OoooOOO();
        } catch (Throwable th) {
            C31438OooO0o0 c31438OooO0o0 = this.f112627OooO0OO;
            if (c31438OooO0o0 != null) {
                C31455OooO00o.OooO0O0(c31438OooO0o0);
                this.f112627OooO0OO = null;
            }
            throw th;
        }
    }

    public final C31611OooO00o o000oOoO() throws IOException {
        C31438OooO0o0 c31438OooO0o0 = this.f112627OooO0OO;
        if (c31438OooO0o0 == null) {
            throw new IOException("You must parse the document first before calling getDocument()");
        }
        if (c31438OooO0o0 == null) {
            throw new IOException("You must parse the document first before calling getAccessPermission()");
        }
        C31611OooO00o c31611OooO00o = new C31611OooO00o(c31438OooO0o0, this.f112638OooO0o);
        if (this.f112627OooO0OO == null) {
            throw new IOException("You must parse the document first before calling getEncryption()");
        }
        c31611OooO00o.f113009OooOoO = this.f112650OooOOo0;
        return c31611OooO00o;
    }
}
