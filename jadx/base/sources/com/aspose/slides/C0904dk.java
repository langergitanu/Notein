package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.dk */
/* JADX INFO: loaded from: classes3.dex */
class C0904dk extends AbstractC7020m9<C0904dk> {

    /* JADX INFO: renamed from: k4 */
    public static final C0904dk f4599k4;

    /* JADX INFO: renamed from: kk */
    public float f4600kk;

    /* JADX INFO: renamed from: to */
    public float f4601to;

    /* JADX INFO: renamed from: x1 */
    public float f4602x1;

    static {
        C0904dk c0904dk = new C0904dk();
        f4599k4 = c0904dk;
        c0904dk.f4602x1 = 0.0f;
        c0904dk.f4600kk = 0.0f;
        c0904dk.f4601to = 0.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5120x1(C0904dk c0904dk) {
        return c0904dk.f4602x1 == this.f4602x1 && c0904dk.f4600kk == this.f4600kk && c0904dk.f4601to == this.f4601to;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C0904dk) {
            return m5120x1((C0904dk) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f4602x1), Float.valueOf(this.f4600kk), Float.valueOf(this.f4601to));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C0904dk Clone() {
        C0904dk c0904dk = new C0904dk();
        CloneTo(c0904dk);
        return c0904dk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C0904dk c0904dk) {
        c0904dk.f4602x1 = this.f4602x1;
        c0904dk.f4600kk = this.f4600kk;
        c0904dk.f4601to = this.f4601to;
    }
}
