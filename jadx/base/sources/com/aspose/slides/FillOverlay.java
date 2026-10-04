package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class FillOverlay extends ImageTransformOperation implements IFillOverlay, lft {

    /* JADX INFO: renamed from: kk */
    private int f2283kk;

    /* JADX INFO: renamed from: to */
    private C1132g5 f2284to;

    /* JADX INFO: renamed from: x1 */
    private FillFormat f2285x1;

    public FillOverlay(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        FillFormat fillFormat = new FillFormat(this);
        this.f2285x1 = fillFormat;
        fillFormat.setFillType((byte) 1);
        this.f2285x1.getSolidFillColor().setSchemeColor(4);
        this.f2283kk = 1;
        this.f2285x1.f2261k4.mo27432x1(new AbstractC0766ax() { // from class: com.aspose.slides.FillOverlay.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC0766ax
            /* JADX INFO: renamed from: k4 */
            public void mo1462k4() {
                FillOverlay.this.m1749dy();
            }
        });
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    private int m1477k4(int i, int i2) {
        return i <= 127 ? (i * i2) >> 7 : 255 - (((255 - i2) * (255 - i)) >> 7);
    }

    /* JADX INFO: renamed from: x1 */
    private int m1480x1(int i, int i2) {
        return (((255 - i) * i2) / 255) + i;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        FillOverlay fillOverlay = (FillOverlay) C7019kk.m27452k4(obj, FillOverlay.class);
        if (fillOverlay == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13090k4(this.f2285x1, fillOverlay.f2285x1) && C3085sv.m13089k4((float) this.f2283kk, (float) fillOverlay.f2283kk);
    }

    @Override // com.aspose.slides.IFillOverlay
    public final int getBlend() {
        return this.f2283kk;
    }

    @Override // com.aspose.slides.IFillOverlay
    public final IFillFormat getFillFormat() {
        return this.f2285x1;
    }

    @Override // com.aspose.slides.ImageTransformOperation, com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        return ((super.getVersion() & 4294967295L) + (this.f2285x1.getVersion() & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: kk */
    public ImageTransformOperation mo241kk() {
        FillOverlay fillOverlay = new FillOverlay(null);
        FillFormat fillFormat = new FillFormat(null);
        fillOverlay.f2285x1 = fillFormat;
        fillFormat.m1456k4((IFillFormat) this.f2285x1);
        fillOverlay.f2283kk = this.f2283kk;
        return fillOverlay;
    }

    @Override // com.aspose.slides.IFillOverlay
    public final void setBlend(int i) {
        this.f2283kk = i;
        m1750m9();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[PHI: r2 r3
      0x0044: PHI (r2v5 int) = (r2v1 int), (r2v7 int) binds: [B:28:0x004f, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r3v5 int) = (r3v1 int), (r3v7 int) binds: [B:28:0x004f, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C12003du m1478k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iM1477k4;
        int iM1477k42;
        int iM1477k43;
        int i9 = this.f2283kk;
        if (i9 == 0) {
            if (i2 > i6) {
                i2 = i6;
            }
            if (i3 > i7) {
                i3 = i7;
            }
            if (i4 > i8) {
            }
            iM1477k4 = i2;
            iM1477k42 = i3;
            iM1477k43 = i4;
        } else if (i9 == 1) {
            if (i2 < i6) {
                i2 = i6;
            }
            if (i3 < i7) {
                i3 = i7;
            }
            if (i4 < i8) {
                i4 = i8;
            }
            iM1477k4 = i2;
            iM1477k42 = i3;
            iM1477k43 = i4;
        } else if (i9 == 2) {
            iM1477k4 = (i2 * i6) >> 8;
            iM1477k42 = (i3 * i7) >> 8;
            iM1477k43 = (i4 * i8) >> 8;
        } else if (i9 == 3) {
            iM1477k4 = m1477k4(i2, i6);
            iM1477k42 = m1477k4(i3, i7);
            iM1477k43 = m1477k4(i4, i8);
        } else {
            if (i9 != 4) {
                throw new ArgumentOutOfRangeException("m_blendMode");
            }
            iM1477k4 = m1480x1(i2, i6);
            iM1477k42 = m1480x1(i3, i7);
            iM1477k43 = m1480x1(i4, i8);
        }
        return C12003du.m56398k4(255, iM1477k4, iM1477k42, iM1477k43);
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IFillOverlayEffectiveData getEffective() {
        return m1481x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final C1132g5 m1481x1() {
        if (this.f2284to == null) {
            this.f2284to = new C1132g5(this);
        }
        this.f2284to.m63282k4(C1132g5.class);
        return this.f2284to;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        if (this.f2285x1.getFillType() == 1) {
            ((ColorFormat) this.f2285x1.getSolidFillColor()).m1084to().m56506h4();
            for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
                int i2 = i + 3;
                int i3 = i + 2;
                int i4 = i + 1;
                C12003du c12003duClone = m1478k4(tc4Var.m71087to()[i2] & 255, tc4Var.m71087to()[i3] & 255, tc4Var.m71087to()[i4] & 255, tc4Var.m71087to()[i] & 255, ((ColorFormat) this.f2285x1.getSolidFillColor()).m1084to().m56501c5() & 255, ((ColorFormat) this.f2285x1.getSolidFillColor()).m1084to().m56507jd() & 255, ((ColorFormat) this.f2285x1.getSolidFillColor()).m1084to().m56502ck() & 255, ((ColorFormat) this.f2285x1.getSolidFillColor()).m1084to().m56505fa() & 255).Clone();
                tc4Var.m71087to()[i2] = c12003duClone.m56501c5();
                tc4Var.m71087to()[i3] = c12003duClone.m56507jd();
                tc4Var.m71087to()[i4] = c12003duClone.m56502ck();
                tc4Var.m71087to()[i] = c12003duClone.m56505fa();
            }
            return tc4Var;
        }
        C0962es c0962esM5659k4 = C0962es.m5659k4(new ajz(new ShapeFrame(0.0f, 0.0f, tc4Var.m71088x1(), tc4Var.m71085kk(), (byte) 0, (byte) 0, 0.0f).cloneT(), new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f), null, iBaseSlide, null), this.f2285x1);
        C12009k4 c12009k4 = new C12009k4(tc4Var.m71088x1(), tc4Var.m71085kk(), 2498570);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962esM5659k4);
                try {
                    abstractC12008jdM56582k4.mo17593x1(abstractC12024x1M73548kk, new C12007ix(0.0f, 0.0f, tc4Var.m71088x1(), tc4Var.m71085kk()));
                    if (abstractC12024x1M73548kk != null) {
                        abstractC12024x1M73548kk.dispose();
                    }
                    abstractC12008jdM56582k4.dispose();
                    m1479k4(tc4Var, tc4.m71076k4(c12009k4));
                    c12009k4.dispose();
                    return tc4Var;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public void mo240k4(InterfaceC14397rj interfaceC14397rj) {
        super.mo240k4(interfaceC14397rj);
        FillFormat fillFormat = this.f2285x1;
        FillFormat fillFormat2 = new FillFormat(this);
        this.f2285x1 = fillFormat2;
        fillFormat2.m1456k4((IFillFormat) fillFormat);
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    private void m1479k4(tc4 tc4Var, tc4 tc4Var2) {
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            int i2 = i + 3;
            int i3 = i + 2;
            int i4 = i + 1;
            C12003du c12003duClone = m1478k4(tc4Var.m71087to()[i2] & 255, tc4Var.m71087to()[i3] & 255, tc4Var.m71087to()[i4] & 255, tc4Var.m71087to()[i] & 255, tc4Var2.m71087to()[i2] & 255, tc4Var2.m71087to()[i3] & 255, tc4Var2.m71087to()[i4] & 255, tc4Var2.m71087to()[i] & 255).Clone();
            tc4Var.m71087to()[i2] = c12003duClone.m56501c5();
            tc4Var.m71087to()[i3] = c12003duClone.m56507jd();
            tc4Var.m71087to()[i4] = c12003duClone.m56502ck();
            tc4Var.m71087to()[i] = c12003duClone.m56505fa();
        }
    }
}
