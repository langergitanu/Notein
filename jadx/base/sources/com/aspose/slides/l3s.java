package com.aspose.slides;

import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class l3s extends uaw {
    public l3s(C11791os c11791os, ctu ctuVar) {
        super(c11791os, ctuVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64284k4(ChartDataWorksheet chartDataWorksheet) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "table".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.d6s d6sVar = new com.aspose.slides.internal.p332p7.d6s(m55443jd());
                kvj kvjVar = new kvj(chartDataWorksheet, d6sVar.m30188du());
                rqz rqzVarM64201h4 = kvjVar.m64201h4();
                rqzVarM64201h4.m70286k4(d6sVar.m30218qq());
                rqzVarM64201h4.m70294kk(d6sVar.m30220to());
                rqzVarM64201h4.m70280jd(d6sVar.m30229wl());
                rqzVarM64201h4.m70272du(d6sVar.m30224u4());
                rqzVarM64201h4.m70271du(d6sVar.m30235yj());
                rqzVarM64201h4.m70313x1(d6sVar.m30209kk());
                rqzVarM64201h4.m70297m9(d6sVar.m30219rv());
                rqzVarM64201h4.m70304to(d6sVar.m30197ix());
                rqzVarM64201h4.m70312x1(d6sVar.m30214m9());
                rqzVarM64201h4.m70303to(d6sVar.m30226up());
                rqzVarM64201h4.m70284k4(d6sVar.m30200k4());
                rqzVarM64201h4.m70291k4(d6sVar.m30192dy());
                rqzVarM64201h4.m70314x1(d6sVar.m30186c5());
                rqzVarM64201h4.m70290k4(d6sVar.m30230x1());
                rqzVarM64201h4.m70305to(d6sVar.m30193fa());
                rqzVarM64201h4.m70288k4(d6sVar.m30183ar());
                rqzVarM64201h4.m70273dy(d6sVar.m30234x6());
                rqzVarM64201h4.m70289k4(d6sVar.m30225um());
                rqzVarM64201h4.m70287k4(d6sVar.m30184bv());
                rqzVarM64201h4.m70283k4(d6sVar.m30194h4());
                rqzVarM64201h4.m70268c5(d6sVar.m30217ne());
                rqzVarM64201h4.m70278h4(d6sVar.m30227uz());
                rqzVarM64201h4.m70293kk(d6sVar.m30198jd());
                rqzVarM64201h4.m70277h4(d6sVar.m30213ks());
                rqzVarM64201h4.m70295kk(d6sVar.m30187ck());
                rqzVarM64201h4.m70285k4(d6sVar.m30228v4());
                chartDataWorksheet.m696k4().m64129k4(kvjVar);
            }
        }
        mo55330fa();
    }

    public l3s(C11791os c11791os, hxc hxcVar) {
        super(c11791os, hxcVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64285k4(kvj kvjVar) {
        mo55332up();
        com.aspose.slides.internal.p332p7.d6s d6sVar = new com.aspose.slides.internal.p332p7.d6s();
        rqz rqzVarM64201h4 = kvjVar.m64201h4();
        com.aspose.slides.internal.p332p7.wsf wsfVarM30225um = d6sVar.m30225um();
        int iM64209x1 = kvjVar.m64209x1();
        int i = 0;
        long j = 1;
        while (iM64209x1 <= kvjVar.m64204kk()) {
            ChartDataCell chartDataCellM63051x1 = kvjVar.m64202k4().m703x1().m63051x1(kvjVar.m64207to(), iM64209x1);
            String strM67401k4 = C14113y2.m67401k4(C12380dy.m57972k4(chartDataCellM63051x1.m574m9(), "(\r\n)|[\n\r]", "_x000a_"), "\t", " ");
            if (C14113y2.m67363du(strM67401k4, C14113y2.f47374k4)) {
                i++;
                String strM67402k4 = i > 1 ? C14113y2.m67402k4("Column{0:00}", Integer.valueOf(i)) : " ";
                chartDataCellM63051x1.m571k4(strM67402k4);
                strM67401k4 = strM67402k4;
            }
            com.aspose.slides.internal.p332p7.erz erzVarM44018k4 = wsfVarM30225um.m44018k4();
            erzVarM44018k4.m31271k4(strM67401k4);
            erzVarM44018k4.m31270k4(j);
            iM64209x1++;
            j++;
        }
        wsfVarM30225um.m44019k4(((j & 4294967295L) - 1) & 4294967295L);
        d6sVar.m30222to(kvjVar.m64206m9());
        d6sVar.m30204k4(rqzVarM64201h4.m70310wl());
        d6sVar.m30211kk(rqzVarM64201h4.m70302to());
        d6sVar.m30199jd(rqzVarM64201h4.m70309uz());
        d6sVar.m30196h4(rqzVarM64201h4.m70279ix());
        d6sVar.m30189du(rqzVarM64201h4.m70308up());
        d6sVar.m30232x1(rqzVarM64201h4.m70292kk());
        d6sVar.m30215m9(rqzVarM64201h4.m70296ks());
        d6sVar.m30190du(rqzVarM64201h4.m70299ne());
        d6sVar.m30231x1(rqzVarM64201h4.m70276h4());
        d6sVar.m30221to(rqzVarM64201h4.m70275fa());
        d6sVar.m30202k4(rqzVarM64201h4.m70282k4());
        d6sVar.m30208k4(rqzVarM64201h4.m70298m9());
        d6sVar.m30233x1(rqzVarM64201h4.m70274dy());
        d6sVar.m30207k4(rqzVarM64201h4.m70311x1());
        d6sVar.m30223to(rqzVarM64201h4.m70269ck());
        d6sVar.m30206k4(rqzVarM64201h4.m70300qq());
        d6sVar.m30191dy(rqzVarM64201h4.m70301rv());
        d6sVar.m30205k4(rqzVarM64201h4.m70266ar());
        d6sVar.m30201k4(rqzVarM64201h4.m70270du());
        d6sVar.m30185c5(rqzVarM64201h4.m70315x6());
        d6sVar.m30216m9(rqzVarM64201h4.m70306u4());
        d6sVar.m30210kk(rqzVarM64201h4.m70267c5());
        d6sVar.m30195h4(rqzVarM64201h4.m70316yj());
        d6sVar.m30212kk(rqzVarM64201h4.m70281jd());
        d6sVar.m30203k4(rqzVarM64201h4.m70307um());
        d6sVar.mo6846k4(null, m55442ck(), "table");
        mo55333yj();
    }
}
