package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14071k4;

/* JADX INFO: loaded from: classes3.dex */
class vjj extends AbstractC14278pe {

    /* JADX INFO: renamed from: du */
    private int f49576du = 1;

    /* JADX INFO: renamed from: dy */
    private oju f49577dy;

    /* JADX INFO: renamed from: h4 */
    private oju f49578h4;

    /* JADX INFO: renamed from: kk */
    final Shape f49579kk;

    /* JADX INFO: renamed from: m9 */
    private oju f49580m9;

    /* JADX INFO: renamed from: to */
    private final C14571tq f49581to;

    public vjj(Shape shape, C14571tq c14571tq) {
        this.f49578h4 = new oju();
        this.f49580m9 = new oju();
        this.f49577dy = new oju();
        this.f49579kk = shape;
        this.f49581to = c14571tq;
        C12007ix c12007ixClone = shape.m2546bz().m5628ck().Clone();
        this.f49578h4 = new oju(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
        this.f49580m9 = new oju(c12007ixClone.m56550c5(), c12007ixClone.m56575x1());
        IShapeFrame frame = shape.getFrame();
        this.f49577dy = new oju(c12007ixClone.m56557jd() - frame.getX(), c12007ixClone.m56551ck() - frame.getY());
    }

    @Override // com.aspose.slides.AbstractC14278pe
    /* JADX INFO: renamed from: k4 */
    public final oju mo69028k4() {
        return this.f49578h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m72333kk() {
        this.f49576du++;
    }

    /* JADX INFO: renamed from: to */
    public final void m72334to() {
        int i = this.f49576du;
        if (i > 0) {
            int i2 = i - 1;
            this.f49576du = i2;
            if (i2 == 0) {
                this.f49581to.m71285k4(this);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14278pe
    /* JADX INFO: renamed from: x1 */
    public final oju mo69029x1() {
        return this.f49580m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72332k4(oju ojuVar) {
        oju.m68619k4(ojuVar, this.f49577dy).CloneTo(this.f49578h4);
        AbstractC14071k4<AbstractC14278pe> abstractC14071k4 = this.f48034k4;
        if (abstractC14071k4 != null) {
            abstractC14071k4.invoke(this);
        }
    }
}
