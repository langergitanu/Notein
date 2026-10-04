package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ev */
/* JADX INFO: loaded from: classes3.dex */
class C0966ev extends AbstractC13836mg {

    /* JADX INFO: renamed from: kk */
    private C0852cf f4880kk;

    /* JADX INFO: renamed from: to */
    private int f4881to;

    /* JADX INFO: renamed from: x1 */
    private C0791b3 f4882x1;

    public C0966ev(C0791b3 c0791b3, C0852cf c0852cf, int i) {
        super(c0852cf);
        this.f4880kk = c0852cf;
        this.f4882x1 = c0791b3;
        this.f4881to = i;
    }

    /* JADX INFO: renamed from: ck */
    private String m5731ck() {
        C14365qy c14365qyM4563k4 = this.f4880kk.m4563k4();
        C1210hn c1210hn = this.f4880kk.m4563k4().m69871x1().get_Item(this.f4882x1.m3953jd().m72974k4(this.f4882x1));
        String numberFormat = this.f4880kk.m4570x1().getDataLabelFormat().getNumberFormat();
        if (!C14337qc.f48301x1.containsItem(numberFormat) && !C14113y2.m67411k4(numberFormat)) {
            return xhm.m73361k4(c1210hn.m7238x1(), numberFormat);
        }
        return C0841c4.m4468k4(c1210hn.m7238x1(), c14365qyM4563k4.m69854ne());
    }

    /* JADX INFO: renamed from: fa */
    private String m5732fa() {
        double dM3966u4;
        int i = this.f4881to;
        if (i == 0) {
            dM3966u4 = this.f4882x1.m3966u4();
        } else if (i == 1) {
            dM3966u4 = this.f4882x1.m3952ix();
        } else if (i == 2) {
            dM3966u4 = this.f4882x1.m3962ne();
        } else if (i == 3) {
            dM3966u4 = this.f4882x1.m3971x6();
        } else if (i == 4) {
            dM3966u4 = this.f4882x1.m3960ks();
        } else {
            if (i != 5) {
                throw new NotImplementedException(C14113y2.m67408k4("Unsupported value: ", C14042ak.m66410k4(C14444sd.class, this.f4881to)));
            }
            dM3966u4 = this.f4882x1.m3964rv();
        }
        return C14044b3.m66425h4(dM3966u4);
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        IDataLabelFormat dataLabelFormat = this.f4880kk.m4570x1().getDataLabelFormat();
        String strM55050ix = C11697x1.m55255x1().m55263fa().m55050ix();
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m5733m9());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m5731ck());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m5732fa());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: m9 */
    public final String m5733m9() {
        return this.f4882x1.m3953jd().m72976kk().getName().toString();
    }
}
