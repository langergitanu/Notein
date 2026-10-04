package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C9819fa extends AbstractC9822k4 {

    /* JADX INFO: renamed from: to */
    private int f35582to = 0;

    /* JADX INFO: renamed from: du */
    private C9829yj f35580du = null;

    /* JADX INFO: renamed from: h4 */
    private long f35581h4 = 4294967294L;

    public C9819fa(int i) {
        m48391k4(0, i);
    }

    /* JADX INFO: renamed from: m9 */
    private void m48392m9() {
        long[] jArr;
        int i;
        this.f35587kk = -1;
        do {
            jArr = this.f35586k4;
            int length = jArr.length;
            i = this.f35587kk + 1;
            this.f35587kk = i;
            if (length <= i) {
                return;
            }
        } while ((jArr[i] & 4294967295L) >= 0);
    }

    /* JADX INFO: renamed from: du */
    public final long m48393du() {
        return this.f35581h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m48394h4() {
        byte[] bArr = new byte[436];
        C3085sv.m13084k4(bArr, (byte) -1);
        for (int i = 0; i < mo48400x1() && i < 109; i++) {
            int i2 = i * 4;
            long j = this.f35586k4[i];
            bArr[i2] = (byte) (j & 255);
            bArr[i2 + 1] = (byte) (((j & 4294967295L) >> 8) & 255);
            bArr[i2 + 2] = (byte) (((j & 4294967295L) >> 16) & 255);
            bArr[i2 + 3] = (byte) (((j & 4294967295L) >> 24) & 255);
        }
        return bArr;
    }

    @Override // com.aspose.slides.internal.p356qb.AbstractC9822k4
    /* JADX INFO: renamed from: k4 */
    public int mo48395k4(int i) {
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((((double) (this.f35586k4.length + BackupEvent.ERROR_GUID_NOT_EXIST)) * 4.0d) / ((double) i))), 14);
    }

    /* JADX INFO: renamed from: to */
    public final long[] m48399to() {
        List list = new List();
        int i = 0;
        while (true) {
            long[] jArr = this.f35586k4;
            if (i >= jArr.length) {
                return C3085sv.m13068h4(list);
            }
            int i2 = i + BackupEvent.ERROR_UID_NOT_EXIST;
            if (i2 <= 0 || i2 % 128 != 0) {
                list.addItem(Long.valueOf(jArr[i]));
            }
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p356qb.AbstractC9822k4
    /* JADX INFO: renamed from: x1 */
    public int mo48400x1() {
        m48392m9();
        return this.f35587kk;
    }

    public C9819fa(int i, int i2) {
        m48391k4(i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private long m48390k4(C9827up c9827up) {
        byte[] bArr = new byte[4];
        System.arraycopy(c9827up.m48445k4(), c9827up.m48445k4().length - 4, bArr, 0, 4);
        return C3110yd.m13250kk(bArr) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p356qb.AbstractC9822k4
    /* JADX INFO: renamed from: x1 */
    public List<C9827up> mo48401x1(int i) {
        int iMo48400x1 = mo48400x1();
        List<C9827up> list = new List<>();
        int i2 = 109;
        if (iMo48400x1 <= 109) {
            return new List<>();
        }
        while (i2 < iMo48400x1) {
            byte[] bArr = new byte[i];
            C3085sv.m13084k4(bArr, (byte) -1);
            int i3 = (i2 * 4) + i < iMo48400x1 * 4 ? i : (iMo48400x1 - i2) * 4;
            int i4 = 0;
            while (i4 < i3) {
                long j = this.f35586k4[i2];
                bArr[i4] = (byte) (j & 255);
                bArr[i4 + 1] = (byte) (((j & 4294967295L) >> 8) & 255);
                bArr[i4 + 2] = (byte) (((j & 4294967295L) >> 16) & 255);
                bArr[i4 + 3] = (byte) (((j & 4294967295L) >> 24) & 255);
                i4 += 4;
                i2++;
            }
            list.addItem(new C9827up(bArr));
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48391k4(int i, int i2) {
        this.f35588x1 = 109;
        if (i > 0) {
            this.f35586k4 = new long[((i2 / 4) * i) + 109];
        } else {
            this.f35586k4 = new long[109];
        }
        C3085sv.m13085k4(this.f35586k4, 4294967295L);
        this.f35582to = 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48402x1(long j) {
        int i = this.f35582to;
        long[] jArr = this.f35586k4;
        if ((i > jArr.length - 1 && jArr.length == 109) || (i > jArr.length - 2 && jArr.length != 109)) {
            int length = jArr.length;
            m48417kk();
            if (length == 109) {
                this.f35581h4 = this.f35580du.m48469du();
            } else {
                this.f35586k4[this.f35582to] = this.f35580du.m48469du();
                this.f35582to++;
            }
        }
        long[] jArr2 = this.f35586k4;
        int i2 = this.f35582to;
        jArr2[i2] = j;
        this.f35582to = i2 + 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48396k4(AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int i = 0;
        while (i < 109) {
            this.f35586k4[i] = c3134k4.m13384uz();
            i++;
        }
        if (i == 109) {
            this.f35587kk = 109;
        } else {
            m48392m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48397k4(InterfaceC9821jd interfaceC9821jd, long j) {
        C9827up c9827upMo48368k4;
        while ((4294967295L & j) < 4294967290L && this.f35588x1 < this.f35586k4.length && (c9827upMo48368k4 = interfaceC9821jd.mo48368k4((int) j)) != null) {
            m48414k4(c9827upMo48368k4, C14116yg.m67507x1(c9827upMo48368k4.m48445k4().length - 4, (this.f35586k4.length - this.f35588x1) * 4));
            j = m48390k4(c9827upMo48368k4);
        }
        this.f35588x1 = 109;
        m48392m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48398k4(C9829yj c9829yj) {
        this.f35580du = c9829yj;
    }
}
