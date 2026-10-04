package com.aspose.slides.internal.p075d5;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d5.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3019h4 {

    /* JADX INFO: renamed from: k4 */
    private byte f8849k4;

    /* JADX INFO: renamed from: kk */
    private byte f8850kk;

    /* JADX INFO: renamed from: x1 */
    private byte f8851x1;

    public C3019h4(byte b, byte b2, byte b3) {
        this.f8849k4 = b;
        this.f8851x1 = b2;
        this.f8850kk = b3;
    }

    /* JADX INFO: renamed from: du */
    public final byte m12701du() {
        return this.f8850kk;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m12703k4((C3019h4) obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12702k4(byte b) {
        this.f8849k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m12704kk() {
        return this.f8849k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m12706to() {
        return this.f8851x1;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du mo12707x1() {
        return C12003du.m56398k4(255, this.f8849k4 & 255, this.f8851x1 & 255, this.f8850kk & 255);
    }

    public C3019h4(C12003du c12003du) {
        this.f8849k4 = c12003du.m56507jd();
        this.f8851x1 = c12003du.m56502ck();
        this.f8850kk = c12003du.m56505fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m12703k4(C3019h4 c3019h4) {
        return this.f8849k4 == c3019h4.f8849k4 && this.f8851x1 == c3019h4.f8851x1 && this.f8850kk == c3019h4.f8850kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m12705kk(byte b) {
        this.f8850kk = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12708x1(byte b) {
        this.f8851x1 = b;
    }
}
