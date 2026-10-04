package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10511kn;
import com.aspose.slides.internal.p407st.C10724y1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class z9q extends uz3 {

    /* JADX INFO: renamed from: c5 */
    private rpo f50502c5;

    /* JADX INFO: renamed from: ck */
    private C10511kn f50503ck;

    /* JADX INFO: renamed from: jd */
    private List<au9> f50504jd;

    public z9q(GroupShape groupShape, z9q z9qVar) {
        this(z9qVar);
        this.f3954k4 = groupShape;
        if (m3738du() != null) {
            m3738du().m70237x1(this);
        }
        m72005rv();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m74352c5() {
        if (this.f50503ck != null) {
            return;
        }
        if (m74358up()) {
            this.f50503ck = m3738du().m70207du().m51560to();
            this.f49440m9 = true;
        } else {
            C10511kn c10511kn = new C10511kn();
            this.f50503ck = c10511kn;
            c10511kn.m50512x1(true);
        }
    }

    /* JADX INFO: renamed from: ck */
    public final C10511kn m74353ck() {
        if (this.f50503ck == null) {
            mo3740k4();
        }
        return this.f50503ck;
    }

    @Override // com.aspose.slides.uz3
    /* JADX INFO: renamed from: dy */
    public void mo5827dy() {
        m72012x6();
        if (this.f49440m9) {
            return;
        }
        this.f3955kk.m74353ck().m50513yj().addItem(this.f50503ck);
        this.f49440m9 = true;
    }

    /* JADX INFO: renamed from: fa */
    public final List<au9> m74354fa() {
        return this.f50504jd;
    }

    @Override // com.aspose.slides.uz3
    /* JADX INFO: renamed from: jd */
    public Shape mo64936jd() {
        return (GroupShape) this.f3954k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final PictureFrame m74355k4(IShape iShape, boolean z) {
        C12007ix c12007ix = new C12007ix(iShape.getX(), iShape.getY(), iShape.getWidth(), iShape.getHeight());
        if (!iShape.getHidden() && z) {
            ((Shape) iShape).m2546bz().m5628ck().CloneTo(c12007ix);
        }
        IPPImage iPPImageAddImage = iShape.getPresentation().getImages().addImage(new SvgImage(k3x.m63619k4((Shape) iShape, c12007ix.Clone())));
        PictureFrame pictureFrame = new PictureFrame((InterfaceC14397rj) iShape.getParentGroup());
        pictureFrame.getPictureFormat().setPictureFillMode(1);
        pictureFrame.m1591yj().m3331x1(5);
        pictureFrame.setFrame(new ShapeFrame(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), (byte) 0, (byte) 0, 0.0f));
        pictureFrame.getPictureFormat().getPicture().setImage(iPPImageAddImage);
        return pictureFrame;
    }

    @Override // com.aspose.slides.au9
    /* JADX INFO: renamed from: kk */
    public rpo mo3743kk() {
        z9q z9qVar = this.f3955kk;
        return z9qVar != null ? z9qVar.m3738du() : this.f50502c5;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m74358up() {
        return this.f50502c5 != null;
    }

    public z9q(rpo rpoVar) {
        this(rpoVar.m70235x1().f1077kk, null);
        this.f50502c5 = rpoVar;
    }

    @Override // com.aspose.slides.uz3, com.aspose.slides.au9
    /* JADX INFO: renamed from: k4 */
    public void mo3740k4() {
        m74352c5();
        C10462h9 c10462h9 = new C10462h9();
        this.f3957x1 = c10462h9;
        c10462h9.m50512x1(true);
        this.f50503ck.m50513yj().addItem(this.f3957x1);
        m72000ix().mo50865x1();
        C10724y1 c10724y1Mo50864to = m72000ix().mo50864to();
        c10724y1Mo50864to.m52039kk(m74358up());
        c10724y1Mo50864to.m52038k4(true);
    }

    public z9q(z9q z9qVar) {
        super(z9qVar);
        this.f50504jd = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74356k4(GroupShape groupShape) {
        IGenericEnumerator<IShape> it = groupShape.f2428k4.iterator();
        while (it.hasNext()) {
            try {
                m74357k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74357k4(IShape iShape) {
        if (C7019kk.m27469x1(iShape, IChart.class)) {
            new uz3(m74355k4(iShape, false), this);
            return;
        }
        if (C7019kk.m27469x1(iShape, Ink.class)) {
            new uz3(m74355k4(iShape, true), this);
            return;
        }
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) iShape, AutoShape.class);
        if (autoShape != null && autoShape.m288x1() != null && autoShape.m288x1().m2908jd().m2957ks() == 1 && ((ThreeDFormat) autoShape.m288x1().getTextFrameFormat().getThreeDFormat()).m3003du()) {
            new uz3(m74355k4(iShape, false), autoShape, this);
            return;
        }
        Table table = (Table) C7019kk.m27452k4((Object) iShape, Table.class);
        if (table != null) {
            new r9q(table, this);
            return;
        }
        LegacyDiagram legacyDiagram = (LegacyDiagram) C7019kk.m27452k4((Object) iShape, LegacyDiagram.class);
        if (legacyDiagram != null) {
            new mqt(legacyDiagram, this).m74356k4(legacyDiagram.m1858kk());
            return;
        }
        GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) iShape, GroupShape.class);
        if (groupShape != null) {
            new z9q(groupShape, this).m74356k4(groupShape);
            return;
        }
        Shape shape = (Shape) C7019kk.m27452k4((Object) iShape, Shape.class);
        if (shape == null) {
            throw new ArgumentNullException("Unknown shapes in ShapesGroup!");
        }
        new uz3(shape, this);
    }
}
