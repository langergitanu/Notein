package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.tp */
/* JADX INFO: loaded from: classes4.dex */
public class C10653tp extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private byte f37407du;

    /* JADX INFO: renamed from: h4 */
    private byte f37408h4;

    /* JADX INFO: renamed from: k4 */
    private long f37409k4;

    /* JADX INFO: renamed from: kk */
    private byte f37410kk;

    /* JADX INFO: renamed from: m9 */
    private long f37411m9;

    /* JADX INFO: renamed from: to */
    private byte f37412to;

    /* JADX INFO: renamed from: x1 */
    private long f37413x1;

    public C10653tp() {
        m51409um().m51917k4(11017);
    }

    /* JADX INFO: renamed from: du */
    public final byte m51764du() {
        return this.f37412to;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51767kk() {
        return this.f37413x1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m51769to() {
        return this.f37410kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51771x1() {
        return this.f37409k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51765k4(byte b) {
        this.f37410kk = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51768kk(byte b) {
        this.f37407du = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m51770to(byte b) {
        this.f37408h4 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51772x1(byte b) {
        this.f37412to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51766k4(long j) {
        this.f37409k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51773x1(long j) {
        this.f37413x1 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37409k4 = c3134k4.m13384uz();
        this.f37413x1 = c3134k4.m13384uz();
        this.f37410kk = c3134k4.m13387yj();
        this.f37412to = c3134k4.m13387yj();
        this.f37407du = c3134k4.m13387yj();
        this.f37408h4 = c3134k4.m13387yj();
        this.f37411m9 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37409k4 & 4294967295L);
        c3149x1.m13447k4(this.f37413x1 & 4294967295L);
        c3149x1.m13443k4(this.f37410kk);
        c3149x1.m13443k4(this.f37412to);
        c3149x1.m13443k4(this.f37407du);
        c3149x1.m13443k4(this.f37408h4);
        c3149x1.m13447k4(this.f37411m9 & 4294967295L);
    }
}
