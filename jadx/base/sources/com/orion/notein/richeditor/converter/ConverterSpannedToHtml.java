package com.orion.notein.richeditor.converter;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ParagraphStyle;
import android.text.style.StrikethroughSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.converter.tagsoup.util.StringEscapeUtils;
import com.orion.notein.richeditor.spans.BoldSpan;
import com.orion.notein.richeditor.spans.DividerSpan;
import com.orion.notein.richeditor.spans.HeadingSpan;
import com.orion.notein.richeditor.spans.ItalicSpan;
import com.orion.notein.richeditor.spans.TypefaceSpan;
import com.orion.notein.richeditor.spans.UnderlineSpan;
import com.orion.notein.richeditor.utils.Paragraph;
import com.orion.notein.richeditor.utils.RTLayout;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
public class ConverterSpannedToHtml {
    private static final String AMP = "&amp;";

    /* JADX INFO: renamed from: BR */
    private static final String f58041BR = "<br/>\n";

    /* JADX INFO: renamed from: GT */
    private static final String f58042GT = "&gt;";

    /* JADX INFO: renamed from: LT */
    private static final String f58043LT = "&lt;";
    private static final String NBSP = "&nbsp;";
    private static final String STYLE = "<style>\n  ul {\n      padding-left: 0;\n      margin-left: 0;\n      list-style-position: inside;\n  }\n  ol {\n      padding-left: 0;\n      margin-left: 0;\n      list-style-position: inside;\n  }\n</style>\n";
    private StringBuilder mOut;
    private Stack<AccumulatedParagraphStyle> mParagraphStyles = new Stack<>();
    private RTFormat mRTFormat;
    private Spanned mText;

    private void addParagraph(AccumulatedParagraphStyle accumulatedParagraphStyle) {
        String startTag = accumulatedParagraphStyle.getStartTag();
        int relativeIndent = accumulatedParagraphStyle.getRelativeIndent();
        for (int i = 0; i < relativeIndent; i++) {
            this.mOut.append(startTag);
        }
        this.mParagraphStyles.push(accumulatedParagraphStyle);
    }

