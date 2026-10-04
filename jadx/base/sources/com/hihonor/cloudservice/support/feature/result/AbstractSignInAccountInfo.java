package com.hihonor.cloudservice.support.feature.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.concurrent.futures.OooO00o;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractSignInAccountInfo implements Parcelable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68830OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68831OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public HashSet f68832OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68833OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public HashSet f68834OooOoo = new HashSet();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f68835OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f68836OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f68837OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f68838Oooo000;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractSignInAccountInfo) {
            return this.f68832OooOoO0.equals(((AbstractSignInAccountInfo) obj).f68832OooOoO0);
        }
        return false;
    }

    public int hashCode() {
        return new HashSet(this.f68834OooOoo).hashCode();
    }

    public String toString() {
        return OooO00o.OooO0OO(new StringBuilder("{displayName: photoUriString: "), this.f68829OooOo, ",serviceCountryCode: countryCode: ");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68830OooOo0o);
        parcel.writeString(this.f68829OooOo);
        parcel.writeString(this.f68831OooOoO);
        parcel.writeList(new ArrayList(this.f68832OooOoO0));
        parcel.writeString(this.f68833OooOoOO);
        parcel.writeString(this.f68835OooOoo0);
        parcel.writeString(this.f68836OooOooO);
        parcel.writeLong(this.f68837OooOooo);
        parcel.writeString(this.f68838Oooo000);
    }
}
