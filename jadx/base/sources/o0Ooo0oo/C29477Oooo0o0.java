package o0Ooo0oo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$initQuaternaryViews$1$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {EditingLanguage.URDU}, m80625m = "invokeSuspend")
public final class C29477Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104564OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PenWidthVO f104565OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29477Oooo0o0(PenBarChildFragment penBarChildFragment, PenWidthVO penWidthVO, Continuation<? super C29477Oooo0o0> continuation) {
        super(2, continuation);
        this.f104563OooOo = penBarChildFragment;
        this.f104565OooOoO0 = penWidthVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29477Oooo0o0(this.f104563OooOo, this.f104565OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29477Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104564OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i2 = PenBarChildFragment.f75240o0000OOo;
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = this.f104563OooOo.Oooo0oO();
            this.f104564OooOo0o = 1;
            if (oooO0O0Oooo0oO.OooOOOo(this.f104565OooOoO0, this) == enumC32485OooO00o) {
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
