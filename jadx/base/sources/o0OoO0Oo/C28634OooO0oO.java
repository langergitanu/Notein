package o0OoO0Oo;

import com.orion.notein.domain.models.transactions.Product;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.membership.plan.MembershipPlanViewModel$detailDescription$1", m80623f = "MembershipPlanViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28634OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Product>, Integer, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f101499OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f101500OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Product> list, Integer num, Continuation<? super String> continuation) {
        int iIntValue = num.intValue();
        C28634OooO0oO c28634OooO0oO = new C28634OooO0oO(3, continuation);
        c28634OooO0oO.f101500OooOo0o = list;
        c28634OooO0oO.f101499OooOo = iIntValue;
        return c28634OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f101500OooOo0o;
        int i = this.f101499OooOo;
        return list.isEmpty() ? "您的网络可能出现问题，请稍后再试" : i >= list.size() ? "" : ((Product) list.get(i)).getDetailDescription();
    }
}
