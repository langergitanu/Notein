package o0OoOoo0;

import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOoo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment$onViewInitialed$1$2", m80623f = "LatestOpenedNoteTabFragment.kt", m80624l = {105}, m80625m = "invokeSuspend")
public final class C29239OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LatestOpenedNoteTabFragment f103676OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103677OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ LatestOpenedNoteVO f103678OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29239OooOOOO(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment, LatestOpenedNoteVO latestOpenedNoteVO, Continuation<? super C29239OooOOOO> continuation) {
        super(2, continuation);
        this.f103676OooOo = latestOpenedNoteTabFragment;
        this.f103678OooOoO0 = latestOpenedNoteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29239OooOOOO(this.f103676OooOo, this.f103678OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29239OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103677OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String noteId = this.f103678OooOoO0.getNoteId();
            this.f103677OooOo0o = 1;
            if (LatestOpenedNoteTabFragment.OooOoO(this.f103676OooOo, noteId, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
