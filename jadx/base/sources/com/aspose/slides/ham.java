package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ham {
    /* JADX INFO: renamed from: k4 */
    private static String m7086k4(int i, C0950eh c0950eh, InterfaceC1140gd interfaceC1140gd) {
        C6765kp c6765kp = new C6765kp();
        if (!interfaceC1140gd.mo6494k4()) {
            c6765kp.m26792k4(c0950eh.f4791x1.m64566kk());
        }
        c6765kp.m26792k4(m7088k4(c0950eh));
        if (c0950eh.f4790kk.getShowSlideNumber()) {
            c6765kp.m26792k4(c0950eh.f4791x1.m64568kk(C14057f9.m66591x1(i), 1));
            c6765kp.m26792k4(c0950eh.f4791x1.m64566kk());
            c6765kp.m26792k4(m7088k4(c0950eh));
        }
        String string = c6765kp.toString();
        interfaceC1140gd.mo6493k4(string);
        return string;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m7090x1(ISlide iSlide, C0950eh c0950eh, InterfaceC1140gd interfaceC1140gd) {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<IComment> it = iSlide.getPresentation().getCommentAuthors().iterator();
        while (it.hasNext()) {
            try {
                ICommentAuthor next = it.next();
                it = next.getComments().iterator();
                while (it.hasNext()) {
                    try {
                        IComment next2 = it.next();
                        if (next2.getSlide() == iSlide) {
                            ls9 ls9Var = c0950eh.f4791x1;
                            c6765kp.m26792k4(ls9Var.m64571to(ls9Var.m64555du(next.getName(), next2.getText())));
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        String string = c6765kp.toString();
        interfaceC1140gd.mo6493k4(string);
        return string;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7087k4(ISlide iSlide, C0950eh c0950eh, InterfaceC1140gd interfaceC1140gd) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(m7086k4(iSlide.getSlideNumber(), c0950eh, interfaceC1140gd));
        if (c0950eh.f4790kk.getExportType() != 1 && iSlide.getBackground() != null && iSlide.getBackground().getFillFormat() != null && iSlide.getBackground().getFillFormat().getFillType() == 4) {
            c6765kp.m26792k4(m7089k4(c0950eh, iSlide));
        }
        c6765kp.m26792k4(new cm5(c0950eh, iSlide.getShapes()).m4667k4(interfaceC1140gd));
        if (c0950eh.f4790kk.getShowComments()) {
            c6765kp.m26792k4(m7090x1(iSlide, c0950eh, interfaceC1140gd));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m7088k4(C0950eh c0950eh) {
        return c0950eh.f4791x1.m64571to("---");
    }

    /* JADX INFO: renamed from: k4 */
    private static String m7089k4(C0950eh c0950eh, ISlide iSlide) {
        return bls.m4261k4(iSlide.getBackground().getFillFormat().getPictureFillFormat().getPicture().getImage(), c0950eh.f4789k4, c0950eh.f4791x1);
    }
}
