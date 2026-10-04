package com.xiaomi.account;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.account.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC19585OooO00o extends Binder implements OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f80217OooO0o0 = 0;

        /* JADX INFO: renamed from: com.xiaomi.account.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19586OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f80218OooO0o0;

            @Override // com.xiaomi.account.OooO00o
            public final void OooOOoo(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.account.IXiaomiAuthResponse");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f80218OooO0o0.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = AbstractBinderC19585OooO00o.f80217OooO0o0;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f80218OooO0o0;
            }

            @Override // com.xiaomi.account.OooO00o
            public final void onCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.account.IXiaomiAuthResponse");
                    if (!this.f80218OooO0o0.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = AbstractBinderC19585OooO00o.f80217OooO0o0;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC19585OooO00o() {
            attachInterface(this, "com.xiaomi.account.IXiaomiAuthResponse");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.account.IXiaomiAuthResponse");
                OooOOoo(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.account.IXiaomiAuthResponse");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.account.IXiaomiAuthResponse");
            onCancel();
            parcel2.writeNoException();
            return true;
        }
    }

    void OooOOoo(Bundle bundle) throws RemoteException;

    void onCancel() throws RemoteException;
}
