package Oooo0oO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: Oooo0oO.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", m80623f = "ActualAndroid.android.kt", m80624l = {52}, m80625m = "invokeSuspend")
public final class C21088o0000Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Long, Object> f61136OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f61137OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21088o0000Oo0(InterfaceC32507OooOO0o<? super Long, Object> interfaceC32507OooOO0o, Continuation<? super C21088o0000Oo0> continuation) {
        super(2, continuation);
        this.f61136OooOo = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C21088o0000Oo0(this.f61136OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C21088o0000Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f61137OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f61137OooOo0o = 1;
            if (C33644OoooO0.OooO00o(16L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return this.f61136OooOo.invoke(new Long(System.nanoTime()));
    }
}
