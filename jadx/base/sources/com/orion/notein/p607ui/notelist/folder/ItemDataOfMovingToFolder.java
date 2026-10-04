package com.orion.notein.p607ui.notelist.folder;

import Oooo0oO.C21023OooO0Oo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/folder/ItemDataOfMovingToFolder;", "Landroid/os/Parcelable;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ItemDataOfMovingToFolder implements Parcelable {
    public static final Parcelable.Creator<ItemDataOfMovingToFolder> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f77651OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f77652OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f77653OooOoO0;

    public static final class OooO00o implements Parcelable.Creator<ItemDataOfMovingToFolder> {
        @Override // android.os.Parcelable.Creator
        public final ItemDataOfMovingToFolder createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new ItemDataOfMovingToFolder(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemDataOfMovingToFolder[] newArray(int i) {
            return new ItemDataOfMovingToFolder[i];
        }
    }

    public ItemDataOfMovingToFolder(String str, String str2, int i) {
        this.f77652OooOo0o = str;
        this.f77651OooOo = str2;
        this.f77653OooOoO0 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemDataOfMovingToFolder)) {
            return false;
        }
        ItemDataOfMovingToFolder itemDataOfMovingToFolder = (ItemDataOfMovingToFolder) obj;
        return OooOOO0.OooO0O0(this.f77652OooOo0o, itemDataOfMovingToFolder.f77652OooOo0o) && OooOOO0.OooO0O0(this.f77651OooOo, itemDataOfMovingToFolder.f77651OooOo) && this.f77653OooOoO0 == itemDataOfMovingToFolder.f77653OooOoO0;
    }

    public final int hashCode() {
        String str = this.f77652OooOo0o;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77651OooOo;
        return Integer.hashCode(this.f77653OooOoO0) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemDataOfMovingToFolder(noteId=");
        sb.append(this.f77652OooOo0o);
        sb.append(", folderId=");
        sb.append(this.f77651OooOo);
        sb.append(", type=");
        return C21023OooO0Oo.OooO0OO(")", this.f77653OooOoO0, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.f77652OooOo0o);
        dest.writeString(this.f77651OooOo);
        dest.writeInt(this.f77653OooOoO0);
    }

    public /* synthetic */ ItemDataOfMovingToFolder(String str, String str2, int i, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, i);
    }
}
