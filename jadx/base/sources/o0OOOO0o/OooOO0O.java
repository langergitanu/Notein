package o0OOOO0o;

import Oooo0oO.C21053Oooo00o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.C22172OooOoO;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.hihonor.cloudservice.support.account.request.SignInOptions;
import com.hihonor.cloudservice.support.api.clients.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import kotlin.coroutines.Continuation;
import o000OO00.C24483Oooo0oO;
import o00oO0O.C25510OooOooO;
import o0O0000o.C25830OooO00o;
import o0OOOo0.C27174OooO0O0;
import o0OoOoOO.C29213OooO00o;
import o0ooOoOO.C31664OooO00o;
import o0ooOoOO.C31665OooO0O0;
import o0ooOoOO.C31667OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oOO00Ooo.C34365OooO0O0;
import oOO00o0.C34370OooO0o0;
import oOO00o0o.ServiceConnectionC34376OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.HonorAuthorizeService$authorize$2", m80623f = "HonorAuthorizeService.kt", m80624l = {82}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94442OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94443OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ SignInOptions f94444OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f94445OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOOO oooOOOO, SignInOptions signInOptions, Continuation continuation) {
        super(2, continuation);
        this.f94445OooOoO0 = oooOOOO;
        this.f94444OooOoO = signInOptions;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f94445OooOoO0, this.f94444OooOoO, continuation);
        oooOO0O.f94442OooOo = obj;
        return oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C31667OooO0Oo c31667OooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94443OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f94442OooOo;
            o0O000o0.OooO00o oooO00oOooO0o = C21053Oooo00o.OooO0o(this.f94445OooOoO0.f94459OooO0O0, this.f94444OooOoO);
            C34370OooO0o0.OooO0Oo("HonorIDSignInServiceImpl", "silentSignIn");
            Context context = oooO00oOooO0o.f88134OooO0O0;
            SignInOptions signInOptions = oooO00oOooO0o.f88133OooO00o;
            C34370OooO0o0.OooO0Oo("AccountAuthUtil", "silentSignIn start!");
            o0O000o.OooO0O0 oooO0O0 = new o0O000o.OooO0O0();
            if (context == null) {
                C34370OooO0o0.OooO0Oo("AccountAuthUtil", "context is null");
                oooO0O0.OooO0O0(new C25830OooO00o(new Status(12, "context is null", null)));
                c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
            } else {
                C34370OooO0o0.OooO0Oo("AccountAuthUtil", "silentSignIn call : " + context.getPackageName());
                String strOooO0Oo = o0O00O0.OooO00o.OooO0Oo(context);
                PackageManager packageManager = context.getPackageManager();
                try {
                    C34365OooO0O0.OooO00o(context).getClass();
                    z = packageManager.getApplicationInfo("com.hihonor.id", 128) != null;
                    C34370OooO0o0.OooO0Oo("BaseUtil", "result is:" + z);
                } catch (PackageManager.NameNotFoundException unused) {
                    C34370OooO0o0.OooO0Oo("BaseUtil", "NameNotFoundException");
                    z = false;
                }
                if (z) {
                    PackageManager packageManager2 = context.getPackageManager();
                    Intent intent = new Intent("com.hihonor.id.HonorInvokeService");
                    C34365OooO0O0.OooO00o(context).getClass();
                    intent.setPackage("com.hihonor.id");
                    if (!((packageManager2 != null ? packageManager2.queryIntentServices(intent, 0) : null) != null ? !r8.isEmpty() : false)) {
                        C34370OooO0o0.OooO0Oo("AccountAuthUtil", "HonorAPK version is too low");
                        oooO0O0.OooO0O0(new C25830OooO00o(new Status(35, "HonorAPK version is too low", null)));
                        c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
                    } else if (TextUtils.isEmpty(signInOptions.f68828OooOoO0)) {
                        C34370OooO0o0.OooO0Oo("AccountAuthUtil", "clientid is null");
                        oooO0O0.OooO0O0(new C25830OooO00o(new Status(12, "clientid is null", null)));
                        c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
                    } else {
                        ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00oOooO00o = ServiceConnectionC34376OooO00o.OooO00o(context);
                        if (serviceConnectionC34376OooO00oOooO00o == null) {
                            C34370OooO0o0.OooO0Oo("AccountAuthUtil", "manager is null");
                            oooO0O0.OooO0O0(new C25830OooO00o(new Status(40, "manager is null!", null)));
                            c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
                        } else {
                            String str = signInOptions.f68828OooOoO0;
                            String strOooO00o = C25510OooOooO.OooO00o(signInOptions.f68827OooOo0o);
                            Bundle bundleOooO00o = C22172OooOoO.OooO00o(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                            if (!TextUtils.isEmpty("")) {
                                bundleOooO00o.putInt("login_channel", Integer.parseInt(""));
                            }
                            bundleOooO00o.putString("scope", strOooO00o);
                            bundleOooO00o.putBoolean("requireAccessToken", true);
                            bundleOooO00o.putBoolean("reqiureAuthCode", true);
                            bundleOooO00o.putInt("reqClientType", 7);
                            bundleOooO00o.putString("transid", strOooO0Oo);
                            bundleOooO00o.putBoolean("silentSignIn", true);
                            bundleOooO00o.putString("packageName", context.getPackageName());
                            bundleOooO00o.putString("callType", "openSDK");
                            String packageName = context.getPackageName();
                            C29213OooO00o c29213OooO00o = new C29213OooO00o(context, strOooO0Oo, oooO0O0);
                            o0O000.OooO00o oooO00o = new o0O000.OooO00o(context);
                            oooO00o.f88113OooOoo = context;
                            oooO00o.f88111OooOoO = packageName;
                            oooO00o.f88112OooOoOO = bundleOooO00o;
                            oooO00o.f88114OooOoo0 = c29213OooO00o;
                            bundleOooO00o.getString("bundle_key_transid", "");
                            C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "addTask:");
                            synchronized (serviceConnectionC34376OooO00oOooO00o.f123369OooOoO0) {
                                ServiceConnectionC34376OooO00o.f123364Oooo000.incrementAndGet();
                                serviceConnectionC34376OooO00oOooO00o.f123369OooOoO0.add(oooO00o);
                            }
                            serviceConnectionC34376OooO00oOooO00o.f123373OooOooO.sendEmptyMessage(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN);
                            c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
                        }
                    }
                } else {
                    C34370OooO0o0.OooO0Oo("AccountAuthUtil", "HonorAccount is not install");
                    oooO0O0.OooO0O0(new C25830OooO00o(new Status(34, "HonorAccount is not install", null)));
                    c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
                }
            }
            OooO oooO = new OooO(interfaceC33712OooOo0O);
            c31667OooO0Oo.getClass();
            o0O000o.OooO0OO oooO0OO = o0O000o.OooO0OO.f88130OooO0OO;
            c31667OooO0Oo.OooO00o(new C31665OooO0O0(oooO0OO.f88132OooO0O0, oooO));
            c31667OooO0Oo.OooO00o(new C31664OooO00o(oooO0OO.f88132OooO0O0, new OooOO0(this.f94445OooOoO0, interfaceC33712OooOo0O)));
            C24483Oooo0oO c24483Oooo0oO = new C24483Oooo0oO(1);
            this.f94443OooOo0o = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, c24483Oooo0oO, this) == enumC32485OooO00o) {
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
