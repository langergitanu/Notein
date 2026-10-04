package com.aspose.slides.internal.p262m1;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p105ee.C3670k4;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.internal.p383rp.C10034jd;
import com.aspose.slides.internal.p515xz.C12753du;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.m1.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6304x1 extends C13618wy {

    /* JADX INFO: renamed from: k4 */
    private boolean f17961k4;

    public C6304x1(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
        this.f17961k4 = true;
    }

    /* JADX INFO: renamed from: c5 */
    public void m25829c5(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, length);
        m62857k4(bArr2);
    }

    /* JADX INFO: renamed from: ck */
    public long[] m25831ck(long j) {
        byte[] bArrM25849kk = m25849kk(((j & 4294967295L) * 4) & 4294967295L);
        if (bArrM25849kk != null) {
            return mo25825m9(bArrM25849kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public void m25832du(int i) {
        m25843k4(new int[]{i});
    }

    /* JADX INFO: renamed from: dy */
    public byte[] m25834dy(long j) {
        byte[] bArrM25849kk = m25849kk(j);
        if (bArrM25849kk == null) {
            return null;
        }
        long j2 = j & 4294967295L;
        int i = (int) j2;
        byte[] bArr = new byte[i];
        long j3 = 2147483647L;
        if (j2 <= 2147483647L) {
            C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrM25849kk), 0, AbstractC14092to.m67208k4((Object) bArr), 0, i);
            return bArr;
        }
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrM25849kk), 0, AbstractC14092to.m67208k4((Object) bArr), 0, Integer.MAX_VALUE);
        long j4 = j2 - 2147483647L;
        for (long j5 = 0; (j5 & 4294967295L) < (j4 & 4294967295L); j5++) {
            int i2 = (int) j3;
            bArr[i2] = bArrM25849kk[i2];
            j3++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: fa */
    public int[] m25835fa(long j) {
        byte[] bArrM25849kk = m25849kk(((j & 4294967295L) * 2) & 4294967295L);
        if (bArrM25849kk != null) {
            return mo25817dy(bArrM25849kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public void m25836h4(int i) {
        m25856x1(new int[]{i});
    }

    /* JADX INFO: renamed from: jd */
    public short[] m25838jd(long j) {
        byte[] bArrM25849kk = m25849kk(((j & 4294967295L) * 2) & 4294967295L);
        if (bArrM25849kk != null) {
            return mo25818h4(bArrM25849kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25839k4(short s) {
        m25847k4(new short[]{s});
    }

    /* JADX INFO: renamed from: kk */
    public byte[] m25849kk(long j) {
        long j2 = 4294967295L & j;
        byte[] bArr = new byte[(int) j2];
        int iM62860x1 = m62860x1(bArr);
        if (iM62860x1 == j2) {
            return bArr;
        }
        if (this.f17961k4) {
            throw new C12753du(C22200OooO0o0.OooO0O0(j, "Cannot read ", " bytes from stream."), (int) j, iM62860x1);
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public long[] mo25825m9(byte[] bArr) {
        int length = bArr.length / 4;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = C14069jd.m66784x1(bArr, i * 4);
        }
        return jArr;
    }

    /* JADX INFO: renamed from: to */
    public double[] m25852to(long j) {
        byte[] bArrM25849kk = m25849kk(((j & 4294967295L) * 8) & 4294967295L);
        if (bArrM25849kk != null) {
            return mo25824kk(bArrM25849kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: up */
    public long m25854up() {
        long[] jArrM25850kk = m25850kk(1);
        if (jArrM25850kk == null || jArrM25850kk.length != 1) {
            return 0L;
        }
        return jArrM25850kk[0];
    }

    /* JADX INFO: renamed from: x1 */
    public void m25856x1(int[] iArr) {
        byte[] bArr = new byte[iArr.length * C3670k4.m14866h4()[3]];
        mo25827x1(iArr, bArr);
        m62857k4(bArr);
    }

    /* JADX INFO: renamed from: yj */
    public int m25858yj() {
        int[] iArrM25853to = m25853to(1);
        if (iArrM25853to == null || iArrM25853to.length != 1) {
            return 0;
        }
        return iArrM25853to[0];
    }

    /* JADX INFO: renamed from: c5 */
    public int[] m25830c5(long j) {
        byte[] bArrM25849kk = m25849kk(((j & 4294967295L) * 4) & 4294967295L);
        if (bArrM25849kk != null) {
            return mo25816du(bArrM25849kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public float[] m25833du(long j) {
        byte[] bArrM25849kk = m25849kk(((j & 4294967295L) * 4) & 4294967295L);
        if (bArrM25849kk != null) {
            return mo25826to(bArrM25849kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: dy */
    public int[] mo25817dy(byte[] bArr) {
        int[] iArr = new int[bArr.length / 2];
        for (int i = 0; i < bArr.length / 2; i++) {
            iArr[i] = C14069jd.m66769k4(bArr, i * 2);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h4 */
    public C10029c5[] m25837h4(long j) {
        long j2 = j & 4294967295L;
        int i = (int) (4294967295L & (8 * j2));
        byte[] bArr = new byte[i];
        if (m62860x1(bArr) != i) {
            return null;
        }
        long[] jArrMo25825m9 = mo25825m9(bArr);
        C10029c5[] c10029c5Arr = new C10029c5[(int) j2];
        for (int i2 = 0; i2 < j2; i2++) {
            int i3 = i2 * 2;
            c10029c5Arr[i2] = new C10029c5(jArrMo25825m9[i3], jArrMo25825m9[i3 + 1]);
        }
        return c10029c5Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25840k4(boolean z) {
        this.f17961k4 = z;
    }

    /* JADX INFO: renamed from: m9 */
    public C10034jd[] m25851m9(long j) {
        long j2 = j & 4294967295L;
        int i = (int) (4294967295L & (8 * j2));
        byte[] bArr = new byte[i];
        if (m62860x1(bArr) != i) {
            return null;
        }
        int[] iArrMo25816du = mo25816du(bArr);
        C10034jd[] c10034jdArr = new C10034jd[(int) j2];
        for (int i2 = 0; i2 < j2; i2++) {
            int i3 = i2 * 2;
            c10034jdArr[i2] = new C10034jd(iArrMo25816du[i3], iArrMo25816du[i3 + 1]);
        }
        return c10034jdArr;
    }

    /* JADX INFO: renamed from: to */
    public float[] mo25826to(byte[] bArr) {
        float[] fArr = new float[bArr.length / 4];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4(fArr), 0, bArr.length);
        return fArr;
    }

    /* JADX INFO: renamed from: up */
    public void m25855up(long j) {
        m25844k4(new long[]{j});
    }

    /* JADX INFO: renamed from: x1 */
    public void mo25827x1(int[] iArr, byte[] bArr) {
        for (int i = 0; i < iArr.length; i++) {
            byte[] bArrM66775k4 = C14069jd.m66775k4(iArr[i]);
            int i2 = i * 2;
            bArr[i2] = bArrM66775k4[0];
            bArr[i2 + 1] = bArrM66775k4[1];
        }
    }

    /* JADX INFO: renamed from: du */
    public int[] mo25816du(byte[] bArr) {
        int[] iArr = new int[bArr.length / 4];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) iArr), 0, bArr.length);
        return iArr;
    }

    /* JADX INFO: renamed from: h4 */
    public short[] mo25818h4(byte[] bArr) {
        short[] sArr = new short[bArr.length / 2];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) sArr), 0, bArr.length);
        return sArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25841k4(double[] dArr) {
        byte[] bArr = new byte[dArr.length * C3670k4.m14866h4()[12]];
        mo25819k4(dArr, bArr);
        m62857k4(bArr);
    }

    /* JADX INFO: renamed from: to */
    public int[] m25853to(int i) {
        if (i >= 0) {
            return m25835fa(((long) i) & 4294967295L);
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Expected a positive number.");
    }

    /* JADX INFO: renamed from: x1 */
    public int[] m25857x1(int i) {
        if (i >= 0) {
            return m25830c5(((long) i) & 4294967295L);
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Expected a positive number.");
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25819k4(double[] dArr, byte[] bArr) {
        C14058fa.m66593k4(AbstractC14092to.m67208k4(dArr), 0, AbstractC14092to.m67208k4((Object) bArr), 0, dArr.length * 8);
    }

    /* JADX INFO: renamed from: k4 */
    public void m25842k4(float[] fArr) {
        byte[] bArr = new byte[fArr.length * 4];
        mo25820k4(fArr, bArr);
        m62857k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25820k4(float[] fArr, byte[] bArr) {
        C14058fa.m66593k4(AbstractC14092to.m67208k4(fArr), 0, AbstractC14092to.m67208k4((Object) bArr), 0, fArr.length * 4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m25843k4(int[] iArr) {
        byte[] bArr = new byte[iArr.length * C3670k4.m14866h4()[9]];
        mo25821k4(iArr, bArr);
        m62857k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25821k4(int[] iArr, byte[] bArr) {
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) iArr), 0, AbstractC14092to.m67208k4((Object) bArr), 0, iArr.length * 4);
    }

    /* JADX INFO: renamed from: kk */
    public double[] mo25824kk(byte[] bArr) {
        double[] dArr = new double[bArr.length / 8];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4(dArr), 0, bArr.length);
        return dArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25844k4(long[] jArr) {
        byte[] bArr = new byte[jArr.length * C3670k4.m14866h4()[4]];
        mo25822k4(jArr, bArr);
        m62857k4(bArr);
    }

    /* JADX INFO: renamed from: kk */
    public long[] m25850kk(int i) {
        if (i >= 0) {
            return m25831ck(((long) i) & 4294967295L);
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Expected a positive number.");
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25822k4(long[] jArr, byte[] bArr) {
        for (int i = 0; i < jArr.length; i++) {
            byte[] bArrM66776k4 = C14069jd.m66776k4(jArr[i]);
            int i2 = i * 4;
            bArr[i2] = bArrM66776k4[0];
            bArr[i2 + 1] = bArrM66776k4[1];
            bArr[i2 + 2] = bArrM66776k4[2];
            bArr[i2 + 3] = bArrM66776k4[3];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m25845k4(C10029c5[] c10029c5Arr) {
        for (C10029c5 c10029c5 : c10029c5Arr) {
            byte[] bArr = new byte[4];
            mo25822k4(new long[]{c10029c5.m49272x1()}, bArr);
            byte[] bArr2 = new byte[4];
            mo25822k4(new long[]{c10029c5.m49269k4()}, bArr2);
            m62857k4(bArr);
            m62857k4(bArr2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m25846k4(C10034jd[] c10034jdArr) {
        for (C10034jd c10034jd : c10034jdArr) {
            byte[] bArr = new byte[4];
            mo25821k4(new int[]{c10034jd.m49312x1()}, bArr);
            byte[] bArr2 = new byte[4];
            mo25821k4(new int[]{c10034jd.m49310k4()}, bArr2);
            m62857k4(bArr);
            m62857k4(bArr2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m25847k4(short[] sArr) {
        byte[] bArr = new byte[sArr.length * C3670k4.m14866h4()[8]];
        mo25823k4(sArr, bArr);
        m62857k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25823k4(short[] sArr, byte[] bArr) {
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) sArr), 0, AbstractC14092to.m67208k4((Object) bArr), 0, sArr.length * 2);
    }

    /* JADX INFO: renamed from: k4 */
    public float[] m25848k4(int i) {
        if (i >= 0) {
            return m25833du(((long) i) & 4294967295L);
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Expected a positive number.");
    }
}
