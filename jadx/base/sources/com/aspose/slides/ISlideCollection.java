package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface ISlideCollection extends IGenericCollection<ISlide> {
    ISlide addClone(ISlide iSlide);

    ISlide addClone(ISlide iSlide, ILayoutSlide iLayoutSlide);

    ISlide addClone(ISlide iSlide, IMasterSlide iMasterSlide, boolean z);

    ISlide addClone(ISlide iSlide, ISection iSection);

    ISlide addEmptySlide(ILayoutSlide iLayoutSlide);

    ISlide[] addFromHtml(InputStream inputStream);

    ISlide[] addFromHtml(InputStream inputStream, IExternalResourceResolver iExternalResourceResolver, String str);

    ISlide[] addFromHtml(String str);

    ISlide[] addFromHtml(String str, IExternalResourceResolver iExternalResourceResolver, String str2);

    ISlide[] addFromPdf(InputStream inputStream);

    ISlide[] addFromPdf(InputStream inputStream, PdfImportOptions pdfImportOptions);

    ISlide[] addFromPdf(String str);

    ISlide[] addFromPdf(String str, PdfImportOptions pdfImportOptions);

    ISlide get_Item(int i);

    int indexOf(ISlide iSlide);

    ISlide insertClone(int i, ISlide iSlide);

    ISlide insertClone(int i, ISlide iSlide, ILayoutSlide iLayoutSlide);

    ISlide insertClone(int i, ISlide iSlide, IMasterSlide iMasterSlide, boolean z);

    ISlide insertEmptySlide(int i, ILayoutSlide iLayoutSlide);

    ISlide[] insertFromHtml(int i, InputStream inputStream);

    ISlide[] insertFromHtml(int i, InputStream inputStream, IExternalResourceResolver iExternalResourceResolver, String str);

    ISlide[] insertFromHtml(int i, String str);

    ISlide[] insertFromHtml(int i, String str, IExternalResourceResolver iExternalResourceResolver, String str2);

    void remove(ISlide iSlide);

    void removeAt(int i);

    void reorder(int i, ISlide iSlide);

    void reorder(int i, ISlide... iSlideArr);

    ISlide[] toArray();

    ISlide[] toArray(int i, int i2);
}
