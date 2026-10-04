package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class kp9 implements InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private long f45822du;

    /* JADX INFO: renamed from: k4 */
    C13791lr[] f45823k4;

    /* JADX INFO: renamed from: kk */
    private byte f45824kk = -1;

    /* JADX INFO: renamed from: to */
    private ITextFrameFormat f45825to;

    /* JADX INFO: renamed from: x1 */
    Dictionary<String, Integer> f45826x1;

    public kp9(ITextFrameFormat iTextFrameFormat) {
        this.f45825to = iTextFrameFormat;
    }

    /* JADX INFO: renamed from: to */
    private void m64090to() {
        this.f45822du++;
        if (C7019kk.m27469x1(this.f45825to, PVIObject.class)) {
            ((PVIObject) this.f45825to).m2145uz();
        }
    }

    public boolean equals(Object obj) {
        C13791lr[] c13791lrArr;
        kp9 kp9Var = (kp9) C7019kk.m27452k4(obj, kp9.class);
        if (kp9Var == null) {
            return false;
        }
        C13791lr[] c13791lrArr2 = this.f45823k4;
        if ((c13791lrArr2 == null && kp9Var.f45823k4 != null) || (c13791lrArr2 != null && kp9Var.f45823k4 == null)) {
            return false;
        }
        if (c13791lrArr2 != null && (c13791lrArr = kp9Var.f45823k4) != null) {
            if (c13791lrArr2.length != c13791lrArr.length) {
                return false;
            }
            int i = 0;
            while (true) {
                C13791lr[] c13791lrArr3 = this.f45823k4;
                if (i >= c13791lrArr3.length) {
                    break;
                }
                if (c13791lrArr3[i].m64504k4() != kp9Var.f45823k4[i].m64504k4() || !C14113y2.m67363du(this.f45823k4[i].m64509kk(), kp9Var.f45823k4[i].m64509kk())) {
                    break;
                }
                i++;
            }
            return false;
        }
        return this.f45824kk == kp9Var.f45824kk;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return (InterfaceC14397rj) this.f45825to;
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m64091k4() {
        return this.f45824kk;
    }

    /* JADX INFO: renamed from: kk */
    public final long m64094kk() {
        return this.f45822du;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m64095x1() {
        byte b = this.f45824kk;
        return (b == 9 || b == 10 || b == 11 || b == 12) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64092k4(byte b) {
        this.f45824kk = b;
        m64090to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64093k4(kp9 kp9Var) {
        C13791lr[] c13791lrArr = kp9Var.f45823k4;
        if (c13791lrArr != null) {
            this.f45823k4 = new C13791lr[c13791lrArr.length];
            int i = 0;
            while (true) {
                C13791lr[] c13791lrArr2 = this.f45823k4;
                if (i >= c13791lrArr2.length) {
                    break;
                }
                c13791lrArr2[i] = new C13791lr(kp9Var.f45823k4[i]);
                i++;
            }
        } else {
            this.f45823k4 = null;
        }
        this.f45824kk = kp9Var.f45824kk;
        m64090to();
    }
}
