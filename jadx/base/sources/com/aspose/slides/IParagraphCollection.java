package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IParagraphCollection extends IGenericEnumerable<IParagraph>, ISlideComponent {
    int add(IParagraphCollection iParagraphCollection);

    void add(IParagraph iParagraph);

    void addFromHtml(String str);

    void addFromHtml(String str, IExternalResourceResolver iExternalResourceResolver, String str2);

    void clear();

    String exportToHtml(int i, int i2, ITextToHtmlConversionOptions iTextToHtmlConversionOptions);

    int getCount();

    IParagraph get_Item(int i);

    void insert(int i, IParagraph iParagraph);

    void insert(int i, IParagraphCollection iParagraphCollection);

    boolean remove(IParagraph iParagraph);

    void removeAt(int i);
}
