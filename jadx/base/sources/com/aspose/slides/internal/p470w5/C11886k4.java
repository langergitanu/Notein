package com.aspose.slides.internal.p470w5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p245la.AbstractC6016k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.w5.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11886k4 extends AbstractC6016k4 {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f40026k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f40027kk;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f40028x1;

    public C11886k4() {
        this.f40026k4 = new byte[3];
        this.f40028x1 = new byte[8];
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6018m9
    /* JADX INFO: renamed from: k4 */
    public void mo24316k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        abstractC3150x6.writeByte((byte) 33);
        abstractC3150x6.writeByte((byte) -1);
        abstractC3150x6.writeByte((byte) 11);
        abstractC3150x6.write(this.f40028x1, 0, 8);
        abstractC3150x6.write(this.f40026k4, 0, 3);
        C6013du.m24296k4(this.f40027kk, abstractC3150x6);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55483x1(byte[] bArr) {
        if (this.f40027kk != bArr) {
            this.f40027kk = bArr;
            m24311k4(true);
        }
    }

    public C11886k4(String str, byte[] bArr, byte[] bArr2) {
        this.f40026k4 = new byte[3];
        this.f40028x1 = new byte[8];
        m55481k4(str);
        m55482k4(bArr);
        m55483x1(bArr2);
        m24311k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55481k4(String str) {
        if (str == null) {
            AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f40028x1), 0, 8);
        } else {
            byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(str);
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), 0, AbstractC14092to.m67208k4((Object) this.f40028x1), 0, C14116yg.m67507x1(bArrMo26677to.length, 8));
            if (bArrMo26677to.length < 8) {
                AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f40028x1), bArrMo26677to.length, 8 - bArrMo26677to.length);
            }
        }
        m24311k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55482k4(byte[] bArr) {
        if (bArr == null) {
            AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f40026k4), 0, 3);
        } else {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) this.f40026k4), 0, C14116yg.m67507x1(bArr.length, 3));
            if (bArr.length < 3) {
                AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f40026k4), bArr.length, 3 - bArr.length);
            }
        }
        m24311k4(true);
    }
}
