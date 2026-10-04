package com.hihonor.cloudservice.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class Scope implements Parcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68825OooOo0o;

    public class OooO00o implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Scope scope = new Scope();
            scope.f68825OooOo0o = parcel.readString();
            return scope;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Scope[i];
        }
    }

    public Scope() {
        this.f68825OooOo0o = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Scope)) {
            return false;
        }
        return ((Scope) obj).f68825OooOo0o.equals(this.f68825OooOo0o);
    }

    public final int hashCode() {
        String str = this.f68825OooOo0o;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public final String toString() {
        return this.f68825OooOo0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68825OooOo0o);
    }

    public Scope(String str) {
        this.f68825OooOo0o = str;
    }
}
