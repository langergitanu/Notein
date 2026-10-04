package OooOoo0;

import OooOooO.C20727OooO0Oo;
import OooOooO.C20729OooO0o0;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo000.InterfaceC20896OooO0o0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", m80623f = "Focusable.kt", m80624l = {147, 151, 154}, m80625m = "invokeSuspend")
public final class C20690OoooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f59389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f59390OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59391OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<C20727OooO0Oo> f59392OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20896OooO0o0 f59393OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20690OoooOOo(Oooo0oO.o00oO0O<C20727OooO0Oo> o00oo0o, InterfaceC20736OooOOO0 interfaceC20736OooOOO0, InterfaceC20896OooO0o0 interfaceC20896OooO0o0, Continuation<? super C20690OoooOOo> continuation) {
        super(2, continuation);
        this.f59392OooOoO0 = o00oo0o;
        this.f59391OooOoO = interfaceC20736OooOOO0;
        this.f59393OooOoOO = interfaceC20896OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20690OoooOOo(this.f59392OooOoO0, this.f59391OooOoO, this.f59393OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20690OoooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r2.OooO0OO(r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r8.f59393OooOoOO.OooO00o(null, r8) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Oooo0oO.o00oO0O<C20727OooO0Oo> o00oo0o;
        C20727OooO0Oo c20727OooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59389OooOo;
        InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59391OooOoO;
        Oooo0oO.o00oO0O<C20727OooO0Oo> o00oo0o2 = this.f59392OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20727OooO0Oo value = o00oo0o2.getValue();
            if (value != null) {
                C20729OooO0o0 c20729OooO0o0 = new C20729OooO0o0(value);
                if (interfaceC20736OooOOO0 != null) {
                    this.f59390OooOo0o = o00oo0o2;
                    this.f59389OooOo = 1;
                }
                o00oo0o = o00oo0o2;
            } else {
                c20727OooO0Oo = new C20727OooO0Oo();
                if (interfaceC20736OooOOO0 != null) {
                    this.f59390OooOo0o = c20727OooO0Oo;
                    this.f59389OooOo = 2;
                    if (interfaceC20736OooOOO0.OooO0OO(c20727OooO0Oo, this) != enumC32485OooO00o) {
                    }
                }
                o00oo0o2.setValue(c20727OooO0Oo);
                this.f59390OooOo0o = null;
                this.f59389OooOo = 3;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            o00oo0o = (Oooo0oO.o00oO0O) this.f59390OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c20727OooO0Oo = (C20727OooO0Oo) this.f59390OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            o00oo0o2.setValue(c20727OooO0Oo);
            this.f59390OooOo0o = null;
            this.f59389OooOo = 3;
        }
        o00oo0o.setValue(null);
        c20727OooO0Oo = new C20727OooO0Oo();
        if (interfaceC20736OooOOO0 != null) {
        }
        o00oo0o2.setValue(c20727OooO0Oo);
        this.f59390OooOo0o = null;
        this.f59389OooOo = 3;
    }
}
