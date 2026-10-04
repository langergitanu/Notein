package com.aspose.words;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;

/* JADX INFO: renamed from: com.aspose.words.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C22241OooO0Oo implements Continuation {
    public static String OooO00o(int i, int i2, int i3, int i4, String str) {
        return str.substring(i4, (i - i2) + i3);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
    }
}
