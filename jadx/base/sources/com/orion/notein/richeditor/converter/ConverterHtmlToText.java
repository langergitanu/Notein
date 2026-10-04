package com.orion.notein.richeditor.converter;

import android.text.Annotation;
import android.text.Editable;
import android.text.Html;
import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTPlainText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes9.dex */
public class ConverterHtmlToText {
    private static final char NBSP_CHARACTER = 160;
    private static final char NBSP_REPLACEMENT = ' ';
    private static final char PREVIEW_OBJECT_CHARACTER = 65532;
    private static final char PREVIEW_OBJECT_REPLACEMENT = ' ';

    public static class HtmlToTextTagHandler implements Html.TagHandler {
        private static final String IGNORED_ANNOTATION_KEY = "RT_ANNOTATION";
        private static final String IGNORED_ANNOTATION_VALUE = "hiddenSpan";
        private static final Set<String> TAGS_WITH_IGNORED_CONTENT;

        static {
            HashSet hashSet = new HashSet();
            hashSet.add("style");
            hashSet.add("script");
            hashSet.add(NoteMeta.PROPERTY_TITLE);
            hashSet.add("!");
            TAGS_WITH_IGNORED_CONTENT = Collections.unmodifiableSet(hashSet);
        }

        public /* synthetic */ HtmlToTextTagHandler(int i) {
            this();
        }

        private Object getOpeningAnnotation(Editable editable) {
            Object[] spans = editable.getSpans(0, editable.length(), Annotation.class);
            for (int length = spans.length - 1; length >= 0; length--) {
                Object obj = spans[length];
                Annotation annotation = (Annotation) obj;
                if (editable.getSpanFlags(obj) == 17 && annotation.getKey().equals(IGNORED_ANNOTATION_KEY) && annotation.getValue().equals(IGNORED_ANNOTATION_VALUE)) {
                    return spans[length];
                }
            }
            return null;
        }

        private void handleIgnoredTag(boolean z, Editable editable) {
            int length = editable.length();
            if (z) {
                editable.setSpan(new Annotation(IGNORED_ANNOTATION_KEY, IGNORED_ANNOTATION_VALUE), length, length, 17);
                return;
            }
            Object openingAnnotation = getOpeningAnnotation(editable);
            if (openingAnnotation != null) {
                int spanStart = editable.getSpanStart(openingAnnotation);
                editable.removeSpan(openingAnnotation);
                editable.delete(spanStart, length);
            }
        }

        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.equals(TranslateLanguage.CROATIAN) && z) {
                editable.append("_____________________________________________\n");
            } else if (TAGS_WITH_IGNORED_CONTENT.contains(lowerCase)) {
                handleIgnoredTag(z, editable);
            }
        }

        private HtmlToTextTagHandler() {
        }
    }

    public static RTPlainText convert(RTHtml rTHtml) {
        return new RTPlainText(Html.fromHtml(rTHtml.getText(), null, new HtmlToTextTagHandler(0)).toString().replace(PREVIEW_OBJECT_CHARACTER, ControlChar.SPACE_CHAR).replace((char) 160, ControlChar.SPACE_CHAR));
    }

    public static String convert(String str) {
        return Html.fromHtml(str, null, new HtmlToTextTagHandler(0)).toString().replace(PREVIEW_OBJECT_CHARACTER, ControlChar.SPACE_CHAR).replace((char) 160, ControlChar.SPACE_CHAR);
    }
}
