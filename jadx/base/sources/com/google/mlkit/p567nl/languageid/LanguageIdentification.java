package com.google.mlkit.p567nl.languageid;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.p567nl.languageid.internal.LanguageIdentifierImpl;

/* JADX INFO: loaded from: classes8.dex */
public class LanguageIdentification {
    private LanguageIdentification() {
    }

    public static LanguageIdentifier getClient() {
        return ((LanguageIdentifierImpl.Factory) MlKitContext.getInstance().get(LanguageIdentifierImpl.Factory.class)).create(LanguageIdentificationOptions.zza);
    }

    public static LanguageIdentifier getClient(LanguageIdentificationOptions languageIdentificationOptions) {
        Preconditions.checkNotNull(languageIdentificationOptions, "LanguageIdentificationOptions can not be null");
        return ((LanguageIdentifierImpl.Factory) MlKitContext.getInstance().get(LanguageIdentifierImpl.Factory.class)).create(languageIdentificationOptions);
    }
}
