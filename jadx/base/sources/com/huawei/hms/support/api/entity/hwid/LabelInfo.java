package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class LabelInfo implements Parcelable {
    public static final Parcelable.Creator<LabelInfo> CREATOR = new Parcelable.Creator<LabelInfo>() { // from class: com.huawei.hms.support.api.entity.hwid.LabelInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo createFromParcel(Parcel parcel) {
            return new LabelInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo[] newArray(int i) {
            return new LabelInfo[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private int f56922a;

    /* JADX INFO: renamed from: b */
    private String f56923b;

    public LabelInfo() {
        this.f56922a = -1;
        this.f56923b = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getLabelName() {
        return this.f56923b;
    }

    public int getLabelType() {
        return this.f56922a;
    }

    public boolean isEquals(LabelInfo labelInfo) {
        return labelInfo != null && getLabelType() == labelInfo.getLabelType() && getLabelName().equals(labelInfo.getLabelName());
    }

    public void setLabelName(String str) {
        this.f56923b = str;
    }

    public void setLabelType(int i) {
        this.f56922a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56922a);
        parcel.writeString(this.f56923b);
    }

    public LabelInfo(Parcel parcel) {
        this.f56922a = parcel.readInt();
        this.f56923b = parcel.readString();
    }
}
