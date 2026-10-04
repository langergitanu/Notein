package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class za9 implements InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private InterfaceC14397rj f50505du;

    /* JADX INFO: renamed from: h4 */
    private long f50506h4;

    /* JADX INFO: renamed from: to */
    private long f50509to;

    /* JADX INFO: renamed from: k4 */
    private byte f50507k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private EffectFormat f50510x1 = new EffectFormat(this);

    /* JADX INFO: renamed from: kk */
    private ColorFormat f50508kk = new ColorFormat(this);

    public za9(InterfaceC14397rj interfaceC14397rj) {
        this.f50505du = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: du */
    private void m74364du() {
        this.f50506h4++;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f50505du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m74365k4() {
        return this.f50507k4;
    }

    /* JADX INFO: renamed from: kk */
    public final IColorFormat m74368kk() {
        return this.f50508kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m74369to() {
        return this.f50509to;
    }

    /* JADX INFO: renamed from: x1 */
    public final IEffectFormat m74370x1() {
        return this.f50510x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74366k4(byte b) {
        this.f50507k4 = b;
        m74364du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74367k4(long j) {
        this.f50509to = j;
        m74364du();
    }
}
