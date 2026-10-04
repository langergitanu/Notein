package com.aspose.slides.internal.p302nm;

import com.aspose.slides.internal.p223ka.C5656k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6920du {

    /* JADX INFO: renamed from: k4 */
    private final C5656k4 f18857k4;

    /* JADX INFO: renamed from: x1 */
    private final C5656k4 f18858x1;

    public int hashCode() {
        return (this.f18857k4.hashCode() * 397) ^ this.f18858x1.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final C5656k4 m27121k4() {
        return this.f18857k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C5656k4 m27123x1() {
        return this.f18858x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27122k4(C5656k4 c5656k4) {
        return c5656k4.m23102kk() >= m27121k4().m23102kk() && c5656k4.m23102kk() <= m27123x1().m23102kk() && c5656k4.m23104to() >= m27121k4().m23104to() && c5656k4.m23104to() <= m27123x1().m23104to() && c5656k4.m23099du() >= m27121k4().m23099du() && c5656k4.m23099du() <= m27123x1().m23099du();
    }
}
