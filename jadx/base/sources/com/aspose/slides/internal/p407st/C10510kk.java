package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10510kk extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    protected long f37152k4;

    /* JADX INFO: renamed from: kk */
    protected int f37153kk = EditingLanguage.SPANISH_ECUADOR;

    /* JADX INFO: renamed from: x1 */
    protected int f37154x1;

    /* JADX INFO: renamed from: du */
    public final long m51111du() {
        return this.f37152k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m51112h4() {
        return (m51410v4() & 255) == 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51114kk(boolean z) {
        this.f37154x1 = z ? this.f37154x1 | 4 : this.f37154x1 & (-5);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m51116to() {
        return (this.f37154x1 & 4) == 4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51117x1(boolean z) {
        this.f37154x1 = z ? this.f37154x1 | 2 : this.f37154x1 & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37152k4 = c3134k4.m13384uz();
        this.f37154x1 = c3134k4.m13382u4() & 65535;
        this.f37153kk = c3134k4.m13382u4();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51115kk() {
        return (this.f37154x1 & 2) == 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51118x1() {
        return (this.f37154x1 & 1) == 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37152k4);
        c3149x1.m13446k4(this.f37154x1 & 65535);
        c3149x1.m13446k4(this.f37153kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51113k4(boolean z) {
        this.f37154x1 = z ? this.f37154x1 | 1 : this.f37154x1 & (-2);
    }
}
