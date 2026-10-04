package com.google.mlkit.p567nl.languageid.internal;

import android.content.Context;
import com.google.mlkit.p567nl.languageid.LanguageIdentificationOptions;

/* JADX INFO: loaded from: classes8.dex */
public interface LanguageIdentifierCreatorDelegate {
    LanguageIdentifierDelegate create(Context context, LanguageIdentificationOptions languageIdentificationOptions);

    int getPriority();
}
