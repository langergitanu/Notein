package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.vm */
/* JADX INFO: loaded from: classes3.dex */
public class C2939vm {

    /* JADX INFO: renamed from: k4 */
    private int f8790k4;

    public C2939vm() {
        m12581k4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public int m12582k4() {
        return this.f8790k4;
    }

    public C2939vm(int i) {
        m12581k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12581k4(int i) {
        if (i < 1 || i > 32767) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8790k4 = i;
    }
}
