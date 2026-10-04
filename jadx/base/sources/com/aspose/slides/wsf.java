package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class wsf extends AbstractC7020m9<wsf> {

    /* JADX INFO: renamed from: k4 */
    public float f49849k4;

    /* JADX INFO: renamed from: x1 */
    public float f49850x1;

    public wsf() {
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
        if (obj instanceof wsf) {
            return m72911x1((wsf) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f49849k4), Float.valueOf(this.f49850x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final float m72912k4() {
        return this.f49849k4 + this.f49850x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public wsf Clone() {
        wsf wsfVar = new wsf();
        CloneTo(wsfVar);
        return wsfVar;
    }

    public wsf(float f, float f2) {
        this.f49849k4 = f;
        this.f49850x1 = f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static wsf m72909k4(wsf wsfVar, float f, float f2, float[] fArr) {
        float f3 = f + f2;
        if (f2 >= 0.0f) {
            fArr[0] = 0.0f;
            wsf wsfVar2 = new wsf();
            wsfVar2.f49849k4 = wsfVar.f49849k4;
            wsfVar2.f49850x1 = C14116yg.m67481k4(wsfVar.m72912k4(), f3) - wsfVar.f49849k4;
            return wsfVar2;
        }
        float f4 = -f2;
        fArr[0] = f4;
        float f5 = wsfVar.f49849k4 + f4;
        wsf wsfVar3 = new wsf();
        wsfVar3.f49849k4 = f5;
        wsfVar3.f49850x1 = C14116yg.m67481k4(wsfVar.m72912k4(), f3) - f5;
        return wsfVar3;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m72911x1(wsf wsfVar) {
        return wsfVar.f49849k4 == this.f49849k4 && wsfVar.f49850x1 == this.f49850x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static wsf m72910k4(wsf wsfVar, wsf wsfVar2) {
        wsf wsfVar3 = new wsf();
        wsfVar3.f49849k4 = C14116yg.m67481k4(wsfVar.f49849k4, wsfVar2.f49849k4);
        wsfVar3.f49850x1 = C14116yg.m67481k4(wsfVar.f49850x1, wsfVar2.f49850x1);
        return wsfVar3;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(wsf wsfVar) {
        wsfVar.f49849k4 = this.f49849k4;
        wsfVar.f49850x1 = this.f49850x1;
    }
}
