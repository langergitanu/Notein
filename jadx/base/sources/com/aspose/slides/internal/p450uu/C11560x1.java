package com.aspose.slides.internal.p450uu;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.internal.p383rp.C10030ck;
import com.aspose.slides.internal.p483ws.C12285fa;
import com.aspose.slides.internal.p483ws.C12286h4;
import com.aspose.slides.internal.p483ws.C12290m9;
import com.aspose.slides.internal.p483ws.C12292up;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.uu.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11560x1 extends C11557k4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13613um f39071k4;

    /* JADX INFO: renamed from: k4 */
    public void m54563k4(int i) {
        m54551k4(StyleIdentifier.GRID_TABLE_3_ACCENT_3, i, -1);
    }

    /* JADX INFO: renamed from: to */
    public byte[] m54566to() {
        C6304x1 c6304x1 = new C6304x1(new C3152yj());
        List<AbstractC10031du> list = new List<>(AbstractC14092to.m67204k4((Object[]) m54543k4()));
        List<AbstractC10031du> list2 = new List<>(AbstractC14092to.m67204k4((Object[]) m54547x1()));
        AbstractC10031du[] abstractC10031duArrM54545kk = m54545kk();
        m54562k4(list, list2);
        C10030ck c10030ck = new C10030ck(list.toArray(new AbstractC10031du[0]), list2.toArray(new AbstractC10031du[0]), abstractC10031duArrM54545kk);
        C10030ck.m49274k4(c6304x1);
        c10030ck.m49279k4(c6304x1, C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c10030ck.m49281x1()), 10) + C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c6304x1.m62853k4()), 11)), 10)), 10), this.f39071k4 == null);
        if (this.f39071k4 != null) {
            C12285fa c12285fa = new C12285fa(StyleIdentifier.COLORFUL_GRID_ACCENT_6);
            c12285fa.m57545k4(new int[]{6});
            C12290m9 c12290m9 = new C12290m9(StyleIdentifier.GRID_TABLE_3_ACCENT_1);
            c12290m9.m57553k4(new C10029c5[]{new C10029c5(72L, 1L)});
            C12290m9 c12290m92 = new C12290m9(StyleIdentifier.GRID_TABLE_4_ACCENT_1);
            c12290m92.m57553k4(new C10029c5[]{new C10029c5(72L, 1L)});
            C12285fa c12285fa2 = new C12285fa(StyleIdentifier.GRID_TABLE_3_ACCENT_3);
            c12285fa2.m57545k4(new int[]{2});
            C12286h4 c12286h4 = new C12286h4(InputDeviceCompat.SOURCE_DPAD);
            c12286h4.m57547k4(new long[]{0});
            C12286h4 c12286h42 = new C12286h4(514);
            c12286h42.m57547k4(new long[]{0});
            C10030ck c10030ck2 = new C10030ck(new AbstractC10031du[]{c12285fa, c12290m9, c12290m92, c12285fa2, c12286h4, c12286h42}, null, null);
            long jM49281x1 = c10030ck2.m49281x1();
            long jM27435du = C7019kk.m27435du(Long.valueOf(c6304x1.m62853k4()), 11);
            long jM27435du2 = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM49281x1), 10) + C7019kk.m27435du(Long.valueOf(jM27435du), 10)), 10);
            long jM27435du3 = 4 - C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du2), 10) % 4), 10);
            if (C7019kk.m27435du(Long.valueOf(jM27435du3), 10) != 4) {
                jM27435du2 = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du3), 10) + C7019kk.m27435du(Long.valueOf(jM27435du2), 10)), 10);
            }
            c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(jM27435du2), 10), 0);
            this.f39071k4.m62728k4(C13618wy.m62845k4(c6304x1));
            long jM27435du4 = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c6304x1.m62853k4()), 11)), 10) - C7019kk.m27435du(Long.valueOf(jM27435du2), 10)), 10);
            c12286h4.m57547k4(new long[]{jM27435du2});
            c12286h42.m57547k4(new long[]{jM27435du4});
            long jM27435du5 = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du4), 10) + C7019kk.m27435du(Long.valueOf(jM27435du2), 10)), 10);
            c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(jM27435du), 10), 0);
            c10030ck2.m49279k4(c6304x1, jM27435du5, true);
        }
        return c6304x1.m62849dy();
    }

    /* JADX INFO: renamed from: x1 */
    public void m54567x1(C10029c5 c10029c5) {
        m54552k4(StyleIdentifier.GRID_TABLE_4_ACCENT_1, c10029c5, -1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54562k4(List<AbstractC10031du> list, List<AbstractC10031du> list2) {
        if (!m54555x1(StyleIdentifier.GRID_TABLE_3_ACCENT_1)) {
            C12290m9 c12290m9 = new C12290m9(StyleIdentifier.GRID_TABLE_3_ACCENT_1);
            c12290m9.m57553k4(new C10029c5[]{new C10029c5(96L)});
            list.addItem(c12290m9);
        }
        if (!m54555x1(StyleIdentifier.GRID_TABLE_4_ACCENT_1)) {
            C12290m9 c12290m92 = new C12290m9(StyleIdentifier.GRID_TABLE_4_ACCENT_1);
            c12290m92.m57553k4(new C10029c5[]{new C10029c5(96L)});
            list.addItem(c12290m92);
        }
        if (!m54555x1(StyleIdentifier.GRID_TABLE_3_ACCENT_3)) {
            C12285fa c12285fa = new C12285fa(StyleIdentifier.GRID_TABLE_3_ACCENT_3);
            c12285fa.m57545k4(new int[]{2});
            list.addItem(c12285fa);
        }
        if (!m54555x1(531)) {
            C12285fa c12285fa2 = new C12285fa(531);
            c12285fa2.m57545k4(new int[]{1});
            list.addItem(c12285fa2);
        }
        if (!m54555x1(36864)) {
            C12292up c12292up = new C12292up(36864);
            c12292up.m57556k4(new byte[]{0, 2, 3, 0});
            list2.addItem(c12292up);
        }
        if (!m54555x1(37121)) {
            C12292up c12292up2 = new C12292up(37121);
            c12292up2.m57556k4(new byte[]{1, 2, 3, 0});
            list2.addItem(c12292up2);
        }
        if (m54555x1(40961)) {
            return;
        }
        C12285fa c12285fa3 = new C12285fa(40961);
        c12285fa3.m57545k4(new int[]{1});
        list2.addItem(c12285fa3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m54564k4(C10029c5 c10029c5) {
        m54552k4(StyleIdentifier.GRID_TABLE_3_ACCENT_1, c10029c5, -1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m54565k4(AbstractC13613um abstractC13613um) {
        this.f39071k4 = abstractC13613um;
    }
}
