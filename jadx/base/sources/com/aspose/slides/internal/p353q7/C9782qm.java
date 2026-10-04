package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.qm */
/* JADX INFO: loaded from: classes4.dex */
public class C9782qm {
    /* JADX INFO: renamed from: k4 */
    public static int m48131k4(C9790ts c9790ts) {
        int i;
        int iM48189ix = c9790ts.m48189ix();
        if (iM48189ix != 0) {
            return iM48189ix;
        }
        int i2 = 0;
        C9787sv c9787sv = new C9787sv(c9790ts, false);
        C9786ss[] c9786ssArr = {null};
        c9787sv.m48153k4().tryGetValue(Integer.valueOf(c9787sv.m48151k4(88)), c9786ssArr);
        IGenericEnumerator<C9771gi> it = c9786ssArr[0].m48138du().iterator();
        if (it.hasNext()) {
            int iM48083x1 = it.next().m48083x1();
            int i3 = iM48083x1;
            while (it.hasNext()) {
                int iM48083x12 = it.next().m48083x1();
                if (iM48083x12 > iM48083x1) {
                    iM48083x1 = iM48083x12;
                }
                if (iM48083x12 < i3) {
                    i3 = iM48083x12;
                }
            }
            i = i3;
            i2 = iM48083x1;
        } else {
            i = 0;
        }
        return (i2 - i) / 10;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m48132x1(C9790ts c9790ts) {
        int i;
        int iM48231u4 = c9790ts.m48231u4();
        if (iM48231u4 != 0) {
            return iM48231u4;
        }
        int i2 = 0;
        C9787sv c9787sv = new C9787sv(c9790ts, false);
        C9786ss[] c9786ssArr = {null};
        c9787sv.m48153k4().tryGetValue(Integer.valueOf(c9787sv.m48151k4(120)), c9786ssArr);
        IGenericEnumerator<C9771gi> it = c9786ssArr[0].m48138du().iterator();
        if (it.hasNext()) {
            int iM48083x1 = it.next().m48083x1();
            int i3 = iM48083x1;
            while (it.hasNext()) {
                int iM48083x12 = it.next().m48083x1();
                if (iM48083x12 > iM48083x1) {
                    iM48083x1 = iM48083x12;
                }
                if (iM48083x12 < i3) {
                    i3 = iM48083x12;
                }
            }
            i = i3;
            i2 = iM48083x1;
        } else {
            i = 0;
        }
        return (i2 - i) / 10;
    }
}
