package com.aspose.slides.internal.p294n9;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.xk */
/* JADX INFO: loaded from: classes4.dex */
public final class C6787xk extends AbstractC6762jd {

    /* JADX INFO: renamed from: m9 */
    private static AtomicReference<Object> f18784m9 = new AtomicReference<>();

    /* JADX INFO: renamed from: du */
    private int f18785du;

    /* JADX INFO: renamed from: h4 */
    private C6754dq f18786h4;

    /* JADX INFO: renamed from: kk */
    private char f18787kk = 0;

    /* JADX INFO: renamed from: to */
    private int f18788to = -1;

    public C6787xk(C6754dq c6754dq) {
        this.f18786h4 = c6754dq;
        if (c6754dq.f18646x1 == null) {
            synchronized (m26853du()) {
                try {
                    C6754dq c6754dq2 = this.f18786h4;
                    if (c6754dq2.f18646x1 == null) {
                        c6754dq2.f18646x1 = c6754dq.f18644k4.m26651ar();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    private static Object m26853du() {
        if (f18784m9.get() == null) {
            f18784m9.set(new Object());
        }
        return f18784m9.get();
    }

    /* JADX INFO: renamed from: x1 */
    private char m26854x1(byte[] bArr) {
        char[] cArr = this.f18786h4.f18646x1;
        int length = cArr.length;
        if (length != 0 && bArr.length != 0 && bArr.length <= 2) {
            char c = bArr.length == 1 ? (char) (bArr[0] & 255) : (char) (((bArr[0] & 255) << 8) + (bArr[1] & 255));
            if (c >= cArr[0] && c <= cArr[length - 2]) {
                int i = 0;
                while (true) {
                    int i2 = length - i;
                    if (i2 > 6) {
                        int i3 = ((i2 / 2) + i) & 65534;
                        char[] cArr2 = this.f18786h4.f18646x1;
                        char c2 = cArr2[i3];
                        if (c2 == c) {
                            return cArr2[i3 + 1];
                        }
                        if (c2 < c) {
                            i = i3;
                        } else {
                            length = i3;
                        }
                    } else {
                        while (i < length) {
                            char[] cArr3 = this.f18786h4.f18646x1;
                            if (cArr3[i] == c) {
                                return cArr3[i + 1];
                            }
                            i += 2;
                        }
                    }
                }
            }
        }
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: k4 */
    public char mo26744k4() {
        int i = this.f18788to - 1;
        this.f18788to = i;
        if (i < 0) {
            return (char) 0;
        }
        if (i != Integer.MAX_VALUE) {
            return this.f18787kk;
        }
        this.f18788to = -1;
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: kk */
    public void mo26768kk() {
        this.f18788to = -1;
        this.f18675k4 = 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: k4 */
    public boolean mo26745k4(byte[] bArr, int i) {
        char cM26854x1 = m26854x1(bArr);
        this.f18787kk = cM26854x1;
        if (cM26854x1 == 0) {
            this.f18787kk = this.f18786h4.f18645kk;
        }
        this.f18785du = 1;
        this.f18788to = 1;
        return true;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: x1 */
    public int mo26746x1() {
        int i = this.f18788to;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: x1 */
    public int mo26770x1(byte[] bArr, int i) {
        return 1;
    }
}
