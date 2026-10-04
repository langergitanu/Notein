package o0o0OOoO;

import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.orion.notein.p607ui.pay.Event;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0oOoOo.C31042OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$acknowledgePurchase$1", m80623f = "AiQuotaPayViewModel.kt", m80624l = {632, 635}, m80625m = "invokeSuspend")
public final class C30550OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30558OooO0oo f109282OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109283OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f109284OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Purchase f109285OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30550OooO(C30558OooO0oo c30558OooO0oo, Purchase purchase, String str, Continuation<? super C30550OooO> continuation) {
        super(2, continuation);
        this.f109282OooOo = c30558OooO0oo;
        this.f109285OooOoO0 = purchase;
        this.f109284OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30550OooO(this.f109282OooOo, this.f109285OooOoO0, this.f109284OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30550OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r11 == r0) goto L26;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C27174OooO0O0 c27174OooO0O0;
        Bundle bundle;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109283OooOo0o;
        Purchase purchase = this.f109285OooOoO0;
        C30558OooO0oo c30558OooO0oo = this.f109282OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Object value = c30558OooO0oo.f109296OooO.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(value);
            String str = (String) value;
            boolean zOooO0Oo = purchase.OooO0Oo();
            String str2 = this.f109284OooOoO;
            if (zOooO0Oo) {
                this.f109283OooOo0o = 1;
                obj = c30558OooO0oo.f109297OooO0Oo.OooO0o(str2, purchase, str, this);
            } else if (purchase.OooO0O0() == 1) {
                C31042OooOOO0 c31042OooOOO0 = (C31042OooOOO0) c30558OooO0oo.f109310OooOOo0.getValue();
                String string = (c31042OooOOO0 == null || (bundle = c31042OooOOO0.f110825OooO) == null) ? null : bundle.getString("notein_offer_id");
                this.f109283OooOo0o = 2;
                obj = c30558OooO0oo.f109297OooO0Oo.OooOO0O(str2, purchase, string, str, this);
            } else {
                c27174OooO0O0 = null;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            c27174OooO0O0 = (C27174OooO0O0) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            c27174OooO0O0 = (C27174OooO0O0) obj;
        }
        if (c27174OooO0O0 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
            c20358OooO00o.OooO0OO("acknowledgePurchase response is null. " + purchase, new Object[0]);
            c30558OooO0oo.OooO0oO(Event.C23766OooO0oo.f78710OooO00o, null);
            return C32460OooOooO.f116667OooO00o;
        }
        if (c27174OooO0O0.f94862OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
            Gson gson = new Gson();
            JsonObject jsonObject = (JsonObject) gson.fromJson(purchase.f67096OooO00o, JsonObject.class);
            jsonObject.addProperty("acknowledged", Boolean.TRUE);
            c30558OooO0oo.OooO0oO(Event.OooO.f78702OooO00o, new Purchase(gson.toJson((JsonElement) jsonObject), purchase.f67097OooO0O0));
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o2, "AiQuotaPayViewModel", "acknowledgePurchase error. ", c27174OooO0O0), new Object[0]);
            c30558OooO0oo.OooO0oO(Event.C23766OooO0oo.f78710OooO00o, null);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
