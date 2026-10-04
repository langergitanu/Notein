package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC21979OooOOo0;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24578OooOOo;
import o000o0O0.C24583OooOo0o;
import o000o0O0.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Companion", "OooO0O0", "navigation-runtime_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class NavBackStackEntryState implements Parcelable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f65720OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f65721OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Bundle f65722OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Bundle f65723OooOoO0;
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState createFromParcel(Parcel inParcel) {
            OooOOO0.OooO0oO(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(OooOO0 entry) {
        OooOOO0.OooO0oO(entry, "entry");
        this.f65721OooOo0o = entry.f83195OooOoo0;
        this.f65720OooOo = entry.f83189OooOo.f83302OooOooO;
        this.f65723OooOoO0 = entry.f83192OooOoO0;
        Bundle bundle = new Bundle();
        this.f65722OooOoO = bundle;
        entry.f83197OooOooo.OooO0OO(bundle);
    }

    public final OooOO0 OooO00o(Context context, C24583OooOo0o c24583OooOo0o, AbstractC21979OooOOo0.OooO0O0 hostLifecycleState, C24578OooOOo c24578OooOOo) {
        OooOOO0.OooO0oO(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f65723OooOoO0;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String id = this.f65721OooOo0o;
        OooOOO0.OooO0oO(id, "id");
        return new OooOO0(context, c24583OooOo0o, bundle2, hostLifecycleState, c24578OooOOo, id, this.f65722OooOoO);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OooOOO0.OooO0oO(parcel, "parcel");
        parcel.writeString(this.f65721OooOo0o);
        parcel.writeInt(this.f65720OooOo);
        parcel.writeBundle(this.f65723OooOoO0);
        parcel.writeBundle(this.f65722OooOoO);
    }

    public NavBackStackEntryState(Parcel parcel) {
        String string = parcel.readString();
        OooOOO0.OooO0Oo(string);
        this.f65721OooOo0o = string;
        this.f65720OooOo = parcel.readInt();
        this.f65723OooOoO0 = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        OooOOO0.OooO0Oo(bundle);
        this.f65722OooOoO = bundle;
    }
}
