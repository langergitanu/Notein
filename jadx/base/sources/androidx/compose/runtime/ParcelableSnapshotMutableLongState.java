package androidx.compose.runtime;

import Oooo0oO.C21101o0000ooO;
import OoooOOo.C21200OooOOO0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "LOooo0oO/o0000ooO;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "runtime_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ParcelableSnapshotMutableLongState extends C21101o0000ooO implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
            long j = parcel.readLong();
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = new ParcelableSnapshotMutableLongState();
            C21101o0000ooO.OooO00o oooO00o = new C21101o0000ooO.OooO00o(j);
            if (C21200OooOOO0.f61495OooO0O0.OooO0o0() != null) {
                C21101o0000ooO.OooO00o oooO00o2 = new C21101o0000ooO.OooO00o(j);
                oooO00o2.f61574OooO00o = 1;
                oooO00o.f61575OooO0O0 = oooO00o2;
            }
            parcelableSnapshotMutableLongState.f61208OooOo = oooO00o;
            return parcelableSnapshotMutableLongState;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableLongState[] newArray(int i) {
            return new ParcelableSnapshotMutableLongState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((C21101o0000ooO.OooO00o) C21200OooOOO0.OooOo00(this.f61208OooOo, this)).f61209OooO0OO);
    }
}
