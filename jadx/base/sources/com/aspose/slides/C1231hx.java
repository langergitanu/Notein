package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.hx */
/* JADX INFO: loaded from: classes3.dex */
class C1231hx extends AbstractC13848ms<CellFormat, C1231hx> implements ICellFormatEffectiveData {

    /* JADX INFO: renamed from: fa */
    private static final C1231hx f5578fa = m7319ks();

    public C1231hx(CellFormat cellFormat) {
        super(cellFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static C1231hx m7317k4(CellFormat cellFormat) {
        cellFormat.getParent_IPresentationComponent();
        return f5578fa;
    }

    /* JADX INFO: renamed from: ks */
    private static C1231hx m7319ks() {
        C1231hx c1231hx = new C1231hx(null);
        AbstractC13848ms.m64974k4(c1231hx);
        return c1231hx;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m7320x1(CellFormat cellFormat) {
        Cell cell = (Cell) C7019kk.m27452k4((Object) cellFormat.getParent_Immediate(), Cell.class);
        if (cell == null) {
            return false;
        }
        yin yinVarM464fa = cell.m464fa();
        return AbstractC13848ms.m64978k4(cellFormat, yinVarM464fa.m73902dy()) | AbstractC13848ms.m64975k4(cellFormat, yinVarM464fa.m73904k4()) | AbstractC13848ms.m64978k4(cellFormat, yinVarM464fa.m73905kk()) | AbstractC13848ms.m64978k4(cellFormat, yinVarM464fa.m73907to()) | AbstractC13848ms.m64978k4(cellFormat, yinVarM464fa.m73901du()) | AbstractC13848ms.m64978k4(cellFormat, yinVarM464fa.m73903h4()) | AbstractC13848ms.m64978k4(cellFormat, yinVarM464fa.m73906m9());
    }

    @Override // com.aspose.slides.ICellFormatEffectiveData
    public final float getTransparency() {
        if (C14064he.m66715kk(m4601W_().getTransparency())) {
            return 0.0f;
        }
        return m4601W_().getTransparency();
    }

    /* JADX INFO: renamed from: k4 */
    public static C1231hx m7318k4(CellFormat cellFormat, C1231hx c1231hx) {
        C1231hx c1231hx2 = new C1231hx(cellFormat);
        if (c1231hx != null) {
            c1231hx2.m64987k4((InterfaceC14672vc) c1231hx);
        }
        return c1231hx2;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, CellFormat cellFormat) {
        m64987k4(interfaceC14672vc);
        Cell cell = (Cell) C7019kk.m27452k4((Object) m4601W_().getParent_Immediate(), Cell.class);
        if (cell != null) {
            yin yinVarM464fa = cell.m464fa();
            AbstractC13848ms.m64977k4(m4601W_(), m64985h4(), yinVarM464fa.m73904k4());
            m64989k4(m64990m9(), yinVarM464fa.m73905kk());
            m64989k4(m64983dy(), yinVarM464fa.m73907to());
            m64989k4(m64981c5(), yinVarM464fa.m73901du());
            m64989k4(m64986jd(), yinVarM464fa.m73903h4());
            m64989k4(m64982ck(), yinVarM464fa.m73906m9());
            m64989k4(m64984fa(), yinVarM464fa.m73902dy());
        }
        m64985h4().m67936kk((FillFormat) C7019kk.m27452k4((Object) cellFormat.getFillFormat(), FillFormat.class));
        m64990m9().m70666x1((LineFormat) C7019kk.m27452k4((Object) cellFormat.getBorderLeft(), LineFormat.class));
        m64983dy().m70666x1((LineFormat) C7019kk.m27452k4((Object) cellFormat.getBorderTop(), LineFormat.class));
        m64981c5().m70666x1((LineFormat) C7019kk.m27452k4((Object) cellFormat.getBorderRight(), LineFormat.class));
        m64986jd().m70666x1((LineFormat) C7019kk.m27452k4((Object) cellFormat.getBorderBottom(), LineFormat.class));
        m64982ck().m70666x1((LineFormat) C7019kk.m27452k4((Object) cellFormat.getBorderDiagonalDown(), LineFormat.class));
        m64984fa().m70666x1((LineFormat) C7019kk.m27452k4((Object) cellFormat.getBorderDiagonalUp(), LineFormat.class));
    }
}
