package o0OOO00;

import OooOoOO.C20519OooO0Oo;
import androidx.fragment.app.C21904OooOoo0;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import com.microsoft.identity.client.PublicClientApplication;
import com.orion.notein.global.R;
import java.util.List;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33614OooOOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOO00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26988OooO0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static ISingleAccountPublicClientApplication f93786OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C26988OooO0Oo f93785OooO00o = new C26988OooO0Oo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final List<String> f93787OooO0OO = C34429OooOOo0.OooOO0o("user.read", "Files.ReadWrite");

    static {
        C20519OooO0Oo.OooO0OO(new OooO00o());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO0OO oooO0OO;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f93784OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f93784OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooO0OO.f93783OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f93784OooOoO0;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveRequestManager");
            c20358OooO00o.OooO0Oo(e, "acquireSingleAccountAppClientSync err", new Object[0]);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("OneDriveRequestManager");
            c20358OooO00o2.OooO0o0("ensureSingleAccountClientApp.", new Object[0]);
            if (f93786OooO0O0 == null) {
                oooO0OO.f93784OooOoO0 = 1;
                C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(oooO0OO));
                c33614OooOOO0.OooOOoo();
                PublicClientApplication.createSingleAccountPublicClientApplication(abstractApplicationC26277OooOoOO, R.raw.auth_config_single_account, new OooO0O0(c33614OooOOO0));
                objOooOOo = c33614OooOOO0.OooOOo();
                if (objOooOOo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(objOooOOo);
        f93786OooO0O0 = (ISingleAccountPublicClientApplication) objOooOOo;
        return C32460OooOooO.f116667OooO00o;
    }
}
