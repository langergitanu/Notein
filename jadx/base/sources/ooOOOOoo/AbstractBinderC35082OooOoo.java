package ooOOOOoo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ooOOOOoo.C35078OooOo0o;

/* JADX INFO: renamed from: ooOOOOoo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractBinderC35082OooOoo extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("com.xiaomi.mirror.IRelayCallback");
            if (Oooo0.this.f126023OooO0O0 != null) {
                C35077OooOo0O.OooO0O0("RH", "onRelayEnable", null);
            }
        } else if (i == 2) {
            parcel.enforceInterface("com.xiaomi.mirror.IRelayCallback");
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            C35078OooOo0o.OooO00o oooO00o = Oooo0.this.f126023OooO0O0;
            if (oooO00o != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                oooO00o.OooO00o(bundle);
                return true;
            }
        } else {
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.mirror.IRelayCallback");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.mirror.IRelayCallback");
            if (Oooo0.this.f126023OooO0O0 != null) {
                C35077OooOo0O.OooO0O0("RH", "onRelayDisable", null);
                return true;
            }
        }
        return true;
    }
}
