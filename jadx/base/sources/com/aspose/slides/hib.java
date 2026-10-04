package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class hib implements InterfaceC14691vk {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.InterfaceC14691vk
    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, byte[]> mo7187k4(IPresentation iPresentation, XamlOptions xamlOptions, List<String>[] listArr, InterruptionToken interruptionToken) {
        try {
            Dictionary<String, byte[]> dictionary = new Dictionary<>();
            List<String> list = new List<>();
            IGenericEnumerator<ISlide> it = iPresentation.getSlides().iterator();
            int i = 1;
            while (it.hasNext()) {
                try {
                    if (!it.next().getHidden() || xamlOptions.getExportHiddenSlides()) {
                        interruptionToken.throwIfInterruptionRequested();
                        String strM67402k4 = C14113y2.m67402k4(C14113y2.m67408k4(xamlOptions.m3109m9(), "_{0}.xaml"), Integer.valueOf(i));
                        KeyValuePair keyValuePairClone = m7185k4(xamlOptions.m3106kk(), C3141rv.m13411x1(strM67402k4), C14113y2.m67401k4(strM67402k4, ".xaml", ".xaml.cs")).Clone();
                        dictionary.addItem(C3141rv.m13412x1(C3141rv.m13412x1(xamlOptions.m3110rv(), xamlOptions.m3098h4()), (String) keyValuePairClone.getKey()), keyValuePairClone.getValue());
                        list.addItem(C3141rv.m13403k4(strM67402k4));
                        i++;
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            listArr[0] = list;
            return dictionary;
        } catch (ArgumentException e) {
            throw new yii(C14113y2.m67402k4("Error during save to cs files. Details: {0}", e.getMessage()), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m7185k4(String str, String str2, String str3) {
        return new KeyValuePair<>(str3, C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_Page_cs_Template.txt"), "{Namespace}", str), "{ClassName}", str2)));
    }

    /* JADX INFO: renamed from: k4 */
    private String m7186k4(int i, String str) {
        return C14113y2.m67408k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_MainPage_xaml_cs_Case_Template.txt"), "{CaseID}", C14057f9.m66591x1(i)), "{ClassName}", C14113y2.m67401k4(str, ".xaml", C14113y2.f47374k4)), "\n\t\t\t\t");
    }

    @Override // com.aspose.slides.InterfaceC14691vk
    /* JADX INFO: renamed from: k4 */
    public final String mo7188k4(List<String> list) {
        String strM67400k4 = C14113y2.f47374k4;
        for (int i = 0; i < list.size(); i++) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, m7186k4(i, list.get_Item(i)));
        }
        return strM67400k4;
    }
}
