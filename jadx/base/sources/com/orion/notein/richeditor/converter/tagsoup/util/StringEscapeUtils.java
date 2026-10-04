package com.orion.notein.richeditor.converter.tagsoup.util;

import com.orion.notein.richeditor.converter.tagsoup.util.NumericEntityUnescaper;

/* JADX INFO: loaded from: classes9.dex */
public class StringEscapeUtils {
    public static final CharSequenceTranslator ESCAPE_HTML4 = new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_ESCAPE()));
    public static final CharSequenceTranslator UNESCAPE_HTML4 = new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_UNESCAPE()), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));

    public static final String escapeHtml4(String str) {
        return ESCAPE_HTML4.translate(str);
    }

    public static final String unescapeHtml4(String str) {
        return UNESCAPE_HTML4.translate(str);
    }
}
