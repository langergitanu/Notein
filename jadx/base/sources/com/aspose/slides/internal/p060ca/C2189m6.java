package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.m6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2189m6 extends AbstractC2166kq {

    /* JADX INFO: renamed from: du */
    protected C2083fb f7612du;

    /* JADX INFO: renamed from: h4 */
    protected List<C2004au> f7613h4;

    /* JADX INFO: renamed from: kk */
    protected C2083fb f7614kk;

    /* JADX INFO: renamed from: to */
    protected C2083fb f7615to;

    /* JADX INFO: renamed from: x1 */
    protected C2330uy f7616x1;

    public C2189m6(long j, int i) {
        super(j, i);
        this.f7614kk = null;
        this.f7612du = null;
        this.f7613h4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C2083fb m11109du() {
        return this.f7612du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2004au m11110k4(int i) {
        return this.f7613h4.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final C2083fb m11111kk() {
        return this.f7614kk;
    }

    /* JADX INFO: renamed from: to */
    public final C2083fb m11112to() {
        return this.f7615to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m11113x1() {
        return this.f7616x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        long jM11154k4 = c2212n9.m11154k4();
        long j = this.f7845k4;
        if (jM11154k4 != (((j & 4294967295L) + 2) & 4294967295L)) {
            c2212n9.m11159k4(((j & 4294967295L) + 2) & 4294967295L);
        }
        int iM11151fa = c2212n9.m11151fa() & 65535;
        int iM11151fa2 = c2212n9.m11151fa() & 65535;
        int iM11151fa3 = c2212n9.m11151fa() & 65535;
        int iM11151fa4 = c2212n9.m11151fa() & 65535;
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        this.f7616x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
        if (iM11151fa2 != 0) {
            this.f7614kk = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(this.f7845k4 & 4294967295L, iM11151fa2), c2212n9);
        }
        this.f7615to = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(this.f7845k4 & 4294967295L, iM11151fa3), c2212n9);
        if (iM11151fa4 != 0) {
            this.f7612du = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(this.f7845k4 & 4294967295L, iM11151fa4), c2212n9);
        }
        for (int i = 0; i < listM11354x1.size(); i++) {
            int iIntValue = listM11354x1.get_Item(i).intValue() & 65535;
            if (iIntValue == 0) {
                this.f7613h4.addItem(null);
            } else {
                this.f7613h4.addItem((C2004au) AbstractC2282s0.m11353k4(new C2004au(((this.f7845k4 & 4294967295L) + ((long) iIntValue)) & 4294967295L), c2212n9));
            }
        }
    }
}
