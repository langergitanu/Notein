package com.hihonor.honorid.core.helper.handler;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class ErrorStatus implements Parcelable {
    public static final int ACCOUNT_NON_LOGIN = 31;
    public static final int ACCOUNT_NOT_EXIST = 13;
    public static final int AREA_NOT_ALLOW = 23;
    public static final int BIND_SERVICE_SYSTEM_ERROR = 40;
    public static final Parcelable.Creator<ErrorStatus> CREATOR = new OooO00o();
    public static final int ERRORSTATUS_NULL = 32;
    public static final int ERROR_ACCESS = 15;
    public static final int ERROR_ACCESS_SERVER_RETURN_ERROR = 56;
    public static final int ERROR_ACCOUNT_RISK_CONTROL = 72;
    public static final int ERROR_AUTH_EXCEPTION = 3003;
    public static final int ERROR_CALL_TIMEOUT = 60;
    public static final int ERROR_CANCEL_AUTH = 70;
    public static final int ERROR_CANCEL_SCREENLOCK_PWD_VERIFY = 50;
    public static final int ERROR_CHANGE_HOME_COUNTRY = 45;
    public static final int ERROR_CLASS_CAST_EXCEPTION = 54;
    public static final int ERROR_HEAD_PIC_NOT_EXIST = 47;
    public static final int ERROR_HNID_HAS_LOGIN = 70;
    public static final int ERROR_HNID_IS_LOW_VERSION = 35;
    public static final int ERROR_HNID_IS_NOT_EXIT = 34;
    public static final int ERROR_HNID_UPLOAD_HEADPIC = 37;
    public static final int ERROR_INVALID_SCOPE = 67;
    public static final int ERROR_IO_EXCEPTION = 3004;
    public static final int ERROR_LOGIN_LEVEL_LOW = 65;
    public static final int ERROR_LOGOUT_FAILED = 19;
    public static final int ERROR_MCP_CHECK_FAIL = 57;
    public static final int ERROR_NEED_SHOW_UI = 71;
    public static final int ERROR_NETWORK_UNAVIABLE = 5;
    public static final int ERROR_NOT_OPNE = 402;
    public static final int ERROR_NOT_USE_APK = 33;
    public static final int ERROR_NO_SEND_SMS_PERMISSION = 17;
    public static final int ERROR_NO_SIM = 6;
    public static final int ERROR_OPER_CANCEL = 3002;
    public static final int ERROR_OTHER_STATE = 58;
    public static final int ERROR_PACKAGE_NOT_MATCH = 66;
    public static final int ERROR_PACKAGE_SIGN_ERROR = 59;
    public static final int ERROR_PARAM_INVALID = 12;
    public static final int ERROR_PARAM_PARSING_FAIL = 67;
    public static final int ERROR_PARMS = 44;
    public static final int ERROR_PHONE_NOT_EXIST = 46;
    public static final int ERROR_PKG_NOT_IN_HNIDLIST = 43;
    public static final int ERROR_QRCODE_EXPIRED = 73;
    public static final int ERROR_QUERY_TCIS_STATUS_REFUES = 48;
    public static final int ERROR_SAVE_LOGOUT_INTENT = 38;
    public static final int ERROR_SCOPES_NOT_AUTHORIZE = 55;
    public static final int ERROR_SIGN_IN_AUTH = 2002;
    public static final int ERROR_SIGN_IN_CHECK_PASSWORD = 2004;
    public static final int ERROR_ST_INVALID = 68;
    public static final int ERROR_TCIS_NOT_SUPPORTED = 51;
    public static final int ERROR_UID_NOT_MATCH = 69;
    public static final int ERROR_UNACTIVE_ACCOUNT = 41;
    public static final int ERROR_UPDATE_CREDENTIALS_ERROR = 53;
    public static final int ERROR_USERID_NOT_MATCH_SYSTEM = 42;
    public static final int ERROR_VERIFY_TCIS_SCREENLOCK_PWD_FAIL = 49;
    public static final int HNID_NOT_ALLOW = 24;
    public static final int HNID_NOT_SUPPORT = 20;
    public static final int ILLEGAL_ARGUMENT_EXCEPTION = 1002;
    public static final int LOGIN_TIMEOUT = 39;
    public static final int PERMISSION_NOT_ALLOW = 27;
    public static final int QUICKLOGIN_NOT_SUPPORT = 21;
    public static final int READ_PHONE_STATE_NOT_ALLOW = 28;
    public static final int REQUEST_NOT_ALLOW = 25;
    public static final int SDK_NOT_SUPPORT_THIRD = 22;
    public static final int SERVICETOKEN_INVALID = 30;
    public static final int SIGNATURE_INVALID = 29;
    public static final String ST_STATUS_INVALID = "1";
    public static final String ST_STATUS_VALID = "0";
    public static final int THIRD_ACCOUNT_NOT_ALLOW = 26;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68953OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f68954OooOo0o;

    public class OooO00o implements Parcelable.Creator<ErrorStatus> {
        @Override // android.os.Parcelable.Creator
        public final ErrorStatus createFromParcel(Parcel parcel) {
            ErrorStatus errorStatus = new ErrorStatus();
            errorStatus.f68954OooOo0o = parcel.readInt();
            errorStatus.f68953OooOo = parcel.readString();
            return errorStatus;
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorStatus[] newArray(int i) {
            return new ErrorStatus[i];
        }
    }

    public ErrorStatus() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "[ErrorCode]:" + this.f68954OooOo0o + "[DES]:" + this.f68953OooOo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68954OooOo0o);
        parcel.writeString(this.f68953OooOo);
    }

    public ErrorStatus(int i, String str) {
        this.f68954OooOo0o = i;
        this.f68953OooOo = str;
    }
}
