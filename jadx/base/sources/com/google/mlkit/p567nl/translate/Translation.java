package com.google.mlkit.p567nl.translate;

import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.p567nl.translate.internal.TranslatorImpl;

/* JADX INFO: loaded from: classes8.dex */
public class Translation {
    private Translation() {
    }

    public static Translator getClient(TranslatorOptions translatorOptions) {
        return ((TranslatorImpl.Factory) MlKitContext.getInstance().get(TranslatorImpl.Factory.class)).zza(translatorOptions);
    }
}
