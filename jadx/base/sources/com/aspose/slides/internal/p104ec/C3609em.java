package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.em */
/* JADX INFO: loaded from: classes3.dex */
public class C3609em extends AbstractC3661y2 {

    /* JADX INFO: renamed from: du */
    private String f10025du;

    /* JADX INFO: renamed from: k4 */
    private final int f10026k4;

    /* JADX INFO: renamed from: kk */
    private String f10027kk;

    /* JADX INFO: renamed from: to */
    private long f10028to;

    /* JADX INFO: renamed from: x1 */
    private long f10029x1;

    public C3609em(int i) {
        this.f10026k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 22;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m14723x1() {
        return this.f10027kk;
    }

    public C3609em(int i, String str) {
        this.f10026k4 = i;
        this.f10027kk = str;
        this.f10025du = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        String strM26681x1;
        long jM13384uz = c3134k4.m13384uz();
        this.f10029x1 = jM13384uz;
        this.f10027kk = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10026k4);
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 62) {
            c3134k4.m13382u4();
            long jM13384uz2 = c3134k4.m13384uz();
            this.f10028to = jM13384uz2;
            strM26681x1 = C3623k4.m14765k4(c3134k4, (int) jM13384uz2, AbstractC6747ar.m26643rv());
        } else {
            byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(this.f10027kk);
            this.f10028to = ((long) bArrMo26677to.length) & 4294967295L;
            strM26681x1 = AbstractC6747ar.m26643rv().m26681x1(bArrMo26677to);
        }
        this.f10025du = strM26681x1;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14837x1(c3149x1, this.f10027kk, this.f10026k4);
        c3149x1.m13446k4(62);
        C3657x1.m14838x1(c3149x1, this.f10025du, AbstractC6747ar.m26643rv());
    }
}
