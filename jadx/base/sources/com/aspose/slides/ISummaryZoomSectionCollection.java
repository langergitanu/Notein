package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISummaryZoomSectionCollection extends IGenericCollection<ISummaryZoomSection> {
    ISummaryZoomSection addSummaryZoomSection(ISection iSection);

    void clear();

    ISummaryZoomSection getSummarySection(ISection iSection);

    ISummaryZoomSection get_Item(int i);

    int indexOf(ISummaryZoomSection iSummaryZoomSection);

    void removeSummaryZoomSection(ISection iSection);
}
