package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.oc */
/* JADX INFO: loaded from: classes3.dex */
class C14222oc extends a4w {
    public C14222oc(LegendEntryProperties legendEntryProperties, C0886d8 c0886d8) {
        super(legendEntryProperties);
        m3226k4(new z3m(m68442k4(c0886d8)));
        m3224k4((otz) new C14469st(c0886d8));
        m73215k4((AbstractC14770x9) m3228m9());
        m73215k4((AbstractC14770x9) m3223dy());
    }

    /* JADX INFO: renamed from: k4 */
    private String m68442k4(C0886d8 c0886d8) {
        String strM67408k4 = C14113y2.f47374k4;
        if (c0886d8.m5007rv() >= 0) {
            C13847mr c13847mrM5012up = c0886d8.m5012up();
            ChartSeries chartSeriesM64945h4 = c13847mrM5012up.m64945h4();
            C14365qy c14365qyM64941c5 = c13847mrM5012up.m64941c5();
            List<C1210hn> listM69848kk = chartSeriesM64945h4.getPlotOnSecondAxis() ? c14365qyM64941c5.m69848kk() : c14365qyM64941c5.m69871x1();
            if (listM69848kk.size() == 0) {
                strM67408k4 = C14057f9.m66591x1(c0886d8.m5007rv() + 1);
            }
            if (c0886d8.m5007rv() < listM69848kk.size()) {
                C1210hn c1210hnM7229k4 = listM69848kk.get_Item(c0886d8.m5007rv());
                do {
                    strM67408k4 = C14113y2.m67408k4(xhm.m73361k4(c1210hnM7229k4.m7238x1(), c1210hnM7229k4.m7228h4()), strM67408k4);
                    c1210hnM7229k4 = c1210hnM7229k4.m7229k4();
                    if (c1210hnM7229k4 != null) {
                        strM67408k4 = C14113y2.m67408k4(" ", strM67408k4);
                    }
                } while (c1210hnM7229k4 != null);
            }
        }
        return strM67408k4;
    }
}
