package com.orion.notein.richeditor.converter;

import android.content.Context;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.QuoteSpan;
import androidx.core.view.ViewCompat;
import com.aspose.words.ControlChar;
import com.aspose.words.WarningType;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTSpanned;
import com.orion.notein.richeditor.converter.tagsoup.HTMLSchema;
import com.orion.notein.richeditor.converter.tagsoup.Parser;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.fonts.RTTypeface;
import com.orion.notein.richeditor.spans.AbsoluteSizeSpan;
import com.orion.notein.richeditor.spans.AlignmentSpan;
import com.orion.notein.richeditor.spans.BackgroundColorSpan;
import com.orion.notein.richeditor.spans.BaseListItemSpan;
import com.orion.notein.richeditor.spans.BoldSpan;
import com.orion.notein.richeditor.spans.BulletSpan;
import com.orion.notein.richeditor.spans.DividerSpan;
import com.orion.notein.richeditor.spans.ForegroundColorSpan;
import com.orion.notein.richeditor.spans.HeadingSpan;
import com.orion.notein.richeditor.spans.ImageSpan;
import com.orion.notein.richeditor.spans.ItalicSpan;
import com.orion.notein.richeditor.spans.NumberSpan;
import com.orion.notein.richeditor.spans.StrikethroughSpan;
import com.orion.notein.richeditor.spans.SubscriptSpan;
import com.orion.notein.richeditor.spans.SuperscriptSpan;
import com.orion.notein.richeditor.spans.TypefaceSpan;
import com.orion.notein.richeditor.spans.URLSpan;
import com.orion.notein.richeditor.spans.UnderlineSpan;
import com.orion.notein.richeditor.utils.Helper;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* JADX INFO: loaded from: classes9.dex */
public class ConverterHtmlToSpanned implements ContentHandler {
    private static final Pattern BOOLEAN;
    private static HashMap<String, Integer> COLORS;
    private static final Pattern FONT_COLOR;
    private static final Pattern FONT_SIZE;
    private static final Set<String> sIgnoreTags;
    private Context mContext;
    private boolean mIgnoreContent;
    private Parser mParser;
    private SpannableStringBuilder mResult;
    private String mSource;
    private Stack<AccumulatedParagraphStyle> mParagraphStyles = new Stack<>();
    private boolean haveAnyHtmlTagParsed = false;
    private boolean mKeepPlainText = false;
    private boolean mParagraphBlock = false;

    public static class Big {
        public /* synthetic */ Big(int i) {
            this();
        }

        private Big() {
        }
    }

    public static class Blockquote {
        public /* synthetic */ Blockquote(int i) {
            this();
        }

        private Blockquote() {
        }
    }

    public static class Bold {
        public /* synthetic */ Bold(int i) {
            this();
        }

        private Bold() {
        }
    }

    public static class Div {
        boolean isDivider;
        String mAlign;

        public Div(String str, boolean z) {
            this.mAlign = "left";
            this.isDivider = false;
            if (str != null) {
                this.mAlign = str;
            }
            this.isDivider = z;
        }
    }

    public static class Font {
        String mBGColor;
        String mFGColor;
        String mFontFace;
        int mSize;

        public /* synthetic */ Font(int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Font setFontFace(String str) {
            this.mFontFace = str;
            return this;
        }

        public boolean hasBGColor() {
            return !TextUtils.isEmpty(this.mBGColor);
        }

        public boolean hasFGColor() {
            return !TextUtils.isEmpty(this.mFGColor);
        }

        public boolean hasFontFace() {
            return !TextUtils.isEmpty(this.mFontFace);
        }

        public boolean hasSize() {
            return this.mSize > 0;
        }

        public Font setBGColor(String str) {
            this.mBGColor = str;
            return this;
        }

        public Font setFGColor(String str) {
            this.mFGColor = str;
            return this;
        }

        public Font setSize(int i) {
            this.mSize = i;
            return this;
        }

        private Font() {
            this.mSize = Integer.MIN_VALUE;
        }
    }

