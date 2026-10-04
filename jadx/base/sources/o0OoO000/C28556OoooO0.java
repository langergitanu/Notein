package o0OoO000;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$checkUnVerifiedUser$1", m80623f = "FirebaseLoginViewModel.kt", m80624l = {164}, m80625m = "invokeSuspend")
public final class C28556OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101209OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public FirebaseUser f101210OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28560OoooOOO f101211OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28556OoooO0(C28560OoooOOO c28560OoooOOO, Continuation<? super C28556OoooO0> continuation) {
        super(2, continuation);
        this.f101211OooOoO0 = c28560OoooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28556OoooO0(this.f101211OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28556OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        FirebaseUser firebaseUser;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101209OooOo;
        C28560OoooOOO c28560OoooOOO = this.f101211OooOoO0;
        FirebaseAuth firebaseAuth = c28560OoooOOO.f101228OooOO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            FirebaseUser currentUser = firebaseAuth.getCurrentUser();
            if (currentUser == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            String uid = currentUser.getUid();
            kotlin.jvm.internal.OooOOO0.OooO0o(uid, "getUid(...)");
            this.f101210OooOo0o = currentUser;
            this.f101209OooOo = 1;
            Object objOooO0Oo = c28560OoooOOO.f101223OooO0Oo.OooO0Oo(uid, this);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            firebaseUser = currentUser;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            firebaseUser = this.f101210OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((NoteinFirebaseUser) obj) == null && !firebaseUser.isAnonymous()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseLoginViewModel");
            c20358OooO00o.OooOO0O("checkUnboundFirebaseUser, unbound firebase user: " + firebaseUser, new Object[0]);
            firebaseAuth.signOut();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
