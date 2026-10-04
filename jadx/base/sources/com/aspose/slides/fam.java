package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes3.dex */
class fam {
    /* JADX INFO: renamed from: k4 */
    public static void m6071k4(ISlidesPicture iSlidesPicture, int i, int i2, int i3, ri7 ri7Var) {
        IPPImage iPPImageM6782k4;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10462h9M70140fa.mo50859du().m51263x1().m50923k4(i), C10609qn.class);
        if (c10609qn != null) {
            long jM51597ar = c10609qn.m51597ar();
            if ((jM51597ar & 4294901760L) == 4294901760L) {
                jM51597ar &= C18177fb.f54859s;
            }
            int i4 = (int) jM51597ar;
            SortedList<Integer, uki> sortedListM71939c5 = ri7Var.m70149up().m64712du().m71939c5();
            if (sortedListM71939c5.containsKey(Integer.valueOf(i4))) {
                iSlidesPicture.setImage(sortedListM71939c5.get_Item(Integer.valueOf(i4)).m71722kk());
                ((Picture) iSlidesPicture).m2241x1().m63575k4(true);
            }
        }
        C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) c10462h9M70140fa.mo50859du().m51263x1().m50923k4(i2), C10355ai.class);
        C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4((Object) c10462h9M70140fa.mo50859du().m51263x1().m50923k4(i3), C10609qn.class);
        if (c10355ai != null && c10609qn2 != null && ((c10609qn2.m51597ar() & 1) != 0 || (c10609qn2.m51597ar() & 2) != 0)) {
            char[] cArrM26671k4 = new C6773ss().m26671k4(c10355ai.mo50423x1());
            String strM67406k4 = (cArrM26671k4 == null || cArrM26671k4.length <= 0) ? null : cArrM26671k4[cArrM26671k4.length - 1] == 0 ? C14113y2.m67406k4(cArrM26671k4, 0, cArrM26671k4.length - 1) : C14113y2.m67405k4(cArrM26671k4);
            if (!C14113y2.m67411k4(strM67406k4)) {
                try {
                    C14062gk c14062gk = new C14062gk(strM67406k4);
                    ((Picture) iSlidesPicture).m2239k4(c14062gk.m66679dy() ? c14062gk.m66677ck() : c14062gk.m66697x1());
                } catch (RuntimeException e) {
                    if (!C3085sv.m13102kk(strM67406k4)) {
                        ((Picture) iSlidesPicture).m2239k4(strM67406k4);
                    }
                    C3085sv.m13082k4(e);
                }
                if (((Picture) iSlidesPicture).m2241x1().m63570du() && !C14113y2.m67411k4(iSlidesPicture.getLinkPathLong()) && (iPPImageM6782k4 = ri7Var.m70149up().m64712du().m3188ks().m6782k4(iSlidesPicture.getLinkPathLong())) != null && iPPImageM6782k4 != ((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1717k4()) {
                    iSlidesPicture.setImage(iPPImageM6782k4);
                }
            }
        }
        hyg.m7334k4(iSlidesPicture, ri7Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6072k4(ISlidesPicture iSlidesPicture, C10534m3 c10534m3, int i, int i2, int i3, y2n y2nVar) {
        C10609qn c10609qn;
        IPPImage iPPImageM1717k4;
        c10534m3.m51263x1().m50928kk(i);
        c10534m3.m51263x1().m50928kk(i2);
        c10534m3.m51263x1().m50928kk(i3);
        if (iSlidesPicture == null) {
            return;
        }
        if (!C14113y2.m67411k4(iSlidesPicture.getLinkPathLong())) {
            c10534m3.m51263x1().m50926k4(new C10355ai(i2, iSlidesPicture.getLinkPathLong()));
            c10534m3.m51263x1().m50926k4(new C10609qn(i3, ((iSlidesPicture.getImage() == null ? 4L : 0L) | 10) & 4294967295L));
            if (((Picture) iSlidesPicture).m2241x1().m63570du() && iSlidesPicture.getImage() != null) {
                c10609qn = new C10609qn(i, true, 0L);
            }
            hyg.m7333k4(iSlidesPicture.getImageTransform(), c10534m3, y2nVar);
        }
        if (iSlidesPicture.getImage() == null) {
            c10609qn = new C10609qn(i, true, 0L);
            c10534m3.m51263x1().m50926k4(c10609qn);
            iPPImageM1717k4 = ((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1717k4();
            y2nVar.m71949k4(c10609qn, iPPImageM1717k4);
            hyg.m7333k4(iSlidesPicture.getImageTransform(), c10534m3, y2nVar);
        }
        c10609qn = new C10609qn(i, true, 0L);
        c10534m3.m51263x1().m50926k4(c10609qn);
        iPPImageM1717k4 = iSlidesPicture.getImage();
        y2nVar.m71949k4(c10609qn, iPPImageM1717k4);
        hyg.m7333k4(iSlidesPicture.getImageTransform(), c10534m3, y2nVar);
    }
}
