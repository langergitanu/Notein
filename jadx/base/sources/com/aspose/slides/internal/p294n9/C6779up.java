package com.aspose.slides.internal.p294n9;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.up */
/* JADX INFO: loaded from: classes4.dex */
public final class C6779up extends AbstractC6762jd {

    /* JADX INFO: renamed from: kk */
    private String f18743kk;

    /* JADX INFO: renamed from: to */
    private int f18744to = -1;

    /* JADX INFO: renamed from: du */
    private int f18742du = -1;

    public C6779up(C6758fa c6758fa) {
        this.f18743kk = c6758fa.m26747du();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: k4 */
    public char mo26744k4() {
        int i = this.f18744to - 1;
        this.f18744to = i;
        int i2 = this.f18742du + 1;
        this.f18742du = i2;
        if (i < 0) {
            return (char) 0;
        }
        if (i != Integer.MAX_VALUE) {
            return this.f18743kk.charAt(i2);
        }
        this.f18744to = -1;
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: kk */
    public void mo26768kk() {
        this.f18744to = -1;
        this.f18742du = -1;
        this.f18675k4 = 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: x1 */
    public int mo26746x1() {
        int i = this.f18744to;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: k4 */
    public boolean mo26745k4(byte[] bArr, int i) {
        if (this.f18744to >= 1) {
            m26766k4(bArr);
        }
        if (this.f18743kk.length() == 0) {
            return false;
        }
        this.f18744to = this.f18743kk.length();
        this.f18742du = -1;
        return true;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: x1 */
    public int mo26770x1(byte[] bArr, int i) {
        return this.f18743kk.length();
    }
}
