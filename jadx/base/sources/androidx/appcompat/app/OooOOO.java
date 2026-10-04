package androidx.appcompat.app;

import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10609qn;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import oO00o00o.InterfaceC32331OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements InterfaceC32331OooO0OO {
    public static String OooO00o(StringBuilder sb, String str, boolean z) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static void OooO0O0(int i, boolean z, long j, C10480ii c10480ii) {
        c10480ii.m50926k4(new C10609qn(i, z, j));
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$13((CampaignProto.ThickContent) obj);
    }
}
