package android.support.v4.media.session;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.f3z;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements InterfaceC32330OooO0O0 {
    public static String OooO00o(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static void OooO0O0(String str, f3z f3zVar, List list) {
        list.addItem(new C7394ca(str, f3zVar));
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$2((Throwable) obj);
    }
}
