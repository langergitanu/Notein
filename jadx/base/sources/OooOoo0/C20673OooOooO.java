package OooOoo0;

import OooOooO.C20738OooOOOo;
import OooOooO.C20740OooOOo0;
import OooOooO.InterfaceC20736OooOOO0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", m80623f = "Clickable.kt", m80624l = {549}, m80625m = "invokeSuspend")
public final class C20673OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59332OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59333OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20738OooOOOo f59334OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20673OooOooO(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, C20738OooOOOo c20738OooOOOo, Continuation<? super C20673OooOooO> continuation) {
        super(2, continuation);
        this.f59332OooOo = interfaceC20736OooOOO0;
        this.f59334OooOoO0 = c20738OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20673OooOooO(this.f59332OooOo, this.f59334OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20673OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59333OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20740OooOOo0 c20740OooOOo0 = new C20740OooOOo0(this.f59334OooOoO0);
            this.f59333OooOo0o = 1;
            if (this.f59332OooOo.OooO0OO(c20740OooOOo0, this) == enumC32485OooO00o) {
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
