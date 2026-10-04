package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ei */
/* JADX INFO: loaded from: classes4.dex */
public class C10422ei extends AbstractC10571o4 {

    /* JADX INFO: renamed from: c5 */
    private byte f36966c5;

    /* JADX INFO: renamed from: du */
    private byte f36967du;

    /* JADX INFO: renamed from: dy */
    private boolean f36968dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f36969h4;

    /* JADX INFO: renamed from: k4 */
    private long f36970k4;

    /* JADX INFO: renamed from: kk */
    private byte f36971kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f36972m9;

    /* JADX INFO: renamed from: to */
    private byte f36973to;

    /* JADX INFO: renamed from: x1 */
    private long f36974x1;

    public C10422ei() {
        m51409um().m51917k4(4083);
    }

    /* JADX INFO: renamed from: du */
    public final int m50747du() {
        return this.f36967du & 255;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m50748dy() {
        return this.f36966c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m50749h4() {
        return this.f36969h4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    /* JADX INFO: renamed from: kk */
    public final long m50754kk() {
        return this.f36974x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m50755m9() {
        return this.f36972m9;
    }

    /* JADX INFO: renamed from: to */
    public final byte m50756to() {
        return this.f36971kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50757x1() {
        return this.f36970k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50750k4(byte b) {
        this.f36971kk = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50758x1(byte b) {
        this.f36966c5 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50751k4(int i) {
        this.f36967du = (byte) i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50759x1(long j) {
        this.f36974x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50752k4(long j) {
        this.f36970k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50760x1(boolean z) {
        this.f36972m9 = z;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36970k4 = ((long) c3134k4.m13386x6()) & 4294967295L;
        this.f36974x1 = ((long) c3134k4.m13386x6()) & 4294967295L;
        this.f36971kk = c3134k4.m13387yj();
        this.f36973to = c3134k4.m13387yj();
        this.f36967du = c3134k4.m13387yj();
        byte bM13387yj = c3134k4.m13387yj();
        this.f36969h4 = (bM13387yj & 1) > 0;
        this.f36972m9 = (bM13387yj & 2) > 0;
        this.f36968dy = (bM13387yj & 4) > 0;
        this.f36966c5 = c3134k4.m13387yj();
        c3134k4.m13387yj();
        c3134k4.m13387yj();
        c3134k4.m13387yj();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36970k4 & 4294967295L);
        c3149x1.m13447k4(this.f36974x1 & 4294967295L);
        c3149x1.m13443k4(this.f36971kk);
        c3149x1.m13443k4(this.f36973to);
        c3149x1.m13443k4(this.f36967du);
        byte b = this.f36969h4 ? (byte) 1 : (byte) 0;
        if (this.f36972m9) {
            b = (byte) ((b & 255) | 2);
        }
        if (this.f36968dy) {
            b = (byte) ((b & 255) | 4);
        }
        c3149x1.m13443k4(b);
        c3149x1.m13443k4(this.f36966c5);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50753k4(boolean z) {
        this.f36969h4 = z;
    }
}
