package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f64874OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f64875OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f64876OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f64877OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f64878OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String f64879OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f64880OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final boolean f64881OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final boolean f64882OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final String f64883Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final boolean f64884Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final boolean f64885Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final int f64886Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f64887Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final boolean f64888Oooo0OO;

    public class OooO00o implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f64875OooOo0o = fragment.getClass().getName();
        this.f64874OooOo = fragment.mWho;
        this.f64877OooOoO0 = fragment.mFromLayout;
        this.f64876OooOoO = fragment.mInDynamicContainer;
        this.f64878OooOoOO = fragment.mFragmentId;
        this.f64880OooOoo0 = fragment.mContainerId;
        this.f64879OooOoo = fragment.mTag;
        this.f64881OooOooO = fragment.mRetainInstance;
        this.f64882OooOooo = fragment.mRemoving;
        this.f64884Oooo000 = fragment.mDetached;
        this.f64885Oooo00O = fragment.mHidden;
        this.f64886Oooo00o = fragment.mMaxState.ordinal();
        this.f64883Oooo0 = fragment.mTargetWho;
        this.f64887Oooo0O0 = fragment.mTargetRequestCode;
        this.f64888Oooo0OO = fragment.mUserVisibleHint;
    }

    public final Fragment OooO00o(C21901OooOoO0 c21901OooOoO0, ClassLoader classLoader) {
        Fragment fragmentOooO00o = c21901OooOoO0.OooO00o(classLoader, this.f64875OooOo0o);
        fragmentOooO00o.mWho = this.f64874OooOo;
        fragmentOooO00o.mFromLayout = this.f64877OooOoO0;
        fragmentOooO00o.mInDynamicContainer = this.f64876OooOoO;
        fragmentOooO00o.mRestored = true;
        fragmentOooO00o.mFragmentId = this.f64878OooOoOO;
        fragmentOooO00o.mContainerId = this.f64880OooOoo0;
        fragmentOooO00o.mTag = this.f64879OooOoo;
        fragmentOooO00o.mRetainInstance = this.f64881OooOooO;
        fragmentOooO00o.mRemoving = this.f64882OooOooo;
        fragmentOooO00o.mDetached = this.f64884Oooo000;
        fragmentOooO00o.mHidden = this.f64885Oooo00O;
        fragmentOooO00o.mMaxState = AbstractC21979OooOOo0.OooO0O0.values()[this.f64886Oooo00o];
        fragmentOooO00o.mTargetWho = this.f64883Oooo0;
        fragmentOooO00o.mTargetRequestCode = this.f64887Oooo0O0;
        fragmentOooO00o.mUserVisibleHint = this.f64888Oooo0OO;
        return fragmentOooO00o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f64875OooOo0o);
        sb.append(" (");
        sb.append(this.f64874OooOo);
        sb.append(")}:");
        if (this.f64877OooOoO0) {
            sb.append(" fromLayout");
        }
        if (this.f64876OooOoO) {
            sb.append(" dynamicContainer");
        }
        int i = this.f64880OooOoo0;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f64879OooOoo;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f64881OooOooO) {
            sb.append(" retainInstance");
        }
        if (this.f64882OooOooo) {
            sb.append(" removing");
        }
        if (this.f64884Oooo000) {
            sb.append(" detached");
        }
        if (this.f64885Oooo00O) {
            sb.append(" hidden");
        }
        String str2 = this.f64883Oooo0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f64887Oooo0O0);
        }
        if (this.f64888Oooo0OO) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f64875OooOo0o);
        parcel.writeString(this.f64874OooOo);
        parcel.writeInt(this.f64877OooOoO0 ? 1 : 0);
        parcel.writeInt(this.f64876OooOoO ? 1 : 0);
        parcel.writeInt(this.f64878OooOoOO);
        parcel.writeInt(this.f64880OooOoo0);
        parcel.writeString(this.f64879OooOoo);
        parcel.writeInt(this.f64881OooOooO ? 1 : 0);
        parcel.writeInt(this.f64882OooOooo ? 1 : 0);
        parcel.writeInt(this.f64884Oooo000 ? 1 : 0);
        parcel.writeInt(this.f64885Oooo00O ? 1 : 0);
        parcel.writeInt(this.f64886Oooo00o);
        parcel.writeString(this.f64883Oooo0);
        parcel.writeInt(this.f64887Oooo0O0);
        parcel.writeInt(this.f64888Oooo0OO ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f64875OooOo0o = parcel.readString();
        this.f64874OooOo = parcel.readString();
        this.f64877OooOoO0 = parcel.readInt() != 0;
        this.f64876OooOoO = parcel.readInt() != 0;
        this.f64878OooOoOO = parcel.readInt();
        this.f64880OooOoo0 = parcel.readInt();
        this.f64879OooOoo = parcel.readString();
        this.f64881OooOooO = parcel.readInt() != 0;
        this.f64882OooOooo = parcel.readInt() != 0;
        this.f64884Oooo000 = parcel.readInt() != 0;
        this.f64885Oooo00O = parcel.readInt() != 0;
        this.f64886Oooo00o = parcel.readInt();
        this.f64883Oooo0 = parcel.readString();
        this.f64887Oooo0O0 = parcel.readInt();
        this.f64888Oooo0OO = parcel.readInt() != 0;
    }
}
