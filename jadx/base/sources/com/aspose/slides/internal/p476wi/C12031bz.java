package com.aspose.slides.internal.p476wi;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p288n1.AbstractC6681k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p318oh.C7040ai;
import com.aspose.slides.internal.p318oh.C7041ak;
import com.aspose.slides.internal.p318oh.C7046c5;
import com.aspose.slides.internal.p318oh.C7055fa;
import com.aspose.slides.internal.p318oh.C7058h4;
import com.aspose.slides.internal.p318oh.C7065ks;
import com.aspose.slides.internal.p318oh.C7078t6;
import com.aspose.slides.internal.p318oh.C7080tq;
import com.aspose.slides.internal.p318oh.C7084up;
import com.aspose.slides.internal.p318oh.C7097yd;
import com.aspose.slides.internal.p318oh.C7098yj;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11001gi;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p522yc.C12805k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.AbstractC13405sv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wi.bz */
/* JADX INFO: loaded from: classes5.dex */
public class C12031bz extends AbstractC6681k4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f40615k4 = new C7017h4("{633C80A4-1843-482B-9EF2-BE2834C5FDD4}", "{D3A1DBE1-8EC4-4C17-9F4C-EA97AD1C343D}", "{537E597D-251E-48DA-9664-29CA496B70F8}", "{DD6A0022-58E4-4A67-9D9B-D48EB881A53D}", "{A7CE72A9-0F7F-40D7-B3CC-D0C02D5C3212}", "{718F2615-7933-40E3-A511-5F68FE14DD74}", "{8B2DD6C3-EB07-4D87-A5F0-7108E26A9C5F}", "{99C354EC-2A31-4F3A-8C34-17A803B33A25}", "{74D29D05-69A4-4266-9549-3CC52836B632}", "{63CBF3EE-C526-402C-8F71-62C540BF5142}", "{1077AF00-2848-4441-9489-44AD4C2D7A2C}");

    @Override // com.aspose.slides.internal.p288n1.AbstractC6681k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo26430k4(C10988bz[] c10988bzArr, AbstractC3150x6 abstractC3150x6) {
        AbstractC13373f9 abstractC13373f9M27579k4;
        C11001gi c11001gi = new C11001gi(c10988bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c11001gi.m53264k4(new C12805k4(c3134k4.m13384uz(), c3134k4.m13382u4(), c3134k4.m13382u4(), c3134k4.m13385wl()));
        c11001gi.m53263k4(c3134k4.m13384uz());
        c11001gi.m53266k4(c3134k4.m13372dy((int) c11001gi.m53270to()));
        C3134k4 c3134k42 = new C3134k4(new C3152yj(c11001gi.m53269m9()));
        try {
            switch (f40615k4.m27428k4(c11001gi.m53268kk().toString())) {
                case 0:
                    abstractC13373f9M27579k4 = new C7058h4().m27579k4(c3134k42);
                    break;
                case 1:
                    abstractC13373f9M27579k4 = new C7046c5().m27568k4(c3134k42);
                    break;
                case 2:
                    abstractC13373f9M27579k4 = new C7055fa().m27576k4(c3134k42);
                    break;
                case 3:
                    abstractC13373f9M27579k4 = new C7084up().m27605k4(c3134k42);
                    break;
                case 4:
                    abstractC13373f9M27579k4 = new C7098yj().m27619k4(c3134k42);
                    break;
                case 5:
                    abstractC13373f9M27579k4 = new C7065ks().m27586k4(c3134k42);
                    break;
                case 6:
                    abstractC13373f9M27579k4 = new C7097yd().m27618k4(c3134k42);
                    break;
                case 7:
                    abstractC13373f9M27579k4 = new C7041ak().m27563k4(c3134k42);
                    break;
                case 8:
                    abstractC13373f9M27579k4 = new C7078t6().m27599k4(c3134k42);
                    break;
                case 9:
                    abstractC13373f9M27579k4 = new C7080tq().m27601k4(c3134k42);
                    break;
                case 10:
                    abstractC13373f9M27579k4 = new C7040ai().m27562k4(c3134k42);
                    break;
                default:
                    throw new C12537k4(C14113y2.m67408k4("Unknown ObjectGuid: ", c11001gi.m53268kk().toString()));
            }
            c3134k42.dispose();
            c11001gi.m53265k4((AbstractC13405sv) abstractC13373f9M27579k4);
            c10988bzArr[0] = c11001gi;
            return true;
        } catch (Throwable th) {
            c3134k42.dispose();
            throw th;
        }
    }
}
