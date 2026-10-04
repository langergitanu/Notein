package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.huawei.hms.core.aidl.b */
/* JADX INFO: loaded from: classes6.dex */
public class C17757b implements Parcelable {
    public static final Parcelable.Creator<C17757b> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public String f52535a;

    /* JADX INFO: renamed from: b */
    public Bundle f52536b;

    /* JADX INFO: renamed from: c */
    private int f52537c;

    /* JADX INFO: renamed from: d */
    private Bundle f52538d;

    /* JADX INFO: renamed from: com.huawei.hms.core.aidl.b$a */
    public static class a implements Parcelable.Creator<C17757b> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C17757b createFromParcel(Parcel parcel) {
            return new C17757b(parcel, (a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C17757b[] newArray(int i) {
            return new C17757b[i];
        }
    }

    public /* synthetic */ C17757b(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: renamed from: a */
    private static ClassLoader m75891a(Class cls) {
        return cls.getClassLoader();
    }

    /* JADX INFO: renamed from: b */
    public int m75895b() {
        return this.f52538d == null ? 0 : 1;
    }

    /* JADX INFO: renamed from: c */
    public int m75896c() {
        return this.f52537c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52537c);
        parcel.writeString(this.f52535a);
        parcel.writeBundle(this.f52536b);
        parcel.writeBundle(this.f52538d);
    }

    private C17757b(Parcel parcel) {
        this.f52536b = null;
        this.f52537c = 1;
        this.f52538d = null;
        m75892a(parcel);
    }

    /* JADX INFO: renamed from: a */
    public C17757b m75894a(Bundle bundle) {
        this.f52538d = bundle;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m75893a() {
        return this.f52538d;
    }

    /* JADX INFO: renamed from: a */
    private void m75892a(Parcel parcel) {
        this.f52537c = parcel.readInt();
        this.f52535a = parcel.readString();
        this.f52536b = parcel.readBundle(m75891a(Bundle.class));
        this.f52538d = parcel.readBundle(m75891a(Bundle.class));
    }

    public C17757b() {
        this.f52536b = null;
        this.f52537c = 1;
        this.f52538d = null;
    }

    public C17757b(String str, int i) {
        this.f52536b = null;
        this.f52538d = null;
        this.f52535a = str;
        this.f52537c = i;
    }
}
