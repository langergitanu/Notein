package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.dk */
/* JADX INFO: loaded from: classes4.dex */
public class C10403dk extends AbstractC10669uo {

    /* JADX INFO: renamed from: c5 */
    private byte f36932c5;

    /* JADX INFO: renamed from: du */
    private long f36933du;

    /* JADX INFO: renamed from: dy */
    private byte f36934dy;

    /* JADX INFO: renamed from: fa */
    private byte f36935fa;

    /* JADX INFO: renamed from: h4 */
    private long f36936h4;

    /* JADX INFO: renamed from: jd */
    private byte f36937jd;

    /* JADX INFO: renamed from: k4 */
    private byte f36938k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f36939kk;

    /* JADX INFO: renamed from: m9 */
    private long f36940m9;

    /* JADX INFO: renamed from: to */
    private int f36941to;

    /* JADX INFO: renamed from: up */
    private AbstractC10657tu f36942up;

    /* JADX INFO: renamed from: x1 */
    private byte f36943x1;

    public C10403dk() {
        super(61447, (byte) 2);
    }

    /* JADX INFO: renamed from: du */
    public final long m50677du() {
        return this.f36940m9;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int length = this.f36939kk.length + 20;
        AbstractC10657tu abstractC10657tu = this.f36942up;
        return abstractC10657tu != null ? abstractC10657tu.mo50440k4() + 8 + length : length;
    }

    /* JADX INFO: renamed from: kk */
    public final int m50682kk() {
        return C3085sv.m13071k4(this.f36941to);
    }

    /* JADX INFO: renamed from: to */
    public final long m50684to() {
        return this.f36933du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50685x1(byte b) {
        this.f36943x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50678k4(byte b) {
        this.f36938k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50683kk(long j) {
        this.f36940m9 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50686x1(long j) {
        this.f36936h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50679k4(int i) {
        this.f36941to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m50687x1() {
        return this.f36939kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50680k4(long j) {
        this.f36933du = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36938k4 = c3134k4.m13387yj();
        this.f36943x1 = c3134k4.m13387yj();
        this.f36939kk = c3134k4.m13372dy(16);
        this.f36941to = c3134k4.m13382u4();
        this.f36933du = c3134k4.m13384uz();
        this.f36936h4 = c3134k4.m13384uz();
        this.f36940m9 = c3134k4.m13384uz();
        this.f36934dy = c3134k4.m13387yj();
        this.f36932c5 = c3134k4.m13387yj();
        this.f36937jd = c3134k4.m13387yj();
        this.f36935fa = c3134k4.m13387yj();
        if ((this.f36932c5 & 255) > 0) {
            throw new Exception("Found a BLIP with a name and this is not yet supported.");
        }
        if (m51409um().m51914du() > 36) {
            this.f36942up = (AbstractC10657tu) C7019kk.m27452k4((Object) C10576og.m51429k4(c3134k4), AbstractC10657tu.class);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        AbstractC10657tu abstractC10657tu = this.f36942up;
        if (abstractC10657tu != null) {
            this.f36933du = ((long) (abstractC10657tu.mo50440k4() + 8)) & 4294967295L;
        }
        c3149x1.m13443k4(this.f36938k4);
        c3149x1.m13443k4(this.f36943x1);
        c3149x1.m13450k4(this.f36939kk);
        c3149x1.m13446k4(C3085sv.m13071k4(this.f36941to));
        c3149x1.m13447k4(this.f36933du & 4294967295L);
        c3149x1.m13447k4(this.f36936h4 & 4294967295L);
        c3149x1.m13447k4(this.f36940m9 & 4294967295L);
        c3149x1.m13443k4(this.f36934dy);
        c3149x1.m13443k4(this.f36932c5);
        c3149x1.m13443k4(this.f36937jd);
        c3149x1.m13443k4(this.f36935fa);
        AbstractC10657tu abstractC10657tu2 = this.f36942up;
        if (abstractC10657tu2 != null) {
            abstractC10657tu2.m51412x1(c3149x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50681k4(byte[] bArr) {
        this.f36939kk = bArr;
    }
}
