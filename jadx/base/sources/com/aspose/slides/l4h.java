package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class l4h extends AbstractC7020m9<l4h> {

    /* JADX INFO: renamed from: k4 */
    public float f45935k4;

    /* JADX INFO: renamed from: kk */
    public float f45936kk;

    /* JADX INFO: renamed from: x1 */
    public float f45937x1;

    /* JADX INFO: renamed from: kk */
    private boolean m64301kk(l4h l4hVar) {
        return l4hVar.f45935k4 == this.f45935k4 && l4hVar.f45937x1 == this.f45937x1 && l4hVar.f45936kk == this.f45936kk;
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
        if (obj instanceof l4h) {
            return m64301kk((l4h) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f45935k4), Float.valueOf(this.f45937x1), Float.valueOf(this.f45936kk));
    }

    /* JADX INFO: renamed from: k4 */
    public final float m64302k4() {
        return this.f45935k4 + this.f45937x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public l4h Clone() {
        l4h l4hVar = new l4h();
        CloneTo(l4hVar);
        return l4hVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final l4h m64303k4(l4h l4hVar) {
        l4h l4hVar2 = new l4h();
        l4hVar2.f45935k4 = C14116yg.m67481k4(this.f45935k4, l4hVar.f45935k4);
        l4hVar2.f45937x1 = C14116yg.m67481k4(this.f45937x1, l4hVar.f45937x1);
        l4hVar2.f45936kk = C14116yg.m67481k4(this.f45936kk, l4hVar.f45936kk);
        return l4hVar2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(l4h l4hVar) {
        l4hVar.f45935k4 = this.f45935k4;
        l4hVar.f45937x1 = this.f45937x1;
        l4hVar.f45936kk = this.f45936kk;
    }
}
