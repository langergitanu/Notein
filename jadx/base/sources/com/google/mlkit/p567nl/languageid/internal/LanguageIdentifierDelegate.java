package com.google.mlkit.p567nl.languageid.internal;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.p567nl.languageid.IdentifiedLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface LanguageIdentifierDelegate {
    List<IdentifiedLanguage> identifyPossibleLanguages(String str, float f) throws MlKitException;

    void init() throws MlKitException;

    void release();
}
