package com.coloros.ocs.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface OooO0O0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f67229OooO0o0 = 0;

        /* JADX INFO: renamed from: com.coloros.ocs.base.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19101OooO00o implements OooO0O0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f67230OooO0o0;

            @Override // com.coloros.ocs.base.OooO0O0
            public final void OooO0OO(String str, com.coloros.ocs.base.OooO00o oooO00o) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coloros.ocs.base.IServiceBroker");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString("1.0.11");
                    parcelObtain.writeStrongBinder(oooO00o.asBinder());
                    if (!this.f67230OooO0o0.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f67229OooO0o0;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f67230OooO0o0;
            }
        }
    }

    void OooO0OO(String str, com.coloros.ocs.base.OooO00o oooO00o) throws RemoteException;
}
