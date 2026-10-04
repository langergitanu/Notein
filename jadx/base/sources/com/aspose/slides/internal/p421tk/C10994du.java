package com.aspose.slides.internal.p421tk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10994du extends C10988bz {

    /* JADX INFO: renamed from: k4 */
    private byte[] f38312k4;

    public C10994du() {
        m53208x1((short) 16387);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public short au_() {
        return super.au_();
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
        return m53244k4((C10994du) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        if (m53245k4() != null) {
            return AbstractC14092to.m67208k4((Object) m53245k4()).hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    /* JADX INFO: renamed from: k4 */
    public void mo53201k4(short s) {
        if (s != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        super.mo53201k4(s);
    }

    public C10994du(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53243k4(byte[] bArr) {
        this.f38312k4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53244k4(C10994du c10994du) {
        return C3022m9.m12719k4(m53245k4(), c10994du.m53245k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m53245k4() {
        return this.f38312k4;
    }
}
