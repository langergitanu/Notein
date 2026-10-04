package o0000oo0;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.C24335OooO0OO;
import oO00o.AbstractC32320OooO0oO;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0O.C33861OooO0Oo;

/* JADX INFO: renamed from: o0000oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.rxjava3.RxDataStore$updateDataAsync$1", m80623f = "RxDataStore.kt", m80624l = {124}, m80625m = "invokeSuspend")
public final class C24355OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24356OooO0O0<Object> f82128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f82129OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32403OooO0OO<Object, AbstractC32320OooO0oO<Object>> f82130OooOoO0;

    /* JADX INFO: renamed from: o0000oo0.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.rxjava3.RxDataStore$updateDataAsync$1$1", m80623f = "RxDataStore.kt", m80624l = {125}, m80625m = "invokeSuspend")
    public static final class C19611OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Object, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f82131OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f82132OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32403OooO0OO<Object, AbstractC32320OooO0oO<Object>> f82133OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19611OooO00o(InterfaceC32403OooO0OO<Object, AbstractC32320OooO0oO<Object>> interfaceC32403OooO0OO, Continuation<? super C19611OooO00o> continuation) {
            super(2, continuation);
            this.f82133OooOoO0 = interfaceC32403OooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C19611OooO00o c19611OooO00o = new C19611OooO00o(this.f82133OooOoO0, continuation);
            c19611OooO00o.f82131OooOo = obj;
            return c19611OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Object obj, Continuation<Object> continuation) {
            return ((C19611OooO00o) create(obj, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f82132OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32320OooO0oO<Object> abstractC32320OooO0oOApply = this.f82133OooOoO0.apply(this.f82131OooOo);
            OooOOO0.OooO0o(abstractC32320OooO0oOApply, "transform.apply(it)");
            this.f82132OooOo0o = 1;
            C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(this));
            c33614OooOOO0.OooOOoo();
            abstractC32320OooO0oOApply.OooO00o(new C33861OooO0Oo(c33614OooOOO0));
            Object objOooOOo = c33614OooOOO0.OooOOo();
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24355OooO00o(C24356OooO0O0<Object> c24356OooO0O0, InterfaceC32403OooO0OO<Object, AbstractC32320OooO0oO<Object>> interfaceC32403OooO0OO, Continuation<? super C24355OooO00o> continuation) {
        super(2, continuation);
        this.f82128OooOo = c24356OooO0O0;
        this.f82130OooOoO0 = interfaceC32403OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24355OooO00o(this.f82128OooOo, this.f82130OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C24355OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f82129OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C24335OooO0OO c24335OooO0OO = this.f82128OooOo.f82135OooOo0o;
        C19611OooO00o c19611OooO00o = new C19611OooO00o(this.f82130OooOoO0, null);
        this.f82129OooOo0o = 1;
        Object objOooO00o = c24335OooO0OO.OooO00o(c19611OooO00o, this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
