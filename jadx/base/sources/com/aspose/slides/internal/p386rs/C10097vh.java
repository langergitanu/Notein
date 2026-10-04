package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6101zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.vh */
/* JADX INFO: loaded from: classes4.dex */
public class C10097vh extends AbstractC13453k4 {
    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        C6101zj c6101zj = new C6101zj(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C12014ne[] c12014neArr = (C12014ne[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12014ne.class), (int) c6101zj.m24734to()));
        if (c6101zj.m24733kk()) {
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
        c6101zj.m24731k4(c12014neArr);
        c6045bzArr[0] = c6101zj;
        return true;
    }
}
