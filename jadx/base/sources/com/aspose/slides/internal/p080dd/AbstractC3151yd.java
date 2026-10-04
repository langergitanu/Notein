package com.aspose.slides.internal.p080dd;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.yd */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3151yd implements IDisposable {

    /* JADX INFO: renamed from: du */
    public static AbstractC3151yd f9353du = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.dd.yd$k4 */
    public static final class k4 extends AbstractC3151yd {
        @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: dy */
        public String mo13427dy() {
            return C14113y2.f47374k4;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: m9 */
        public String mo13429m9() {
            return null;
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo13428k4(true);
    }

    /* JADX INFO: renamed from: du */
    public int mo13055du() {
        return -1;
    }

    /* JADX INFO: renamed from: dy */
    public String mo13427dy() {
        C6765kp c6765kp = new C6765kp();
        while (true) {
            int iMo13056h4 = mo13056h4();
            if (iMo13056h4 == -1) {
                return c6765kp.toString();
            }
            c6765kp.m26780k4((char) iMo13056h4);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public int mo13056h4() {
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo13058k4(char[] cArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iMo13056h4 = mo13056h4();
            if (iMo13056h4 == -1) {
                break;
            }
            cArr[i + i3] = (char) iMo13056h4;
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: m9 */
    public String mo13429m9() {
        int iMo13056h4;
        C6765kp c6765kp = new C6765kp();
        while (true) {
            iMo13056h4 = mo13056h4();
            if (iMo13056h4 == -1 || iMo13056h4 == 10) {
                break;
            }
            if (iMo13056h4 != 13) {
                c6765kp.m26780k4((char) iMo13056h4);
            } else if (mo13055du() == 10) {
                mo13056h4();
            }
        }
        if (iMo13056h4 == -1 && c6765kp.m26807x1() == 0) {
            return null;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: to */
    public void mo13059to() {
        mo13428k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13428k4(boolean z) {
        if (z) {
            C14094ts.m67303k4(this);
        }
    }
}
