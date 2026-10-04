package androidx.compose.runtime;

import Oooo0oO.C21110o0ooOO0;
import Oooo0oO.o000;
import Oooo0oO.o000O000;
import Oooo0oO.o000O0O0;
import Oooo0oO.o000OO;
import Oooo0oO.o0Oo0oo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, m80612d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "LOooo0oO/o000;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "runtime_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ParcelableSnapshotMutableState<T> extends o000<T> implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        public static ParcelableSnapshotMutableState OooO00o(Parcel parcel, ClassLoader classLoader) {
            o000O000 o000o0002;
            if (classLoader == null) {
                classLoader = OooO00o.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                o000o0002 = C21110o0ooOO0.f61264OooO00o;
            } else if (i == 1) {
                o000o0002 = o000O0O0.f61218OooO00o;
            } else {
                if (i != 2) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Unsupported MutableState policy ", " was restored"));
                }
                o000o0002 = o000OO.f61221OooO00o;
            }
            return new ParcelableSnapshotMutableState(value, o000o0002);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return OooO00o(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return OooO00o(parcel, null);
        }
    }

    public ParcelableSnapshotMutableState() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C21110o0ooOO0 c21110o0ooOO0 = C21110o0ooOO0.f61264OooO00o;
        o000O000<T> o000o0002 = this.f61049OooOo;
        if (OooOOO0.OooO0O0(o000o0002, c21110o0ooOO0)) {
            i2 = 0;
        } else if (OooOOO0.OooO0O0(o000o0002, o000O0O0.f61218OooO00o)) {
            i2 = 1;
        } else {
            if (!OooOOO0.OooO0O0(o000o0002, o000OO.f61221OooO00o)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
