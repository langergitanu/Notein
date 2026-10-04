package o0o00oo;

import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$10$2$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1275}, m80625m = "invokeSuspend")
public final class C30107OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107189OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107190OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30107OooOOOO(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30107OooOOOO> continuation) {
        super(2, continuation);
        this.f107189OooOo = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30107OooOOOO(this.f107189OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30107OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107190OooOo0o;
        NoteListContainerFragment noteListContainerFragment = this.f107189OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
            this.f107190OooOo0o = 1;
            if (oooO0OOOooOoo.OooOO0o(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        noteListContainerFragment.OooOoo().Oooo000(0);
        return C32460OooOooO.f116667OooO00o;
    }
}
