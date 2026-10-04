package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBaseSlide extends IThemeable {
    boolean equals(IBaseSlide iBaseSlide);

    IShape findShapeByAltText(String str);

    IBackground getBackground();

    IControlCollection getControls();

    ICustomData getCustomData();

    IHyperlinkQueries getHyperlinkQueries();

    String getName();

    IShapeCollection getShapes();

    boolean getShowMasterShapes();

    long getSlideId();

    ISlideShowTransition getSlideShowTransition();

    IAnimationTimeLine getTimeline();

    void joinPortionsWithSameFormatting();

    void setName(String str);

    void setShowMasterShapes(boolean z);
}
