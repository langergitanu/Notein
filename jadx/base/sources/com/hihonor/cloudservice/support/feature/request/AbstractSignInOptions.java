package com.hihonor.cloudservice.support.feature.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.hihonor.cloudservice.support.api.entity.auth.PermissionInfo;
import com.hihonor.cloudservice.support.api.entity.auth.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractSignInOptions implements Parcelable {
    public static final Scope EMAIL;
    public static final Scope OPENID;
    public static final Scope PROFILE;
    public static final PermissionInfo UID_DYNAMIC_PERMISSION;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList<PermissionInfo> f68826OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList<Scope> f68827OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f68828OooOoO0;

    static {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.f68824OooOoO0 = "com.hihonor.account.getUID";
        UID_DYNAMIC_PERMISSION = permissionInfo;
        PROFILE = new Scope("profile");
        EMAIL = new Scope("email");
        OPENID = new Scope("openid");
    }

    public AbstractSignInOptions(ArrayList arrayList, ArrayList arrayList2, String str) {
        this.f68827OooOo0o = arrayList;
        this.f68826OooOo = arrayList2;
        this.f68828OooOoO0 = str;
    }

    public static boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == arrayList2) {
            return true;
        }
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        return arrayList.containsAll(arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractSignInOptions)) {
            return false;
        }
        AbstractSignInOptions abstractSignInOptions = (AbstractSignInOptions) obj;
        return OooO00o(this.f68827OooOo0o, abstractSignInOptions.f68827OooOo0o) && OooO00o(this.f68826OooOo, abstractSignInOptions.f68826OooOo);
    }

    public int hashCode() {
        ArrayList<Scope> arrayList = this.f68827OooOo0o;
        int iHashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        ArrayList<PermissionInfo> arrayList2 = this.f68826OooOo;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f68827OooOo0o);
        parcel.writeList(this.f68826OooOo);
    }
}
