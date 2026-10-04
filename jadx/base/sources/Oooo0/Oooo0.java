package Oooo0;

import Oooo000.InterfaceC20896OooO0o0;
import OooooO0.C21291OooO0oO;
import kotlin.coroutines.Continuation;
import o00000.InterfaceC24054OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", m80623f = "CoreTextField.kt", m80624l = {308}, m80625m = "invokeSuspend")
public final class Oooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20896OooO0o0 f59885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59886OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59887OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00000.Oooo0 f59888OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f59889OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24054OooOo0 f59890OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(InterfaceC20896OooO0o0 interfaceC20896OooO0o0, o00000.Oooo0 oooo0, o000O0 o000o0, o000O0Oo o000o0oo2, InterfaceC24054OooOo0 interfaceC24054OooOo0, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f59885OooOo = interfaceC20896OooO0o0;
        this.f59888OooOoO0 = oooo0;
        this.f59887OooOoO = o000o0;
        this.f59889OooOoOO = o000o0oo2;
        this.f59890OooOoo0 = interfaceC24054OooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo0(this.f59885OooOo, this.f59888OooOoO0, this.f59887OooOoO, this.f59889OooOoOO, this.f59890OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C21291OooO0oO c21291OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59886OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20864o00000o0 c20864o00000o0 = this.f59887OooOoO.f60101OooO00o;
            C34695OooOOo0 c34695OooOOo0 = this.f59889OooOoOO.f60144OooO00o;
            this.f59886OooOo0o = 1;
            int iOooO0O0 = this.f59890OooOoo0.OooO0O0(C34696OooOOoo.OooO0OO(this.f59888OooOoO0.f81084OooO0O0));
            if (iOooO0O0 < c34695OooOOo0.f124972OooO00o.f124963OooO00o.f124887OooOo0o.length()) {
                c21291OooO0oO = c34695OooOOo0.OooO0O0(iOooO0O0);
            } else if (iOooO0O0 != 0) {
                c21291OooO0oO = c34695OooOOo0.OooO0O0(iOooO0O0 - 1);
            } else {
                c21291OooO0oO = new C21291OooO0oO(0.0f, 0.0f, 1.0f, (int) (o0000O0O.OooO00o(c20864o00000o0.f60010OooO0O0, c20864o00000o0.f60015OooO0oO, c20864o00000o0.f60016OooO0oo, o0000O0O.f60030OooO00o, 1) & 4294967295L));
            }
            Object objOooO00o = this.f59885OooOo.OooO00o(c21291OooO0oO, this);
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == enumC32485OooO00o) {
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
