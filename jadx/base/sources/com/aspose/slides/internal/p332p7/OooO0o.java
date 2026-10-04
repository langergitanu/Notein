package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0o implements InterfaceC32330OooO0O0 {
    public static /* synthetic */ boolean OooO00o(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static StringBuilder OooO0O0(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static boolean OooO0OO(AbstractC13912i5 abstractC13912i5, C7017h4 c7017h4) {
        c7017h4.m27428k4(abstractC13912i5.mo65023fa());
        abstractC13912i5.mo65208bv();
        return abstractC13912i5.mo65015ar();
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$7((Throwable) obj);
    }
}
