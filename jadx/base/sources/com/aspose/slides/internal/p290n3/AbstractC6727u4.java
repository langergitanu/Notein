package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9745yo;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.u4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6727u4 extends AbstractC1692du {
    public AbstractC6727u4(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        byte b;
        C9745yo c9745yo = (C9745yo) c9723vw;
        C12016rv[] c12016rvArr = (C12016rv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12016rv.class), (int) c9745yo.m47905x1()));
        for (int i = 0; i < c12016rvArr.length; i++) {
            c9745yo.m47903kk()[i].m57707to().CloneTo(c12016rvArr[i]);
        }
        byte[] bArr = new byte[c9745yo.m47904to().length];
        for (int i2 = 0; i2 < c9745yo.m47904to().length; i2++) {
            byte b2 = c9745yo.m47904to()[i2];
            if ((b2 & 6) == 6) {
                b = 0;
            } else {
                b = (b2 & 2) == 2 ? (byte) 1 : (b2 & 4) == 4 ? (byte) 3 : (byte) 0;
                if ((b2 & 1) == 1) {
                    b = (byte) ((b & 255) | 128);
                }
            }
            bArr[i2] = b;
        }
        C11896dy c11896dy = new C11896dy(c12016rvArr, bArr);
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55540k4(c11896dy, false);
        } else if (c3585h4.m14488dy() != null) {
            mo7775k4(c11896dy, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7775k4(C11896dy c11896dy, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
