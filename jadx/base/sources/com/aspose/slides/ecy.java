package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
class ecy implements InterfaceC14836y7 {

    /* JADX INFO: renamed from: k4 */
    private ChartDataWorksheet f4740k4;

    public ecy(ChartDataWorksheet chartDataWorksheet) {
        this.f4740k4 = chartDataWorksheet;
    }

    @Override // com.aspose.slides.InterfaceC14836y7
    /* JADX INFO: renamed from: k4 */
    public final IGenericList<InterfaceC1124fx> mo5424k4(int i, int i2, int i3, int i4) {
        IGenericList<ChartDataCell> iGenericListM63045k4 = this.f4740k4.m703x1().m63045k4(i - 1, i2 - 1, i3 - 1, i4 - 1);
        int size = iGenericListM63045k4.size();
        InterfaceC1124fx[] interfaceC1124fxArr = new InterfaceC1124fx[size];
        for (int i5 = 0; i5 < size; i5++) {
            interfaceC1124fxArr[i5] = iGenericListM63045k4.get_Item(i5).m559c5();
        }
        return AbstractC14092to.m67204k4((Object[]) interfaceC1124fxArr);
    }

    @Override // com.aspose.slides.InterfaceC14836y7
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1124fx mo5428x1(int i, int i2) {
        ChartDataCell chartDataCellM63043k4 = this.f4740k4.m703x1().m63043k4(i - 1, i2 - 1);
        if (chartDataCellM63043k4 != null) {
            return ((ChartDataCell) C7019kk.m27452k4((Object) chartDataCellM63043k4, ChartDataCell.class)).m559c5();
        }
        return null;
    }

    @Override // com.aspose.slides.InterfaceC14836y7
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC0933ea mo5425k4() {
        return this.f4740k4.m702to().m690x1();
    }

    @Override // com.aspose.slides.InterfaceC14836y7
    /* JADX INFO: renamed from: x1 */
    public final String mo5429x1() {
        return this.f4740k4.getName();
    }

    @Override // com.aspose.slides.InterfaceC14836y7
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1124fx mo5426k4(int i, int i2) {
        return ((ChartDataCell) C7019kk.m27452k4((Object) this.f4740k4.m703x1().m63051x1(i - 1, i2 - 1), ChartDataCell.class)).m559c5();
    }

    @Override // com.aspose.slides.InterfaceC14836y7
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo5427k4(InterfaceC0761as interfaceC0761as) {
        return interfaceC0761as.mo3719k4(new rft(this.f4740k4.m695h4()));
    }
}
