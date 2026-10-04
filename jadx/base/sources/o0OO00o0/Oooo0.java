package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$getByPageIdsSync$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class Oooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super List<? extends DualLinkRefEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Set<String> f91070OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91071OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Set<String> set, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f91070OooOo = set;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo0 oooo0 = new Oooo0(this.f91070OooOo, continuation);
        oooo0.f91071OooOo0o = obj;
        return oooo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super List<? extends DualLinkRefEntity>> continuation) {
        return ((Oooo0) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        oo0oO0.oo000o oo000oVar = (oo0oO0.oo000o) this.f91071OooOo0o;
        ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, this.f91070OooOo);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOo0o0Oo, 10));
        Iterator it = arrayListOo0o0Oo.iterator();
        while (it.hasNext()) {
            arrayList.add(oo000oVar.OooO0oO((List) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = oOo000Oo.OooOo.OooooOO((List) next, (List) it2.next());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        List list = (List) obj2;
        return list == null ? C34434OooOoO.f123453OooOo0o : list;
    }
}
