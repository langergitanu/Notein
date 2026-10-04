package com.google.mlkit.p567nl.translate;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21988OooOoo0;
import androidx.lifecycle.InterfaceC21997Oooo0o;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;
import java.io.Closeable;

/* JADX INFO: loaded from: classes8.dex */
public interface Translator extends Closeable, InterfaceC21988OooOoo0 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY)
    void close();

    Task<Void> downloadModelIfNeeded();

    Task<Void> downloadModelIfNeeded(DownloadConditions downloadConditions);

    Task<String> translate(String str);
}
