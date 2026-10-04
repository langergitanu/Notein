package com.hihonor.cloudservice.support.account.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.hihonor.cloudservice.support.feature.result.AbstractSignInAccountInfo;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public class SignInAccountInfo extends AbstractSignInAccountInfo {
    public static final Parcelable.Creator<SignInAccountInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f68818Oooo00O;

    public class OooO00o implements Parcelable.Creator<SignInAccountInfo> {
        @Override // android.os.Parcelable.Creator
        public final SignInAccountInfo createFromParcel(Parcel parcel) {
            SignInAccountInfo signInAccountInfo = new SignInAccountInfo();
            signInAccountInfo.f68830OooOo0o = parcel.readString();
            signInAccountInfo.f68829OooOo = parcel.readString();
            signInAccountInfo.f68831OooOoO = parcel.readString();
            signInAccountInfo.f68832OooOoO0 = new HashSet();
            signInAccountInfo.f68833OooOoOO = parcel.readString();
            signInAccountInfo.f68835OooOoo0 = parcel.readString();
            signInAccountInfo.f68836OooOooO = parcel.readString();
            signInAccountInfo.f68837OooOooo = parcel.readLong();
            signInAccountInfo.f68838Oooo000 = parcel.readString();
            signInAccountInfo.f68818Oooo00O = parcel.readInt();
            return signInAccountInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final SignInAccountInfo[] newArray(int i) {
            return new SignInAccountInfo[i];
        }
    }

    public SignInAccountInfo() {
        this.f68832OooOoO0 = new HashSet();
        this.f68818Oooo00O = 0;
    }

    @Override // com.hihonor.cloudservice.support.feature.result.AbstractSignInAccountInfo
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SignInAccountInfo) {
            return this.f68832OooOoO0.equals(((SignInAccountInfo) obj).f68832OooOoO0);
        }
        return false;
    }

    @Override // com.hihonor.cloudservice.support.feature.result.AbstractSignInAccountInfo
    public final int hashCode() {
        return new HashSet(this.f68834OooOoo).hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.String] */
    @Override // com.hihonor.cloudservice.support.feature.result.AbstractSignInAccountInfo
    public final String toString() {
        StringBuilder sb = new StringBuilder("{photoUriString: ");
        sb.append(this.f68829OooOo);
        sb.append(",accountFlag");
        int i = this.f68818Oooo00O;
        return APMediaMessage.IMediaObject.type();
    }

    @Override // com.hihonor.cloudservice.support.feature.result.AbstractSignInAccountInfo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f68818Oooo00O);
    }
}
