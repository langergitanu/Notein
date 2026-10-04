package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public android.support.v4.os.OooO00o f62237OooOo0o;

    public class OooO00o implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            android.support.v4.os.OooO00o oooO00o;
            ResultReceiver resultReceiver = new ResultReceiver();
            IBinder strongBinder = parcel.readStrongBinder();
            int i = OooO00o.AbstractBinderC18991OooO00o.f62235OooO0o0;
            if (strongBinder == null) {
                oooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.OooO00o.f62234OooO0O0);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.OooO00o)) {
                    OooO00o.AbstractBinderC18991OooO00o.C18992OooO00o c18992OooO00o = new OooO00o.AbstractBinderC18991OooO00o.C18992OooO00o();
                    c18992OooO00o.f62236OooO0o0 = strongBinder;
                    oooO00o = c18992OooO00o;
                } else {
                    oooO00o = (android.support.v4.os.OooO00o) iInterfaceQueryLocalInterface;
                }
            }
            resultReceiver.f62237OooOo0o = oooO00o;
            return resultReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class OooO0O0 extends OooO00o.AbstractBinderC18991OooO00o {
        public OooO0O0() {
            attachInterface(this, android.support.v4.os.OooO00o.f62234OooO0O0);
        }
    }

    public void OooO00o(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f62237OooOo0o == null) {
                    this.f62237OooOo0o = new OooO0O0();
                }
                parcel.writeStrongBinder(this.f62237OooOo0o.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
