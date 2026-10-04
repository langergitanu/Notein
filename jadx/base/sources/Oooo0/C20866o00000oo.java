package Oooo0;

import OooOoOO.C20517OooO0O0;
import OooOoOO.C20518OooO0OO;
import OooOoOO.C20529OooOOOO;
import OooOoOO.C20548Oooo0O0;
import OooOoOO.C20549Oooo0OO;
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

/* JADX INFO: renamed from: Oooo0.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", m80623f = "TextFieldCursor.kt", m80624l = {52}, m80625m = "invokeSuspend")
public final class C20866o00000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<Float, C20529OooOOOO> f60019OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f60020OooOo0o;

    /* JADX INFO: renamed from: Oooo0.o00000oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", m80623f = "TextFieldCursor.kt", m80624l = {54, 56}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20518OooO0OO<Float, C20529OooOOOO> f60021OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60022OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60021OooOo = c20518OooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f60021OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            if (OooOoOO.C20518OooO0OO.OooO0O0(r2, r7, r1, r6) == r0) goto L18;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60022OooOo0o;
            C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO = this.f60021OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Float f = new Float(1.0f);
                this.f60022OooOo0o = 1;
                c20518OooO0OO.getClass();
                C20517OooO0O0 c20517OooO0O0 = new C20517OooO0O0(c20518OooO0OO, f, null);
                C20548Oooo0O0 c20548Oooo0O0 = c20518OooO0OO.f58604OooO0o;
                c20548Oooo0O0.getClass();
                Object objOooO0o0 = C33633Oooo0.OooO0o0(new C20549Oooo0OO(c20548Oooo0O0, c20517OooO0O0, null), this);
                if (objOooO0o0 != obj2) {
                    objOooO0o0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o0 != obj2) {
                }
                return obj2;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            Float f2 = new Float(0.0f);
            OooOoOO.Oooo000 oooo000 = C20880o0000oo.f60072OooO00o;
            this.f60022OooOo0o = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20866o00000oo(C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO, Continuation<? super C20866o00000oo> continuation) {
        super(2, continuation);
        this.f60019OooOo = c20518OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20866o00000oo(this.f60019OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20866o00000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60020OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20852Ooooo00 c20852Ooooo00 = C20852Ooooo00.f59958OooOo0o;
            OooO00o oooO00o = new OooO00o(this.f60019OooOo, null);
            this.f60020OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(c20852Ooooo00, oooO00o, this) == enumC32485OooO00o) {
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
