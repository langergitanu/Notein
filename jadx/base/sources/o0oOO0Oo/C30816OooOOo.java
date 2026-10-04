package o0oOO0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOO0Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteSwitchViewModel$setSortKey$1", m80623f = "NoteSwitchViewModel.kt", m80624l = {167}, m80625m = "invokeSuspend")
public final class C30816OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30821OooOo0O f110135OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110136OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f110137OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30816OooOOo(C30821OooOo0O c30821OooOo0O, com.orion.notein.p607ui.p609vo.OooO00o oooO00o, Continuation<? super C30816OooOOo> continuation) {
        super(2, continuation);
        this.f110135OooOo = c30821OooOo0O;
        this.f110137OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30816OooOOo(this.f110135OooOo, this.f110137OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30816OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110136OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30821OooOo0O c30821OooOo0O = this.f110135OooOo;
            String strName = this.f110137OooOoO0.name();
            this.f110136OooOo0o = 1;
            if (c30821OooOo0O.f110162OooO0o0.OooOO0O(strName, this) == enumC32485OooO00o) {
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
