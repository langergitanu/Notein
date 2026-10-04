package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ix */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6761ix {

    /* JADX INFO: renamed from: du */
    public boolean f18668du;

    /* JADX INFO: renamed from: k4 */
    public int f18670k4;

    /* JADX INFO: renamed from: kk */
    public C6780uz f18671kk;

    /* JADX INFO: renamed from: to */
    public boolean f18673to;

    /* JADX INFO: renamed from: x1 */
    public int f18674x1;

    /* JADX INFO: renamed from: h4 */
    public boolean f18669h4 = false;

    /* JADX INFO: renamed from: m9 */
    public int f18672m9 = 0;

    /* JADX INFO: renamed from: du */
    public final void m26754du() {
        this.f18670k4 = 0;
        this.f18669h4 = false;
        this.f18672m9 = 0;
        mo26763to();
    }

    /* JADX INFO: renamed from: h4 */
    public final char m26755h4() {
        char cMo26756k4 = mo26756k4();
        this.f18669h4 = cMo26756k4 != 0;
        if (cMo26756k4 == 0) {
            this.f18672m9 = 0;
        }
        return cMo26756k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract char mo26756k4();

    /* JADX INFO: renamed from: k4 */
    public final void m26757k4(int i) {
        throw new ArgumentException(C6770qm.m26823k4("Recursive fallback not allowed for character \\\\u{0:X4}.", Integer.valueOf(i)), "chars");
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo26759k4(char c, char c2, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo26760k4(char c, int i);

    /* JADX INFO: renamed from: kk */
    public abstract int mo26762kk();

    /* JADX INFO: renamed from: to */
    public void mo26763to() {
        while (mo26756k4() != 0) {
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo26764x1();

    /* JADX INFO: renamed from: k4 */
    public final void m26758k4(int i, int i2, C6780uz c6780uz, boolean z) {
        this.f18670k4 = i;
        this.f18674x1 = i2;
        this.f18671kk = c6780uz;
        this.f18673to = z;
        this.f18668du = false;
        this.f18669h4 = false;
        this.f18672m9 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m26761k4(char c, char[] cArr, int[] iArr) {
        boolean zMo26760k4;
        int i = (iArr[0] - this.f18670k4) - 1;
        if (C14117yj.m67514du(c)) {
            int i2 = iArr[0];
            if (i2 >= this.f18674x1) {
                C6780uz c6780uz = this.f18671kk;
                if (c6780uz != null && !c6780uz.m26835h4()) {
                    if (this.f18673to) {
                        this.f18668du = true;
                        this.f18671kk.f18747kk = c;
                    }
                    this.f18669h4 = false;
                    return false;
                }
            } else {
                char c2 = cArr[i2];
                if (C14117yj.m67512c5(c2)) {
                    if (this.f18669h4) {
                        int i3 = this.f18672m9;
                        this.f18672m9 = i3 + 1;
                        if (i3 > 250) {
                            m26757k4(C14117yj.m67525k4(c, c2));
                        }
                    }
                    iArr[0] = iArr[0] + 1;
                    zMo26760k4 = mo26759k4(c, c2, i);
                }
            }
            if (this.f18669h4) {
            }
            zMo26760k4 = mo26760k4(c, i);
        } else {
            if (this.f18669h4) {
                int i4 = this.f18672m9;
                this.f18672m9 = i4 + 1;
                if (i4 > 250) {
                    m26757k4(c);
                }
            }
            zMo26760k4 = mo26760k4(c, i);
        }
        this.f18669h4 = zMo26760k4;
        return zMo26760k4;
    }
}
