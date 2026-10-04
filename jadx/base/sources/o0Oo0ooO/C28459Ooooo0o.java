package o0Oo0ooO;

import com.orion.notein.domain.models.Label;
import com.orion.notein.p607ui.label.C23139OooOO0o;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27306OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0ooO.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelViewModel$updateLabel$1", m80623f = "LabelViewModel.kt", m80624l = {168}, m80625m = "invokeSuspend")
public final class C28459Ooooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23139OooOO0o f100847OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100848OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Label f100849OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28459Ooooo0o(C23139OooOO0o c23139OooOO0o, Label label, Continuation<? super C28459Ooooo0o> continuation) {
        super(2, continuation);
        this.f100847OooOo = c23139OooOO0o;
        this.f100849OooOoO0 = label;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28459Ooooo0o(this.f100847OooOo, this.f100849OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28459Ooooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100848OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27306OooOo00 interfaceC27306OooOo00 = this.f100847OooOo.f72070OooO0Oo;
            this.f100848OooOo0o = 1;
            if (interfaceC27306OooOo00.OooOOo(this.f100849OooOoO0, this) == enumC32485OooO00o) {
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
