package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseChartValue implements IBaseChartValue, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private Chart f1046du;

    /* JADX INFO: renamed from: k4 */
    InterfaceC14397rj f1047k4;

    /* JADX INFO: renamed from: kk */
    private int f1048kk;

    /* JADX INFO: renamed from: to */
    private boolean f1049to;

    /* JADX INFO: renamed from: x1 */
    private C0936ec f1050x1;

    public BaseChartValue(InterfaceC14397rj interfaceC14397rj, C0936ec c0936ec, boolean z) {
        if (this.f1049to && c0936ec == null) {
            throw new ArgumentException(C14113y2.m67408k4("centralizedTypeChangingRestriction paranenter is true ", "and so dataSourceTypeHolder can't be null"));
        }
        this.f1047k4 = interfaceC14397rj;
        this.f1049to = z;
        this.f1050x1 = c0936ec;
    }

    @Override // com.aspose.slides.IBaseChartValue
    public abstract Object getData();

    @Override // com.aspose.slides.IBaseChartValue
    public final int getDataSourceType() {
        C0936ec c0936ec = this.f1050x1;
        return c0936ec != null ? c0936ec.m5400k4() : this.f1048kk;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1047k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Chart m340k4() {
        Chart chart = this.f1046du;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, this.f1047k4, chartArr);
            this.f1046du = chartArr[0];
        }
        return this.f1046du;
    }

    @Override // com.aspose.slides.IBaseChartValue
    public abstract void setData(Object obj);

    @Override // com.aspose.slides.IBaseChartValue
    public final void setDataSourceType(int i) {
        if (this.f1049to) {
            throw new InvalidOperationException(C14113y2.m67408k4("This BaseChartValue instance is created with ", "CentralizedTypeChangingRestriction and so DataSourceType is ", "centralized managed with dataSourceTypeHolder whitch is passed as parameter into constructor."));
        }
        C0936ec c0936ec = this.f1050x1;
        if (c0936ec != null) {
            c0936ec.m5401k4(i);
        } else {
            this.f1048kk = i;
        }
    }
}
