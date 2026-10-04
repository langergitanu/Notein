package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC21907Oooo;
import androidx.lifecycle.AbstractC21979OooOOo0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList<String> f64735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int[] f64736OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int[] f64737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int[] f64738OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f64739OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f64740OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f64741OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f64742OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final CharSequence f64743OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ArrayList<String> f64744Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f64745Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final CharSequence f64746Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final ArrayList<String> f64747Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final boolean f64748Oooo0O0;

    public class OooO00o implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.OooO00o oooO00o) {
        int size = oooO00o.f65008OooO0OO.size();
        this.f64736OooOo0o = new int[size * 6];
        if (!oooO00o.f65005OooO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f64735OooOo = new ArrayList<>(size);
        this.f64738OooOoO0 = new int[size];
        this.f64737OooOoO = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC21907Oooo.OooO00o oooO00o2 = oooO00o.f65008OooO0OO.get(i2);
            int i3 = i + 1;
            this.f64736OooOo0o[i] = oooO00o2.f65025OooO00o;
            ArrayList<String> arrayList = this.f64735OooOo;
            Fragment fragment = oooO00o2.f65026OooO0O0;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f64736OooOo0o;
            iArr[i3] = oooO00o2.f65027OooO0OO ? 1 : 0;
            iArr[i + 2] = oooO00o2.f65028OooO0Oo;
            iArr[i + 3] = oooO00o2.f65030OooO0o0;
            int i4 = i + 5;
            iArr[i + 4] = oooO00o2.f65029OooO0o;
            i += 6;
            iArr[i4] = oooO00o2.f65031OooO0oO;
            this.f64738OooOoO0[i2] = oooO00o2.f65032OooO0oo.ordinal();
            this.f64737OooOoO[i2] = oooO00o2.f65024OooO.ordinal();
        }
        this.f64739OooOoOO = oooO00o.f65013OooO0oo;
        this.f64741OooOoo0 = oooO00o.f65015OooOO0O;
        this.f64740OooOoo = oooO00o.f64906OooOo0O;
        this.f64742OooOooO = oooO00o.f65016OooOO0o;
        this.f64743OooOooo = oooO00o.f65018OooOOO0;
        this.f64745Oooo000 = oooO00o.f65017OooOOO;
        this.f64746Oooo00O = oooO00o.f65019OooOOOO;
        this.f64747Oooo00o = oooO00o.f65020OooOOOo;
        this.f64744Oooo0 = oooO00o.f65022OooOOo0;
        this.f64748Oooo0O0 = oooO00o.f65021OooOOo;
    }

    public final void OooO00o(androidx.fragment.app.OooO00o oooO00o) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f64736OooOo0o;
            boolean z = true;
            if (i >= iArr.length) {
                oooO00o.f65013OooO0oo = this.f64739OooOoOO;
                oooO00o.f65015OooOO0O = this.f64741OooOoo0;
                oooO00o.f65005OooO = true;
                oooO00o.f65016OooOO0o = this.f64742OooOooO;
                oooO00o.f65018OooOOO0 = this.f64743OooOooo;
                oooO00o.f65017OooOOO = this.f64745Oooo000;
                oooO00o.f65019OooOOOO = this.f64746Oooo00O;
                oooO00o.f65020OooOOOo = this.f64747Oooo00o;
                oooO00o.f65022OooOOo0 = this.f64744Oooo0;
                oooO00o.f65021OooOOo = this.f64748Oooo0O0;
                return;
            }
            AbstractC21907Oooo.OooO00o oooO00o2 = new AbstractC21907Oooo.OooO00o();
            int i3 = i + 1;
            oooO00o2.f65025OooO00o = iArr[i];
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Instantiate " + oooO00o + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            oooO00o2.f65032OooO0oo = AbstractC21979OooOOo0.OooO0O0.values()[this.f64738OooOoO0[i2]];
            oooO00o2.f65024OooO = AbstractC21979OooOOo0.OooO0O0.values()[this.f64737OooOoO[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            oooO00o2.f65027OooO0OO = z;
            int i5 = iArr[i4];
            oooO00o2.f65028OooO0Oo = i5;
            int i6 = iArr[i + 3];
            oooO00o2.f65030OooO0o0 = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            oooO00o2.f65029OooO0o = i8;
            i += 6;
            int i9 = iArr[i7];
            oooO00o2.f65031OooO0oO = i9;
            oooO00o.f65009OooO0Oo = i5;
            oooO00o.f65011OooO0o0 = i6;
            oooO00o.f65010OooO0o = i8;
            oooO00o.f65012OooO0oO = i9;
            oooO00o.OooO0OO(oooO00o2);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f64736OooOo0o);
        parcel.writeStringList(this.f64735OooOo);
        parcel.writeIntArray(this.f64738OooOoO0);
        parcel.writeIntArray(this.f64737OooOoO);
        parcel.writeInt(this.f64739OooOoOO);
        parcel.writeString(this.f64741OooOoo0);
        parcel.writeInt(this.f64740OooOoo);
        parcel.writeInt(this.f64742OooOooO);
        TextUtils.writeToParcel(this.f64743OooOooo, parcel, 0);
        parcel.writeInt(this.f64745Oooo000);
        TextUtils.writeToParcel(this.f64746Oooo00O, parcel, 0);
        parcel.writeStringList(this.f64747Oooo00o);
        parcel.writeStringList(this.f64744Oooo0);
        parcel.writeInt(this.f64748Oooo0O0 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f64736OooOo0o = parcel.createIntArray();
        this.f64735OooOo = parcel.createStringArrayList();
        this.f64738OooOoO0 = parcel.createIntArray();
        this.f64737OooOoO = parcel.createIntArray();
        this.f64739OooOoOO = parcel.readInt();
        this.f64741OooOoo0 = parcel.readString();
        this.f64740OooOoo = parcel.readInt();
        this.f64742OooOooO = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f64743OooOooo = (CharSequence) creator.createFromParcel(parcel);
        this.f64745Oooo000 = parcel.readInt();
        this.f64746Oooo00O = (CharSequence) creator.createFromParcel(parcel);
        this.f64747Oooo00o = parcel.createStringArrayList();
        this.f64744Oooo0 = parcel.createStringArrayList();
        this.f64748Oooo0O0 = parcel.readInt() != 0;
    }
}
