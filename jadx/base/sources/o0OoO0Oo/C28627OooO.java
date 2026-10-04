package o0OoO0Oo;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.orion.notein.domain.models.transactions.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.membership.plan.MembershipPlanViewModel$products$1", m80623f = "MembershipPlanViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28627OooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Product>, Integer, Continuation<? super List<? extends C28629OooO0O0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f101472OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f101473OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28639OooOOO0 f101474OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28627OooO(C28639OooOOO0 c28639OooOOO0, Continuation<? super C28627OooO> continuation) {
        super(3, continuation);
        this.f101474OooOoO0 = c28639OooOOO0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Product> list, Integer num, Continuation<? super List<? extends C28629OooO0O0>> continuation) {
        int iIntValue = num.intValue();
        C28627OooO c28627OooO = new C28627OooO(this.f101474OooOoO0, continuation);
        c28627OooO.f101473OooOo0o = list;
        c28627OooO.f101472OooOo = iIntValue;
        return c28627OooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f101473OooOo0o;
        int i = this.f101472OooOo;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            Product product = (Product) obj2;
            JsonObject jsonObject = (JsonObject) this.f101474OooOoO0.f101514OooO0o0.fromJson(product.getInfo(), JsonObject.class);
            float price = product.getPrice() / 100.0f;
            float originPrice = product.getOriginPrice() / 100.0f;
            int asInt = jsonObject.get("role").getAsInt();
            JsonElement jsonElement = jsonObject.get("duration");
            arrayList.add(new C28629OooO0O0(product.getId(), price, originPrice, jsonElement != null ? jsonElement.getAsLong() : 0L, asInt == 0, product.getTopBannerMsg(), product.getBottomBannerMsg(), product.getDescription(), i == i2));
            i2 = i3;
        }
        return arrayList;
    }
}
