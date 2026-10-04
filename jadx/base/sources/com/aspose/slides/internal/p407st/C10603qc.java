package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qc */
/* JADX INFO: loaded from: classes4.dex */
public class C10603qc implements IDisposable {

    /* JADX INFO: renamed from: du */
    private final byte[] f37311du;

    /* JADX INFO: renamed from: h4 */
    private boolean f37312h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4739nv f37313k4;

    /* JADX INFO: renamed from: kk */
    private final long f37314kk;

    /* JADX INFO: renamed from: to */
    private final long f37315to;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f37316x1;

    public C10603qc(String str, byte[] bArr, long j) {
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(str);
        this.f37311du = bArrMo26677to;
        byte[] bArr2 = new byte[bArr.length + bArrMo26677to.length];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), bArr.length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), 0, AbstractC14092to.m67208k4((Object) bArr2), bArr.length, bArrMo26677to.length);
        long j2 = j & 4294967295L;
        this.f37314kk = j2 == 40 ? 16L : 4294967295L & (j2 / 8);
        this.f37315to = j;
        C4772y9 c4772y9 = new C4772y9();
        this.f37313k4 = c4772y9;
        this.f37316x1 = c4772y9.m19588x1(bArr2);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m51563k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10406dp m51562k4(long j) {
        return new C10406dp(m51564x1(j));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m51564x1(long j) {
        byte[] bArrM66776k4 = C14069jd.m66776k4(j);
        byte[] bArr = this.f37316x1;
        byte[] bArr2 = new byte[bArr.length + 4];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), this.f37316x1.length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM66776k4), 0, AbstractC14092to.m67208k4((Object) bArr2), this.f37316x1.length, bArrM66776k4.length);
        byte[] bArrM19588x1 = this.f37313k4.m19588x1(bArr2);
        int i = (int) (this.f37314kk & 4294967295L);
        byte[] bArr3 = new byte[i];
        AbstractC14092to.m67222k4(AbstractC14092to.m67208k4((Object) bArrM19588x1), AbstractC14092to.m67208k4((Object) bArr3), this.f37314kk & 4294967295L);
        if ((this.f37315to & 4294967295L) == 40) {
            for (int i2 = 5; i2 < i; i2++) {
                bArr3[i2] = 0;
            }
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51563k4(boolean z) {
        if (this.f37312h4) {
            return;
        }
        if (z) {
            ((IDisposable) C7019kk.m27452k4((Object) this.f37313k4, IDisposable.class)).dispose();
            this.f37313k4 = null;
        }
        this.f37312h4 = true;
    }
}
