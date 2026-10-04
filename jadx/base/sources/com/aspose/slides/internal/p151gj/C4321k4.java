package com.aspose.slides.internal.p151gj;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4321k4 extends AbstractC7020m9<C4321k4> {

    /* JADX INFO: renamed from: k4 */
    public static final C4321k4 f11798k4 = new C4321k4();

    /* JADX INFO: renamed from: du */
    public byte f11799du;

    /* JADX INFO: renamed from: kk */
    public byte f11800kk;

    /* JADX INFO: renamed from: to */
    public byte f11801to;

    /* JADX INFO: renamed from: x1 */
    public byte f11802x1;

    /* JADX INFO: renamed from: k4 */
    public static C4321k4 m17379k4(int i) {
        C4321k4 c4321k4 = new C4321k4();
        c4321k4.f11802x1 = (byte) ((i >> 24) & 255);
        c4321k4.f11800kk = (byte) ((i >> 16) & 255);
        c4321k4.f11801to = (byte) ((i >> 8) & 255);
        c4321k4.f11799du = (byte) (i & 255);
        return c4321k4;
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
        if (obj instanceof C4321k4) {
            return m17380x1((C4321k4) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C4321k4 Clone() {
        C4321k4 c4321k4 = new C4321k4();
        CloneTo(c4321k4);
        return c4321k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17384x1() {
        return ((this.f11802x1 & 255) << 24) | ((this.f11800kk & 255) << 16) | ((this.f11801to & 255) << 8) | (this.f11799du & 255);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m17380x1(C4321k4 c4321k4) {
        return c4321k4.f11802x1 == this.f11802x1 && c4321k4.f11800kk == this.f11800kk && c4321k4.f11801to == this.f11801to && c4321k4.f11799du == this.f11799du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4325rv m17381k4() {
        C4325rv c4325rv = new C4325rv();
        c4325rv.f11813k4 = this.f11800kk;
        c4325rv.f11815x1 = this.f11801to;
        c4325rv.f11814kk = this.f11799du;
        return c4325rv;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4321k4 c4321k4) {
        c4321k4.f11802x1 = this.f11802x1;
        c4321k4.f11800kk = this.f11800kk;
        c4321k4.f11801to = this.f11801to;
        c4321k4.f11799du = this.f11799du;
    }
}
