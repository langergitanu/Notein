package com.aspose.slides.internal.p339pk;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9462x6 implements InterfaceC9461x1 {

    /* JADX INFO: renamed from: k4 */
    private int f34418k4;

    /* JADX INFO: renamed from: x1 */
    private C12007ix f34420x1 = C12007ix.f40519k4.Clone();

    /* JADX INFO: renamed from: kk */
    private final List<C12007ix> f34419kk = new List<>();

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final int mo46244k4() {
        return 4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12007ix m46457kk() {
        return this.f34420x1;
    }

    /* JADX INFO: renamed from: to */
    public final List<C12007ix> m46458to() {
        return this.f34419kk;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: x1 */
    public final int mo46249x1() {
        return this.f34418k4;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final void mo46246k4(int i) {
        this.f34418k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46455k4(C9456ks c9456ks) {
        c9456ks.m13386x6();
        c9456ks.m13386x6();
        int iM13386x6 = c9456ks.m13386x6();
        c9456ks.m13386x6();
        c9456ks.m46372to().CloneTo(this.f34420x1);
        this.f34419kk.clear();
        for (int i = 0; i < iM13386x6; i++) {
            this.f34419kk.addItem(c9456ks.m46372to().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46456k4(C9458rv c9458rv) {
        c9458rv.m13381rv();
        c9458rv.m13381rv();
        c9458rv.m13386x6();
        c9458rv.m13381rv();
        short sM13381rv = c9458rv.m13381rv();
        c9458rv.m13381rv();
        c9458rv.m46395to().CloneTo(this.f34420x1);
        this.f34419kk.clear();
        for (int i = 0; i < sM13381rv; i++) {
            int iM13382u4 = c9458rv.m13382u4() & 65535;
            int iM13382u42 = c9458rv.m13382u4() & 65535;
            int iM13382u43 = c9458rv.m13382u4() & 65535;
            for (int i2 = 0; i2 < iM13382u4; i2++) {
                this.f34419kk.addItem(new C12007ix(c9458rv.m13382u4() & 65535, iM13382u42, (c9458rv.m13382u4() & 65535) - r8, iM13382u43 - iM13382u42));
            }
            c9458rv.m13382u4();
        }
    }
}
