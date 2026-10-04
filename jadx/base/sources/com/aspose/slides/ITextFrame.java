package com.aspose.slides;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public interface ITextFrame extends ISlideComponent {
    IHyperlinkQueries getHyperlinkQueries();

    IParagraphCollection getParagraphs();

    String getText();

    ITextFrameFormat getTextFrameFormat();

    @Deprecated
    void highlightRegex(String str, Integer num, ITextHighlightingOptions iTextHighlightingOptions);

    void highlightRegex(Pattern pattern, Integer num, IFindResultCallback iFindResultCallback);

    void highlightText(String str, Integer num);

    @Deprecated
    void highlightText(String str, Integer num, ITextHighlightingOptions iTextHighlightingOptions);

    void highlightText(String str, Integer num, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback);

    void joinPortionsWithSameFormatting();

    void replaceRegex(Pattern pattern, String str, IFindResultCallback iFindResultCallback);

    void replaceText(String str, String str2, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback);

    void setText(String str);
}
