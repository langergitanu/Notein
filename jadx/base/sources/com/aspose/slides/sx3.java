package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class sx3 extends er8 {

    /* JADX INFO: renamed from: k4 */
    private boolean f48945k4;

    /* JADX INFO: renamed from: kk */
    private boolean f48946kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<Cell, ajz> f48947to;

    /* JADX INFO: renamed from: x1 */
    private boolean f48948x1;

    public sx3(Table table) {
        super(table);
    }

    /* JADX INFO: renamed from: ix */
    private boolean m70821ix() {
        for (int i = 0; i < m70835k4().getRows().size(); i++) {
            for (int i2 = 0; i2 < m70835k4().getColumns().size(); i2++) {
                Cell cell = (Cell) m70835k4().get_Item(i2, i);
                if (cell.getTextFrame() != null && !jq6.m63488k4((TextFrame) cell.getTextFrame())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private float m70822k4(int i) {
        return (float) m70835k4().f3493k4.m2491k4(i).m2479dy();
    }

    /* JADX INFO: renamed from: ne */
    private boolean m70831ne() {
        for (int i = 0; i < m70835k4().getRows().size(); i++) {
            for (int i2 = 0; i2 < m70835k4().getColumns().size(); i2++) {
                Cell cell = (Cell) m70835k4().get_Item(i2, i);
                if (cell.getTextFrame() != null && ((TextFrame) cell.getTextFrame()).m2906fa()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u4 */
    private boolean m70832u4() {
        for (int i = 0; i < m70835k4().getRows().size(); i++) {
            for (int i2 = 0; i2 < m70835k4().getColumns().size(); i2++) {
                Cell cell = (Cell) m70835k4().get_Item(i2, i);
                if (cell.getTextFrame() != null && ((TextFrame) cell.getTextFrame()).m2905dy()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: kk */
    public void mo5640kk() {
        m70837kk(true);
    }

    /* JADX INFO: renamed from: to */
    public final void m70838to() {
        this.f48945k4 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70839x1() {
        this.f48946kk = false;
        this.f48945k4 = false;
        this.f48947to = null;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m70840x6() {
        this.f48946kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    private float m70823k4(int i, int i2) {
        if (i2 >= i) {
            return m70835k4().getRightToLeft() ? (float) (((double) m70835k4().getWidth()) - m70835k4().f3496x1.m1153kk()) : (float) m70835k4().f3496x1.m1153kk();
        }
        Column columnM1147k4 = m70835k4().f3496x1.m1147k4(i2);
        return m70835k4().getRightToLeft() ? (float) (((double) m70835k4().getWidth()) - columnM1147k4.m1137dy()) : (float) columnM1147k4.m1137dy();
    }

    /* JADX INFO: renamed from: kk */
    private void m70830kk(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) throws Throwable {
        IEffectFormatEffectiveData effective = m70835k4().getEffectFormat().getEffective();
        if (effective.isNoEffects() || effective.getInnerShadowEffect() == null) {
            return;
        }
        m70828k4(abstractC14897zn, kg7Var, interruptionToken, (byte) 4, effective.getInnerShadowEffect());
    }

    /* JADX INFO: renamed from: x1 */
    private void m70833x1(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, IEffectEffectiveData iEffectEffectiveData, C0962es c0962es, azo azoVar, IShapeFrame iShapeFrame) {
        if (c0962es == null || c0962es.m5681to() == 0 || !C7019kk.m27469x1(iEffectEffectiveData, zg0.class)) {
            return;
        }
        new lho((zg0) iEffectEffectiveData).m64396k4(abstractC14897zn, c11896dy, c0962es, azoVar, iShapeFrame);
    }

    /* JADX INFO: renamed from: k4 */
    private ShapeFrame m70824k4(Cell cell, double d) {
        return m70835k4().getRightToLeft() ? new ShapeFrame((((double) m70835k4().getWidth()) - cell.getWidth()) - ((double) ((float) cell.getOffsetX())), d, cell.getWidth(), cell.getHeight(), (byte) 0, (byte) 0, 0.0f) : new ShapeFrame(cell.getOffsetX(), d, cell.getWidth(), cell.getHeight(), (byte) 0, (byte) 0, 0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    private void m70834x1(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) throws Throwable {
        IEffectFormatEffectiveData effective = m70835k4().getEffectFormat().getEffective();
        if (effective.isNoEffects()) {
            return;
        }
        if (effective.getReflectionEffect() != null) {
            m70828k4(abstractC14897zn, kg7Var, interruptionToken, (byte) 2, effective.getReflectionEffect());
        }
        if (effective.getOuterShadowEffect() != null) {
            m70828k4(abstractC14897zn, kg7Var, interruptionToken, (byte) 2, effective.getOuterShadowEffect());
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m70837kk(boolean z) {
        if ((z && this.f48945k4) || this.f48946kk || this.f48948x1) {
            return;
        }
        this.f48948x1 = true;
        try {
            m70836k4((kg7) null);
            ShapeFrame shapeFrameM5631fa = m5631fa();
            m70835k4().m2588x1(new ShapeFrame(shapeFrameM5631fa.getX(), shapeFrameM5631fa.getY(), (float) m70835k4().f3496x1.m1153kk(), (float) m70835k4().f3493k4.m2498x1(), shapeFrameM5631fa.getFlipH(), shapeFrameM5631fa.getFlipV(), shapeFrameM5631fa.getRotation()));
            this.f48946kk = true;
        } finally {
            this.f48948x1 = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Table m70835k4() {
        return (Table) m5629du();
    }

    /* JADX INFO: renamed from: k4 */
    private ajz m70825k4(Cell cell, double d, kg7 kg7Var) {
        if (this.f48947to == null) {
            this.f48947to = new Dictionary<>();
        }
        if (!this.f48947to.containsKey(cell)) {
            this.f48947to.addItem(cell, new ajz(m70824k4(cell, d).cloneT(), null, null, m70835k4().getSlide(), kg7Var));
        }
        return this.f48947to.get_Item(cell);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70826k4(C12025x6 c12025x6, C12025x6 c12025x62, azo azoVar, AbstractC14897zn abstractC14897zn) {
        if (azoVar != null) {
            abstractC14897zn.m74614k4(azoVar, c12025x6.Clone(), c12025x62.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70836k4(kg7 kg7Var) {
        double[] dArr;
        int i;
        RowCollection rowCollection = m70835k4().f3493k4;
        int size = rowCollection.size();
        int size2 = m70835k4().f3496x1.size();
        byte b = 1;
        if (size < 1) {
            return;
        }
        double[] dArr2 = new double[size + 1];
        boolean z = false;
        for (int i2 = 0; i2 <= size; i2++) {
            dArr2[i2] = 0.0d;
        }
        int i3 = 0;
        while (true) {
            byte b2 = 4;
            if (i3 >= size) {
                break;
            }
            double dM67502x1 = C14116yg.m67502x1(rowCollection.m2491k4(i3).getMinimalHeight(), 2.0d) + dArr2[i3];
            int i4 = i3 + 1;
            if (dArr2[i4] < dM67502x1) {
                dArr2[i4] = dM67502x1;
            }
            Row rowM2491k4 = rowCollection.m2491k4(i3);
            int colSpan = z;
            while (colSpan < size2) {
                Cell cellMo484k4 = rowM2491k4.mo484k4(colSpan);
                if (cellMo484k4.m463dy()) {
                    colSpan += cellMo484k4.m462du().getColSpan();
                } else {
                    cellMo484k4.m472k4(z);
                    TextFrame textFrame = (TextFrame) cellMo484k4.getTextFrame();
                    byte textVerticalType = cellMo484k4.getTextVerticalType();
                    if (textVerticalType == b || textVerticalType == 2 || textVerticalType == b2 || textVerticalType == 5 || textVerticalType == 6) {
                        dArr = dArr2;
                        i = i3;
                        textFrame.f3523to.mo64286du();
                    } else {
                        dArr = dArr2;
                        i = i3;
                        textFrame.f3523to.mo64294k4(new tbp((cellMo484k4.getWidth() - cellMo484k4.getMarginLeft()) - cellMo484k4.getMarginRight(), 0.0d).m71061du().Clone(), kg7Var);
                    }
                    double d = textFrame.f3523to.mo64296kk().f47837x1;
                    int iM466jd = cellMo484k4.m466jd();
                    dArr[iM466jd] = C14116yg.m67502x1(dArr[iM466jd], cellMo484k4.getMarginBottom() + cellMo484k4.getMarginTop() + dArr[i] + d);
                    colSpan += cellMo484k4.getColSpan();
                    i3 = i;
                    dArr2 = dArr;
                    b = 1;
                    z = false;
                    b2 = 4;
                }
            }
            i3 = i4;
        }
        double[] dArr3 = dArr2;
        int i5 = 0;
        while (i5 < size) {
            Row rowM2491k42 = rowCollection.m2491k4(i5);
            double d2 = dArr3[i5];
            rowM2491k42.f3246kk = d2;
            int i6 = i5 + 1;
            rowM2491k42.m2481k4(dArr3[i6] - d2);
            rowM2491k42.f3243du = false;
            int colSpan2 = 0;
            while (colSpan2 < size2) {
                Cell cellMo484k42 = rowM2491k42.mo484k4(colSpan2);
                if (cellMo484k42.m463dy()) {
                    colSpan2 += cellMo484k42.m462du().getColSpan();
                } else {
                    int iM466jd2 = cellMo484k42.m466jd();
                    tbp tbpVarClone = tbp.f49088kk.Clone();
                    int i7 = colSpan2;
                    tbpVarClone.f49090k4 = (cellMo484k42.getWidth() - cellMo484k42.getMarginLeft()) - cellMo484k42.getMarginRight();
                    tbpVarClone.f49091x1 = ((dArr3[iM466jd2] - dArr3[i5]) - cellMo484k42.getMarginTop()) - cellMo484k42.getMarginBottom();
                    InterfaceC13762l4 interfaceC13762l4 = ((TextFrame) cellMo484k42.getTextFrame()).f3523to;
                    byte textVerticalType2 = cellMo484k42.getTextVerticalType();
                    if (textVerticalType2 != 1 && textVerticalType2 != 2 && textVerticalType2 != 4 && textVerticalType2 != 5) {
                        if (textVerticalType2 == 6) {
                        }
                        interfaceC13762l4.mo64294k4(tbpVarClone.m71061du().Clone(), kg7Var);
                        colSpan2 = cellMo484k42.getColSpan() + i7;
                    }
                    tbpVarClone.m71065kk();
                    interfaceC13762l4.mo64294k4(tbpVarClone.m71061du().Clone(), kg7Var);
                    colSpan2 = cellMo484k42.getColSpan() + i7;
                }
            }
            i5 = i6;
        }
        m70835k4().f3496x1.m1143c5();
        rowCollection.f3254x1 = dArr3[size];
        rowCollection.f3251k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70827k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, IEffectEffectiveData iEffectEffectiveData, C0962es c0962es, azo azoVar, IShapeFrame iShapeFrame) {
        if (iEffectEffectiveData == null) {
            return;
        }
        vmd vmdVar = (vmd) C7019kk.m27452k4((Object) iEffectEffectiveData, vmd.class);
        if (vmdVar != null) {
            nv2 nv2Var = new nv2(vmdVar);
            if (c0962es != null && c0962es.m5681to() != 0) {
                azoVar = null;
            }
            nv2Var.m68226k4(abstractC14897zn, c11896dy, c0962es, azoVar);
        }
        azo azoVar2 = azoVar;
        rhs rhsVar = (rhs) C7019kk.m27452k4((Object) iEffectEffectiveData, rhs.class);
        if (rhsVar != null) {
            new lde(rhsVar).mo64370k4(abstractC14897zn, c11896dy, c0962es, azoVar2, iShapeFrame);
        }
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) throws Throwable {
        if (m70835k4().getHidden()) {
            return;
        }
        m70834x1(abstractC14897zn, kg7Var, interruptionToken);
        m70828k4(abstractC14897zn, kg7Var, interruptionToken, (byte) 1, (IEffectEffectiveData) null);
        m70830kk(abstractC14897zn, kg7Var, interruptionToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07c6  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m70828k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken, byte b, IEffectEffectiveData iEffectEffectiveData) throws Throwable {
        float f;
        float centerY;
        float f2;
        BaseSlide baseSlide;
        C0962es c0962esM5664k4;
        C0962es c0962esM5661k4;
        ShapeFrame shapeFrame;
        C0962es c0962es;
        int i;
        Cell cell;
        int i2;
        BaseSlide baseSlide2;
        Cell cell2;
        C11896dy c11896dy;
        sx3 sx3Var;
        ShapeFrame shapeFrame2;
        AbstractC14897zn abstractC14897zn2;
        azo azoVar;
        Cell cell3;
        Cell cell4;
        azo azoVar2;
        C11896dy c11896dy2;
        float f3;
        float f4;
        double d;
        int i3;
        C0962es c0962es2;
        Row row;
        C11896dy c11896dy3;
        Cell cell5;
        sx3 sx3Var2 = this;
        AbstractC14897zn abstractC14897zn3 = abstractC14897zn;
        kg7 kg7Var2 = kg7Var;
        byte b2 = b;
        if (sx3Var2.m70829k4(sx3Var2.m70835k4().getEffectFormat().getEffective(), b2)) {
            if (sx3Var2.m70831ne() && !sx3Var2.m70821ix() && (b2 & 1) != 0 && !sx3Var2.m70832u4() && sx3Var2.m70835k4().m2581um() != null) {
                sx3Var2.m70835k4().m2581um().m2592x1((InterfaceC14397rj) sx3Var2.m70835k4().m2573s7());
                sx3Var2.m70835k4().m2581um().m2546bz().mo4131k4(abstractC14897zn3, kg7Var2, interruptionToken);
                sx3Var2.m70835k4().m2581um().m2592x1((InterfaceC14397rj) null);
                return;
            }
            sx3Var2.f48945k4 = false;
            ShapeFrame shapeFrameM5631fa = sx3Var2.m5631fa();
            float x = shapeFrameM5631fa.getX();
            float y = shapeFrameM5631fa.getY();
            float width = shapeFrameM5631fa.getWidth();
            float height = shapeFrameM5631fa.getHeight();
            if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
                return;
            }
            float f5 = shapeFrameM5631fa.getFlipH() == 1 ? -1.0f : 1.0f;
            float f6 = shapeFrameM5631fa.getFlipV() == 1 ? -1.0f : 1.0f;
            float centerX = shapeFrameM5631fa.getFlipH() == 1 ? shapeFrameM5631fa.getCenterX() * 2.0f : 0.0f;
            if (shapeFrameM5631fa.getFlipV() == 1) {
                centerY = shapeFrameM5631fa.getCenterY() * 2.0f;
                f = 0.0f;
            } else {
                f = 0.0f;
                centerY = 0.0f;
            }
            C4317dy c4317dy = new C4317dy(f5, 0.0f, 0.0f, f6, centerX, centerY);
            if (!C14064he.m66715kk(shapeFrameM5631fa.getRotation())) {
                c4317dy.m17339k4((shapeFrameM5631fa.getFlipV() == 1) ^ (shapeFrameM5631fa.getFlipH() == 1) ? -shapeFrameM5631fa.getRotation() : shapeFrameM5631fa.getRotation(), new C12025x6(shapeFrameM5631fa.getCenterX(), shapeFrameM5631fa.getCenterY()), 0);
            }
            C4317dy c4317dyM17345kk = c4317dy.m17345kk();
            c4317dy.m17348x1(x, y);
            abstractC14897zn3.m74622kk(c4317dy);
            int size = sx3Var2.m70835k4().f3493k4.size();
            int size2 = sx3Var2.m70835k4().f3496x1.size();
            BaseSlide baseSlide3 = (BaseSlide) sx3Var2.m70835k4().getSlide();
            IThemeEffectiveData iThemeEffectiveDataCreateThemeEffective = baseSlide3.createThemeEffective();
            sx3Var2.m70836k4(kg7Var2);
            x5o x5oVarM2875to = sx3Var2.m70835k4().m2875to();
            IFillParamSource fillFormat = (x5oVarM2875to == null || x5oVarM2875to.m73142x1().m4496k4().m6069to() == 0) ? sx3Var2.m70835k4().getTableFormat().getFillFormat() : x5oVarM2875to.m73142x1().m4496k4().m6064k4(baseSlide3, iThemeEffectiveDataCreateThemeEffective);
            if (fillFormat != null) {
                f2 = f;
                c0962esM5661k4 = C0962es.m5661k4(new ajz(new ShapeFrame(0.0f, 0.0f, shapeFrameM5631fa.getWidth(), shapeFrameM5631fa.getHeight(), shapeFrameM5631fa.getFlipH(), shapeFrameM5631fa.getFlipV(), shapeFrameM5631fa.getRotation()), null, null, baseSlide3, kg7Var2), fillFormat);
                kg7Var2 = kg7Var;
                baseSlide = baseSlide3;
                c0962esM5664k4 = C0962es.m5664k4(new ajz(new ShapeFrame(0.0f, 0.0f, shapeFrameM5631fa.getWidth(), shapeFrameM5631fa.getHeight(), shapeFrameM5631fa.getFlipH(), shapeFrameM5631fa.getFlipV(), shapeFrameM5631fa.getRotation()), null, null, baseSlide3, kg7Var2), (C14176nc) sx3Var2.m70835k4().getTableFormat().getFillFormat().getEffective());
            } else {
                f2 = f;
                baseSlide = baseSlide3;
                c0962esM5664k4 = null;
                c0962esM5661k4 = null;
            }
            int i4 = b2 & 1;
            if (i4 != 0) {
                abstractC14897zn3.mo68794k4(new C12007ix(f2, f2, shapeFrameM5631fa.getWidth(), shapeFrameM5631fa.getHeight()), (azo) null, c0962esM5661k4);
            }
            int i5 = b2 & 4;
            if (i5 != 0) {
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55578x1(new C12007ix(f2, f2, shapeFrameM5631fa.getWidth(), shapeFrameM5631fa.getHeight()));
                    shapeFrame = shapeFrameM5631fa;
                    sx3Var2.m70833x1(abstractC14897zn3, c11896dy, iEffectEffectiveData, c0962esM5664k4, null, shapeFrame);
                    c0962es = c0962esM5664k4;
                } finally {
                    c11896dy.dispose();
                }
            } else {
                shapeFrame = shapeFrameM5631fa;
                c0962es = c0962esM5664k4;
            }
            abstractC14897zn3.m74617k4(false);
            int i6 = 0;
            while (i6 < size) {
                Row rowM2491k4 = sx3Var2.m70835k4().f3493k4.m2491k4(i6);
                double dM2479dy = rowM2491k4.m2479dy();
                int colSpan = 0;
                while (colSpan < size2) {
                    Cell cellMo484k4 = rowM2491k4.mo484k4(colSpan);
                    if (cellMo484k4.m463dy()) {
                        colSpan += cellMo484k4.m462du().getColSpan();
                    } else {
                        ShapeFrame shapeFrameM70824k4 = sx3Var2.m70824k4(cellMo484k4, dM2479dy);
                        C12007ix c12007ixClone = shapeFrameM70824k4.m2660k4().Clone();
                        int i7 = i6;
                        C0962es c0962esM5670x1 = C0962es.m5670x1(sx3Var2.m70825k4(cellMo484k4, dM2479dy, kg7Var2), cellMo484k4.m461ck().m496h4().m64985h4());
                        C0962es c0962esM5675k4 = c0962esM5670x1 != null ? c0962esM5670x1.m5675k4(shapeFrameM70824k4) : c0962esM5661k4;
                        Row row2 = rowM2491k4;
                        C11896dy c11896dy4 = new C11896dy();
                        C0962es c0962es3 = c0962esM5675k4;
                        try {
                            c11896dy4.m55578x1(c12007ixClone.Clone());
                            if ((b2 & 2) != 0) {
                                i3 = colSpan;
                                d = dM2479dy;
                                c0962es2 = c0962es3;
                                row = row2;
                                m70827k4(abstractC14897zn3, c11896dy4, iEffectEffectiveData, c0962es2, null, shapeFrame);
                            } else {
                                d = dM2479dy;
                                i3 = colSpan;
                                c0962es2 = c0962es3;
                                row = row2;
                            }
                            if (i4 != 0) {
                                c11896dy3 = c11896dy4;
                                kg7 kg7Var3 = kg7Var2;
                                try {
                                    abstractC14897zn3 = abstractC14897zn;
                                    cell5 = cellMo484k4;
                                    kg7Var2 = kg7Var3;
                                    if (!C0964eu.m5720k4(abstractC14897zn, kg7Var3, cellMo484k4, shapeFrameM70824k4, c11896dy3, c0962es2)) {
                                        abstractC14897zn3.mo68794k4(c12007ixClone.Clone(), (azo) null, c0962es2);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    c11896dy4 = c11896dy3;
                                    c11896dy4.dispose();
                                    throw th;
                                }
                            } else {
                                abstractC14897zn3 = abstractC14897zn;
                                c11896dy3 = c11896dy4;
                                cell5 = cellMo484k4;
                            }
                            if (i5 != 0 && i7 == 0 && (c0962es == null || c0962es.m5681to() == 0)) {
                                sx3Var2 = this;
                                c11896dy4 = c11896dy3;
                                try {
                                    sx3Var2.m70833x1(abstractC14897zn3, c11896dy4, iEffectEffectiveData, c0962es2, null, shapeFrame);
                                } catch (Throwable th2) {
                                    th = th2;
                                    c11896dy4.dispose();
                                    throw th;
                                }
                            } else {
                                sx3Var2 = this;
                                c11896dy4 = c11896dy3;
                            }
                            c11896dy4.dispose();
                            colSpan = cell5.getColSpan() + i3;
                            i6 = i7;
                            rowM2491k4 = row;
                            dM2479dy = d;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                i6++;
            }
            boolean z = true;
            abstractC14897zn3.m74617k4(true);
            int i8 = 0;
            float f7 = 0.0f;
            while (i8 <= size2) {
                float fM70823k4 = sx3Var2.m70823k4(size2, i8);
                azo azoVar3 = null;
                int i9 = 0;
                while (i9 < size) {
                    float fM70822k4 = sx3Var2.m70822k4(i9);
                    boolean z2 = i8 < size2 ? z : false;
                    Table tableM70835k4 = sx3Var2.m70835k4();
                    Cell cellM2869k4 = z2 ? tableM70835k4.m2869k4(i8, i9) : tableM70835k4.m2869k4(i8 - 1, i9);
                    int i10 = size;
                    C4317dy c4317dy2 = c4317dyM17345kk;
                    azo azoVar4 = (z2 && cellM2869k4.m463dy() && (!cellM2869k4.m463dy() || cellM2869k4.m462du().getFirstColumnIndex() != i8)) ? null : new azo(sx3Var2.m70825k4(cellM2869k4, fM70822k4, kg7Var2), ((LineFormat) Table.m2867x1(!z2 ? cellM2869k4 : i8 >= 1 ? sx3Var2.m70835k4().m2869k4(i8 - 1, i9) : null, (!z2 || i8 >= size2) ? null : cellM2869k4, true)).getEffective(), 0);
                    if (azoVar4 != azoVar3) {
                        C11896dy c11896dy5 = new C11896dy();
                        try {
                            c11896dy5.m55547k4(new C12025x6(fM70823k4, f7), new C12025x6(fM70823k4, fM70822k4));
                            if ((b2 & 2) != 0) {
                                abstractC14897zn3 = abstractC14897zn;
                                f3 = f7;
                                f4 = fM70822k4;
                                c11896dy2 = c11896dy5;
                                sx3Var2 = this;
                                try {
                                    sx3Var2.m70827k4(abstractC14897zn3, c11896dy2, iEffectEffectiveData, null, azoVar3, shapeFrame);
                                } catch (Throwable th4) {
                                    th = th4;
                                    c11896dy2.dispose();
                                    throw th;
                                }
                            } else {
                                abstractC14897zn3 = abstractC14897zn;
                                f3 = f7;
                                f4 = fM70822k4;
                                c11896dy2 = c11896dy5;
                                sx3Var2 = this;
                            }
                            if (i4 != 0) {
                                sx3Var2.m70826k4(new C12025x6(fM70823k4, f3), new C12025x6(fM70823k4, f4), azoVar3, abstractC14897zn3);
                            }
                            c11896dy2.dispose();
                            azoVar3 = azoVar4;
                            f7 = f4;
                        } catch (Throwable th5) {
                            th = th5;
                            c11896dy2 = c11896dy5;
                        }
                    } else {
                        sx3Var2 = this;
                        abstractC14897zn3 = abstractC14897zn;
                    }
                    i9++;
                    c4317dyM17345kk = c4317dy2;
                    size = i10;
                    z = true;
                }
                int i11 = size;
                C4317dy c4317dy3 = c4317dyM17345kk;
                float f8 = f7;
                c11896dy = new C11896dy();
                try {
                    int i12 = i8;
                    try {
                        c11896dy.m55547k4(new C12025x6(fM70823k4, f8), new C12025x6(fM70823k4, (float) sx3Var2.m70835k4().f3493k4.m2498x1()));
                        if ((b2 & 2) != 0) {
                            sx3Var2 = this;
                            sx3Var2.m70827k4(abstractC14897zn3, c11896dy, iEffectEffectiveData, null, azoVar3, shapeFrame);
                        } else {
                            sx3Var2 = this;
                        }
                        if (i4 != 0) {
                            sx3Var2.m70826k4(new C12025x6(fM70823k4, f8), new C12025x6(fM70823k4, (float) sx3Var2.m70835k4().f3493k4.m2498x1()), azoVar3, abstractC14897zn3);
                        }
                        c11896dy.dispose();
                        i8 = i12 + 1;
                        b2 = b;
                        f7 = f8;
                        c4317dyM17345kk = c4317dy3;
                        size = i11;
                        z = true;
                    } catch (Throwable th6) {
                        th = th6;
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int i13 = size;
            C4317dy c4317dy4 = c4317dyM17345kk;
            float fM1153kk = sx3Var2.m70835k4().getRightToLeft() ? 0.0f : (float) sx3Var2.m70835k4().f3496x1.m1153kk();
            int i14 = 0;
            while (i14 <= i13) {
                RowCollection rowCollection = sx3Var2.m70835k4().f3493k4;
                float fM2479dy = (float) (i14 < i13 ? rowCollection.m2491k4(i14).m2479dy() : rowCollection.m2498x1());
                float f9 = f7;
                azo azoVar5 = null;
                for (int i15 = 0; i15 < size2; i15++) {
                    float fM70823k42 = sx3Var2.m70823k4(size2, i15);
                    boolean z3 = i14 < i13;
                    Table tableM70835k42 = sx3Var2.m70835k4();
                    Cell cellM2869k42 = z3 ? tableM70835k42.m2869k4(i15, i14) : tableM70835k42.m2869k4(i15, i14 - 1);
                    boolean z4 = z3;
                    ajz ajzVarM70825k4 = sx3Var2.m70825k4(cellM2869k42, fM2479dy, kg7Var2);
                    Cell cellM2869k43 = !z4 ? cellM2869k42 : i14 >= 1 ? sx3Var2.m70835k4().m2869k4(i15, i14 - 1) : null;
                    if (!z4 || i14 >= i13) {
                        cell3 = cellM2869k42;
                        cell4 = null;
                    } else {
                        cell4 = cellM2869k42;
                        cell3 = cell4;
                    }
                    azo azoVar6 = (z4 && cell3.m463dy() && (!cell3.m463dy() || cell3.m462du().getFirstRowIndex() != i14)) ? null : new azo(ajzVarM70825k4, ((LineFormat) Table.m2867x1(cellM2869k43, cell4, false)).getEffective(), 0);
                    if (azoVar6 != azoVar5) {
                        c11896dy = new C11896dy();
                        try {
                            c11896dy.m55547k4(new C12025x6(f9, fM2479dy), new C12025x6(fM70823k42, fM2479dy));
                            if ((b & 2) != 0) {
                                abstractC14897zn3 = abstractC14897zn;
                                azoVar2 = azoVar6;
                                sx3Var2 = this;
                                try {
                                    sx3Var2.m70827k4(abstractC14897zn3, c11896dy, iEffectEffectiveData, null, azoVar5, shapeFrame);
                                } catch (Throwable th8) {
                                    th = th8;
                                    throw th;
                                }
                            } else {
                                abstractC14897zn3 = abstractC14897zn;
                                azoVar2 = azoVar6;
                                sx3Var2 = this;
                            }
                            if (i4 != 0) {
                                sx3Var2.m70826k4(new C12025x6(f9, fM2479dy), new C12025x6(fM70823k42, fM2479dy), azoVar5, abstractC14897zn3);
                            }
                            c11896dy.dispose();
                            f9 = fM70823k42;
                            azoVar5 = azoVar2;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } else {
                        sx3Var2 = this;
                        abstractC14897zn3 = abstractC14897zn;
                    }
                }
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55547k4(new C12025x6(f9, fM2479dy), new C12025x6(fM1153kk, fM2479dy));
                    if ((b & 2) != 0) {
                        sx3Var2.m70827k4(abstractC14897zn3, c11896dy, iEffectEffectiveData, null, azoVar5, shapeFrame);
                        azo azoVar7 = azoVar5;
                        sx3Var = sx3Var2;
                        shapeFrame2 = shapeFrame;
                        abstractC14897zn2 = abstractC14897zn3;
                        azoVar = azoVar7;
                    } else {
                        azo azoVar8 = azoVar5;
                        sx3Var = sx3Var2;
                        shapeFrame2 = shapeFrame;
                        abstractC14897zn2 = abstractC14897zn3;
                        azoVar = azoVar8;
                    }
                    if (i4 != 0) {
                        try {
                            sx3Var.m70826k4(new C12025x6(f9, fM2479dy), new C12025x6(fM1153kk, fM2479dy), azoVar, abstractC14897zn2);
                        } catch (Throwable th10) {
                            th = th10;
                            throw th;
                        }
                    }
                    c11896dy.dispose();
                    i14++;
                    abstractC14897zn3 = abstractC14897zn2;
                    f7 = f9;
                    shapeFrame = shapeFrame2;
                    sx3Var2 = sx3Var;
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            sx3 sx3Var3 = sx3Var2;
            AbstractC14897zn abstractC14897zn4 = abstractC14897zn3;
            int i16 = 0;
            while (i16 < i13) {
                Row rowM2491k42 = sx3Var3.m70835k4().f3493k4.m2491k4(i16);
                double dM2479dy2 = rowM2491k42.m2479dy();
                int colSpan2 = 0;
                while (colSpan2 < size2) {
                    Cell cellMo484k42 = rowM2491k42.mo484k4(colSpan2);
                    if (cellMo484k42.m463dy()) {
                        colSpan2 += cellMo484k42.m462du().getColSpan();
                    } else {
                        C12007ix c12007ixClone2 = sx3Var3.m70824k4(cellMo484k42, dM2479dy2).m2660k4().Clone();
                        ajz ajzVarM70825k42 = sx3Var3.m70825k4(cellMo484k42, dM2479dy2, kg7Var2);
                        int i17 = i16;
                        Row row3 = rowM2491k42;
                        abstractC14897zn4.m74614k4(new azo(ajzVarM70825k42, ((LineFormat) cellMo484k42.getCellFormat().getBorderDiagonalDown()).getEffective(), 0), new C12025x6(c12007ixClone2.m56571to(), c12007ixClone2.m56554dy()), new C12025x6(c12007ixClone2.m56556h4(), c12007ixClone2.m56558k4()));
                        azo azoVar9 = new azo(ajzVarM70825k42, ((LineFormat) cellMo484k42.getCellFormat().getBorderDiagonalUp()).getEffective(), 0);
                        if (i4 != 0) {
                            abstractC14897zn4.m74614k4(azoVar9, new C12025x6(c12007ixClone2.m56556h4(), c12007ixClone2.m56554dy()), new C12025x6(c12007ixClone2.m56571to(), c12007ixClone2.m56558k4()));
                        }
                        colSpan2 += cellMo484k42.getColSpan();
                        rowM2491k42 = row3;
                        i16 = i17;
                    }
                }
                i16++;
            }
            int i18 = 0;
            if (i4 != 0) {
                int i19 = 0;
                while (i19 < i13) {
                    Row rowM2491k43 = sx3Var3.m70835k4().f3493k4.m2491k4(i19);
                    double dM2479dy3 = rowM2491k43.m2479dy();
                    int colSpan3 = i18;
                    while (colSpan3 < size2) {
                        Cell cellMo484k43 = rowM2491k43.mo484k4(colSpan3);
                        if (cellMo484k43.m463dy()) {
                            colSpan3 += cellMo484k43.m462du().getColSpan();
                        } else {
                            ShapeFrame shapeFrameM70824k42 = sx3Var3.m70824k4(cellMo484k43, dM2479dy3);
                            C12007ix c12007ixClone3 = shapeFrameM70824k42.m2660k4().Clone();
                            C4317dy c4317dyM17345kk2 = c4317dy4.m17345kk();
                            byte textVerticalType = cellMo484k43.getTextVerticalType();
                            if (textVerticalType == 1) {
                                i = colSpan3;
                                cell = cellMo484k43;
                                c4317dyM17345kk2.m17348x1((c12007ixClone3.m56550c5() + c12007ixClone3.m56557jd()) - ((float) cell.getMarginRight()), c12007ixClone3.m56551ck() + ((float) cell.getMarginTop()));
                                c4317dyM17345kk2.m17334k4(90.0f);
                                abstractC14897zn4.m74622kk(c4317dyM17345kk2);
                                kg7Var2.m63842k4(new C12007ix(0.0f, 0.0f, (float) cell.getWidth(), (float) cell.getHeight()));
                                if (((TextFrame) cell.getTextFrame()).f3523to.mo64295k4(abstractC14897zn4, kg7Var2)) {
                                    i2 = i;
                                    baseSlide2 = baseSlide;
                                    cell2 = cell;
                                } else {
                                    FillFormat fillFormat2 = new FillFormat(m70835k4());
                                    fillFormat2.setFillType((byte) 4);
                                    fillFormat2.getPictureFillFormat().getPicture().setImage(((ImageCollection) m70835k4().getPresentation().getImages()).m1717k4());
                                    fillFormat2.getPictureFillFormat().setPictureFillMode(1);
                                    kg7 kg7Var4 = kg7Var2;
                                    i2 = i;
                                    baseSlide2 = baseSlide;
                                    cell2 = cell;
                                    abstractC14897zn4.mo68794k4(new C12007ix(0.0f, 0.0f, shapeFrameM70824k42.getWidth(), shapeFrameM70824k42.getHeight()), (azo) null, C0962es.m5659k4(new ajz(new ShapeFrame(0.0d, 0.0d, (((double) shapeFrameM70824k42.getWidth()) - cell.getMarginLeft()) - cell.getMarginRight(), (((double) shapeFrameM70824k42.getHeight()) - cell.getMarginTop()) - cell.getMarginBottom(), shapeFrameM70824k42.getFlipH(), shapeFrameM70824k42.getFlipV(), shapeFrameM70824k42.getRotation()), null, null, baseSlide2, kg7Var4), fillFormat2));
                                }
                                abstractC14897zn4.m74626rv();
                                colSpan3 = cell2.getColSpan() + i2;
                                sx3Var3 = this;
                                kg7Var2 = kg7Var;
                                baseSlide = baseSlide2;
                            } else {
                                if (textVerticalType != 2) {
                                    if (textVerticalType != 4 && textVerticalType != 5 && textVerticalType != 6) {
                                        c4317dyM17345kk2.m17348x1(c12007ixClone3.m56557jd() + ((float) cellMo484k43.getMarginLeft()), c12007ixClone3.m56551ck() + ((float) cellMo484k43.getMarginTop()));
                                    }
                                    i = colSpan3;
                                    cell = cellMo484k43;
                                    c4317dyM17345kk2.m17348x1((c12007ixClone3.m56550c5() + c12007ixClone3.m56557jd()) - ((float) cell.getMarginRight()), c12007ixClone3.m56551ck() + ((float) cell.getMarginTop()));
                                    c4317dyM17345kk2.m17334k4(90.0f);
                                    abstractC14897zn4.m74622kk(c4317dyM17345kk2);
                                    kg7Var2.m63842k4(new C12007ix(0.0f, 0.0f, (float) cell.getWidth(), (float) cell.getHeight()));
                                    if (((TextFrame) cell.getTextFrame()).f3523to.mo64295k4(abstractC14897zn4, kg7Var2)) {
                                    }
                                    abstractC14897zn4.m74626rv();
                                    colSpan3 = cell2.getColSpan() + i2;
                                    sx3Var3 = this;
                                    kg7Var2 = kg7Var;
                                    baseSlide = baseSlide2;
                                } else {
                                    c4317dyM17345kk2.m17348x1(c12007ixClone3.m56557jd() + ((float) cellMo484k43.getMarginLeft()), (c12007ixClone3.m56575x1() + c12007ixClone3.m56551ck()) - ((float) cellMo484k43.getMarginBottom()));
                                    c4317dyM17345kk2.m17334k4(270.0f);
                                }
                                i = colSpan3;
                                cell = cellMo484k43;
                                abstractC14897zn4.m74622kk(c4317dyM17345kk2);
                                kg7Var2.m63842k4(new C12007ix(0.0f, 0.0f, (float) cell.getWidth(), (float) cell.getHeight()));
                                if (((TextFrame) cell.getTextFrame()).f3523to.mo64295k4(abstractC14897zn4, kg7Var2)) {
                                }
                                abstractC14897zn4.m74626rv();
                                colSpan3 = cell2.getColSpan() + i2;
                                sx3Var3 = this;
                                kg7Var2 = kg7Var;
                                baseSlide = baseSlide2;
                            }
                        }
                    }
                    i19++;
                    sx3Var3 = this;
                    kg7Var2 = kg7Var;
                    i18 = 0;
                }
            }
            abstractC14897zn4.m74626rv();
            this.f48947to = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m70829k4(IEffectFormatEffectiveData iEffectFormatEffectiveData, byte b) {
        if ((b & 1) != 0) {
            return true;
        }
        if (iEffectFormatEffectiveData.isNoEffects()) {
            return false;
        }
        if (b != 2 || (iEffectFormatEffectiveData.getOuterShadowEffect() == null && iEffectFormatEffectiveData.getReflectionEffect() == null)) {
            return b == 4 && iEffectFormatEffectiveData.getInnerShadowEffect() != null;
        }
        return true;
    }
}
