package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class mco {

    /* JADX INFO: renamed from: du */
    private com.aspose.slides.internal.p332p7.g3j f46212du;

    /* JADX INFO: renamed from: k4 */
    long f46213k4;

    /* JADX INFO: renamed from: kk */
    private List<com.aspose.slides.internal.p332p7.mhp> f46214kk = new List<>();

    /* JADX INFO: renamed from: to */
    private ChartDataWorkbook f46215to;

    /* JADX INFO: renamed from: x1 */
    long f46216x1;

    public mco(ChartDataWorkbook chartDataWorkbook) {
        this.f46215to = chartDataWorkbook;
    }

    /* JADX INFO: renamed from: k4 */
    public int m64839k4(com.aspose.slides.internal.p332p7.mhp mhpVar) {
        this.f46214kk.addItem(mhpVar);
        return this.f46214kk.size() - 1;
    }

    /* JADX INFO: renamed from: kk */
    public com.aspose.slides.internal.p332p7.g3j m64844kk() {
        return this.f46212du;
    }

    /* JADX INFO: renamed from: x1 */
    public int m64845x1() {
        return this.f46214kk.size();
    }

    /* JADX INFO: renamed from: k4 */
    public int m64840k4(String str) {
        com.aspose.slides.internal.p332p7.mhp mhpVar = new com.aspose.slides.internal.p332p7.mhp();
        mhpVar.m36964k4(str);
        this.f46214kk.addItem(mhpVar);
        return this.f46214kk.size() - 1;
    }

    /* JADX INFO: renamed from: x1 */
    public com.aspose.slides.internal.p332p7.mhp m64846x1(int i) {
        return this.f46214kk.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public String m64841k4(int i) {
        com.aspose.slides.internal.p332p7.mhp mhpVar = this.f46214kk.get_Item(i);
        String strM36963k4 = mhpVar.m36963k4();
        if (strM36963k4 != null) {
            return strM36963k4;
        }
        if (mhpVar.m36965x1().length <= 0) {
            throw new NotImplementedException(C14113y2.m67408k4("SharedString with index ", C14057f9.m66591x1(i), " has unknown type"));
        }
        for (com.aspose.slides.internal.p332p7.xf2 xf2Var : mhpVar.m36965x1()) {
            strM36963k4 = C14113y2.m67400k4(strM36963k4, xf2Var.m44329k4());
        }
        return strM36963k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m64842k4() {
        this.f46213k4 = 0L;
        this.f46216x1 = 0L;
        this.f46214kk.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public void m64843k4(com.aspose.slides.internal.p332p7.g3j g3jVar) {
        this.f46212du = g3jVar;
    }
}
