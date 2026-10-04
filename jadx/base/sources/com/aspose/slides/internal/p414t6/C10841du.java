package com.aspose.slides.internal.p414t6;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.t6.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10841du {

    /* JADX INFO: renamed from: k4 */
    private int f37856k4;

    /* JADX INFO: renamed from: x1 */
    private int f37857x1;

    public C10841du(int i, int i2) {
        this.f37856k4 = i;
        this.f37857x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10841du m52404k4(String str) {
        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67401k4(str, "..", "."), FilenameUtils.EXTENSION_SEPARATOR);
        if (strArrM67414k4.length != 2) {
            return null;
        }
        try {
            int iM66582k4 = C14057f9.m66582k4(C14113y2.m67440x1(strArrM67414k4[0]));
            int iM66582k42 = C14057f9.m66582k4(strArrM67414k4[1]);
            if (iM66582k4 <= iM66582k42) {
                return new C10841du(iM66582k4, iM66582k42);
            }
            return null;
        } catch (RuntimeException e) {
            if (C7019kk.m27469x1(e, FormatException.class)) {
                return null;
            }
            throw e;
        }
    }

    public String toString() {
        return C14113y2.m67408k4(C14057f9.m66591x1(this.f37856k4), "..", C14057f9.m66591x1(this.f37857x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52405k4(int i) {
        return i >= this.f37856k4 && i <= this.f37857x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m52406k4() {
        int i = 0;
        for (int i2 = this.f37856k4; i2 <= this.f37857x1; i2 += 100) {
            i++;
        }
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = (i3 * 100) + this.f37856k4;
        }
        return iArr;
    }
}
