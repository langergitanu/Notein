package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12017to extends AbstractC7020m9<C12017to> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f40559k4 = true;

    /* JADX INFO: renamed from: kk */
    private int f40560kk;

    /* JADX INFO: renamed from: x1 */
    private int f40561x1;

    public C12017to() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f40559k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12017to) {
            return m56716x1((C12017to) obj);
        }
        return false;
    }

    public int hashCode() {
        return (this.f40561x1 * 31) + this.f40560kk;
    }

    /* JADX INFO: renamed from: k4 */
    public int m56717k4() {
        return this.f40561x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C12017to Clone() {
        C12017to c12017to = new C12017to();
        CloneTo(c12017to);
        return c12017to;
    }

    /* JADX INFO: renamed from: x1 */
    public int m56720x1() {
        return this.f40560kk;
    }

    public C12017to(int i, int i2) {
        this.f40561x1 = i;
        this.f40560kk = i2;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m56716x1(C12017to c12017to) {
        return c12017to.f40561x1 == this.f40561x1 && c12017to.f40560kk == this.f40560kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12017to c12017to) {
        c12017to.f40561x1 = this.f40561x1;
        c12017to.f40560kk = this.f40560kk;
    }
}
