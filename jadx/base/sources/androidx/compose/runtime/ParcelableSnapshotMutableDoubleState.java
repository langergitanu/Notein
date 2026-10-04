package androidx.compose.runtime;

import Oooo0oO.C21097o0000oOO;
import OoooOOo.C21200OooOOO0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "LOooo0oO/o0000oOO;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "runtime_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ParcelableSnapshotMutableDoubleState extends C21097o0000oOO implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            double d = parcel.readDouble();
            ParcelableSnapshotMutableDoubleState parcelableSnapshotMutableDoubleState = new ParcelableSnapshotMutableDoubleState();
            C21097o0000oOO.OooO00o oooO00o = new C21097o0000oOO.OooO00o(d);
            if (C21200OooOOO0.f61495OooO0O0.OooO0o0() != null) {
                C21097o0000oOO.OooO00o oooO00o2 = new C21097o0000oOO.OooO00o(d);
                oooO00o2.f61574OooO00o = 1;
                oooO00o.f61575OooO0O0 = oooO00o2;
            }
            parcelableSnapshotMutableDoubleState.f61201OooOo = oooO00o;
            return parcelableSnapshotMutableDoubleState;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableDoubleState[] newArray(int i) {
            return new ParcelableSnapshotMutableDoubleState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(((C21097o0000oOO.OooO00o) C21200OooOOO0.OooOo00(this.f61201OooOo, this)).f61202OooO0OO);
    }
}
