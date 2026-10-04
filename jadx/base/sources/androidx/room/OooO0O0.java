package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.OooO00o;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0O0 extends IInterface {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f66178OooO0Oo = "androidx$room$IMultiInstanceInvalidationService".replace('$', FilenameUtils.EXTENSION_SEPARATOR);

    public static abstract class OooO00o extends Binder implements OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f66179OooO0o0 = 0;

        /* JADX INFO: renamed from: androidx.room.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19037OooO00o implements OooO0O0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f66180OooO0o0;

            @Override // androidx.room.OooO0O0
            public final void OooOOOo(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO0O0.f66178OooO0Oo);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f66180OooO0o0.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.OooO0O0
            public final int OooOOo0(androidx.room.OooO00o oooO00o, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO0O0.f66178OooO0Oo);
                    parcelObtain.writeStrongInterface(oooO00o);
                    parcelObtain.writeString(str);
                    this.f66180OooO0o0.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.OooO0O0
            public final void OooOo00(androidx.room.OooO00o oooO00o, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO0O0.f66178OooO0Oo);
                    parcelObtain.writeStrongInterface(oooO00o);
                    parcelObtain.writeInt(i);
                    this.f66180OooO0o0.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f66180OooO0o0;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = OooO0O0.f66178OooO0Oo;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            androidx.room.OooO00o oooO00o = null;
            androidx.room.OooO00o oooO00o2 = null;
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(androidx.room.OooO00o.f66176OooO0OO);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.OooO00o)) {
                        OooO00o.AbstractBinderC19035OooO00o.C19036OooO00o c19036OooO00o = new OooO00o.AbstractBinderC19035OooO00o.C19036OooO00o();
                        c19036OooO00o.f66177OooO0o0 = strongBinder;
                        oooO00o = c19036OooO00o;
                    } else {
                        oooO00o = (androidx.room.OooO00o) iInterfaceQueryLocalInterface;
                    }
                }
                int iOooOOo0 = ((MultiInstanceInvalidationService.OooO00o) this).OooOOo0(oooO00o, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iOooOOo0);
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                ((MultiInstanceInvalidationService.OooO00o) this).OooOOOo(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(androidx.room.OooO00o.f66176OooO0OO);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof androidx.room.OooO00o)) {
                    OooO00o.AbstractBinderC19035OooO00o.C19036OooO00o c19036OooO00o2 = new OooO00o.AbstractBinderC19035OooO00o.C19036OooO00o();
                    c19036OooO00o2.f66177OooO0o0 = strongBinder2;
                    oooO00o2 = c19036OooO00o2;
                } else {
                    oooO00o2 = (androidx.room.OooO00o) iInterfaceQueryLocalInterface2;
                }
            }
            ((MultiInstanceInvalidationService.OooO00o) this).OooOo00(oooO00o2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void OooOOOo(int i, String[] strArr) throws RemoteException;

    int OooOOo0(androidx.room.OooO00o oooO00o, String str) throws RemoteException;

    void OooOo00(androidx.room.OooO00o oooO00o, int i) throws RemoteException;
}
