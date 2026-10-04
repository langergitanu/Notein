package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.FirebaseContextProvider;
import o0000oOO.AbstractC24338OooO0o0;
import oO00oO00.InterfaceC32403OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Continuation, InterfaceC32403OooO0OO {
    public static Object OooO00o(List list, int i) {
        return list.get_Item(list.size() - i);
    }

    @Override // oO00oO00.InterfaceC32403OooO0OO
    public Object apply(Object obj) {
        String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(o0O0oO0o.OooOOO.f89108OooO0o0);
        return str == null ? "" : str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FirebaseContextProvider.getAuthToken$lambda$3(task);
    }
}
