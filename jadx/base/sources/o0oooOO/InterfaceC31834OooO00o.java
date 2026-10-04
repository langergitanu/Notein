package o0oooOO;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vivo.penalgoengine.entity.ShapeData;
import java.util.List;

/* JADX INFO: renamed from: o0oooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31834OooO00o extends IInterface {

    /* JADX INFO: renamed from: o0oooOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC20178OooO00o extends Binder implements InterfaceC31834OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f113454OooO0o0 = 0;

        /* JADX INFO: renamed from: o0oooOO.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20179OooO00o implements InterfaceC31834OooO00o {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f113455OooO0o0;

            @Override // o0oooOO.InterfaceC31834OooO00o
            public final ShapeData OooOOOO(List list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vivo.penalgoengine.IAlgoService");
                    parcelObtain.writeTypedList(list);
                    parcelObtain.writeInt(1);
                    this.f113455OooO0o0.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ShapeData.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f113455OooO0o0;
            }
        }
    }

    ShapeData OooOOOO(List list) throws RemoteException;
}
