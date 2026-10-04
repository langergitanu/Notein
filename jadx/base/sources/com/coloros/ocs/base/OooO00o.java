package com.coloros.ocs.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.ocs.base.common.CapabilityInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: com.coloros.ocs.base.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC19099OooO00o extends Binder implements OooO00o {
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: com.coloros.ocs.base.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19100OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public static OooO00o f67227OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f67228OooO0o0;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f67228OooO0o0;
            }
        }

        public AbstractBinderC19099OooO00o() {
            attachInterface(this, "com.coloros.ocs.base.IAuthenticationListener");
        }

        public static OooO00o asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coloros.ocs.base.IAuthenticationListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof OooO00o)) {
                return (OooO00o) iInterfaceQueryLocalInterface;
            }
            C19100OooO00o c19100OooO00o = new C19100OooO00o();
            c19100OooO00o.f67228OooO0o0 = iBinder;
            return c19100OooO00o;
        }

        public static OooO00o getDefaultImpl() {
            return C19100OooO00o.f67227OooO0o;
        }

        public static boolean setDefaultImpl(OooO00o oooO00o) {
            if (C19100OooO00o.f67227OooO0o != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (oooO00o == null) {
                return false;
            }
            C19100OooO00o.f67227OooO0o = oooO00o;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.coloros.ocs.base.IAuthenticationListener");
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface("com.coloros.ocs.base.IAuthenticationListener");
                onSuccess(parcel.readInt() != 0 ? CapabilityInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.coloros.ocs.base.IAuthenticationListener");
            onFail(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onFail(int i) throws RemoteException;

    void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException;
}
