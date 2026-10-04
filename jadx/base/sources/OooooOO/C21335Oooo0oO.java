package OooooOO;

import android.content.Context;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: OooooOO.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21335Oooo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61750OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f61751OooO0O0 = 0;

    public static final C21334Oooo0o0 OooO00o() {
        return new C21334Oooo0o0(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO0O0(Context context, String str, String str2) {
        if (str != null) {
            switch (str.hashCode()) {
                case 1457223783:
                    if (str.equals("199998")) {
                        str2 = context.getString(R.string.no_user);
                    } else if (str2 == null) {
                        str2 = "";
                    }
                    break;
                case 1457223784:
                    if (str.equals("199999")) {
                        str2 = context.getString(R.string.network_error);
                        break;
                    }
                    break;
                case 1505893342:
                    if (str.equals("300001")) {
                        str2 = context.getString(R.string.error_submit_purchase_history_conflict);
                        break;
                    }
                    break;
                case 1505893343:
                    if (str.equals("300002")) {
                        str2 = context.getString(R.string.error_submit_notein_purchase_history);
                        break;
                    }
                    break;
                case 1506816863:
                    if (str.equals("310001")) {
                        str2 = context.getString(R.string.error_client_not_ready);
                        break;
                    }
                    break;
                case 1506816864:
                    if (str.equals("310002")) {
                        str2 = context.getString(R.string.error_no_purchases);
                        break;
                    }
                    break;
                case 1506816865:
                    if (str.equals("310003")) {
                        str2 = context.getString(R.string.error_order_no_purchased);
                        break;
                    }
                    break;
                case 1506816867:
                    if (str.equals("310005")) {
                        str2 = context.getString(R.string.error_no_purchase_history);
                        break;
                    }
                    break;
                case 1506816868:
                    if (str.equals("310006")) {
                        str2 = context.getString(R.string.error_no_notein_purchase_history);
                        break;
                    }
                    break;
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(str2);
        if (str == null) {
            str = "399999";
        }
        String string = context.getString(R.string.restore_purchase_failed, str, str2);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    public static String OooO0OO(Context context, int i) {
        switch (i) {
            case 1001:
                String string = context.getString(R.string.login_error_toast_no_google_id_token);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                return string;
            case 1002:
                String string2 = context.getString(R.string.login_error_toast_network_failed);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string2);
                return string2;
            case 1003:
                String string3 = context.getString(R.string.login_error_toast_firebase_sign_failed);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string3);
                return string3;
            case 1004:
                String string4 = context.getString(R.string.login_error_toast_firebase_no_user);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string4);
                return string4;
            case 1005:
                String string5 = context.getString(R.string.login_error_toast_firebase_auth_failed);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string5);
                return string5;
            case 1006:
                String string6 = context.getString(R.string.login_error_toast_no_google_credential);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string6);
                return string6;
            case 1007:
                String string7 = context.getString(R.string.login_error_toast_provider_credential_auth_failed);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string7);
                return string7;
            case 1008:
                String string8 = context.getString(R.string.login_error_toast_email_conflict);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string8);
                return string8;
            case 1009:
                String string9 = context.getString(R.string.login_error_toast_invalid_email_or_password);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string9);
                return string9;
            case 1010:
                String string10 = context.getString(R.string.login_error_toast_current_password_error);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string10);
                return string10;
            default:
                String string11 = context.getString(R.string.login_error_toast);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string11);
                return string11;
        }
    }
}
