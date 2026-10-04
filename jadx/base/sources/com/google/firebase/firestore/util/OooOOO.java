package com.google.firebase.firestore.util;

import com.aspose.slides.p559ms.System.C14116yg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOOO implements Continuation {
    public static int OooO00o(int i, int i2, int i3) {
        return (C14116yg.m67482k4(i) * i2) + i3;
    }

    public static String OooO0O0(String str, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Util.lambda$static$0(task);
    }
}
