package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.wk */
/* JADX INFO: loaded from: classes4.dex */
public class C10693wk extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private long f37461du;

    /* JADX INFO: renamed from: dy */
    private int f37462dy;

    /* JADX INFO: renamed from: h4 */
    private long f37463h4;

    /* JADX INFO: renamed from: k4 */
    private long f37464k4;

    /* JADX INFO: renamed from: kk */
    private long f37465kk;

    /* JADX INFO: renamed from: m9 */
    private int f37466m9;

    /* JADX INFO: renamed from: to */
    private long f37467to;

    /* JADX INFO: renamed from: x1 */
    private long f37468x1;

    public C10693wk() {
        m51409um().m51917k4(61735);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m51893c5() {
        return (this.f37462dy & 16) == 16;
    }

    /* JADX INFO: renamed from: du */
    public final int m51894du() {
        return this.f37466m9;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m51895dy() {
        return (this.f37462dy & 8) == 8;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m51896h4() {
        return (this.f37462dy & 1) == 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 32;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51900kk() {
        return (int) this.f37465kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m51902m9() {
        return (this.f37462dy & 2) == 2;
    }

    /* JADX INFO: renamed from: to */
    public final long m51903to() {
        return this.f37467to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51905x1() {
        return this.f37468x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51897k4(int i) {
        this.f37465kk = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51901kk(boolean z) {
        this.f37462dy = z ? this.f37462dy | 8 : this.f37462dy & (-9);
    }

    /* JADX INFO: renamed from: to */
    public final void m51904to(boolean z) {
        this.f37462dy = z ? this.f37462dy | 16 : this.f37462dy & (-17);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51906x1(int i) {
        this.f37466m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51898k4(long j) {
        this.f37468x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51907x1(long j) {
        this.f37467to = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37464k4 = c3134k4.m13384uz();
        this.f37468x1 = c3134k4.m13384uz();
        this.f37465kk = c3134k4.m13384uz();
        this.f37467to = c3134k4.m13384uz();
        this.f37461du = c3134k4.m13384uz();
        this.f37463h4 = c3134k4.m13384uz();
        this.f37466m9 = c3134k4.m13386x6();
        this.f37462dy = c3134k4.m13386x6();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51908x1(boolean z) {
        this.f37462dy = z ? this.f37462dy | 2 : this.f37462dy & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37464k4 & 4294967295L);
        c3149x1.m13447k4(this.f37468x1 & 4294967295L);
        c3149x1.m13447k4(this.f37465kk & 4294967295L);
        c3149x1.m13447k4(this.f37467to & 4294967295L);
        c3149x1.m13447k4(this.f37461du & 4294967295L);
        c3149x1.m13447k4(this.f37463h4 & 4294967295L);
        c3149x1.m13455x1(this.f37466m9);
        c3149x1.m13455x1(this.f37462dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51899k4(boolean z) {
        this.f37462dy = z ? this.f37462dy | 1 : this.f37462dy & (-2);
    }
}
