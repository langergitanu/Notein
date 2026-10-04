package com.oplus.ocs.base.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oplus.ocs.base.utils.C18863c;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CapabilityInfo implements Parcelable {
    public static final Parcelable.Creator<CapabilityInfo> CREATOR = new Parcelable.Creator<CapabilityInfo>() { // from class: com.oplus.ocs.base.common.CapabilityInfo.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CapabilityInfo createFromParcel(Parcel parcel) {
            return new CapabilityInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CapabilityInfo[] newArray(int i) {
            return new CapabilityInfo[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private List<Feature> f57442a;

    /* JADX INFO: renamed from: b */
    private int f57443b;

    /* JADX INFO: renamed from: c */
    private AuthResult f57444c;

    /* JADX INFO: renamed from: d */
    private IBinder f57445d;
    public String mClassName;

    public CapabilityInfo(List<Feature> list, int i, AuthResult authResult) {
        this(list, i, authResult, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AuthResult getAuthResult() {
        return this.f57444c;
    }

    public IBinder getBinder() {
        return this.f57445d;
    }

    public String getClassName() {
        return this.mClassName;
    }

    public List<Feature> getFeatures() {
        return this.f57442a;
    }

    public int getVersion() {
        return this.f57443b;
    }

    public void setBinder(IBinder iBinder) {
        this.f57445d = iBinder;
    }

    public void setClassName(String str) {
        this.mClassName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f57442a);
        parcel.writeInt(this.f57443b);
        C18863c.m80551a(parcel, this.f57444c, TextUtils.isEmpty(this.mClassName) ? AuthResult.class.getName() : this.mClassName);
        parcel.writeStrongBinder(this.f57445d);
    }

    public CapabilityInfo(List<Feature> list, int i, AuthResult authResult, IBinder iBinder) {
        this.f57442a = list;
        this.f57443b = i;
        this.f57444c = authResult;
        this.f57445d = iBinder;
    }

    public CapabilityInfo(Parcel parcel) {
        this.f57442a = parcel.readArrayList(Feature.class.getClassLoader());
        this.f57443b = parcel.readInt();
        this.f57444c = (AuthResult) C18863c.m80550a(parcel, AuthResult.class.getClassLoader(), TextUtils.isEmpty(this.mClassName) ? AuthResult.class.getName() : this.mClassName);
        this.f57445d = parcel.readStrongBinder();
    }
}
