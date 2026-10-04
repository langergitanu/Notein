package com.hihonor.honorid.core.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes8.dex */
public class HonorAccount implements Parcelable {
    public static final Parcelable.Creator<HonorAccount> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68853OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68855OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68856OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68857OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f68858OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f68860OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public String f68861OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f68862Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public String f68863Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f68864Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public String f68865Oooo00O;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public String f68867Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public String f68868Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f68869Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public String f68870Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f68871Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f68872Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f68874OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f68875OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public String f68876OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f68877OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public String f68878OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public String f68879o000oOoO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68854OooOo0o = "-1";

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f68859OooOoo0 = 0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public String f68866Oooo00o = "";

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f68873OoooO = 0;

    public class OooO00o implements Parcelable.Creator<HonorAccount> {
        @Override // android.os.Parcelable.Creator
        public final HonorAccount createFromParcel(Parcel parcel) {
            HonorAccount honorAccount = new HonorAccount();
            honorAccount.f68854OooOo0o = parcel.readString();
            honorAccount.f68853OooOo = parcel.readString();
            honorAccount.f68856OooOoO0 = parcel.readString();
            honorAccount.f68855OooOoO = parcel.readString();
            honorAccount.f68857OooOoOO = parcel.readString();
            honorAccount.f68859OooOoo0 = parcel.readInt();
            honorAccount.f68858OooOoo = parcel.readString();
            honorAccount.f68860OooOooO = parcel.readString();
            honorAccount.f68861OooOooo = parcel.readString();
            honorAccount.f68864Oooo000 = parcel.readString();
            honorAccount.f68865Oooo00O = parcel.readString();
            honorAccount.f68866Oooo00o = parcel.readString();
            honorAccount.f68863Oooo0 = parcel.readString();
            honorAccount.f68867Oooo0O0 = parcel.readString();
            honorAccount.f68868Oooo0OO = parcel.readString();
            honorAccount.f68870Oooo0o0 = parcel.readString();
            honorAccount.f68869Oooo0o = parcel.readString();
            honorAccount.f68871Oooo0oO = parcel.readString();
            honorAccount.f68872Oooo0oo = parcel.readString();
            honorAccount.f68862Oooo = parcel.readString();
            honorAccount.f68875OoooO00 = parcel.readString();
            honorAccount.f68874OoooO0 = parcel.readString();
            honorAccount.f68877OoooOO0 = parcel.readByte() == 1;
            honorAccount.f68879o000oOoO = parcel.readString();
            honorAccount.f68878OoooOOO = parcel.readString();
            return honorAccount;
        }

        @Override // android.os.Parcelable.Creator
        public final HonorAccount[] newArray(int i) {
            return new HonorAccount[i];
        }
    }

    public final void OooO00o(Bundle bundle) {
        this.f68854OooOo0o = bundle.getString("sL");
        this.f68853OooOo = bundle.getString("requestTokenType");
        this.f68856OooOoO0 = bundle.getString("serviceToken");
        String string = bundle.getString("accountName");
        if (TextUtils.isEmpty(string)) {
            string = "";
        } else {
            if (string.contains("+86")) {
                string = string.replace("+", "00");
            }
            if (string.startsWith("0086")) {
                string = string.substring(4);
            }
        }
        this.f68855OooOoO = string;
        this.f68857OooOoOO = bundle.getString(TmemberRight.TAG_USERID);
        this.f68859OooOoo0 = bundle.getInt("siteId");
        this.f68858OooOoo = bundle.getString(HttpHeaders.COOKIE);
        this.f68860OooOooO = bundle.getString(TmemberRight.TAG_DEVICEID);
        this.f68861OooOooo = bundle.getString("subDeviceId");
        this.f68864Oooo000 = bundle.getString("deviceType");
        this.f68865Oooo00O = bundle.getString(UserAccountInfo.TAG_ACCOUNT_TYPE);
        this.f68866Oooo00o = bundle.getString("loginUserName");
        this.f68863Oooo0 = bundle.getString("countryIsoCode");
        this.f68867Oooo0O0 = bundle.getString("STValidStatus");
        this.f68868Oooo0OO = bundle.getString(CommonConstant.KEY_SERVICE_COUNTRY_CODE);
        this.f68870Oooo0o0 = bundle.getString(DeviceInfo.TAG_UUID);
        this.f68869Oooo0o = bundle.getString("as_server_domain");
        this.f68871Oooo0oO = bundle.getString("cas_server_domain");
        this.f68876OoooO0O = bundle.getString("siteDomain");
        this.f68873OoooO = bundle.getInt(CommonConstant.KEY_HOME_ZONE, 0);
        this.f68872Oooo0oo = bundle.getString("lastupdatetime");
        this.f68862Oooo = bundle.getString("access_token");
        this.f68875OoooO00 = bundle.getString("code");
        this.f68874OoooO0 = bundle.getString("open_id");
        this.f68877OoooOO0 = bundle.getBoolean("isRealName");
        this.f68879o000oOoO = bundle.getString("union_id");
        this.f68878OoooOOO = bundle.getString("id_token");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "HonorAccount";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68854OooOo0o);
        parcel.writeString(this.f68853OooOo);
        parcel.writeString(this.f68856OooOoO0);
        parcel.writeString(this.f68855OooOoO);
        parcel.writeString(this.f68857OooOoOO);
        parcel.writeInt(this.f68859OooOoo0);
        parcel.writeString(this.f68858OooOoo);
        parcel.writeString(this.f68860OooOooO);
        parcel.writeString(this.f68861OooOooo);
        parcel.writeString(this.f68864Oooo000);
        parcel.writeString(this.f68865Oooo00O);
        parcel.writeString(this.f68866Oooo00o);
        parcel.writeString(this.f68863Oooo0);
        parcel.writeString(this.f68867Oooo0O0);
        parcel.writeString(this.f68868Oooo0OO);
        parcel.writeString(this.f68870Oooo0o0);
        parcel.writeString(this.f68869Oooo0o);
        parcel.writeString(this.f68871Oooo0oO);
        parcel.writeString(this.f68872Oooo0oo);
        parcel.writeString(this.f68862Oooo);
        parcel.writeString(this.f68875OoooO00);
        parcel.writeString(this.f68874OoooO0);
        parcel.writeByte(this.f68877OoooOO0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68879o000oOoO);
        parcel.writeString(this.f68878OoooOOO);
    }
}
