package androidx.compose.runtime;

import Oooo0oO.C21098o0000oOo;
import OoooOOo.C21200OooOOO0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "LOooo0oO/o0000oOo;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "runtime_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ParcelableSnapshotMutableFloatState extends C21098o0000oOo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            float f = parcel.readFloat();
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = new ParcelableSnapshotMutableFloatState();
            C21098o0000oOo.OooO00o oooO00o = new C21098o0000oOo.OooO00o(f);
            if (C21200OooOOO0.f61495OooO0O0.OooO0o0() != null) {
                C21098o0000oOo.OooO00o oooO00o2 = new C21098o0000oOo.OooO00o(f);
                oooO00o2.f61574OooO00o = 1;
                oooO00o.f61575OooO0O0 = oooO00o2;
            }
            parcelableSnapshotMutableFloatState.f61203OooOo = oooO00o;
            return parcelableSnapshotMutableFloatState;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableFloatState[] newArray(int i) {
            return new ParcelableSnapshotMutableFloatState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(((C21098o0000oOo.OooO00o) C21200OooOOO0.OooOo00(this.f61203OooOo, this)).f61204OooO0OO);
    }
}
