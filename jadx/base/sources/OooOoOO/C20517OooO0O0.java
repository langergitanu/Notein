package OooOoOO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.animation.core.Animatable$snapTo$2", m80623f = "Animatable.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C20517OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58597OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<Object, AbstractC20531OooOOo> f58598OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20517OooO0O0(C20518OooO0OO<Object, AbstractC20531OooOOo> c20518OooO0OO, Object obj, Continuation<? super C20517OooO0O0> continuation) {
        super(1, continuation);
        this.f58598OooOo0o = c20518OooO0OO;
        this.f58597OooOo = obj;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C20517OooO0O0(this.f58598OooOo0o, this.f58597OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
        return ((C20517OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C20518OooO0OO<Object, AbstractC20531OooOOo> c20518OooO0OO = this.f58598OooOo0o;
        C20527OooOOO<Object, V> c20527OooOOO = c20518OooO0OO.f58602OooO0OO;
        c20527OooOOO.f58640OooOoO0.OooO0Oo();
        c20527OooOOO.f58639OooOoO = Long.MIN_VALUE;
        c20518OooO0OO.f58603OooO0Oo.setValue(Boolean.FALSE);
        Object objOooO00o = C20518OooO0OO.OooO00o(c20518OooO0OO, this.f58597OooOo);
        c20518OooO0OO.f58602OooO0OO.f58637OooOo.setValue(objOooO00o);
        c20518OooO0OO.f58605OooO0o0.setValue(objOooO00o);
        return C32460OooOooO.f116667OooO00o;
    }
}
