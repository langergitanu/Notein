package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4655sv;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6058gi;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p312o9.C6976k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p403so.C10246ai;
import com.aspose.slides.internal.p403so.C10247ak;
import com.aspose.slides.internal.p403so.C10252c5;
import com.aspose.slides.internal.p403so.C10261fa;
import com.aspose.slides.internal.p403so.C10264h4;
import com.aspose.slides.internal.p403so.C10271ks;
import com.aspose.slides.internal.p403so.C10284t6;
import com.aspose.slides.internal.p403so.C10286tq;
import com.aspose.slides.internal.p403so.C10290up;
import com.aspose.slides.internal.p403so.C10303yd;
import com.aspose.slides.internal.p403so.C10304yj;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C10058bz extends AbstractC13453k4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f36245k4 = new C7017h4("{633C80A4-1843-482B-9EF2-BE2834C5FDD4}", "{D3A1DBE1-8EC4-4C17-9F4C-EA97AD1C343D}", "{537E597D-251E-48DA-9664-29CA496B70F8}", "{DD6A0022-58E4-4A67-9D9B-D48EB881A53D}", "{A7CE72A9-0F7F-40D7-B3CC-D0C02D5C3212}", "{718F2615-7933-40E3-A511-5F68FE14DD74}", "{8B2DD6C3-EB07-4D87-A5F0-7108E26A9C5F}", "{99C354EC-2A31-4F3A-8C34-17A803B33A25}", "{74D29D05-69A4-4266-9549-3CC52836B632}", "{63CBF3EE-C526-402C-8F71-62C540BF5142}", "{1077AF00-2848-4441-9489-44AD4C2D7A2C}");

    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        AbstractC4623f9 abstractC4623f9M50218k4;
        C6058gi c6058gi = new C6058gi(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c6058gi.m24507k4(new C6976k4(c3134k4.m13384uz(), c3134k4.m13382u4(), c3134k4.m13382u4(), c3134k4.m13385wl()));
        c6058gi.m24505k4(c3134k4.m13384uz());
        c6058gi.m24508k4(c3134k4.m13372dy((int) c6058gi.m24511to()));
        C3134k4 c3134k42 = new C3134k4(new C3152yj(c6058gi.m24504dy()));
        try {
            switch (f36245k4.m27428k4(c6058gi.m24510kk().toString())) {
                case 0:
                    abstractC4623f9M50218k4 = new C10264h4().m50218k4(c3134k42);
                    break;
                case 1:
                    abstractC4623f9M50218k4 = new C10252c5().m50207k4(c3134k42);
                    break;
                case 2:
                    abstractC4623f9M50218k4 = new C10261fa().m50215k4(c3134k42);
                    break;
                case 3:
                    abstractC4623f9M50218k4 = new C10290up().m50244k4(c3134k42);
                    break;
                case 4:
                    abstractC4623f9M50218k4 = new C10304yj().m50258k4(c3134k42);
                    break;
                case 5:
                    abstractC4623f9M50218k4 = new C10271ks().m50225k4(c3134k42);
                    break;
                case 6:
                    abstractC4623f9M50218k4 = new C10303yd().m50257k4(c3134k42);
                    break;
                case 7:
                    abstractC4623f9M50218k4 = new C10247ak().m50202k4(c3134k42);
                    break;
                case 8:
                    abstractC4623f9M50218k4 = new C10284t6().m50238k4(c3134k42);
                    break;
                case 9:
                    abstractC4623f9M50218k4 = new C10286tq().m50240k4(c3134k42);
                    break;
                case 10:
                    abstractC4623f9M50218k4 = new C10246ai().m50201k4(c3134k42);
                    break;
                default:
                    throw new C6490k4(C14113y2.m67408k4("Unknown ObjectGuid: ", c6058gi.m24510kk().toString()));
            }
            c3134k42.dispose();
            c6058gi.m24506k4((AbstractC4655sv) abstractC4623f9M50218k4);
            c6045bzArr[0] = c6058gi;
            return true;
        } catch (Throwable th) {
            c3134k42.dispose();
            throw th;
        }
    }
}
