package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1337c5;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.w6 */
/* JADX INFO: loaded from: classes.dex */
public class C5062w6 extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private C1337c5 f13899k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13900kk;

    /* JADX INFO: renamed from: to */
    private String f13901to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13902x1;

    public C5062w6(C5061vw c5061vw) {
        super(c5061vw);
        m21563k4(new C1337c5());
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
        return m21566k4((C5062w6) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1337c5 c1337c5 = this.f13899k4;
        int iHashCode2 = (iHashCode ^ (c1337c5 != null ? c1337c5.hashCode() : 0)) * 397;
        byte[] bArr = this.f13902x1;
        int iHashCode3 = (iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        byte[] bArr2 = this.f13900kk;
        int iHashCode4 = (iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0)) * 397;
        String str = this.f13901to;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1337c5 m21562k4() {
        return this.f13899k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m21567kk() {
        return this.f13900kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m21568to() {
        return this.f13901to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, EmfHeader: {1}, EmfHeaderRecordBuffer: {2}, EmfDescriptionBuffer: {3}, EmfDescription: {4}", super.toString(), this.f13899k4, this.f13902x1, this.f13900kk, this.f13901to);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21569x1(byte[] bArr) {
        this.f13900kk = bArr;
    }

    public C5062w6(C5062w6 c5062w6) {
        super(c5062w6);
        m21564k4(c5062w6.m21568to());
        m21569x1(c5062w6.m21567kk());
        m21563k4(c5062w6.m21562k4());
        m21565k4(c5062w6.m21570x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21563k4(C1337c5 c1337c5) {
        this.f13899k4 = c1337c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m21570x1() {
        return this.f13902x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21564k4(String str) {
        this.f13901to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21565k4(byte[] bArr) {
        this.f13902x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21566k4(C5062w6 c5062w6) {
        return m21559k4((C5061vw) c5062w6) && C14067j2.m66728k4(this.f13899k4, c5062w6.f13899k4) && C3022m9.m12719k4(this.f13902x1, c5062w6.f13902x1) && C3022m9.m12719k4(this.f13900kk, c5062w6.f13900kk) && C14113y2.m67363du(this.f13901to, c5062w6.f13901to);
    }
}
