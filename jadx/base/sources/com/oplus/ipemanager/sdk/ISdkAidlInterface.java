package com.oplus.ipemanager.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.ipemanager.sdk.ISDKAidlCallback;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ISdkAidlInterface extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ipemanager.sdk.ISdkAidlInterface";

    int getPencilConnectState() throws RemoteException;

    int getSuportSdkVersion() throws RemoteException;

    List<IpeFeature> getSupportFeatures() throws RemoteException;

    boolean getVibrationSwitchState() throws RemoteException;

    boolean isDemoModeEnable() throws RemoteException;

    boolean isFunctionVibrationEnable() throws RemoteException;

    void setISdkAidlCallback(ISDKAidlCallback iSDKAidlCallback) throws RemoteException;

    void setVibrationType(int i) throws RemoteException;

    void startFeedBackVibration() throws RemoteException;

    void startVibration(int i) throws RemoteException;

    void stopFeedBackVibration() throws RemoteException;

    void unsetISdkAidlCallback(ISDKAidlCallback iSDKAidlCallback) throws RemoteException;

    /* JADX INFO: renamed from: com.oplus.ipemanager.sdk.ISdkAidlInterface$a */
    public static abstract class AbstractBinderC18814a extends Binder implements ISdkAidlInterface {

        /* JADX INFO: renamed from: com.oplus.ipemanager.sdk.ISdkAidlInterface$a$a */
        public static class a implements ISdkAidlInterface {

            /* JADX INFO: renamed from: a */
            public static ISdkAidlInterface f57435a;

            /* JADX INFO: renamed from: b */
            private IBinder f57436b;

            public a(IBinder iBinder) {
                this.f57436b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f57436b;
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final int getPencilConnectState() throws RemoteException {
                int pencilConnectState;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (this.f57436b.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC18814a.m80468a() == null) {
                        parcelObtain2.readException();
                        pencilConnectState = parcelObtain2.readInt();
                    } else {
                        pencilConnectState = AbstractBinderC18814a.m80468a().getPencilConnectState();
                    }
                    return pencilConnectState;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final int getSuportSdkVersion() throws RemoteException {
                int suportSdkVersion;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (this.f57436b.transact(6, parcelObtain, parcelObtain2, 0) || AbstractBinderC18814a.m80468a() == null) {
                        parcelObtain2.readException();
                        suportSdkVersion = parcelObtain2.readInt();
                    } else {
                        suportSdkVersion = AbstractBinderC18814a.m80468a().getSuportSdkVersion();
                    }
                    return suportSdkVersion;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final List<IpeFeature> getSupportFeatures() throws RemoteException {
                List<IpeFeature> listCreateTypedArrayList;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (this.f57436b.transact(7, parcelObtain, parcelObtain2, 0) || AbstractBinderC18814a.m80468a() == null) {
                        parcelObtain2.readException();
                        listCreateTypedArrayList = parcelObtain2.createTypedArrayList(IpeFeature.INSTANCE);
                    } else {
                        listCreateTypedArrayList = AbstractBinderC18814a.m80468a().getSupportFeatures();
                    }
                    return listCreateTypedArrayList;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final boolean getVibrationSwitchState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (!this.f57436b.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC18814a.m80468a() != null) {
                        return AbstractBinderC18814a.m80468a().getVibrationSwitchState();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final boolean isDemoModeEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (!this.f57436b.transact(8, parcelObtain, parcelObtain2, 0) && AbstractBinderC18814a.m80468a() != null) {
                        return AbstractBinderC18814a.m80468a().isDemoModeEnable();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final boolean isFunctionVibrationEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (!this.f57436b.transact(9, parcelObtain, parcelObtain2, 0) && AbstractBinderC18814a.m80468a() != null) {
                        return AbstractBinderC18814a.m80468a().isFunctionVibrationEnable();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final void setISdkAidlCallback(ISDKAidlCallback iSDKAidlCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iSDKAidlCallback != null ? iSDKAidlCallback.asBinder() : null);
                    if (this.f57436b.transact(1, parcelObtain, null, 1) || AbstractBinderC18814a.m80468a() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC18814a.m80468a().setISdkAidlCallback(iSDKAidlCallback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final void setVibrationType(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.f57436b.transact(4, parcelObtain, null, 1) || AbstractBinderC18814a.m80468a() == null) {
                        return;
                    }
                    AbstractBinderC18814a.m80468a().setVibrationType(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final void startFeedBackVibration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (this.f57436b.transact(11, parcelObtain, null, 1) || AbstractBinderC18814a.m80468a() == null) {
                        return;
                    }
                    AbstractBinderC18814a.m80468a().startFeedBackVibration();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final void startVibration(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.f57436b.transact(5, parcelObtain, null, 1) || AbstractBinderC18814a.m80468a() == null) {
                        return;
                    }
                    AbstractBinderC18814a.m80468a().startVibration(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final void stopFeedBackVibration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    if (this.f57436b.transact(12, parcelObtain, null, 1) || AbstractBinderC18814a.m80468a() == null) {
                        return;
                    }
                    AbstractBinderC18814a.m80468a().stopFeedBackVibration();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ipemanager.sdk.ISdkAidlInterface
            public final void unsetISdkAidlCallback(ISDKAidlCallback iSDKAidlCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISdkAidlInterface.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iSDKAidlCallback != null ? iSDKAidlCallback.asBinder() : null);
                    if (this.f57436b.transact(10, parcelObtain, null, 1) || AbstractBinderC18814a.m80468a() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC18814a.m80468a().unsetISdkAidlCallback(iSDKAidlCallback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static ISdkAidlInterface m80469a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISdkAidlInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISdkAidlInterface)) ? new a(iBinder) : (ISdkAidlInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(ISdkAidlInterface.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    setISdkAidlCallback(ISDKAidlCallback.AbstractBinderC18813a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    boolean vibrationSwitchState = getVibrationSwitchState();
                    parcel2.writeNoException();
                    parcel2.writeInt(vibrationSwitchState ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    int pencilConnectState = getPencilConnectState();
                    parcel2.writeNoException();
                    parcel2.writeInt(pencilConnectState);
                    return true;
                case 4:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    setVibrationType(parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    startVibration(parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    int suportSdkVersion = getSuportSdkVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(suportSdkVersion);
                    return true;
                case 7:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    List<IpeFeature> supportFeatures = getSupportFeatures();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(supportFeatures);
                    return true;
                case 8:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    boolean zIsDemoModeEnable = isDemoModeEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDemoModeEnable ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    boolean zIsFunctionVibrationEnable = isFunctionVibrationEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsFunctionVibrationEnable ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    unsetISdkAidlCallback(ISDKAidlCallback.AbstractBinderC18813a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 11:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    startFeedBackVibration();
                    return true;
                case 12:
                    parcel.enforceInterface(ISdkAidlInterface.DESCRIPTOR);
                    stopFeedBackVibration();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: a */
        public static ISdkAidlInterface m80468a() {
            return a.f57435a;
        }
    }
}
