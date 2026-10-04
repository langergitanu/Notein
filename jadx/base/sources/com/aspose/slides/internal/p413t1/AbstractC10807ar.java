package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5051u1;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.ar */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10807ar extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5051u1 c5051u1 = (C5051u1) c5061vw;
        C12016rv[] c12016rvArr = (C12016rv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12016rv.class), (int) (((c5051u1.m21485k4() & 4294967295L) + 1) & 4294967295L)));
        C12016rv c12016rvM16757uz = c4201h4.m16781yj() ? c4201h4.m16757uz() : c4201h4.m16753u4();
        int i = 0;
        C12016rv c12016rv = c12016rvArr[0];
        while (true) {
            c12016rvM16757uz.CloneTo(c12016rv);
            if (i >= c5051u1.m21490x1().length) {
                break;
            }
            c12016rvM16757uz = c5051u1.m21490x1()[i].m58197kk();
            i++;
            c12016rv = c12016rvArr[i];
        }
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55581x1(c12016rvArr);
            c4201h4.m16772x1(c12016rvArr[c12016rvArr.length - 1].Clone());
        } else {
            if (c4201h4.m16688dy() != null) {
                mo16619k4(c12016rvArr, c4201h4);
            }
            c4201h4.m16718k4(c12016rvArr[c12016rvArr.length - 1].Clone());
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16619k4(C12016rv[] c12016rvArr, C4201h4 c4201h4);
}
