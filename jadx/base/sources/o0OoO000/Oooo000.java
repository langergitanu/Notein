package o0OoO000;

import android.content.Context;
import com.android.billingclient.api.OooOO0O;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import java.util.ArrayList;
import o0oOoOo.C31042OooOOO0;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class Oooo000 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101181OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101182OooOo0o;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f101182OooOo0o = i;
        this.f101181OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        ArrayList arrayList;
        switch (this.f101182OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseLoginConfirmFragment) this.f101181OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                OooOO0O.C22163OooO0Oo c22163OooO0Oo = ((C31042OooOOO0) this.f101181OooOo).f110828OooO0OO;
                return Boolean.valueOf((c22163OooO0Oo == null || (arrayList = c22163OooO0Oo.f66971OooO0o0) == null) ? false : arrayList.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL));
        }
    }
}
