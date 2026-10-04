package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f62194OooO00o = "android$support$v4$app$INotificationSideChannel".replace('$', FilenameUtils.EXTENSION_SEPARATOR);

    /* JADX INFO: renamed from: android.support.v4.app.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC18989OooO00o extends Binder implements OooO00o {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        /* JADX INFO: renamed from: android.support.v4.app.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C18990OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f62195OooO0o0;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f62195OooO0o0;
            }

            @Override // android.support.v4.app.OooO00o
            public final void cancel(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO00o.f62194OooO00o);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.f62195OooO0o0.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.OooO00o
            public final void cancelAll(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO00o.f62194OooO00o);
                    parcelObtain.writeString(str);
                    this.f62195OooO0o0.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.OooO00o
            public final void notify(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO00o.f62194OooO00o);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f62195OooO0o0.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC18989OooO00o() {
            attachInterface(this, OooO00o.f62194OooO00o);
        }

        public static OooO00o asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OooO00o.f62194OooO00o);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof OooO00o)) {
                return (OooO00o) iInterfaceQueryLocalInterface;
            }
            C18990OooO00o c18990OooO00o = new C18990OooO00o();
            c18990OooO00o.f62195OooO0o0 = iBinder;
            return c18990OooO00o;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = OooO00o.f62194OooO00o;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
            } else if (i == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                cancelAll(parcel.readString());
            }
            return true;
        }
    }

    void cancel(String str, int i, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i, String str2, Notification notification) throws RemoteException;
}
