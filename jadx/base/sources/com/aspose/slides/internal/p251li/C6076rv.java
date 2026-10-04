package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C6076rv extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private long f17202k4;

    public C6076rv() {
        m24449x1((short) 16405);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24612k4((C6076rv) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (int) this.f17202k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24610k4(byte b) {
        m24444to(b);
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24613kk() {
        return m24447wl();
    }

    /* JADX INFO: renamed from: to */
    public final long m24614to() {
        return this.f17202k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PenId: {1}", super.toString(), Long.valueOf(this.f17202k4));
    }

    public C6076rv(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24611k4(long j) {
        if ((4294967295L & j) > 63) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f17202k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24612k4(C6076rv c6076rv) {
        return this.f17202k4 == c6076rv.f17202k4;
    }
}
