package o0OoO0Oo;

import com.orion.notein.domain.models.transactions.Product;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.membership.plan.MembershipPlanViewModel$selectedIndex$1", m80623f = "MembershipPlanViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28638OooOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Product>, String, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f101510OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f101511OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Product> list, String str, Continuation<? super Integer> continuation) {
        C28638OooOO0o c28638OooOO0o = new C28638OooOO0o(3, continuation);
        c28638OooOO0o.f101511OooOo0o = list;
        c28638OooOO0o.f101510OooOo = str;
        return c28638OooOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f101511OooOo0o;
        String str = this.f101510OooOo;
        int i = 0;
        if (str != null) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Product) it.next()).getId(), str)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                i = i2;
            }
        } else {
            Iterator it2 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((Product) it2.next()).getSuggestion()) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        return new Integer(i);
    }
}
