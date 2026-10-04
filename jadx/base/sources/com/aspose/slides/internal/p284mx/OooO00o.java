package com.aspose.slides.internal.p284mx;

import androidx.activity.result.ActivityResult;
import com.aspose.slides.Collections.Generic.List;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import kotlin.jvm.internal.OooOOO0;
import oO00o00o.InterfaceC32332OooO0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO00o implements InterfaceC32332OooO0Oo, OooO0o.OooO00o {
    public static void OooO00o(int i, int i2, List list) {
        list.addItem(Integer.valueOf(i));
        list.addItem(Integer.valueOf(i2));
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult it = (ActivityResult) obj;
        OooOOO0.OooO0oO(it, "it");
    }

    @Override // oO00o00o.InterfaceC32332OooO0Oo
    public boolean test(Object obj) {
        return InAppMessageStreamManager.lambda$getContentIfNotRateLimited$23((Boolean) obj);
    }
}
