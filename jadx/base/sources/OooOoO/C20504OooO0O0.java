package OooOoO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aspose.slides.internal.p071cz.C2844o4;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpression;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0oO0Oo.C34032OooOo0O;

/* JADX INFO: renamed from: OooOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20504OooO0O0 implements InterfaceC32331OooO0OO {
    public static double OooO00o(C2844o4 c2844o4, double d) {
        return c2844o4.m12213h4().m12521x1().m12482k4() / d;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static View OooO0OO(ViewGroup viewGroup, String str, int i, ViewGroup viewGroup2, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewGroup, str);
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static void OooO0Oo(C34032OooOo0O c34032OooOo0O, String str, String str2, String str3, String str4) {
        c34032OooOo0O.OooOOo0(str);
        c34032OooOo0O.OooOOo0(str2);
        c34032OooOo0O.OooOOo0(str3);
        c34032OooOo0O.OooOOo0(str4);
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return ((CampaignImpression) obj).getCampaignId();
    }
}
