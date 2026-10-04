package com.aspose.words.internal;

import android.text.Editable;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0OO implements TextInputLayout.LengthCounter, Continuation {
    public static Iterator OooO00o(String str) {
        return new zzZYE(str).iterator();
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
    }
}
