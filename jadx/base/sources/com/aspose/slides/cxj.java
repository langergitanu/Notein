package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p077d8.C3074na;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7132k4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
final class cxj extends tf7 implements IDisposable {

    /* JADX INFO: renamed from: uz */
    private static final C3074na<Integer, Integer> f4488uz;

    /* JADX INFO: renamed from: c5 */
    private boolean f4489c5;

    /* JADX INFO: renamed from: ck */
    private final oju f4490ck;

    /* JADX INFO: renamed from: dy */
    private int f4491dy;

    /* JADX INFO: renamed from: fa */
    private final oju f4492fa;

    /* JADX INFO: renamed from: ix */
    private C7131h4 f4493ix;

    /* JADX INFO: renamed from: jd */
    private C12007ix f4494jd;

    /* JADX INFO: renamed from: ks */
    private boolean f4495ks;

    /* JADX INFO: renamed from: m9 */
    private int f4496m9;

    /* JADX INFO: renamed from: ne */
    private String f4497ne;

    /* JADX INFO: renamed from: rv */
    private PictureFillFormat f4498rv;

    /* JADX INFO: renamed from: u4 */
    private EffectFormat f4499u4;

    /* JADX INFO: renamed from: up */
    private byte f4500up;

    /* JADX INFO: renamed from: x6 */
    private C1937to f4501x6;

    /* JADX INFO: renamed from: yj */
    private int f4502yj;

    static {
        C3074na<Integer, Integer> c3074na = new C3074na<>();
        f4488uz = c3074na;
        c3074na.m13009k4(0, 0);
        c3074na.m13009k4(1, 1);
        c3074na.m13009k4(2, 2);
        c3074na.m13009k4(3, 3);
        c3074na.m13009k4(-1, 0);
    }

