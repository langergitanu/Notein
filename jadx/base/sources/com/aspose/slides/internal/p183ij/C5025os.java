package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1348m9;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.os */
/* JADX INFO: loaded from: classes.dex */
public class C5025os extends C5062w6 {

    /* JADX INFO: renamed from: k4 */
    private C1348m9 f13803k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13804x1;

    public C5025os(C5025os c5025os) {
        super((C5062w6) c5025os);
        this.f13803k4 = new C1348m9();
        m21366k4(c5025os.f13803k4);
        m21368kk(c5025os.m21369m9());
    }

    @Override // com.aspose.slides.internal.p183ij.C5062w6, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21367k4((C5025os) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C1348m9 m21365h4() {
        return this.f13803k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5062w6, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1348m9 c1348m9 = this.f13803k4;
        int iHashCode2 = (iHashCode ^ (c1348m9 != null ? c1348m9.hashCode() : 0)) * 397;
        byte[] bArr = this.f13804x1;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21366k4(C1348m9 c1348m9) {
        this.f13803k4 = c1348m9;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21368kk(byte[] bArr) {
        this.f13804x1 = bArr;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m21369m9() {
        return this.f13804x1;
    }

    public C5025os(C5062w6 c5062w6) {
        super(c5062w6);
        this.f13803k4 = new C1348m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21367k4(C5025os c5025os) {
        return m21566k4((C5062w6) c5025os) && C14067j2.m66728k4(this.f13803k4, c5025os.f13803k4) && C3022m9.m12719k4(this.f13804x1, c5025os.f13804x1);
    }
}
