package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p271mc.C6360ck;
import com.aspose.slides.internal.p271mc.C6365jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p333p8.C9426h4;
import com.aspose.slides.internal.p333p8.C9433x1;
import com.aspose.slides.internal.p341po.C9469c5;
import com.aspose.slides.internal.p341po.C9475m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class nri {
    /* JADX INFO: renamed from: k4 */
    private static ISlide m68179k4(IPresentation iPresentation) {
        return iPresentation.getSlides().addEmptySlide(iPresentation.getLayoutSlides().getByType((byte) 11));
    }

    /* JADX INFO: renamed from: k4 */
    public static ISlide[] m68180k4(IPresentation iPresentation, C9433x1 c9433x1) {
        return m68181k4(iPresentation, c9433x1, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static ISlide[] m68181k4(IPresentation iPresentation, C9433x1 c9433x1, PdfImportOptions pdfImportOptions) {
        ISlideSize slideSize;
        float fM46142x1;
        float fM46139kk;
        List list = new List();
        int iM46197kk = c9433x1.m46197kk();
        if (iM46197kk > 0 && C7019kk.m27469x1(c9433x1.m46196k4().m46161k4().get_Item(0), C9426h4.class)) {
            C9426h4 c9426h4 = c9433x1.m46196k4().m46161k4().get_Item(0);
            if (scz.m70529k4(c9426h4.m46148du())) {
                slideSize = iPresentation.getSlideSize();
                fM46142x1 = c9426h4.m46152x1().m46139kk();
                fM46139kk = c9426h4.m46152x1().m46142x1();
            } else {
                slideSize = iPresentation.getSlideSize();
                fM46142x1 = c9426h4.m46152x1().m46142x1();
                fM46139kk = c9426h4.m46152x1().m46139kk();
            }
            slideSize.setSize(fM46142x1, fM46139kk, 0);
        }
        C9475m9 c9475m9 = new C9475m9();
        for (int i = 0; i < iM46197kk; i++) {
            C9469c5 c9469c5M46651k4 = c9475m9.m46651k4(c9433x1.m46196k4().m46161k4().get_Item(i));
            ISlide iSlideM68179k4 = m68179k4(iPresentation);
            if (pdfImportOptions != null && pdfImportOptions.getDetectTables()) {
                IGenericList<e0e> iGenericListM64916k4 = mjh.m64916k4(c9469c5M46651k4.m46546kk(), c9469c5M46651k4.m46548x1());
                if (iGenericListM64916k4.size() > 0) {
                    scz.m70520k4(iSlideM68179k4, iGenericListM64916k4);
                    IGenericEnumerator<e0e> it = iGenericListM64916k4.iterator();
                    while (it.hasNext()) {
                        try {
                            e0e next = it.next();
                            IGenericEnumerator<C6365jd> it2 = next.m5327kk().iterator();
                            while (it2.hasNext()) {
                                try {
                                    c9469c5M46651k4.m46546kk().removeItem(it2.next());
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        it2.dispose();
                                    }
                                    throw th;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            IGenericEnumerator<C6360ck> it3 = next.m5328to().iterator();
                            while (it3.hasNext()) {
                                try {
                                    c9469c5M46651k4.m46546kk().removeItem(it3.next());
                                } finally {
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                            it2 = next.m5322du().getValues().iterator();
                            while (it2.hasNext()) {
                                try {
                                    c9469c5M46651k4.m46548x1().removeItem(it2.next());
                                } finally {
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < c9469c5M46651k4.m46544k4().size() + c9469c5M46651k4.m46546kk().size(); i4++) {
                if (i2 < c9469c5M46651k4.m46544k4().size() && c9469c5M46651k4.m46544k4().get_Item(i2).m26166h4() == i4) {
                    scz.m70523k4(iSlideM68179k4, c9469c5M46651k4.m46544k4().get_Item(i2), c9433x1.m46196k4().m46161k4().get_Item(i).m46148du(), c9433x1.m46196k4().m46161k4().get_Item(i).m46152x1());
                    i2++;
                } else if (i3 < c9469c5M46651k4.m46546kk().size() && c9469c5M46651k4.m46546kk().get_Item(i3).m26097ks() == i4) {
                    scz.m70521k4(iSlideM68179k4, c9469c5M46651k4.m46546kk().get_Item(i3), c9433x1.m46196k4().m46161k4().get_Item(i).m46148du(), c9433x1.m46196k4().m46161k4().get_Item(i).m46152x1());
                    i3++;
                }
            }
            List.Enumerator<C6365jd> it4 = c9469c5M46651k4.m46548x1().iterator();
            while (it4.hasNext()) {
                try {
                    scz.m70522k4(iSlideM68179k4, it4.next(), c9433x1.m46196k4().m46161k4().get_Item(i).m46148du(), c9433x1.m46196k4().m46161k4().get_Item(i).m46152x1());
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                it4.dispose();
            }
            list.addItem(iSlideM68179k4);
        }
        return (ISlide[]) list.toArray(new ISlide[0]);
    }
}
