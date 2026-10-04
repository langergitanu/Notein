package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.rv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4745rv extends AbstractC4736my {

    /* JADX INFO: renamed from: k4 */
    static byte[][] f13250k4 = {new byte[]{1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{31, 31, 31, 31, 15, 15, 15, 15}, new byte[]{-31, -31, -31, -31, -15, -15, -15, -15}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}};

    /* JADX INFO: renamed from: x1 */
    static byte[][] f13251x1 = {new byte[]{0, 30, 0, 30, 0, 14, 0, 14}, new byte[]{0, -32, 0, -32, 0, -16, 0, -16}, new byte[]{0, -2, 0, -2, 0, -2, 0, -2}, new byte[]{30, 0, 30, 0, 14, 0, 14, 0}, new byte[]{30, -32, 30, -32, 14, -16, 14, -16}, new byte[]{30, -2, 30, -2, 14, -2, 14, -2}, new byte[]{-32, 0, -32, 0, -16, 0, -16, 0}, new byte[]{-32, 30, -32, 30, -16, 14, -16, 14}, new byte[]{-32, -2, -32, -2, -16, -2, -16, -2}, new byte[]{-2, 0, -2, 0, -2, 0, -2, 0}, new byte[]{-2, 30, -2, 30, -2, 14, -2, 14}, new byte[]{-2, -32, -2, -32, -2, -16, -2, -16}};

    public AbstractC4745rv() {
        this.f13206du = 64;
        this.f13211kk = 64;
        this.f13204c5 = 8;
        this.f13207dy = new C4711e0[]{new C4711e0(64, 64, 0)};
        this.f13212m9 = new C4711e0[]{new C4711e0(64, 64, 0)};
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4745rv m19716k4(String str) {
        return (AbstractC4745rv) C4756up.m19759k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC4745rv m19718kk() {
        return m19716k4(C4768x6.class.getName());
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m19719x1(byte[] bArr) {
        if (bArr == null) {
            throw new CryptographicException(C12825ix.m59623k4("Null Key"));
        }
        if (bArr.length != 8) {
            throw new CryptographicException(C12825ix.m59623k4("Wrong Key Length"));
        }
        for (byte b : bArr) {
            int i = (b & 255) | 17;
            if (i != 17 && i != 31 && i != 241 && i != 255) {
                return false;
            }
        }
        for (int i2 = 0; i2 < f13251x1.length; i2++) {
            int i3 = 0;
            while (i3 < bArr.length && ((bArr[i3] & 255) ^ (f13251x1[i2][i3] & 255)) <= 1) {
                i3++;
            }
            if (i3 == 8) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: to */
    public byte[] mo19693to() {
        if (this.f13208h4 == null) {
            mo19658k4();
        }
        return (byte[]) this.f13208h4.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m19717k4(byte[] bArr) {
        if (bArr == null) {
            throw new CryptographicException(C12825ix.m59623k4("Null Key"));
        }
        if (bArr.length != 8) {
            throw new CryptographicException(C12825ix.m59623k4("Wrong Key Length"));
        }
        for (byte b : bArr) {
            int i = (b & 255) | 17;
            if (i != 17 && i != 31 && i != 241 && i != 255) {
                return false;
            }
        }
        for (int i2 = 0; i2 < f13250k4.length; i2++) {
            int i3 = 0;
            while (i3 < bArr.length && ((bArr[i3] & 255) ^ (f13250k4[i2][i3] & 255)) <= 1) {
                i3++;
            }
            if (i3 == 8) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: kk */
    public void mo19688kk(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("Key");
        }
        if (bArr.length != 8) {
            throw new ArgumentException(C12825ix.m59623k4("Wrong Key Length"));
        }
        if (m19717k4(bArr)) {
            throw new CryptographicException(C12825ix.m59623k4("Weak Key"));
        }
        if (m19719x1(bArr)) {
            throw new CryptographicException(C12825ix.m59623k4("Semi Weak Key"));
        }
        this.f13208h4 = (byte[]) bArr.clone();
    }
}
