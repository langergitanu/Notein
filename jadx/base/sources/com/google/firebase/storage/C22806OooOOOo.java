package com.google.firebase.storage;

import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskListenerImpl;

/* JADX INFO: renamed from: com.google.firebase.storage.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22806OooOOOo implements TaskListenerImpl.OnRaise {
    @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
    public final void raise(Object obj, Object obj2) {
        ((OnPausedListener) obj).onPaused((StorageTask.ProvideError) obj2);
    }
}
