package o0ooOoo;

import java.util.Arrays;
import o0oo0ooo.C31412OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31437OooO0o;

/* JADX INFO: renamed from: o0ooOoo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31676OooO0oo implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C31676OooO0oo f113214OooOo = new C31676OooO0oo(612.0f, 792.0f);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31433OooO00o f113215OooOo0o;

    static {
        new C31676OooO0oo(612.0f, 1008.0f);
        new C31676OooO0oo(2383.937f, 3370.3938f);
        new C31676OooO0oo(1683.7795f, 2383.937f);
        new C31676OooO0oo(1190.5513f, 1683.7795f);
        new C31676OooO0oo(841.8898f, 1190.5513f);
        new C31676OooO0oo(595.27563f, 841.8898f);
        new C31676OooO0oo(419.52756f, 595.27563f);
        new C31676OooO0oo(297.63782f, 419.52756f);
    }

    public C31676OooO0oo() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final float OooO00o() {
        return OooO0o0() - OooO0OO();
    }

    public final float OooO0O0() {
        return ((AbstractC31443OooOO0o) this.f113215OooOo0o.Oooo0(0)).OooOooo();
    }

    public final float OooO0OO() {
        return ((AbstractC31443OooOO0o) this.f113215OooOo0o.Oooo0(1)).OooOooo();
    }

    public final float OooO0Oo() {
        return ((AbstractC31443OooOO0o) this.f113215OooOo0o.Oooo0(2)).OooOooo();
    }

    public final float OooO0o() {
        return OooO0Oo() - OooO0O0();
    }

    public final float OooO0o0() {
        return ((AbstractC31443OooOO0o) this.f113215OooOo0o.Oooo0(3)).OooOooo();
    }

    public final void OooO0oO(float f) {
        this.f113215OooOo0o.o0000O0O(2, new C31437OooO0o(f));
    }

    public final void OooO0oo(float f) {
        this.f113215OooOo0o.o0000O0O(3, new C31437OooO0o(f));
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113215OooOo0o;
    }

    public final String toString() {
        return "[" + OooO0O0() + "," + OooO0OO() + "," + OooO0Oo() + "," + OooO0o0() + "]";
    }

    public C31676OooO0oo(float f, float f2) {
        this(0.0f, 0.0f, f, f2);
    }

    public C31676OooO0oo(float f, float f2, float f3, float f4) {
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        this.f113215OooOo0o = c31433OooO00o;
        c31433OooO00o.OooOooo(new C31437OooO0o(f));
        c31433OooO00o.OooOooo(new C31437OooO0o(f2));
        c31433OooO00o.OooOooo(new C31437OooO0o(f + f3));
        c31433OooO00o.OooOooo(new C31437OooO0o(f2 + f4));
    }

    public C31676OooO0oo(C31412OooO00o c31412OooO00o) {
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        this.f113215OooOo0o = c31433OooO00o;
        c31433OooO00o.OooOooo(new C31437OooO0o(c31412OooO00o.f112165OooO00o));
        c31433OooO00o.OooOooo(new C31437OooO0o(c31412OooO00o.f112166OooO0O0));
        c31433OooO00o.OooOooo(new C31437OooO0o(c31412OooO00o.f112167OooO0OO));
        c31433OooO00o.OooOooo(new C31437OooO0o(c31412OooO00o.f112168OooO0Oo));
    }

    public C31676OooO0oo(C31433OooO00o c31433OooO00o) {
        float[] fArr = new float[c31433OooO00o.f112214OooOo.size()];
        for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
            fArr[i] = abstractC31434OooO0O0Oooo0OO instanceof AbstractC31443OooOO0o ? ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO).OooOooo() : 0.0f;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, 4);
        C31433OooO00o c31433OooO00o2 = new C31433OooO00o();
        this.f113215OooOo0o = c31433OooO00o2;
        c31433OooO00o2.OooOooo(new C31437OooO0o(Math.min(fArrCopyOf[0], fArrCopyOf[2])));
        c31433OooO00o2.OooOooo(new C31437OooO0o(Math.min(fArrCopyOf[1], fArrCopyOf[3])));
        c31433OooO00o2.OooOooo(new C31437OooO0o(Math.max(fArrCopyOf[0], fArrCopyOf[2])));
        c31433OooO00o2.OooOooo(new C31437OooO0o(Math.max(fArrCopyOf[1], fArrCopyOf[3])));
    }
}
