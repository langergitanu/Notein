package OooOoo0;

import OooOoo0.C20717o00o0O;
import OooOooO.C20731OooO0oo;
import OooOooO.InterfaceC20736OooOOO0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo0.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", m80623f = "Hoverable.kt", m80624l = {88}, m80625m = "invokeSuspend")
public final class C20722ooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f59560OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59561OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59562OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<C20731OooO0oo> f59563OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20722ooOO(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, Oooo0oO.o00oO0O o00oo0o, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f59560OooOo = z;
        this.f59563OooOoO0 = o00oo0o;
        this.f59562OooOoO = interfaceC20736OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20722ooOO(this.f59562OooOoO, this.f59563OooOoO0, continuation, this.f59560OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20722ooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59561OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!this.f59560OooOo) {
                this.f59561OooOo0o = 1;
                if (C20717o00o0O.OooO00o.OooO0O0(this.f59562OooOoO, this.f59563OooOoO0, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
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
