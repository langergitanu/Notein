package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISectionCollection extends IGenericCollection<ISection> {
    ISection addEmptySection(String str, int i);

    ISection addSection(String str, ISlide iSlide);

    ISection appendEmptySection(String str);

    void clear();

    ISection get_Item(int i);

    int indexOf(ISection iSection);

    void removeSection(ISection iSection);

    void removeSectionWithSlides(ISection iSection);

    void reorderSectionWithSlides(ISection iSection, int i);
}
