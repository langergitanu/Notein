package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.ji */
/* JADX INFO: loaded from: classes3.dex */
class C13686ji {
    /* JADX INFO: renamed from: k4 */
    public static void m63323k4(C13646iq c13646iq, com.aspose.slides.internal.p332p7.m5j m5jVar, hxc hxcVar) {
        long j;
        long j2;
        if (m5jVar == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.ipw[] ipwVarArrM38926x1 = m5jVar.m36689m9().m38926x1();
        int length = ipwVarArrM38926x1.length;
        int i = 0;
        while (true) {
            j = 1;
            if (i >= length) {
                break;
            }
            com.aspose.slides.internal.p332p7.ipw ipwVar = ipwVarArrM38926x1[i];
            if (!c13646iq.f45336kk.containsKey(Long.valueOf(((ipwVar.m34385x1() & 4294967295L) - 1) & 4294967295L))) {
                c13646iq.f45336kk.addItem(Long.valueOf(((ipwVar.m34385x1() & 4294967295L) - 1) & 4294967295L), Boolean.valueOf(ipwVar.m34383kk()));
            }
            for (com.aspose.slides.internal.p332p7.sw4 sw4Var : ipwVar.m34384to()) {
                hxcVar.m7322du().throwIfInterruptionRequested();
                ChartDataCell chartDataCell = new ChartDataCell(c13646iq);
                C14209nz.m68288k4(chartDataCell, sw4Var, hxcVar);
                c13646iq.m63046k4(chartDataCell);
            }
            i++;
        }
        for (com.aspose.slides.internal.p332p7.rqx rqxVar : m5jVar.m36648h4()) {
            for (com.aspose.slides.internal.p332p7.fz8 fz8Var : rqxVar.m40173k4()) {
                long jM32195k4 = ((fz8Var.m32195k4() & 4294967295L) - j) & 4294967295L;
                while ((jM32195k4 & 4294967295L) <= (((fz8Var.m32197x1() & 4294967295L) - j) & 4294967295L)) {
                    if (c13646iq.f45338to.containsKey(Long.valueOf(jM32195k4))) {
                        j2 = j;
                    } else {
                        j2 = j;
                        c13646iq.f45338to.addItem(Long.valueOf(jM32195k4), Boolean.valueOf(fz8Var.m32196kk()));
                    }
                    jM32195k4 += j2;
                    j = j2;
                }
            }
        }
    }
}
