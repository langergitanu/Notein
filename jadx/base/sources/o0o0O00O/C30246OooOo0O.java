package o0o0O00O;

import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0o00oOo.C30030OooO0O0;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0O00O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$initNoteMorePopupWindow$1$setFilterFolderColor$1", m80623f = "LabelListFragment.kt", m80624l = {165}, m80625m = "invokeSuspend")
public final class C30246OooOo0O extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelListFragment f107771OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107772OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f107773OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f107774OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30246OooOo0O(LabelListFragment labelListFragment, String str, int i, Continuation<? super C30246OooOo0O> continuation) {
        super(1, continuation);
        this.f107771OooOo = labelListFragment;
        this.f107774OooOoO0 = str;
        this.f107773OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C30246OooOo0O(this.f107771OooOo, this.f107774OooOoO0, this.f107773OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
        return ((C30246OooOo0O) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107772OooOo0o;
        LabelListFragment labelListFragment = this.f107771OooOo;
        int i2 = this.f107773OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
            this.f107772OooOo0o = 1;
            if (oooO0OOOooOoo.OooOoo0(this.f107774OooOoO0, i2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Iterable iterable = (Iterable) labelListFragment.OooOoo().f77140OooOo0o.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (((C31040OooOO0o) obj2).f110821OooO00o != 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i3 = ((C31040OooOO0o) it.next()).f110821OooO00o;
            arrayList2.add(new C31040OooOO0o(i3, i2 == i3));
        }
        C30030OooO0O0 c30030OooO0O0 = labelListFragment.f77768Oooo0o0;
        if (c30030OooO0O0 != null) {
            c30030OooO0O0.OooO00o(arrayList2);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorPopupWindow");
        throw null;
    }
}
