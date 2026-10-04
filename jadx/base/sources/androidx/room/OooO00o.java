package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.C22081OooO0o0;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f66176OooO0OO = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', FilenameUtils.EXTENSION_SEPARATOR);

    /* JADX INFO: renamed from: androidx.room.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC19035OooO00o extends Binder implements OooO00o {

        /* JADX INFO: renamed from: androidx.room.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19036OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f66177OooO0o0;

            @Override // androidx.room.OooO00o
            public final void OooO00o(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO00o.f66176OooO0OO);
                    parcelObtain.writeStringArray(strArr);
                    this.f66177OooO0o0.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f66177OooO0o0;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = OooO00o.f66176OooO0OO;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((C22081OooO0o0.OooO00o) this).OooO00o(parcel.createStringArray());
            return true;
        }
    }

    void OooO00o(String[] strArr) throws RemoteException;
}
