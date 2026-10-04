package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
class t7u {

    /* JADX INFO: renamed from: du */
    int f49036du;

    /* JADX INFO: renamed from: h4 */
    int f49037h4;

    /* JADX INFO: renamed from: k4 */
    ChartDataCell f49038k4;

    /* JADX INFO: renamed from: kk */
    int f49039kk;

    /* JADX INFO: renamed from: to */
    int f49040to;

    /* JADX INFO: renamed from: x1 */
    long f49041x1;

    /* JADX INFO: renamed from: k4 */
    public final boolean m70981k4(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("column");
        }
        if (i2 >= 0) {
            return i >= this.f49039kk && i <= this.f49036du && i2 >= this.f49040to && i2 <= this.f49037h4;
        }
        throw new ArgumentOutOfRangeException("row");
    }
}
