package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.rr */
/* JADX INFO: loaded from: classes3.dex */
final class C14410rr extends AbstractC13680jc<ColorChange, C14410rr> implements IColorChangeEffectiveData {

    /* JADX INFO: renamed from: kk */
    static final C14410rr f48679kk = m70317du();

    /* JADX INFO: renamed from: h4 */
    private byte f48680h4;

    /* JADX INFO: renamed from: k4 */
    C14811xp f48681k4;

    /* JADX INFO: renamed from: x1 */
    C14811xp f48682x1;

    public C14410rr(ColorChange colorChange) {
        super(colorChange, ColorChange.class, C14410rr.class);
        this.f48680h4 = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public static C14410rr m70317du() {
        C14410rr c14410rr = new C14410rr(null);
        c14410rr.m70318h4().m73525k4(C12003du.m56460uz().Clone());
        c14410rr.m70320m9().m73525k4(C12003du.m56460uz().Clone());
        c14410rr.f48680h4 = (byte) 0;
        return c14410rr;
    }

    @Override // com.aspose.slides.IColorChangeEffectiveData
    public final Integer getFromColor() {
        return (Integer) C12003du.m56473x1(m70322x1());
    }

    @Override // com.aspose.slides.IColorChangeEffectiveData
    public final Integer getToColor() {
        return (Integer) C12003du.m56473x1(m70321to());
    }

    @Override // com.aspose.slides.IColorChangeEffectiveData
    public final boolean getUseAlpha() {
        return this.f48680h4 == 1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C14811xp m70318h4() {
        if (this.f48681k4 == null) {
            this.f48681k4 = new C14811xp();
        }
        return this.f48681k4;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        C12003du c12003duClone = m70322x1().Clone();
        C12003du c12003duClone2 = m70321to().Clone();
        int iM56507jd = (c12003duClone.m56507jd() & 255) - 17;
        int iM56507jd2 = (c12003duClone.m56507jd() & 255) + 17;
        int iM56502ck = (c12003duClone.m56502ck() & 255) - 17;
        int iM56502ck2 = (c12003duClone.m56502ck() & 255) + 17;
        int iM56505fa = (c12003duClone.m56505fa() & 255) - 17;
        int iM56505fa2 = (c12003duClone.m56505fa() & 255) + 17;
        int i = 0;
        if (getUseAlpha()) {
            int iM56501c5 = (c12003duClone.m56501c5() & 255) - 17;
            int iM56501c52 = (c12003duClone.m56501c5() & 255) + 17;
            while (i < tc4Var.m71087to().length) {
                int i2 = i + 3;
                if (iM56501c5 < (tc4Var.m71087to()[i2] & 255) && (tc4Var.m71087to()[i2] & 255) < iM56501c52) {
                    int i3 = i + 2;
                    if (iM56507jd < (tc4Var.m71087to()[i3] & 255) && (tc4Var.m71087to()[i3] & 255) < iM56507jd2) {
                        int i4 = i + 1;
                        if (iM56502ck < (tc4Var.m71087to()[i4] & 255) && (tc4Var.m71087to()[i4] & 255) < iM56502ck2 && iM56505fa < (tc4Var.m71087to()[i] & 255) && (tc4Var.m71087to()[i] & 255) < iM56505fa2) {
                            tc4Var.m71087to()[i2] = c12003duClone2.m56501c5();
                            tc4Var.m71087to()[i3] = c12003duClone2.m56507jd();
                            tc4Var.m71087to()[i4] = c12003duClone2.m56502ck();
                            tc4Var.m71087to()[i] = c12003duClone2.m56505fa();
                        }
                    }
                }
                i += 4;
            }
        } else {
            while (i < tc4Var.m71087to().length) {
                int i5 = i + 2;
                if (iM56507jd < (tc4Var.m71087to()[i5] & 255) && (tc4Var.m71087to()[i5] & 255) < iM56507jd2) {
                    int i6 = i + 1;
                    if (iM56502ck < (tc4Var.m71087to()[i6] & 255) && (tc4Var.m71087to()[i6] & 255) < iM56502ck2 && iM56505fa < (tc4Var.m71087to()[i] & 255) && (tc4Var.m71087to()[i] & 255) < iM56505fa2) {
                        tc4Var.m71087to()[i5] = c12003duClone2.m56507jd();
                        tc4Var.m71087to()[i6] = c12003duClone2.m56502ck();
                        tc4Var.m71087to()[i] = c12003duClone2.m56505fa();
                    }
                }
                i += 4;
            }
        }
        return tc4Var;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14811xp m70320m9() {
        if (this.f48682x1 == null) {
            this.f48682x1 = new C14811xp();
        }
        return this.f48682x1;
    }

    /* JADX INFO: renamed from: to */
    public C12003du m70321to() {
        return this.f48682x1.m73522k4();
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m70322x1() {
        return this.f48681k4.m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        C14811xp c14811xp = this.f48681k4;
        String string = c14811xp != null ? c14811xp.toString() : "";
        C14811xp c14811xp2 = this.f48682x1;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, string, chValueOf, c14811xp2 != null ? c14811xp2.toString() : "", chValueOf, C14042ak.m66410k4(NullableBool.class, this.f48680h4));
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        m70318h4().m73524k4(iBaseSlide, dm6Var);
        m70320m9().m73524k4(iBaseSlide, dm6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, ColorChange colorChange) {
        C14410rr c14410rr = (C14410rr) interfaceC14672vc;
        this.f48680h4 = c14410rr.f48680h4;
        boolean zM1059to = colorChange.m1059to();
        if (zM1059to != -1) {
            this.f48680h4 = zM1059to ? (byte) 1 : (byte) 0;
        }
        m70318h4().m73527k4(c14410rr.m70318h4(), (ColorFormat) colorChange.getFromColor());
        m70320m9().m73527k4(c14410rr.m70320m9(), (ColorFormat) colorChange.getToColor());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(C14410rr c14410rr) {
        if (c14410rr == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c14410rr)) {
            return true;
        }
        return getUseAlpha() == c14410rr.getUseAlpha() && m70318h4().equals(c14410rr.m70318h4()) && m70320m9().equals(c14410rr.m70320m9());
    }
}
