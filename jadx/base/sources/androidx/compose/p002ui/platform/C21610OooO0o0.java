package androidx.compose.p002ui.platform;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: androidx.compose.ui.platform.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", m80623f = "Wrapper.android.kt", m80624l = {153}, m80625m = "invokeSuspend")
public final class C21610OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21612OooO0oo f63509OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f63510OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21610OooO0o0(C21612OooO0oo c21612OooO0oo, Continuation<? super C21610OooO0o0> continuation) {
        super(2, continuation);
        this.f63509OooOo = c21612OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C21610OooO0o0(this.f63509OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C21610OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f63510OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AndroidComposeView androidComposeView = this.f63509OooOo.f63514OooOo0o;
            this.f63510OooOo0o = 1;
            Object objOooO0O0 = androidComposeView.f63379Oooo00o.OooO0O0(this);
            if (objOooO0O0 != enumC32485OooO00o) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0O0 == enumC32485OooO00o) {
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
