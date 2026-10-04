package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class qic extends AbstractC14278pe {

    /* JADX INFO: renamed from: h4 */
    private AbstractC14071k4<AbstractC14278pe> f48352h4;

    /* JADX INFO: renamed from: to */
    private oju f48354to;

    /* JADX INFO: renamed from: du */
    private oju f48351du = new oju();

    /* JADX INFO: renamed from: kk */
    public final AbstractC7018k4<AbstractC14071k4<AbstractC14278pe>> f48353kk = new AbstractC7018k4<AbstractC14071k4<AbstractC14278pe>>() { // from class: com.aspose.slides.qic.1
        {
            qic.this.f48352h4 = new AbstractC14071k4<AbstractC14278pe>() { // from class: com.aspose.slides.qic.1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public void invoke(AbstractC14278pe abstractC14278pe) {
                    Iterator it = ((AbstractC7018k4) C143481.this).f19081x1.iterator();
                    while (it.hasNext()) {
                        ((AbstractC14071k4) it.next()).invoke(abstractC14278pe);
                    }
                }
            };
        }
    };

    public qic(Paragraph paragraph, Shape shape) {
        this.f48354to = new oju();
        C12007ix c12007ixClone = paragraph.m2170x1().Clone();
        IShapeFrame frame = shape.getFrame();
        c12007ixClone.m56566kk(frame.getX() + c12007ixClone.m56557jd());
        c12007ixClone.m56572to(frame.getY() + c12007ixClone.m56551ck());
        this.f48354to = new oju(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
        m69664k4(new oju(c12007ixClone.m56550c5(), c12007ixClone.m56575x1()));
    }

    /* JADX INFO: renamed from: kk */
    public final ohe m69665kk() {
        return new ohe(this.f48354to.Clone(), mo69029x1().Clone());
    }

    @Override // com.aspose.slides.AbstractC14278pe
    /* JADX INFO: renamed from: x1 */
    public final oju mo69029x1() {
        return this.f48351du.Clone();
    }

    @Override // com.aspose.slides.AbstractC14278pe
    /* JADX INFO: renamed from: k4 */
    public final oju mo69028k4() {
        return this.f48354to;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69664k4(oju ojuVar) {
        this.f48351du = ojuVar.Clone();
    }
}
