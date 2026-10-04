package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes3.dex */
class qwr {

    /* JADX INFO: renamed from: k4 */
    private int f48415k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f48416x1;

    public qwr(int i, boolean z) {
        this.f48415k4 = i;
        this.f48416x1 = z;
    }

    /* JADX INFO: renamed from: to */
    public static qwr m69783to() {
        return new qwr(4, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m69784k4() {
        return this.f48415k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m69787kk() {
        int iM69784k4 = m69784k4();
        if (iM69784k4 == 0) {
            return StyleIdentifier.LIST_TABLE_2_ACCENT_1;
        }
        if (iM69784k4 == 1) {
            return 220;
        }
        if (iM69784k4 == 2) {
            return 150;
        }
        if (iM69784k4 == 3) {
            return 96;
        }
        if (iM69784k4 == 4) {
            return 72;
        }
        if (iM69784k4 == 5) {
            return 0;
        }
        throw new ArgumentOutOfRangeException();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m69788x1() {
        return this.f48416x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69785k4(int i) {
        this.f48415k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69786k4(boolean z) {
        this.f48416x1 = z;
    }
}
