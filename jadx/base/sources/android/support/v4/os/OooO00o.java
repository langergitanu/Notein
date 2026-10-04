package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f62234OooO0O0 = "android$support$v4$os$IResultReceiver".replace('$', FilenameUtils.EXTENSION_SEPARATOR);

    /* JADX INFO: renamed from: android.support.v4.os.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC18991OooO00o extends Binder implements OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f62235OooO0o0 = 0;

        /* JADX INFO: renamed from: android.support.v4.os.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C18992OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f62236OooO0o0;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f62236OooO0o0;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = OooO00o.f62234OooO0O0;
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
            ResultReceiver.this.OooO00o(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}
