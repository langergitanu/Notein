package com.aspose.slides.internal.p262m1;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p550zi.C13611to;

/* JADX INFO: renamed from: com.aspose.slides.internal.m1.k4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6302k4 extends C6304x1 {
    public C6302k4(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: du */
    public int[] mo25816du(byte[] bArr) {
        int[] iArr = new int[bArr.length / 4];
        for (int i = 0; i < bArr.length / 4; i++) {
            iArr[i] = C13611to.m62789k4(bArr, i * 4);
        }
        return iArr;
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: dy */
    public int[] mo25817dy(byte[] bArr) {
        int[] iArr = new int[bArr.length / 2];
        for (int i = 0; i < bArr.length / 2; i++) {
            iArr[i] = C13611to.m62796to(bArr, i * 2) & 65535;
        }
        return iArr;
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: h4 */
    public short[] mo25818h4(byte[] bArr) {
        short[] sArr = new short[bArr.length / 2];
        for (int i = 0; i < bArr.length / 2; i++) {
            sArr[i] = C13611to.m62796to(bArr, i * 2);
        }
        return sArr;
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: k4 */
    public void mo25819k4(double[] dArr, byte[] bArr) {
        for (int i = 0; i < dArr.length; i++) {
            C13611to.m62790k4(dArr[i], bArr, i * 8);
        }
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: kk */
    public double[] mo25824kk(byte[] bArr) {
        double[] dArr = new double[bArr.length / 8];
        for (int i = 0; i < bArr.length / 8; i++) {
            dArr[i] = C13611to.m62795kk(bArr, i * 8);
        }
        return dArr;
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: m9 */
    public long[] mo25825m9(byte[] bArr) {
        long[] jArr = new long[bArr.length / 4];
        for (int i = 0; i < bArr.length / 4; i++) {
            jArr[i] = ((long) C13611to.m62789k4(bArr, i * 4)) & 4294967295L;
        }
        return jArr;
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: to */
    public float[] mo25826to(byte[] bArr) {
        float[] fArr = new float[bArr.length / 4];
        for (int i = 0; i < bArr.length / 4; i++) {
            fArr[i] = C13611to.m62797x1(bArr, i * 4);
        }
        return fArr;
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: x1 */
    public void mo25827x1(int[] iArr, byte[] bArr) {
        for (int i = 0; i < iArr.length; i++) {
            C13611to.m62798x1(iArr[i], bArr, i * 2);
        }
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: k4 */
    public void mo25820k4(float[] fArr, byte[] bArr) {
        for (int i = 0; i < fArr.length; i++) {
            C13611to.m62791k4(fArr[i], bArr, i * 4);
        }
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: k4 */
    public void mo25821k4(int[] iArr, byte[] bArr) {
        for (int i = 0; i < iArr.length; i++) {
            C13611to.m62792k4(iArr[i], bArr, i * 4);
        }
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: k4 */
    public void mo25822k4(long[] jArr, byte[] bArr) {
        for (int i = 0; i < jArr.length; i++) {
            C13611to.m62793k4(jArr[i], bArr, i * 4);
        }
    }

    @Override // com.aspose.slides.internal.p262m1.C6304x1
    /* JADX INFO: renamed from: k4 */
    public void mo25823k4(short[] sArr, byte[] bArr) {
        for (int i = 0; i < sArr.length; i++) {
            C13611to.m62794k4(sArr[i], bArr, i * 2);
        }
    }
}
