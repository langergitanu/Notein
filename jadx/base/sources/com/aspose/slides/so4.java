package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
class so4 {
    /* JADX INFO: renamed from: k4 */
    private static int m70695k4(String str, int i, int i2) {
        int i3 = i2 + i;
        return C14057f9.m66582k4(C14113y2.m67443x1(str, i3, C14113y2.m67434x1(str, FilenameUtils.EXTENSION_SEPARATOR, i3) - i3));
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m70698kk(String str, int[] iArr) {
        int iM70696k4 = m70696k4("slideMasters/slideMaster", 24, str);
        iArr[0] = iM70696k4;
        return iM70696k4 != -1;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m70699to(String str, int[] iArr) {
        int iM70696k4 = m70696k4("notesSlides/notesSlide", 22, str);
        iArr[0] = iM70696k4;
        return iM70696k4 != -1;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m70700x1(String str, int[] iArr) {
        int iM70696k4 = m70696k4("slideLayouts/slideLayout", 24, str);
        iArr[0] = iM70696k4;
        return iM70696k4 != -1;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m70696k4(String str, int i, String str2) {
        int iM67367h4 = C14113y2.m67367h4(str2, str, (short) 4);
        if (iM67367h4 == -1) {
            return -1;
        }
        return m70695k4(str2, i, iM67367h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70697k4(String str, int[] iArr) {
        int iM70696k4 = m70696k4("diagrams/data", 13, str);
        iArr[0] = iM70696k4;
        return iM70696k4 != -1;
    }
}
