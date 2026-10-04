package ooOOOOoo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o0ooooO0.InterfaceC31872OooO00o;
import ooOOOOoo.OooOO0;

/* JADX INFO: renamed from: ooOOOOoo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC35075OooOOoo extends IInterface {

    /* JADX INFO: renamed from: ooOOOOoo.OooOOoo$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC35075OooOOoo {
        public OooO00o() {
            attachInterface(this, "com.xiaomi.dist.handoff.IHandoffCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.dist.handoff.IHandoffCallback");
                C35077OooOo0O.OooO0o0("HH", "onHandoffDone", null);
                InterfaceC31872OooO00o interfaceC31872OooO00o = ((OooOO0.OooO00o) this).f125979OooO0o0.get();
                if (interfaceC31872OooO00o != null) {
                    interfaceC31872OooO00o.OooO0O0();
                }
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.dist.handoff.IHandoffCallback");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.dist.handoff.IHandoffCallback");
            int i3 = parcel.readInt();
            String string = parcel.readString();
            C35077OooOo0O.OooO0OO("HH", null, "onError, code=%s, msg=%s", Integer.valueOf(i3), string);
            InterfaceC31872OooO00o interfaceC31872OooO00o2 = ((OooOO0.OooO00o) this).f125979OooO0o0.get();
            if (interfaceC31872OooO00o2 != null) {
                interfaceC31872OooO00o2.OooO00o(i3, string);
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
