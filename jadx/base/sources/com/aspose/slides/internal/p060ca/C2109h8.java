package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.h8 */
/* JADX INFO: loaded from: classes3.dex */
public class C2109h8 extends AbstractC2166kq {

    /* JADX INFO: renamed from: c5 */
    private int f7288c5;

    /* JADX INFO: renamed from: du */
    private C2083fb f7289du;

    /* JADX INFO: renamed from: dy */
    private int f7290dy;

    /* JADX INFO: renamed from: h4 */
    private C2083fb f7291h4;

    /* JADX INFO: renamed from: jd */
    private List<C2207n2> f7292jd;

    /* JADX INFO: renamed from: kk */
    private int f7293kk;

    /* JADX INFO: renamed from: to */
    private int f7294to;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7295x1;

    public C2109h8(long j, int i) {
        super(j, i);
        this.f7292jd = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final C2207n2[] m10666c5() {
        return this.f7292jd.toArray(new C2207n2[0]);
    }

    /* JADX INFO: renamed from: du */
    public final C2083fb m10667du() {
        return this.f7289du;
    }

    /* JADX INFO: renamed from: dy */
    public final int m10668dy() {
        return this.f7288c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final C2083fb m10669h4() {
        return this.f7291h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        long j;
        C2261qj c2261qj;
        int i;
        long jM11154k4 = c2212n9.m11154k4();
        long j2 = this.f7845k4;
        long j3 = 4294967295L;
        if (jM11154k4 != (((j2 & 4294967295L) + 2) & 4294967295L)) {
            c2212n9.m11159k4(((j2 & 4294967295L) + 2) & 4294967295L);
        }
        int iM11151fa = c2212n9.m11151fa();
        this.f7293kk = c2212n9.m11151fa();
        this.f7294to = c2212n9.m11151fa();
        int iM11151fa2 = c2212n9.m11151fa();
        int iM11151fa3 = c2212n9.m11151fa();
        int i2 = 65535;
        this.f7290dy = c2212n9.m11151fa() & 65535;
        this.f7288c5 = c2212n9.m11151fa() & 65535;
        int i3 = 0;
        while (i3 < this.f7290dy) {
            List list = new List();
            int i4 = 0;
            while (i4 < this.f7288c5) {
                int i5 = this.f7293kk;
                C2261qj c2261qj2 = null;
                if ((i5 & i2) != 0) {
                    j = j3;
                    c2261qj = (C2261qj) AbstractC2282s0.m11353k4(new C2261qj(i5, c2212n9.m11154k4(), this.f7845k4 & j, true), c2212n9);
                } else {
                    j = j3;
                    c2261qj = null;
                }
                int i6 = this.f7294to;
                if ((i6 & i2) != 0) {
                    i = i2;
                    c2261qj2 = (C2261qj) AbstractC2282s0.m11353k4(new C2261qj(i6, c2212n9.m11154k4(), this.f7845k4 & j, true), c2212n9);
                } else {
                    i = i2;
                }
                list.addItem(new C2259qe(c2261qj, c2261qj2));
                i4++;
                i2 = i;
                j3 = j;
            }
            this.f7292jd.addItem(new C2207n2(list));
            i3++;
            j3 = j3;
        }
        long j4 = j3;
        int i7 = i2;
        this.f7295x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & j4, iM11151fa & i7), c2212n9);
        this.f7289du = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(this.f7845k4 & j4, iM11151fa2 & i7), c2212n9);
        this.f7291h4 = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(this.f7845k4 & j4, iM11151fa3 & i7), c2212n9);
    }

    /* JADX INFO: renamed from: kk */
    public final int m10670kk() {
        return this.f7293kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m10671m9() {
        return this.f7290dy;
    }

    /* JADX INFO: renamed from: to */
    public final int m10672to() {
        return this.f7294to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m10673x1() {
        return this.f7295x1;
    }
}
