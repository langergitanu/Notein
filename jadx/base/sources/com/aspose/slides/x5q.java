package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x5q {
    /* JADX INFO: renamed from: k4 */
    public static int m73146k4(ISlideCollection iSlideCollection, IXamlOptions iXamlOptions) {
        if (iXamlOptions == null) {
            throw new yii(C14113y2.m67402k4("You should to set  in the '{0}' class a required parameter '{1}'!", "XamlOptions", "options"));
        }
        IGenericEnumerator<ISlide> it = iSlideCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                ISlide next = it.next();
                if (iXamlOptions.getExportHiddenSlides() || !next.getHidden()) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }
}
