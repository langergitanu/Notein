package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.w8 */
/* JADX INFO: loaded from: classes5.dex */
public class C13261w8 extends AbstractC13079l6 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private C13890ei f44439k4 = C13890ei.f46456k4;

    /* JADX INFO: renamed from: kk */
    private C12908be f44440kk = new C12908be();

    /* JADX INFO: renamed from: x1 */
    private C13164q9 f44441x1;

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final C12908be m61652h4() {
        return this.f44440kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13890ei m61653k4() {
        return this.f44439k4;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        C13261w8 c13261w8 = (C13261w8) af_();
        c13261w8.m61655k4(this.f44439k4.m65282du());
        return c13261w8;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13164q9 m61656x1() {
        return this.f44441x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61654k4(C13164q9 c13164q9) {
        this.f44441x1 = c13164q9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61655k4(C13890ei c13890ei) {
        if (c13890ei == null) {
            c13890ei = C13890ei.f46456k4;
        }
        this.f44439k4 = c13890ei;
    }
}
