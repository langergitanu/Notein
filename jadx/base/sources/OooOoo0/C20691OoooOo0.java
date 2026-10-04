package OooOoo0;

import OooOooO.C20727OooO0Oo;
import OooOooO.C20729OooO0o0;
import OooOooO.InterfaceC20736OooOOO0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo0.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", m80623f = "Focusable.kt", m80624l = {162}, m80625m = "invokeSuspend")
public final class C20691OoooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f59394OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Oooo0oO.o00oO0O f59395OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59396OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<C20727OooO0Oo> f59397OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20691OoooOo0(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, Oooo0oO.o00oO0O o00oo0o, Continuation continuation) {
        super(2, continuation);
        this.f59397OooOoO0 = o00oo0o;
        this.f59396OooOoO = interfaceC20736OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20691OoooOo0(this.f59396OooOoO, this.f59397OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20691OoooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Oooo0oO.o00oO0O<C20727OooO0Oo> o00oo0o;
        Oooo0oO.o00oO0O<C20727OooO0Oo> o00oo0o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59394OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00oo0o = this.f59397OooOoO0;
            C20727OooO0Oo value = o00oo0o.getValue();
            if (value != null) {
                C20729OooO0o0 c20729OooO0o0 = new C20729OooO0o0(value);
                InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59396OooOoO;
                if (interfaceC20736OooOOO0 != null) {
                    this.f59395OooOo0o = o00oo0o;
                    this.f59394OooOo = 1;
                    if (interfaceC20736OooOOO0.OooO0OO(c20729OooO0o0, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    o00oo0o2 = o00oo0o;
                }
                o00oo0o.setValue(null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o00oo0o2 = this.f59395OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o00oo0o = o00oo0o2;
        o00oo0o.setValue(null);
        return C32460OooOooO.f116667OooO00o;
    }
}
