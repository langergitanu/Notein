package o0o0OOoo;

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

/* JADX INFO: renamed from: o0o0OOoo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$acknowledgePurchase$1", m80623f = "GooglePayViewModel.kt", m80624l = {740, 743}, m80625m = "invokeSuspend")
public final class C30589OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30584OooOOOo f109463OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109464OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f109465OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Purchase f109466OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30589OooOOo0(C30584OooOOOo c30584OooOOOo, Purchase purchase, String str, Continuation<? super C30589OooOOo0> continuation) {
        super(2, continuation);
        this.f109463OooOo = c30584OooOOOo;
        this.f109466OooOoO0 = purchase;
        this.f109465OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30589OooOOo0(this.f109463OooOo, this.f109466OooOoO0, this.f109465OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30589OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
        int i = this.f109464OooOo0o;
        Purchase purchase = this.f109466OooOoO0;
        C30584OooOOOo c30584OooOOOo = this.f109463OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Object value = c30584OooOOOo.f109399OooO.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(value);
            String str = (String) value;
            boolean zOooO0Oo = purchase.OooO0Oo();
            String str2 = this.f109465OooOoO;
            if (zOooO0Oo) {
                this.f109464OooOo0o = 1;
                obj = c30584OooOOOo.f109400OooO0Oo.OooO0o(str2, purchase, str, this);
            } else if (purchase.OooO0O0() == 1) {
                C31042OooOOO0 c31042OooOOO0 = (C31042OooOOO0) c30584OooOOOo.f109413OooOOo0.getValue();
                String string = (c31042OooOOO0 == null || (bundle = c31042OooOOO0.f110825OooO) == null) ? null : bundle.getString("notein_offer_id");
                this.f109464OooOo0o = 2;
                obj = c30584OooOOOo.f109400OooO0Oo.OooOO0O(str2, purchase, string, str, this);
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
            c20358OooO00o.OooOOO0("PayViewModel");
            c20358OooO00o.OooO0OO("acknowledgePurchase response is null. " + purchase, new Object[0]);
            c30584OooOOOo.OooO0oo(Event.C23766OooO0oo.f78710OooO00o, null);
            return C32460OooOooO.f116667OooO00o;
        }
        if (c27174OooO0O0.f94862OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
            Gson gson = new Gson();
            JsonObject jsonObject = (JsonObject) gson.fromJson(purchase.f67096OooO00o, JsonObject.class);
            jsonObject.addProperty("acknowledged", Boolean.TRUE);
            c30584OooOOOo.OooO0oo(Event.OooO.f78702OooO00o, new Purchase(gson.toJson((JsonElement) jsonObject), purchase.f67097OooO0O0));
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o2, "PayViewModel", "acknowledgePurchase error. ", c27174OooO0O0), new Object[0]);
            c30584OooOOOo.OooO0oo(Event.C23766OooO0oo.f78710OooO00o, null);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
