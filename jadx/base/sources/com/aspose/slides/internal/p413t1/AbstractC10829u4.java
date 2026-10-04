package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5070x5;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.u4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10829u4 extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        byte b;
        C5070x5 c5070x5 = (C5070x5) c5061vw;
        C12016rv[] c12016rvArr = (C12016rv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12016rv.class), (int) c5070x5.m21609k4()));
        for (int i = 0; i < c12016rvArr.length; i++) {
            c5070x5.m21616x1()[i].m58197kk().CloneTo(c12016rvArr[i]);
        }
        byte[] bArr = new byte[c5070x5.m21615kk().length];
        for (int i2 = 0; i2 < c5070x5.m21615kk().length; i2++) {
            byte b2 = c5070x5.m21615kk()[i2];
            if ((b2 & 6) == 6) {
                b = 0;
            } else {
                b = b2 != 2 ? b2 != 4 ? (byte) 0 : (byte) 3 : (byte) 1;
                if ((b2 & 1) == 1) {
                    b = (byte) ((b & 255) | 128);
                }
            }
            bArr[i2] = b;
        }
        C11896dy c11896dy = new C11896dy(c12016rvArr, bArr);
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55540k4(c11896dy, false);
        } else if (c4201h4.m16688dy() != null) {
            mo16666k4(c11896dy, c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16666k4(C11896dy c11896dy, C4201h4 c4201h4);
}
