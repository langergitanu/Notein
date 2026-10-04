package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class TabFactory implements ITabFactory {
    @Override // com.aspose.slides.ITabFactory
    public final ITab createTab(double d, int i) {
        return new Tab(d, i);
    }
}
