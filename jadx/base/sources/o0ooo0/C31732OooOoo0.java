package o0ooo0;

import android.graphics.Path;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0oo0ooo.C31412OooO00o;
import o0ooO0OO.C31431OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31437OooO0o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0oo.C31491OooO0oO;
import o0ooOoo.C31676OooO0oo;
import o0ooo0O.AbstractC31753OooO0OO;
import o0ooo0O.C31752OooO0O0;
import o0ooo0O.C31754OooO0Oo;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31732OooOoo0 extends AbstractC31726OooOo0O {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C31412OooO00o f113353Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C31436OooO0Oo f113354Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C31837OooO0OO f113355Oooo00o;

    @Override // o0ooo0.AbstractC31720OooOOOo, o0ooo0.InterfaceC31721OooOOo
    public final C31837OooO0OO OooO00o() {
        if (this.f113355Oooo00o == null) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113309OooOo0o.o0000O0O(C31441OooOO0.f112313o000O000);
            if (!(abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o)) {
                return AbstractC31720OooOOOo.f113307OooOoo;
            }
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
            C31837OooO0OO c31837OooO0OO = new C31837OooO0OO();
            c31837OooO0OO.f113464OooOo0o = new float[]{((AbstractC31443OooOO0o) c31433OooO00o.Oooo0OO(0)).OooOooo(), ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0OO(1)).OooOooo(), 0.0f, ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0OO(2)).OooOooo(), ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0OO(3)).OooOooo(), 0.0f, ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0OO(4)).OooOooo(), ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0OO(5)).OooOooo(), 1.0f};
            this.f113355Oooo00o = c31837OooO0OO;
        }
        return this.f113355Oooo00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // o0ooo0.InterfaceC31721OooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float OooO0O0(int i) throws IOException {
        C31730OooOoOO c31730OooOoOO;
        String strOooO0Oo = this.f113325OooOooO.OooO0Oo(i);
        if (this.f113354Oooo00O == null) {
            this.f113354Oooo00O = this.f113309OooOo0o.Oooo0OO(C31441OooOO0.f112271Oooooo);
        }
        C31436OooO0Oo c31436OooO0Oo = this.f113354Oooo00O;
        if (c31436OooO0Oo == null) {
            c31730OooOoOO = null;
        } else {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.OooOooo(strOooO0Oo));
            C31448OooOOo c31448OooOOo = abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo ? (C31448OooOOo) abstractC31434OooO0O0O0000O0O : null;
            if (c31448OooOOo != null) {
                c31730OooOoOO = new C31730OooOoOO(c31448OooOOo);
            }
        }
        if (c31730OooOoOO == null) {
            return 0.0f;
        }
        if (c31730OooOoOO.f113352OooOo0o.o000O00O(C31441OooOO0.f112340o000OooO, null, 0) == 0) {
            return 0.0f;
        }
        ArrayList arrayList = new ArrayList();
        C31491OooO0oO c31491OooO0oO = new C31491OooO0oO(c31730OooOoOO);
        for (Object objOooOo0O = c31491OooO0oO.OooOo0O(); objOooOo0O != null; objOooOo0O = c31491OooO0oO.OooOo0O()) {
            if (objOooOo0O instanceof C31431OooO00o) {
                String str = ((C31431OooO00o) objOooOo0O).f112205OooO00o;
                if (!str.equals("d0") && !str.equals("d1")) {
                    throw new IOException("First operator must be d0 or d1");
                }
                AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) arrayList.get(0);
                if (abstractC31434OooO0O0 instanceof AbstractC31443OooOO0o) {
                    return ((AbstractC31443OooOO0o) abstractC31434OooO0O0).OooOooo();
                }
                throw new IOException("Unexpected argument type: ".concat(abstractC31434OooO0O0.getClass().getName()));
            }
            arrayList.add((AbstractC31434OooO0O0) objOooOo0O);
        }
        throw new IOException("Unexpected end of stream");
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31412OooO00o OooO0OO() {
        if (this.f113353Oooo0 == null) {
            C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112304o0000oO0;
            C31436OooO0Oo c31436OooO0Oo = this.f113309OooOo0o;
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
            C31676OooO0oo c31676OooO0oo = abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o ? new C31676OooO0oo((C31433OooO00o) abstractC31434OooO0O0O0000O0O) : null;
            float fOooO0O0 = c31676OooO0oo.OooO0O0();
            C31433OooO00o c31433OooO00o = c31676OooO0oo.f113215OooOo0o;
            if (fOooO0O0 == 0.0f && c31676OooO0oo.OooO0OO() == 0.0f && c31676OooO0oo.OooO0Oo() == 0.0f && c31676OooO0oo.OooO0o0() == 0.0f) {
                if (this.f113354Oooo00O == null) {
                    this.f113354Oooo00O = c31436OooO0Oo.Oooo0OO(C31441OooOO0.f112271Oooooo);
                }
                C31436OooO0Oo c31436OooO0Oo2 = this.f113354Oooo00O;
                Iterator it = c31436OooO0Oo2.f112222OooOoO0.keySet().iterator();
                while (it.hasNext()) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo2.o0000O0O((C31441OooOO0) it.next());
                    if (abstractC31434OooO0O0O0000O0O2 instanceof C31448OooOOo) {
                        try {
                            C31676OooO0oo c31676OooO0ooOooO0O0 = new C31730OooOoOO((C31448OooOOo) abstractC31434OooO0O0O0000O0O2).OooO0O0();
                            if (c31676OooO0ooOooO0O0 != null) {
                                c31433OooO00o.o0000O0O(0, new C31437OooO0o(Math.min(c31676OooO0oo.OooO0O0(), c31676OooO0ooOooO0O0.OooO0O0())));
                                c31433OooO00o.o0000O0O(1, new C31437OooO0o(Math.min(c31676OooO0oo.OooO0OO(), c31676OooO0ooOooO0O0.OooO0OO())));
                                c31676OooO0oo.OooO0oO(Math.max(c31676OooO0oo.OooO0Oo(), c31676OooO0ooOooO0O0.OooO0Oo()));
                                c31676OooO0oo.OooO0oo(Math.max(c31676OooO0oo.OooO0o0(), c31676OooO0ooOooO0O0.OooO0o0()));
                            }
                        } catch (IOException unused) {
                        }
                    }
                }
            }
            this.f113353Oooo0 = new C31412OooO00o(c31676OooO0oo.OooO0O0(), c31676OooO0oo.OooO0OO(), c31676OooO0oo.OooO0Oo(), c31676OooO0oo.OooO0o0());
        }
        return this.f113353Oooo0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final byte[] OooO0o(int i) throws IOException {
        throw new UnsupportedOperationException("Not implemented: Type3");
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final float OooOO0O(int i) throws IOException {
        Float f;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112296o0000Oo;
        C31436OooO0Oo c31436OooO0Oo = this.f113309OooOo0o;
        int iO000O00O = c31436OooO0Oo.o000O00O(c31441OooOO0, null, -1);
        int iO000O00O2 = c31436OooO0Oo.o000O00O(C31441OooOO0.f112339o000Ooo0, null, -1);
        List<Float> listOooOO0o = OooOO0o();
        if (listOooOO0o.isEmpty() || i < iO000O00O || i > iO000O00O2) {
            C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
            return c31722OooOOo0 != null ? c31722OooOOo0.f113315OooOo0o.o0000ooO(C31441OooOO0.f112352o000o0oO, 0.0f) : OooO0O0(i);
        }
        int i2 = i - iO000O00O;
        if (i2 < listOooOO0o.size() && (f = listOooOO0o.get(i2)) != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    @Override // o0ooo0.AbstractC31726OooOo0O, o0ooo0.AbstractC31720OooOOOo
    public final boolean OooOOO0() {
        return false;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final int OooOOOO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        return byteArrayInputStream.read();
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final Path OooOOoo(String str) throws IOException {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final void OooOo0() throws IOException {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113309OooOo0o.o0000O0O(C31441OooOO0.f112291o0000O0O);
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            C31441OooOO0 c31441OooOO0 = (C31441OooOO0) abstractC31434OooO0O0O0000O0O;
            AbstractC31753OooO0OO abstractC31753OooO0OOOooO0OO = AbstractC31753OooO0OO.OooO0OO(c31441OooOO0);
            this.f113325OooOooO = abstractC31753OooO0OOOooO0OO;
            if (abstractC31753OooO0OOOooO0OO == null) {
                Log.w("PdfBox-Android", "Unknown encoding: " + c31441OooOO0.f112461OooOo);
            }
        } else if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            this.f113325OooOooO = new C31752OooO0O0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O);
        }
        this.f113326OooOooo = C31754OooO0Oo.f113393OooO0Oo;
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final AbstractC31753OooO0OO OooOo0O() throws IOException {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final String getName() {
        return this.f113309OooOo0o.o000OOO(C31441OooOO0.f112359o000oo0O);
    }
}
