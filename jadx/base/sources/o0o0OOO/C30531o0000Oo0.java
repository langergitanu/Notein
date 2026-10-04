package o0o0OOO;

import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOO.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$handleColorClick$2", m80623f = "StandardTemplateFragment.kt", m80624l = {533}, m80625m = "invokeSuspend")
public final class C30531o0000Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ StandardTemplateFragment f109142OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109143OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PageColorThemeVO f109144OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30531o0000Oo0(StandardTemplateFragment standardTemplateFragment, PageColorThemeVO pageColorThemeVO, Continuation<? super C30531o0000Oo0> continuation) {
        super(2, continuation);
        this.f109142OooOo = standardTemplateFragment;
        this.f109144OooOoO0 = pageColorThemeVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30531o0000Oo0(this.f109142OooOo, this.f109144OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30531o0000Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109143OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30520o000000o c30520o000000oOooOooo = this.f109142OooOo.OooOooo();
            int color = this.f109144OooOoO0.getColor();
            this.f109143OooOo0o = 1;
            if (c30520o000000oOooOooo.OooOO0o(color, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            ((C32445OooOOOO) obj).getClass();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
