package com.aspose.slides.internal.p383rp;

import com.aspose.slides.internal.p185il.C5103kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10039x1 extends AbstractC10035k4 {
    public AbstractC10039x1(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
        long[] jArrM26579ks = c6740x1.m26579ks();
        long[] jArrM26599yj = c6740x1.m26599yj();
        if (jArrM26579ks == null || jArrM26599yj == null) {
            throw new C5103kk("Cannot read image data. The strip offset counts or strip byte counts were undefined.");
        }
        if (jArrM26579ks.length != jArrM26599yj.length) {
            throw new C5103kk("Cannot read image data. The strip offset counts and strip byte counts array lengths are not equal.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9);
}
