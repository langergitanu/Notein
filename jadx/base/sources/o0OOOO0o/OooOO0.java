package o0OOOO0o;

import Oooo0.C20860Ooooooo;
import Oooo0oO.C21053Oooo00o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.cloudservice.support.account.request.SignInOptions;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.global.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import o00oO0O.C25510OooOooO;
import o0O0000o.C25830OooO00o;
import o0OOOo0.C27174OooO0O0;
import oO0OOo0o.C33074OooOoO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oOO00Ooo.C34365OooO0O0;
import oOO00Ooo.C34366OooO0OO;
import oOO00o0.C34370OooO0o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f94440OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33712OooOo0O f94441OooO0O0;

    public /* synthetic */ OooOO0(OooOOOO oooOOOO, InterfaceC33712OooOo0O interfaceC33712OooOo0O) {
        this.f94440OooO00o = oooOOOO;
        this.f94441OooO0O0 = interfaceC33712OooOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(C25830OooO00o c25830OooO00o) {
        byte[] byteArray;
        PackageManager packageManager;
        PackageInfo packageInfo;
        String strOooO00o;
        C27174OooO0O0 c27174OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0o0(c25830OooO00o, "null cannot be cast to non-null type com.hihonor.cloudservice.common.ApiException");
        int i = c25830OooO00o.f88127OooOo0o.f68820OooOo0o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        boolean zContains = false;
        c20358OooO00o.OooO0Oo(c25830OooO00o, C20860Ooooooo.OooO0OO(c20358OooO00o, "HonorAuthorizeService", "authorize silentSignIn failed, statusCode: ", i), new Object[0]);
        if (i == 31 || i == 55) {
            SignInOptions signInOptions = SignInOptions.DEFAULT_AUTH_REQUEST_PARAM;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            hashSet.addAll(signInOptions.f68827OooOo0o);
            hashSet2.addAll(signInOptions.f68826OooOo);
            o0O000o0.OooO00o oooO00oOooO0o = C21053Oooo00o.OooO0o(this.f94440OooO00o.f94459OooO0O0, new SignInOptions(new ArrayList(hashSet), new ArrayList(hashSet2), "104421645"));
            Context context = oooO00oOooO0o.f88134OooO0O0;
            SignInOptions signInOptions2 = oooO00oOooO0o.f88133OooO00o;
            Intent intent = null;
            if (context == null) {
                Log.e("AccountAuthUtil", "getSignInIntent : context is null");
            } else {
                C34370OooO0o0.OooO0O0(context);
                C34370OooO0o0.OooO0Oo("AccountAuthUtil", "getSignInIntent");
                if (C34366OooO0OO.OooO0Oo(context, 60000000)) {
                    C34365OooO0O0.OooO00o(context).getClass();
                    if (TextUtils.isEmpty("com.hihonor.id")) {
                        Log.e("HiPkgSignManager", "packageName is null or context is null");
                        byteArray = new byte[0];
                    } else {
                        try {
                            packageManager = context.getPackageManager();
                        } catch (PackageManager.NameNotFoundException e) {
                            C34370OooO0o0.OooO0OO("HiPkgSignManager", "PackageManager.NameNotFoundException : " + e.getMessage());
                        } catch (Exception e2) {
                            C34370OooO0o0.OooO0OO("HiPkgSignManager", "Exception : " + e2.getMessage());
                        }
                        byteArray = (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.hihonor.id", 64)) == null) ? new byte[0] : packageInfo.signatures[0].toByteArray();
                    }
                    if (byteArray == null || byteArray.length <= 0) {
                        strOooO00o = "";
                        if (strOooO00o == null) {
                            strOooO00o = "";
                        }
                        if (TextUtils.equals(strOooO00o, context.getString(R.string.apk_raw_finger))) {
                            if (C34366OooO0OO.OooO0O0(context, 60300360)) {
                                C34370OooO0o0.OooO0Oo("AccountAuthUtil", "HonorAPK version is too low");
                            }
                        } else if (C33074OooOoO.OooO0OO(context)) {
                            o0O00O0.OooO00o.OooO0Oo(context);
                            String packageName = context.getPackageName();
                            if (TextUtils.equals(packageName, context.getPackageName())) {
                                String str = signInOptions2.f68828OooOoO0;
                                if (TextUtils.isEmpty(str)) {
                                    throw new IllegalArgumentException("AccountAuthUtil : Null clientId is not permitted.");
                                }
                                intent = new Intent();
                                intent.setAction("com.hihonor.id.ACTION.WEBAUTH");
                                intent.setPackage("com.hihonor.id");
                                intent.putExtra("client_id", str);
                                intent.putExtra("scope", C25510OooOooO.OooO00o(signInOptions2.f68827OooOo0o));
                                intent.putExtra("loginChannel", "");
                                intent.putExtra("packageName", packageName);
                                intent.putExtra("requireAuthCode", true);
                                intent.putExtra("requireToken", true);
                                intent.putExtra("callType", "openSDK");
                            } else {
                                C34370OooO0o0.OooO0Oo("AccountAuthUtil", "packageName is not equals current's!");
                            }
                        }
                    } else {
                        try {
                            strOooO00o = C34366OooO0OO.OooO00o(MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(byteArray));
                        } catch (NoSuchAlgorithmException e3) {
                            Log.e("HiPkgSignManager", "NoSuchAlgorithmException" + e3.getMessage());
                            strOooO00o = "";
                        }
                        if (strOooO00o == null) {
                        }
                        if (TextUtils.equals(strOooO00o, context.getString(R.string.apk_raw_finger))) {
                        }
                    }
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    try {
                        C34365OooO0O0.OooO00o(context).getClass();
                        PackageInfo packageInfo2 = packageManager2.getPackageInfo("com.hihonor.id", 0);
                        C34370OooO0o0.OooO0Oo("SDKUtil", "packageName com.hihonor.id");
                        zContains = packageInfo2.versionName.contains("oversea");
                    } catch (PackageManager.NameNotFoundException unused) {
                        C34370OooO0o0.OooO0OO("SDKUtil", "NameNotFoundException error");
                    } catch (Exception unused2) {
                        C34370OooO0o0.OooO0OO("SDKUtil", "Exception error");
                    }
                    if (zContains) {
                        if (C34366OooO0OO.OooO0O0(context, 60300360)) {
                            C34370OooO0o0.OooO0Oo("AccountAuthUtil", "HonorAPK version is too low");
                        }
                    } else if (C33074OooOoO.OooO0OO(context)) {
                    }
                }
            }
            c27174OooO0O0 = new C27174OooO0O0(false, new AuthorizeInfo(intent, null, null, 6, null), "10000", null, 8);
        } else {
            c27174OooO0O0 = new C27174OooO0O0(false, null, String.valueOf(i), null, 10);
        }
        this.f94441OooO0O0.OooO0o0(c27174OooO0O0);
    }
}
