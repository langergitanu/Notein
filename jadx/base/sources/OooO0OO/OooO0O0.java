package OooO0OO;

import OooOOo0.BinderC20465OooO0OO;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0O0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f58177OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0OO.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C18957OooO00o implements OooO0O0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f58178OooO0o0;

            @Override // OooO0OO.OooO0O0
            public final boolean OooO0O0(BinderC20465OooO0OO binderC20465OooO0OO) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(binderC20465OooO0OO);
                    if (!this.f58178OooO0o0.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f58177OooO0o0;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // OooO0OO.OooO0O0
            public final boolean OooOO0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(0L);
                    if (!this.f58178OooO0o0.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f58177OooO0o0;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f58178OooO0o0;
            }
        }
    }

    boolean OooO0O0(BinderC20465OooO0OO binderC20465OooO0OO) throws RemoteException;

    boolean OooOO0() throws RemoteException;
}
