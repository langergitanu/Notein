package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.C4288qq;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.InstallationIdResult;
import java.lang.reflect.Type;
import oO00o00o.InterfaceC32332OooO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements InterfaceC32332OooO0Oo {
    public static C4288qq.k4 OooO00o(int i, boolean z) {
        C4288qq.k4 k4Var = new C4288qq.k4(i);
        k4Var.m17224k4(z);
        return k4Var;
    }

    public static String OooO0O0(String str, Type type) {
        return str + type;
    }

    @Override // oO00o00o.InterfaceC32332OooO0Oo
    public boolean test(Object obj) {
        return InAppMessageStreamManager.validIID((InstallationIdResult) obj);
    }
}
