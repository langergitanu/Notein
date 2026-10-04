package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class gyt extends xwz {

    /* JADX INFO: renamed from: to */
    private byte f5368to;

    public gyt(qah qahVar) {
        super(qahVar);
        this.f5368to = (byte) 0;
    }

    @Override // com.aspose.slides.xwz, com.aspose.slides.ri7
    /* JADX INFO: renamed from: c5 */
    public void mo6946c5() {
        super.mo6946c5();
        byte b = (byte) (((xwz) this).f50216kk.m56663c5() != 0 ? 1 : 0);
        this.f5368to = b;
        this.f5368to = (byte) ((b & 255) | (((byte) (((xwz) this).f50216kk.m56683x1() != 0 ? 2 : 0)) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m6947k4() {
        return this.f5368to;
    }
}
