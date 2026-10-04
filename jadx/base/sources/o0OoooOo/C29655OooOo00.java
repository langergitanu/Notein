package o0OoooOo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoooOo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentViewModel$setSortKeyToCustomIfIsNot$2", m80623f = "EditorCommentViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29655OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C29652OooOOoo f105153OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29655OooOo00(Continuation continuation, C29652OooOOoo c29652OooOOoo) {
        super(2, continuation);
        this.f105153OooOo0o = c29652OooOOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29655OooOo00(continuation, this.f105153OooOo0o);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29655OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C29652OooOOoo c29652OooOOoo = this.f105153OooOo0o;
        T value = c29652OooOOoo.f105136OooOO0.f121747OooOo0o.getValue();
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o = com.orion.notein.p607ui.p609vo.OooO00o.f80096Oooo0O0;
        if (value != oooO00o) {
            c29652OooOOoo.OooO0o0(oooO00o);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
