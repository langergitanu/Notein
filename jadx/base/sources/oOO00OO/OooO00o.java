package oOO00OO;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: oOO00OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC20355OooO00o extends Binder implements OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f123304OooO0o0 = 0;

        /* JADX INFO: renamed from: oOO00OO.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20356OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f123305OooO0o0;

            @Override // oOO00OO.OooO00o
            public final String OooO(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("org.opencv.engine.OpenCVEngineInterface");
                    parcelObtain.writeString(str);
                    this.f123305OooO0o0.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // oOO00OO.OooO00o
            public final String OooO0o0(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("org.opencv.engine.OpenCVEngineInterface");
                    parcelObtain.writeString(str);
                    this.f123305OooO0o0.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // oOO00OO.OooO00o
            public final int OooOO0o() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("org.opencv.engine.OpenCVEngineInterface");
                    this.f123305OooO0o0.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // oOO00OO.OooO00o
            public final boolean OooOOO(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("org.opencv.engine.OpenCVEngineInterface");
                    parcelObtain.writeString(str);
                    this.f123305OooO0o0.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f123305OooO0o0;
            }
        }
    }

    String OooO(String str) throws RemoteException;

    String OooO0o0(String str) throws RemoteException;

    int OooOO0o() throws RemoteException;

    boolean OooOOO(String str) throws RemoteException;
}
