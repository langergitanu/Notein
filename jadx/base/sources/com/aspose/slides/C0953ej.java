package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ej */
/* JADX INFO: loaded from: classes3.dex */
class C0953ej extends AbstractC13836mg {

    /* JADX INFO: renamed from: kk */
    private C0852cf f4808kk;

    /* JADX INFO: renamed from: x1 */
    private C0791b3 f4809x1;

    public C0953ej(C0791b3 c0791b3, C0852cf c0852cf) {
        super(c0852cf);
        this.f4808kk = c0852cf;
        this.f4809x1 = c0791b3;
    }

    /* JADX INFO: renamed from: ck */
    private String m5562ck() {
        return C14044b3.m66425h4(this.f4809x1.m3950fa());
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        IDataLabelFormat dataLabelFormat = this.f4808kk.m4570x1().getDataLabelFormat();
        String strM55050ix = C11697x1.m55255x1().m55263fa().m55050ix();
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m5563m9());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m5562ck());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: m9 */
    public final String m5563m9() {
        return this.f4809x1.m3953jd().m72976kk().getName().toString();
    }
}
