package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10953ck extends AbstractC10981yj {

    /* JADX INFO: renamed from: du */
    private static final C5659x1 f38166du = C9763ck.m48030to().m48331k4("Times New Roman", 12.0f, 0);

    /* JADX INFO: renamed from: k4 */
    private int f38167k4;

    /* JADX INFO: renamed from: kk */
    private C5659x1 f38168kk;

    /* JADX INFO: renamed from: to */
    private C12015qq f38169to;

    /* JADX INFO: renamed from: x1 */
    private List<String> f38170x1;

    public C10953ck() {
        this.f38168kk = f38166du;
        this.f38169to = C12015qq.f40552k4.Clone();
    }

    /* JADX INFO: renamed from: du */
    public final C12015qq m52911du() {
        return this.f38169to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5659x1 m52912k4() {
        return this.f38168kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int m52917kk() {
        return this.f38167k4;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10981yj
    /* JADX INFO: renamed from: to */
    public C12007ix mo52867to() {
        if (!this.f38169to.m56696k4()) {
            return new C12007ix(m53142h4().Clone(), this.f38169to.Clone());
        }
        float fM23114dy = this.f38168kk.m23114dy();
        float fM23114dy2 = this.f38168kk.m23114dy();
        for (int i = 0; i < this.f38170x1.size(); i++) {
            C12015qq c12015qqClone = this.f38168kk.m23126x1(this.f38170x1.get_Item(i)).Clone();
            if (c12015qqClone.m56699x1() > fM23114dy) {
                fM23114dy = c12015qqClone.m56699x1();
            }
            if (c12015qqClone.m56697kk() > fM23114dy2) {
                fM23114dy2 = c12015qqClone.m56697kk();
            }
        }
        return new C12007ix(m53142h4().Clone(), new C12015qq(fM23114dy + 3.5f, fM23114dy2));
    }

    /* JADX INFO: renamed from: x1 */
    public final List<String> m52918x1() {
        return this.f38170x1;
    }

    public C10953ck(C12025x6 c12025x6, String str, List<String> list, int i) {
        super(new C12025x6(c12025x6.m56897x1() - 1.75f, c12025x6.m56895kk()), str);
        this.f38168kk = f38166du;
        this.f38169to = C12015qq.f40552k4.Clone();
        this.f38170x1 = list;
        this.f38167k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52913k4(int i) {
        this.f38167k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52914k4(List<String> list) {
        this.f38170x1 = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52915k4(C5659x1 c5659x1) {
        this.f38168kk = c5659x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52916k4(C12015qq c12015qq) {
        c12015qq.CloneTo(this.f38169to);
    }
}
