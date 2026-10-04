package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class twr {

    /* JADX INFO: renamed from: k4 */
    private final String[][] f49211k4;

    public twr(String[][] strArr) {
        if (strArr == null) {
            throw new ArgumentNullException("coordinates");
        }
        this.f49211k4 = strArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final char m71369k4(int i, int i2, int i3) {
        return m71370k4(i, i2).charAt(i3);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m71370k4(int i, int i2) {
        return C14422rx.m70365kk(this.f49211k4[i][i2]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71371k4(int i, String[] strArr) {
        this.f49211k4[i] = strArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m71372k4(int i) {
        return this.f49211k4[i];
    }
}
