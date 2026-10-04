package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Compress {
    public static void compressEmbeddedFonts(Presentation presentation) {
        List list = new List();
        IGenericEnumerator<KeyValuePair<String, C1141ge>> it = presentation.m2385ks().m7122k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, C1141ge> next = it.next();
                if (!next.getValue().m6501dy()) {
                    list.addItem(next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (list.size() == 0) {
            return;
        }
        IFontsManager fontsManager = presentation.getFontsManager();
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                IFontData iFontData = (IFontData) it2.next();
                fontsManager.removeEmbeddedFont(iFontData);
                fontsManager.addEmbeddedFont(iFontData, 0);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    public static void removeUnusedLayoutSlides(Presentation presentation) {
        for (int size = presentation.getLayoutSlides().size() - 1; size >= 0; size--) {
            if (!presentation.getLayoutSlides().get_Item(size).hasDependingSlides()) {
                presentation.getLayoutSlides().get_Item(size).remove();
            }
        }
    }

    public static void removeUnusedMasterSlides(Presentation presentation) {
        for (int size = presentation.getMasters().size() - 1; size >= 0; size--) {
            if (!presentation.getMasters().get_Item(size).hasDependingSlides()) {
                presentation.getMasters().removeAt(size);
            }
        }
    }
}
