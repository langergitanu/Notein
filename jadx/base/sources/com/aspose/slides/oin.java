package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class oin implements iln {

    /* JADX INFO: renamed from: k4 */
    private ven f47812k4;

    public oin(ven venVar) {
        if (venVar == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinFormsXaml", "shapeParser"));
        }
        this.f47812k4 = venVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.iln
    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, byte[]> mo7670k4(IPresentation iPresentation, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        if (iPresentation.getSlides().size() == 0) {
            return new Dictionary<>();
        }
        xamlOptions.m3115x1(0);
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        List list = new List();
        try {
            IGenericEnumerator<ISlide> it = iPresentation.getSlides().iterator();
            int i = 1;
            while (it.hasNext()) {
                try {
                    ISlide next = it.next();
                    if (!next.getHidden() || xamlOptions.getExportHiddenSlides()) {
                        interruptionToken.throwIfInterruptionRequested();
                        String strM67402k4 = C14113y2.m67402k4(C14113y2.m67408k4(xamlOptions.m3109m9(), "_{0}.xaml"), Integer.valueOf(i));
                        String strM13412x1 = xamlOptions.m3111to() != 1 ? C3141rv.m13412x1(C3141rv.m13412x1(C3141rv.m13412x1(xamlOptions.m3094du(), xamlOptions.m3098h4()), xamlOptions.m3098h4()), strM67402k4) : strM67402k4;
                        list.addItem(m68579k4(xamlOptions, C3141rv.m13411x1(strM67402k4)));
                        list.addItem(C14113y2.m67402k4("<AbsoluteLayout{0}>", C14113y2.f47374k4));
                        list.addRange(this.f47812k4.mo67761k4(next.getLayoutSlide(), xamlOptions));
                        IGenericEnumerator<IShape> it2 = next.getShapes().iterator();
                        while (it2.hasNext()) {
                            try {
                                IShape next2 = it2.next();
                                Dictionary<String, byte[]>[] dictionaryArr = {new Dictionary()};
                                List<String> listMo67762k4 = this.f47812k4.mo67762k4(next2, xamlOptions, dictionaryArr);
                                Dictionary<String, byte[]> dictionary2 = dictionaryArr[0];
                                list.addRange(listMo67762k4);
                                C14318pw.m69319k4(dictionary2, dictionary);
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                        }
                        list.addItem("</AbsoluteLayout>");
                        list.addItem("</ContentPage>");
                        String strM67400k4 = C14113y2.f47374k4;
                        List.Enumerator it3 = list.iterator();
                        while (it3.hasNext()) {
                            try {
                                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4((String) it3.next(), C14052dq.m66570kk()));
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                            }
                        }
                        dictionary.addItem(strM13412x1, C14817xt.m73604k4(strM67400k4));
                        i++;
                        list.clear();
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return dictionary;
            }
            it.dispose();
            return dictionary;
        } catch (ArgumentException e) {
            throw new yii(C14113y2.m67402k4("Error during save to xaml files. Details: {0}", e.getMessage()), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m68579k4(XamlOptions xamlOptions, String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/Xaml_ContentPageOpenTag_Template.txt"), "{Namespace}", !C14113y2.m67411k4(xamlOptions.m3106kk()) ? xamlOptions.m3106kk() : "Xaml"), "{ClassName}", str), "{DevTags}", xamlOptions.m3105k4() ? C0749ah.m3576x1("xamarinforms/templates/Xaml_ContentPageDevAttributes_Template.txt") : C14113y2.f47374k4);
    }
}
