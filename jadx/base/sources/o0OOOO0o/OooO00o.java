package o0OOOO0o;

import com.google.gson.reflect.TypeToken;
import com.orion.notein.domain.models.login.LoginInfo;
import kotlin.Metadata;
import o0OOOo0.C27174OooO0O0;
import o0Oo00o.C28028OooO0o;
import oOO00oo.C34406OooO00o;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: o0OOOO0o.OooO00o$OooO00o, reason: collision with other inner class name */
    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0OOOO0o/OooO00o$OooO00o", "Lcom/google/gson/reflect/TypeToken;", "Lo0OOOo0/OooO0O0;", "Lcom/orion/notein/domain/models/login/LoginInfo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class C19844OooO00o extends TypeToken<C27174OooO0O0<LoginInfo>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C27174OooO0O0 OooO00o(C35238OooOoO response, String str, String str2) {
        C27174OooO0O0 c27174OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(response, "response");
        Response response2 = response.f126541OooO00o;
        try {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(str);
            c20358OooO00o.OooO00o("parseResponseToNoteInLogInfo response: " + response2.OooO0OO() + ", " + response.f126542OooO0O0, new Object[0]);
            LoginInfo loginInfoCopy$default = null;
            C35238OooOoO c35238OooOoO = response2.OooO0OO() ? response : null;
            if (c35238OooOoO != null && (c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0) != null) {
                LoginInfo loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
                if (loginInfo != null) {
                    String strOooO0O0 = response2.f124263OooOoo0.OooO0O0("Authorization");
                    if (strOooO0O0 == null) {
                        strOooO0O0 = "";
                    }
                    loginInfoCopy$default = LoginInfo.copy$default(loginInfo, null, null, null, null, 0L, strOooO0O0, 31, null);
                }
                return C27174OooO0O0.OooO00o(c27174OooO0O0, loginInfoCopy$default, 13);
            }
            ResponseBody responseBody = response.f126543OooO0OO;
            String strString = responseBody != null ? responseBody.string() : null;
            c20358OooO00o.OooOOO0(str);
            c20358OooO00o.OooO0OO(str2 + ", parseResponseToNoteInLoginInfo errorBody: " + strString + ", response: " + response, new Object[0]);
            C27174OooO0O0 c27174OooO0O0OooO00o = C27174OooO0O0.OooO00o((C27174OooO0O0) C28028OooO0o.OooO00o().fromJson(strString, new C19844OooO00o().getType()), null, 14);
            c20358OooO00o.OooOOO0(str);
            c20358OooO00o.OooO0OO(str2 + ", parseResponseToNoteInLogInfo errorBody " + c27174OooO0O0OooO00o, new Object[0]);
            return c27174OooO0O0OooO00o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(str);
            c20358OooO00o2.OooO0Oo(e, str2.concat(" parseResponseToNoteInLogInfo error"), new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }
}
