package o0ooOO0o;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import o00o0Ooo.C25432OooOO0;
import o0oo0oo.C31401Oooo0oO;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31438OooO0o0;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31456OooO0O0;
import o0ooO0o.C31462OooO0oo;
import o0ooO0o.InterfaceC31461OooO0oO;
import o0ooOO0O.C31607OooO0O0;
import o0ooo0.AbstractC31720OooOOOo;
import o0ooo000.C31739OooO0Oo;
import o0ooo0o.C31765OooO0Oo;

/* JADX INFO: renamed from: o0ooOO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31611OooO00o implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C31613OooO0OO f113007OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31438OooO0o0 f113008OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C31739OooO0Oo f113009OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31612OooO0O0 f113010OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InterfaceC31461OooO0oO f113011OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final HashSet f113012OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final HashSet f113013OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C25432OooOO0 f113014OooOooO;

    static {
        C31765OooO0Oo c31765OooO0Oo = C31765OooO0Oo.f113414OooOo;
        c31765OooO0Oo.getClass();
        c31765OooO0Oo.f113415OooOo0o.OooO00o();
        try {
            AbstractC31443OooOO0o.Oooo00o("0");
            AbstractC31443OooOO0o.Oooo00o("1");
        } catch (IOException unused) {
        }
    }

    public C31611OooO00o() {
        this(new C31456OooO0O0(-1L, -1L, true, false));
    }

    public final C31612OooO0O0 OooO00o() {
        if (this.f113010OooOoO0 == null) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113008OooOo0o.f112230OooOoo0.o0000O0O(C31441OooOO0.f112388o00O0Oo);
            if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
                this.f113010OooOoO0 = new C31612OooO0O0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O, this);
            } else {
                this.f113010OooOoO0 = new C31612OooO0O0(this);
            }
        }
        return this.f113010OooOoO0;
    }

    public final C31613OooO0OO OooO0OO() {
        if (this.f113007OooOo == null) {
            C31436OooO0Oo c31436OooO0Oo = this.f113008OooOo0o.f112230OooOoo0;
            C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112328o000OOo0;
            C31436OooO0Oo c31436OooO0OoOooo0OO = c31436OooO0Oo.Oooo0OO(c31441OooOO0);
            if (c31436OooO0OoOooo0OO == null) {
                c31436OooO0OoOooo0OO = new C31436OooO0Oo();
                c31436OooO0Oo.o000OoOO(c31441OooOO0, c31436OooO0OoOooo0OO);
            }
            this.f113007OooOo = new C31613OooO0OO(c31436OooO0OoOooo0OO);
        }
        return this.f113007OooOo;
    }

    public final C31739OooO0Oo OooOOO0() {
        if (this.f113009OooOoO == null) {
            C31438OooO0o0 c31438OooO0o0 = this.f113008OooOo0o;
            C31436OooO0Oo c31436OooO0Oo = c31438OooO0o0.f112230OooOoo0;
            if (c31436OooO0Oo != null ? c31436OooO0Oo.o0000O0O(C31441OooOO0.f112322o000OO) instanceof C31436OooO0Oo : false) {
                this.f113009OooOoO = new C31739OooO0Oo(c31438OooO0o0.f112230OooOoo0.Oooo0OO(C31441OooOO0.f112322o000OO));
            }
        }
        return this.f113009OooOoO;
    }

    public final float OooOOo0() {
        float f;
        float f2 = this.f113008OooOo0o.f112225OooOo;
        if (f2 < 1.4f) {
            return f2;
        }
        String strO000OOO = OooO00o().f113016OooOo0o.o000OOO(C31441OooOO0.f112419o00OOOO);
        if (strO000OOO != null) {
            try {
                f = Float.parseFloat(strO000OOO);
            } catch (NumberFormatException e) {
                Log.e("PdfBox-Android", "Can't extract the version number of the document catalog.", e);
                f = -1.0f;
            }
        } else {
            f = -1.0f;
        }
        return Math.max(f, f2);
    }

    public final void OooOOoo(OutputStream outputStream) throws IOException {
        if (this.f113008OooOo0o.f112232OooOooo) {
            throw new IOException("Cannot save a document which has been closed");
        }
        HashSet hashSet = this.f113013OooOoo0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((AbstractC31720OooOOOo) it.next()).OooOOOo();
        }
        hashSet.clear();
        C31607OooO0O0 c31607OooO0O0 = new C31607OooO0O0(outputStream);
        try {
            c31607OooO0O0.Oooo000(this);
        } finally {
            c31607OooO0O0.close();
        }
    }

    public final void OooOooo(float f) {
        float fOooOOo0 = OooOOo0();
        if (f == fOooOOo0) {
            return;
        }
        if (f < fOooOOo0) {
            Log.e("PdfBox-Android", "It's not allowed to downgrade the version of a pdf.");
            return;
        }
        C31438OooO0o0 c31438OooO0o0 = this.f113008OooOo0o;
        if (c31438OooO0o0.f112225OooOo < 1.4f) {
            c31438OooO0o0.f112225OooOo = f;
            return;
        }
        C31612OooO0O0 c31612OooO0O0OooO00o = OooO00o();
        c31612OooO0O0OooO00o.f113016OooOo0o.o000OooO(C31441OooOO0.f112419o00OOOO, Float.toString(f));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C31438OooO0o0 c31438OooO0o0 = this.f113008OooOo0o;
        if (c31438OooO0o0.f112232OooOooo) {
            return;
        }
        IOException iOExceptionOooO00o = C31455OooO00o.OooO00o(c31438OooO0o0, "COSDocument", null);
        InterfaceC31461OooO0oO interfaceC31461OooO0oO = this.f113011OooOoOO;
        if (interfaceC31461OooO0oO != null) {
            iOExceptionOooO00o = C31455OooO00o.OooO00o(interfaceC31461OooO0oO, "RandomAccessRead pdfSource", iOExceptionOooO00o);
        }
        Iterator it = this.f113012OooOoo.iterator();
        while (it.hasNext()) {
            iOExceptionOooO00o = C31455OooO00o.OooO00o((C31401Oooo0oO) it.next(), "TrueTypeFont", iOExceptionOooO00o);
        }
        if (iOExceptionOooO00o != null) {
            throw iOExceptionOooO00o;
        }
    }

    public C31611OooO00o(C31456OooO0O0 c31456OooO0O0) {
        C31462OooO0oo c31462OooO0oo;
        this.f113013OooOoo0 = new HashSet();
        this.f113012OooOoo = new HashSet();
        this.f113014OooOooO = new C25432OooOO0();
        try {
            c31462OooO0oo = new C31462OooO0oo(c31456OooO0O0);
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Error initializing scratch file: " + e.getMessage() + ". Fall back to main memory usage only.");
            try {
                c31462OooO0oo = new C31462OooO0oo(new C31456OooO0O0(-1L, -1L, true, false));
            } catch (IOException unused) {
                c31462OooO0oo = null;
            }
        }
        C31438OooO0o0 c31438OooO0o0 = new C31438OooO0o0(c31462OooO0oo);
        this.f113008OooOo0o = c31438OooO0o0;
        this.f113011OooOoOO = null;
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        c31438OooO0o0.f112230OooOoo0 = c31436OooO0Oo;
        C31436OooO0Oo c31436OooO0Oo2 = new C31436OooO0Oo();
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112388o00O0Oo, c31436OooO0Oo2);
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112403o00OO;
        c31436OooO0Oo2.o000OoOO(c31441OooOO0, C31441OooOO0.f112266Ooooo00);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112419o00OOOO, C31441OooOO0.OooOooo("1.4"));
        C31436OooO0Oo c31436OooO0Oo3 = new C31436OooO0Oo();
        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112375o00O00Oo;
        c31436OooO0Oo2.o000OoOO(c31441OooOO02, c31436OooO0Oo3);
        c31436OooO0Oo3.o000OoOO(c31441OooOO0, c31441OooOO02);
        c31436OooO0Oo3.o000OoOO(C31441OooOO0.f112330o000Oo, new C31433OooO00o());
        c31436OooO0Oo3.o000OoOO(C31441OooOO0.f112453oo000o, C31432OooO.f112209OooOoOO);
    }

    public C31611OooO00o(C31438OooO0o0 c31438OooO0o0, InterfaceC31461OooO0oO interfaceC31461OooO0oO) {
        this.f113013OooOoo0 = new HashSet();
        this.f113012OooOoo = new HashSet();
        this.f113014OooOooO = new C25432OooOO0();
        this.f113008OooOo0o = c31438OooO0o0;
        this.f113011OooOoOO = interfaceC31461OooO0oO;
    }
}
