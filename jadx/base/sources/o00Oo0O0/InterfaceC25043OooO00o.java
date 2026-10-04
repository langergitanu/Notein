package o00Oo0O0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: o00Oo0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC25043OooO00o extends IInterface {

    /* JADX INFO: renamed from: o00Oo0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC19668OooO00o extends Binder implements InterfaceC25043OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f85018OooO0o0 = 0;

        /* JADX INFO: renamed from: o00Oo0O0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19669OooO00o implements InterfaceC25043OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f85019OooO0o0;

            @Override // o00Oo0O0.InterfaceC25043OooO00o
            /* JADX INFO: renamed from: a */
            public final String mo80619a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f85019OooO0o0.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f85019OooO0o0;
            }

            @Override // o00Oo0O0.InterfaceC25043OooO00o
            /* JADX INFO: renamed from: c */
            public final boolean mo80620c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f85019OooO0o0.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo80619a() throws RemoteException;

    /* JADX INFO: renamed from: c */
    boolean mo80620c() throws RemoteException;
}