    private void convertParagraphs() {
        SingleParagraphStyle next;
        ArrayList<ArrayList<Paragraph>> arrayListSplitIntoListItemGroups = splitIntoListItemGroups(new RTLayout(this.mText).getParagraphs());
        int size = arrayListSplitIntoListItemGroups.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Paragraph> arrayList = arrayListSplitIntoListItemGroups.get(i);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Paragraph paragraph = arrayList.get(i2);
                Set<SingleParagraphStyle> paragraphStyles = getParagraphStyles(this.mText, paragraph);
                Iterator<SingleParagraphStyle> it = paragraphStyles.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.isAlignment()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                HtmlParagraphStyle htmlParagraphStyle = new HtmlParagraphStyle(ParagraphType.NONE);
                int indentation = 0;
                for (SingleParagraphStyle singleParagraphStyle : paragraphStyles) {
                    indentation += singleParagraphStyle.getIndentation();
                    if (htmlParagraphStyle.isUndefined() && (singleParagraphStyle.getType().isBullet() || singleParagraphStyle.getType().isNumbering() || singleParagraphStyle.getType().isIndentation())) {
                        htmlParagraphStyle = singleParagraphStyle;
                    }
                }
                if (next != null && i2 == 0) {
                    this.mOut.append(next.getStartTag());
                }
                processLeadingMarginStyle(new AccumulatedParagraphStyle(htmlParagraphStyle.mType, indentation, 0));
                this.mOut.append(htmlParagraphStyle.getListStartTag());
                withinParagraph(this.mText, paragraph.start(), paragraph.end());
                removeTrailingLineBreak(htmlParagraphStyle);
                this.mOut.append(htmlParagraphStyle.getListEndTag());
                if (next != null && i2 == arrayList.size() - 1) {
                    removeTrailingLineBreak(next);
                    this.mOut.append(next.getEndTag());
                }
            }
        }
        while (!this.mParagraphStyles.isEmpty()) {
            removeParagraph();
        }
    }

    private void convertText(Spanned spanned, int i, int i2, SortedSet<CharacterStyle> sortedSet) {
        while (i < i2) {
            CharacterStyle characterStyleFirst = sortedSet.isEmpty() ? null : sortedSet.first();
            int spanStart = characterStyleFirst == null ? Integer.MAX_VALUE : spanned.getSpanStart(characterStyleFirst);
            int spanEnd = characterStyleFirst != null ? spanned.getSpanEnd(characterStyleFirst) : Integer.MAX_VALUE;
            if (i < spanStart) {
                escape(spanned, i, Math.min(i2, spanStart));
                i = spanStart;
            } else {
                sortedSet.remove(characterStyleFirst);
                if (handleStartTag(characterStyleFirst)) {
                    convertText(spanned, Math.max(spanStart, i), Math.min(spanEnd, i2), sortedSet);
                }
                handleEndTag(characterStyleFirst);
                i = spanEnd;
            }
        }
    }

    private void escape(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n') {
                this.mOut.append(f58041BR);
            } else if (cCharAt == '<') {
                this.mOut.append(f58043LT);
            } else if (cCharAt == '>') {
                this.mOut.append(f58042GT);
            } else if (cCharAt == '&') {
                this.mOut.append(AMP);
            } else if (cCharAt == ' ') {
                while (true) {
                    int i3 = i + 1;
                    if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                        break;
                    }
                    this.mOut.append(NBSP);
                    i = i3;
                }
                this.mOut.append(ControlChar.SPACE_CHAR);
            } else if (cCharAt < ' ') {
                this.mOut.append("&#" + ((int) cCharAt) + ";");
            } else {
                this.mOut.append(cCharAt);
            }
            i++;
        }
    }

    private Set<SingleParagraphStyle> getParagraphStyles(Spanned spanned, Selection selection) {
        HashSet hashSet = new HashSet();
        for (ParagraphStyle paragraphStyle : (ParagraphStyle[]) spanned.getSpans(selection.start(), selection.end(), ParagraphStyle.class)) {
            ParagraphType paragraphType = ParagraphType.getInstance(paragraphStyle);
            if (paragraphType != null) {
                hashSet.add(new SingleParagraphStyle(paragraphType, paragraphStyle));
            }
        }
        return hashSet;
    }

    private void handleEndTag(CharacterStyle characterStyle) {
        if (characterStyle instanceof URLSpan) {
            this.mOut.append("</a>");
            return;
        }
        if (characterStyle instanceof TypefaceSpan) {
            this.mOut.append("</font>");
            return;
        }
        if (characterStyle instanceof ForegroundColorSpan) {
            this.mOut.append("</font>");
            return;
        }
        if (characterStyle instanceof BackgroundColorSpan) {
            this.mOut.append("</font>");
            return;
        }
        if (characterStyle instanceof AbsoluteSizeSpan) {
            this.mOut.append("</font>");
            return;
        }
        if (characterStyle instanceof StrikethroughSpan) {
            this.mOut.append("</strike>");
            return;
        }
        if (characterStyle instanceof SubscriptSpan) {
            this.mOut.append("</sub>");
            return;
        }
        if (characterStyle instanceof SuperscriptSpan) {
            this.mOut.append("</sup>");
            return;
        }
        if (characterStyle instanceof UnderlineSpan) {
            this.mOut.append("</u>");
            return;
        }
        if (characterStyle instanceof BoldSpan) {
            this.mOut.append("</b>");
            return;
        }
        if (characterStyle instanceof ItalicSpan) {
            this.mOut.append("</i>");
            return;
        }
        if (!(characterStyle instanceof HeadingSpan)) {
            if (characterStyle instanceof DividerSpan) {
                this.mOut.append("</div>");
            }
        } else {
            removeLastNewLine();
            this.mOut.append("</h");
            this.mOut.append(((HeadingSpan) characterStyle).getValue().intValue());
            this.mOut.append(">");
        }
    }

    private boolean handleStartTag(CharacterStyle characterStyle) {
        if (characterStyle instanceof BoldSpan) {
            this.mOut.append("<b>");
            return true;
        }
        if (characterStyle instanceof ItalicSpan) {
            this.mOut.append("<i>");
            return true;
        }
        if (characterStyle instanceof UnderlineSpan) {
            this.mOut.append("<u>");
            return true;
        }
        if (characterStyle instanceof SuperscriptSpan) {
            this.mOut.append("<sup>");
            return true;
        }
        if (characterStyle instanceof SubscriptSpan) {
            this.mOut.append("<sub>");
            return true;
        }
        if (characterStyle instanceof StrikethroughSpan) {
            this.mOut.append("<strike>");
            return true;
        }
        if (characterStyle instanceof TypefaceSpan) {
            this.mOut.append("<font face=\"");
            this.mOut.append(StringEscapeUtils.escapeHtml4(((TypefaceSpan) characterStyle).getValue().getName()));
            this.mOut.append("\">");
            return true;
        }
        if (characterStyle instanceof AbsoluteSizeSpan) {
            this.mOut.append("<font style=\"font-size:");
            this.mOut.append(((AbsoluteSizeSpan) characterStyle).getSize());
            this.mOut.append("px;legacy-size:false\">");
            return true;
        }
        if (characterStyle instanceof ForegroundColorSpan) {
            this.mOut.append("<font style=\"color:#");
            String hexString = Integer.toHexString(((ForegroundColorSpan) characterStyle).getForegroundColor() + 16777216);
            while (hexString.length() < 6) {
                hexString = "0".concat(hexString);
            }
            this.mOut.append(hexString);
            this.mOut.append("\">");
            return true;
        }
        if (characterStyle instanceof URLSpan) {
            this.mOut.append("<a href=\"");
            this.mOut.append(((URLSpan) characterStyle).getURL());
            this.mOut.append("\">");
            return true;
        }
        if (characterStyle instanceof ImageSpan) {
            ImageSpan imageSpan = (ImageSpan) characterStyle;
            String source = imageSpan.getSource();
            Drawable drawable = imageSpan.getDrawable();
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                this.mOut.append("<img src=\"");
                this.mOut.append(source);
                this.mOut.append("\" width=\"");
                this.mOut.append(bounds.width());
                this.mOut.append("\" height=\"");
                this.mOut.append(bounds.height());
                this.mOut.append("\">");
            }
            return false;
        }
        if (characterStyle instanceof BackgroundColorSpan) {
            this.mOut.append("<font style=\"background-color:#");
            String hexString2 = Integer.toHexString(((BackgroundColorSpan) characterStyle).getBackgroundColor() + 16777216);
            while (hexString2.length() < 6) {
                hexString2 = "0".concat(hexString2);
            }
            this.mOut.append(hexString2);
            this.mOut.append("\">");
            return true;
        }
        if (!(characterStyle instanceof HeadingSpan)) {
            if (!(characterStyle instanceof DividerSpan)) {
                return true;
            }
            this.mOut.append("<div style=\"page-break-after: always\">");
            return false;
        }
        this.mOut.append("<h");
        this.mOut.append(((HeadingSpan) characterStyle).getValue().intValue());
        this.mOut.append(">");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$withinParagraph$0(Spanned spanned, CharacterStyle characterStyle, CharacterStyle characterStyle2) {
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanStart2 = spanned.getSpanStart(characterStyle2);
        if (spanStart != spanStart2) {
            return spanStart - spanStart2;
        }
        int spanEnd = spanned.getSpanEnd(characterStyle);
        int spanEnd2 = spanned.getSpanEnd(characterStyle2);
        return spanEnd != spanEnd2 ? spanEnd2 - spanEnd : characterStyle.getClass().getName().compareTo(characterStyle2.getClass().getName());
    }

    private void processLeadingMarginStyle(AccumulatedParagraphStyle accumulatedParagraphStyle) {
        int absoluteIndent;
        ParagraphType type = ParagraphType.NONE;
        if (this.mParagraphStyles.isEmpty()) {
            absoluteIndent = 0;
        } else {
            AccumulatedParagraphStyle accumulatedParagraphStylePeek = this.mParagraphStyles.peek();
            absoluteIndent = accumulatedParagraphStylePeek.getAbsoluteIndent();
            type = accumulatedParagraphStylePeek.getType();
        }
        if (accumulatedParagraphStyle.getAbsoluteIndent() > absoluteIndent) {
            accumulatedParagraphStyle.setRelativeIndent(accumulatedParagraphStyle.getAbsoluteIndent() - absoluteIndent);
            addParagraph(accumulatedParagraphStyle);
        } else if (accumulatedParagraphStyle.getAbsoluteIndent() < absoluteIndent) {
            removeParagraph();
            processLeadingMarginStyle(accumulatedParagraphStyle);
        } else if (accumulatedParagraphStyle.getType() != type) {
            accumulatedParagraphStyle.setRelativeIndent(removeParagraph());
            addParagraph(accumulatedParagraphStyle);
        }
    }

    private void removeLastNewLine() {
        int length = this.mOut.length();
        int i = length - 1;
        if (this.mOut.charAt(i) == '\n') {
            this.mOut.delete(i, length);
        }
    }

    private int removeParagraph() {
        if (this.mParagraphStyles.isEmpty()) {
            return 0;
        }
        AccumulatedParagraphStyle accumulatedParagraphStylePop = this.mParagraphStyles.pop();
        String endTag = accumulatedParagraphStylePop.getEndTag();
        int relativeIndent = accumulatedParagraphStylePop.getRelativeIndent();
        for (int i = 0; i < relativeIndent; i++) {
            this.mOut.append(endTag);
        }
        return accumulatedParagraphStylePop.getRelativeIndent();
    }

    private void removeTrailingLineBreak(HtmlParagraphStyle htmlParagraphStyle) {
        if (!htmlParagraphStyle.endTagAddsLineBreak() || this.mOut.length() < 6) {
            return;
        }
        int length = this.mOut.length() - 6;
        int length2 = this.mOut.length();
        if (this.mOut.subSequence(length, length2).toString().equals(f58041BR)) {
            this.mOut.delete(length, length2);
        }
    }

    private ArrayList<ArrayList<Paragraph>> splitIntoListItemGroups(ArrayList<Paragraph> arrayList) {
        boolean z;
        ArrayList<ArrayList<Paragraph>> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Paragraph paragraph = arrayList.get(i);
            for (SingleParagraphStyle singleParagraphStyle : getParagraphStyles(this.mText, paragraph)) {
                if (singleParagraphStyle.getType().isBullet() || singleParagraphStyle.getType().isNumbering()) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z || !z2) {
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(new ArrayList<>(arrayList3));
                }
                arrayList3 = new ArrayList();
            }
            arrayList3.add(paragraph);
            i++;
            z2 = z;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new ArrayList<>(arrayList3));
        }
        return arrayList2;
    }

    private void withinParagraph(final Spanned spanned, int i, int i2) {
        TreeSet treeSet = new TreeSet(new Comparator() { // from class: com.orion.notein.richeditor.converter.OooO00o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ConverterSpannedToHtml.lambda$withinParagraph$0(spanned, (CharacterStyle) obj, (CharacterStyle) obj2);
            }
        });
        treeSet.addAll(Arrays.asList((CharacterStyle[]) spanned.getSpans(i, i2, CharacterStyle.class)));
        convertText(spanned, i, i2, treeSet);
    }

    public RTHtml convert(Spanned spanned, RTFormat.Html html) {
        this.mText = spanned;
        this.mRTFormat = html;
        this.mOut = new StringBuilder();
        this.mParagraphStyles.clear();
        this.mOut.append(STYLE);
        convertParagraphs();
        return new RTHtml(html, this.mOut.toString());
    }
}
