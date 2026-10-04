package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "activity_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ActivityResult implements Parcelable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Intent f62239OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f62240OooOo0o;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<ActivityResult> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final ActivityResult createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new ActivityResult(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResult$OooO0O0, reason: from kotlin metadata */
    public static final class Companion {
    }

    public ActivityResult(int i, Intent intent) {
        this.f62240OooOo0o = i;
        this.f62239OooOo = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        INSTANCE.getClass();
        int i = this.f62240OooOo0o;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f62239OooOo);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeInt(this.f62240OooOo0o);
        Intent intent = this.f62239OooOo;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
