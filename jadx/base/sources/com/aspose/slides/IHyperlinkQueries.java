package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;

/* JADX INFO: loaded from: classes3.dex */
public interface IHyperlinkQueries {
    IGenericList<IHyperlinkContainer> getAnyHyperlinks();

    IGenericList<IHyperlinkContainer> getHyperlinkClicks();

    IGenericList<IHyperlinkContainer> getHyperlinkMouseOvers();

    void removeAllHyperlinks();
}
