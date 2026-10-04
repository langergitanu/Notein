package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.rv */
/* JADX INFO: loaded from: classes3.dex */
class C3638rv extends AbstractC3661y2 {

    /* JADX INFO: renamed from: du */
    private String f10092du;

    /* JADX INFO: renamed from: k4 */
    private final int f10093k4;

    /* JADX INFO: renamed from: kk */
    private String f10094kk;

    /* JADX INFO: renamed from: to */
    private long f10095to;

    /* JADX INFO: renamed from: x1 */
    private long f10096x1;

    public C3638rv(int i) {
        this.f10093k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 28;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10096x1 = jM13384uz;
        this.f10094kk = C3623k4.m14764k4(c3134k4, (int) jM13384uz, this.f10093k4);
        if ((c3134k4.m13382u4() & 65535) != 72) {
            throw new C3620j5();
        }
        long jM13384uz2 = c3134k4.m13384uz();
        this.f10095to = jM13384uz2;
        this.f10092du = C3623k4.m14765k4(c3134k4, (int) jM13384uz2, AbstractC6747ar.m26643rv());
    }

    public C3638rv(int i, String str) {
        this.f10093k4 = i;
        this.f10094kk = str;
        this.f10092du = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14837x1(c3149x1, this.f10094kk, this.f10093k4);
        c3149x1.m13446k4(72);
        C3657x1.m14838x1(c3149x1, this.f10092du, AbstractC6747ar.m26643rv());
    }
}
