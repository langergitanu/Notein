package o0Ooo0oo;

import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import com.orion.notein.p607ui.user.settings.verifycode.VerifyCodeFragment;
import java.util.Map;
import o000o0O0.C24568OooO0oO;
import o0o0OOoO.C30558OooO0oo;
import o0oOoOO.C31005OooO00o;
import o0oOoOO.C31006OooO0O0;
import o0oOoOO.C31007OooO0OO;
import o0oOoOO.C31008OooO0Oo;
import o0oOoOO.C31010OooO0o0;
import o0oOoOO.C31011OooO0oO;
import o0oOoOO.C31012OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29439OooO00o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104487OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104488OooOo0o;

    public /* synthetic */ C29439OooO00o(Object obj, int i) {
        this.f104488OooOo0o = i;
        this.f104487OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Map map;
        Object obj = this.f104487OooOo;
        switch (this.f104488OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                return new ViewOnClickListenerC29448OooOO0O((PenBarChildFragment) obj, 0);
            case 1:
                Fragment fragmentRequireParentFragment = ((SearchListFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 2:
                try {
                    map = (Map) new Gson().fromJson(((C30558OooO0oo) obj).f109298OooO0o.getValueAsString("rconfig_eligible_ai_quota_product_and_plan"), new C30558OooO0oo.OooO0O0().getType());
                    break;
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                    c20358OooO00o.OooO0O0(e);
                    map = null;
                }
                return (map == null || map.isEmpty()) ? GoogleBillingConstants.INSTANCE.getDEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT() : map;
            default:
                C24568OooO0oO c24568OooO0oO = ((VerifyCodeFragment) obj).f80029OooOoo0;
                int i2 = ((C31012OooO0oo) c24568OooO0oO.getValue()).f110729OooO00o;
                if (i2 == 0) {
                    return new C31006OooO0O0();
                }
                if (i2 == 1) {
                    return new C31008OooO0Oo();
                }
                if (i2 == 2) {
                    return new C31007OooO0OO();
                }
                if (i2 == 3) {
                    return new C31005OooO00o();
                }
                if (i2 == 4) {
                    return new C31011OooO0oO();
                }
                if (i2 == 5) {
                    return new C31010OooO0o0();
                }
                throw new IllegalStateException(("Unsupported verification flow: " + ((C31012OooO0oo) c24568OooO0oO.getValue()).f110729OooO00o).toString());
        }
    }
}
