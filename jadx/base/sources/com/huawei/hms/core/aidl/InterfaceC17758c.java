package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.huawei.hms.core.aidl.c */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC17758c extends IInterface {

    /* JADX INFO: renamed from: com.huawei.hms.core.aidl.c$a */
    public static abstract class a extends Binder implements InterfaceC17758c {

        /* JADX INFO: renamed from: com.huawei.hms.core.aidl.c$a$a, reason: collision with other inner class name */
        public static class C19114a implements InterfaceC17758c {

            /* JADX INFO: renamed from: b */
            public static InterfaceC17758c f52539b;

            /* JADX INFO: renamed from: a */
            private IBinder f52540a;

            public C19114a(IBinder iBinder) {
                this.f52540a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f52540a;
            }
        }

        public a() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLCallback");
        }

        public static InterfaceC17758c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC17758c)) ? new C19114a(iBinder) : (InterfaceC17758c) iInterfaceQueryLocalInterface;
        }

        public static InterfaceC17758c getDefaultImpl() {
            return C19114a.f52539b;
        }

        public static boolean setDefaultImpl(InterfaceC17758c interfaceC17758c) {
            if (C19114a.f52539b != null || interfaceC17758c == null) {
                return false;
            }
            C19114a.f52539b = interfaceC17758c;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLCallback");
                call(parcel.readInt() != 0 ? C17757b.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.huawei.hms.core.aidl.IAIDLCallback");
            return true;
        }
    }

    void call(C17757b c17757b) throws RemoteException;
}
