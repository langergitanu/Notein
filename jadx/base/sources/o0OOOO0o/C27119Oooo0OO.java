package o0OOOO0o;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.data.service.dto.UserApiResultDto;
import com.orion.notein.domain.models.User;
import com.orion.notein.domain.models.login.LoginInfo;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOOO0.InterfaceC27154OooOO0o;
import o0OOOOoo.C27169OooO00o;
import o0OOOOoo.C27170OooO0O0;
import o0OOOOoo.C27171OooO0OO;
import o0OOOo0.C27174OooO0O0;
import o0OOOo00.C27176OooO0O0;
import o0OOOo00.C27177OooO0OO;
import o0OOOo00.C27179OooO0o;
import o0Oo00o.C28028OooO0o;
import o0Oo00oO.C28036OooO0O0;
import o0oo000O.C31182OooO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOOO0o.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27119Oooo0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27154OooOO0o f94558OooO0O0;

    /* JADX INFO: renamed from: o0OOOO0o.Oooo0OO$OooO00o */
    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0OOOO0o/Oooo0OO$OooO00o", "Lcom/google/gson/reflect/TypeToken;", "Lo0OOOo0/OooO0O0;", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO00o extends TypeToken<C27174OooO0O0<Boolean>> {
    }

    /* JADX INFO: renamed from: o0OOOO0o.Oooo0OO$OooO0O0 */
    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0OOOO0o/Oooo0OO$OooO0O0", "Lcom/google/gson/reflect/TypeToken;", "Lo0OOOo0/OooO0O0;", "Lcom/orion/notein/domain/models/login/LoginInfo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO0O0 extends TypeToken<C27174OooO0O0<LoginInfo>> {
    }

    public C27119Oooo0OO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC27154OooOO0o userService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userService, "userService");
        this.f94557OooO00o = abstractApplicationC26277OooOoOO;
        this.f94558OooO0O0 = userService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserApiResultDto OooO0o(C35238OooOoO c35238OooOoO) {
        User user;
        User user2;
        String id = null;
        if (c35238OooOoO.f126541OooO00o.OooO0OO()) {
            UserApiResultDto userApiResultDto = (UserApiResultDto) c35238OooOoO.f126542OooO0O0;
            String errorMsg = userApiResultDto != null ? userApiResultDto.getErrorMsg() : null;
            if (userApiResultDto != null && (user2 = userApiResultDto.getUser()) != null) {
                id = user2.getId();
            }
            Log.i("UserRemoteDataSource", "onSuccess. " + c35238OooOoO + ", msg: " + errorMsg + ", userId: " + id + "}");
            return userApiResultDto;
        }
        Gson gsonOooO00o = C28028OooO0o.OooO00o();
        ResponseBody responseBody = c35238OooOoO.f126543OooO0OO;
        UserApiResultDto userApiResultDto2 = (UserApiResultDto) gsonOooO00o.fromJson(responseBody != null ? responseBody.string() : null, UserApiResultDto.class);
        String errorMsg2 = userApiResultDto2 != null ? userApiResultDto2.getErrorMsg() : null;
        if (userApiResultDto2 != null && (user = userApiResultDto2.getUser()) != null) {
            id = user.getId();
        }
        Log.e("UserRemoteDataSource", "onError. " + c35238OooOoO + ", msg: " + errorMsg2 + ", userId: " + id + "}");
        return userApiResultDto2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C27174OooO0O0 OooO0oO(C35238OooOoO c35238OooOoO) {
        C27174OooO0O0 c27174OooO0O0;
        try {
            C35238OooOoO c35238OooOoO2 = c35238OooOoO.f126541OooO00o.OooO0OO() ? c35238OooOoO : null;
            if (c35238OooOoO2 != null && (c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO2.f126542OooO0O0) != null) {
                return c27174OooO0O0;
            }
            Type type = new OooO00o().getType();
            Gson gsonOooO00o = C28028OooO0o.OooO00o();
            ResponseBody responseBody = c35238OooOoO.f126543OooO0OO;
            return C27174OooO0O0.OooO00o((C27174OooO0O0) gsonOooO00o.fromJson(responseBody != null ? responseBody.string() : null, type), null, 14);
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C27174OooO0O0 OooO0oo(C35238OooOoO c35238OooOoO) {
        C27174OooO0O0 c27174OooO0O0;
        try {
            LoginInfo loginInfoCopy$default = null;
            C35238OooOoO c35238OooOoO2 = c35238OooOoO.f126541OooO00o.OooO0OO() ? c35238OooOoO : null;
            if (c35238OooOoO2 == null || (c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO2.f126542OooO0O0) == null) {
                Type type = new OooO0O0().getType();
                Gson gsonOooO00o = C28028OooO0o.OooO00o();
                ResponseBody responseBody = c35238OooOoO.f126543OooO0OO;
                C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) gsonOooO00o.fromJson(responseBody != null ? responseBody.string() : null, type);
                kotlin.jvm.internal.OooOOO0.OooO0o(c27174OooO0O02, "run(...)");
                return c27174OooO0O02;
            }
            LoginInfo loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
            if (loginInfo != null) {
                String strOooO0O0 = c35238OooOoO.f126541OooO00o.f124263OooOoo0.OooO0O0("Authorization");
                if (strOooO0O0 == null) {
                    strOooO0O0 = "";
                }
                loginInfoCopy$default = LoginInfo.copy$default(loginInfo, null, null, null, null, 0L, strOooO0O0, 31, null);
            }
            return C27174OooO0O0.OooO00o(c27174OooO0O0, loginInfoCopy$default, 13);
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27121Oooo0o0 c27121Oooo0o0;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27121Oooo0o0) {
            c27121Oooo0o0 = (C27121Oooo0o0) abstractC32479OooO0OO;
            int i = c27121Oooo0o0.f94565OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27121Oooo0o0.f94565OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27121Oooo0o0 = new C27121Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27121Oooo0o0.f94563OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27121Oooo0o0.f94565OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0oO);
                InterfaceC27154OooOO0o interfaceC27154OooOO0o = this.f94558OooO0O0;
                String strOooO0OO = C28036OooO0O0.OooO0OO(str);
                c27121Oooo0o0.f94564OooOo0o = this;
                c27121Oooo0o0.f94565OooOoO = 1;
                objOooO0oO = interfaceC27154OooOO0o.OooO0oO(strOooO0OO, str2, c27121Oooo0o0);
                if (objOooO0oO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27119Oooo0OO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27119Oooo0OO = c27121Oooo0o0.f94564OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
            }
            c27119Oooo0OO.getClass();
            return OooO0o((C35238OooOoO) objOooO0oO);
        } catch (Exception e) {
            com.aspose.slides.internal.p407st.OooO00o.OooO0O0("sendSms error: ", e.getMessage(), "UserRemoteDataSource");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i = oooo000.f94543OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f94543OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = oooo000.f94541OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo000.f94543OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f94557OooO00o;
            String str = abstractApplicationC26277OooOoOO.getPackageManager().getPackageInfo(abstractApplicationC26277OooOoOO.getPackageName(), 0).versionName;
            if (str == null) {
                str = "unknown";
            }
            oooo000.f94542OooOo0o = this;
            oooo000.f94543OooOoO = 1;
            objOooO = this.f94558OooO0O0.OooO(str, oooo000);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = oooo000.f94542OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27116Oooo00O c27116Oooo00O;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27116Oooo00O) {
            c27116Oooo00O = (C27116Oooo00O) abstractC32479OooO0OO;
            int i = c27116Oooo00O.f94547OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27116Oooo00O.f94547OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27116Oooo00O = new C27116Oooo00O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = c27116Oooo00O.f94545OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27116Oooo00O.f94547OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            String strOooO0OO = C28036OooO0O0.OooO0OO(str);
            c27116Oooo00O.f94546OooOo0o = this;
            c27116Oooo00O.f94547OooOoO = 1;
            objOooOO0o = this.f94558OooO0O0.OooOO0o(strOooO0OO, str2, c27116Oooo00O);
            if (objOooOO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27116Oooo00O.f94546OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0o);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooOO0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27117Oooo00o c27117Oooo00o;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27117Oooo00o) {
            c27117Oooo00o = (C27117Oooo00o) abstractC32479OooO0OO;
            int i = c27117Oooo00o.f94551OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27117Oooo00o.f94551OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27117Oooo00o = new C27117Oooo00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0 = c27117Oooo00o.f94549OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27117Oooo00o.f94551OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0);
            C27169OooO00o c27169OooO00o = new C27169OooO00o(str, str2, str3);
            c27117Oooo00o.f94550OooOo0o = this;
            c27117Oooo00o.f94551OooOoO = 1;
            objOooOO0 = this.f94558OooO0O0.OooOO0(c27169OooO00o, c27117Oooo00o);
            if (objOooOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27117Oooo00o.f94550OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0);
        }
        C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooOO0;
        String strOooO0O0 = c35238OooOoO.f126541OooO00o.f124263OooOoo0.OooO0O0("Authorization");
        c27119Oooo0OO.getClass();
        return new C32443OooOOO(strOooO0O0, OooO0o(c35238OooOoO));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo0 oooo0;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof Oooo0) {
            oooo0 = (Oooo0) abstractC32479OooO0OO;
            int i = oooo0.f94539OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f94539OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = oooo0.f94537OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo0.f94539OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                InterfaceC27154OooOO0o interfaceC27154OooOO0o = this.f94558OooO0O0;
                C27176OooO0O0 c27176OooO0O0 = new C27176OooO0O0(C28036OooO0O0.OooO0OO(str), str2, str3);
                oooo0.f94538OooOo0o = this;
                oooo0.f94539OooOoO = 1;
                objOooO0OO = interfaceC27154OooOO0o.OooO0OO(c27176OooO0O0, oooo0);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27119Oooo0OO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27119Oooo0OO = oooo0.f94538OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            c27119Oooo0OO.getClass();
            return OooO0oo((C35238OooOoO) objOooO0OO);
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27118Oooo0O0 c27118Oooo0O0;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27118Oooo0O0) {
            c27118Oooo0O0 = (C27118Oooo0O0) abstractC32479OooO0OO;
            int i = c27118Oooo0O0.f94555OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27118Oooo0O0.f94555OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27118Oooo0O0 = new C27118Oooo0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = c27118Oooo0O0.f94553OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27118Oooo0O0.f94555OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            String strOooO0OO = C28036OooO0O0.OooO0OO(str);
            c27118Oooo0O0.f94554OooOo0o = this;
            c27118Oooo0O0.f94555OooOoO = 1;
            objOooO0oo = this.f94558OooO0O0.OooO0oo(strOooO0OO, str2, str3, c27118Oooo0O0);
            if (objOooO0oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27118Oooo0O0.f94554OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooO0oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27120Oooo0o c27120Oooo0o;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27120Oooo0o) {
            c27120Oooo0o = (C27120Oooo0o) abstractC32479OooO0OO;
            int i = c27120Oooo0o.f94561OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27120Oooo0o.f94561OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27120Oooo0o = new C27120Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27120Oooo0o.f94559OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27120Oooo0o.f94561OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                InterfaceC27154OooOO0o interfaceC27154OooOO0o = this.f94558OooO0O0;
                C27177OooO0OO c27177OooO0OO = new C27177OooO0OO(str, str2, C28036OooO0O0.OooO0OO(str3), str4, str5);
                c27120Oooo0o.f94560OooOo0o = this;
                c27120Oooo0o.f94561OooOoO = 1;
                objOooO0Oo = interfaceC27154OooOO0o.OooO0Oo(c27177OooO0OO, c27120Oooo0o);
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27119Oooo0OO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27119Oooo0OO = c27120Oooo0o.f94560OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
            }
            c27119Oooo0OO.getClass();
            return OooO0oo((C35238OooOoO) objOooO0Oo);
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, String str2, String str3, String str4, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27122Oooo0oO c27122Oooo0oO;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27122Oooo0oO) {
            c27122Oooo0oO = (C27122Oooo0oO) abstractC32479OooO0OO;
            int i = c27122Oooo0oO.f94569OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27122Oooo0oO.f94569OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27122Oooo0oO = new C27122Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27122Oooo0oO.f94567OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27122Oooo0oO.f94569OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                InterfaceC27154OooOO0o interfaceC27154OooOO0o = this.f94558OooO0O0;
                C27177OooO0OO c27177OooO0OO = new C27177OooO0OO(str, null, C28036OooO0O0.OooO0OO(str2), str3, str4);
                c27122Oooo0oO.f94568OooOo0o = this;
                c27122Oooo0oO.f94569OooOoO = 1;
                objOooO0O0 = interfaceC27154OooOO0o.OooO0O0(c27177OooO0OO, c27122Oooo0oO);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27119Oooo0OO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27119Oooo0OO = c27122Oooo0oO.f94568OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            c27119Oooo0OO.getClass();
            return OooO0oO((C35238OooOoO) objOooO0O0);
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(Bitmap bitmap, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27123Oooo0oo c27123Oooo0oo;
        C27119Oooo0OO c27119Oooo0OO;
        File fileOooOOO0;
        if (abstractC32479OooO0OO instanceof C27123Oooo0oo) {
            c27123Oooo0oo = (C27123Oooo0oo) abstractC32479OooO0OO;
            int i = c27123Oooo0oo.f94573OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27123Oooo0oo.f94573OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27123Oooo0oo = new C27123Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c27123Oooo0oo.f94571OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27123Oooo0oo.f94573OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            if (bitmap.getWidth() > 2000 || bitmap.getHeight() > 2000) {
                return new UserApiResultDto(new User("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null), "10001", "Image resolution is too large.");
            }
            File file = new File(this.f94557OooO00o.getCacheDir(), "avatar_to_upload.jpg");
            if (!C31182OooO.OooO0OO(bitmap, C31190OooO0oo.OooOOO0(file.getAbsolutePath()), Bitmap.CompressFormat.PNG, 100)) {
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            long contentLength = -1;
            if (absolutePath.matches("[a-zA-z]+://[^\\s]*")) {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(absolutePath).openConnection();
                    httpsURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                    httpsURLConnection.connect();
                    if (httpsURLConnection.getResponseCode() == 200) {
                        contentLength = httpsURLConnection.getContentLength();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    fileOooOOO0 = C31190OooO0oo.OooOOO0(absolutePath);
                    if (fileOooOOO0 != null) {
                        contentLength = fileOooOOO0.length();
                    }
                }
                if (contentLength <= 3145728) {
                    return new UserApiResultDto(new User("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null), "10000", "Image file is too large.");
                }
                RequestBody.Companion companion = RequestBody.INSTANCE;
                MediaType.f124148OooO0o0.getClass();
                MediaType mediaTypeOooO0O0 = MediaType.Companion.OooO0O0("image/png");
                companion.getClass();
                RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1 = new RequestBody$Companion$asRequestBody$1(mediaTypeOooO0O0, file);
                MultipartBody.Part.Companion companion2 = MultipartBody.Part.f124167OooO0OO;
                String name = file.getName();
                companion2.getClass();
                MultipartBody.Part partOooO0O0 = MultipartBody.Part.Companion.OooO0O0("avatar", name, requestBody$Companion$asRequestBody$1);
                c27123Oooo0oo.f94572OooOo0o = this;
                c27123Oooo0oo.f94573OooOoO = 1;
                objOooOO0O = this.f94558OooO0O0.OooOO0O(partOooO0O0, c27123Oooo0oo);
                if (objOooOO0O == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27119Oooo0OO = this;
            } else {
                fileOooOOO0 = C31190OooO0oo.OooOOO0(absolutePath);
                if (fileOooOOO0 != null && fileOooOOO0.exists() && fileOooOOO0.isFile()) {
                    contentLength = fileOooOOO0.length();
                }
                if (contentLength <= 3145728) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27123Oooo0oo.f94572OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooOO0O);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27126OoooO00 c27126OoooO00;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27126OoooO00) {
            c27126OoooO00 = (C27126OoooO00) abstractC32479OooO0OO;
            int i = c27126OoooO00.f94585OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27126OoooO00.f94585OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27126OoooO00 = new C27126OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27126OoooO00.f94583OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27126OoooO00.f94585OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            C27171OooO0OO c27171OooO0OO = new C27171OooO0OO(str, 2);
            c27126OoooO00.f94584OooOo0o = this;
            c27126OoooO00.f94585OooOoO = 1;
            objOooO0o0 = this.f94558OooO0O0.OooO0o0(c27171OooO0OO, c27126OoooO00);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27126OoooO00.f94584OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooO0o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27115Oooo c27115Oooo;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27115Oooo) {
            c27115Oooo = (C27115Oooo) abstractC32479OooO0OO;
            int i = c27115Oooo.f94535OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27115Oooo.f94535OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27115Oooo = new C27115Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27115Oooo.f94533OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27115Oooo.f94535OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C27170OooO0O0 c27170OooO0O0 = new C27170OooO0O0(C28036OooO0O0.OooO0OO(str), str2, str3);
            c27115Oooo.f94534OooOo0o = this;
            c27115Oooo.f94535OooOoO = 1;
            objOooO0o = this.f94558OooO0O0.OooO0o(c27170OooO0O0, c27115Oooo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27115Oooo.f94534OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooO0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27125OoooO0 c27125OoooO0;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27125OoooO0) {
            c27125OoooO0 = (C27125OoooO0) abstractC32479OooO0OO;
            int i = c27125OoooO0.f94581OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27125OoooO0.f94581OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27125OoooO0 = new C27125OoooO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27125OoooO0.f94579OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27125OoooO0.f94581OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            String strOooO0OO = C28036OooO0O0.OooO0OO(str);
            c27125OoooO0.f94580OooOo0o = this;
            c27125OoooO0.f94581OooOoO = 1;
            objOooOOO0 = this.f94558OooO0O0.OooOOO0(strOooO0OO, str2, str3, c27125OoooO0);
            if (objOooOOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27119Oooo0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27119Oooo0OO = c27125OoooO0.f94580OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        c27119Oooo0OO.getClass();
        return OooO0o((C35238OooOoO) objOooOOO0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOo(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27127OoooO0O c27127OoooO0O;
        C27119Oooo0OO c27119Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27127OoooO0O) {
            c27127OoooO0O = (C27127OoooO0O) abstractC32479OooO0OO;
            int i = c27127OoooO0O.f94589OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27127OoooO0O.f94589OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27127OoooO0O = new C27127OoooO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27127OoooO0O.f94587OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27127OoooO0O.f94589OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                InterfaceC27154OooOO0o interfaceC27154OooOO0o = this.f94558OooO0O0;
                C27179OooO0o c27179OooO0o = new C27179OooO0o(str, str2, str3);
                c27127OoooO0O.f94588OooOo0o = this;
                c27127OoooO0O.f94589OooOoO = 1;
                objOooO00o = interfaceC27154OooOO0o.OooO00o(c27179OooO0o, c27127OoooO0O);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27119Oooo0OO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27119Oooo0OO = c27127OoooO0O.f94588OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            c27119Oooo0OO.getClass();
            C27174OooO0O0 c27174OooO0O0OooO0oO = OooO0oO((C35238OooOoO) objOooO00o);
            Log.d("UserRemoteDataSource", "verifyCodeWithNoLogin: " + c27174OooO0O0OooO0oO);
            return c27174OooO0O0OooO0oO;
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }
}
