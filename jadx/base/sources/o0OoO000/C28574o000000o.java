package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import kotlin.coroutines.Continuation;
import o000o0O0.C24587OooOoo;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$confirmLoginWithGoogle$1", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {497}, m80625m = "invokeSuspend")
public final class C28574o000000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101278OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101279OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24587OooOoo f101280OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0000 f101281OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28574o000000o(FirebaseUserLoginFragment firebaseUserLoginFragment, o0000 o0000Var, C24587OooOoo c24587OooOoo, Continuation continuation) {
        super(2, continuation);
        this.f101278OooOo = firebaseUserLoginFragment;
        this.f101281OooOoO0 = o0000Var;
        this.f101280OooOoO = c24587OooOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28574o000000o(this.f101278OooOo, this.f101281OooOoO0, this.f101280OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28574o000000o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101279OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f101279OooOo0o = 1;
            if (C33644OoooO0.OooO00o(3000L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        FirebaseUserLoginFragment firebaseUserLoginFragment = this.f101278OooOo;
        firebaseUserLoginFragment.Oooo0oo(false);
        C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(firebaseUserLoginFragment), this.f101281OooOoO0, this.f101280OooOoO);
        return C32460OooOooO.f116667OooO00o;
    }
}
