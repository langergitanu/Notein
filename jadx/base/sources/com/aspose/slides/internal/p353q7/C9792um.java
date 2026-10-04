package com.aspose.slides.internal.p353q7;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.um */
/* JADX INFO: loaded from: classes4.dex */
public class C9792um {

    /* JADX INFO: renamed from: k4 */
    public C9757ar[] f35477k4;

    /* JADX INFO: renamed from: x1 */
    public short[] f35478x1;

    static {
        C7019kk.m27454k4(C9757ar.class, (InterfaceC7014c5) new InterfaceC7014c5<C9757ar>() { // from class: com.aspose.slides.internal.q7.um.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9757ar mo838x1() {
                return new C9757ar();
            }
        });
    }

    public C9792um(C12564kk c12564kk, int i, int i2) {
        this.f35477k4 = (C9757ar[]) C22200OooO0o0.OooO00o(C9757ar.class, i);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            C9757ar[] c9757arArr = this.f35477k4;
            if (i4 >= c9757arArr.length) {
                break;
            }
            c9757arArr[i4] = new C9757ar(c12564kk);
            i4++;
        }
        this.f35478x1 = new short[i2 - i];
        while (true) {
            short[] sArr = this.f35478x1;
            if (i3 >= sArr.length) {
                return;
            }
            sArr[i3] = c12564kk.m58605to();
            i3++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9757ar m48252k4(int i) {
        C9757ar[] c9757arArr = this.f35477k4;
        if (i < c9757arArr.length) {
            return c9757arArr[i];
        }
        C9757ar c9757arClone = c9757arArr[c9757arArr.length - 1].Clone();
        C9757ar[] c9757arArr2 = this.f35477k4;
        int length = i - c9757arArr2.length;
        short[] sArr = this.f35478x1;
        return new C9757ar(c9757arClone.f35245k4, length < sArr.length ? sArr[i - c9757arArr2.length] : (short) 0);
    }
}
