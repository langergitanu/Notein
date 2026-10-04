package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.yw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4778yw extends AbstractC4736my {
    public AbstractC4778yw() {
        this.f13206du = 192;
        this.f13211kk = 64;
        this.f13204c5 = 8;
        this.f13207dy = new C4711e0[]{new C4711e0(128, 192, 64)};
        this.f13212m9 = new C4711e0[]{new C4711e0(64, 64, 0)};
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4778yw m19837k4(String str) {
        return (AbstractC4778yw) C4756up.m19759k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC4778yw m19839kk() {
        return m19837k4(C4780zm.class.getName());
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: to */
    public byte[] mo19693to() {
        if (this.f13208h4 == null) {
            do {
                mo19658k4();
            } while (m19838k4(this.f13208h4));
        }
        return (byte[]) this.f13208h4.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m19838k4(byte[] bArr) {
        if (bArr == null) {
            throw new CryptographicException(C12825ix.m59623k4("Null Key"));
        }
        if (bArr.length == 16) {
            for (int i = 0; i < 8; i++) {
                if (bArr[i] != bArr[i + 8]) {
                    return false;
                }
            }
            return true;
        }
        if (bArr.length != 24) {
            throw new CryptographicException(C12825ix.m59623k4("Wrong Key Length"));
        }
        for (int i2 = 0; i2 < 8; i2++) {
            if (bArr[i2] != bArr[i2 + 8]) {
                for (int i3 = 8; i3 < 16; i3++) {
                    if (bArr[i3] != bArr[i3 + 8]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: kk */
    public void mo19688kk(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("Key");
        }
        if (m19838k4(bArr)) {
            throw new CryptographicException(C12825ix.m59623k4("Weak Key"));
        }
        this.f13208h4 = (byte[]) bArr.clone();
    }
}
