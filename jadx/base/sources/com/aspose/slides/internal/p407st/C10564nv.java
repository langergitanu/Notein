package com.aspose.slides.internal.p407st;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.nv */
/* JADX INFO: loaded from: classes4.dex */
public class C10564nv extends C10609qn {
    public C10564nv() {
        super(927, false, 0L);
        m51381k4(false);
        m51383x1(false);
        m51382kk(false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m51381k4(boolean z) {
        long jM51597ar = m51597ar();
        m51598k4(z ? (jM51597ar & 4294967295L) | 1 : jM51597ar & 4294967294L);
    }

    /* JADX INFO: renamed from: kk */
    public void m51382kk(boolean z) {
        long jM51597ar = m51597ar();
        m51598k4(z ? (jM51597ar & 4294967295L) | 4 : jM51597ar & 4294967291L);
    }

    /* JADX INFO: renamed from: x1 */
    public void m51383x1(boolean z) {
        long jM51597ar = m51597ar();
        m51598k4(z ? (jM51597ar & 4294967295L) | 2 : jM51597ar & 4294967293L);
    }

    public C10564nv(long j) {
        super(927, false, j);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m51384x1() {
        return (m51597ar() & 1) == 1;
    }
}
