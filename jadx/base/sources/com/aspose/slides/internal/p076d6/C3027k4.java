package com.aspose.slides.internal.p076d6;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p174hz.AbstractC4745rv;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.AbstractC12835to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.d6.k4 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class C3027k4 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private static byte[] f8861k4 = {75, 71, 83, 33, SignedBytes.MAX_POWER_OF_TWO, 35, 36, 37};

    /* JADX INFO: renamed from: x1 */
    private static byte[] f8862x1 = {-86, -45, -76, PatternStyle.UpwardDiagonal, -75, 20, 4, -18};

    /* JADX INFO: renamed from: du */
    private byte[] f8863du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f8864h4;

    /* JADX INFO: renamed from: kk */
    private boolean f8865kk;

    /* JADX INFO: renamed from: to */
    private byte[] f8866to;

    public C3027k4() {
        this.f8865kk = false;
        this.f8863du = new byte[21];
        this.f8864h4 = new byte[21];
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m12741k4(true);
        C14094ts.m67303k4(this);
    }

    public void finalize() throws Throwable {
        if (!this.f8865kk) {
            dispose();
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: k4 */
    public void m12745k4(String str) {
        if (this.f8865kk) {
            throw new ObjectDisposedException("too late");
        }
        AbstractC4745rv abstractC4745rvM19718kk = AbstractC4745rv.m19718kk();
        abstractC4745rvM19718kk.m19687kk(2);
        if (str == null || str.length() < 1) {
            C14058fa.m66596k4(f8862x1, 0, this.f8863du, 0, 8);
        } else {
            abstractC4745rvM19718kk.mo19688kk(m12742k4(str, 0));
            abstractC4745rvM19718kk.m19689ks().mo19562k4(f8861k4, 0, 8, this.f8863du, 0);
        }
        if (str == null || str.length() < 8) {
            C14058fa.m66596k4(f8862x1, 0, this.f8863du, 8, 8);
        } else {
            abstractC4745rvM19718kk.mo19688kk(m12742k4(str, 7));
            abstractC4745rvM19718kk.m19689ks().mo19562k4(f8861k4, 0, 8, this.f8863du, 8);
        }
        AbstractC12835to abstractC12835toM59678du = AbstractC12835to.m59678du();
        byte[] bArrMo26677to = str == null ? new byte[0] : AbstractC6747ar.m26643rv().mo26677to(str);
        byte[] bArrM19588x1 = abstractC12835toM59678du.m19588x1(bArrMo26677to);
        C14058fa.m66596k4(bArrM19588x1, 0, this.f8864h4, 0, 16);
        AbstractC14092to.m67225k4(bArrMo26677to, 0, bArrMo26677to.length);
        AbstractC14092to.m67225k4(bArrM19588x1, 0, bArrM19588x1.length);
        abstractC4745rvM19718kk.m19690m9();
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m12748x1() {
        if (this.f8865kk) {
            throw new ObjectDisposedException("too late");
        }
        return m12744x1(this.f8864h4);
    }

    public C3027k4(String str, byte[] bArr) {
        this();
        m12745k4(str);
        m12746k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12741k4(boolean z) {
        if (this.f8865kk) {
            return;
        }
        byte[] bArr = this.f8863du;
        AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        byte[] bArr2 = this.f8864h4;
        AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.f8866to;
        if (bArr3 != null) {
            AbstractC14092to.m67225k4(bArr3, 0, bArr3.length);
        }
        this.f8865kk = true;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m12744x1(byte[] bArr) {
        byte[] bArr2 = new byte[24];
        AbstractC4745rv abstractC4745rvM19718kk = AbstractC4745rv.m19718kk();
        abstractC4745rvM19718kk.m19687kk(2);
        abstractC4745rvM19718kk.mo19688kk(m12743k4(bArr, 0));
        abstractC4745rvM19718kk.m19689ks().mo19562k4(this.f8866to, 0, 8, bArr2, 0);
        abstractC4745rvM19718kk.mo19688kk(m12743k4(bArr, 7));
        abstractC4745rvM19718kk.m19689ks().mo19562k4(this.f8866to, 0, 8, bArr2, 8);
        abstractC4745rvM19718kk.mo19688kk(m12743k4(bArr, 14));
        abstractC4745rvM19718kk.m19689ks().mo19562k4(this.f8866to, 0, 8, bArr2, 16);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12746k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("Challenge");
        }
        if (this.f8865kk) {
            throw new ObjectDisposedException("too late");
        }
        this.f8866to = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArr).deepClone(), byte[].class);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m12747k4() {
        if (this.f8865kk) {
            throw new ObjectDisposedException("too late");
        }
        return m12744x1(this.f8863du);
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m12742k4(String str, int i) {
        byte[] bArr = new byte[7];
        AbstractC6747ar.m26650yj().mo26659k4(C14113y2.m67444x1(str, C11697x1.m55252to()), i, C14116yg.m67507x1(str.length() - i, 7), bArr, 0);
        byte[] bArrM12743k4 = m12743k4(bArr, 0);
        AbstractC14092to.m67225k4(bArr, 0, 7);
        return bArrM12743k4;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m12743k4(byte[] bArr, int i) {
        byte b = bArr[i];
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 3;
        int i5 = i + 4;
        int i6 = i + 5;
        int i7 = i + 6;
        return new byte[]{b, C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(b), 6) << 7) | (C7019kk.m27462to(Byte.valueOf(bArr[i2]), 6) >> 1)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i2]), 6) << 6) | (C7019kk.m27462to(Byte.valueOf(bArr[i3]), 6) >> 2)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i3]), 6) << 5) | (C7019kk.m27462to(Byte.valueOf(bArr[i4]), 6) >> 3)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i4]), 6) << 4) | (C7019kk.m27462to(Byte.valueOf(bArr[i5]), 6) >> 4)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i5]), 6) << 3) | (C7019kk.m27462to(Byte.valueOf(bArr[i6]), 6) >> 5)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i7]), 6) >> 6) | (C7019kk.m27462to(Byte.valueOf(bArr[i6]), 6) << 2)), 9), C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[i7]), 6) << 1), 9)};
    }
}
