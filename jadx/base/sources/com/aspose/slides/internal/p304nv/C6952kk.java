package com.aspose.slides.internal.p304nv;

import com.aspose.slides.internal.p265m4.InterfaceC6316x1;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;

/* JADX INFO: renamed from: com.aspose.slides.internal.nv.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6952kk implements InterfaceC14089ss<C6952kk> {

    /* JADX INFO: renamed from: k4 */
    private final boolean f18936k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC6316x1 f18937kk;

    /* JADX INFO: renamed from: x1 */
    private final String f18938x1;

    @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
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
        return m27205k4((C6952kk) obj);
    }

    public int hashCode() {
        int iM66552k4 = C14051ck.m66552k4(this.f18936k4) * 397;
        String str = this.f18938x1;
        int iHashCode = (iM66552k4 ^ (str != null ? str.hashCode() : 0)) * 397;
        InterfaceC6316x1 interfaceC6316x1 = this.f18937kk;
        return iHashCode ^ (interfaceC6316x1 != null ? interfaceC6316x1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m27204k4() {
        return this.f18938x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m27206kk() {
        return this.f18936k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC6316x1 m27207x1() {
        return this.f18937kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27205k4(C6952kk c6952kk) {
        if (C14067j2.m66729x1(null, c6952kk)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c6952kk)) {
            return true;
        }
        return C14051ck.m66558x1(this.f18936k4, c6952kk.f18936k4) && C14113y2.m67363du(this.f18938x1, c6952kk.f18938x1) && C14067j2.m66728k4(this.f18937kk, c6952kk.f18937kk);
    }
}
