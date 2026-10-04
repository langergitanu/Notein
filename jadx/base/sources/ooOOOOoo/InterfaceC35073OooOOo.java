package ooOOOOoo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ooOOOOoo.InterfaceC35075OooOOoo;
import ooOOOOoo.OooOo00;
import p615ho.C18932e;

/* JADX INFO: renamed from: ooOOOOoo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC35073OooOOo extends IInterface {

    /* JADX INFO: renamed from: ooOOOOoo.OooOOo$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC35073OooOOo {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f125989OooO0o0 = 0;

        /* JADX INFO: renamed from: ooOOOOoo.OooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20375OooO00o implements InterfaceC35073OooOOo {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f125990OooO0o0;

            @Override // ooOOOOoo.InterfaceC35073OooOOo
            public final int OooO0Oo(C18932e c18932e, OooOo00 oooOo00, InterfaceC35075OooOOoo interfaceC35075OooOOoo, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.dist.handoff.IAppHandoffService");
                    parcelObtain.writeInt(1);
                    c18932e.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(oooOo00 != null ? (OooOo00.OooO00o) oooOo00 : null);
                    parcelObtain.writeStrongBinder(interfaceC35075OooOOoo != null ? (InterfaceC35075OooOOoo.OooO00o) interfaceC35075OooOOoo : null);
                    parcelObtain.writeInt(i);
                    if (!this.f125990OooO0o0.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i2 = OooO00o.f125989OooO0o0;
                    }
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i3;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // ooOOOOoo.InterfaceC35073OooOOo
            /* JADX INFO: renamed from: a */
            public final void mo80637a(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.dist.handoff.IAppHandoffService");
                    parcelObtain.writeInt(i);
                    if (!this.f125990OooO0o0.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i2 = OooO00o.f125989OooO0o0;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f125990OooO0o0;
            }

            @Override // ooOOOOoo.InterfaceC35073OooOOo
            /* JADX INFO: renamed from: a */
            public final void mo80638a(int i, int i2, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.dist.handoff.IAppHandoffService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (!this.f125990OooO0o0.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i4 = OooO00o.f125989OooO0o0;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // ooOOOOoo.InterfaceC35073OooOOo
            /* JADX INFO: renamed from: a */
            public final void mo80639a(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.dist.handoff.IAppHandoffService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f125990OooO0o0.transact(4, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f125989OooO0o0;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }
    }

    int OooO0Oo(C18932e c18932e, OooOo00 oooOo00, InterfaceC35075OooOOoo interfaceC35075OooOOoo, int i);

    /* JADX INFO: renamed from: a */
    void mo80637a(int i);

    /* JADX INFO: renamed from: a */
    void mo80638a(int i, int i2, int i3);

    /* JADX INFO: renamed from: a */
    void mo80639a(boolean z);
}
