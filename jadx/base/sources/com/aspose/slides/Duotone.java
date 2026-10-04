package com.aspose.slides;

import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
public final class Duotone extends ImageTransformOperation implements IDuotone, lft {

    /* JADX INFO: renamed from: kk */
    private ColorFormat f2130kk;

    /* JADX INFO: renamed from: to */
    private C14613u2 f2131to;

    /* JADX INFO: renamed from: x1 */
    private ColorFormat f2132x1;

    public Duotone(ColorFormat colorFormat, ColorFormat colorFormat2, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        m1358to();
        this.f2132x1.m1079k4(colorFormat);
        this.f2130kk.m1079k4(colorFormat2);
    }

    /* JADX INFO: renamed from: to */
    private void m1358to() {
        this.f2132x1 = new ColorFormat(this);
        this.f2130kk = new ColorFormat(this);
        this.f2132x1.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.Duotone.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                Duotone.this.m1749dy();
            }
        });
        this.f2130kk.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.Duotone.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                Duotone.this.m1749dy();
            }
        });
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        Duotone duotone = (Duotone) C7019kk.m27452k4(obj, Duotone.class);
        if (duotone == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13090k4(this.f2132x1, duotone.f2132x1) && C3085sv.m13090k4(this.f2130kk, duotone.f2130kk);
    }

    @Override // com.aspose.slides.IDuotone
    public final IColorFormat getColor1() {
        return this.f2132x1;
    }

    @Override // com.aspose.slides.IDuotone
    public final IColorFormat getColor2() {
        return this.f2130kk;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IDuotoneEffectiveData getEffective() {
        return m1359x1();
    }

    @Override // com.aspose.slides.ImageTransformOperation, com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        return ((((super.getVersion() & 4294967295L) + (this.f2132x1.getVersion() & 4294967295L)) & 4294967295L) + (this.f2130kk.getVersion() & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r6v11, types: [float, java.lang.String] */
    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        C12003du c12003duClone = this.f2132x1.m1082kk(iBaseSlide, null).Clone();
        C12003du c12003duClone2 = this.f2130kk.m1082kk(iBaseSlide, null).Clone();
        int iM56507jd = c12003duClone.m56507jd() & 255;
        int iM56507jd2 = (c12003duClone2.m56507jd() & 255) - iM56507jd;
        int iM56502ck = c12003duClone.m56502ck() & 255;
        int iM56502ck2 = (c12003duClone2.m56502ck() & 255) - iM56502ck;
        int iM56505fa = c12003duClone.m56505fa() & 255;
        int iM56505fa2 = (c12003duClone2.m56505fa() & 255) - iM56505fa;
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            float f = ((tc4Var.m71087to()[r9] & 255) * 0.7151f) + ((tc4Var.m71087to()[r7] & 255) * 0.2126f);
            ?? messageDigest = MD5.getMessageDigest(tc4Var.m71087to()[i] & 255);
            tc4Var.m71087to()[i + 2] = OooO0o.OooO00o(iM56507jd2, messageDigest, iM56507jd, 13);
            tc4Var.m71087to()[i + 1] = OooO0o.OooO00o(iM56502ck2, messageDigest, iM56502ck, 13);
            tc4Var.m71087to()[i] = OooO0o.OooO00o(iM56505fa2, messageDigest, iM56505fa, 13);
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: kk */
    public ImageTransformOperation mo241kk() {
        Duotone duotone = new Duotone(null);
        ColorFormat colorFormat = new ColorFormat(null);
        duotone.f2132x1 = colorFormat;
        colorFormat.m1079k4(this.f2132x1);
        ColorFormat colorFormat2 = new ColorFormat(null);
        duotone.f2130kk = colorFormat2;
        colorFormat2.m1079k4(this.f2130kk);
        return duotone;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14613u2 m1359x1() {
        if (this.f2131to == null) {
            this.f2131to = new C14613u2(this);
        }
        this.f2131to.m63282k4(C14613u2.class);
        return this.f2131to;
    }

    public Duotone(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        m1358to();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67407k4(super.mo236k4(iBaseSlide, c14321pz), this.f2132x1.m1082kk(iBaseSlide, c14321pz), Character.valueOf(ControlChar.SPACE_CHAR), this.f2130kk.m1082kk(iBaseSlide, c14321pz));
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public void mo240k4(InterfaceC14397rj interfaceC14397rj) {
        super.mo240k4(interfaceC14397rj);
        this.f2132x1.m1081k4((InterfaceC14397rj) this);
        this.f2130kk.m1081k4((InterfaceC14397rj) this);
        m1750m9();
    }
}
