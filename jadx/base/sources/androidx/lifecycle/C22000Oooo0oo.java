package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: androidx.lifecycle.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m80623f = "PausingDispatcher.kt", m80624l = {203}, m80625m = "invokeSuspend")
public final class C22000Oooo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f65598OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f65599OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC21979OooOOo0.OooO0O0 f65600OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC21979OooOOo0 f65601OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f65602OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22000Oooo0oo(AbstractC21979OooOOo0 abstractC21979OooOOo0, AbstractC21979OooOOo0.OooO0O0 oooO0O0, InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C22000Oooo0oo> continuation) {
        super(2, continuation);
        this.f65601OooOoO0 = abstractC21979OooOOo0;
        this.f65600OooOoO = oooO0O0;
        this.f65602OooOoOO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C22000Oooo0oo c22000Oooo0oo = new C22000Oooo0oo(this.f65601OooOoO0, this.f65600OooOoO, this.f65602OooOoOO, continuation);
        c22000Oooo0oo.f65598OooOo = obj;
        return c22000Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C22000Oooo0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        C21980OooOOoo c21980OooOOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f65599OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21980OooOOoo = (C21980OooOOoo) this.f65598OooOo;
            try {
                C32446OooOOOo.OooO0O0(obj);
                c21980OooOOoo.OooO00o();
                return obj;
            } catch (Throwable th) {
                th = th;
                c21980OooOOoo.OooO00o();
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) ((InterfaceC33636Oooo00o) this.f65598OooOo).OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        C21999Oooo0oO c21999Oooo0oO = new C21999Oooo0oO();
        C21980OooOOoo c21980OooOOoo2 = new C21980OooOOoo(this.f65601OooOoO0, this.f65600OooOoO, c21999Oooo0oO.f65597OooOoO0, interfaceC33672o00ooo);
        try {
            ?? r8 = this.f65602OooOoOO;
            this.f65598OooOo = c21980OooOOoo2;
            this.f65599OooOo0o = 1;
            obj = C33609OooO0oo.OooO0o(c21999Oooo0oO, r8, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c21980OooOOoo = c21980OooOOoo2;
            c21980OooOOoo.OooO00o();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c21980OooOOoo = c21980OooOOoo2;
            c21980OooOOoo.OooO00o();
            throw th;
        }
    }
}
