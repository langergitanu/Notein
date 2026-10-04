package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.firestore.core.Transaction;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: renamed from: com.aspose.slides.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22218Oooo implements Continuation, HttpLoggingInterceptor.Logger {
    public static SortedList OooO0O0(SortedList sortedList, Integer num, SortedList sortedList2) {
        sortedList.addItem(num, sortedList2);
        return new SortedList();
    }

    public static StringBuilder OooO0OO(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void OooO0Oo(int i, FieldDescriptor.Builder builder) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        builder.withProperty(zzctVar.zzb()).build();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Transaction.lambda$commit$1(task);
    }
}
