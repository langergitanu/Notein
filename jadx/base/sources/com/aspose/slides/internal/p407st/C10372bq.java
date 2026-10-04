package com.aspose.slides.internal.p407st;

import com.aspose.slides.PptReadException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.bq */
/* JADX INFO: loaded from: classes4.dex */
public class C10372bq extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private long f36864du;

    /* JADX INFO: renamed from: dy */
    private long f36865dy;

    /* JADX INFO: renamed from: h4 */
    private long f36866h4;

    /* JADX INFO: renamed from: kk */
    private long f36868kk;

    /* JADX INFO: renamed from: m9 */
    private int f36869m9;

    /* JADX INFO: renamed from: to */
    private long f36870to;

    /* JADX INFO: renamed from: k4 */
    private int f36867k4 = 28;

    /* JADX INFO: renamed from: x1 */
    private long f36871x1 = 256;

    public C10372bq() {
        m51409um().m51917k4(4085);
    }

    /* JADX INFO: renamed from: du */
    public final int m50470du() {
        return this.f36869m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m50472h4() {
        return this.f36865dy;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f36867k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m50475kk() {
        return (int) this.f36870to;
    }

    /* JADX INFO: renamed from: to */
    public final long m50477to() {
        return this.f36864du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50479x1() {
        return this.f36868kk;
    }

    /* JADX INFO: renamed from: du */
    public final void m50471du(long j) {
        this.f36867k4 = (4294967295L & j) == 0 ? 28 : 32;
        this.f36865dy = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50473k4(int i) {
        this.f36870to = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50476kk(long j) {
        this.f36864du = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m50478to(long j) {
        this.f36866h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50480x1(int i) {
        this.f36869m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50474k4(long j) {
        this.f36871x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50481x1(long j) {
        this.f36868kk = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36867k4 = m51409um().m51914du();
        this.f36871x1 = c3134k4.m13384uz();
        c3134k4.m13381rv();
        c3134k4.m13387yj();
        c3134k4.m13387yj();
        this.f36868kk = c3134k4.m13384uz();
        this.f36870to = c3134k4.m13384uz();
        this.f36864du = c3134k4.m13384uz();
        this.f36866h4 = c3134k4.m13384uz();
        this.f36869m9 = c3134k4.m13381rv();
        if (this.f36867k4 < 28) {
            return;
        }
        c3134k4.m13382u4();
        m50471du(0L);
        int iM51914du = m51409um().m51914du();
        if (iM51914du != 28) {
            if (iM51914du == 30) {
                c3134k4.m13382u4();
            } else {
                if (iM51914du != 32) {
                    throw new PptReadException("Wrong size of UserEditAtom.");
                }
                m50471du(c3134k4.m13384uz());
            }
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36871x1 & 4294967295L);
        c3149x1.m13455x1(50338212);
        c3149x1.m13447k4(this.f36868kk & 4294967295L);
        c3149x1.m13447k4(this.f36870to & 4294967295L);
        c3149x1.m13447k4(this.f36864du & 4294967295L);
        c3149x1.m13447k4(this.f36866h4 & 4294967295L);
        c3149x1.m13448k4((short) this.f36869m9);
        c3149x1.m13448k4((short) 12741);
        if (this.f36867k4 > 28) {
            c3149x1.m13447k4(this.f36865dy & 4294967295L);
        }
    }
}
