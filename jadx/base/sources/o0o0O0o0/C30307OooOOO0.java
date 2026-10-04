package o0o0O0o0;

import com.orion.notein.domain.models.User;
import com.orion.notein.p607ui.p609vo.OooO00o;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
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

/* JADX INFO: renamed from: o0o0O0o0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$sortKeyList$1", m80623f = "SearchViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30307OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<com.orion.notein.p607ui.p609vo.OooO00o, User, Continuation<? super List<? extends SortKeyVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ User f108061OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f108062OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(com.orion.notein.p607ui.p609vo.OooO00o oooO00o, User user, Continuation<? super List<? extends SortKeyVO>> continuation) {
        C30307OooOOO0 c30307OooOOO0 = new C30307OooOOO0(3, continuation);
        c30307OooOOO0.f108062OooOo0o = oooO00o;
        c30307OooOOO0.f108061OooOo = user;
        return c30307OooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o = this.f108062OooOo0o;
        User user = this.f108061OooOo;
        com.orion.notein.p607ui.p609vo.OooO00o.f80086OooOoO0.getClass();
        ArrayList<com.orion.notein.p607ui.p609vo.OooO00o> arrayListOooO00o = OooO00o.C19582OooO00o.OooO00o();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO00o, 10));
        for (com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 : arrayListOooO00o) {
            boolean z = false;
            boolean z2 = oooO00o2 == oooO00o;
            if (oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0 && ((user == null || !user.isVip()) && (user == null || !user.isFreeTrial()))) {
                z = true;
            }
            arrayList.add(new SortKeyVO(oooO00o2, z2, z));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((SortKeyVO) obj2).getKey() != com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
