package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.k2 */
/* JADX INFO: loaded from: classes4.dex */
public class C10502k2 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private C10627s0 f37117k4 = new C10627s0();

    /* JADX INFO: renamed from: x1 */
    private C10627s0 f37121x1 = new C10627s0();

    /* JADX INFO: renamed from: kk */
    private int f37118kk = 1;

    /* JADX INFO: renamed from: to */
    private int f37120to = 1;

    /* JADX INFO: renamed from: du */
    private boolean f37115du = false;

    /* JADX INFO: renamed from: h4 */
    private boolean f37116h4 = false;

    /* JADX INFO: renamed from: m9 */
    private boolean f37119m9 = false;

    public C10502k2() {
        m51409um().m51917k4(EditingLanguage.POLISH);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m51049c5() {
        this.f37117k4 = new C10627s0(-156200006, 1000000000);
        this.f37121x1 = new C10627s0(-946600019, 1000000000);
        this.f37118kk = 1;
        this.f37120to = 1;
        this.f37115du = false;
        this.f37116h4 = false;
        this.f37119m9 = false;
    }

    /* JADX INFO: renamed from: du */
    public final int m51050du() {
        return this.f37120to;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m51051dy() {
        return this.f37119m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m51052h4() {
        return this.f37115du;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 20;
    }

    /* JADX INFO: renamed from: kk */
    public final C10627s0 m51055kk() {
        return this.f37121x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m51057m9() {
        return this.f37116h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m51058to() {
        return this.f37118kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10627s0 m51059x1() {
        return this.f37117k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51053k4(int i) {
        this.f37118kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51056kk(boolean z) {
        this.f37119m9 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51060x1(int i) {
        this.f37120to = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37117k4.m51662k4(c3134k4);
        this.f37121x1.m51662k4(c3134k4);
        this.f37118kk = c3134k4.m13387yj() & 255;
        this.f37120to = c3134k4.m13387yj() & 255;
        this.f37115du = (c3134k4.m13387yj() & 255) != 0;
        byte bM13387yj = c3134k4.m13387yj();
        this.f37116h4 = (bM13387yj & 1) != 0;
        this.f37119m9 = (bM13387yj & 2) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51061x1(boolean z) {
        this.f37116h4 = z;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        this.f37117k4.m51663k4(c3149x1);
        this.f37121x1.m51663k4(c3149x1);
        c3149x1.m13443k4((byte) this.f37118kk);
        c3149x1.m13443k4((byte) this.f37120to);
        c3149x1.m13443k4(this.f37115du ? (byte) 1 : (byte) 0);
        c3149x1.m13443k4((byte) ((this.f37116h4 ? 1 : 0) + (this.f37119m9 ? 2 : 0)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51054k4(boolean z) {
        this.f37115du = z;
    }
}