    public cxj(ajz ajzVar, EffectFormat effectFormat, PictureFillFormat pictureFillFormat, boolean z) {
        this(ajzVar, pictureFillFormat, z);
        this.f4499u4 = effectFormat;
        ((tf7) this).f49117du = ajzVar.f3917to;
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m4842k4(IPPImage iPPImage, int i) {
        return (iPPImage == null || (i != 0 && this.f4491dy == 1)) ? ((tf7) this).f49119h4.m56570m9() : new C12015qq(iPPImage.getWidth(), iPPImage.getHeight());
    }

    /* JADX INFO: renamed from: ts */
    private void m4844ts() {
        this.f4493ix = new C7131h4(new C12009k4(16, 16));
        this.f4494jd = new C12007ix(0.0f, 0.0f, 16.0f, 16.0f);
        this.f4497ne = "dummy";
    }

    /* JADX INFO: renamed from: ar */
    public final C7131h4 m4845ar() {
        return this.f4493ix;
    }

    /* JADX INFO: renamed from: bv */
    public final AbstractC12002ck m4846bv() {
        C7131h4 c7131h4 = this.f4493ix;
        if (c7131h4 != null) {
            return c7131h4.m27678kk();
        }
        return null;
    }

    /* JADX INFO: renamed from: ck */
    public final C11896dy m4847ck() {
        return ((tf7) this).f49117du;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        C7131h4 c7131h4 = this.f4493ix;
        if (c7131h4 != null && c7131h4.m27680x1() && "dummy".equals(this.f4497ne)) {
            this.f4493ix.m27678kk().dispose();
            this.f4493ix = null;
        }
    }

    /* JADX INFO: renamed from: fa */
    public final C6921dy m4848fa() {
        return this.f4869x1;
    }

    /* JADX INFO: renamed from: ix */
    public final oju m4849ix() {
        return this.f4490ck;
    }

    /* JADX INFO: renamed from: jd */
    public final EffectFormat m4850jd() {
        return this.f4499u4;
    }

    /* JADX INFO: renamed from: ks */
    public final C12007ix m4851ks() {
        return this.f4494jd;
    }

    /* JADX INFO: renamed from: lr */
    public final int m4852lr() {
        C1937to c1937to = this.f4501x6;
        if (c1937to != null) {
            return c1937to.m9994rv();
        }
        throw new InvalidOperationException("Source image is not a metafile");
    }

    /* JADX INFO: renamed from: ne */
    public final byte m4853ne() {
        return this.f4500up;
    }

    /* JADX INFO: renamed from: qq */
    public final byte[] m4854qq() {
        C7131h4 c7131h4 = this.f4493ix;
        if (c7131h4 != null) {
            return c7131h4.m27674du();
        }
        return null;
    }

    /* JADX INFO: renamed from: rv */
    public final int m4855rv() {
        return this.f4502yj;
    }

    /* JADX INFO: renamed from: u4 */
    public final oju m4856u4() {
        return this.f4492fa;
    }

    /* JADX INFO: renamed from: um */
    public final PictureFillFormat m4857um() {
        return this.f4498rv;
    }

    /* JADX INFO: renamed from: up */
    public final int m4858up() {
        return this.f4491dy;
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m4859uz() {
        return this.f4495ks;
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m4860v4() {
        return this.f4501x6 != null;
    }

    /* JADX INFO: renamed from: wl */
    public final Picture m4861wl() {
        PictureFillFormat pictureFillFormat = this.f4498rv;
        if (pictureFillFormat != null) {
            return (Picture) pictureFillFormat.getPicture();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: x1 */
    public final C12007ix m4862x1(float f) {
        m4846bv();
        float fM56557jd = ((tf7) this).f49119h4.m56557jd();
        float fM56551ck = ((tf7) this).f49119h4.m56551ck();
        float fMo15757m9 = ((this.f4493ix.m27678kk().mo15757m9() * f) / C12567ne.m58660x1(this.f4493ix.m27678kk())) * this.f4492fa.f47837x1;
        float fMo15760yj = ((this.f4493ix.m27678kk().mo15760yj() * f) / C12567ne.m58657k4(this.f4493ix.m27678kk())) * this.f4492fa.f47836k4;
        switch (this.f4500up) {
            case 1:
                fM56557jd = ((((tf7) this).f49119h4.m56550c5() - fMo15760yj) / 2.0f) + ((tf7) this).f49119h4.m56571to();
                break;
            case 2:
                fM56557jd = ((tf7) this).f49119h4.m56556h4() - fMo15760yj;
                break;
            case 3:
                fM56551ck = ((((tf7) this).f49119h4.m56575x1() - fMo15757m9) / 2.0f) + ((tf7) this).f49119h4.m56554dy();
                break;
            case 4:
                fM56557jd = ((((tf7) this).f49119h4.m56550c5() - fMo15760yj) / 2.0f) + ((tf7) this).f49119h4.m56571to();
                fM56551ck = ((((tf7) this).f49119h4.m56575x1() - fMo15757m9) / 2.0f) + ((tf7) this).f49119h4.m56554dy();
                break;
            case 5:
                fM56557jd = ((tf7) this).f49119h4.m56556h4() - fMo15760yj;
                fM56551ck = ((((tf7) this).f49119h4.m56575x1() - fMo15757m9) / 2.0f) + ((tf7) this).f49119h4.m56554dy();
                break;
            case 6:
                fM56551ck = ((tf7) this).f49119h4.m56558k4() - fMo15757m9;
                break;
            case 7:
                fM56557jd = ((((tf7) this).f49119h4.m56550c5() - fMo15760yj) / 2.0f) + ((tf7) this).f49119h4.m56571to();
                fM56551ck = ((tf7) this).f49119h4.m56558k4() - fMo15757m9;
                break;
            case 8:
                fM56557jd = ((tf7) this).f49119h4.m56556h4() - fMo15760yj;
                fM56551ck = ((tf7) this).f49119h4.m56558k4() - fMo15757m9;
                break;
        }
        return new C12007ix(fM56557jd, fM56551ck, fMo15760yj, fMo15757m9);
    }

    /* JADX INFO: renamed from: x6 */
    public final oju m4864x6() {
        return this.f4490ck;
    }

    /* JADX INFO: renamed from: yd */
    public final byte[] m4865yd() {
        C1937to c1937to = this.f4501x6;
        if (c1937to != null) {
            return c1937to.m9997x1();
        }
        throw new InvalidOperationException("Source image is not a metafile");
    }

    /* JADX INFO: renamed from: yj */
    public final String m4866yj() {
        int i = this.f4496m9;
        return i >= 0 ? C14057f9.m66587k4(i, "x") : this.f4497ne;
    }

    public cxj(ajz ajzVar, PictureFillFormat pictureFillFormat) {
        this(ajzVar, pictureFillFormat, false);
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m4843k4(C12015qq c12015qq, pj5 pj5Var, int i) {
        ajz ajzVar;
        float f = pj5Var.f48080to + pj5Var.f48081x1;
        float f2 = pj5Var.f48078du + pj5Var.f48079kk;
        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, 1.0f, 1.0f);
        if (f < 101.0f && f2 < 101.0f) {
            c12007ix = new C12007ix(0.0f, 0.0f, c12015qq.m56699x1() / (f == 100.0f ? 0.99f : 1.0f - (f / 100.0f)), c12015qq.m56697kk() / (f2 != 100.0f ? 1.0f - (f2 / 100.0f) : 0.99f));
        }
        C12007ix c12007ixClone = new bia().m4217k4(c12007ix.Clone()).Clone();
        C12015qq c12015qqClone = C3099wl.m13184k4(i, c12007ixClone.m56570m9().Clone()).Clone();
        return (i > 96 || (ajzVar = this.f4868to) == null || ajzVar.f3914k4 == null || c12015qqClone.m56699x1() <= ((float) this.f4868to.f3914k4.mo67711m9()) || c12015qqClone.m56697kk() <= ((float) this.f4868to.f3914k4.mo67708dy())) ? c12015qqClone : c12007ixClone.m56570m9();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4863x1(C12007ix c12007ix) {
        c12007ix.CloneTo(this.f4494jd);
    }

    public cxj(ajz ajzVar, PictureFillFormat pictureFillFormat, boolean z) {
        super(ajzVar, z);
        this.f4496m9 = -1;
        this.f4489c5 = true;
        this.f4494jd = new C12007ix();
        oju ojuVar = new oju();
        this.f4490ck = ojuVar;
        oju ojuVarClone = oju.f47835to.Clone();
        this.f4492fa = ojuVarClone;
        this.f4500up = (byte) 0;
        this.f4502yj = 0;
        if (pictureFillFormat == null) {
            return;
        }
        this.f4865k4 = (byte) 4;
        if (pictureFillFormat.getPictureFillMode() == 1) {
            this.f4491dy = 1;
        } else {
            this.f4491dy = 0;
            zn7 zn7VarM2255m9 = pictureFillFormat.m2255m9();
            if (zn7VarM2255m9.m74641h4() != -1) {
                this.f4500up = zn7VarM2255m9.m74641h4();
            }
            this.f4502yj = f4488uz.m13012x1(Integer.valueOf(zn7VarM2255m9.m74639du())).intValue();
            zn7VarM2255m9.m74649kk().m71061du().CloneTo(ojuVar);
            zn7VarM2255m9.m74651to().CloneTo(ojuVarClone);
        }
        Picture picture = (Picture) pictureFillFormat.getPicture();
        if (!C14113y2.m67411k4(picture.getLinkPathLong()) && picture.getImage() == null) {
            picture.setImage(((ImageCollection) picture.getPresentation().getImages()).m1726k4(picture.getLinkPathLong(), (Dictionary<String, IPPImage>) null));
        }
        if (picture.getImage() == null || ((PPImage) picture.getImage()).m2133kk().m56679kk()) {
            m4844ts();
        } else {
            if (!C14113y2.m67411k4(picture.m2241x1().m63580x1())) {
                picture.getImage().setSvgImage(((ImageCollection) picture.getPresentation().getImages()).m1730k4(picture.m2241x1().m63580x1()));
            }
            if (pictureFillFormat.getPictureFillMode() == 1) {
                ohe oheVarClone = pictureFillFormat.m2255m9().m74642k4().Clone();
                ((tf7) this).f49119h4 = new C12007ix((((tf7) this).f49119h4.m56550c5() * oheVarClone.f47808k4.f47836k4) + ((tf7) this).f49119h4.m56557jd(), (((tf7) this).f49119h4.m56575x1() * oheVarClone.f47808k4.f47837x1) + ((tf7) this).f49119h4.m56551ck(), ((tf7) this).f49119h4.m56550c5() * oheVarClone.f47809x1.f47836k4, ((tf7) this).f49119h4.m56575x1() * oheVarClone.f47809x1.f47837x1);
                this.f4495ks = bia.m4216x1(oheVarClone.Clone());
            }
            pj5 pj5VarClone = pictureFillFormat.m2256to().Clone();
            this.f4869x1 = new C6921dy(((double) pj5VarClone.f48081x1) / 100.0d, ((double) pj5VarClone.f48080to) / 100.0d, ((double) pj5VarClone.f48079kk) / 100.0d, ((double) pj5VarClone.f48078du) / 100.0d);
            PPImage pPImage = (PPImage) picture.getImage();
            if (pPImage.m2129jd()) {
                this.f4869x1 = pPImage.m2130k4(pj5VarClone.Clone(), this.f4869x1);
                this.f4501x6 = new C1937to(pPImage.getBinaryData());
            }
            boolean z2 = !this.f4869x1.m27130k4();
            kg7 kg7Var = ajzVar.f3913h4;
            int iM63851up = kg7Var == null ? 72 : kg7Var.m63851up();
            if (pPImage.m2129jd() && pPImage.m2123c5().m56897x1() < iM63851up && pPImage.m2123c5().m56897x1() > 72.0f) {
                iM63851up = C7019kk.m27462to(Float.valueOf(pPImage.m2123c5().m56897x1()), 13);
            }
            C12015qq c12015qqClone = m4843k4(m4842k4(pPImage, iM63851up).Clone().Clone(), pictureFillFormat.m2256to().Clone(), iM63851up).Clone();
            if (c12015qqClone.m56699x1() < 1.0f) {
                c12015qqClone.m56695k4(1.0f);
            }
            if (c12015qqClone.m56697kk() < 1.0f) {
                c12015qqClone.m56700x1(1.0f);
            }
            this.f4498rv = pictureFillFormat;
            C7131h4 c7131h4M2235k4 = picture.m2235k4(ajzVar, c12015qqClone.Clone(), ajzVar.f3913h4, ajzVar.f3912du, z2, pictureFillFormat);
            this.f4493ix = c7131h4M2235k4;
            if (!c7131h4M2235k4.m27677k4() || m4852lr() == 2) {
                pictureFillFormat.m2250k4(this.f4493ix.m27678kk().mo15760yj(), this.f4493ix.m27678kk().mo15757m9()).CloneTo(this.f4494jd);
            } else {
                this.f4494jd = new C12007ix(0.0f, 0.0f, this.f4493ix.m27678kk().mo15760yj(), this.f4493ix.m27678kk().mo15757m9());
            }
            this.f4497ne = this.f4493ix.m27675h4();
            this.f4866kk = null;
        }
        this.f4496m9 = -1;
    }

    public cxj(ajz ajzVar, qxi qxiVar) {
        qxi qxiVar2;
        super(ajzVar);
        this.f4496m9 = -1;
        this.f4489c5 = true;
        this.f4494jd = new C12007ix();
        oju ojuVar = new oju();
        this.f4490ck = ojuVar;
        oju ojuVar2 = oju.f47835to;
        oju ojuVarClone = ojuVar2.Clone();
        this.f4492fa = ojuVarClone;
        this.f4500up = (byte) 0;
        this.f4502yj = 0;
        this.f4865k4 = (byte) 4;
        ((tf7) this).f49117du = ajzVar.f3917to;
        ku2 ku2Var = (ku2) qxiVar.getPicture();
        if (ku2Var.getImage() != null) {
            pj5 pj5VarClone = qxiVar.m69801x1().Clone();
            float f = pj5VarClone.f48080to + pj5VarClone.f48081x1;
            float f2 = pj5VarClone.f48078du + pj5VarClone.f48079kk;
            float f3 = f == 100.0f ? 0.99f : 1.0f - (f / 100.0f);
            float f4 = f2 != 100.0f ? 1.0f - (f2 / 100.0f) : 0.99f;
            if (qxiVar.getPictureFillMode() == 1) {
                ohe oheVarClone = qxiVar.m69800to().m4218k4().Clone();
                ((tf7) this).f49119h4 = new C12007ix((((tf7) this).f49119h4.m56550c5() * oheVarClone.f47808k4.f47836k4) + ((tf7) this).f49119h4.m56557jd(), (((tf7) this).f49119h4.m56575x1() * oheVarClone.f47808k4.f47837x1) + ((tf7) this).f49119h4.m56551ck(), ((tf7) this).f49119h4.m56550c5() * oheVarClone.f47809x1.f47836k4, ((tf7) this).f49119h4.m56575x1() * oheVarClone.f47809x1.f47837x1);
                this.f4495ks = bia.m4216x1(oheVarClone.Clone());
            }
            oju ojuVarClone2 = ojuVar2.m68624k4(((tf7) this).f49119h4.m56550c5() / f3, ((tf7) this).f49119h4.m56575x1() / f4).Clone();
            C7131h4 c7131h4M64175k4 = ku2Var.m64175k4(ajzVar.f3915kk, new C12015qq(ojuVarClone2.f47836k4, ojuVarClone2.f47837x1), ajzVar.f3913h4);
            this.f4493ix = c7131h4M64175k4;
            qxiVar2 = qxiVar;
            qxiVar2.m69793k4(c7131h4M64175k4.m27678kk().mo15760yj(), this.f4493ix.m27678kk().mo15757m9()).CloneTo(this.f4494jd);
            this.f4497ne = this.f4493ix.m27675h4();
            this.f4869x1 = new C6921dy(((double) pj5VarClone.f48081x1) / 100.0d, ((double) pj5VarClone.f48080to) / 100.0d, ((double) pj5VarClone.f48079kk) / 100.0d, ((double) pj5VarClone.f48078du) / 100.0d);
        } else {
            qxiVar2 = qxiVar;
            this.f4493ix = new C7131h4(new C12009k4(16, 16));
            this.f4494jd = new C12007ix(0.0f, 0.0f, 16.0f, 16.0f);
            this.f4497ne = "dummy";
        }
        this.f4496m9 = -1;
        if (qxiVar2.getPictureFillMode() == 1) {
            this.f4491dy = 1;
            return;
        }
        this.f4491dy = 0;
        if (qxiVar2.m69791dy() != -1) {
            this.f4500up = qxiVar2.m69791dy();
        }
        this.f4502yj = f4488uz.m13012x1(Integer.valueOf(qxiVar2.m69799m9())).intValue();
        qxiVar2.m69790du().m71061du().CloneTo(ojuVar);
        qxiVar2.m69792h4().CloneTo(ojuVarClone);
    }

    public cxj(ajz ajzVar, qxi qxiVar, byte b, EffectFormat effectFormat, boolean z) {
        kg7 kg7Var;
        AbstractC12002ck abstractC12002ckM4846bv;
        C7134m9 c7134m9M63839k4;
        int i;
        this(ajzVar, qxiVar, z);
        this.f4499u4 = effectFormat;
        if (!C0962es.m5668k4(b) || (c7134m9M63839k4 = (kg7Var = ajzVar.f3913h4).m63839k4((abstractC12002ckM4846bv = m4846bv()))) == null) {
            return;
        }
        if (b == 2) {
            i = -6;
        } else if (b == 3) {
            i = -8;
        } else if (b == 4) {
            i = 6;
        } else {
            if (b != 5) {
                throw new InvalidOperationException("Fill source must be darker/lighter");
            }
            i = 8;
        }
        C7134m9 c7134m9M27682k4 = C7134m9.m27682k4(c7134m9M63839k4, new C7132k4(i));
        C7131h4[] c7131h4Arr = {null};
        boolean zM56973k4 = kg7Var.m63846ks().m56973k4(c7134m9M27682k4, c7131h4Arr);
        int i2 = 0;
        C7131h4 c7131h4 = c7131h4Arr[0];
        if (!zM56973k4) {
            C12009k4 c12009k4 = (C12009k4) C7019kk.m27452k4((Object) abstractC12002ckM4846bv, C12009k4.class);
            tc4 tc4VarM71076k4 = tc4.m71076k4(c12009k4 == null ? new C12009k4(abstractC12002ckM4846bv) : c12009k4);
            if (i > 0) {
                while (i2 < tc4VarM71076k4.m71087to().length) {
                    int i3 = i2 + 2;
                    tc4VarM71076k4.m71087to()[i3] = (byte) (((tc4VarM71076k4.m71087to()[i3] & 255) / 10) * i);
                    int i4 = i2 + 1;
                    tc4VarM71076k4.m71087to()[i4] = (byte) (((tc4VarM71076k4.m71087to()[i4] & 255) / 10) * i);
                    tc4VarM71076k4.m71087to()[i2] = (byte) (((tc4VarM71076k4.m71087to()[i2] & 255) / 10) * i);
                    i2 += 4;
                }
            } else {
                int i5 = -i;
                while (i2 < tc4VarM71076k4.m71087to().length) {
                    int i6 = i2 + 2;
                    tc4VarM71076k4.m71087to()[i6] = (byte) (255 - (((255 - (tc4VarM71076k4.m71087to()[i6] & 255)) / 10) * i5));
                    int i7 = i2 + 1;
                    tc4VarM71076k4.m71087to()[i7] = (byte) (255 - (((255 - (tc4VarM71076k4.m71087to()[i7] & 255)) / 10) * i5));
                    tc4VarM71076k4.m71087to()[i2] = (byte) (255 - (((255 - (tc4VarM71076k4.m71087to()[i2] & 255)) / 10) * i5));
                    i2 += 4;
                }
            }
            c7131h4 = new C7131h4(tc4VarM71076k4.m71080c5());
            kg7Var.m63846ks().m56971k4(c7134m9M27682k4, c7131h4);
        }
        this.f4493ix = c7131h4;
        this.f4497ne = c7131h4.m27675h4();
    }

    public cxj(ajz ajzVar, qxi qxiVar, boolean z) {
        super(ajzVar, z);
        this.f4496m9 = -1;
        this.f4489c5 = true;
        this.f4494jd = new C12007ix();
        oju ojuVar = new oju();
        this.f4490ck = ojuVar;
        oju ojuVarClone = oju.f47835to.Clone();
        this.f4492fa = ojuVarClone;
        this.f4500up = (byte) 0;
        this.f4502yj = 0;
        this.f4865k4 = (byte) 4;
        if (qxiVar.getPictureFillMode() == 1) {
            this.f4491dy = 1;
        } else {
            this.f4491dy = 0;
            if (qxiVar.m69791dy() != -1) {
                this.f4500up = qxiVar.m69791dy();
            }
            this.f4502yj = f4488uz.m13012x1(Integer.valueOf(qxiVar.m69799m9())).intValue();
            qxiVar.m69790du().m71061du().CloneTo(ojuVar);
            qxiVar.m69792h4().CloneTo(ojuVarClone);
        }
        ku2 ku2Var = (ku2) qxiVar.getPicture();
        PPImage pPImage = (PPImage) ku2Var.getImage();
        if (pPImage != null) {
            if (qxiVar.getPictureFillMode() == 1) {
                ohe oheVarClone = qxiVar.m69800to().m4218k4().Clone();
                ((tf7) this).f49119h4 = new C12007ix((((tf7) this).f49119h4.m56550c5() * oheVarClone.f47808k4.f47836k4) + ((tf7) this).f49119h4.m56557jd(), (((tf7) this).f49119h4.m56575x1() * oheVarClone.f47808k4.f47837x1) + ((tf7) this).f49119h4.m56551ck(), ((tf7) this).f49119h4.m56550c5() * oheVarClone.f47809x1.f47836k4, ((tf7) this).f49119h4.m56575x1() * oheVarClone.f47809x1.f47837x1);
                this.f4495ks = bia.m4216x1(oheVarClone.Clone());
            }
            pj5 pj5VarClone = qxiVar.m69801x1().Clone();
            this.f4869x1 = new C6921dy(((double) pj5VarClone.f48081x1) / 100.0d, ((double) pj5VarClone.f48080to) / 100.0d, ((double) pj5VarClone.f48079kk) / 100.0d, ((double) pj5VarClone.f48078du) / 100.0d);
            if (pPImage.m2129jd()) {
                this.f4869x1 = pPImage.m2130k4(pj5VarClone.Clone(), this.f4869x1);
                this.f4501x6 = new C1937to(pPImage.getBinaryData());
            }
            kg7 kg7Var = ajzVar.f3913h4;
            int iM63851up = kg7Var == null ? 72 : kg7Var.m63851up();
            if (pPImage.m2129jd() && pPImage.m2123c5().m56897x1() < iM63851up) {
                iM63851up = C7019kk.m27462to(Float.valueOf(pPImage.m2123c5().m56897x1()), 13);
            }
            C7131h4 c7131h4M64175k4 = ku2Var.m64175k4(ajzVar.f3915kk, m4843k4(m4842k4(pPImage, iM63851up).Clone().Clone(), pj5VarClone.Clone(), iM63851up).Clone().Clone(), ajzVar.f3913h4);
            this.f4493ix = c7131h4M64175k4;
            qxiVar.m69793k4(c7131h4M64175k4.m27678kk().mo15760yj(), this.f4493ix.m27678kk().mo15757m9()).CloneTo(this.f4494jd);
            this.f4497ne = this.f4493ix.m27675h4();
            this.f4866kk = ku2Var.getImageTransform();
        } else {
            m4844ts();
        }
        this.f4496m9 = -1;
    }
}
