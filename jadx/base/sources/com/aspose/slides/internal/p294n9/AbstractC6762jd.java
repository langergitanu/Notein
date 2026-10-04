package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.jd */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6762jd {

    /* JADX INFO: renamed from: k4 */
    public int f18675k4;

    /* JADX INFO: renamed from: x1 */
    public int f18676x1;

    /* JADX INFO: renamed from: k4 */
    public abstract char mo26744k4();

    /* JADX INFO: renamed from: k4 */
    public final void m26765k4(int i, int i2) {
        this.f18675k4 = i;
        this.f18676x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo26745k4(byte[] bArr, int i);

    /* JADX INFO: renamed from: kk */
    public void mo26768kk() {
        while (mo26744k4() != 0) {
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m26769to() {
        this.f18675k4 = 0;
        mo26768kk();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo26746x1();

    /* JADX INFO: renamed from: x1 */
    public int mo26770x1(byte[] bArr, int i) {
        if (!mo26745k4(bArr, (i - this.f18675k4) - bArr.length)) {
            return 0;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            char cMo26744k4 = mo26744k4();
            if (cMo26744k4 == 0) {
                if (z) {
                    throw new ArgumentException("String contains invalid Unicode code points.");
                }
                return i2;
            }
            if (C14117yj.m67542up(cMo26744k4)) {
                if (C14117yj.m67514du(cMo26744k4)) {
                    if (z) {
                        throw new ArgumentException("String contains invalid Unicode code points.");
                    }
                    z = true;
                } else {
                    if (!z) {
                        throw new ArgumentException("String contains invalid Unicode code points.");
                    }
                    z = false;
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26766k4(byte[] bArr) {
        C6765kp c6765kp = new C6765kp(bArr.length * 3);
        int i = 0;
        while (i < bArr.length && i < 20) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
            }
            c6765kp.m26790k4(C11697x1.m55250kk(), "\\x{0:X2}", Byte.valueOf(bArr[i]));
            i++;
        }
        if (i == 20) {
            c6765kp.m26792k4(" ...");
        }
        throw new ArgumentException(C6770qm.m26823k4("Recursive fallback not allowed for bytes {0}.", c6765kp.toString()), "bytesUnknown");
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m26767k4(byte[] bArr, int i, char[] cArr, int[] iArr) {
        if (mo26745k4(bArr, (i - this.f18675k4) - bArr.length)) {
            int i2 = iArr[0];
            boolean z = false;
            while (true) {
                char cMo26744k4 = mo26744k4();
                if (cMo26744k4 != 0) {
                    if (C14117yj.m67542up(cMo26744k4)) {
                        if (C14117yj.m67514du(cMo26744k4)) {
                            if (z) {
                                throw new ArgumentException("String contains invalid Unicode code points.");
                            }
                            z = true;
                        } else {
                            if (!z) {
                                throw new ArgumentException("String contains invalid Unicode code points.");
                            }
                            z = false;
                        }
                    }
                    if (i2 >= this.f18676x1) {
                        return false;
                    }
                    cArr[i2] = cMo26744k4;
                    i2++;
                } else {
                    if (z) {
                        throw new ArgumentException("String contains invalid Unicode code points.");
                    }
                    iArr[0] = i2;
                }
            }
        }
        return true;
    }
}
