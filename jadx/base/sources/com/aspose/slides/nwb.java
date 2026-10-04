package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C8317n8;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C8831t2;

/* JADX INFO: loaded from: classes3.dex */
class nwb extends AbstractC14443sc {
    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4281k4(ChartSeries chartSeries, C8317n8 c8317n8) {
        if (c8317n8.m37318k4() == null) {
            chartSeries.setParentLabelLayout(2);
            return;
        }
        int iM41508k4 = c8317n8.m37318k4().m41508k4();
        if (iM41508k4 != 0) {
            if (iM41508k4 == 1) {
                chartSeries.setParentLabelLayout(1);
                return;
            } else if (iM41508k4 == 2) {
                chartSeries.setParentLabelLayout(0);
                return;
            } else if (iM41508k4 != 3) {
                return;
            }
        }
        chartSeries.setParentLabelLayout(2);
    }

    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4282k4(ChartSeries chartSeries, C8324nc c8324nc) {
        C8317n8 c8317n8 = new C8317n8();
        C8831t2 c8831t2 = new C8831t2();
        int parentLabelLayout = chartSeries.getParentLabelLayout();
        if (parentLabelLayout == 0) {
            c8831t2.m41509k4(2);
        } else if (parentLabelLayout == 1) {
            c8831t2.m41509k4(1);
        } else if (parentLabelLayout == 2) {
            c8831t2.m41509k4(3);
        }
        c8317n8.m37323k4(c8831t2);
        c8324nc.m37389k4(c8317n8);
    }
}
