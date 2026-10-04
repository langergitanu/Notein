package com.aspose.slides.internal.p187io;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5043sv;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5130x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.io.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5111x1 extends AbstractC5130x1 {
    @Override // com.aspose.slides.internal.p191it.AbstractC5130x1
    /* JADX INFO: renamed from: du */
    public void mo21952du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5043sv c5043sv = (C5043sv) c5061vw;
        if (c5043sv.m21455kk() == null) {
            if (c5043sv.m21456x1() == 5) {
                c4201h4.m16731kk(new C12018u4());
                return;
            }
            return;
        }
        C12018u4 c12018u4M7984kk = c5043sv.m21455kk().m7984kk();
        C11913yj c11913yjM16764x1 = c4201h4.m16764x1();
        c11913yjM16764x1.m55787x1(c4201h4.m16760vj());
        c12018u4M7984kk.m56771x1(c11913yjM16764x1);
        int iM21456x1 = (int) c5043sv.m21456x1();
        if (iM21456x1 == 1) {
            c4201h4.m16744s7().m56761kk(c12018u4M7984kk);
            return;
        }
        if (iM21456x1 == 2) {
            c4201h4.m16744s7().m56766to(c12018u4M7984kk);
            return;
        }
        if (iM21456x1 == 3) {
            c4201h4.m16744s7().m56746du(c12018u4M7984kk);
        } else if (iM21456x1 == 4) {
            c4201h4.m16744s7().m56774x1(c12018u4M7984kk);
        } else {
            if (iM21456x1 != 5) {
                return;
            }
            c4201h4.m16731kk(c12018u4M7984kk);
        }
    }
}
