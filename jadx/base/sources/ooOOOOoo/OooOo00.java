package ooOOOOoo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.huawei.hms.network.base.util.HttpUtils;
import o0oooo.C31862OooO00o;
import ooOOOOoo.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
public interface OooOo00 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooOo00 {
        public OooO00o() {
            attachInterface(this, "com.xiaomi.dist.handoff.ISessionHostCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.dist.handoff.ISessionHostCallback");
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.dist.handoff.ISessionHostCallback");
                C31862OooO00o c31862OooO00o = ((OooOO0.BinderC35070OooO0o0) this).f125983OooO0o0.get();
                String strOooO0Oo = C35074OooOOo0.OooO0Oo(c31862OooO00o != null ? c31862OooO00o.f113562OooO0O0 : null);
                C35077OooOo0O.OooO0o0("HH", "getDeepLink: %s", strOooO0Oo);
                parcel2.writeNoException();
                parcel2.writeString(strOooO0Oo);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.xiaomi.dist.handoff.ISessionHostCallback");
                ((OooOO0.BinderC35070OooO0o0) this).f125983OooO0o0.get();
                String strOooO0Oo2 = C35074OooOOo0.OooO0Oo(null);
                if (TextUtils.isEmpty(strOooO0Oo2) || (!strOooO0Oo2.startsWith(HttpUtils.HTTP_PREFIX) && !strOooO0Oo2.startsWith("https://"))) {
                    strOooO0Oo2 = "";
                }
                C35077OooOo0O.OooO0o0("HH", "getAppLink: %s", strOooO0Oo2);
                parcel2.writeNoException();
                parcel2.writeString(strOooO0Oo2);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.xiaomi.dist.handoff.ISessionHostCallback");
                ((OooOO0.BinderC35070OooO0o0) this).f125983OooO0o0.get();
                C35077OooOo0O.OooO0o0("HH", "hasDeeplinkCallBack %s", Boolean.FALSE);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.xiaomi.dist.handoff.ISessionHostCallback");
                C35077OooOo0O.OooO0o0("HH", "onSaveSessionState", null);
                ((OooOO0.BinderC35070OooO0o0) this).f125983OooO0o0.get();
                parcel2.writeNoException();
                parcel2.writeByteArray(new byte[0]);
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.xiaomi.dist.handoff.ISessionHostCallback");
            parcel.createByteArray();
            C35077OooOo0O.OooO0o0("HH", "onRestoreSessionState", null);
            ((OooOO0.BinderC35070OooO0o0) this).f125983OooO0o0.get();
            parcel2.writeNoException();
            return true;
        }
    }
}
