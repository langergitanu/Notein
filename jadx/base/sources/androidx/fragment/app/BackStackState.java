package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f64749OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f64750OooOo0o;

    public class OooO00o implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f64750OooOo0o = arrayList;
        this.f64749OooOo = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f64750OooOo0o);
        parcel.writeTypedList(this.f64749OooOo);
    }

    public BackStackState(Parcel parcel) {
        this.f64750OooOo0o = parcel.createStringArrayList();
        this.f64749OooOo = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
