package o0OoO000;

import android.content.Context;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.android.billingclient.api.OooOO0O;
import com.google.gson.Gson;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import java.util.ArrayList;
import java.util.Map;
import o0o0OOoo.C30584OooOOOo;
import o0oOoOo.C31042OooOOO0;
import o0oOoOoO.C31097OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28546Oooo00O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101183OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101184OooOo0o;

    public /* synthetic */ C28546Oooo00O(Object obj, int i) {
        this.f101184OooOo0o = i;
        this.f101183OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        ArrayList arrayList;
        Map map = null;
        Object obj = this.f101183OooOo;
        switch (this.f101184OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseLoginConfirmFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            case 1:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o0O.OooOO0(oooO0O0Oooo0oO, interfaceC21987OooOoo, new PenBarChildFragment.OooOOO(2, penBarChildFragment, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            case 2:
                try {
                    map = (Map) new Gson().fromJson(((C30584OooOOOo) obj).f109401OooO0o.getValueAsString("rconfig_eligible_product_and_plan"), new C30584OooOOOo.OooO0O0().getType());
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PayViewModel");
                    c20358OooO00o.OooO0O0(e);
                }
                return (map == null || map.isEmpty()) ? GoogleBillingConstants.INSTANCE.getDEFAULT_ELIGIBLE_VIP_PRODUCT() : map;
            default:
                OooOO0O.C22163OooO0Oo c22163OooO0Oo = ((C31042OooOOO0) obj).f110828OooO0OO;
                return Boolean.valueOf((c22163OooO0Oo == null || (arrayList = c22163OooO0Oo.f66971OooO0o0) == null) ? false : arrayList.contains("discount"));
        }
    }
}
