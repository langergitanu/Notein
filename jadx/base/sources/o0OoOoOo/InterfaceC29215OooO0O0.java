package o0OoOoOo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.hihonor.cloudservice.framework.aidl.DataBuffer;
import o0O000.OooO00o;

/* JADX INFO: renamed from: o0OoOoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC29215OooO0O0 extends IInterface {

    /* JADX INFO: renamed from: o0OoOoOo.OooO0O0$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC29215OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f103600OooO0o0 = 0;

        /* JADX INFO: renamed from: o0OoOoOo.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19965OooO00o implements InterfaceC29215OooO0O0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f103601OooO0o0;

            @Override // o0OoOoOo.InterfaceC29215OooO0O0
            public final void OooOOO0(DataBuffer dataBuffer, OooO00o.BinderC19720OooO00o binderC19720OooO00o) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.framework.aidl.IServiceInvoke");
                    parcelObtain.writeInt(1);
                    dataBuffer.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(binderC19720OooO00o);
                    if (!this.f103601OooO0o0.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f103600OooO0o0;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f103601OooO0o0;
            }
        }

        public static InterfaceC29215OooO0O0 OooOo0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.framework.aidl.IServiceInvoke");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC29215OooO0O0)) {
                return (InterfaceC29215OooO0O0) iInterfaceQueryLocalInterface;
            }
            C19965OooO00o c19965OooO00o = new C19965OooO00o();
            c19965OooO00o.f103601OooO0o0 = iBinder;
            return c19965OooO00o;
        }
    }

    void OooOOO0(DataBuffer dataBuffer, OooO00o.BinderC19720OooO00o binderC19720OooO00o);
}
