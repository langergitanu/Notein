package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1339du;
import com.aspose.slides.internal.p019ac.C1342h4;
import com.aspose.slides.internal.p019ac.C1350qq;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.rs */
/* JADX INFO: loaded from: classes.dex */
public class C5037rs {

    /* JADX INFO: renamed from: k4 */
    private C1350qq[] f13832k4;

    /* JADX INFO: renamed from: kk */
    private C1342h4[] f13833kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13834to;

    /* JADX INFO: renamed from: x1 */
    private C1339du[] f13835x1;

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
        return m21421k4((C5037rs) obj);
    }

    public int hashCode() {
        C1350qq[] c1350qqArr = this.f13832k4;
        int iHashCode = (c1350qqArr != null ? AbstractC14092to.m67208k4((Object) c1350qqArr).hashCode() : 0) * 397;
        C1339du[] c1339duArr = this.f13835x1;
        int iHashCode2 = (iHashCode ^ (c1339duArr != null ? AbstractC14092to.m67208k4((Object) c1339duArr).hashCode() : 0)) * 397;
        C1342h4[] c1342h4Arr = this.f13833kk;
        int iHashCode3 = (iHashCode2 ^ (c1342h4Arr != null ? AbstractC14092to.m67208k4((Object) c1342h4Arr).hashCode() : 0)) * 397;
        byte[] bArr = this.f13834to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21417k4(byte[] bArr) {
        this.f13834to = bArr;
    }

    /* JADX INFO: renamed from: kk */
    public final C1342h4[] m21423kk() {
        return this.f13833kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1339du[] m21424x1() {
        return this.f13835x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21418k4(C1339du[] c1339duArr) {
        this.f13835x1 = c1339duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21419k4(C1342h4[] c1342h4Arr) {
        this.f13833kk = c1342h4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21420k4(C1350qq[] c1350qqArr) {
        this.f13832k4 = c1350qqArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21421k4(C5037rs c5037rs) {
        return C3022m9.m12723k4(this.f13832k4, c5037rs.f13832k4) && C3022m9.m12723k4(this.f13835x1, c5037rs.f13835x1) && C3022m9.m12723k4(this.f13833kk, c5037rs.f13833kk) && C3022m9.m12719k4(this.f13834to, c5037rs.f13834to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1350qq[] m21422k4() {
        return this.f13832k4;
    }
}
