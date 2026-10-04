package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.y5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2383y5 implements InterfaceC2186m3 {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC2320ug f8243k4;

    /* JADX INFO: renamed from: kk */
    protected InterfaceC2269qx[] f8244kk;

    /* JADX INFO: renamed from: x1 */
    protected int f8245x1;

    public AbstractC2383y5(AbstractC2320ug abstractC2320ug, int i) {
        this.f8243k4 = abstractC2320ug;
        this.f8245x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10337k4();

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2186m3
    /* JADX INFO: renamed from: k4 */
    public boolean mo10345k4(C2379xz c2379xz) {
        if (this.f8244kk == null) {
            mo10337k4();
        }
        int iM11709dy = c2379xz.m11709dy();
        boolean z = false;
        while (c2379xz.m11720to(iM11709dy)) {
            int[] iArr = {iM11709dy};
            boolean zMo10531k4 = mo10531k4(c2379xz, iArr);
            int i = iArr[0];
            if (zMo10531k4) {
                z = true;
                iM11709dy = i;
            } else {
                iArr[0] = i;
                c2379xz.m11715k4(iArr);
                iM11709dy = iArr[0];
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m11731k4(C2379xz c2379xz, int i) {
        if (c2379xz.m11718m9() == null) {
            return true;
        }
        if (C14113y2.m67363du(c2379xz.m11718m9().m11181x1(), "rphf")) {
            return ((~c2379xz.m11712k4(i).m10722kk()) & 4) != 0;
        }
        for (C2217nk c2217nk : C2208n3.f7653k4) {
            if (C14113y2.m67363du(c2379xz.m11718m9().m11181x1(), c2217nk.f7675kk)) {
                long jM10722kk = c2379xz.m11712k4(i).m10722kk();
                long j = c2217nk.f7676x1;
                if ((jM10722kk & j) != j) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        if (!m11731k4(c2379xz, iArr[0])) {
            return false;
        }
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            if (this.f8244kk[i].mo10531k4(c2379xz, iArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2186m3
    /* JADX INFO: renamed from: k4 */
    public boolean mo11104k4(C2379xz c2379xz, int[] iArr, int i) {
        if (this.f8244kk == null) {
            mo10337k4();
        }
        if (i > c2379xz.m11721x1()) {
            i = c2379xz.m11721x1();
        }
        boolean z = false;
        while (iArr[0] < i) {
            if (mo10531k4(c2379xz, iArr)) {
                z = true;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
        return z;
    }
}
