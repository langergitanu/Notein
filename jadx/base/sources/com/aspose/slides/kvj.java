package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes3.dex */
class kvj {

    /* JADX INFO: renamed from: du */
    private int f45886du;

    /* JADX INFO: renamed from: h4 */
    private final ChartDataWorksheet f45887h4;

    /* JADX INFO: renamed from: k4 */
    va3 f45888k4;

    /* JADX INFO: renamed from: kk */
    private int f45889kk;

    /* JADX INFO: renamed from: m9 */
    private final rqz f45890m9 = new rqz();

    /* JADX INFO: renamed from: to */
    private int f45891to;

    /* JADX INFO: renamed from: x1 */
    private int f45892x1;

    public kvj(ChartDataWorksheet chartDataWorksheet) {
        this.f45887h4 = chartDataWorksheet;
    }

    /* JADX INFO: renamed from: du */
    public final int m64200du() {
        return this.f45886du;
    }

    /* JADX INFO: renamed from: h4 */
    public final rqz m64201h4() {
        return this.f45890m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartDataWorksheet m64202k4() {
        return this.f45887h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m64204kk() {
        return this.f45889kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m64206m9() {
        return C14113y2.m67408k4(this.f45887h4.m703x1().m63051x1(this.f45891to, this.f45892x1).m561du(), C18241k5.f55433h, this.f45887h4.m703x1().m63051x1(this.f45886du, this.f45889kk).m561du());
    }

    /* JADX INFO: renamed from: to */
    public final int m64207to() {
        return this.f45891to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m64209x1() {
        return this.f45892x1;
    }

    public kvj(ChartDataWorksheet chartDataWorksheet, va3 va3Var) {
        this.f45887h4 = chartDataWorksheet;
        this.f45888k4 = va3Var;
        if (va3Var.m72162kk() != null) {
            String[] strArrM67414k4 = C14113y2.m67414k4(this.f45888k4.m72162kk().m68030x1(), ':');
            int[] iArr = {this.f45892x1};
            int[] iArr2 = {this.f45891to};
            ChartDataWorkbook.m660k4(strArrM67414k4[0], iArr, iArr2);
            this.f45892x1 = iArr[0];
            this.f45891to = iArr2[0];
            int[] iArr3 = {this.f45889kk};
            int[] iArr4 = {this.f45886du};
            ChartDataWorkbook.m660k4(strArrM67414k4[1], iArr3, iArr4);
            this.f45889kk = iArr3[0];
            this.f45886du = iArr4[0];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64203k4(int i) {
        this.f45892x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m64205kk(int i) {
        this.f45891to = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m64208to(int i) {
        this.f45886du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64210x1(int i) {
        this.f45889kk = i;
    }

    public kvj(ChartDataWorksheet chartDataWorksheet, String str) {
        this.f45887h4 = chartDataWorksheet;
        if (C14113y2.m67411k4(str)) {
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ':');
        int[] iArr = {this.f45892x1};
        int[] iArr2 = {this.f45891to};
        ChartDataWorkbook.m660k4(strArrM67414k4[0], iArr, iArr2);
        this.f45892x1 = iArr[0];
        this.f45891to = iArr2[0];
        int[] iArr3 = {this.f45889kk};
        int[] iArr4 = {this.f45886du};
        ChartDataWorkbook.m660k4(strArrM67414k4[1], iArr3, iArr4);
        this.f45889kk = iArr3[0];
        this.f45886du = iArr4[0];
    }
}
