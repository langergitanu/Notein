package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class cxw implements InterfaceC14190no {

    /* JADX INFO: renamed from: du */
    private float f4503du;

    /* JADX INFO: renamed from: h4 */
    private float f4504h4;

    /* JADX INFO: renamed from: k4 */
    private final C0950eh f4505k4;

    /* JADX INFO: renamed from: kk */
    private float f4506kk;

    /* JADX INFO: renamed from: to */
    private float f4507to;

    /* JADX INFO: renamed from: x1 */
    private List<IShape> f4508x1;

    public cxw(C0950eh c0950eh, IShape iShape) {
        this.f4505k4 = c0950eh;
        m4868k4(new List<>());
        m4874kk().addItem(iShape);
        m4879x1(iShape.getX());
        m4877to(iShape.getY());
        m4875kk(iShape.getWidth() + iShape.getX());
        m4872k4(iShape.getHeight() + iShape.getY());
    }

    /* JADX INFO: renamed from: h4 */
    private void m4867h4() {
        List<IShape> list = new List<>(m4874kk());
        int i = 0;
        while (i < m4874kk().size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < m4874kk().size(); i3++) {
                if (m4874kk().get_Item(i).getZOrderPosition() > m4874kk().get_Item(i3).getZOrderPosition()) {
                    IShape iShape = list.get_Item(i3);
                    list.set_Item(i3, list.get_Item(i));
                    list.set_Item(i, iShape);
                }
            }
            i = i2;
        }
        m4868k4(list);
    }

    /* JADX INFO: renamed from: du */
    public final float m4869du() {
        return this.f4503du;
    }

    @Override // com.aspose.slides.InterfaceC14190no
    /* JADX INFO: renamed from: k4 */
    public final float mo4870k4() {
        return this.f4507to;
    }

    /* JADX INFO: renamed from: kk */
    public final List<IShape> m4874kk() {
        return this.f4508x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m4876to() {
        return this.f4506kk;
    }

    @Override // com.aspose.slides.InterfaceC14190no
    /* JADX INFO: renamed from: x1 */
    public final float mo4878x1() {
        return this.f4504h4;
    }

    @Override // com.aspose.slides.InterfaceC14190no
    /* JADX INFO: renamed from: k4 */
    public final String mo4871k4(InterfaceC1140gd interfaceC1140gd) {
        m4867h4();
        C0950eh c0950eh = this.f4505k4;
        String strM4042k4 = C0807b7.m4042k4(this, c0950eh.f4789k4, c0950eh.f4791x1);
        interfaceC1140gd.mo6493k4(C14113y2.m67402k4("{0}{1}", this.f4505k4.f4791x1.m64566kk(), strM4042k4));
        return strM4042k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m4875kk(float f) {
        this.f4503du = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m4877to(float f) {
        this.f4504h4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4879x1(float f) {
        this.f4507to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4872k4(float f) {
        this.f4506kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4868k4(List<IShape> list) {
        this.f4508x1 = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4873k4(IShape iShape) {
        m4874kk().addItem(iShape);
    }
}
