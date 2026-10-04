package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p539z4.C13366ca;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C11004ix extends AbstractC11027u4 {

    /* JADX INFO: renamed from: du */
    private String f38322du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f38323h4;

    /* JADX INFO: renamed from: k4 */
    private int f38324k4;

    /* JADX INFO: renamed from: kk */
    private int f38325kk;

    /* JADX INFO: renamed from: to */
    private C13366ca f38326to;

    /* JADX INFO: renamed from: x1 */
    private int f38327x1;

    public C11004ix() {
        this.f38323h4 = new byte[0];
        m53208x1((short) 16412);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m53277c5() {
        return this.f38325kk;
    }

    /* JADX INFO: renamed from: ck */
    public final String m53278ck() {
        return this.f38322du;
    }

    /* JADX INFO: renamed from: du */
    public final void m53279du(int i) {
        this.f38325kk = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53280dy() {
        return this.f38327x1;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53285k4((C11004ix) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int i = ((((this.f38324k4 * 397) ^ this.f38327x1) * 397) ^ this.f38325kk) * 397;
        C13366ca c13366ca = this.f38326to;
        int iHashCode = (i ^ (c13366ca != null ? c13366ca.hashCode() : 0)) * 397;
        String str = this.f38322du;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr = this.f38323h4;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C13366ca m53281jd() {
        return this.f38326to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53282k4(C13366ca c13366ca) {
        this.f38326to = c13366ca;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53286kk(int i) {
        this.f38324k4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m53288m9() {
        return this.f38324k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m53289to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, BrushId: {1}, FormatId: {2}, Length: {3}, LayoutRect: {4}, StringData: {5}, AlignmentPadding: {6}", super.toString(), Integer.valueOf(this.f38324k4), Integer.valueOf(this.f38327x1), Integer.valueOf(this.f38325kk), this.f38326to, this.f38322du, Integer.valueOf(this.f38323h4.length));
    }

    public C11004ix(C10988bz c10988bz) {
        super(c10988bz);
        this.f38323h4 = new byte[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53283k4(String str) {
        this.f38322du = str;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53287kk() {
        return m53198h4(15);
    }

    /* JADX INFO: renamed from: to */
    public final void m53290to(int i) {
        this.f38327x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53284k4(byte[] bArr) {
        this.f38323h4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53285k4(C11004ix c11004ix) {
        return this.f38324k4 == c11004ix.f38324k4 && this.f38327x1 == c11004ix.f38327x1 && this.f38325kk == c11004ix.f38325kk && C14067j2.m66728k4(this.f38326to, c11004ix.f38326to) && C14113y2.m67363du(this.f38322du, c11004ix.f38322du) && C3022m9.m12719k4(this.f38323h4, c11004ix.f38323h4);
    }
}
