package com.miui.penengine.p598g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.miui.penengine.g.b */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18787b extends IInterface {

    /* JADX INFO: renamed from: com.miui.penengine.g.b$a */
    public static class a implements InterfaceC18787b {
        @Override // com.miui.penengine.p598g.InterfaceC18787b
        /* JADX INFO: renamed from: a */
        public void mo80268a(int i, int i2, int i3) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.miui.penengine.g.b$b */
    public static abstract class b extends Binder implements InterfaceC18787b {

        /* JADX INFO: renamed from: a */
        public static final String f57375a = "com.xiaomi.touchservice.pencilengine.IPencilEngineCallback";

        /* JADX INFO: renamed from: b */
        public static final int f57376b = 1;

        /* JADX INFO: renamed from: com.miui.penengine.g.b$b$a */
        public static class a implements InterfaceC18787b {

            /* JADX INFO: renamed from: b */
            public static InterfaceC18787b f57377b;

            /* JADX INFO: renamed from: a */
            public IBinder f57378a;

            public a(IBinder iBinder) {
                this.f57378a = iBinder;
            }

            @Override // com.miui.penengine.p598g.InterfaceC18787b
            /* JADX INFO: renamed from: a */
            public void mo80268a(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f57375a);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.f57378a.transact(1, parcelObtain, parcelObtain2, 0) || b.m80454b() == null) {
                        parcelObtain2.readException();
                    } else {
                        f57377b.mo80268a(i, i2, i3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f57378a;
            }

            /* JADX INFO: renamed from: b */
            public String m80456b() {
                return b.f57375a;
            }
        }

        public b() {
            attachInterface(this, f57375a);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC18787b m80453a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f57375a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC18787b)) ? new a(iBinder) : (InterfaceC18787b) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC18787b m80454b() {
            return a.f57377b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(f57375a);
                return true;
            }
            parcel.enforceInterface(f57375a);
            mo80268a(parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m80455b(InterfaceC18787b interfaceC18787b) {
            if (a.f57377b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC18787b == null) {
                return false;
            }
            a.f57377b = interfaceC18787b;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo80268a(int i, int i2, int i3) throws RemoteException;
}
