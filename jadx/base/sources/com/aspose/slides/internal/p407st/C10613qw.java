package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qw */
/* JADX INFO: loaded from: classes4.dex */
public class C10613qw {

    /* JADX INFO: renamed from: du */
    public byte[] f37333du;

    /* JADX INFO: renamed from: k4 */
    public long f37334k4;

    /* JADX INFO: renamed from: kk */
    public byte[] f37335kk;

    /* JADX INFO: renamed from: to */
    public long f37336to;

    /* JADX INFO: renamed from: x1 */
    public byte[] f37337x1;

    public C10613qw() {
    }

    /* JADX INFO: renamed from: k4 */
    public int m51609k4() {
        return ((int) (this.f37336to & 4294967295L)) + 40;
    }

    public C10613qw(String str, long j) {
        this.f37334k4 = 16L;
        byte[] bArrM66539k4 = C14047bz.m66536x1().m66539k4();
        this.f37337x1 = bArrM66539k4;
        C10603qc c10603qc = new C10603qc(str, bArrM66539k4, j);
        try {
            C10406dp c10406dpM51562k4 = c10603qc.m51562k4(0L);
            c10603qc.dispose();
            byte[] bArrM66539k42 = C14047bz.m66536x1().m66539k4();
            this.f37335kk = c10406dpM51562k4.m50697x1(bArrM66539k42);
            this.f37336to = 20L;
            C4772y9 c4772y9 = new C4772y9();
            try {
                this.f37333du = c10406dpM51562k4.m50697x1(c4772y9.m19588x1(bArrM66539k42));
            } finally {
                c4772y9.dispose();
            }
        } catch (Throwable th) {
            c10603qc.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C10613qw m51608k4(AbstractC3150x6 abstractC3150x6, int i) {
        C10613qw c10613qw = new C10613qw();
        c10613qw.f37334k4 = C3110yd.m13255x1(abstractC3150x6);
        c10613qw.f37337x1 = C3110yd.m13260x1(abstractC3150x6, 16);
        c10613qw.f37335kk = C3110yd.m13260x1(abstractC3150x6, 16);
        c10613qw.f37336to = C3110yd.m13255x1(abstractC3150x6);
        c10613qw.f37333du = C3110yd.m13260x1(abstractC3150x6, i);
        return c10613qw;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51610k4(C3149x1 c3149x1) {
        c3149x1.m13455x1((int) (this.f37334k4 & 4294967295L));
        c3149x1.m13450k4(this.f37337x1);
        c3149x1.m13450k4(this.f37335kk);
        c3149x1.m13455x1((int) (this.f37336to & 4294967295L));
        c3149x1.m13450k4(this.f37333du);
    }
}
