package ooOOOOoo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ooOOOOoo.InterfaceC35086Oooo00O;

/* JADX INFO: renamed from: ooOOOOoo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC35088Oooo0O0 extends IInterface {

    /* JADX INFO: renamed from: ooOOOOoo.Oooo0O0$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC35088Oooo0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f126036OooO0o0 = 0;

        /* JADX INFO: renamed from: ooOOOOoo.Oooo0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20376OooO00o implements InterfaceC35088Oooo0O0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public IBinder f126037OooO0o0;

            @Override // ooOOOOoo.InterfaceC35088Oooo0O0
            public final void OooO0oo(String str, InterfaceC35086Oooo00O interfaceC35086Oooo00O) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.mirror.ISynergyService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(interfaceC35086Oooo00O != null ? (InterfaceC35086Oooo00O.OooO00o) interfaceC35086Oooo00O : null);
                    if (!this.f126037OooO0o0.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f126036OooO0o0;
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

            @Override // ooOOOOoo.InterfaceC35088Oooo0O0
            /* JADX INFO: renamed from: a */
            public final void mo80642a(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.mirror.ISynergyService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f126037OooO0o0.transact(5, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f126036OooO0o0;
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
                return this.f126037OooO0o0;
            }

            @Override // ooOOOOoo.InterfaceC35088Oooo0O0
            /* JADX INFO: renamed from: b */
            public final void mo80643b(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.mirror.ISynergyService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f126037OooO0o0.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f126036OooO0o0;
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

            @Override // ooOOOOoo.InterfaceC35088Oooo0O0
            /* JADX INFO: renamed from: c */
            public final void mo80644c(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.mirror.ISynergyService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f126037OooO0o0.transact(4, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f126036OooO0o0;
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

    void OooO0oo(String str, InterfaceC35086Oooo00O interfaceC35086Oooo00O);

    /* JADX INFO: renamed from: a */
    void mo80642a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    void mo80643b(Bundle bundle);

    /* JADX INFO: renamed from: c */
    void mo80644c(Bundle bundle);
}
