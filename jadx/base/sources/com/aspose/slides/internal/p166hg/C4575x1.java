package com.aspose.slides.internal.p166hg;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4575x1 {

    /* JADX INFO: renamed from: k4 */
    private byte f12789k4;

    /* JADX INFO: renamed from: x1 */
    private byte f12790x1;

    public C4575x1(byte b) {
        m18910du();
        this.f12790x1 = b;
    }

    /* JADX INFO: renamed from: du */
    private void m18910du() {
        byte b = this.f12790x1;
        this.f12789k4 = (b == 0 || b == 90 || b == 100) ? (byte) 1 : (byte) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public byte m18912k4() {
        return this.f12789k4;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m18913kk() {
        return this.f12789k4 == 1;
    }

    /* JADX INFO: renamed from: to */
    public boolean m18914to() {
        return m18913kk() && this.f12790x1 == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public byte m18915x1() {
        return this.f12790x1;
    }

    public C4575x1(byte b, byte b2) {
        this.f12789k4 = b;
        this.f12790x1 = b2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m18911k4(byte b) {
        return "The authentication or decryption has failed.";
    }
}
