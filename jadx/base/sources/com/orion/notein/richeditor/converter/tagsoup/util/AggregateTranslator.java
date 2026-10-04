package com.orion.notein.richeditor.converter.tagsoup.util;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public class AggregateTranslator extends CharSequenceTranslator {
    private final CharSequenceTranslator[] translators;

    public AggregateTranslator(CharSequenceTranslator... charSequenceTranslatorArr) {
        this.translators = (CharSequenceTranslator[]) clone(charSequenceTranslatorArr);
    }

    public static <T> T[] clone(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    @Override // com.orion.notein.richeditor.converter.tagsoup.util.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        for (CharSequenceTranslator charSequenceTranslator : this.translators) {
            int iTranslate = charSequenceTranslator.translate(charSequence, i, writer);
            if (iTranslate != 0) {
                return iTranslate;
            }
        }
        return 0;
    }
}
