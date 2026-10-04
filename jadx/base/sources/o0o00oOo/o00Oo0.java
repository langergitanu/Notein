package o0o00oOo;

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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$sortKeyList$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00Oo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<com.orion.notein.p607ui.p609vo.OooO00o, Boolean, Continuation<? super List<? extends SortKeyVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f107092OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f107093OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(com.orion.notein.p607ui.p609vo.OooO00o oooO00o, Boolean bool, Continuation<? super List<? extends SortKeyVO>> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        o00Oo0 o00oo02 = new o00Oo0(3, continuation);
        o00oo02.f107093OooOo0o = oooO00o;
        o00oo02.f107092OooOo = zBooleanValue;
        return o00oo02.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o = this.f107093OooOo0o;
        boolean z = this.f107092OooOo;
        com.orion.notein.p607ui.p609vo.OooO00o.f80086OooOoO0.getClass();
        ArrayList<com.orion.notein.p607ui.p609vo.OooO00o> arrayListOooO00o = OooO00o.C19582OooO00o.OooO00o();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO00o, 10));
        for (com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 : arrayListOooO00o) {
            boolean z2 = false;
            boolean z3 = oooO00o2 == oooO00o;
            if (oooO00o2 == com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0 && z) {
                z2 = true;
            }
            arrayList.add(new SortKeyVO(oooO00o2, z3, z2));
        }
        return arrayList;
    }
}
