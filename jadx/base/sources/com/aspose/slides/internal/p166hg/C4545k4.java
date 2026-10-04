package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4545k4 extends Exception {

    /* JADX INFO: renamed from: k4 */
    private C4575x1 f12680k4;

    public C4545k4(byte b) {
        this(b, C4575x1.m18911k4(b));
    }

    /* JADX INFO: renamed from: k4 */
    public C4575x1 m18761k4() {
        return this.f12680k4;
    }

    public C4545k4(byte b, byte b2) {
        this(b, b2, C4575x1.m18911k4(b2));
    }

    public C4545k4(byte b, byte b2, String str) {
        super(str);
        this.f12680k4 = new C4575x1(b, b2);
    }

    public C4545k4(byte b, String str) {
        super(str);
        this.f12680k4 = new C4575x1(b);
    }

    public C4545k4(String str) {
        super(str);
    }
}
