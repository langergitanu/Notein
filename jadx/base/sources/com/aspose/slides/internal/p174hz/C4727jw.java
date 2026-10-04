package com.aspose.slides.internal.p174hz;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.jw */
/* JADX INFO: loaded from: classes.dex */
public class C4727jw extends AbstractC4702bv {

    /* JADX INFO: renamed from: du */
    private int f13176du;

    /* JADX INFO: renamed from: h4 */
    private int f13177h4;

    /* JADX INFO: renamed from: k4 */
    private int f13178k4;

    /* JADX INFO: renamed from: kk */
    private C4764wy f13179kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13180to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13181x1;

    public C4727jw(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new ArgumentNullException("password");
        }
        m19653k4(bArr2);
        m19654x1(i);
        this.f13179kk = new C4764wy(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void m19653k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("Salt");
        }
        if (bArr.length < 8) {
            throw new ArgumentException("Salt < 8 bytes");
        }
        this.f13181x1 = (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: x1 */
    public void m19654x1(int i) {
        if (i < 1) {
            throw new ArgumentOutOfRangeException("value", "IterationCount < 1");
        }
        this.f13178k4 = i;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4702bv
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19573k4(int i) {
        int iMin;
        if (i < 1) {
            throw new ArgumentOutOfRangeException("cb");
        }
        int i2 = i / 20;
        if (i % 20 != 0) {
            i2++;
        }
        byte[] bArr = new byte[i];
        int i3 = this.f13176du;
        if (i3 > 0) {
            iMin = Math.min(20 - i3, i);
            C14058fa.m66596k4(this.f13180to, this.f13176du, bArr, 0, iMin);
            if (iMin < i) {
                if (OooO0OO.OooO00o(i2, 1, 20, iMin) > i) {
                    i2--;
                }
                this.f13176du = 0;
            }
            return bArr;
        }
        iMin = 0;
        byte[] bArr2 = this.f13181x1;
        byte[] bArr3 = new byte[bArr2.length + 4];
        C14058fa.m66596k4(bArr2, 0, bArr3, 0, bArr2.length);
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = this.f13178k4;
            int i6 = this.f13177h4 + 1;
            this.f13177h4 = i6;
            byte[] bArrM19652k4 = m19652k4(bArr3, i5, i6);
            this.f13180to = bArrM19652k4;
            int i7 = i4 == i2 ? i - iMin : 20;
            C14058fa.m66596k4(bArrM19652k4, this.f13176du, bArr, iMin, i7);
            iMin += this.f13176du + i7;
            if (i7 == 20) {
                i7 = 0;
            }
            this.f13176du = i7;
            i4++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m19652k4(byte[] bArr, int i, int i2) {
        bArr[bArr.length - 4] = (byte) (i2 >> 24);
        bArr[bArr.length - 3] = (byte) (i2 >> 16);
        bArr[bArr.length - 2] = (byte) (i2 >> 8);
        bArr[bArr.length - 1] = (byte) i2;
        byte[] bArrM19588x1 = this.f13179kk.m19588x1(bArr);
        byte[] bArrM19588x12 = bArrM19588x1;
        for (int i3 = 1; i3 < i; i3++) {
            bArrM19588x12 = this.f13179kk.m19588x1(bArrM19588x12);
            for (int i4 = 0; i4 < 20; i4++) {
                bArrM19588x1[i4] = (byte) ((bArrM19588x1[i4] & 255) ^ (bArrM19588x12[i4] & 255));
            }
        }
        return bArrM19588x1;
    }
}
