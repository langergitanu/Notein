package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.bv */
/* JADX INFO: loaded from: classes3.dex */
class C3599bv extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private final int f9995k4;

    /* JADX INFO: renamed from: kk */
    private String f9996kk;

    /* JADX INFO: renamed from: x1 */
    private String f9997x1;

    public C3599bv(int i) {
        this.f9995k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m14696k4() {
        return this.f9997x1;
    }

    public C3599bv(int i, String str) {
        this.f9995k4 = i;
        this.f9997x1 = str;
        this.f9996kk = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f9997x1 = C3624kk.m14768k4(C3623k4.m14766k4(c3134k4, (byte) 0), this.f9995k4);
        List list = new List();
        while ((C3623k4.m14767x1(c3134k4) & 255) != 0 && (C3623k4.m14767x1(c3134k4) & 255) != 0) {
            list.addRange(AbstractC14092to.m67204k4((Object[]) C3085sv.m13099k4(c3134k4.m13372dy(2))));
        }
        c3134k4.m13372dy(2);
        this.f9996kk = C3624kk.m14769k4(C3085sv.m13110x1((List<Byte>) list), AbstractC6747ar.m26643rv());
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        C3657x1.m14835k4(c3149x1, this.f9997x1, this.f9995k4);
        c3149x1.m13443k4((byte) 0);
        C3657x1.m14836k4(c3149x1, this.f9996kk, AbstractC6747ar.m26643rv());
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 0);
    }
}
