package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C9829yj extends AbstractC9822k4 {

    /* JADX INFO: renamed from: du */
    private long f35611du = 0;

    /* JADX INFO: renamed from: h4 */
    private C9819fa f35612h4 = null;

    /* JADX INFO: renamed from: to */
    private int f35613to;

    public C9829yj(int i) {
        this.f35613to = i;
    }

    /* JADX INFO: renamed from: m9 */
    private long m48468m9() {
        long[] jArr;
        long j;
        if ((((this.f35611du & 4294967295L) + 1) & 4294967295L) > this.f35586k4.length - 1) {
            m48417kk();
            while (true) {
                jArr = this.f35586k4;
                j = this.f35611du;
                if ((jArr[(int) j] & 4294967295L) == 4294967295L) {
                    break;
                }
                this.f35611du = j + 1;
            }
            jArr[(int) j] = 4294967293L;
            this.f35612h4.m48402x1(j);
        }
        while (true) {
            long[] jArr2 = this.f35586k4;
            long j2 = this.f35611du;
            if ((jArr2[(int) j2] & 4294967295L) == 4294967295L) {
                return j2;
            }
            this.f35611du = j2 + 1;
        }
    }

    /* JADX INFO: renamed from: du */
    public final long m48469du() {
        long jM48468m9 = m48468m9();
        this.f35586k4[(int) jM48468m9] = 4294967292L;
        return jM48468m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final long[] m48470h4() {
        int iMo48400x1 = mo48400x1();
        List list = new List();
        for (int i = 0; i < iMo48400x1; i++) {
            if (this.f35586k4[i] == 4294967292L) {
                list.addItem(Long.valueOf(((long) i) & 4294967295L));
            }
        }
        return C3085sv.m13068h4(list);
    }

    @Override // com.aspose.slides.internal.p356qb.AbstractC9822k4
    /* JADX INFO: renamed from: k4 */
    public int mo48395k4(int i) {
        long[] jArr = this.f35586k4;
        if (jArr != null) {
            return C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((((double) jArr.length) * 4.0d) / ((double) i))), 14);
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final long m48473kk(int i) {
        long jM48475x1 = m48475x1(4294967290L);
        long jM48475x12 = jM48475x1;
        for (int i2 = 1; i2 < i; i2++) {
            jM48475x12 = m48475x1(jM48475x12);
        }
        return jM48475x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m48474to() {
        return this.f35613to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m48475x1(long j) {
        long[] jArrM48416k4 = (4294967295L & j) < 4294967290L ? m48416k4(j) : new long[0];
        long jM48468m9 = m48468m9();
        if (jArrM48416k4.length != 0) {
            this.f35586k4[(int) jArrM48416k4[jArrM48416k4.length - 1]] = jM48468m9;
        }
        this.f35586k4[(int) jM48468m9] = 4294967294L;
        return jM48468m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48471k4(C9819fa c9819fa) {
        this.f35612h4 = c9819fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48472k4(C9819fa c9819fa, InterfaceC9821jd interfaceC9821jd) {
        long[] jArrM48415k4 = c9819fa.m48415k4();
        long jM48457kk = interfaceC9821jd.mo48369k4().m48457kk();
        long[] jArr = new long[(((int) jM48457kk) * this.f35613to) / 4];
        this.f35586k4 = jArr;
        C3085sv.m13085k4(jArr, 4294967295L);
        for (int i = 0; i < jM48457kk; i++) {
            long j = jArrM48415k4[i];
            if ((j & 4294967295L) < 4294967290L) {
                C9827up c9827upMo48368k4 = interfaceC9821jd.mo48368k4((int) j);
                if (c9827upMo48368k4 != null) {
                    m48414k4(c9827upMo48368k4, c9827upMo48368k4.m48445k4().length);
                }
            } else {
                this.f35588x1 = (this.f35613to / 4) + this.f35588x1;
            }
        }
    }
}
