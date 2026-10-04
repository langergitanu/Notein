package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class ohe extends AbstractC7020m9<ohe> {

    /* JADX INFO: renamed from: k4 */
    public oju f47808k4;

    /* JADX INFO: renamed from: x1 */
    public oju f47809x1;

    public ohe() {
        this.f47808k4 = new oju();
        this.f47809x1 = new oju();
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
        if (obj instanceof ohe) {
            return m68565x1((ohe) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f47808k4, this.f47809x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final oju m68567k4() {
        return oju.m68619k4(this.f47808k4, this.f47809x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public ohe Clone() {
        ohe oheVar = new ohe();
        CloneTo(oheVar);
        return oheVar;
    }

    public ohe(float f, float f2, float f3, float f4) {
        this.f47808k4 = new oju();
        this.f47809x1 = new oju();
        this.f47808k4 = new oju(f, f2);
        this.f47809x1 = new oju(f3, f4);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m68565x1(ohe oheVar) {
        return C14067j2.m66728k4(oheVar.f47808k4, this.f47808k4) && C14067j2.m66728k4(oheVar.f47809x1, this.f47809x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(ohe oheVar) {
        this.f47808k4.CloneTo(oheVar.f47808k4);
        this.f47809x1.CloneTo(oheVar.f47809x1);
    }

    public ohe(oju ojuVar, oju ojuVar2) {
        this.f47808k4 = new oju();
        this.f47809x1 = new oju();
        ojuVar.CloneTo(this.f47808k4);
        ojuVar2.CloneTo(this.f47809x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m68564k4(ohe oheVar, ohe oheVar2) {
        return oju.m68620kk(oheVar.f47808k4, oheVar2.f47808k4) && oju.m68620kk(oheVar.f47809x1, oheVar2.f47809x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m68566x1(ohe oheVar, ohe oheVar2) {
        return !m68564k4(oheVar, oheVar2);
    }
}
