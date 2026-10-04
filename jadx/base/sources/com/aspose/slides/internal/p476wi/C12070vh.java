package com.aspose.slides.internal.p476wi;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p288n1.AbstractC6681k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11044zj;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wi.vh */
/* JADX INFO: loaded from: classes5.dex */
public class C12070vh extends AbstractC6681k4 {
    @Override // com.aspose.slides.internal.p288n1.AbstractC6681k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo26430k4(C10988bz[] c10988bzArr, AbstractC3150x6 abstractC3150x6) {
        C11044zj c11044zj = new C11044zj(c10988bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C12014ne[] c12014neArr = (C12014ne[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12014ne.class), (int) c11044zj.m53474to()));
        if (c11044zj.m53472kk()) {
            for (int i = 0; i < c12014neArr.length; i++) {
                c12014neArr[i].m56676kk(c3134k4.m13387yj() & 255);
                c12014neArr[i].m56682to(c3134k4.m13387yj() & 255);
                c12014neArr[i].m56684x1(c3134k4.m13387yj() & 255);
                c12014neArr[i].m56671k4(c3134k4.m13387yj() & 255);
            }
        } else {
            for (int i2 = 0; i2 < c12014neArr.length; i2++) {
                c12014neArr[i2].m56676kk(c3134k4.m13381rv());
                c12014neArr[i2].m56682to(c3134k4.m13381rv());
                c12014neArr[i2].m56684x1(c3134k4.m13381rv());
                c12014neArr[i2].m56671k4(c3134k4.m13381rv());
            }
        }
        c11044zj.m53470k4(c12014neArr);
        c10988bzArr[0] = c11044zj;
        return true;
    }
}
