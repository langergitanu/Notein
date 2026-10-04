package com.google.firebase.storage;

import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskListenerImpl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOOOO implements TaskListenerImpl.OnRaise {
    @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
    public final void raise(Object obj, Object obj2) {
        ((OnProgressListener) obj).onProgress((StorageTask.ProvideError) obj2);
    }
}
