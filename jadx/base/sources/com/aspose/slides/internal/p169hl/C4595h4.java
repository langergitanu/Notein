package com.aspose.slides.internal.p169hl;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.hl.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4595h4 {

    /* JADX INFO: renamed from: c5 */
    private int f12840c5;

    /* JADX INFO: renamed from: du */
    private int f12841du;

    /* JADX INFO: renamed from: dy */
    private int f12842dy;

    /* JADX INFO: renamed from: h4 */
    private int f12843h4;

    /* JADX INFO: renamed from: k4 */
    private int f12844k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f12845kk;

    /* JADX INFO: renamed from: m9 */
    private int f12846m9;

    /* JADX INFO: renamed from: to */
    private byte[] f12847to;

    /* JADX INFO: renamed from: x1 */
    private int f12848x1;

    public C4595h4(int i, int i2, int i3, int i4) {
        m18992du(i2, i4);
        this.f12841du = i2;
        this.f12843h4 = i3;
        this.f12846m9 = i4;
        this.f12842dy = i;
    }

    /* JADX INFO: renamed from: du */
    private static void m18992du(int i, int i2) {
        if (i > 4 || i < 1) {
            throw new ArgumentException("Invalid color.");
        }
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 8) {
            throw new ArgumentException("Invalid bpp.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m18993k4(int i) {
        switch (i) {
            case 10:
                return (byte) 0;
            case 11:
                return (byte) 1;
            case 12:
                return (byte) 2;
            case 13:
                return (byte) 3;
            case 14:
                return (byte) 4;
            default:
                throw new ArgumentException("Unsupported predictor type");
        }
    }

    /* JADX INFO: renamed from: kk */
    private byte m18997kk(int i, int i2) {
        return C7019kk.m27442k4(Double.valueOf(C14116yg.m67490kk(i - (((i2 - this.f12848x1 >= 0 ? this.f12845kk[i2 - r0] & 255 : 0) + (this.f12847to[i2] & 255)) / 2)) % 256.0d), 14);
    }

    /* JADX INFO: renamed from: to */
    private byte m18998to(int i, int i2) {
        int i3 = this.f12848x1;
        return (byte) ((i - m19000x1(i2 - i3 >= 0 ? this.f12845kk[i2 - i3] & 255 : 0, this.f12847to[i2] & 255, i2 - i3 >= 0 ? this.f12847to[i2 - i3] & 255 : 0)) % 256);
    }

    /* JADX INFO: renamed from: x1 */
    private byte m18999x1(int i, int i2) {
        return (byte) ((i - (this.f12847to[i2] & 255)) % 256);
    }

    /* JADX INFO: renamed from: k4 */
    private byte m18994k4(int i, int i2) {
        int i3 = this.f12848x1;
        return (byte) ((i - (i2 - i3 >= 0 ? this.f12845kk[i2 - i3] & 255 : 0)) % 256);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m19000x1(int i, int i2, int i3) {
        int i4 = (i + i2) - i3;
        int iM67482k4 = C14116yg.m67482k4(i4 - i);
        int iM67482k42 = C14116yg.m67482k4(i4 - i2);
        int iM67482k43 = C14116yg.m67482k4(i4 - i3);
        return (iM67482k4 > iM67482k42 || iM67482k4 > iM67482k43) ? iM67482k42 <= iM67482k43 ? i2 : i3 : i;
    }

    /* JADX INFO: renamed from: k4 */
    private byte m18995k4(int i, int i2, int i3) {
        if (i == 1) {
            return m18997kk(i2, i3);
        }
        switch (i) {
            case 10:
                return (byte) i2;
            case 11:
                return m18994k4(i2, i3);
            case 12:
                return m18999x1(i2, i3);
            case 13:
                return m18997kk(i2, i3);
            case 14:
                return m18998to(i2, i3);
            default:
                throw new InvalidOperationException("Please report exception.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m18996k4() {
        int i;
        byte[] bArr = new byte[this.f12844k4];
        int i2 = 1;
        double d = Double.POSITIVE_INFINITY;
        for (int i3 = 10; i3 != 15; i3++) {
            int i4 = this.f12844k4;
            int i5 = 0;
            if (i4 >= 0) {
                System.arraycopy(this.f12845kk, 0, bArr, 0, i4);
            }
            for (int i6 = 0; i6 < this.f12844k4; i6++) {
                bArr[i6] = m18995k4(i3, bArr[i6] & 255, i6);
            }
            double d2 = 0.0d;
            while (true) {
                i = this.f12844k4;
                if (i5 >= i) {
                    break;
                }
                d2 += (double) (bArr[i5] & 255);
                i5++;
            }
            double d3 = d2 / ((double) i);
            if (d3 < d) {
                i2 = i3;
                d = d3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m19001k4(C3152yj c3152yj) {
        int i;
        int i2;
        C3152yj c3152yj2 = new C3152yj(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c3152yj.getLength() / ((double) (this.f12841du * this.f12843h4))) + c3152yj.getLength()), 14));
        c3152yj.setPosition(0L);
        c3152yj2.setPosition(0L);
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(((double) this.f12846m9) / 8.0d) * ((double) this.f12841du)), 14);
        this.f12848x1 = iM27462to;
        int i3 = iM27462to * this.f12843h4;
        this.f12844k4 = i3;
        this.f12845kk = new byte[i3];
        this.f12847to = new byte[i3];
        for (int i4 = 0; i4 < this.f12848x1; i4++) {
            this.f12847to[i4] = 0;
        }
        byte[] bArr = new byte[this.f12844k4];
        while (c3152yj.getPosition() < c3152yj.getLength()) {
            for (int i5 = 0; i5 < this.f12844k4 && (i2 = c3152yj.readByte()) != -1; i5++) {
                this.f12845kk[i5] = (byte) i2;
            }
            int iM18996k4 = this.f12842dy;
            if (iM18996k4 == 15) {
                iM18996k4 = m18996k4();
            }
            this.f12840c5 = iM18996k4;
            int i6 = 0;
            while (true) {
                i = this.f12844k4;
                if (i6 >= i) {
                    break;
                }
                bArr[i6] = m18995k4(this.f12840c5, this.f12845kk[i6] & 255, i6);
                i6++;
            }
            if (i >= 0) {
                System.arraycopy(this.f12845kk, 0, this.f12847to, 0, i);
            }
            c3152yj2.writeByte(m18993k4(this.f12840c5));
            c3152yj2.write(bArr, 0, this.f12844k4);
        }
        return c3152yj2;
    }
}
