package androidx.compose.foundation.lazy.layout;

import OooO0Oo.C20398OooO0O0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "foundation_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class DefaultLazyKey implements Parcelable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f63312OooOo0o;
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<DefaultLazyKey> {
        @Override // android.os.Parcelable.Creator
        public final DefaultLazyKey createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    public DefaultLazyKey(int i) {
        this.f63312OooOo0o = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f63312OooOo0o == ((DefaultLazyKey) obj).f63312OooOo0o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63312OooOo0o);
    }

    public final String toString() {
        return C20398OooO0O0.OooO00o(')', new StringBuilder("DefaultLazyKey(index="), this.f63312OooOo0o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OooOOO0.OooO0oO(parcel, "parcel");
        parcel.writeInt(this.f63312OooOo0o);
    }
}
