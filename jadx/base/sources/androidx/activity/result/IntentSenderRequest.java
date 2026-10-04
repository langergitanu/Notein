package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "activity_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Intent f62241OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final IntentSender f62242OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f62243OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f62244OooOoO0;
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel inParcel) {
            OooOOO0.OooO0oO(inParcel, "inParcel");
            Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
            OooOOO0.OooO0Oo(parcelable);
            return new IntentSenderRequest((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        OooOOO0.OooO0oO(intentSender, "intentSender");
        this.f62242OooOo0o = intentSender;
        this.f62241OooOo = intent;
        this.f62244OooOoO0 = i;
        this.f62243OooOoO = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeParcelable(this.f62242OooOo0o, i);
        dest.writeParcelable(this.f62241OooOo, i);
        dest.writeInt(this.f62244OooOoO0);
        dest.writeInt(this.f62243OooOoO);
    }
}
