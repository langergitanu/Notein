package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9822k4 {

    /* JADX INFO: renamed from: x1 */
    protected int f35588x1 = 0;

    /* JADX INFO: renamed from: kk */
    protected int f35587kk = 0;

    /* JADX INFO: renamed from: k4 */
    protected long[] f35586k4 = new long[0];

    /* JADX INFO: renamed from: k4 */
    public int mo48395k4(int i) {
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((((double) this.f35586k4.length) * 4.0d) / ((double) i))), 14);
    }

    /* JADX INFO: renamed from: kk */
    public final void m48417kk() {
        long[] jArr = this.f35586k4;
        if (jArr == null) {
            this.f35586k4 = new long[128];
            return;
        }
        long[] jArr2 = new long[jArr.length + 128];
        C3085sv.m13085k4(jArr2, 4294967295L);
        long[] jArr3 = this.f35586k4;
        System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
        this.f35586k4 = jArr2;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo48400x1() {
        return this.f35586k4.length;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48414k4(C9827up c9827up, int i) {
        byte[] bArrM48445k4 = c9827up.m48445k4();
        int i2 = 0;
        while (i2 < i) {
            long[] jArr = this.f35586k4;
            int i3 = this.f35588x1;
            jArr[i3] = (((((((long) (bArrM48445k4[i2] & 255)) + (((long) ((bArrM48445k4[i2 + 1] & 255) << 8)) & 4294967295L)) & 4294967295L) + (((long) ((bArrM48445k4[i2 + 2] & 255) << 16)) & 4294967295L)) & 4294967295L) + (((long) ((bArrM48445k4[i2 + 3] & 255) << 24)) & 4294967295L)) & 4294967295L;
            i2 += 4;
            this.f35588x1 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public List<C9827up> mo48401x1(int i) {
        List<C9827up> list = new List<>();
        int i2 = 0;
        while (i2 < mo48400x1()) {
            byte[] bArr = new byte[i];
            C3085sv.m13084k4(bArr, (byte) -1);
            int iMo48400x1 = (i2 * 4) + i < mo48400x1() * 4 ? i : (mo48400x1() - i2) * 4;
            int i3 = 0;
            while (i3 < iMo48400x1) {
                long j = this.f35586k4[i2];
                bArr[i3] = (byte) (j & 255);
                bArr[i3 + 1] = (byte) (((j & 4294967295L) >> 8) & 255);
                bArr[i3 + 2] = (byte) (((j & 4294967295L) >> 16) & 255);
                bArr[i3 + 3] = (byte) (((j & 4294967295L) >> 24) & 255);
                i3 += 4;
                i2++;
            }
            list.addItem(new C9827up(bArr));
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public long[] m48415k4() {
        return this.f35586k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long[] m48416k4(long j) {
        long j2;
        if (this.f35586k4.length == 0) {
            return new long[0];
        }
        List list = new List();
        do {
            list.addItem(Long.valueOf(j));
            int size = list.size();
            long[] jArr = this.f35586k4;
            if (size > jArr.length) {
                throw new InvalidDataException(C14113y2.m67402k4("Length of 'resultchain' is too long for SIDarray of length {0}", Integer.valueOf(this.f35586k4.length)));
            }
            j = jArr[(int) j];
            j2 = j & 4294967295L;
            if ((j2 >= jArr.length && j2 < 4294967290L) || j2 == 4294967294L) {
                break;
            }
        } while (j2 != 4294967295L);
        return C3085sv.m13068h4(list);
    }
}
