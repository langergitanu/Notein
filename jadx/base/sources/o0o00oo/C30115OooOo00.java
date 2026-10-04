package o0o00oo;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0o00oOo.C30063OoooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$8$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1231}, m80625m = "invokeSuspend")
public final class C30115OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f107218OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f107219OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107220OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30115OooOo00(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30115OooOo00> continuation) {
        super(2, continuation);
        this.f107220OooOoO0 = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30115OooOo00(this.f107220OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30115OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ArrayList noteIdList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107218OooOo;
        NoteListContainerFragment noteListContainerFragment = this.f107220OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterable iterable = (Iterable) noteListContainerFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((NoteVO) it.next()).getId());
            }
            int size = arrayList.size();
            this.f107219OooOo0o = arrayList;
            this.f107218OooOo = 1;
            obj = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 37, size, null, this, 4);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            noteIdList = arrayList;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteIdList = this.f107219OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteIdList, "noteIdList");
            o00000OO o00000oo2 = oooO0OOOooOoo.f77173OooooOo;
            if (o00000oo2 == null || !o00000oo2.isActive()) {
                oooO0OOOooOoo.f77173OooooOo = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OOOooOoo), null, null, new C30063OoooO0(oooO0OOOooOoo, noteIdList, null), 3);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
