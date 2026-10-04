package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p046bs.C1848k4;
import com.aspose.slides.internal.p182ii.C4913ks;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.er */
/* JADX INFO: loaded from: classes3.dex */
class C0961er {
    /* JADX INFO: renamed from: k4 */
    private static List<ISlide> m5618k4(Presentation presentation, String str) {
        int iM67378k4;
        List<ISlide> list = new List<>();
        int iM67364dy = C14113y2.m67364dy(str, "<svg");
        if (iM67364dy > -1 && (iM67378k4 = C14113y2.m67378k4(str, "/svg>", iM67364dy + 4)) > -1) {
            no7 no7Var = new no7();
            no7Var.m68144k4(true);
            do {
                String strM67443x1 = C14113y2.m67443x1(str, iM67364dy, (iM67378k4 - iM67364dy) + 5);
                ISlide iSlideAddEmptySlide = presentation.getSlides().addEmptySlide(presentation.getLayoutSlides().get_Item(0));
                no7Var.m68143k4(iSlideAddEmptySlide.getShapes().getParentGroup(), strM67443x1, C12007ix.m56544k4(C12014ne.f40546k4).Clone());
                list.addItem(iSlideAddEmptySlide);
                iM67364dy = C14113y2.m67378k4(str, "<svg", iM67378k4);
                iM67378k4 = C14113y2.m67378k4(str, "/svg>", iM67364dy + 4);
                if (iM67364dy <= -1) {
                    break;
                }
            } while (iM67378k4 > iM67364dy);
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static ISlide[] m5619k4(Presentation presentation, int i, C13845mp c13845mp, String str, String str2) {
        ISlide[] array;
        List<ISlide> listM5618k4 = m5618k4(presentation, str);
        if (listM5618k4.size() > 0) {
            array = listM5618k4.toArray(new ISlide[0]);
        } else {
            C1848k4 c1848k4 = new C1848k4();
            c1848k4.m9641k4(str2);
            C4913ks c4913ks = (C4913ks) C7019kk.m27452k4((Object) new C5546kk(new rsv(c13845mp), c1848k4, null).m22751k4(str), C4913ks.class);
            C0860cm c0860cm = new C0860cm(presentation, c13845mp, str2);
            c0860cm.m4649k4((Slide) presentation.getSlides().insertEmptySlide(i, c0860cm.m4657kk()));
            c0860cm.m4660x1().addItem(c0860cm.m4648k4());
            c4913ks.m20433k4(c0860cm);
            array = c0860cm.m4660x1().toArray(new Slide[0]);
        }
        return array;
    }
}
