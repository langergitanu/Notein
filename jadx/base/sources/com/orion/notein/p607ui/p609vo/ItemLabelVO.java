package com.orion.notein.p607ui.p609vo;

import OooOooo.C20785Oooo00o;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/vo/ItemLabelVO;", "Landroid/os/Parcelable;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ItemLabelVO implements Parcelable {
    public static final Parcelable.Creator<ItemLabelVO> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f80080OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f80081OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f80082OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f80083OooOoO0;

    public static final class OooO00o implements Parcelable.Creator<ItemLabelVO> {
        @Override // android.os.Parcelable.Creator
        public final ItemLabelVO createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new ItemLabelVO(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemLabelVO[] newArray(int i) {
            return new ItemLabelVO[i];
        }
    }

    public ItemLabelVO(long j, String name, int i, float f) {
        OooOOO0.OooO0oO(name, "name");
        this.f80081OooOo0o = j;
        this.f80080OooOo = name;
        this.f80083OooOoO0 = i;
        this.f80082OooOoO = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemLabelVO)) {
            return false;
        }
        ItemLabelVO itemLabelVO = (ItemLabelVO) obj;
        return this.f80081OooOo0o == itemLabelVO.f80081OooOo0o && OooOOO0.OooO0O0(this.f80080OooOo, itemLabelVO.f80080OooOo) && this.f80083OooOoO0 == itemLabelVO.f80083OooOoO0 && Float.compare(this.f80082OooOoO, itemLabelVO.f80082OooOoO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f80082OooOoO) + C20785Oooo00o.OooO00o(this.f80083OooOoO0, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Long.hashCode(this.f80081OooOo0o) * 31, 31, this.f80080OooOo), 31);
    }

    public final String toString() {
        return "ItemLabelVO(id=" + this.f80081OooOo0o + ", name=" + this.f80080OooOo + ", color=" + this.f80083OooOoO0 + ", index=" + this.f80082OooOoO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeLong(this.f80081OooOo0o);
        dest.writeString(this.f80080OooOo);
        dest.writeInt(this.f80083OooOoO0);
        dest.writeFloat(this.f80082OooOoO);
    }
}
