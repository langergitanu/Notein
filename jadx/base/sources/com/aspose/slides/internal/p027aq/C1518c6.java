package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4647os;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1518c6 extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final long f6049k4;

    public C1518c6(long j) {
        this.f6049k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8306k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4647os c4647os = (C4647os) abstractC4623f9;
        if ((this.f6049k4 & 1) > 0) {
            new C1558xw().m8346k4(c4647os.m19285k4(), c3149x1);
        }
        if ((this.f6049k4 & 2) > 0) {
            c3149x1.m13455x1((int) c4647os.m19302x1());
        }
        if ((this.f6049k4 & 4) > 0) {
            c3149x1.m13455x1((int) c4647os.m19296kk());
        }
        if ((this.f6049k4 & 8) > 0) {
            c3149x1.m13455x1(c4647os.m19299to());
        }
        if ((this.f6049k4 & 16) > 0) {
            c3149x1.m13445k4(c4647os.m19281du());
        }
        if ((this.f6049k4 & 32) > 0) {
            c3149x1.m13455x1(c4647os.m19298m9());
        }
        if ((this.f6049k4 & 64) > 0) {
            c3149x1.m13455x1(c4647os.m19282dy());
        }
        if ((this.f6049k4 & 128) > 0) {
            c3149x1.m13445k4(c4647os.m19279c5());
        }
        if ((this.f6049k4 & 256) > 0) {
            new C1537ne().m8325k4(c4647os.m19284jd(), c3149x1);
        }
        if ((this.f6049k4 & 512) > 0) {
            c3149x1.m13455x1(c4647os.m19280ck());
        }
        if ((this.f6049k4 & 1024) > 0) {
            new C1530jd().m8318k4(c4647os.m19283fa(), c3149x1);
        }
        if ((this.f6049k4 & 2048) > 0) {
            new C1556x6().m8344k4(c4647os.m19301up(), c3149x1);
        }
        if ((this.f6049k4 & 4096) > 0) {
            new C1525fa().m8313k4(c4647os.m19306yj(), c3149x1);
        }
    }
}
