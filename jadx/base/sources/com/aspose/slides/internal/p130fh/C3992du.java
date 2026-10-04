package com.aspose.slides.internal.p130fh;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.fh.du */
/* JADX INFO: loaded from: classes.dex */
public class C3992du {

    /* JADX INFO: renamed from: ck */
    private int f10891ck;

    /* JADX INFO: renamed from: dy */
    private int f10893dy;

    /* JADX INFO: renamed from: k4 */
    private final int f10897k4;

    /* JADX INFO: renamed from: kk */
    private int f10898kk;

    /* JADX INFO: renamed from: m9 */
    private int f10899m9;

    /* JADX INFO: renamed from: x1 */
    private int f10902x1;

    /* JADX INFO: renamed from: to */
    private final int[] f10900to = new int[5003];

    /* JADX INFO: renamed from: du */
    private int f10892du = 0;

    /* JADX INFO: renamed from: h4 */
    private boolean f10895h4 = false;

    /* JADX INFO: renamed from: c5 */
    private int f10890c5 = 0;

    /* JADX INFO: renamed from: jd */
    private int f10896jd = 0;

    /* JADX INFO: renamed from: fa */
    private final int[] f10894fa = {0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* JADX INFO: renamed from: up */
    private final byte[] f10901up = new byte[256];

    public C3992du(int i) {
        if (i < 2) {
            throw new ArgumentOutOfRangeException("bitsCount");
        }
        this.f10897k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m15767k4(byte b, AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = this.f10901up;
        int i = this.f10891ck;
        int i2 = i + 1;
        this.f10891ck = i2;
        bArr[i] = b;
        if (i2 >= 254) {
            m15770k4(abstractC3150x6);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static int m15771x1(int i) {
        return (1 << i) - 1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m15768k4(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f10900to[i2] = -1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m15769k4(int i, AbstractC3150x6 abstractC3150x6) {
        int i2 = this.f10890c5;
        int[] iArr = this.f10894fa;
        int i3 = this.f10896jd;
        int i4 = i2 & iArr[i3];
        this.f10890c5 = i4;
        if (i3 > 0) {
            this.f10890c5 = i4 | (i << i3);
        } else {
            this.f10890c5 = i;
        }
        this.f10896jd = i3 + this.f10902x1;
        while (this.f10896jd >= 8) {
            m15767k4((byte) (this.f10890c5 & 255), abstractC3150x6);
            this.f10890c5 >>= 8;
            this.f10896jd -= 8;
        }
        if (this.f10892du > this.f10898kk || this.f10895h4) {
            if (this.f10895h4) {
                int i5 = this.f10899m9;
                this.f10902x1 = i5;
                this.f10898kk = m15771x1(i5);
                this.f10895h4 = false;
            } else {
                int i6 = this.f10902x1 + 1;
                this.f10902x1 = i6;
                this.f10898kk = i6 == 12 ? 4096 : m15771x1(i6);
            }
        }
        if (i == this.f10893dy) {
            while (this.f10896jd > 0) {
                m15767k4((byte) (this.f10890c5 & 255), abstractC3150x6);
                this.f10890c5 >>= 8;
                this.f10896jd -= 8;
            }
            m15770k4(abstractC3150x6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m15770k4(AbstractC3150x6 abstractC3150x6) {
        int i = this.f10891ck;
        if (i > 0) {
            abstractC3150x6.writeByte(C14080ne.m67009to(Integer.valueOf(i)));
            abstractC3150x6.write(this.f10901up, 0, this.f10891ck);
            this.f10891ck = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15772k4(AbstractC3150x6 abstractC3150x6, IGenericEnumerable<Byte> iGenericEnumerable) {
        IGenericEnumerator<Byte> it = iGenericEnumerable.iterator();
        try {
            it.reset();
            m15773k4(abstractC3150x6, it);
            it.dispose();
        } catch (Throwable th) {
            if (it != null) {
                it.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15773k4(AbstractC3150x6 abstractC3150x6, IGenericEnumerator<Byte> iGenericEnumerator) {
        boolean z;
        abstractC3150x6.writeByte(C14080ne.m67009to(Integer.valueOf(this.f10897k4)));
        int i = this.f10897k4;
        int i2 = i + 1;
        this.f10899m9 = i2;
        this.f10895h4 = false;
        this.f10902x1 = i2;
        this.f10898kk = m15771x1(i2);
        int i3 = 1 << i;
        this.f10893dy = i3 + 1;
        int i4 = i3 + 2;
        this.f10892du = i4;
        this.f10891ck = 0;
        this.f10890c5 = 0;
        this.f10896jd = 0;
        AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f10901up), 0, this.f10901up.length);
        int i5 = 0;
        for (int i6 = 5003; i6 < 65536; i6 *= 2) {
            i5++;
        }
        int i7 = 8 - i5;
        m15768k4(5003);
        m15769k4(i3, abstractC3150x6);
        if (iGenericEnumerator.hasNext()) {
            int iByteValue = iGenericEnumerator.next().byteValue() & 255;
            int[] iArr = new int[5003];
            while (iGenericEnumerator.hasNext()) {
                int iByteValue2 = iGenericEnumerator.next().byteValue() & 255;
                int i8 = (iByteValue2 << 12) + iByteValue;
                int i9 = (iByteValue2 << i7) ^ iByteValue;
                int i10 = this.f10900to[i9];
                if (i10 == i8) {
                    iByteValue = iArr[i9];
                } else {
                    if (i10 >= 0) {
                        int i11 = 5003 - i9;
                        if (i9 == 0) {
                            i11 = 1;
                        }
                        while (true) {
                            i9 -= i11;
                            if (i9 < 0) {
                                i9 += 5003;
                            }
                            int i12 = this.f10900to[i9];
                            if (i12 != i8) {
                                if (i12 < 0) {
                                    z = false;
                                    break;
                                }
                            } else {
                                iByteValue = iArr[i9];
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                        }
                    }
                    m15769k4(iByteValue, abstractC3150x6);
                    int i13 = this.f10892du;
                    if (i13 < 4096) {
                        this.f10892du = i13 + 1;
                        iArr[i9] = i13;
                        this.f10900to[i9] = i8;
                    } else {
                        m15768k4(5003);
                        this.f10892du = i4;
                        this.f10895h4 = true;
                        m15769k4(i3, abstractC3150x6);
                    }
                    iByteValue = iByteValue2;
                }
            }
            m15769k4(iByteValue, abstractC3150x6);
            m15769k4(this.f10893dy, abstractC3150x6);
            abstractC3150x6.writeByte((byte) 0);
        }
    }
}
