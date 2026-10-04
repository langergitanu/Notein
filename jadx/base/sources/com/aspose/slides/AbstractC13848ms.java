package com.aspose.slides;

import com.aspose.slides.AbstractC13848ms;
import com.aspose.slides.IBaseTableFormatEffectiveData;

/* JADX INFO: renamed from: com.aspose.slides.ms */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13848ms<TLocalData, TEffectiveData extends AbstractC13848ms<TLocalData, TEffectiveData> & IBaseTableFormatEffectiveData> extends AbstractC0858ck<TLocalData, TEffectiveData> implements IBaseTableFormatEffectiveData {

    /* JADX INFO: renamed from: c5 */
    skr f46297c5;

    /* JADX INFO: renamed from: ck */
    skr f46298ck;

    /* JADX INFO: renamed from: du */
    skr f46299du;

    /* JADX INFO: renamed from: dy */
    skr f46300dy;

    /* JADX INFO: renamed from: h4 */
    skr f46301h4;

    /* JADX INFO: renamed from: jd */
    skr f46302jd;

    /* JADX INFO: renamed from: kk */
    C14176nc f46303kk;

    /* JADX INFO: renamed from: m9 */
    skr f46304m9;

    /* JADX INFO: renamed from: to */
    skr f46305to;

    public AbstractC13848ms(TLocalData tlocaldata) {
        super(tlocaldata);
        this.f46303kk = new C14176nc(this);
        this.f46305to = new skr(this);
        this.f46299du = new skr(this);
        this.f46301h4 = new skr(this);
        this.f46304m9 = new skr(this);
        this.f46300dy = new skr(this);
        this.f46297c5 = new skr(this);
        this.f46302jd = new skr(this);
        this.f46298ck = new skr(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final skr m64981c5() {
        return this.f46301h4;
    }

    /* JADX INFO: renamed from: ck */
    public final skr m64982ck() {
        return this.f46300dy;
    }

    /* JADX INFO: renamed from: dy */
    public final skr m64983dy() {
        return this.f46299du;
    }

    /* JADX INFO: renamed from: fa */
    public final skr m64984fa() {
        return this.f46297c5;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final ILineFormatEffectiveData getBorderBottom() {
        return this.f46304m9;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final ILineFormatEffectiveData getBorderDiagonalDown() {
        return this.f46300dy;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final ILineFormatEffectiveData getBorderDiagonalUp() {
        return this.f46297c5;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final ILineFormatEffectiveData getBorderLeft() {
        return this.f46305to;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final ILineFormatEffectiveData getBorderRight() {
        return this.f46301h4;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final ILineFormatEffectiveData getBorderTop() {
        return this.f46299du;
    }

    @Override // com.aspose.slides.IBaseTableFormatEffectiveData
    public final IFillFormatEffectiveData getFillFormat() {
        return this.f46303kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C14176nc m64985h4() {
        return this.f46303kk;
    }

    /* JADX INFO: renamed from: jd */
    public final skr m64986jd() {
        return this.f46304m9;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f46303kk.mo4833k4(iBaseSlide, dm6Var);
        this.f46305to.mo4833k4(iBaseSlide, dm6Var);
        this.f46299du.mo4833k4(iBaseSlide, dm6Var);
        this.f46301h4.mo4833k4(iBaseSlide, dm6Var);
        this.f46304m9.mo4833k4(iBaseSlide, dm6Var);
        this.f46300dy.mo4833k4(iBaseSlide, dm6Var);
        this.f46297c5.mo4833k4(iBaseSlide, dm6Var);
        this.f46302jd.mo4833k4(iBaseSlide, dm6Var);
        this.f46298ck.mo4833k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: m9 */
    public final skr m64990m9() {
        return this.f46305to;
    }

    /* JADX INFO: renamed from: up */
    public final skr m64991up() {
        return this.f46302jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m64992x1(fdb fdbVar) {
        return m64989k4(this.f46298ck, fdbVar.m6124h4()) | m64989k4(this.f46305to, fdbVar.m6126k4()) | m64989k4(this.f46299du, fdbVar.m6127kk()) | m64989k4(this.f46301h4, fdbVar.m6130x1()) | m64989k4(this.f46304m9, fdbVar.m6129to()) | m64989k4(this.f46300dy, fdbVar.m6128m9()) | m64989k4(this.f46297c5, fdbVar.m6123dy()) | m64989k4(this.f46302jd, fdbVar.m6122du());
    }

    /* JADX INFO: renamed from: yj */
    public final skr m64994yj() {
        return this.f46298ck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <TEffectiveData extends AbstractC13848ms> void m64974k4(TEffectiveData teffectivedata) {
        teffectivedata.f46303kk = C14176nc.f47496h4;
        skr skrVar = skr.f48861ne;
        teffectivedata.f46305to = skrVar;
        teffectivedata.f46299du = skrVar;
        teffectivedata.f46301h4 = skrVar;
        teffectivedata.f46304m9 = skrVar;
        skr skrVar2 = skr.f48862x6;
        teffectivedata.f46300dy = skrVar2;
        teffectivedata.f46297c5 = skrVar2;
        teffectivedata.f46302jd = skrVar;
        teffectivedata.f46298ck = skrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(TEffectiveData teffectivedata) {
        return teffectivedata != 0 && this.f46303kk.mo4836k4(teffectivedata.f46303kk) && this.f46305to.mo4836k4(teffectivedata.f46305to) && this.f46299du.mo4836k4(teffectivedata.f46299du) && this.f46301h4.mo4836k4(teffectivedata.f46301h4) && this.f46304m9.mo4836k4(teffectivedata.f46304m9) && this.f46300dy.mo4836k4(teffectivedata.f46300dy) && this.f46297c5.mo4836k4(teffectivedata.f46297c5) && this.f46302jd.mo4836k4(teffectivedata.f46302jd) && this.f46298ck.mo4836k4(teffectivedata.f46298ck);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m64979x1(InterfaceC14376r6 interfaceC14376r6, faf fafVar) {
        C14176nc c14176ncM6065k4;
        return (fafVar == null || (c14176ncM6065k4 = fafVar.m6065k4(AbstractC0858ck.m4596k4(interfaceC14376r6))) == null || c14176ncM6065k4.getFillType() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64987k4(InterfaceC14672vc interfaceC14672vc) {
        AbstractC13848ms abstractC13848ms = (AbstractC13848ms) interfaceC14672vc;
        this.f46303kk.m67934k4((InterfaceC14672vc) abstractC13848ms.f46303kk);
        this.f46305to.m70663k4((InterfaceC14672vc) abstractC13848ms.f46305to);
        this.f46299du.m70663k4((InterfaceC14672vc) abstractC13848ms.f46299du);
        this.f46301h4.m70663k4((InterfaceC14672vc) abstractC13848ms.f46301h4);
        this.f46304m9.m70663k4((InterfaceC14672vc) abstractC13848ms.f46304m9);
        this.f46300dy.m70663k4((InterfaceC14672vc) abstractC13848ms.f46300dy);
        this.f46297c5.m70663k4((InterfaceC14672vc) abstractC13848ms.f46297c5);
        this.f46302jd.m70663k4((InterfaceC14672vc) abstractC13848ms.f46302jd);
        this.f46298ck.m70663k4((InterfaceC14672vc) abstractC13848ms.f46298ck);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m64980x1(InterfaceC14376r6 interfaceC14376r6, fdb fdbVar) {
        return m64978k4(interfaceC14376r6, fdbVar.m6124h4()) | m64978k4(interfaceC14376r6, fdbVar.m6126k4()) | m64978k4(interfaceC14376r6, fdbVar.m6127kk()) | m64978k4(interfaceC14376r6, fdbVar.m6130x1()) | m64978k4(interfaceC14376r6, fdbVar.m6129to()) | m64978k4(interfaceC14376r6, fdbVar.m6128m9()) | m64978k4(interfaceC14376r6, fdbVar.m6123dy()) | m64978k4(interfaceC14376r6, fdbVar.m6122du());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64988k4(fdb fdbVar) {
        return m64977k4((InterfaceC14376r6) m4601W_(), this.f46303kk, fdbVar.m6120c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64975k4(InterfaceC14376r6 interfaceC14376r6, faf fafVar) {
        C14176nc c14176ncM6065k4;
        return (fafVar == null || (c14176ncM6065k4 = fafVar.m6065k4(AbstractC0858ck.m4596k4(interfaceC14376r6))) == null || c14176ncM6065k4.getFillType() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64976k4(InterfaceC14376r6 interfaceC14376r6, fdb fdbVar) {
        return m64979x1(interfaceC14376r6, fdbVar.m6120c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64977k4(InterfaceC14376r6 interfaceC14376r6, C14176nc c14176nc, faf fafVar) {
        C14176nc c14176ncM6065k4;
        if (fafVar == null || (c14176ncM6065k4 = fafVar.m6065k4(AbstractC0858ck.m4596k4(interfaceC14376r6))) == null || c14176ncM6065k4.getFillType() == 0) {
            return false;
        }
        c14176nc.m67934k4((InterfaceC14672vc) c14176ncM6065k4);
        if (fafVar.m6069to() == 2 && c14176nc.getFillType() == 1) {
            c14176nc.m67926c5().m73523k4((ColorFormat) fafVar.m6068kk());
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64978k4(InterfaceC14376r6 interfaceC14376r6, tx4 tx4Var) {
        return (tx4Var == null || tx4Var.m71385k4(AbstractC0858ck.m4596k4(interfaceC14376r6)) == null) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64989k4(skr skrVar, tx4 tx4Var) {
        skr skrVarM71385k4;
        if (tx4Var == null || (skrVarM71385k4 = tx4Var.m71385k4(m4602X_())) == null) {
            return false;
        }
        skrVar.m70663k4((InterfaceC14672vc) skrVarM71385k4);
        if (tx4Var.m71384k4() == 2 && skrVar.getFillFormat().getFillType() == 1) {
            ((erk) skrVar.getFillFormat()).m5652kk().m73523k4((ColorFormat) tx4Var.m71388kk());
        }
        return true;
    }
}
