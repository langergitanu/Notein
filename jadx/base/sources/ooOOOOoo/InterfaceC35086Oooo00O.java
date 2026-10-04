package ooOOOOoo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ooOOOOoo.C35078OooOo0o;

/* JADX INFO: renamed from: ooOOOOoo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC35086Oooo00O extends IInterface {

    /* JADX INFO: renamed from: ooOOOOoo.Oooo00O$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC35086Oooo00O {
        public OooO00o() {
            attachInterface(this, "com.xiaomi.mirror.ISynergyCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C35078OooOo0o.OooO00o oooO00o;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.mirror.ISynergyCallback");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.mirror.ISynergyCallback");
            int i3 = parcel.readInt();
            C35084OooOooO c35084OooOooO = C35084OooOooO.this;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2 && (oooO00o = c35084OooOooO.f126017OooO0O0) != null) {
                        oooO00o.OooO00o(new Bundle());
                        return true;
                    }
                } else if (c35084OooOooO.f126017OooO0O0 != null) {
                    C35077OooOo0O.OooO0O0("RH", "onRelayEnable", null);
                    return true;
                }
            } else if (c35084OooOooO.f126017OooO0O0 != null) {
                C35077OooOo0O.OooO0O0("RH", "onRelayDisable", null);
            }
            return true;
        }
    }
}
