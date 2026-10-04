package o00Oo0oO;

import OooOooO.C20741OooOOoo;
import OooooO0.C21289OooO0o;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.app.H5PayActivity;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.internal.p590ui.webview.ProcessUtil;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00OOOo0.C25015OooO00o;
import o00OOOoO.C25016OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o0o0Oo.C30597OooO00o;
import o0o0Oo.C30600OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f85076OooO00o = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final char[] f85077OooO0O0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', IOUtils.DIR_SEPARATOR_UNIX};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PackageInfo f85078OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f85079OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f85080OooO0OO;

        public OooO00o(PackageInfo packageInfo, int i, String str) {
            this.f85078OooO00o = packageInfo;
            this.f85079OooO0O0 = i;
            this.f85080OooO0OO = str;
        }

        public final boolean OooO00o(C25047OooO00o c25047OooO00o) {
            Signature[] signatureArr = this.f85078OooO00o.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String strOooO0Oo = OooOOOO.OooO0Oo(c25047OooO00o, signature.toByteArray());
                    if (strOooO0Oo != null) {
                        String str = this.f85080OooO0OO;
                        if (!TextUtils.equals(strOooO0Oo, str)) {
                            o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "PublicKeyUnmatch", C22237OooO0o0.OooO00o("Got ", strOooO0Oo, ", expected ", str));
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static boolean OooO(String str, C25047OooO00o c25047OooO00o) {
        try {
            String host = new URL(str).getHost();
            if (host.endsWith("alipay.com")) {
                return true;
            }
            return host.endsWith("alipay.net");
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "ckUrlErr", th);
            return false;
        }
    }

    public static String OooO00o(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String OooO0O0(Context context, C25047OooO00o c25047OooO00o) {
        try {
            String strOooO0O0 = OooOO0O.OooO0O0(context, "alipay_cashier_ap_fi", "", c25047OooO00o);
            if (!TextUtils.isEmpty(strOooO0O0)) {
                return strOooO0O0;
            }
            try {
                C30597OooO00o c30597OooO00oOooO00o = C30597OooO00o.OooO00o("FU", System.currentTimeMillis(), new C30600OooO0Oo(), (short) 0, new C21289OooO0o());
                SecureRandom secureRandom = o00OOO0.OooO00o.f84854OooO00o;
                OooOO0O.OooO0OO(context, "alipay_cashier_ap_fi", Base64.encodeToString(c30597OooO00oOooO00o.f109481OooO00o, 3), c25047OooO00o);
                String strOooO0O02 = OooOO0O.OooO0O0(context, "alipay_cashier_ap_fi", "", c25047OooO00o);
                if (!TextUtils.isEmpty(strOooO0O02)) {
                    return strOooO0O02;
                }
                o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "e_regen_empty", "");
                return "";
            } catch (Exception e) {
                o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "e_gen", e.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e2) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "e_gen_err", e2);
            return "";
        }
    }

    public static String OooO0OO(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str) + str.length();
            if (iIndexOf <= str.length()) {
                return "";
            }
            int iIndexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, iIndexOf) : 0;
            return iIndexOf2 < 1 ? str3.substring(iIndexOf) : str3.substring(iIndexOf, iIndexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooO0Oo(C25047OooO00o c25047OooO00o, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, ProcessUtil.AuthServiceProcess, "GetPublicKeyFromSignEx", e);
            return null;
        }
    }

    public static OooO00o OooO0o(C25047OooO00o c25047OooO00o, Context context, List<C25016OooO00o.OooO0O0> list) {
        PackageInfo packageInfo;
        String str;
        if (list != null) {
            for (C25016OooO00o.OooO0O0 oooO0O0 : list) {
                if (oooO0O0 != null) {
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(oooO0O0.f84940OooO00o, 192);
                    } catch (Throwable th) {
                        o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, ProcessUtil.AuthServiceProcess, "GetPackageInfoEx", th.getMessage());
                        packageInfo = null;
                    }
                    boolean z = false;
                    if (packageInfo == null) {
                        str = "info == null";
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr == null) {
                            str = "info.signatures == null";
                        } else if (signatureArr.length <= 0) {
                            str = "info.signatures.length <= 0";
                        } else {
                            str = "";
                            z = true;
                        }
                    }
                    if (!z) {
                        o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, ProcessUtil.AuthServiceProcess, "NotIncludeSignatures", str);
                    }
                    OooO00o oooO00o = (z && packageInfo != null) ? new OooO00o(packageInfo, oooO0O0.f84941OooO0O0, oooO0O0.f84942OooO0OO) : null;
                    if (oooO00o != null && !oooO00o.OooO00o(c25047OooO00o) && oooO00o.f85078OooO00o.versionCode >= oooO00o.f85079OooO0O0) {
                        return oooO00o;
                    }
                }
            }
        }
        return null;
    }

    public static String OooO0o0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b & 240) >> 4, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0oO(Context context, String str, C25047OooO00o c25047OooO00o) {
        boolean zContains;
        if (context == null || TextUtils.isEmpty("alipaySdk") || TextUtils.isEmpty(str)) {
            return;
        }
        if (c25047OooO00o != null) {
            String str2 = c25047OooO00o.f85039OooO0oO;
            zContains = !TextUtils.isEmpty(str2) ? str2.toLowerCase().contains(ProcessUtil.AuthServiceProcess) : false;
        }
        if (!zContains && C25016OooO00o.OooO00o().f84931OooOoO0) {
            try {
                Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
                intent.putExtra("bizType", "alipaySdk");
                intent.putExtra("exName", str);
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "AppNotify", "alipaySdk|".concat(str));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean OooO0oo(H5PayActivity h5PayActivity, String str, C25047OooO00o c25047OooO00o) {
        String strSubstring;
        if (!TextUtils.isEmpty(str)) {
            if (h5PayActivity != null) {
                if (str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) || str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
                    try {
                        OooO00o oooO00oOooO0o = OooO0o(c25047OooO00o, h5PayActivity, o00OOOO0.OooO00o.f84883OooO0Oo);
                        if (oooO00oOooO0o != null) {
                            if (!(oooO00oOooO0o.f85078OooO00o.versionCode < oooO00oOooO0o.f85079OooO0O0) && !oooO00oOooO0o.OooO00o(c25047OooO00o)) {
                                if (str.startsWith("intent://platformapi/startapp")) {
                                    str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                                }
                                h5PayActivity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    if (TextUtils.equals(str, "sdklite://h5quit") || TextUtils.equals(str, "http://m.alipay.com/?action=h5quit")) {
                        C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0O0();
                        h5PayActivity.finish();
                        return true;
                    }
                    if (str.startsWith("sdklite://h5quit?result=")) {
                        try {
                            String strSubstring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                            int i = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf("&end_code=") + 10));
                            if (i == 9000 || i == 8000) {
                                if (C25015OooO00o.f84904OooO0O0) {
                                    StringBuilder sb = new StringBuilder();
                                    String strDecode = URLDecoder.decode(str);
                                    String strDecode2 = URLDecoder.decode(strDecode);
                                    String str2 = strDecode2.substring(strDecode2.indexOf("sdklite://h5quit?result=") + 24, strDecode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                                    int iIndexOf = strDecode.indexOf("&return_url=") + 12;
                                    sb.append(str2);
                                    sb.append("&return_url=");
                                    sb.append(strDecode.substring(iIndexOf, strDecode.indexOf("&", iIndexOf)));
                                    sb.append(strDecode.substring(strDecode.indexOf("&", iIndexOf)));
                                    strSubstring = sb.toString();
                                } else {
                                    String strDecode3 = URLDecoder.decode(str);
                                    strSubstring = strDecode3.substring(strDecode3.indexOf("sdklite://h5quit?result=") + 24, strDecode3.lastIndexOf("&end_code="));
                                }
                                int iOooO00o = o00OOOO0.OooO0O0.OooO00o(i);
                                C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0OO(o00OOOO0.OooO0O0.OooO0O0(iOooO00o), o00OOOO0.OooO0O0.OooO0OO(iOooO00o), strSubstring);
                            } else {
                                int iOooO00o2 = o00OOOO0.OooO0O0.OooO00o(4000);
                                C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0OO(o00OOOO0.OooO0O0.OooO0O0(iOooO00o2), o00OOOO0.OooO0O0.OooO0OO(iOooO00o2), "");
                            }
                        } catch (Exception unused2) {
                            C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0OO(4001, "参数错误", "");
                        }
                        h5PayActivity.runOnUiThread(new OooOOO0(h5PayActivity));
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean OooOO0(C25047OooO00o c25047OooO00o, Context context, List<C25016OooO00o.OooO0O0> list, boolean z) {
        try {
            for (C25016OooO00o.OooO0O0 oooO0O0 : list) {
                if (oooO0O0 != null) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(oooO0O0.f84940OooO00o, 128);
                        if (packageInfo != null) {
                            if (!z) {
                                return true;
                            }
                            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgWltVer", packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "CheckLaunchAppExistEx", th);
            return false;
        }
    }

    public static HashMap OooOO0O(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=", 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static HashMap OooOO0o(String str, C25047OooO00o c25047OooO00o) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), OooOOOO(str2.substring(iIndexOf2 + 1), c25047OooO00o));
                }
            }
        }
        return map;
    }

    public static String OooOOO() {
        String strSubstring = "Unavailable";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (matcher.matches() && matcher.groupCount() >= 4) {
                    strSubstring = matcher.group(1) + IOUtils.LINE_SEPARATOR_UNIX + matcher.group(2) + " " + matcher.group(3) + IOUtils.LINE_SEPARATOR_UNIX + matcher.group(4);
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
        }
        int iIndexOf = strSubstring.indexOf(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        int iIndexOf2 = strSubstring.indexOf(IOUtils.LINE_SEPARATOR_UNIX);
        if (iIndexOf2 != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Linux ", strSubstring);
    }

    public static int OooOOO0(String str) {
        try {
            String str2 = C25016OooO00o.OooO00o().f84923OooOOo0;
            if (TextUtils.isEmpty(str2)) {
                return 0;
            }
            String string = Settings.Secure.getString(((Application) ((Context) C25048OooO0O0.OooO0O0().f85047OooO00o)).getContentResolver(), str2);
            return ((string != null ? string : "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String OooOOOO(String str, C25047OooO00o c25047OooO00o) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "H5PayDataAnalysisError", e);
            return "";
        }
    }

    public static String OooOOOo(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels + C18358t1.g.f56183c + displayMetrics.heightPixels;
    }

    public static String OooOOo(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getAuthority() + uri.getPath();
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
            return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
    }

    public static String OooOOo0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length <= 16) {
                return OooO0o0(bArrDigest);
            }
            byte[] bArr = new byte[16];
            System.arraycopy(bArrDigest, 0, bArr, 0, 16);
            return OooO0o0(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
