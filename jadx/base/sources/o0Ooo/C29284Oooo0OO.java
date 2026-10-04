package o0Ooo;

import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$12$1$1", m80623f = "PenBoxChildFragment.kt", m80624l = {1010}, m80625m = "invokeSuspend")
public final class C29284Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103820OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103821OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29284Oooo0OO(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29284Oooo0OO> continuation) {
        super(2, continuation);
        this.f103820OooOo = penBoxChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29284Oooo0OO(this.f103820OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29284Oooo0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103821OooOo0o;
        PenBoxChildFragment penBoxChildFragment = this.f103820OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f103821OooOo0o = 1;
            obj = PenBoxChildFragment.OooOoo0(penBoxChildFragment, 11, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            int i2 = PenBoxChildFragment.f75355o0000Ooo;
            penBoxChildFragment.Oooo0o().OooOOO0(DrawToolFactory.LASSO_TYPE_CAPTURE);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
