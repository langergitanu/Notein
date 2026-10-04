package com.aspose.slides.internal.p347px;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C9603wl {

    /* JADX INFO: renamed from: k4 */
    public C9601uz[] f34738k4;

    /* JADX INFO: renamed from: x1 */
    public short[] f34739x1;

    static {
        C7019kk.m27454k4(C9601uz.class, (InterfaceC7014c5) new InterfaceC7014c5<C9601uz>() { // from class: com.aspose.slides.internal.px.wl.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9601uz mo838x1() {
                return new C9601uz();
            }
        });
    }

    public C9603wl(C11296k4 c11296k4, int i, int i2) {
        this.f34738k4 = new C9601uz[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            C9601uz[] c9601uzArr = this.f34738k4;
            if (i4 >= c9601uzArr.length) {
                break;
            }
            c9601uzArr[i4] = new C9601uz(c11296k4);
            i4++;
        }
        this.f34739x1 = new short[i2 - i];
        while (true) {
            short[] sArr = this.f34739x1;
            if (i3 >= sArr.length) {
                return;
            }
            sArr[i3] = c11296k4.m54279to();
            i3++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9601uz m46903k4(int i) {
        C9601uz[] c9601uzArr = this.f34738k4;
        if (i < c9601uzArr.length) {
            return c9601uzArr[i];
        }
        C9601uz c9601uzClone = c9601uzArr[c9601uzArr.length - 1].Clone();
        C9601uz[] c9601uzArr2 = this.f34738k4;
        int length = i - c9601uzArr2.length;
        short[] sArr = this.f34739x1;
        return new C9601uz(c9601uzClone.f34734k4, length < sArr.length ? sArr[i - c9601uzArr2.length] : (short) 0);
    }
}
