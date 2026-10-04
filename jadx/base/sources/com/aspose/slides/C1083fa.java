package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.fa */
/* JADX INFO: loaded from: classes3.dex */
class C1083fa {
    /* JADX INFO: renamed from: k4 */
    public static <TLocalData, TEffectiveData extends AbstractC0858ck<TLocalData, TEffectiveData>> TEffectiveData m6057k4(Class<TEffectiveData> cls, TLocalData tlocaldata) {
        return (TEffectiveData) m6058k4((Class) cls, (InterfaceC14376r6) tlocaldata);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m6060x1(InterfaceC14376r6 interfaceC14376r6) {
        if (C7019kk.m27469x1(interfaceC14376r6, PortionFormat.class)) {
            return AbstractC0872cw.m4827k4((PortionFormat) interfaceC14376r6);
        }
        if (C7019kk.m27469x1(interfaceC14376r6, ChartPortionFormat.class)) {
            return C14911zr.m74775kk((ChartPortionFormat) interfaceC14376r6);
        }
        if (C7019kk.m27469x1(interfaceC14376r6, ColumnFormat.class)) {
            return C13765l7.m64321x1((ColumnFormat) interfaceC14376r6);
        }
        if (C7019kk.m27469x1(interfaceC14376r6, RowFormat.class)) {
            return swa.m70811x1((RowFormat) interfaceC14376r6);
        }
        if (C7019kk.m27469x1(interfaceC14376r6, TableFormat.class)) {
            return uit.m71705x1((TableFormat) interfaceC14376r6);
        }
        if (C7019kk.m27469x1(interfaceC14376r6, FillFormat.class)) {
            return C14176nc.m67920to((FillFormat) interfaceC14376r6);
        }
        if (C7019kk.m27469x1(interfaceC14376r6, LineFormat.class)) {
            return skr.m70660kk((LineFormat) interfaceC14376r6);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC14672vc m6058k4(Class cls, InterfaceC14376r6 interfaceC14376r6) {
        if (cls == C14329q6.class) {
            return C14329q6.m69425k4((Background) interfaceC14376r6);
        }
        if (cls == C13750kw.class) {
            return C13750kw.m64212k4((BulletFormat) interfaceC14376r6);
        }
        if (cls == C1231hx.class) {
            return C1231hx.m7317k4((CellFormat) interfaceC14376r6);
        }
        if (cls == C14911zr.class) {
            return C14911zr.m74771k4((ChartPortionFormat) interfaceC14376r6);
        }
        if (cls == C13765l7.class) {
            return C13765l7.m64319k4((ColumnFormat) interfaceC14376r6);
        }
        if (cls == C14754wx.class) {
            return C14754wx.m72944k4((EffectFormat) interfaceC14376r6);
        }
        if (cls == C14176nc.class) {
            return C14176nc.m67922x1((FillFormat) interfaceC14376r6);
        }
        if (cls == skr.class) {
            return skr.m70658k4((LineFormat) interfaceC14376r6);
        }
        if (cls == fqc.class) {
            return fqc.m6266k4((ParagraphFormat) interfaceC14376r6);
        }
        if (cls == lrb.class) {
            return lrb.m64516k4((PortionFormat) interfaceC14376r6);
        }
        if (cls == swa.class) {
            return swa.m70809k4((RowFormat) interfaceC14376r6);
        }
        if (cls == uit.class) {
            return uit.m71703k4((TableFormat) interfaceC14376r6);
        }
        if (cls == w0l.class) {
            return w0l.m72606k4((TextFrameFormat) interfaceC14376r6);
        }
        if (cls == fz8.class) {
            return fz8.m6361k4((TextStyle) interfaceC14376r6);
        }
        if (cls == fpw.class) {
            return fpw.m6250k4((ThreeDFormat) interfaceC14376r6);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m6059k4(InterfaceC14376r6 interfaceC14376r6) {
        if (C7019kk.m27469x1(interfaceC14376r6, CellFormat.class)) {
            return C1231hx.m7320x1((CellFormat) C7019kk.m27452k4((Object) interfaceC14376r6, CellFormat.class));
        }
        if (C7019kk.m27469x1(interfaceC14376r6, ColumnFormat.class) || C7019kk.m27469x1(interfaceC14376r6, RowFormat.class)) {
            return true;
        }
        if (C7019kk.m27469x1(interfaceC14376r6, ParagraphFormat.class)) {
            return fqc.m6270x1((ParagraphFormat) C7019kk.m27452k4((Object) interfaceC14376r6, ParagraphFormat.class));
        }
        return false;
    }
}
