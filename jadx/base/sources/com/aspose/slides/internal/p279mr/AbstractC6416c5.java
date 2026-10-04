package com.aspose.slides.internal.p279mr;

import OooO0O0.C20395OooO0o0;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.c5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6416c5 {

    /* JADX INFO: renamed from: c5 */
    public final int f18218c5;

    /* JADX INFO: renamed from: ck */
    public final int f18219ck;

    /* JADX INFO: renamed from: du */
    public final int f18220du;

    /* JADX INFO: renamed from: dy */
    public final int f18221dy;

    /* JADX INFO: renamed from: fa */
    public final C13609qq f18222fa;

    /* JADX INFO: renamed from: h4 */
    public final int f18223h4;

    /* JADX INFO: renamed from: jd */
    public final int f18224jd;

    /* JADX INFO: renamed from: k4 */
    public final C12014ne f18225k4;

    /* JADX INFO: renamed from: kk */
    public final int f18226kk;

    /* JADX INFO: renamed from: ks */
    private final int f18227ks;

    /* JADX INFO: renamed from: m9 */
    public final int f18228m9;

    /* JADX INFO: renamed from: to */
    public final C13609qq f18229to;

    /* JADX INFO: renamed from: up */
    public final int f18230up;

    /* JADX INFO: renamed from: x1 */
    public final int f18231x1;

    /* JADX INFO: renamed from: yj */
    public final int f18232yj;

    public AbstractC6416c5(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        C12014ne c12014ne2 = new C12014ne();
        this.f18225k4 = c12014ne2;
        this.f18232yj = i;
        this.f18218c5 = i2;
        this.f18224jd = i3;
        this.f18222fa = c13609qq;
        c12014ne.CloneTo(c12014ne2);
        this.f18220du = i4;
        this.f18229to = c13609qq2;
        int iM62788to = c13609qq2.m62788to();
        this.f18223h4 = iM62788to;
        int iM56681to = c12014ne2.m56681to() * iM62788to;
        this.f18228m9 = iM56681to;
        int iM56668h4 = (c12014ne2.m56668h4() * iM62788to) - 1;
        this.f18231x1 = iM56668h4;
        int i5 = iM56681to / 8;
        this.f18221dy = i5;
        int i6 = iM56668h4 / 8;
        this.f18226kk = i6;
        int i7 = (i6 - i5) + 1;
        if (i4 < i7) {
            throw new ArgumentOutOfRangeException("destinationLineSize", C14113y2.m67408k4("Expected at least ", C14057f9.m66591x1(i7), " bytes for the line size, otherwise the destination data does not fit."));
        }
        int iM62788to2 = c13609qq.m62788to();
        this.f18230up = iM62788to2;
        int iOooO0O0 = C20395OooO0o0.OooO0O0(iM62788to2, i, 7, 8);
        if (i3 < iOooO0O0) {
            throw new ArgumentOutOfRangeException("lineSize", C14113y2.m67408k4("Expected at least ", C14057f9.m66591x1(iOooO0O0), " bytes for the line size, otherwise the source data does not fit."));
        }
        this.f18219ck = ((i * iM62788to) - 1) / 8;
        this.f18227ks = ((c12014ne2.m56668h4() * iM62788to2) - 1) / 8;
    }

    /* JADX INFO: renamed from: k4 */
    public int m26312k4(int i, int i2, int i3) {
        int i4 = this.f18230up;
        int i5 = this.f18223h4;
        int i6 = (i / i4) * i5;
        int i7 = i6 / 8;
        int i8 = (((i2 * i5) + i6) - 1) / 8;
        int i9 = i8 - i7;
        int i10 = i9 + 1;
        if (i7 == 0 && i8 == this.f18219ck && i3 > 1) {
            return this.f18220du;
        }
        int i11 = i4 / i5;
        if (i11 > 1) {
            int i12 = (((i2 * i4) + i) - 1) / 8;
            if (i12 % i11 < i11 - 1 && i12 != this.f18227ks) {
                return i9;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6);

    /* JADX INFO: renamed from: k4 */
    public int m26313k4(C12014ne c12014ne, byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (bArr.length - i <= 0 || bArr.length - i > bArr.length) {
            throw new ArgumentOutOfRangeException("dataOffset", "Incorrect data offset.");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("outputData");
        }
        if (bArr2.length - i2 < 0 || bArr2.length - i2 > bArr2.length) {
            throw new ArgumentOutOfRangeException("outputDataOffset", "Incorrect output data offset.");
        }
        C12014ne c12014neClone = C12014ne.m56656k4(this.f18225k4.Clone(), c12014ne.Clone()).Clone();
        int iM56663c5 = c12014neClone.m56663c5();
        int iM56683x1 = c12014neClone.m56683x1();
        int iM56681to = c12014neClone.m56681to();
        int iM56681to2 = c12014ne.m56681to();
        if (iM56663c5 <= 0 || iM56683x1 <= 0) {
            return 0;
        }
        int i3 = iM56681to * this.f18230up;
        int iM56666dy = ((i3 / 8) - ((iM56681to2 * this.f18230up) / 8)) + ((c12014neClone.m56666dy() - c12014ne.m56666dy()) * this.f18224jd) + i;
        int iM26312k4 = m26312k4(i3, iM56663c5, iM56683x1);
        int i4 = iM26312k4 * iM56683x1;
        if (bArr2.length - i2 < i4) {
            throw new ArgumentOutOfRangeException("outputData", C14113y2.m67402k4("Not enough data to convert to, expected {0} bytes but got only {1} free bytes", C7019kk.m27466x1(i4), C7019kk.m27466x1(bArr2.length - i2)));
        }
        mo26307k4(bArr, iM56666dy, i3, iM56663c5, iM56683x1, bArr2, i2, iM26312k4);
        return i4;
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC6901du m26310k4(InterfaceC6901du interfaceC6901du, int i) {
        int iM67469du = (int) C14116yg.m67469du(2.0d, i);
        if (interfaceC6901du.mo27029k4() >= iM67469du) {
            return interfaceC6901du;
        }
        int[] iArrMo27032x1 = interfaceC6901du.mo27032x1();
        int[] iArr = new int[iM67469du];
        System.arraycopy(iArrMo27032x1, 0, iArr, 0, iArrMo27032x1.length);
        return new C13594c5(iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m26311k4(InterfaceC6904h4 interfaceC6904h4, C13609qq c13609qq, C13609qq c13609qq2, int i, int i2) {
        if (interfaceC6904h4 == null) {
            throw new ArgumentNullException("indexedConverter");
        }
        byte[] bArr = new byte[i];
        interfaceC6904h4.m27033k4(bArr, c13609qq, c13609qq2);
        for (int i3 = 0; i3 < i; i3++) {
            if ((bArr[i3] & 255) >= i2) {
                throw new ArgumentOutOfRangeException("indexedConverter", C14113y2.m67408k4("The converted value at map index ", C14057f9.m66591x1(i3), " is not valid since it goes out of destination entries range."));
            }
        }
        return bArr;
    }
}
