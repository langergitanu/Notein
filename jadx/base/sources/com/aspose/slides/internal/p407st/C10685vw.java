package com.aspose.slides.internal.p407st;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.vw */
/* JADX INFO: loaded from: classes4.dex */
public class C10685vw extends C10464he {
    public C10685vw() {
        super(831, false, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    private void m51883k4(int i, boolean z) {
        long jM51597ar = m51597ar();
        m51598k4((z ? (((long) i) & 4294967295L) | jM51597ar : (~(((long) i) & 4294967295L)) & jM51597ar) & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51885x1(boolean z) {
        m51883k4(1, z);
    }

    public C10685vw(long j) {
        super(831, false, j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51884k4(boolean z) {
        m51883k4(65536, z);
    }
}
