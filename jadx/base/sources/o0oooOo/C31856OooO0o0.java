package o0oooOo;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: o0oooOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31856OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f113537OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f113538OooO0O0;

    /* JADX INFO: renamed from: o0oooOo.OooO0o0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f113539OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f113540OooO0O0;

        public OooO00o(int i, String str) {
            this.f113539OooO00o = i;
            this.f113540OooO0O0 = str;
        }

        public final String toString() {
            return "errorCode=" + this.f113539OooO00o + ",errorMessage=" + this.f113540OooO0O0;
        }
    }

    /* JADX INFO: renamed from: o0oooOo.OooO0o0$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final String f113541OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f113542OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f113543OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f113544OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f113545OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f113546OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f113547OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f113548OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final String f113549OooO0oo;

        public OooO0O0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f113542OooO00o = str;
            this.f113543OooO0O0 = str2;
            this.f113544OooO0OO = str3;
            this.f113545OooO0Oo = str4;
            this.f113547OooO0o0 = str5;
            this.f113546OooO0o = str6;
            this.f113548OooO0oO = str7;
            this.f113549OooO0oo = str8;
            this.f113541OooO = str9;
        }

        public final String toString() {
            return "accessToken=" + this.f113542OooO00o + ",expiresIn=" + this.f113543OooO0O0 + ",scope=" + this.f113544OooO0OO + ",state=" + this.f113545OooO0Oo + ",tokenType=" + this.f113547OooO0o0 + ",macKey=" + this.f113546OooO0o + ",macAlogorithm=" + this.f113548OooO0oO + ",code=" + this.f113549OooO0oo + ",info=" + this.f113541OooO;
        }
    }

    public C31856OooO0o0(OooO00o oooO00o) {
        this.f113537OooO00o = null;
        this.f113538OooO0O0 = oooO00o;
    }

    public static String OooO00o(String str, String str2, Bundle bundle) {
        return bundle.containsKey(str) ? bundle.getString(str) : bundle.getString(str2);
    }

    public static String OooO0O0(String str, String str2, Bundle bundle) {
        Object obj;
        String[] strArr = {str, str2};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(str3) && bundle.containsKey(str3) && (obj = bundle.get(str3)) != null) {
                return obj instanceof Integer ? ((Integer) obj).toString() : obj.toString();
            }
        }
        return null;
    }

    public static C31856OooO0o0 OooO0OO(Bundle bundle) {
        int i;
        if (bundle == null) {
            return null;
        }
        int i2 = 0;
        try {
            i = Integer.parseInt(OooO0O0("extra_error_code", "error", bundle));
        } catch (NumberFormatException unused) {
            Log.w("XiaomiOAuthResults", "error, return 0 instead:");
            i = 0;
        }
        if (i != 0) {
            try {
                i2 = Integer.parseInt(OooO0O0("extra_error_code", "error", bundle));
            } catch (NumberFormatException unused2) {
                Log.w("XiaomiOAuthResults", "error, return 0 instead:");
            }
            return new C31856OooO0o0(new OooO00o(i2, OooO00o("extra_error_description", "error_description", bundle)));
        }
        return new C31856OooO0o0(new OooO0O0(OooO00o("access_token", "extra_access_token", bundle), OooO0O0("expires_in", "extra_expires_in", bundle), OooO00o("scope", "extra_scope", bundle), OooO00o("state", "extra_state", bundle), OooO00o("token_type", "extra_token_type", bundle), OooO00o("mac_key", "extra_mac_key", bundle), OooO00o("mac_algorithm", "extra_mac_algorithm", bundle), OooO00o("code", "extra_code", bundle), OooO00o("info", "info", bundle)));
    }

    public final String toString() {
        OooO0O0 oooO0O0 = this.f113537OooO00o;
        if (oooO0O0 != null) {
            return oooO0O0.toString();
        }
        OooO00o oooO00o = this.f113538OooO0O0;
        if (oooO00o != null) {
            return oooO00o.toString();
        }
        throw new IllegalStateException("should not be here.");
    }

    public C31856OooO0o0(OooO0O0 oooO0O0) {
        this.f113537OooO00o = oooO0O0;
        this.f113538OooO0O0 = null;
    }
}
