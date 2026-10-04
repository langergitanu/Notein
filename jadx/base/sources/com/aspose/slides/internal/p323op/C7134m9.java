package com.aspose.slides.internal.p323op;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.m9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7134m9 {

    /* JADX INFO: renamed from: k4 */
    private String f19247k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC7133kk f19248x1;

    private C7134m9(C7134m9 c7134m9, AbstractC7133kk abstractC7133kk) {
        this.f19247k4 = c7134m9.f19247k4;
        this.f19248x1 = abstractC7133kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7134m9 m27682k4(C7134m9 c7134m9, AbstractC7133kk abstractC7133kk) {
        return new C7134m9(c7134m9, abstractC7133kk);
    }

    /* JADX INFO: renamed from: x1 */
    private String m27684x1(byte[] bArr) {
        C4772y9 c4772y9 = new C4772y9();
        try {
            return C14080ne.m66952k4(c4772y9.m19588x1(bArr));
        } finally {
            c4772y9.dispose();
        }
    }

    public boolean equals(Object obj) {
        C7134m9 c7134m9;
        boolean zEquals;
        if (obj == null || (c7134m9 = (C7134m9) C7019kk.m27452k4(obj, C7134m9.class)) == null) {
            return false;
        }
        AbstractC7133kk abstractC7133kk = this.f19248x1;
        if (abstractC7133kk == null && c7134m9.f19248x1 == null) {
            zEquals = true;
        } else {
            boolean z = abstractC7133kk == null;
            AbstractC7133kk abstractC7133kk2 = c7134m9.f19248x1;
            zEquals = z | (abstractC7133kk2 == null) ? false : abstractC7133kk.equals(abstractC7133kk2);
        }
        return C14113y2.m67363du(this.f19247k4, c7134m9.f19247k4) && zEquals;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(-324743029, 486187739, this.f19247k4);
        AbstractC7133kk abstractC7133kk = this.f19248x1;
        return iOooO0O0 + (abstractC7133kk == null ? 0 : abstractC7133kk.hashCode());
    }

    public String toString() {
        AbstractC7133kk abstractC7133kk = this.f19248x1;
        return abstractC7133kk == null ? this.f19247k4 : C14113y2.m67402k4("base: {0} [derived: {1}]", this.f19247k4, abstractC7133kk);
    }

    private C7134m9(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        this.f19247k4 = m27684x1(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static C7134m9 m27683k4(byte[] bArr) {
        return new C7134m9(bArr);
    }
}
