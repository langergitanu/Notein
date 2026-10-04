package com.aspose.slides;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface ISection {
    String getName();

    UUID getSectionId();

    ISectionSlideCollection getSlidesListOfSection();

    ISlide getStartedFromSlide();

    void setName(String str);
}
