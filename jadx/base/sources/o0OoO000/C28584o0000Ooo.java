package o0OoO000;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import kotlin.coroutines.Continuation;
import o0000OO.C24163OooOOOo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24192Oooo0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.o0000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$signInWithGoogle$1", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {423}, m80625m = "invokeSuspend")
public final class C28584o0000Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101319OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101320OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f101321OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24192Oooo0oo f101322OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28584o0000Ooo(FirebaseUserLoginFragment firebaseUserLoginFragment, C24192Oooo0oo c24192Oooo0oo, boolean z, Continuation<? super C28584o0000Ooo> continuation) {
        super(2, continuation);
        this.f101319OooOo = firebaseUserLoginFragment;
        this.f101322OooOoO0 = c24192Oooo0oo;
        this.f101321OooOoO = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28584o0000Ooo(this.f101319OooOo, this.f101322OooOoO0, this.f101321OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28584o0000Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101320OooOo0o;
        FirebaseUserLoginFragment firebaseUserLoginFragment = this.f101319OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                firebaseUserLoginFragment.Oooo0oo(true);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = firebaseUserLoginFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                o0000OO0.OooOOOO oooOOOO = new o0000OO0.OooOOOO(activityC21897OooOo0RequireActivity);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity2 = firebaseUserLoginFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity2, "requireActivity(...)");
                C24192Oooo0oo c24192Oooo0oo = this.f101322OooOoO0;
                this.f101320OooOo0o = 1;
                obj = oooOOOO.OooO0O0(activityC21897OooOo0RequireActivity2, c24192Oooo0oo, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            FirebaseUserLoginFragment.Oooo00o(firebaseUserLoginFragment, (C24183Oooo) obj);
        } catch (o0000OO.OooOO0O e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o.OooO0OO(C22237OooO0o0.OooO00o("Error getting credential. type=", e.OooO00o(), ", message=", e.getMessage()), new Object[0]);
            if (this.f101321OooOoO && (e instanceof C24163OooOOOo)) {
                firebaseUserLoginFragment.OoooO00(false);
            } else {
                firebaseUserLoginFragment.Oooo0o(1006);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
