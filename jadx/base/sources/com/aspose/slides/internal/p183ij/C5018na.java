package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.na */
/* JADX INFO: loaded from: classes.dex */
public class C5018na extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13773k4;

    /* JADX INFO: renamed from: kk */
    private C12514ne[] f13774kk;

    /* JADX INFO: renamed from: x1 */
    private long f13775x1;

    public C5018na(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21304k4((C5018na) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13773k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13775x1)) * 397;
        C12514ne[] c12514neArr = this.f13774kk;
        return iHashCode2 ^ (c12514neArr != null ? AbstractC14092to.m67208k4((Object) c12514neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21300k4() {
        return this.f13775x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne[] m21305x1() {
        return this.f13774kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21301k4(long j) {
        this.f13775x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21302k4(C12521uz c12521uz) {
        this.f13773k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21303k4(C12514ne[] c12514neArr) {
        this.f13774kk = c12514neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21304k4(C5018na c5018na) {
        return m21559k4((C5061vw) c5018na) && C14067j2.m66728k4(this.f13773k4, c5018na.f13773k4) && this.f13775x1 == c5018na.f13775x1 && C3022m9.m12723k4(this.f13774kk, c5018na.f13774kk);
    }
}
