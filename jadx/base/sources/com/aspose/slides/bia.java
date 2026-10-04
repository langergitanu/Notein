package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: loaded from: classes3.dex */
class bia {

    /* JADX INFO: renamed from: k4 */
    public static final ohe f4205k4 = new ohe(oju.f47834kk.Clone(), oju.f47835to.Clone());

    /* JADX INFO: renamed from: kk */
    private long f4206kk;

    /* JADX INFO: renamed from: x1 */
    private ohe f4207x1;

    public bia() {
        ohe oheVar = new ohe();
        this.f4207x1 = oheVar;
        f4205k4.CloneTo(oheVar);
        m4215to();
    }

    /* JADX INFO: renamed from: to */
    private void m4215to() {
        this.f4206kk++;
    }

    public boolean equals(Object obj) {
        bia biaVar = (bia) C7019kk.m27452k4(obj, bia.class);
        if (biaVar == null) {
            return false;
        }
        return m4223x1(biaVar);
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m4217k4(C12007ix c12007ix) {
        return new C12007ix((c12007ix.m56550c5() * this.f4207x1.f47808k4.f47836k4) + c12007ix.m56557jd(), (c12007ix.m56575x1() * this.f4207x1.f47808k4.f47837x1) + c12007ix.m56551ck(), c12007ix.m56550c5() * this.f4207x1.f47809x1.f47836k4, c12007ix.m56575x1() * this.f4207x1.f47809x1.f47837x1);
    }

    /* JADX INFO: renamed from: kk */
    public final long m4221kk() {
        return this.f4206kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4222x1() {
        m4220k4(f4205k4.Clone());
    }

    public bia(bia biaVar) {
        ohe oheVar = new ohe();
        this.f4207x1 = oheVar;
        biaVar.f4207x1.CloneTo(oheVar);
        m4215to();
    }

    /* JADX INFO: renamed from: k4 */
    public final ohe m4218k4() {
        return this.f4207x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m4223x1(bia biaVar) {
        if (biaVar == null) {
            return false;
        }
        return ohe.m68564k4(this.f4207x1, biaVar.f4207x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m4216x1(ohe oheVar) {
        return oju.m68621to(oheVar.f47808k4, oju.f47834kk) || oju.m68621to(oheVar.f47809x1, oju.f47835to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4219k4(bia biaVar) {
        biaVar.f4207x1.CloneTo(this.f4207x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4220k4(ohe oheVar) {
        oheVar.CloneTo(this.f4207x1);
        m4215to();
    }
}
