package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class PictureFillFormat extends PVIObject implements IPictureFillFormat {

    /* JADX INFO: renamed from: du */
    private boolean f3022du;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<gb2> f3023k4;

    /* JADX INFO: renamed from: kk */
    private Picture f3024kk;

    /* JADX INFO: renamed from: to */
    private zn7 f3025to;

    /* JADX INFO: renamed from: x1 */
    private gb2 f3026x1;

    public PictureFillFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3023k4 = new AbstractC7018k4<gb2>() { // from class: com.aspose.slides.PictureFillFormat.1
            {
                PictureFillFormat.this.f3026x1 = new gb2() { // from class: com.aspose.slides.PictureFillFormat.1.1
                    @Override // com.aspose.slides.gb2
                    /* JADX INFO: renamed from: k4 */
                    public void mo1463k4() {
                        for (gb2 gb2Var : ((AbstractC7018k4) C05701.this).f19081x1) {
                            if (gb2Var != null) {
                                gb2Var.mo1463k4();
                            }
                        }
                    }
                };
            }
        };
        this.f3022du = true;
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new a5o(this.f3024kk, this.f3025to);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f3024kk = new Picture(this);
        this.f3025to = new zn7(this);
        this.f3024kk.f3014k4.mo27432x1(new a1l() { // from class: com.aspose.slides.PictureFillFormat.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PictureFillFormat.OnPictureFillFormatChanged()";
            }

            @Override // com.aspose.slides.a1l
            /* JADX INFO: renamed from: k4 */
            public void mo2243k4() {
                PictureFillFormat.this.m2246c5();
            }
        });
        this.f3025to.f50632k4.mo27432x1(new gb2() { // from class: com.aspose.slides.PictureFillFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PictureFillFormat.OnPictureFillFormatChanged()";
            }

            @Override // com.aspose.slides.gb2
            /* JADX INFO: renamed from: k4 */
            public void mo1463k4() {
                PictureFillFormat.this.m2246c5();
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final void m2246c5() {
        gb2 gb2Var = this.f3026x1;
        if (gb2Var == null || this.f3023k4.m27430k4()) {
            return;
        }
        gb2Var.mo1463k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.aspose.slides.internal.wh.ck] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.aspose.slides.internal.wh.ck] */
    @Override // com.aspose.slides.IPictureFillFormat
    public final IPPImage deletePictureCroppedAreas() throws Throwable {
        boolean zM56679kk;
        ?? r4;
        ?? r42;
        C12009k4 c12009k4;
        C12009k4 c12009k42;
        Shape shape;
        PPImage pPImage = (PPImage) C7019kk.m27452k4((Object) getPicture().getImage(), PPImage.class);
        boolean zM68566x1 = ohe.m68566x1(m2255m9().m74642k4(), bia.f4205k4);
        boolean zEquals = m2256to().equals(pj5.f48077k4.Clone());
        if (pPImage == null || pPImage.getSvgImage() != null || (zM56679kk = pPImage.m2133kk().m56679kk()) || (zEquals && !zM68566x1)) {
            return pPImage;
        }
        try {
            try {
                C12014ne c12014ne = new C12014ne(0, 0, pPImage.getWidth(), pPImage.getHeight());
                C12007ix c12007ixClone = m2250k4(c12014ne.m56663c5(), c12014ne.m56683x1()).Clone();
                if (zM68566x1 && (shape = (Shape) C7019kk.m27452k4((Object) getParent_ISlideComponent(), Shape.class)) != null) {
                    C12007ix c12007ixClone2 = ((ShapeFrame) shape.getFrame()).m2660k4().Clone();
                    bia biaVar = new bia();
                    biaVar.m4220k4(m2255m9().m74642k4().Clone());
                    C12007ix c12007ixClone3 = biaVar.m4217k4(c12007ixClone2.Clone()).Clone();
                    biaVar.m4220k4(new ohe((c12007ixClone2.m56557jd() - c12007ixClone3.m56557jd()) / c12007ixClone3.m56550c5(), (c12007ixClone2.m56551ck() - c12007ixClone3.m56551ck()) / c12007ixClone3.m56575x1(), c12007ixClone2.m56550c5() / c12007ixClone3.m56550c5(), c12007ixClone2.m56575x1() / c12007ixClone3.m56575x1()).Clone());
                    biaVar.m4217k4(C12007ix.m56544k4(c12014ne).Clone()).CloneTo(c12007ixClone);
                }
                c12014ne.m56672k4(C12014ne.m56661x1(c12007ixClone.Clone()).Clone());
                if (c12014ne.m56663c5() >= 1 && c12014ne.m56683x1() >= 1) {
                    try {
                        if (pPImage.m2129jd()) {
                            c12009k4 = new C12009k4(c12014ne.m56663c5(), c12014ne.m56683x1(), 2498570);
                            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                            try {
                                abstractC12008jdM56582k4.mo17560kk(7);
                                abstractC12008jdM56582k4.mo17476du(2);
                                abstractC12008jdM56582k4.mo17481h4(4);
                                C3099wl.m13186k4(abstractC12008jdM56582k4, pPImage.getBinaryData(), new C12007ix(0.0f, 0.0f, pPImage.getWidth(), pPImage.getHeight()));
                                abstractC12008jdM56582k4.dispose();
                            } finally {
                            }
                        } else {
                            C12009k4 c12009k43 = (C12009k4) pPImage.m2131k4();
                            try {
                                c12009k42 = new C12009k4(c12014ne.m56663c5(), c12014ne.m56683x1(), 2498570);
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                AbstractC12008jd abstractC12008jdM56582k42 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                                try {
                                    abstractC12008jdM56582k42.mo17560kk(7);
                                    abstractC12008jdM56582k42.mo17476du(2);
                                    abstractC12008jdM56582k42.mo17481h4(4);
                                    abstractC12008jdM56582k42.mo17507k4(c12009k43, new C12007ix(0.0f, 0.0f, c12014ne.m56663c5(), c12014ne.m56683x1()), new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1()), 2);
                                    abstractC12008jdM56582k42.dispose();
                                    if (c12009k43 != null) {
                                        try {
                                            c12009k43.dispose();
                                        } catch (RuntimeException e) {
                                            e = e;
                                            r42 = c12009k42;
                                            C3085sv.m13082k4(e);
                                            ((ImageCollection) getPresentation().getImages()).m1741x1(C14113y2.m67408k4(pPImage.getContentType(), " during DeleteCroppedAreas execution."));
                                            if (r42 != 0) {
                                                r42.dispose();
                                            }
                                            return pPImage;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r4 = c12009k42;
                                            if (r4 != 0) {
                                                r4.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                    c12009k4 = c12009k42;
                                } finally {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (c12009k43 != null) {
                                    c12009k43.dispose();
                                }
                                throw th;
                            }
                        }
                        getPicture().setImage(((ImageCollection) getPresentation().getImages()).m1724k4(c12009k4));
                        if (zM68566x1) {
                            m2255m9().m74645k4(m2245k4(m2255m9().m74642k4().Clone(), 1.0f, 1.0f, true).Clone());
                        }
                        if (!zEquals) {
                            m2255m9().m74652x1().m4220k4(m2245k4(m2255m9().m74652x1().m4218k4().Clone(), pPImage.getWidth() / c12009k4.mo15760yj(), pPImage.getHeight() / c12009k4.mo15757m9(), false).Clone());
                        }
                        IPPImage image = getPicture().getImage();
                        c12009k4.dispose();
                        return image;
                    } catch (RuntimeException e2) {
                        e = e2;
                        r42 = zM56679kk;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r4 = zM56679kk;
            }
        } catch (RuntimeException e3) {
            e = e3;
            r42 = 0;
        } catch (Throwable th5) {
            th = th5;
            r4 = 0;
        }
        return pPImage;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m2247du() {
        return this.f3022du;
    }

    /* JADX INFO: renamed from: dy */
    public final void m2248dy() {
        if (m2138ix()) {
            m2145uz();
            m2257x1().m3288h4();
        }
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getCropBottom() {
        return m2256to().f48078du;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getCropLeft() {
        return m2256to().f48081x1;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getCropRight() {
        return m2256to().f48080to;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getCropTop() {
        return m2256to().f48079kk;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final int getDpi() {
        if (m2138ix()) {
            return m2257x1().m3289k4();
        }
        return 96;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final ISlidesPicture getPicture() {
        m2146wl();
        return this.f3024kk;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final int getPictureFillMode() {
        if (m2138ix()) {
            return m2257x1().m3298x1();
        }
        return 0;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getStretchOffsetBottom() {
        return m2249h4().f48078du;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getStretchOffsetLeft() {
        return m2249h4().f48081x1;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getStretchOffsetRight() {
        return m2249h4().f48080to;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final float getStretchOffsetTop() {
        return m2249h4().f48079kk;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2257x1().m3296m9();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final pj5 m2249h4() {
        return m2138ix() ? m2257x1().m3297to() : pj5.f48077k4.Clone();
    }

    /* JADX INFO: renamed from: m9 */
    public final zn7 m2255m9() {
        m2146wl();
        return this.f3025to;
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setCropBottom(float f) {
        pj5 pj5VarM69115kk = m2256to().Clone();
        pj5VarM69115kk.f48078du = f;
        m2253k4(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setCropLeft(float f) {
        pj5 pj5VarM69115kk = m2256to().Clone();
        pj5VarM69115kk.f48081x1 = f;
        m2253k4(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setCropRight(float f) {
        pj5 pj5VarM69115kk = m2256to().Clone();
        pj5VarM69115kk.f48080to = f;
        m2253k4(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setCropTop(float f) {
        pj5 pj5VarM69115kk = m2256to().Clone();
        pj5VarM69115kk.f48079kk = f;
        m2253k4(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setDpi(int i) {
        m2141k4((Integer) 96, Integer.valueOf(i));
        if (m2138ix()) {
            m2257x1().m3291k4(i);
            m2246c5();
        }
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setPictureFillMode(int i) {
        m2141k4((Integer) 0, Integer.valueOf(i));
        if (m2138ix()) {
            m2257x1().m3299x1(i);
            m2246c5();
        }
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setStretchOffsetBottom(float f) {
        pj5 pj5VarM69115kk = m2249h4().Clone();
        pj5VarM69115kk.f48078du = f;
        m2258x1(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setStretchOffsetLeft(float f) {
        pj5 pj5VarM69115kk = m2249h4().Clone();
        pj5VarM69115kk.f48081x1 = f;
        m2258x1(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setStretchOffsetRight(float f) {
        pj5 pj5VarM69115kk = m2249h4().Clone();
        pj5VarM69115kk.f48080to = f;
        m2258x1(pj5VarM69115kk.Clone());
    }

    @Override // com.aspose.slides.IPictureFillFormat
    public final void setStretchOffsetTop(float f) {
        pj5 pj5VarM69115kk = m2249h4().Clone();
        pj5VarM69115kk.f48079kk = f;
        m2258x1(pj5VarM69115kk.Clone());
    }

    /* JADX INFO: renamed from: to */
    public final pj5 m2256to() {
        return m2138ix() ? m2257x1().m3295kk() : pj5.f48077k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final a5o m2257x1() {
        return (a5o) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m2250k4(int i, int i2) {
        m2145uz();
        return m2257x1().m3290k4(i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2258x1(pj5 pj5Var) {
        m2141k4(pj5.f48077k4.Clone(), pj5Var.Clone());
        if (m2138ix()) {
            m2257x1().m3300x1(pj5Var.Clone());
            m2246c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private ohe m2245k4(ohe oheVar, float f, float f2, boolean z) {
        oju ojuVar;
        oju ojuVar2;
        oju ojuVarClone = oheVar.f47808k4.Clone();
        oju ojuVarM68567k4 = oheVar.m68567k4();
        oju ojuVar3 = oju.f47835to;
        oju ojuVarClone2 = oju.m68622x1(ojuVarM68567k4, ojuVar3).Clone();
        if (z) {
            float f3 = ojuVarClone.f47836k4;
            if (f3 <= 0.0f) {
                f3 = 0.0f;
            }
            float f4 = ojuVarClone.f47837x1;
            if (f4 <= 0.0f) {
                f4 = 0.0f;
            }
            ojuVar = new oju(f3, f4);
            float f5 = ojuVarClone2.f47836k4;
            if (f5 > 0.0f) {
                f5 = 0.0f;
            }
            float f6 = ojuVarClone2.f47837x1;
            ojuVar2 = new oju(f5, f6 <= 0.0f ? f6 : 0.0f);
        } else {
            float f7 = ojuVarClone.f47836k4;
            float f8 = f7 < 0.0f ? f7 * f : 0.0f;
            float f9 = ojuVarClone.f47837x1;
            oju ojuVar4 = new oju(f8, f9 < 0.0f ? f9 * f2 : 0.0f);
            float f10 = ojuVarClone2.f47836k4;
            float f11 = f10 < 0.0f ? 0.0f : f10 * f;
            float f12 = ojuVarClone2.f47837x1;
            ojuVar = ojuVar4;
            ojuVar2 = new oju(f11, f12 >= 0.0f ? f12 * f2 : 0.0f);
        }
        return new ohe(ojuVar.Clone(), oju.m68622x1(oju.m68619k4(ojuVar3, ojuVar2), ojuVar).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2251k4(IPictureFillFormatEffectiveData iPictureFillFormatEffectiveData) {
        m2145uz();
        m2257x1().m3292k4(iPictureFillFormatEffectiveData);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2252k4(PictureFillFormat pictureFillFormat) {
        if (m2138ix() || pictureFillFormat.m2138ix()) {
            m2145uz();
            m2257x1().m3293k4(pictureFillFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2253k4(pj5 pj5Var) {
        m2141k4(pj5.f48077k4.Clone(), pj5Var.Clone());
        if (m2138ix()) {
            m2257x1().m3294k4(pj5Var.Clone());
            m2246c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2254k4(boolean z) {
        this.f3022du = z;
    }
}
