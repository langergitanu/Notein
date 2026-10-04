package com.google.firebase.functions;

import com.google.android.gms.tasks.Task;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/functions/ContextProvider;", "", "getContext", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/functions/HttpsCallableContext;", "getLimitedUseAppCheckToken", "", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface ContextProvider {
    Task<HttpsCallableContext> getContext(boolean getLimitedUseAppCheckToken);
}
