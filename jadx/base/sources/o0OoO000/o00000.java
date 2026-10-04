package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.OAuthCredential;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import java.util.Map;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$confirmLoginWithMicrosoft$1", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {383, 402}, m80625m = "invokeSuspend")
public final class o00000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f101271OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f101272OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AuthResult f101273OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f101274OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101275OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(AuthResult authResult, FirebaseUserLoginFragment firebaseUserLoginFragment, Continuation<? super o00000> continuation) {
        super(2, continuation);
        this.f101273OooOoO = authResult;
        this.f101275OooOoOO = firebaseUserLoginFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00000(this.f101273OooOoO, this.f101275OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r5 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        Uri photoUrl;
        Object objOooO0o;
        C24587OooOoo c24587OooOoo;
        o000o0O0.OooOo oooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101274OooOoO0;
        FirebaseUserLoginFragment firebaseUserLoginFragment = this.f101275OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AuthResult authResult = this.f101273OooOoO;
            FirebaseUser user = authResult.getUser();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(user);
            AuthCredential credential = authResult.getCredential();
            kotlin.jvm.internal.OooOOO0.OooO0o0(credential, "null cannot be cast to non-null type com.google.firebase.auth.OAuthCredential");
            String accessToken = ((OAuthCredential) credential).getAccessToken();
            AdditionalUserInfo additionalUserInfo = authResult.getAdditionalUserInfo();
            Map<String, Object> profile = additionalUserInfo != null ? additionalUserInfo.getProfile() : null;
            Object obj2 = profile != null ? profile.get(CommonConstant.KEY_DISPLAY_NAME) : null;
            str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                str = "";
            }
            Object obj3 = profile != null ? profile.get("mail") : null;
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            str2 = str3 == null ? "" : str3;
            photoUrl = user.getPhotoUrl();
            if (photoUrl == null) {
                C28560OoooOOO c28560OoooOOO = (C28560OoooOOO) firebaseUserLoginFragment.f72358Oooo00O.getValue();
                String uid = user.getUid();
                kotlin.jvm.internal.OooOOO0.OooO0o(uid, "getUid(...)");
                this.f101272OooOo0o = str;
                this.f101271OooOo = str2;
                this.f101274OooOoO0 = 1;
                objOooO0o = c28560OoooOOO.OooO0o(uid, accessToken, this);
            } else {
                String email = str2;
                Uri photoUri = photoUrl;
                String displayName = str;
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = firebaseUserLoginFragment.requireActivity();
                com.bumptech.glide.OooO0OO.OooO0O0(activityC21897OooOo0RequireActivity).OooO0o0(activityC21897OooOo0RequireActivity).OooO0oO(photoUri).Ooooo00();
                c24587OooOoo = new C24587OooOoo(false, false, R.id.firebaseUserLoginFragment, true, false, -1, -1, -1, -1);
                Bundle extras = BundleKt.bundleOf();
                kotlin.jvm.internal.OooOOO0.OooO0oO(displayName, "displayName");
                kotlin.jvm.internal.OooOOO0.OooO0oO(email, "email");
                kotlin.jvm.internal.OooOOO0.OooO0oO(photoUri, "photoUri");
                kotlin.jvm.internal.OooOOO0.OooO0oO(extras, "extras");
                o0000 o0000Var = new o0000("microsoft", displayName, email, photoUri, extras);
                this.f101272OooOo0o = c24587OooOoo;
                this.f101271OooOo = o0000Var;
                this.f101274OooOoO0 = 2;
                if (C33644OoooO0.OooO00o(3000L, this) != enumC32485OooO00o) {
                    oooOo = o0000Var;
                    firebaseUserLoginFragment.Oooo(false);
                    C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(firebaseUserLoginFragment), oooOo, c24587OooOoo);
                    return C32460OooOooO.f116667OooO00o;
                }
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOo = (o000o0O0.OooOo) this.f101271OooOo;
            c24587OooOoo = (C24587OooOoo) this.f101272OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            firebaseUserLoginFragment.Oooo(false);
            C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(firebaseUserLoginFragment), oooOo, c24587OooOoo);
            return C32460OooOooO.f116667OooO00o;
        }
        str2 = (String) this.f101271OooOo;
        String str4 = (String) this.f101272OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str = str4;
        objOooO0o = obj;
        photoUrl = (Uri) objOooO0o;
        String email2 = str2;
        Uri photoUri2 = photoUrl;
        String displayName2 = str;
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity2 = firebaseUserLoginFragment.requireActivity();
        com.bumptech.glide.OooO0OO.OooO0O0(activityC21897OooOo0RequireActivity2).OooO0o0(activityC21897OooOo0RequireActivity2).OooO0oO(photoUri2).Ooooo00();
        c24587OooOoo = new C24587OooOoo(false, false, R.id.firebaseUserLoginFragment, true, false, -1, -1, -1, -1);
        Bundle extras2 = BundleKt.bundleOf();
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayName2, "displayName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(email2, "email");
        kotlin.jvm.internal.OooOOO0.OooO0oO(photoUri2, "photoUri");
        kotlin.jvm.internal.OooOOO0.OooO0oO(extras2, "extras");
        o0000 o0000Var2 = new o0000("microsoft", displayName2, email2, photoUri2, extras2);
        this.f101272OooOo0o = c24587OooOoo;
        this.f101271OooOo = o0000Var2;
        this.f101274OooOoO0 = 2;
        if (C33644OoooO0.OooO00o(3000L, this) != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }
}
