package p615ho;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: renamed from: ho.e */
/* JADX INFO: loaded from: classes10.dex */
public final class C18932e implements Parcelable {
    public static final Parcelable.Creator<C18932e> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f80307OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80308OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f80309OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f80310OooOoO0;

    /* JADX INFO: renamed from: ho.e$OooO00o */
    public class OooO00o implements Parcelable.Creator<C18932e> {
        @Override // android.os.Parcelable.Creator
        public final C18932e createFromParcel(Parcel parcel) {
            C18932e c18932e = new C18932e();
            c18932e.f80308OooOo0o = parcel.readInt();
            c18932e.f80307OooOo = parcel.readInt();
            c18932e.f80309OooOoO = parcel.readString();
            c18932e.f80310OooOoO0 = parcel.readString();
            return c18932e;
        }

        @Override // android.os.Parcelable.Creator
        public final C18932e[] newArray(int i) {
            return new C18932e[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18932e.class == obj.getClass()) {
            C18932e c18932e = (C18932e) obj;
            if (this.f80308OooOo0o == c18932e.f80308OooOo0o && this.f80307OooOo == c18932e.f80307OooOo && this.f80310OooOoO0.equals(c18932e.f80310OooOoO0) && this.f80309OooOoO.equals(c18932e.f80309OooOoO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f80308OooOo0o), Integer.valueOf(this.f80307OooOo), this.f80310OooOoO0, this.f80309OooOoO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandoffSession{activityInstanceId='");
        sb.append(this.f80308OooOo0o);
        sb.append("', activityTaskId='");
        sb.append(this.f80307OooOo);
        sb.append("', packageName='");
        sb.append(this.f80309OooOoO);
        sb.append("', activityFullName='");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f80310OooOoO0, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f80308OooOo0o);
        parcel.writeInt(this.f80307OooOo);
        parcel.writeString(this.f80309OooOoO);
        parcel.writeString(this.f80310OooOoO0);
    }
}
