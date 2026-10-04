package com.oplus.ocs.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.ocs.base.IAuthenticationListener;

/* JADX INFO: loaded from: classes9.dex */
public interface IServiceBroker extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.base.IServiceBroker";

    public static class Default implements IServiceBroker {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.base.IServiceBroker
        public IBinder getBinder(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.base.IServiceBroker
        public void handleAuthentication(String str, String str2, IAuthenticationListener iAuthenticationListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceBroker {
        static final int TRANSACTION_getBinder = 2;
        static final int TRANSACTION_handleAuthentication = 1;

        public static class Proxy implements IServiceBroker {
            public static IServiceBroker sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ocs.base.IServiceBroker
            public IBinder getBinder(String str, String str2) throws RemoteException {
                IBinder strongBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceBroker.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        strongBinder = parcelObtain2.readStrongBinder();
                    } else {
                        strongBinder = Stub.getDefaultImpl().getBinder(str, str2);
                    }
                    return strongBinder;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IServiceBroker.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.base.IServiceBroker
            public void handleAuthentication(String str, String str2, IAuthenticationListener iAuthenticationListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceBroker.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iAuthenticationListener != null ? iAuthenticationListener.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().handleAuthentication(str, str2, iAuthenticationListener);
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
            attachInterface(this, IServiceBroker.DESCRIPTOR);
        }

        public static IServiceBroker asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IServiceBroker.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceBroker)) ? new Proxy(iBinder) : (IServiceBroker) iInterfaceQueryLocalInterface;
        }

        public static IServiceBroker getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IServiceBroker iServiceBroker) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceBroker == null) {
                return false;
            }
            Proxy.sDefaultImpl = iServiceBroker;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IServiceBroker.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IServiceBroker.DESCRIPTOR);
                handleAuthentication(parcel.readString(), parcel.readString(), IAuthenticationListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IServiceBroker.DESCRIPTOR);
            IBinder binder = getBinder(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(binder);
            return true;
        }
    }

    IBinder getBinder(String str, String str2) throws RemoteException;

    void handleAuthentication(String str, String str2, IAuthenticationListener iAuthenticationListener) throws RemoteException;
}
