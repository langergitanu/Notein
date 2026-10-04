package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p505xn.C12555c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3637ri extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private final int f10088k4;

    /* JADX INFO: renamed from: kk */
    private long f10089kk;

    /* JADX INFO: renamed from: to */
    private String f10090to;

    /* JADX INFO: renamed from: x1 */
    private long f10091x1;

    public C3637ri(int i) {
        this.f10088k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 13;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m14787x1() {
        return this.f10090to;
    }

    public C3637ri(int i, String str) {
        this.f10088k4 = i;
        this.f10090to = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        this.f10091x1 = c3134k4.m13384uz();
        long jM13384uz = c3134k4.m13384uz();
        this.f10089kk = jM13384uz;
        this.f10090to = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10088k4);
        if ((c3134k4.m13384uz() & 4294967295L) != 0) {
            throw new C3620j5();
        }
        if ((c3134k4.m13382u4() & 65535) != 0) {
            throw new C3620j5();
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        byte[] bArrMo26677to = C12555c5.m58552k4(this.f10088k4).mo26677to(this.f10090to);
        long length = (((long) bArrMo26677to.length) & 4294967295L) + 10;
        this.f10091x1 = length & 4294967295L;
        c3149x1.m13447k4(length & 4294967295L);
        c3149x1.m13447k4(this.f10089kk & 4294967295L);
        c3149x1.m13450k4(bArrMo26677to);
        c3149x1.m13447k4(0L);
        c3149x1.m13446k4(0);
    }
}
