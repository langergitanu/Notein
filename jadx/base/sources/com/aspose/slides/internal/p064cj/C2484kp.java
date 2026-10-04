package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p049bx.C1894x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4240kk;
import com.aspose.slides.internal.p147ga.C4244rv;
import com.aspose.slides.internal.p147ga.C4245to;
import com.aspose.slides.internal.p260ly.C6270du;
import com.aspose.slides.internal.p260ly.C6273h4;
import com.aspose.slides.internal.p260ly.C6281qq;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9721vj;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.kp */
/* JADX INFO: loaded from: classes3.dex */
public class C2484kp extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9721vj c9721vj = (C9721vj) c9723vw;
        new C1894x6().m9814k4(c3149x1, c9721vj.m47748k4());
        c3149x1.m13447k4(c9721vj.m47756x1() & 4294967295L);
        c3149x1.m13447k4(c9721vj.m47753kk() & 4294967295L);
        c3149x1.m13447k4(c9721vj.m47755to() & 4294967295L);
        int i = 0;
        for (C6281qq c6281qq : c9721vj.m47747h4().m47619k4()) {
            new C4244rv().m17073k4(c3149x1, c6281qq);
        }
        if (c9721vj.m47755to() == 0 || c9721vj.m47755to() == 1) {
            C6270du[] c6270duArrM47622x1 = c9721vj.m47747h4().m47622x1();
            int length = c6270duArrM47622x1.length;
            while (i < length) {
                new C4240kk().m17069k4(c3149x1, c6270duArrM47622x1[i]);
                i++;
            }
            c3149x1.m13450k4(c9721vj.m47747h4().m47621to());
            return true;
        }
        if (c9721vj.m47755to() != 2) {
            return true;
        }
        C6273h4[] c6273h4ArrM47620kk = c9721vj.m47747h4().m47620kk();
        int length2 = c6273h4ArrM47620kk.length;
        while (i < length2) {
            new C4245to().m17074k4(c3149x1, c6273h4ArrM47620kk[i]);
            i++;
        }
        return true;
    }
}
