package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IHyperlinkManager {
    void removeHyperlinkClick();

    void removeHyperlinkMouseOver();

    IHyperlink setExternalHyperlinkClick(String str);

    IHyperlink setExternalHyperlinkMouseOver(String str);

    IHyperlink setInternalHyperlinkClick(ISlide iSlide);

    IHyperlink setInternalHyperlinkMouseOver(ISlide iSlide);

    IHyperlink setMacroHyperlinkClick(String str);
}
