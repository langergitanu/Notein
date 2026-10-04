package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10389ck extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private byte f36902du;

    /* JADX INFO: renamed from: k4 */
    private long f36903k4;

    /* JADX INFO: renamed from: kk */
    private long f36904kk;

    /* JADX INFO: renamed from: to */
    private byte f36905to;

    /* JADX INFO: renamed from: x1 */
    private long f36906x1;

    public C10389ck() {
        m51409um().m51917k4(11011);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    /* JADX INFO: renamed from: kk */
    public final long m50556kk() {
        return this.f36904kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50558x1() {
        return this.f36906x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50554k4(byte b) {
        this.f36905to = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50557kk(long j) {
        this.f36904kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50559x1(byte b) {
        this.f36902du = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50555k4(long j) {
        this.f36903k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50560x1(long j) {
        this.f36906x1 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36903k4 = c3134k4.m13384uz();
        this.f36906x1 = c3134k4.m13384uz();
        this.f36904kk = c3134k4.m13384uz();
        this.f36905to = c3134k4.m13387yj();
        this.f36902du = c3134k4.m13387yj();
        c3134k4.m13371ck().seek(2L, 1);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36903k4 & 4294967295L);
        c3149x1.m13447k4(this.f36906x1 & 4294967295L);
        c3149x1.m13447k4(this.f36904kk & 4294967295L);
        c3149x1.m13443k4(this.f36905to);
        c3149x1.m13443k4(this.f36902du);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 0);
    }
}
