package com.aspose.slides.internal.p207jk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p359qf.AbstractC9858kk;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11040xk;
import com.aspose.slides.internal.p539z4.AbstractC13365c6;
import com.aspose.slides.internal.p539z4.C13362bv;
import com.aspose.slides.internal.p539z4.C13375g8;
import com.aspose.slides.internal.p539z4.C13380he;
import com.aspose.slides.internal.p539z4.C13383j2;
import com.aspose.slides.internal.p539z4.C13396nv;
import com.aspose.slides.internal.p539z4.C13398qm;
import com.aspose.slides.internal.p539z4.C13402rv;
import com.aspose.slides.internal.p539z4.C13424xk;
import com.aspose.slides.internal.p539z4.C13425xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.jk.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5497k4 extends AbstractC9858kk {
    @Override // com.aspose.slides.internal.p359qf.AbstractC9858kk
    /* JADX INFO: renamed from: x1 */
    public void mo7795x1(C10988bz c10988bz, C9856du c9856du) {
        Object objM62322kk;
        AbstractC13365c6 abstractC13365c6;
        C11040xk c11040xk = (C11040xk) c10988bz;
        if (c11040xk.m53444kk() && c11040xk.m53438c5() == null) {
            return;
        }
        int iM53445m9 = c11040xk.m53445m9() & 255;
        switch (c11040xk.m53446to()) {
            case 0:
                throw new NotSupportedException("Invalid objects are not supported");
            case 1:
                C13402rv c13402rv = (C13402rv) c11040xk.m53438c5();
                objM62322kk = c13402rv.m62322kk();
                abstractC13365c6 = c13402rv;
                break;
            case 2:
                C13383j2 c13383j2 = (C13383j2) c11040xk.m53438c5();
                objM62322kk = c13383j2.m62158kk();
                abstractC13365c6 = c13383j2;
                break;
            case 3:
                C13425xw c13425xw = (C13425xw) c11040xk.m53438c5();
                objM62322kk = c13425xw.m62467c5();
                abstractC13365c6 = c13425xw;
                break;
            case 4:
                C13380he c13380he = (C13380he) c11040xk.m53438c5();
                objM62322kk = c13380he.m62137kk();
                abstractC13365c6 = c13380he;
                break;
            case 5:
                C13398qm c13398qm = (C13398qm) c11040xk.m53438c5();
                objM62322kk = c13398qm.m62301k4().mo62129x1();
                abstractC13365c6 = c13398qm;
                break;
            case 6:
                C13424xk c13424xk = (C13424xk) c11040xk.m53438c5();
                objM62322kk = c13424xk.m62461m9();
                abstractC13365c6 = c13424xk;
                break;
            case 7:
                C13396nv c13396nv = (C13396nv) c11040xk.m53438c5();
                objM62322kk = c13396nv.m62258ne();
                abstractC13365c6 = c13396nv;
                break;
            case 8:
                C13375g8 c13375g8 = (C13375g8) c11040xk.m53438c5();
                objM62322kk = c13375g8.m62102kk();
                abstractC13365c6 = c13375g8;
                break;
            case 9:
                C13362bv c13362bv = (C13362bv) c11040xk.m53438c5();
                objM62322kk = c13362bv.m62045kk();
                abstractC13365c6 = c13362bv;
                break;
            default:
                throw new ArgumentOutOfRangeException();
        }
        c9856du.m48647k4(iM53445m9, objM62322kk, abstractC13365c6);
    }
}
