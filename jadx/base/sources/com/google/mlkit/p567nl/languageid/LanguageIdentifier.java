package com.google.mlkit.p567nl.languageid;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21988OooOoo0;
import androidx.lifecycle.InterfaceC21997Oooo0o;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface LanguageIdentifier extends Closeable, InterfaceC21988OooOoo0, OptionalModuleApi {
    public static final float DEFAULT_IDENTIFY_LANGUAGE_CONFIDENCE_THRESHOLD = 0.5f;
    public static final float DEFAULT_IDENTIFY_POSSIBLE_LANGUAGES_CONFIDENCE_THRESHOLD = 0.01f;
    public static final String UNDETERMINED_LANGUAGE_TAG = "und";

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY)
    void close();

    Task<String> identifyLanguage(String str);

    Task<List<IdentifiedLanguage>> identifyPossibleLanguages(String str);
}
