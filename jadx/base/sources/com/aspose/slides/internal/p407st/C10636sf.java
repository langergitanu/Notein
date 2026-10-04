package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.sf */
/* JADX INFO: loaded from: classes4.dex */
public class C10636sf extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37367k4;

    public C10636sf() {
        m51409um().m51917k4(12010);
        m51409um().m51916k4((byte) 0);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51676kk() {
        return m51674x1(1);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51677x1() {
        return this.f37367k4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m51674x1(int i) {
        return ((1 << i) & m51677x1()) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51675k4(int i) {
        this.f37367k4 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        m51675k4(c3134k4.m13386x6());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(m51677x1());
    }
}
