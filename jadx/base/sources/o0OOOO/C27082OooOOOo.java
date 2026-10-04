package o0OOOO;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.data.service.user.NoteinFirebaseUserApiService;
import java.io.IOException;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import okhttp3.Response;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOOO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27082OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteinFirebaseUserApiService f94308OooO00o;

    public C27082OooOOOo(NoteinFirebaseUserApiService apiService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(apiService, "apiService");
        this.f94308OooO00o = apiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO0 oooOOO0;
        T t;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f94301OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f94301OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooOOO0.f94300OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f94301OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                NoteinFirebaseUserApiService noteinFirebaseUserApiService = this.f94308OooO00o;
                oooOOO0.f94301OooOoO0 = 1;
                objOooO00o = noteinFirebaseUserApiService.OooO00o(oooOOO0);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooO00o;
            if (c35238OooOoO.f126541OooO00o.OooO0OO() && (t = c35238OooOoO.f126542OooO0O0) != 0) {
                return t;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteinFirebaseUserRemoteDataSource");
            c20358OooO00o.OooO0OO("deleteUser failed: " + c35238OooOoO.f126541OooO00o.f124259OooOoO, new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteinFirebaseUserRemoteDataSource");
            c20358OooO00o2.OooO0Oo(e, "deleteUser failed", new Object[0]);
            return new C27174OooO0O0(false, null, "199999", null, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        T t;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f94298OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f94298OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = oooOOO.f94297OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f94298OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                NoteinFirebaseUserApiService noteinFirebaseUserApiService = this.f94308OooO00o;
                oooOOO.f94298OooOoO0 = 1;
                objOooO0OO = noteinFirebaseUserApiService.OooO0OO(oooOOO);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooO0OO;
            boolean zOooO0OO = c35238OooOoO.f126541OooO00o.OooO0OO();
            Response response = c35238OooOoO.f126541OooO00o;
            if (!zOooO0OO || (t = c35238OooOoO.f126542OooO0O0) == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "NoteinFirebaseUserRemoteDataSource", "getUser failed: ");
                sbOooO0O0.append(response.f124259OooOoO);
                c20358OooO00o.OooO0OO(sbOooO0O0.toString(), new Object[0]);
                return new C27174OooO0O0(false, null, null, null, 14);
            }
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) t;
            NoteinFirebaseUserApiService.FirebaseUserResponse firebaseUserResponse = (NoteinFirebaseUserApiService.FirebaseUserResponse) c27174OooO0O0.OooO0O0();
            if (firebaseUserResponse != null) {
                firebaseUserResponse.setRefreshedToken(response.f124263OooOoo0.OooO0O0("X-Refreshed-Token"));
            }
            return c27174OooO0O0;
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteinFirebaseUserRemoteDataSource");
            c20358OooO00o2.OooO0Oo(e, "getUser failed", new Object[0]);
            return new C27174OooO0O0(false, null, "199999", null, 10);
        }
    }
}
