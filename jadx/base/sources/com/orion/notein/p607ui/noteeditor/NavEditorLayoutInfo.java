package com.orion.notein.p607ui.noteeditor;

import OooOooo.C20785Oooo00o;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J@\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b*\u0010\u0013¨\u0006+"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/NavEditorLayoutInfo;", "Landroid/os/Parcelable;", "", "", "noteIdList", "", "layoutType", "", "indicatorBias", "focusIndex", "<init>", "(Ljava/util/List;ILjava/lang/Float;I)V", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/Float;", "component4", "copy", "(Ljava/util/List;ILjava/lang/Float;I)Lcom/orion/notein/ui/noteeditor/NavEditorLayoutInfo;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getNoteIdList", "I", "getLayoutType", "Ljava/lang/Float;", "getIndicatorBias", "getFocusIndex", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NavEditorLayoutInfo implements Parcelable {
    public static final Parcelable.Creator<NavEditorLayoutInfo> CREATOR = new OooO00o();
    private final int focusIndex;
    private final Float indicatorBias;
    private final int layoutType;
    private final List<String> noteIdList;

    public static final class OooO00o implements Parcelable.Creator<NavEditorLayoutInfo> {
        @Override // android.os.Parcelable.Creator
        public final NavEditorLayoutInfo createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new NavEditorLayoutInfo(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NavEditorLayoutInfo[] newArray(int i) {
            return new NavEditorLayoutInfo[i];
        }
    }

    public NavEditorLayoutInfo(List<String> noteIdList, int i, Float f, int i2) {
        OooOOO0.OooO0oO(noteIdList, "noteIdList");
        this.noteIdList = noteIdList;
        this.layoutType = i;
        this.indicatorBias = f;
        this.focusIndex = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavEditorLayoutInfo copy$default(NavEditorLayoutInfo navEditorLayoutInfo, List list, int i, Float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = navEditorLayoutInfo.noteIdList;
        }
        if ((i3 & 2) != 0) {
            i = navEditorLayoutInfo.layoutType;
        }
        if ((i3 & 4) != 0) {
            f = navEditorLayoutInfo.indicatorBias;
        }
        if ((i3 & 8) != 0) {
            i2 = navEditorLayoutInfo.focusIndex;
        }
        return navEditorLayoutInfo.copy(list, i, f, i2);
    }

    public final List<String> component1() {
        return this.noteIdList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLayoutType() {
        return this.layoutType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getIndicatorBias() {
        return this.indicatorBias;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFocusIndex() {
        return this.focusIndex;
    }

    public final NavEditorLayoutInfo copy(List<String> noteIdList, int layoutType, Float indicatorBias, int focusIndex) {
        OooOOO0.OooO0oO(noteIdList, "noteIdList");
        return new NavEditorLayoutInfo(noteIdList, layoutType, indicatorBias, focusIndex);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavEditorLayoutInfo)) {
            return false;
        }
        NavEditorLayoutInfo navEditorLayoutInfo = (NavEditorLayoutInfo) other;
        return OooOOO0.OooO0O0(this.noteIdList, navEditorLayoutInfo.noteIdList) && this.layoutType == navEditorLayoutInfo.layoutType && OooOOO0.OooO0O0(this.indicatorBias, navEditorLayoutInfo.indicatorBias) && this.focusIndex == navEditorLayoutInfo.focusIndex;
    }

    public final int getFocusIndex() {
        return this.focusIndex;
    }

    public final Float getIndicatorBias() {
        return this.indicatorBias;
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final List<String> getNoteIdList() {
        return this.noteIdList;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.layoutType, this.noteIdList.hashCode() * 31, 31);
        Float f = this.indicatorBias;
        return Integer.hashCode(this.focusIndex) + ((iOooO00o + (f == null ? 0 : f.hashCode())) * 31);
    }

    public String toString() {
        return "NavEditorLayoutInfo(noteIdList=" + this.noteIdList + ", layoutType=" + this.layoutType + ", indicatorBias=" + this.indicatorBias + ", focusIndex=" + this.focusIndex + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeStringList(this.noteIdList);
        dest.writeInt(this.layoutType);
        Float f = this.indicatorBias;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        dest.writeInt(this.focusIndex);
    }
}
