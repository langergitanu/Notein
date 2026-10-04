package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.huawei.hms.core.aidl.d */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC17759d extends IInterface {
    /* JADX INFO: renamed from: a */
    void mo75897a(C17757b c17757b, InterfaceC17758c interfaceC17758c) throws RemoteException;

    /* JADX INFO: renamed from: com.huawei.hms.core.aidl.d$a */
    public static abstract class a extends Binder implements InterfaceC17759d {

        /* JADX INFO: renamed from: com.huawei.hms.core.aidl.d$a$a, reason: collision with other inner class name */
        public static class C19115a implements InterfaceC17759d {

            /* JADX INFO: renamed from: b */
            public static InterfaceC17759d f52541b;

            /* JADX INFO: renamed from: a */
            private IBinder f52542a;

            public C19115a(IBinder iBinder) {
                this.f52542a = iBinder;
            }

            @Override // com.huawei.hms.core.aidl.InterfaceC17759d
            /* JADX INFO: renamed from: a */
            public void mo75897a(C17757b c17757b, InterfaceC17758c interfaceC17758c) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (c17757b != null) {
                        parcelObtain.writeInt(1);
                        c17757b.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(interfaceC17758c != null ? interfaceC17758c.asBinder() : null);
                    if (this.f52542a.transact(2, parcelObtain, null, 1) || a.m75898a() == null) {
                        parcelObtain.recycle();
                    } else {
                        a.m75898a().mo75897a(c17757b, interfaceC17758c);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f52542a;
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC17759d m75899a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC17759d)) ? new C19115a(iBinder) : (InterfaceC17759d) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC17759d m75898a() {
            return C19115a.f52541b;
        }
    }
}
