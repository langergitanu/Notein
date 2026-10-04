package com.miui.penengine.p598g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.miui.penengine.p598g.InterfaceC18787b;

/* JADX INFO: renamed from: com.miui.penengine.g.a */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18786a extends IInterface {

    /* JADX INFO: renamed from: com.miui.penengine.g.a$a */
    public static class a implements InterfaceC18786a {
        @Override // com.miui.penengine.p598g.InterfaceC18786a
        /* JADX INFO: renamed from: a */
        public int mo80445a(int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.penengine.p598g.InterfaceC18786a
        /* JADX INFO: renamed from: a */
        public void mo80446a() throws RemoteException {
        }

        @Override // com.miui.penengine.p598g.InterfaceC18786a
        /* JADX INFO: renamed from: a */
        public void mo80447a(InterfaceC18787b interfaceC18787b) throws RemoteException {
        }

        @Override // com.miui.penengine.p598g.InterfaceC18786a
        /* JADX INFO: renamed from: a */
        public void mo80448a(InterfaceC18787b interfaceC18787b, String str) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: com.miui.penengine.g.a$b */
    public static abstract class b extends Binder implements InterfaceC18786a {

        /* JADX INFO: renamed from: a */
        public static final String f57368a = "com.xiaomi.touchservice.pencilengine.IPencilEngine";

        /* JADX INFO: renamed from: b */
        public static final int f57369b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f57370c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f57371d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f57372e = 4;

        public b() {
            attachInterface(this, f57368a);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC18786a m80449a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f57368a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC18786a)) ? new a(iBinder) : (InterfaceC18786a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC18786a m80451b() {
            return a.f57373b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(f57368a);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(f57368a);
                mo80447a(InterfaceC18787b.b.m80453a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(f57368a);
                mo80446a();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(f57368a);
                int iMo80445a = mo80445a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iMo80445a);
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(f57368a);
            mo80448a(InterfaceC18787b.b.m80453a(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m80450a(InterfaceC18786a interfaceC18786a) {
            if (a.f57373b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC18786a == null) {
                return false;
            }
            a.f57373b = interfaceC18786a;
            return true;
        }

        /* JADX INFO: renamed from: com.miui.penengine.g.a$b$a */
        public static class a implements InterfaceC18786a {

            /* JADX INFO: renamed from: b */
            public static InterfaceC18786a f57373b;

            /* JADX INFO: renamed from: a */
            public IBinder f57374a;

            public a(IBinder iBinder) {
                this.f57374a = iBinder;
            }

            @Override // com.miui.penengine.p598g.InterfaceC18786a
            /* JADX INFO: renamed from: a */
            public void mo80447a(InterfaceC18787b interfaceC18787b) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f57368a);
                    parcelObtain.writeStrongBinder(interfaceC18787b != null ? interfaceC18787b.asBinder() : null);
                    if (this.f57374a.transact(1, parcelObtain, parcelObtain2, 0) || b.m80451b() == null) {
                        parcelObtain2.readException();
                    } else {
                        f57373b.mo80447a(interfaceC18787b);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f57374a;
            }

            /* JADX INFO: renamed from: b */
            public String m80452b() {
                return b.f57368a;
            }

            @Override // com.miui.penengine.p598g.InterfaceC18786a
            /* JADX INFO: renamed from: a */
            public void mo80448a(InterfaceC18787b interfaceC18787b, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f57368a);
                    parcelObtain.writeStrongBinder(interfaceC18787b != null ? interfaceC18787b.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (this.f57374a.transact(4, parcelObtain, parcelObtain2, 0) || b.m80451b() == null) {
                        parcelObtain2.readException();
                    } else {
                        f57373b.mo80448a(interfaceC18787b, str);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.miui.penengine.p598g.InterfaceC18786a
            /* JADX INFO: renamed from: a */
            public int mo80445a(int i, int i2) throws RemoteException {
                int iMo80445a;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f57368a);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.f57374a.transact(3, parcelObtain, parcelObtain2, 0) || b.m80451b() == null) {
                        parcelObtain2.readException();
                        iMo80445a = parcelObtain2.readInt();
                    } else {
                        iMo80445a = f57373b.mo80445a(i, i2);
                    }
                    return iMo80445a;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.penengine.p598g.InterfaceC18786a
            /* JADX INFO: renamed from: a */
            public void mo80446a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f57368a);
                    if (this.f57374a.transact(2, parcelObtain, parcelObtain2, 0) || b.m80451b() == null) {
                        parcelObtain2.readException();
                    } else {
                        f57373b.mo80446a();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    int mo80445a(int i, int i2) throws RemoteException;

    /* JADX INFO: renamed from: a */
    void mo80446a() throws RemoteException;

    /* JADX INFO: renamed from: a */
    void mo80447a(InterfaceC18787b interfaceC18787b) throws RemoteException;

    /* JADX INFO: renamed from: a */
    void mo80448a(InterfaceC18787b interfaceC18787b, String str) throws RemoteException;
}
