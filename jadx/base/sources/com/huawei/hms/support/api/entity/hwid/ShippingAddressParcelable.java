package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ShippingAddressParcelable implements Parcelable {
    public static final Parcelable.Creator<ShippingAddressParcelable> CREATOR = new Parcelable.Creator<ShippingAddressParcelable>() { // from class: com.huawei.hms.support.api.entity.hwid.ShippingAddressParcelable.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShippingAddressParcelable createFromParcel(Parcel parcel) {
            return new ShippingAddressParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShippingAddressParcelable[] newArray(int i) {
            return new ShippingAddressParcelable[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private ArrayList<ShippingAddressInfo> f56924a;

    public ShippingAddressParcelable() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<ShippingAddressInfo> getShippingAddressInfoList() {
        return this.f56924a;
    }

    public void setShippingAddressInfoList(ArrayList<ShippingAddressInfo> arrayList) {
        this.f56924a = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f56924a);
    }

    public ShippingAddressParcelable(Parcel parcel) {
        this.f56924a = parcel.createTypedArrayList(ShippingAddressInfo.CREATOR);
    }
}
