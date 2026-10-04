package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class Placeholder implements IPlaceholder {

    /* JADX INFO: renamed from: du */
    private mrd f3037du = new mrd();

    /* JADX INFO: renamed from: k4 */
    private byte f3038k4;

    /* JADX INFO: renamed from: kk */
    private byte f3039kk;

    /* JADX INFO: renamed from: to */
    private long f3040to;

    /* JADX INFO: renamed from: x1 */
    private byte f3041x1;

    public Placeholder() {
    }

    @Override // com.aspose.slides.IPlaceholder
    public long getIndex() {
        return this.f3040to;
    }

    @Override // com.aspose.slides.IPlaceholder
    public byte getOrientation() {
        return this.f3038k4;
    }

    @Override // com.aspose.slides.IPlaceholder
    public byte getSize() {
        return this.f3041x1;
    }

    @Override // com.aspose.slides.IPlaceholder
    public byte getType() {
        return this.f3039kk;
    }

    /* JADX INFO: renamed from: k4 */
    public long m2269k4() {
        return this.f3040to;
    }

    /* JADX INFO: renamed from: kk */
    public mrd m2272kk() {
        return this.f3037du;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m2273x1() {
        return m2272kk().m64972k4();
    }

    public Placeholder(byte b, byte b2, byte b3, long j, boolean z) {
        this.f3039kk = b3;
        this.f3041x1 = b2;
        this.f3038k4 = b;
        this.f3040to = j;
        m2272kk().m64971k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2270k4(long j) {
        this.f3040to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m2271k4(Placeholder placeholder) {
        this.f3040to = placeholder.f3040to;
        this.f3041x1 = placeholder.f3041x1;
        this.f3039kk = placeholder.f3039kk;
        this.f3038k4 = placeholder.f3038k4;
        m2272kk().m64971k4(placeholder.m2273x1());
    }
}
