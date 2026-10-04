package com.oplus.ocs.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.ocs.base.common.CapabilityInfo;

/* JADX INFO: loaded from: classes9.dex */
public interface IAuthenticationListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.base.IAuthenticationListener";

    public static class Default implements IAuthenticationListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.base.IAuthenticationListener
        public void onFail(int i) throws RemoteException {
        }

        @Override // com.oplus.ocs.base.IAuthenticationListener
        public void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAuthenticationListener {
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IAuthenticationListener {
            public static IAuthenticationListener sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAuthenticationListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.base.IAuthenticationListener
            public void onFail(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAuthenticationListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFail(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.base.IAuthenticationListener
            public void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAuthenticationListener.DESCRIPTOR);
                    if (capabilityInfo != null) {
                        parcelObtain.writeInt(1);
                        capabilityInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSuccess(capabilityInfo);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IAuthenticationListener.DESCRIPTOR);
        }

        public static IAuthenticationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAuthenticationListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAuthenticationListener)) ? new Proxy(iBinder) : (IAuthenticationListener) iInterfaceQueryLocalInterface;
        }

        public static IAuthenticationListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAuthenticationListener iAuthenticationListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAuthenticationListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAuthenticationListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IAuthenticationListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IAuthenticationListener.DESCRIPTOR);
                onSuccess(parcel.readInt() != 0 ? CapabilityInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IAuthenticationListener.DESCRIPTOR);
            onFail(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onFail(int i) throws RemoteException;

    void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException;
}
