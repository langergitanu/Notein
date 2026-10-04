package com.oplus.ipemanager.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public interface ISDKAidlCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ipemanager.sdk.ISDKAidlCallback";

    /* JADX INFO: renamed from: com.oplus.ipemanager.sdk.ISDKAidlCallback$a */
    public static abstract class AbstractBinderC18813a extends Binder implements ISDKAidlCallback {
        static final int TRANSACTION_onConnectionChanged = 1;
        static final int TRANSACTION_onDemoModeEnableChange = 4;
        static final int TRANSACTION_onFunctionFeedbackStateChange = 3;
        static final int TRANSACTION_onVibrationSwitchStateChange = 2;

        /* JADX INFO: renamed from: com.oplus.ipemanager.sdk.ISDKAidlCallback$a$a */
        public static class a implements ISDKAidlCallback {

            /* JADX INFO: renamed from: a */
            public static ISDKAidlCallback f57433a;

            /* JADX INFO: renamed from: b */
            private IBinder f57434b;

            public a(IBinder iBinder) {
                this.f57434b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f57434b;
            }

            @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
            public final void onConnectionChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISDKAidlCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.f57434b.transact(1, parcelObtain, null, 1) || AbstractBinderC18813a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC18813a.getDefaultImpl().onConnectionChanged(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
            public final void onDemoModeEnableChange(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISDKAidlCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f57434b.transact(4, parcelObtain, null, 1) || AbstractBinderC18813a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC18813a.getDefaultImpl().onDemoModeEnableChange(z);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
            public final void onFunctionFeedbackStateChange(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISDKAidlCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f57434b.transact(3, parcelObtain, null, 1) || AbstractBinderC18813a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC18813a.getDefaultImpl().onFunctionFeedbackStateChange(z);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
            public final void onVibrationSwitchStateChange(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISDKAidlCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f57434b.transact(2, parcelObtain, null, 1) || AbstractBinderC18813a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC18813a.getDefaultImpl().onVibrationSwitchStateChange(z);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC18813a() {
            attachInterface(this, ISDKAidlCallback.DESCRIPTOR);
        }

        public static ISDKAidlCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISDKAidlCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISDKAidlCallback)) ? new a(iBinder) : (ISDKAidlCallback) iInterfaceQueryLocalInterface;
        }

        public static ISDKAidlCallback getDefaultImpl() {
            return a.f57433a;
        }

        public static boolean setDefaultImpl(ISDKAidlCallback iSDKAidlCallback) {
            if (a.f57433a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSDKAidlCallback == null) {
                return false;
            }
            a.f57433a = iSDKAidlCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(ISDKAidlCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(ISDKAidlCallback.DESCRIPTOR);
                onConnectionChanged(parcel.readInt());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(ISDKAidlCallback.DESCRIPTOR);
                onVibrationSwitchStateChange(parcel.readInt() != 0);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(ISDKAidlCallback.DESCRIPTOR);
                onFunctionFeedbackStateChange(parcel.readInt() != 0);
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(ISDKAidlCallback.DESCRIPTOR);
            onDemoModeEnableChange(parcel.readInt() != 0);
            return true;
        }
    }

    void onConnectionChanged(int i) throws RemoteException;

    void onDemoModeEnableChange(boolean z) throws RemoteException;

    void onFunctionFeedbackStateChange(boolean z) throws RemoteException;

    void onVibrationSwitchStateChange(boolean z) throws RemoteException;
}
