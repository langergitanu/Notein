package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.xw */
/* JADX INFO: loaded from: classes4.dex */
class C10722xw {

    /* JADX INFO: renamed from: du */
    public C10645t6[] f37524du;

    /* JADX INFO: renamed from: k4 */
    public long f37525k4;

    /* JADX INFO: renamed from: kk */
    public byte[] f37526kk;

    /* JADX INFO: renamed from: to */
    public long f37527to;

    /* JADX INFO: renamed from: x1 */
    public long f37528x1;

    /* JADX INFO: renamed from: k4 */
    public int m52020k4() {
        int i = 0;
        int iM51723k4 = 0;
        while (true) {
            C10645t6[] c10645t6Arr = this.f37524du;
            if (i >= c10645t6Arr.length) {
                return this.f37526kk.length + 12 + iM51723k4;
            }
            iM51723k4 += c10645t6Arr[i].m51723k4();
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C10722xw m52019k4(AbstractC3150x6 abstractC3150x6, C10603qc c10603qc) {
        C10722xw c10722xw = new C10722xw();
        byte[] bArrM50696k4 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(abstractC3150x6, 8));
        c10722xw.f37525k4 = C14069jd.m66784x1(bArrM50696k4, 0);
        c10722xw.f37528x1 = C14069jd.m66784x1(bArrM50696k4, 4);
        c10722xw.f37526kk = C3110yd.m13260x1(abstractC3150x6, (int) (((c10722xw.f37525k4 & 4294967295L) - 8) & 4294967295L));
        C3152yj c3152yj = new C3152yj(c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(abstractC3150x6, (int) (c10722xw.f37528x1 & 4294967295L))));
        try {
            long jM13255x1 = C3110yd.m13255x1(c3152yj);
            c10722xw.f37527to = jM13255x1;
            c10722xw.f37524du = new C10645t6[(int) (jM13255x1 & 4294967295L)];
            for (int i = 0; i != (c10722xw.f37527to & 4294967295L); i++) {
                C10645t6 c10645t6M51722k4 = C10645t6.m51722k4(c3152yj);
                long j = c10645t6M51722k4.f37394x1;
                c10722xw.f37524du[i] = c10645t6M51722k4;
            }
            return c10722xw;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m52021k4(C10603qc c10603qc) {
        byte[] bArr = new byte[m52020k4()];
        byte[] bArr2 = new byte[8];
        C3110yd.m13258x1(bArr2, 0, (int) (this.f37525k4 & 4294967295L));
        int iM51723k4 = 4;
        C3110yd.m13258x1(bArr2, 4, (int) (this.f37528x1 & 4294967295L));
        byte[] bArrM50697x1 = c10603qc.m51562k4(0L).m50697x1(bArr2);
        System.arraycopy(bArrM50697x1, 0, bArr, 0, bArrM50697x1.length);
        byte[] bArr3 = this.f37526kk;
        System.arraycopy(bArr3, 0, bArr, 8, bArr3.length);
        byte[] bArr4 = new byte[(int) (this.f37528x1 & 4294967295L)];
        C3110yd.m13258x1(bArr4, 0, (int) (4294967295L & this.f37527to));
        int i = 0;
        while (true) {
            C10645t6[] c10645t6Arr = this.f37524du;
            if (i >= c10645t6Arr.length) {
                byte[] bArrM50697x12 = c10603qc.m51562k4(0L).m50697x1(bArr4);
                System.arraycopy(bArrM50697x12, 0, bArr, this.f37526kk.length + 8, bArrM50697x12.length);
                return bArr;
            }
            c10645t6Arr[i].m51724k4(iM51723k4, bArr4);
            iM51723k4 += this.f37524du[i].m51723k4();
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m52022k4(C10603qc c10603qc, long j) {
        long j2 = this.f37524du[(int) j].f37394x1;
        byte[] bArr = new byte[(int) (j2 & 4294967295L)];
        System.arraycopy(this.f37526kk, ((int) (r0.f37390k4 & 4294967295L)) - 8, bArr, 0, (int) (j2 & 4294967295L));
        return c10603qc.m51562k4(j).m50696k4(bArr);
    }
}
