package com.aspose.slides.internal.p298nh;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6887du extends AbstractC6890h4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12008jd f18835k4;

    public C6887du(AbstractC12008jd abstractC12008jd) {
        this.f18835k4 = abstractC12008jd;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f18835k4.dispose();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: du */
    public C11913yj mo9688du() {
        return this.f18835k4.mo17577u4();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9691k4(int i) {
        this.f18835k4.mo17495k4(i);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: kk */
    public int mo9701kk() {
        return this.f18835k4.mo17477dy();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: to */
    public int mo9703to() {
        return this.f18835k4.mo17566ks();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: x1 */
    public C12018u4 mo9704x1() {
        return this.f18835k4.mo17480h4();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9692k4(AbstractC6888dy abstractC6888dy, C12014ne c12014ne, float f, float f2, float f3, float f4, int i) {
        if (abstractC6888dy == null) {
            throw new ArgumentNullException("image");
        }
        this.f18835k4.mo17509k4(((C6895to) abstractC6888dy).m27022k4(), c12014ne.Clone(), f, f2, f3, f4, i);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: kk */
    public void mo9702kk(int i) {
        this.f18835k4.mo17481h4(i);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: x1 */
    public void mo9705x1(int i) {
        this.f18835k4.mo17476du(i);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9693k4(AbstractC6888dy abstractC6888dy, C12014ne c12014ne, float f, float f2, float f3, float f4, int i, C6885c5 c6885c5) {
        if (abstractC6888dy == null) {
            throw new ArgumentNullException("image");
        }
        this.f18835k4.mo17510k4(((C6895to) abstractC6888dy).m27022k4(), c12014ne.Clone(), f, f2, f3, f4, i, c6885c5 == null ? null : c6885c5.m26951kk());
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: x1 */
    public void mo9706x1(C12018u4 c12018u4) {
        this.f18835k4.mo17590x1(c12018u4);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9694k4(C6889fa c6889fa, C11896dy c11896dy) {
        if (c6889fa == null) {
            throw new ArgumentNullException("pen");
        }
        this.f18835k4.mo17540k4(c6889fa.m26974k4(), c11896dy);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9695k4(AbstractC6897x1 abstractC6897x1, C11896dy c11896dy) {
        if (abstractC6897x1 == null) {
            throw new ArgumentNullException("brush");
        }
        this.f18835k4.mo17527k4(abstractC6897x1.mo26959k4(), c11896dy);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9696k4(AbstractC6897x1 abstractC6897x1, C12007ix c12007ix) {
        if (abstractC6897x1 == null) {
            throw new ArgumentNullException("brush");
        }
        this.f18835k4.mo17593x1(abstractC6897x1.mo26959k4(), c12007ix.Clone());
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9698k4(C11913yj c11913yj) {
        this.f18835k4.mo17588x1(c11913yj);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9699k4(C12007ix c12007ix, int i) {
        this.f18835k4.mo17519k4(c12007ix.Clone(), i);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9700k4(C12018u4 c12018u4, int i) {
        this.f18835k4.mo17523k4(c12018u4, i);
    }
}
