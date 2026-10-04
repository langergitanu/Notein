package com.aspose.slides;

import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.u2 */
/* JADX INFO: loaded from: classes3.dex */
final class C14613u2 extends AbstractC13680jc<Duotone, C14613u2> implements IDuotoneEffectiveData {

    /* JADX INFO: renamed from: kk */
    static final C14613u2 f49232kk = m71471du();

    /* JADX INFO: renamed from: k4 */
    C14811xp f49233k4;

    /* JADX INFO: renamed from: x1 */
    C14811xp f49234x1;

    public C14613u2(Duotone duotone) {
        super(duotone, Duotone.class, C14613u2.class);
    }

    /* JADX INFO: renamed from: du */
    public static C14613u2 m71471du() {
        C14613u2 c14613u2 = new C14613u2(null);
        c14613u2.m71472h4().m73525k4(C12003du.m56460uz().Clone());
        c14613u2.m71474m9().m73525k4(C12003du.m56460uz().Clone());
        return c14613u2;
    }

    @Override // com.aspose.slides.IDuotoneEffectiveData
    public final Integer getColor1() {
        return (Integer) C12003du.m56473x1(m71476x1());
    }

    @Override // com.aspose.slides.IDuotoneEffectiveData
    public final Integer getColor2() {
        return (Integer) C12003du.m56473x1(m71475to());
    }

    /* JADX INFO: renamed from: h4 */
    public final C14811xp m71472h4() {
        if (this.f49233k4 == null) {
            this.f49233k4 = new C14811xp();
        }
        return this.f49233k4;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r7v11, types: [float, java.lang.String] */
    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        C12003du c12003duClone = m71476x1().Clone();
        C12003du c12003duClone2 = m71475to().Clone();
        int iM56507jd = c12003duClone.m56507jd() & 255;
        int iM56507jd2 = (c12003duClone2.m56507jd() & 255) - iM56507jd;
        int iM56502ck = c12003duClone.m56502ck() & 255;
        int iM56502ck2 = (c12003duClone2.m56502ck() & 255) - iM56502ck;
        int iM56505fa = c12003duClone.m56505fa() & 255;
        int iM56505fa2 = (c12003duClone2.m56505fa() & 255) - iM56505fa;
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            float f = ((tc4Var.m71087to()[r10] & 255) * 0.7151f) + ((tc4Var.m71087to()[r8] & 255) * 0.2126f);
            ?? messageDigest = MD5.getMessageDigest(tc4Var.m71087to()[i] & 255);
            tc4Var.m71087to()[i + 2] = OooO0o.OooO00o(iM56507jd2, messageDigest, iM56507jd, 13);
            tc4Var.m71087to()[i + 1] = OooO0o.OooO00o(iM56502ck2, messageDigest, iM56502ck, 13);
            tc4Var.m71087to()[i] = OooO0o.OooO00o(iM56505fa2, messageDigest, iM56505fa, 13);
        }
        return tc4Var;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14811xp m71474m9() {
        if (this.f49234x1 == null) {
            this.f49234x1 = new C14811xp();
        }
        return this.f49234x1;
    }

    /* JADX INFO: renamed from: to */
    public C12003du m71475to() {
        return this.f49234x1.m73522k4();
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m71476x1() {
        return this.f49233k4.m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        C14811xp c14811xp = this.f49233k4;
        String string = c14811xp != null ? c14811xp.toString() : "";
        C14811xp c14811xp2 = this.f49234x1;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, string, chValueOf, c14811xp2 != null ? c14811xp2.toString() : "");
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        m71472h4().m73524k4(iBaseSlide, dm6Var);
        m71474m9().m73524k4(iBaseSlide, dm6Var);
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, Duotone duotone) {
        C14613u2 c14613u2 = (C14613u2) interfaceC14672vc;
        m71472h4().m73527k4(c14613u2.m71472h4(), (ColorFormat) duotone.getColor1());
        m71474m9().m73527k4(c14613u2.m71474m9(), (ColorFormat) duotone.getColor2());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(C14613u2 c14613u2) {
        if (c14613u2 == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c14613u2)) {
            return true;
        }
        return m71472h4().equals(c14613u2.m71472h4()) && m71474m9().equals(c14613u2.m71474m9());
    }
}
