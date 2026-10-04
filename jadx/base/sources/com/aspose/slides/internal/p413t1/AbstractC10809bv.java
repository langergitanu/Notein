package com.aspose.slides.internal.p413t1;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5080yg;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.bv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10809bv extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5080yg c5080yg = (C5080yg) c5061vw;
        C11896dy c11896dy = new C11896dy();
        int i = 0;
        for (int i2 = 0; i2 < (c5080yg.m21654k4() & 4294967295L); i2++) {
            int i3 = (int) c5080yg.m21660kk()[i2];
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i3);
            for (int i4 = 0; i4 < i3; i4++) {
                c5080yg.m21661to()[i + i4].m58198to().CloneTo(c12025x6Arr[i4]);
            }
            c11896dy.m55564kk(c12025x6Arr);
            i += i3;
        }
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55540k4(c11896dy, false);
        } else if (c4201h4.m16688dy() != null) {
            mo16634k4(c11896dy, c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16634k4(C11896dy c11896dy, C4201h4 c4201h4);
}
