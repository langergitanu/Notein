package com.aspose.slides.internal.p187io;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5009lm;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5130x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.io.du */
/* JADX INFO: loaded from: classes.dex */
public class C5106du extends AbstractC5130x1 {
    @Override // com.aspose.slides.internal.p191it.AbstractC5130x1
    /* JADX INFO: renamed from: du */
    public void mo21952du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5009lm c5009lm = (C5009lm) c5061vw;
        if (c4201h4.m16734ks() != null) {
            C12018u4 c12018u4 = new C12018u4(c4201h4.m16734ks());
            C11913yj c11913yjM16764x1 = c4201h4.m16764x1();
            c11913yjM16764x1.m55787x1(c4201h4.m16760vj());
            c12018u4.m56771x1(c11913yjM16764x1);
            int iM21234k4 = (int) c5009lm.m21234k4();
            if (iM21234k4 == 1) {
                c4201h4.m16744s7().m56761kk(c12018u4);
                return;
            }
            if (iM21234k4 == 2) {
                c4201h4.m16744s7().m56766to(c12018u4);
                return;
            }
            if (iM21234k4 == 3) {
                c4201h4.m16744s7().m56746du(c12018u4);
            } else if (iM21234k4 == 4) {
                c4201h4.m16744s7().m56774x1(c12018u4);
            } else {
                if (iM21234k4 != 5) {
                    return;
                }
                c4201h4.m16731kk(c12018u4);
            }
        }
    }
}
