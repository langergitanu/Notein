package com.hihonor.cloudservice.support.account.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.hihonor.cloudservice.support.api.entity.auth.PermissionInfo;
import com.hihonor.cloudservice.support.api.entity.auth.Scope;
import com.hihonor.cloudservice.support.feature.request.AbstractSignInOptions;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public class SignInOptions extends AbstractSignInOptions {
    public static final Parcelable.Creator<SignInOptions> CREATOR;
    public static final SignInOptions DEFAULT_AUTH_REQUEST_PARAM;

    public class OooO00o implements Parcelable.Creator<SignInOptions> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SignInOptions createFromParcel(Parcel parcel) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final SignInOptions[] newArray(int i) {
            return new SignInOptions[i];
        }
    }

    static {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add(AbstractSignInOptions.OPENID);
        hashSet.add(AbstractSignInOptions.PROFILE);
        DEFAULT_AUTH_REQUEST_PARAM = new SignInOptions(new ArrayList(hashSet), new ArrayList(hashSet2), "");
        CREATOR = new OooO00o();
    }

    public SignInOptions() {
        throw null;
    }

    @Override // com.hihonor.cloudservice.support.feature.request.AbstractSignInOptions
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        SignInOptions signInOptions = (SignInOptions) obj;
        return AbstractSignInOptions.OooO00o(this.f68827OooOo0o, signInOptions.f68827OooOo0o) && AbstractSignInOptions.OooO00o(this.f68826OooOo, signInOptions.f68826OooOo);
    }

    @Override // com.hihonor.cloudservice.support.feature.request.AbstractSignInOptions
    public final int hashCode() {
        ArrayList<Scope> arrayList = this.f68827OooOo0o;
        int iHashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        ArrayList<PermissionInfo> arrayList2 = this.f68826OooOo;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }
}
