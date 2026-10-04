package com.aspose.slides.internal.p151gj;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p223ka.C5656k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.du */
/* JADX INFO: loaded from: classes.dex */
public class C4316du extends C4328x1 {

    /* JADX INFO: renamed from: k4 */
    private C5656k4 f11766k4;

    /* JADX INFO: renamed from: kk */
    private int f11767kk;

    /* JADX INFO: renamed from: x1 */
    private C5656k4 f11768x1;

    public C4316du(int i, C5656k4 c5656k4, C5656k4 c5656k42) {
        super(1);
        m17313k4(i);
        m17314k4(c5656k4);
        m17318x1(c5656k42);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17313k4(int i) {
        this.f11767kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final C5656k4 m17315kk() {
        return this.f11768x1;
    }

    /* JADX INFO: renamed from: to */
    public final C5656k4 m17316to() {
        return this.f11766k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17317x1() {
        return this.f11767kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17314k4(C5656k4 c5656k4) {
        if (c5656k4 == null) {
            throw new ArgumentNullException("value");
        }
        this.f11768x1 = c5656k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17318x1(C5656k4 c5656k4) {
        if (c5656k4 == null) {
            throw new ArgumentNullException("value");
        }
        this.f11766k4 = c5656k4;
    }
}
