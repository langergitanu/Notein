package com.aspose.slides.internal.p430tx;

import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11227w6 {

    /* JADX INFO: renamed from: k4 */
    private int f38732k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private static final int[][] f38731x1 = {new int[]{16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}, new int[]{40961, 42241, 16, 16, 41985, 16, 16, 41985, 40961, 106497, 16, 16}, new int[]{16, StyleIdentifier.INTENSE_EMPHASIS, 16, 16, 5, 16, 16, 5, 16, 16, 16, 16}, new int[]{16, StyleIdentifier.COLORFUL_LIST_ACCENT_6, 16, 16, 2, 16, 16, 16, 16, 16, 16, 16}, new int[]{JosStatusCodes.RNT_CODE_SERVER_ERROR, 9480, StyleIdentifier.COLORFUL_GRID_ACCENT_6, 3, 9224, StyleIdentifier.SUBTLE_REFERENCE, 6, 9224, 8, 73736, 10, 11}, new int[]{JosStatusCodes.RNT_CODE_SERVER_ERROR, 9480, StyleIdentifier.COLORFUL_GRID_ACCENT_6, 3, 9224, StyleIdentifier.SUBTLE_REFERENCE, 6, 9224, 8, 73736, 10, 11}, new int[]{JosStatusCodes.RNT_CODE_SERVER_ERROR, 9480, StyleIdentifier.COLORFUL_GRID_ACCENT_6, 3, 9224, StyleIdentifier.SUBTLE_REFERENCE, 6, 9224, 8, 73736, 10, 11}, new int[]{8203, 9483, 16, 16, 9227, 16, 16, 9227, 8203, 73739, 16, 16}, new int[]{EditingLanguage.SPANISH_VENEZUELA, 9482, 16, 16, EditingLanguage.SPANISH_COLOMBIA, 16, 16, EditingLanguage.SPANISH_COLOMBIA, EditingLanguage.SPANISH_VENEZUELA, 73738, 16, 16}, new int[]{16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}};

    /* JADX INFO: renamed from: kk */
    private static final int[][] f38730kk = {new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48}, new int[]{48, 94217, 48, 48, 94729, 48, 48, 94729, 92681, 92681, 48, 48}, new int[]{48, 48, 48, 48, 48, 7, 519, 48, 48, 48, 48, 48}, new int[]{48, 48, 4, 516, 48, 48, 48, 48, 48, 48, 48, 48}, new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48}, new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48}, new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48}, new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, EditingLanguage.ENGLISH_INDIA}, new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, EditingLanguage.ENGLISH_INDIA, 48}, new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48}};

    /* JADX INFO: renamed from: du */
    public final int m54069du(int i) {
        int i2 = f38730kk[i][this.f38732k4];
        if (i2 != 16 && i2 != 32) {
            this.f38732k4 = i2 & 15;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54070k4() {
        return this.f38732k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m54072kk(int i) {
        int i2 = f38731x1[i][this.f38732k4];
        if (i2 != 16 && i2 != 32) {
            this.f38732k4 = i2 & 15;
        }
        return i2;
    }

    /* JADX INFO: renamed from: to */
    public final int m54073to(int i) {
        return f38730kk[i][this.f38732k4];
    }

    /* JADX INFO: renamed from: x1 */
    public final int m54074x1(int i) {
        return f38731x1[i][this.f38732k4];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54071k4(int i) {
        this.f38732k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54075x1() {
        this.f38732k4 = 0;
    }
}
