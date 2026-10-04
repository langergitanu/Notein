package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ls */
/* JADX INFO: loaded from: classes4.dex */
public class C10529ls extends AbstractC10590pi {

    /* JADX INFO: renamed from: du */
    protected int f37193du;

    /* JADX INFO: renamed from: k4 */
    protected long f37194k4;

    /* JADX INFO: renamed from: kk */
    protected long f37195kk;

    /* JADX INFO: renamed from: to */
    protected int f37196to;

    /* JADX INFO: renamed from: x1 */
    protected long f37197x1;

    public C10529ls() {
        m51409um().m51917k4(11003);
    }

    /* JADX INFO: renamed from: du */
    public final int m51219du() {
        return (int) this.f37194k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 20;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51220kk(int i) {
        this.f37194k4 = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    public final void m51221to(int i) {
        this.f37197x1 = ((long) i) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37194k4 = c3134k4.m13384uz();
        this.f37197x1 = c3134k4.m13384uz();
        this.f37195kk = c3134k4.m13384uz();
        this.f37196to = c3134k4.m13386x6();
        this.f37193du = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37194k4 & 4294967295L);
        c3149x1.m13447k4(this.f37197x1 & 4294967295L);
        c3149x1.m13447k4(this.f37195kk & 4294967295L);
        c3149x1.m13455x1(this.f37196to);
        c3149x1.m13455x1(this.f37193du);
    }
}
