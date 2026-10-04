package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.em */
/* JADX INFO: loaded from: classes3.dex */
class C2070em {

    /* JADX INFO: renamed from: to */
    private byte f7169to;

    /* JADX INFO: renamed from: k4 */
    private List<Integer> f7167k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private int f7168kk = 0;

    /* JADX INFO: renamed from: x1 */
    private C3152yj f7170x1 = new C3152yj();

    public C2070em(byte b) {
        this.f7169to = (byte) 0;
        this.f7169to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2234os m10492k4() {
        C2234os c2234os = new C2234os();
        this.f7170x1.close();
        c2234os.m11208k4(this.f7170x1.toArray());
        c2234os.m11205k4(this.f7167k4.size() - 1);
        c2234os.m11209k4(C2027c5.m10306x1(this.f7167k4));
        c2234os.m11204k4(this.f7169to);
        return c2234os;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10493k4(byte[] bArr) {
        if (this.f7167k4.size() == 0) {
            this.f7167k4.addItem(0);
        }
        this.f7170x1.write(bArr, 0, bArr.length);
        int length = this.f7168kk + bArr.length;
        this.f7168kk = length;
        this.f7167k4.addItem(Integer.valueOf(length));
    }
}
