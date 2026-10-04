package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14117yj;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ts */
/* JADX INFO: loaded from: classes4.dex */
public final class C6776ts extends AbstractC6761ix {

    /* JADX INFO: renamed from: fa */
    private static AtomicReference<Object> f18733fa = new AtomicReference<>();

    /* JADX INFO: renamed from: c5 */
    private C6752c6 f18734c5;

    /* JADX INFO: renamed from: ck */
    private int f18735ck;

    /* JADX INFO: renamed from: dy */
    private char f18736dy = 0;

    /* JADX INFO: renamed from: jd */
    private int f18737jd = -1;

    public C6776ts(C6752c6 c6752c6) {
        this.f18734c5 = c6752c6;
        if (c6752c6.f18639x1 == null) {
            synchronized (m26832m9()) {
                try {
                    C6752c6 c6752c62 = this.f18734c5;
                    if (c6752c62.f18639x1 == null) {
                        c6752c62.f18639x1 = c6752c6.f18638k4.mo26675qq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private static Object m26832m9() {
        if (f18733fa.get() == null) {
            f18733fa.set(new Object());
        }
        return f18733fa.get();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public char mo26756k4() {
        int i = this.f18737jd - 1;
        this.f18737jd = i;
        if (i < 0) {
            return (char) 0;
        }
        if (i != Integer.MAX_VALUE) {
            return this.f18736dy;
        }
        this.f18737jd = -1;
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: kk */
    public int mo26762kk() {
        int i = this.f18737jd;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: to */
    public void mo26763to() {
        this.f18737jd = -1;
        this.f18670k4 = 0;
        this.f18669h4 = false;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: x1 */
    public boolean mo26764x1() {
        int i = this.f18737jd;
        if (i >= 0) {
            this.f18737jd = i + 1;
        }
        int i2 = this.f18737jd;
        return i2 >= 0 && i2 <= this.f18735ck;
    }

    /* JADX INFO: renamed from: k4 */
    private char m26831k4(char c) {
        int length = this.f18734c5.f18639x1.length;
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 <= 6) {
                while (i < length) {
                    char[] cArr = this.f18734c5.f18639x1;
                    if (cArr[i] == c) {
                        return cArr[i + 1];
                    }
                    i += 2;
                }
                return (char) 0;
            }
            int i3 = ((i2 / 2) + i) & 65534;
            char[] cArr2 = this.f18734c5.f18639x1;
            char c2 = cArr2[i3];
            if (c2 == c) {
                return cArr2[i3 + 1];
            }
            if (c2 < c) {
                i = i3;
            } else {
                length = i3;
            }
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26759k4(char c, char c2, int i) {
        if (!C14117yj.m67514du(c)) {
            throw new ArgumentOutOfRangeException("charUnknownHigh", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
        }
        if (!C14117yj.m67512c5(c2)) {
            throw new ArgumentOutOfRangeException("charUnknownLow", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
        }
        this.f18736dy = '?';
        this.f18735ck = 2;
        this.f18737jd = 2;
        return true;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26760k4(char c, int i) {
        this.f18735ck = 1;
        this.f18737jd = 1;
        char cM26831k4 = m26831k4(c);
        this.f18736dy = cM26831k4;
        if (cM26831k4 == 0) {
            this.f18736dy = '?';
        }
        return true;
    }
}
