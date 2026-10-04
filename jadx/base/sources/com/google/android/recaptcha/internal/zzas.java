package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import oO0o0OO.InterfaceC33642Oooo0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzas {
    public static final Task zza(InterfaceC33642Oooo0oo interfaceC33642Oooo0oo) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        interfaceC33642Oooo0oo.invokeOnCompletion(new zzar(taskCompletionSource, interfaceC33642Oooo0oo));
        return taskCompletionSource.getTask();
    }
}
