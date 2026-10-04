package com.xiaomi.account;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o0oooOOo.C31844OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO0O0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f80219OooO0o0 = 0;

        /* JADX INFO: renamed from: com.xiaomi.account.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19587OooO00o implements OooO0O0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f80220OooO0o0;

            @Override // com.xiaomi.account.OooO0O0
            public final int OooO0o() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.account.IXiaomiAuthService");
                    if (!this.f80220OooO0o0.transact(7, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f80219OooO0o0;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.account.OooO0O0
            public final boolean OooO0oO(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.account.IXiaomiAuthService");
                    parcelObtain.writeString(str);
                    if (!this.f80220OooO0o0.transact(8, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f80219OooO0o0;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.account.OooO0O0
            public final boolean OooOO0O() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.account.IXiaomiAuthService");
                    if (!this.f80220OooO0o0.transact(5, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f80219OooO0o0;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.account.OooO0O0
            public final void OooOOo(C31844OooO0OO.OooO00o.OooO0O0 oooO0O0, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.account.IXiaomiAuthService");
                    if (oooO0O0 == null) {
                        oooO0O0 = null;
                    }
                    parcelObtain.writeStrongBinder(oooO0O0);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    parcelObtain.writeInt(1);
                    if (!this.f80220OooO0o0.transact(6, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f80219OooO0o0;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f80220OooO0o0;
            }
        }
    }

    int OooO0o() throws RemoteException;

    boolean OooO0oO(String str) throws RemoteException;

    boolean OooOO0O() throws RemoteException;

    void OooOOo(C31844OooO0OO.OooO00o.OooO0O0 oooO0O0, Bundle bundle) throws RemoteException;
}
