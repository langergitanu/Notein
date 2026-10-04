package com.orion.notein.p607ui.label;

import Oooo0oO.C21023OooO0Oo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/label/ItemData;", "Landroid/os/Parcelable;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ItemData implements Parcelable {
    public static final Parcelable.Creator<ItemData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f71887OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f71888OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f71889OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f71890OooOoO0;

    public static final class OooO00o implements Parcelable.Creator<ItemData> {
        @Override // android.os.Parcelable.Creator
        public final ItemData createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new ItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemData[] newArray(int i) {
            return new ItemData[i];
        }
    }

    public ItemData(String str, String str2, String str3, int i) {
        this.f71888OooOo0o = str;
        this.f71887OooOo = str2;
        this.f71890OooOoO0 = str3;
        this.f71889OooOoO = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemData)) {
            return false;
        }
        ItemData itemData = (ItemData) obj;
        return OooOOO0.OooO0O0(this.f71888OooOo0o, itemData.f71888OooOo0o) && OooOOO0.OooO0O0(this.f71887OooOo, itemData.f71887OooOo) && OooOOO0.OooO0O0(this.f71890OooOoO0, itemData.f71890OooOoO0) && this.f71889OooOoO == itemData.f71889OooOoO;
    }

    public final int hashCode() {
        String str = this.f71888OooOo0o;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71887OooOo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71890OooOoO0;
        return Integer.hashCode(this.f71889OooOoO) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemData(folderId=");
        sb.append(this.f71888OooOo0o);
        sb.append(", noteId=");
        sb.append(this.f71887OooOo);
        sb.append(", pageId=");
        sb.append(this.f71890OooOoO0);
        sb.append(", type=");
        return C21023OooO0Oo.OooO0OO(")", this.f71889OooOoO, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.f71888OooOo0o);
        dest.writeString(this.f71887OooOo);
        dest.writeString(this.f71890OooOoO0);
        dest.writeInt(this.f71889OooOoO);
    }

    public /* synthetic */ ItemData(String str, String str2, String str3, int i, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, i);
    }
}
