package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface IObjectWrapper extends IInterface {

    public static class Default implements IObjectWrapper {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IObjectWrapper {

        /* JADX INFO: renamed from: a */
        public static final String f53547a = "com.huawei.hms.feature.dynamic.IObjectWrapper";

        public static class Proxy implements IObjectWrapper {
            public static IObjectWrapper sDefaultImpl;

            /* JADX INFO: renamed from: a */
            public IBinder f53548a;

            public Proxy(IBinder iBinder) {
                this.f53548a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f53548a;
            }

            public String getInterfaceDescriptor() {
                return Stub.f53547a;
            }
        }

        public Stub() {
            attachInterface(this, f53547a);
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f53547a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IObjectWrapper)) ? new Proxy(iBinder) : (IObjectWrapper) iInterfaceQueryLocalInterface;
        }

        public static IObjectWrapper getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IObjectWrapper iObjectWrapper) {
            if (Proxy.sDefaultImpl != null || iObjectWrapper == null) {
                return false;
            }
            Proxy.sDefaultImpl = iObjectWrapper;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(f53547a);
            return true;
        }
    }
}
