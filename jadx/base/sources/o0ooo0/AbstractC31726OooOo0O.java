package o0ooo0;

import android.graphics.Path;
import android.util.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import o0oo0o0o.C31324OooO0O0;
import o0oo0o0o.C31325OooO0OO;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooo0O.AbstractC31753OooO0OO;
import o0ooo0O.C31752OooO0O0;
import o0ooo0O.C31754OooO0Oo;

/* JADX INFO: renamed from: o0ooo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31726OooOo0O extends AbstractC31720OooOOOo {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public AbstractC31753OooO0OO f113325OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C31754OooO0Oo f113326OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Boolean f113327Oooo000;

    public AbstractC31726OooOo0O() {
        new HashSet();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final float OooO(int i) {
        C31325OooO0OO c31325OooO0OO = this.f113311OooOoO0;
        if (c31325OooO0OO == null) {
            throw new IllegalStateException("No AFM");
        }
        String strOooO0Oo = this.f113325OooOooO.OooO0Oo(i);
        if (".notdef".equals(strOooO0Oo)) {
            return 250.0f;
        }
        if ("nbspace".equals(strOooO0Oo)) {
            strOooO0Oo = "space";
        } else if ("sfthyphen".equals(strOooO0Oo)) {
            strOooO0Oo = "hyphen";
        }
        C31324OooO0O0 c31324OooO0O0 = (C31324OooO0O0) c31325OooO0OO.f111856OooOOO0.get(strOooO0Oo);
        if (c31324OooO0O0 != null) {
            return c31324OooO0O0.f111841OooO0O0;
        }
        return 0.0f;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final void OooO0o0(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public boolean OooOOO0() {
        AbstractC31753OooO0OO abstractC31753OooO0OO = this.f113325OooOooO;
        if (abstractC31753OooO0OO instanceof C31752OooO0O0) {
            C31752OooO0O0 c31752OooO0O0 = (C31752OooO0O0) abstractC31753OooO0OO;
            if (c31752OooO0O0.f113390OooOoOO.size() > 0) {
                for (Map.Entry entry : c31752OooO0O0.f113390OooOoOO.entrySet()) {
                    if (!((String) entry.getValue()).equals(c31752OooO0O0.f113388OooOoO.OooO0Oo(((Integer) entry.getKey()).intValue()))) {
                        return false;
                    }
                }
            }
        }
        return super.OooOOO0();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final void OooOOOo() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final boolean OooOOo() {
        return false;
    }

    public abstract Path OooOOoo(String str) throws IOException;

    public void OooOo0() throws IOException {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113309OooOo0o.o0000O0O(C31441OooOO0.f112291o0000O0O);
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            C31441OooOO0 c31441OooOO0 = (C31441OooOO0) abstractC31434OooO0O0O0000O0O;
            AbstractC31753OooO0OO abstractC31753OooO0OOOooO0OO = AbstractC31753OooO0OO.OooO0OO(c31441OooOO0);
            this.f113325OooOooO = abstractC31753OooO0OOOooO0OO;
            if (abstractC31753OooO0OOOooO0OO == null) {
                Log.w("PdfBox-Android", "Unknown encoding: " + c31441OooOO0.f112461OooOo);
                this.f113325OooOooO = OooOo0O();
            }
        } else if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) abstractC31434OooO0O0O0000O0O;
            Boolean boolOooOo00 = OooOo00();
            C31441OooOO0 c31441OooOO0O0Oo0oo = c31436OooO0Oo.o0Oo0oo(C31441OooOO0.f112257OoooO0);
            AbstractC31753OooO0OO abstractC31753OooO0OOOooOo0O = ((c31441OooOO0O0Oo0oo == null || AbstractC31753OooO0OO.OooO0OO(c31441OooOO0O0Oo0oo) == null) && Boolean.TRUE.equals(boolOooOo00)) ? OooOo0O() : null;
            if (boolOooOo00 == null) {
                boolOooOo00 = Boolean.FALSE;
            }
            this.f113325OooOooO = new C31752OooO0O0(c31436OooO0Oo, !boolOooOo00.booleanValue(), abstractC31753OooO0OOOooOo0O);
        } else if (abstractC31434OooO0O0O0000O0O == null) {
            this.f113325OooOooO = OooOo0O();
        }
        if ("ZapfDingbats".equals((String) C31733OooOooO.f113356OooO00o.get(getName()))) {
            this.f113326OooOooo = C31754OooO0Oo.f113394OooO0o0;
        } else {
            this.f113326OooOooo = C31754OooO0Oo.f113393OooO0Oo;
        }
    }

    public final Boolean OooOo00() {
        C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
        if (c31722OooOOo0 != null) {
            return Boolean.valueOf(c31722OooOOo0.OooO0o0(4));
        }
        return null;
    }

    public abstract AbstractC31753OooO0OO OooOo0O() throws IOException;

    public AbstractC31726OooOo0O(C31436OooO0Oo c31436OooO0Oo) throws IOException {
        super(c31436OooO0Oo);
        new HashSet();
    }
}
