package o0o0OOoO;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0o0OOoO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$queryAndUpdateProductDetails$1", m80623f = "AiQuotaPayViewModel.kt", m80624l = {744, 746}, m80625m = "invokeSuspend")
public final class C30565OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109365OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f109366OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30558OooO0oo f109367OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30565OooOOO(C30558OooO0oo c30558OooO0oo, Continuation<? super C30565OooOOO> continuation) {
        super(2, continuation);
        this.f109367OooOoO0 = c30558OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30565OooOOO(this.f109367OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30565OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listO0ooOO0;
        List list;
        List list2;
        List list3;
        List list4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109365OooOo;
        C30558OooO0oo c30558OooO0oo = this.f109367OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            listO0ooOO0 = OooOo.o0ooOO0(((Map) c30558OooO0oo.f109317OooOoO0.getValue()).keySet());
            this.f109366OooOo0o = listO0ooOO0;
            this.f109365OooOo = 1;
            obj = c30558OooO0oo.f109297OooO0Oo.OooOO0(listO0ooOO0, "subs", this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f109366OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = (List) obj;
            list3 = list;
            if ((list3 != null || list3.isEmpty()) && ((list4 = list2) == null || list4.isEmpty())) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                c20358OooO00o.OooO0OO("subProductDetails and inAppProductDetails is empty", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33781o00o0O c33781o00o0O = c30558OooO0oo.f109308OooOOOo;
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            if (list != null) {
                c32465OooO0O0OooO0Oo.addAll(list);
            }
            if (list2 != null) {
                c32465OooO0O0OooO0Oo.addAll(list2);
            }
            c33781o00o0O.setValue(com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo));
            return C32460OooOooO.f116667OooO00o;
        }
        listO0ooOO0 = this.f109366OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list5 = (List) obj;
        InterfaceC27300OooOOOo interfaceC27300OooOOOo = c30558OooO0oo.f109297OooO0Oo;
        this.f109366OooOo0o = list5;
        this.f109365OooOo = 2;
        Object objOooOO0 = interfaceC27300OooOOOo.OooOO0(listO0ooOO0, "inapp", this);
        if (objOooOO0 != enumC32485OooO00o) {
            list = list5;
            obj = objOooOO0;
            list2 = (List) obj;
            list3 = list;
            if (list3 != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("AiQuotaPayViewModel");
                c20358OooO00o2.OooO0OO("subProductDetails and inAppProductDetails is empty", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("AiQuotaPayViewModel");
            c20358OooO00o22.OooO0OO("subProductDetails and inAppProductDetails is empty", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
            C33781o00o0O c33781o00o0O2 = c30558OooO0oo.f109308OooOOOo;
            C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
            if (list != null) {
            }
            if (list2 != null) {
            }
            c33781o00o0O2.setValue(com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2));
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
