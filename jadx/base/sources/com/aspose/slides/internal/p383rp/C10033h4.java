package com.aspose.slides.internal.p383rp;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p448ur.C11550kk;
import com.aspose.slides.internal.p483ws.C12282ck;
import com.aspose.slides.internal.p483ws.C12285fa;
import com.aspose.slides.internal.p540z5.C13432du;
import com.aspose.slides.internal.p540z5.C13433dy;
import com.aspose.slides.internal.p540z5.C13434h4;
import com.aspose.slides.internal.p540z5.C13436kk;
import com.aspose.slides.internal.p540z5.C13437m9;
import com.aspose.slides.internal.p540z5.C13438to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.h4 */
/* JADX INFO: loaded from: classes4.dex */
class C10033h4 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC10036kk m49308k4(C6740x1 c6740x1, int i, int i2) {
        int iM26560du = c6740x1.m26560du();
        if (iM26560du == 1) {
            return new C13433dy(c6740x1, i, i2);
        }
        if (iM26560du == 2 || iM26560du == 3 || iM26560du == 4) {
            return new C13436kk(c6740x1, i, i2);
        }
        if (iM26560du == 5) {
            C13434h4 c13434h4 = new C13434h4(c6740x1, i, i2);
            c13434h4.m62517kk(c6740x1.m26567ix());
            c13434h4.m62515du(C7019kk.m27462to(Integer.valueOf(c6740x1.m26589up()), 8));
            c13434h4.m62516k4(C7019kk.m27462to(Integer.valueOf(c6740x1.m26586to()[0]), 8));
            c13434h4.m62518to(C7019kk.m27462to(Integer.valueOf(c6740x1.m26589up()), 8) * i);
            c13434h4.m62519x1(8);
            return c13434h4;
        }
        if (iM26560du == 7) {
            c6740x1.m26570k4(C7019kk.m27435du(Integer.valueOf(i2), 9));
            C12282ck c12282ck = new C12282ck(530);
            c12282ck.m57544k4(new short[]{2, 2});
            C12285fa c12285fa = new C12285fa(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1);
            c12285fa.m57545k4(new int[]{1});
            c6740x1.m26572k4(c12282ck);
            c6740x1.m26572k4(c12285fa);
            return new C13432du(c6740x1, i, i2);
        }
        if (iM26560du != 8) {
            if (iM26560du == 32773) {
                return new C13437m9(c6740x1, i, i2);
            }
            if (iM26560du != 32946) {
                throw new ArgumentOutOfRangeException(C14113y2.m67408k4("codec not supported - Codec #", AbstractC14106wy.getName((Class<?>) C11550kk.class, c6740x1.m26560du())));
            }
        }
        C13438to c13438to = new C13438to(c6740x1, i, i2, true);
        c13438to.m62532kk(c6740x1.m26589up());
        c13438to.m62531k4(c6740x1.m26586to()[0]);
        c13438to.m62533x1(c6740x1.m26589up() * i);
        return c13438to;
    }
}
