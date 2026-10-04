package com.orion.notein.richeditor.converter.tagsoup.util;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CodePointTranslator extends CharSequenceTranslator {
    @Override // com.orion.notein.richeditor.converter.tagsoup.util.CharSequenceTranslator
    public final int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        return translate(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean translate(int i, Writer writer) throws IOException;
}
