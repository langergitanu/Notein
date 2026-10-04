package oOooo0o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: oOooo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC34620OooO00o extends IInterface {

    /* JADX INFO: renamed from: oOooo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC20365OooO00o extends Binder implements InterfaceC34620OooO00o {

        /* JADX INFO: renamed from: oOooo0o.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20366OooO00o implements InterfaceC34620OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f124017OooO0o0;

            @Override // oOooo0o.InterfaceC34620OooO00o
            /* JADX INFO: renamed from: a */
            public final String mo80635a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f124017OooO0o0.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f124017OooO0o0;
            }
        }

        public static InterfaceC34620OooO00o OooOo0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC34620OooO00o)) {
                return (InterfaceC34620OooO00o) iInterfaceQueryLocalInterface;
            }
            C20366OooO00o c20366OooO00o = new C20366OooO00o();
            c20366OooO00o.f124017OooO0o0 = iBinder;
            return c20366OooO00o;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo80635a() throws RemoteException;
}