    public static class Header {
        int mLevel;

        public Header(int i) {
            this.mLevel = i;
        }
    }

    public static class Href {
        Uri mHref;

        public Href(Uri uri) {
            this.mHref = uri;
        }
    }

    public static class HtmlParser {
        private static final HTMLSchema SCHEMA = new HTMLSchema();

        private HtmlParser() {
        }
    }

    public static class Italic {
        public /* synthetic */ Italic(int i) {
            this();
        }

        private Italic() {
        }
    }

    public static abstract class List {
        boolean mIsIndentation;
        int mNrOfIndents;

        public List(int i, boolean z) {
            this.mNrOfIndents = i;
            this.mIsIndentation = z;
        }
    }

    public static class Monospace {
        public /* synthetic */ Monospace(int i) {
            this();
        }

        private Monospace() {
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.richeditor.converter.ConverterHtmlToSpanned$OL */
    public static class C18897OL extends List {
        private int mNumberIndex;

        public C18897OL(int i, boolean z) {
            this(1, i, z);
        }

        public int getNumberIndex() {
            return this.mNumberIndex;
        }

        public C18897OL(int i, int i2, boolean z) {
            super(i2, z);
            this.mNumberIndex = i;
        }
    }

    public static class Small {
        public /* synthetic */ Small(int i) {
            this();
        }

        private Small() {
        }
    }

    public static class Strikethrough {
        public /* synthetic */ Strikethrough(int i) {
            this();
        }

        private Strikethrough() {
        }
    }

    public static class Sub {
        public /* synthetic */ Sub(int i) {
            this();
        }

        private Sub() {
        }
    }

    public static class Super {
        public /* synthetic */ Super(int i) {
            this();
        }

        private Super() {
        }
    }

    public static class TemporarySpan {
        Object mSpan;

        public TemporarySpan(Object obj) {
            this.mSpan = obj;
        }

        public void swapIn(SpannableStringBuilder spannableStringBuilder) {
            int spanStart = spannableStringBuilder.getSpanStart(this);
            int spanEnd = spannableStringBuilder.getSpanEnd(this);
            spannableStringBuilder.removeSpan(this);
            if (spanStart < 0 || spanEnd <= spanStart || spanEnd > spannableStringBuilder.length()) {
                return;
            }
            spannableStringBuilder.setSpan(this.mSpan, spanStart, spanEnd, 34);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.richeditor.converter.ConverterHtmlToSpanned$UL */
    public static class C18898UL extends List {
        public C18898UL(int i, boolean z) {
            super(i, z);
        }
    }

    public static class Underline {
        public /* synthetic */ Underline(int i) {
            this();
        }

        private Underline() {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        sIgnoreTags = hashSet;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("hello");
        spannableStringBuilder.append(spannableStringBuilder.subSequence(0, spannableStringBuilder.length()));
        hashSet.add("header");
        hashSet.add("style");
        hashSet.add("meta");
        hashSet.add(NoteMeta.PROPERTY_TITLE);
        FONT_SIZE = Pattern.compile("\\d+");
        FONT_COLOR = Pattern.compile("#[a-f0-9]+");
        BOOLEAN = Pattern.compile("\\b(true|false)\\b");
        HashMap<String, Integer> map = new HashMap<>();
        COLORS = map;
        map.put("aqua", 65535);
        COLORS.put("black", 0);
        COLORS.put("blue", 255);
        COLORS.put("fuchsia", 16711935);
        COLORS.put("green", 32768);
        COLORS.put("grey", 8421504);
        COLORS.put("lime", 65280);
        COLORS.put("maroon", 8388608);
        COLORS.put("navy", 128);
        COLORS.put("olive", 8421376);
        COLORS.put("purple", 8388736);
        COLORS.put("red", Integer.valueOf(WarningType.MINOR_FORMATTING_LOSS_CATEGORY));
        COLORS.put("silver", 12632256);
        COLORS.put("teal", 32896);
        COLORS.put("white", 16777215);
        COLORS.put("yellow", 16776960);
    }

    public ConverterHtmlToSpanned(Context context) {
        this.mContext = context;
    }

    private boolean checkDuplicateSpan(SpannableStringBuilder spannableStringBuilder, int i, Class<?> cls) {
        Object[] spans = spannableStringBuilder.getSpans(i, i, cls);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                if (spannableStringBuilder.getSpanStart(obj) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private RTSpanned convertInternal(RTHtml rTHtml, boolean z) {
        this.mSource = rTHtml.getText();
        this.mKeepPlainText = z;
        Parser parser = new Parser();
        this.mParser = parser;
        try {
            parser.setProperty(Parser.schemaProperty, HtmlParser.SCHEMA);
            this.mResult = new SpannableStringBuilder();
            this.mIgnoreContent = false;
            this.mParagraphStyles.clear();
            this.mParser.setContentHandler(this);
            try {
                this.mParser.parse(new InputSource(new StringReader(this.mSource)));
                removeTrailingLineBreaks();
                if (!z && !this.haveAnyHtmlTagParsed) {
                    return convertInternal(rTHtml, true);
                }
                SpannableStringBuilder spannableStringBuilder = this.mResult;
                for (TemporarySpan temporarySpan : (TemporarySpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), TemporarySpan.class)) {
                    temporarySpan.swapIn(this.mResult);
                }
                return new RTSpanned(this.mResult);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SAXException e2) {
                throw new RuntimeException(e2);
            }
        } catch (SAXNotRecognizedException e3) {
            throw new RuntimeException(e3);
        } catch (SAXNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static final int convertValueToInt(CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (charSequence == null) {
            return i;
        }
        String string = charSequence.toString();
        int length = string.length();
        if ('-' == string.charAt(0)) {
            i3 = -1;
            i2 = 1;
        } else {
            i2 = 0;
            i3 = 1;
        }
        int i4 = 16;
        if ('0' == string.charAt(i2)) {
            if (i2 == length - 1) {
                return 0;
            }
            int i5 = i2 + 1;
            char cCharAt = string.charAt(i5);
            if ('x' == cCharAt || 'X' == cCharAt) {
                i2 += 2;
            } else {
                i4 = 8;
                i2 = i5;
            }
        } else if ('#' == string.charAt(i2)) {
            i2++;
        } else {
            i4 = 10;
        }
        return Integer.parseInt(string.substring(i2), i4) * i3;
    }

    private void end(Class<? extends Object> cls, Object obj) {
        int length = this.mResult.length();
        Object last = getLast(cls);
        int spanStart = this.mResult.getSpanStart(last);
        this.mResult.removeSpan(last);
        if (spanStart != length) {
            this.mResult.setSpan(new TemporarySpan(obj), spanStart, length, 33);
        }
    }

    private void endAHref() {
        int length = this.mResult.length();
        Object last = getLast(Href.class);
        int spanStart = this.mResult.getSpanStart(last);
        this.mResult.removeSpan(last);
        if (spanStart != length) {
            Href href = (Href) last;
            String host = href.mHref.getHost();
            if (host == null || host.length() <= 5) {
                return;
            }
            this.mResult.setSpan(new URLSpan(href.mHref.toString()), spanStart, length, 33);
        }
    }

    private void endDiv() {
        Object last = getLast(this.mResult, Div.class);
        if (last == null) {
            return;
        }
        Div div = (Div) last;
        if (div.isDivider) {
            this.mResult.append((char) 65532);
        }
        int spanStart = this.mResult.getSpanStart(last);
        int length = this.mResult.length();
        this.mResult.removeSpan(last);
        if (spanStart == length) {
            return;
        }
        if (div.isDivider) {
            this.mResult.setSpan(new DividerSpan(this.mContext), spanStart, length, 33);
            return;
        }
        if (checkDuplicateSpan(this.mResult, spanStart, AlignmentSpan.class)) {
            return;
        }
        Layout.Alignment alignment = div.mAlign.equalsIgnoreCase("center") ? Layout.Alignment.ALIGN_CENTER : div.mAlign.equalsIgnoreCase("right") ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        if (alignment != null) {
            if (this.mResult.charAt(length - 1) != '\n') {
                this.mResult.append('\n');
            }
            this.mResult.setSpan(new AlignmentSpan(alignment, Helper.isRTL(this.mResult, spanStart, length)), spanStart, length, 33);
        }
    }

    private void endFont() {
        int htmlColor;
        int htmlColor2;
        RTTypeface typeface;
        int length = this.mResult.length();
        Object last = getLast(Font.class);
        int spanStart = this.mResult.getSpanStart(last);
        this.mResult.removeSpan(last);
        if (spanStart != length) {
            Font font = (Font) last;
            if (font.hasFontFace() && (typeface = FontManager.getTypeface(font.mFontFace)) != null) {
                this.mResult.setSpan(new TemporarySpan(new TypefaceSpan(typeface)), spanStart, length, 33);
            }
            if (font.hasSize()) {
                this.mResult.setSpan(new TemporarySpan(new AbsoluteSizeSpan(font.mSize)), spanStart, length, 33);
            }
            if (font.hasFGColor() && (htmlColor2 = getHtmlColor(font.mFGColor)) != -1) {
                this.mResult.setSpan(new TemporarySpan(new ForegroundColorSpan(htmlColor2 | ViewCompat.MEASURED_STATE_MASK)), spanStart, length, 33);
            }
            if (!font.hasBGColor() || (htmlColor = getHtmlColor(font.mBGColor)) == -1) {
                return;
            }
            this.mResult.setSpan(new TemporarySpan(new BackgroundColorSpan(htmlColor | ViewCompat.MEASURED_STATE_MASK)), spanStart, length, 33);
        }
    }

    private void endHeader() {
        Object last = getLast(Header.class);
        int spanStart = this.mResult.getSpanStart(last);
        int length = this.mResult.length();
        this.mResult.removeSpan(last);
        if (length <= spanStart) {
            return;
        }
        while (length > spanStart && this.mResult.charAt(length - 1) == '\n') {
            length--;
        }
        if (length <= spanStart) {
            return;
        }
        if (length == this.mResult.length()) {
            this.mResult.append((CharSequence) IOUtils.LINE_SEPARATOR_UNIX);
            length++;
        }
        this.mResult.setSpan(new HeadingSpan(((Header) last).mLevel), spanStart, length, 33);
    }

    private void endList(boolean z) {
        if (this.mParagraphStyles.isEmpty()) {
            return;
        }
        AccumulatedParagraphStyle accumulatedParagraphStylePeek = this.mParagraphStyles.peek();
        ParagraphType type = accumulatedParagraphStylePeek.getType();
        if (!(z && (type.isNumbering() || type == ParagraphType.INDENTATION_OL)) && (z || !(type.isBullet() || type == ParagraphType.INDENTATION_UL))) {
            this.mParagraphStyles.pop();
            endList(z);
            return;
        }
        int relativeIndent = accumulatedParagraphStylePeek.getRelativeIndent();
        if (relativeIndent <= 1) {
            this.mParagraphStyles.pop();
        } else {
            accumulatedParagraphStylePeek.setRelativeIndent(relativeIndent - 1);
            accumulatedParagraphStylePeek.setAbsoluteIndent(accumulatedParagraphStylePeek.getAbsoluteIndent() - 1);
        }
    }

    private static int getHtmlColor(String str) {
        Integer num = COLORS.get(str.toLowerCase());
        if (num != null) {
            return num.intValue();
        }
        try {
            return convertValueToInt(str, -1);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private Object getLast(Spanned spanned, Class<?> cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return spans[spans.length - 1];
    }

    private void handleBr() {
        this.mResult.append((CharSequence) IOUtils.LINE_SEPARATOR_UNIX);
    }

    private boolean handleEndTag(String str) {
        if (str.equalsIgnoreCase("br")) {
            handleBr();
        } else if (str.equalsIgnoreCase(ContextChain.TAG_PRODUCT)) {
            handleP();
            this.mParagraphBlock = false;
        } else if (str.equalsIgnoreCase("div")) {
            endDiv();
        } else if (str.equalsIgnoreCase("ul")) {
            endList(false);
        } else if (str.equalsIgnoreCase("ol")) {
            endList(true);
        } else if (str.equalsIgnoreCase("li")) {
            endList();
        } else if (str.equalsIgnoreCase("strong") || str.equalsIgnoreCase("b")) {
            end(Bold.class, new BoldSpan());
        } else if (str.equalsIgnoreCase("em") || str.equalsIgnoreCase("cite") || str.equalsIgnoreCase("dfn") || str.equalsIgnoreCase(ContextChain.TAG_INFRA)) {
            end(Italic.class, new ItalicSpan());
        } else if (str.equalsIgnoreCase("strike") || str.equalsIgnoreCase("del")) {
            end(Strikethrough.class, new StrikethroughSpan());
        } else if (str.equalsIgnoreCase("big")) {
            end(Big.class, new AbsoluteSizeSpan(50));
        } else if (str.equalsIgnoreCase("small")) {
            end(Small.class, new AbsoluteSizeSpan(20));
        } else if (str.equalsIgnoreCase("font")) {
            endFont();
        } else if (str.equalsIgnoreCase("blockquote")) {
            handleP();
            end(Blockquote.class, new QuoteSpan());
        } else if (str.equalsIgnoreCase("a")) {
            endAHref();
        } else if (str.equalsIgnoreCase("u")) {
            end(Underline.class, new UnderlineSpan());
        } else if (str.equalsIgnoreCase("sup")) {
            end(Super.class, new SuperscriptSpan());
        } else if (str.equalsIgnoreCase("sub")) {
            end(Sub.class, new SubscriptSpan());
        } else if (str.equalsIgnoreCase(TranslateLanguage.TURKISH)) {
            handleP();
        } else if (str.length() == 2 && Character.toLowerCase(str.charAt(0)) == 'h' && str.charAt(1) >= '1' && str.charAt(1) <= '3') {
            endHeader();
        } else {
            if (!sIgnoreTags.contains(str.toLowerCase(Locale.getDefault()))) {
                return false;
            }
            this.mIgnoreContent = false;
        }
        return true;
    }

    private void handleP() {
        int length = this.mResult.length();
        if (length < 1 || this.mResult.charAt(length - 1) != '\n') {
            if (length != 0) {
                this.mResult.append((CharSequence) "\n\n");
            }
        } else if (length < 2 || this.mResult.charAt(length - 2) != '\n') {
            this.mResult.append((CharSequence) IOUtils.LINE_SEPARATOR_UNIX);
        }
    }

    private void handleSpace() {
        this.mResult.append((CharSequence) " ");
    }

    private boolean handleStartTag(String str, Attributes attributes) {
        if (str.equalsIgnoreCase("br")) {
            return true;
        }
        if (str.equalsIgnoreCase(ContextChain.TAG_PRODUCT)) {
            handleP();
            this.mParagraphBlock = true;
            return true;
        }
        if (str.equalsIgnoreCase("div")) {
            startDiv(attributes);
            return true;
        }
        int i = 0;
        if (str.equalsIgnoreCase("ul")) {
            startList(false, attributes);
            return true;
        }
        if (str.equalsIgnoreCase("ol")) {
            startList(true, attributes);
            return true;
        }
        if (str.equalsIgnoreCase("li")) {
            startList(attributes);
            return true;
        }
        if (str.equalsIgnoreCase("strong")) {
            start(new Bold(i));
            return true;
        }
        if (str.equalsIgnoreCase("b")) {
            start(new Bold(i));
            return true;
        }
        if (str.equalsIgnoreCase("em")) {
            start(new Italic(i));
            return true;
        }
        if (str.equalsIgnoreCase("cite")) {
            start(new Italic(i));
            return true;
        }
        if (str.equalsIgnoreCase("dfn")) {
            start(new Italic(i));
            return true;
        }
        if (str.equalsIgnoreCase(ContextChain.TAG_INFRA)) {
            start(new Italic(i));
            return true;
        }
        if (str.equalsIgnoreCase("strike")) {
            start(new Strikethrough(i));
            return true;
        }
        if (str.equalsIgnoreCase("del")) {
            start(new Strikethrough(i));
            return true;
        }
        if (str.equalsIgnoreCase("big")) {
            start(new Big(i));
            return true;
        }
        if (str.equalsIgnoreCase("small")) {
            start(new Small(i));
            return true;
        }
        if (str.equalsIgnoreCase("font")) {
            startFont(attributes);
            return true;
        }
        if (str.equalsIgnoreCase("blockquote")) {
            handleP();
            start(new Blockquote(i));
            return true;
        }
        if (str.equalsIgnoreCase("tt")) {
            start(new Monospace(i));
            return true;
        }
        if (str.equalsIgnoreCase("a")) {
            startAHref(attributes);
            return true;
        }
        if (str.equalsIgnoreCase("u")) {
            start(new Underline(i));
            return true;
        }
        if (str.equalsIgnoreCase("sup")) {
            start(new Super(i));
            return true;
        }
        if (str.equalsIgnoreCase("sub")) {
            start(new Sub(i));
            return true;
        }
        if (str.length() == 2 && Character.toLowerCase(str.charAt(0)) == 'h' && str.charAt(1) >= '1' && str.charAt(1) <= '3') {
            start(new Header(str.charAt(1) - '0'));
            return true;
        }
        if (str.equalsIgnoreCase("img")) {
            startImg(attributes);
            return true;
        }
        if (str.equalsIgnoreCase("video")) {
            startVideo(attributes);
            return true;
        }
        if (str.equalsIgnoreCase("embed")) {
            startAudio(attributes);
            return true;
        }
        if (str.equalsIgnoreCase("td")) {
            handleSpace();
            return true;
        }
        if (str.equalsIgnoreCase("table")) {
            handleP();
            return true;
        }
        if (!sIgnoreTags.contains(str.toLowerCase(Locale.getDefault()))) {
            return false;
        }
        this.mIgnoreContent = true;
        return true;
    }

    private boolean isIndentation(Attributes attributes) {
        String value = attributes.getValue("style");
        return value != null && value.toLowerCase(Locale.US).contains("list-style-type:none");
    }

    private void removeTrailingLineBreaks() {
        int length = this.mResult.length();
        while (length > 0 && this.mResult.charAt(length - 1) == '\n') {
            length--;
        }
        if (length < this.mResult.length()) {
            this.mResult = SpannableStringBuilder.valueOf(this.mResult.subSequence(0, length));
        }
    }

    private void start(Object obj) {
        int length = this.mResult.length();
        this.mResult.setSpan(obj, length, length, 17);
    }

    private void startAHref(Attributes attributes) {
        String value = attributes.getValue("", "href");
        Uri uriBuild = value == null ? Uri.EMPTY : Uri.parse(value);
        if (uriBuild != Uri.EMPTY && uriBuild.getScheme() == null) {
            uriBuild = uriBuild.buildUpon().scheme(AuthenticationConstants.HTTPS_PROTOCOL_STRING).build();
        }
        int length = this.mResult.length();
        this.mResult.setSpan(new Href(uriBuild), length, length, 17);
    }

    private void startAudio(Attributes attributes) {
    }

    private void startDiv(Attributes attributes) {
        String value = attributes.getValue("align");
        String value2 = attributes.getValue("style");
        boolean z = value2 != null && value2.contains("page-break");
        int length = this.mResult.length();
        this.mResult.setSpan(new Div(value, z), length, length, 17);
    }

    private void startFont(Attributes attributes) {
        int iConvertPxToSp;
        String strSubstring;
        String value = attributes.getValue("", "style");
        int i = 0;
        boolean z = true;
        String strSubstring2 = null;
        if (value != null) {
            iConvertPxToSp = Integer.MIN_VALUE;
            strSubstring = null;
            for (String str : value.toLowerCase(Locale.ENGLISH).split(";")) {
                if (str.startsWith("font-size")) {
                    Matcher matcher = FONT_SIZE.matcher(str);
                    if (matcher.find(0)) {
                        try {
                            iConvertPxToSp = Integer.parseInt(str.substring(matcher.start(), matcher.end()));
                        } catch (NumberFormatException unused) {
                        }
                    }
                } else if (str.startsWith("legacy-size")) {
                    Matcher matcher2 = BOOLEAN.matcher(str);
                    if (matcher2.find(0)) {
                        z = Boolean.parseBoolean(str.substring(matcher2.start(), matcher2.end()));
                    }
                } else if (str.startsWith("color")) {
                    Matcher matcher3 = FONT_COLOR.matcher(str);
                    if (matcher3.find(0)) {
                        strSubstring2 = str.substring(matcher3.start(), matcher3.end());
                    }
                } else if (str.startsWith("background-color")) {
                    Matcher matcher4 = FONT_COLOR.matcher(str);
                    if (matcher4.find(0)) {
                        strSubstring = str.substring(matcher4.start(), matcher4.end());
                    }
                }
            }
        } else {
            iConvertPxToSp = Integer.MIN_VALUE;
            strSubstring = null;
        }
        String value2 = attributes.getValue("", OptionalModuleUtils.FACE);
        if (z && iConvertPxToSp != Integer.MIN_VALUE) {
            iConvertPxToSp = Helper.convertPxToSp(iConvertPxToSp);
        }
        int length = this.mResult.length();
        this.mResult.setSpan(new Font(i).setSize(iConvertPxToSp).setFGColor(strSubstring2).setBGColor(strSubstring).setFontFace(value2), length, length, 17);
    }

    private void startImg(Attributes attributes) {
        int length = this.mResult.length();
        Uri uri = Uri.parse(attributes.getValue("", "src"));
        this.mResult.append((CharSequence) "￼");
        this.mResult.setSpan(new ImageSpan(this.mContext, uri), length, length + 1, 33);
    }

    private void startList(boolean z, Attributes attributes) {
        boolean zIsIndentation = isIndentation(attributes);
        ParagraphType paragraphType = (zIsIndentation && z) ? ParagraphType.INDENTATION_OL : (!zIsIndentation || z) ? z ? ParagraphType.NUMBERING : ParagraphType.BULLET : ParagraphType.INDENTATION_UL;
        AccumulatedParagraphStyle accumulatedParagraphStylePeek = this.mParagraphStyles.isEmpty() ? null : this.mParagraphStyles.peek();
        if (accumulatedParagraphStylePeek == null) {
            this.mParagraphStyles.push(new AccumulatedParagraphStyle(paragraphType, 1, 1));
        } else if (accumulatedParagraphStylePeek.getType() != paragraphType) {
            this.mParagraphStyles.push(new AccumulatedParagraphStyle(paragraphType, accumulatedParagraphStylePeek.getAbsoluteIndent() + 1, 1));
        } else {
            accumulatedParagraphStylePeek.setAbsoluteIndent(accumulatedParagraphStylePeek.getAbsoluteIndent() + 1);
            accumulatedParagraphStylePeek.setRelativeIndent(accumulatedParagraphStylePeek.getRelativeIndent() + 1);
        }
    }

    private void startVideo(Attributes attributes) {
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        char cCharAt;
        if (this.mIgnoreContent) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3 + i];
            boolean z = c == '\r' || c == '\n';
            if (this.mKeepPlainText || !z) {
                sb.append(c);
            } else if (!this.mParagraphBlock || i3 >= i2 - 1) {
                int length = sb.length();
                if (length == 0) {
                    int length2 = this.mResult.length();
                    cCharAt = length2 == 0 ? '\n' : this.mResult.charAt(length2 - 1);
                } else {
                    cCharAt = sb.charAt(length - 1);
                }
                if (cCharAt != ' ' && cCharAt != '\n') {
                    sb.append(ControlChar.SPACE_CHAR);
                }
            } else {
                sb.append(c);
            }
        }
        this.mResult.append((CharSequence) sb);
    }

    public RTSpanned convert(RTHtml rTHtml) {
        return convertInternal(rTHtml, false);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        this.haveAnyHtmlTagParsed |= handleEndTag(str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.haveAnyHtmlTagParsed |= handleStartTag(str2, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    private Object getLast(Class<? extends Object> cls) {
        SpannableStringBuilder spannableStringBuilder = this.mResult;
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return spans[spans.length - 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void endList() {
        Object bulletSpan;
        List list = (List) getLast(List.class);
        if (list != null) {
            if (this.mResult.length() != 0) {
                SpannableStringBuilder spannableStringBuilder = this.mResult;
                if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    this.mResult.append('\n');
                }
            }
            int spanStart = this.mResult.getSpanStart(list);
            int length = this.mResult.length();
            if (!list.mIsIndentation) {
                int leadingMarging = Helper.getLeadingMarging();
                if (list instanceof C18897OL) {
                    bulletSpan = new NumberSpan(((C18897OL) list).getNumberIndex(), leadingMarging, spanStart == length, false, false);
                } else {
                    bulletSpan = new BulletSpan(leadingMarging, spanStart == length, false, false);
                }
                BaseListItemSpan[] baseListItemSpanArr = (BaseListItemSpan[]) this.mResult.getSpans(spanStart, length, BaseListItemSpan.class);
                if (baseListItemSpanArr != null && baseListItemSpanArr.length > 0) {
                    for (BaseListItemSpan baseListItemSpan : baseListItemSpanArr) {
                        if (baseListItemSpan.getClass() != bulletSpan.getClass()) {
                            break;
                        }
                    }
                    this.mResult.setSpan(bulletSpan, spanStart, length, 33);
                } else {
                    this.mResult.setSpan(bulletSpan, spanStart, length, 33);
                }
            }
            this.mResult.removeSpan(list);
        }
    }

    private void startList(Attributes attributes) {
        Object c18898ul;
        if (!this.mParagraphStyles.isEmpty()) {
            AccumulatedParagraphStyle accumulatedParagraphStylePeek = this.mParagraphStyles.peek();
            ParagraphType type = accumulatedParagraphStylePeek.getType();
            int absoluteIndent = accumulatedParagraphStylePeek.getAbsoluteIndent();
            boolean zIsIndentation = isIndentation(attributes);
            if (!type.isIndentation() && !zIsIndentation) {
                if (type.isNumbering()) {
                    try {
                        c18898ul = new C18897OL(Integer.parseInt(attributes.getValue(FirebaseAnalytics.Param.INDEX)), absoluteIndent, false);
                    } catch (Exception unused) {
                        c18898ul = new C18897OL(absoluteIndent, false);
                    }
                } else {
                    c18898ul = type.isBullet() ? new C18898UL(absoluteIndent, false) : null;
                }
            } else {
                c18898ul = new C18898UL(absoluteIndent, true);
            }
        } else {
            c18898ul = new C18898UL(0, false);
        }
        if (this.mResult.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = this.mResult;
            if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                this.mResult.append('\n');
            }
        }
        if (c18898ul != null) {
            start(c18898ul);
        }
    }
}
