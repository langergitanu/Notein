package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList<String> f64866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList<String> f64867OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f64868OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public BackStackRecordState[] f64869OooOoO0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f64873OooOooO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f64870OooOoOO = null;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList<String> f64872OooOoo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ArrayList<BackStackState> f64871OooOoo = new ArrayList<>();

    public class OooO00o implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f64870OooOoOO = null;
            fragmentManagerState.f64872OooOoo0 = new ArrayList<>();
            fragmentManagerState.f64871OooOoo = new ArrayList<>();
            fragmentManagerState.f64867OooOo0o = parcel.createStringArrayList();
            fragmentManagerState.f64866OooOo = parcel.createStringArrayList();
            fragmentManagerState.f64869OooOoO0 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.f64868OooOoO = parcel.readInt();
            fragmentManagerState.f64870OooOoOO = parcel.readString();
            fragmentManagerState.f64872OooOoo0 = parcel.createStringArrayList();
            fragmentManagerState.f64871OooOoo = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.f64873OooOooO = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f64867OooOo0o);
        parcel.writeStringList(this.f64866OooOo);
        parcel.writeTypedArray(this.f64869OooOoO0, i);
        parcel.writeInt(this.f64868OooOoO);
        parcel.writeString(this.f64870OooOoOO);
        parcel.writeStringList(this.f64872OooOoo0);
        parcel.writeTypedList(this.f64871OooOoo);
        parcel.writeTypedList(this.f64873OooOooO);
    }
}
