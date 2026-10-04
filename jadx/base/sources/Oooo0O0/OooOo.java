package Oooo0O0;

import OooOoOO.C20517OooO0O0;
import OooOoOO.C20518OooO0OO;
import OooOoOO.C20530OooOOOo;
import OooOoOO.C20548Oooo0O0;
import OooOoOO.C20549Oooo0OO;
import Oooo0oO.C21106o000Ooo;
import Oooo0oO.o000O0;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", m80623f = "SelectionMagnifier.kt", m80624l = {88}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f60359OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f60360OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> f60361OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o000O0<C21290OooO0o0> f60362OooOoO0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C21290OooO0o0> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o000O0<C21290OooO0o0> f60363OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O0<C21290OooO0o0> o000o0) {
            super(0);
            this.f60363OooOo0o = o000o0;
        }

        @Override // oO0O000o.OooO00o
        public final C21290OooO0o0 invoke() {
            C20530OooOOOo c20530OooOOOo = C20923OooOo0.f60366OooO00o;
            return new C21290OooO0o0(this.f60363OooOo0o.getValue().f61722OooO00o);
        }
    }

    public static final class OooO0O0 implements InterfaceC33723OooO0oO<C21290OooO0o0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33636Oooo00o f60364OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> f60365OooOo0o;

        public OooO0O0(C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> c20518OooO0OO, InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
            this.f60365OooOo0o = c20518OooO0OO;
            this.f60364OooOo = interfaceC33636Oooo00o;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(C21290OooO0o0 c21290OooO0o0, Continuation continuation) {
            long j = c21290OooO0o0.f61722OooO00o;
            C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> c20518OooO0OO = this.f60365OooOo0o;
            if (C21289OooO0o.OooO0o(c20518OooO0OO.OooO0OO().f61722OooO00o) && C21289OooO0o.OooO0o(j) && C21290OooO0o0.OooO0Oo(c20518OooO0OO.OooO0OO().f61722OooO00o) != C21290OooO0o0.OooO0Oo(j)) {
                C33609OooO0oo.OooO0OO(this.f60364OooOo, null, null, new C20927OooOoO0(c20518OooO0OO, j, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
            C20517OooO0O0 c20517OooO0O0 = new C20517OooO0O0(c20518OooO0OO, new C21290OooO0o0(j), null);
            C20548Oooo0O0 c20548Oooo0O0 = c20518OooO0OO.f58604OooO0o;
            c20548Oooo0O0.getClass();
            Object objOooO0o0 = C33633Oooo0.OooO0o0(new C20549Oooo0OO(c20548Oooo0O0, c20517OooO0O0, null), continuation);
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooO0o0 != enumC32485OooO00o) {
                objOooO0o0 = C32460OooOooO.f116667OooO00o;
            }
            return objOooO0o0 == enumC32485OooO00o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o000O0<C21290OooO0o0> o000o0, C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> c20518OooO0OO, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f60362OooOoO0 = o000o0;
        this.f60361OooOoO = c20518OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOo oooOo = new OooOo(this.f60362OooOoO0, this.f60361OooOoO, continuation);
        oooOo.f60359OooOo = obj;
        return oooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60360OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f60359OooOo;
            C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C21106o000Ooo(new OooO00o(this.f60362OooOoO0), null));
            OooO0O0 oooO0O0 = new OooO0O0(this.f60361OooOoO, interfaceC33636Oooo00o);
            this.f60360OooOo0o = 1;
            if (c33770OooooO0.collect(oooO0O0, this) == enumC32485OooO00o) {
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
