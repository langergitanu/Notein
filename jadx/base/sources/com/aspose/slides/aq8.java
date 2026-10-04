package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class aq8 {
    /* JADX INFO: renamed from: k4 */
    private static List<Integer> m3708k4(int[] iArr) {
        List<Integer> list = new List<>();
        List list2 = new List();
        for (int i : iArr) {
            if (!list.containsItem(Integer.valueOf(i))) {
                boolean zContainsItem = list2.containsItem(Integer.valueOf(i));
                Integer numValueOf = Integer.valueOf(i);
                if (zContainsItem) {
                    list.addItem(numValueOf);
                } else {
                    list2.addItem(numValueOf);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3709k4(IPresentation iPresentation, C0950eh c0950eh, InterfaceC1140gd interfaceC1140gd) {
        IGenericEnumerator<ISlide> it = iPresentation.getSlides().iterator();
        while (it.hasNext()) {
            try {
                ISlide next = it.next();
                if (!m3714k4(next, c0950eh)) {
                    ham.m7087k4(next, c0950eh, interfaceC1140gd);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3710k4(IPresentation iPresentation, C0950eh c0950eh, InterfaceC1140gd interfaceC1140gd, int[] iArr) {
        Dictionary dictionary = new Dictionary();
        List<Integer> listM3708k4 = m3708k4(iArr);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 > iPresentation.getSlides().size() || i2 < 1) {
                throw new ArgumentOutOfRangeException("slides", C14113y2.m67402k4("'slides' array contains {0} slide position, which is not present in the presentation.", Integer.valueOf(i2)));
            }
            if (dictionary.containsKey(Integer.valueOf(i2))) {
                interfaceC1140gd.mo6493k4((String) dictionary.get_Item(Integer.valueOf(i2)));
            } else {
                String strM7087k4 = ham.m7087k4(iPresentation.getSlides().get_Item(i2 - 1), c0950eh, interfaceC1140gd);
                if (listM3708k4.containsItem(Integer.valueOf(iArr[i]))) {
                    dictionary.addItem(Integer.valueOf(i2), strM7087k4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3711k4(MarkdownSaveOptions markdownSaveOptions) {
        if (markdownSaveOptions.getExportType() != 1) {
            throw new InvalidOperationException("Stream does not support visual elements, please use 'FileOutputStream'.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3712k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, MarkdownSaveOptions markdownSaveOptions) {
        ks6 ks6Var;
        m3713k4(abstractC3150x6);
        yh6 yh6Var = new yh6(abstractC3150x6);
        AbstractC3150x6 abstractC3150x62 = (AbstractC3150x6) C7019kk.m27452k4((Object) abstractC3150x6, C3152yj.class);
        if (abstractC3150x62 == null) {
            abstractC3150x62 = (AbstractC3150x6) C7019kk.m27452k4((Object) abstractC3150x6, C3130fa.class);
        }
        if (abstractC3150x62 == null) {
            m3711k4(markdownSaveOptions);
            ks6Var = null;
        } else if (markdownSaveOptions == null) {
            ks6Var = new ks6(C3142to.m13417k4());
        } else {
            if (!C3142to.m13421kk(markdownSaveOptions.getBasePath())) {
                throw new InvalidOperationException(C14113y2.m67402k4("Specified BasePath does not exist: {0}", markdownSaveOptions.getBasePath()));
            }
            ks6Var = new ks6(markdownSaveOptions.getBasePath(), markdownSaveOptions.getImagesSaveFolderName());
        }
        C0950eh c0950eh = new C0950eh(markdownSaveOptions, ks6Var);
        if (iArr == null) {
            m3709k4(presentation, c0950eh, yh6Var);
        } else {
            m3710k4(presentation, c0950eh, yh6Var, iArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3713k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentException("Value can't be null.", "stream");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3714k4(ISlide iSlide, C0950eh c0950eh) {
        return iSlide.getHidden() && !c0950eh.f4790kk.getShowHiddenSlides();
    }
}
