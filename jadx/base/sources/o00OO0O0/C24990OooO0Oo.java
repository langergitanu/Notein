package o00OO0O0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o00OO0O0.OooO00o;

/* JADX INFO: renamed from: o00OO0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24990OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OO0O0.OooO00o f84787OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f84788OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f84789OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f84790OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f84791OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: o00OO0O0.OooO0Oo$OooO00o */
    public class OooO00o implements ServiceConnection {
        public OooO00o() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o00OO0O0.OooO00o oooO00o;
            C24990OooO0Oo c24990OooO0Oo = C24990OooO0Oo.this;
            int i = OooO00o.AbstractBinderC19662OooO00o.f84781OooO0o0;
            if (iBinder == null) {
                oooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o00OO0O0.OooO00o)) {
                    OooO00o.AbstractBinderC19662OooO00o.C19663OooO00o c19663OooO00o = new OooO00o.AbstractBinderC19662OooO00o.C19663OooO00o();
                    c19663OooO00o.f84782OooO0o0 = iBinder;
                    oooO00o = c19663OooO00o;
                } else {
                    oooO00o = (o00OO0O0.OooO00o) iInterfaceQueryLocalInterface;
                }
            }
            c24990OooO0Oo.f84787OooO00o = oooO00o;
            synchronized (C24990OooO0Oo.this.f84790OooO0Oo) {
                C24990OooO0Oo.this.f84790OooO0Oo.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C24990OooO0Oo.this.f84787OooO00o = null;
        }
    }

    /* JADX INFO: renamed from: o00OO0O0.OooO0Oo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C24990OooO0Oo f84793OooO00o = new C24990OooO0Oo();
    }

    public final String OooO00o(Context context) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f84788OooO0O0)) {
            this.f84788OooO0O0 = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f84789OooO0OO)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f84788OooO0O0, 64).signatures;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e2) {
                    e2.printStackTrace();
                }
            }
            this.f84789OooO0OO = string;
        }
        o00OO0O0.OooO00o oooO00o = this.f84787OooO00o;
        String str = this.f84788OooO0O0;
        String str2 = this.f84789OooO0OO;
        OooO00o.AbstractBinderC19662OooO00o.C19663OooO00o c19663OooO00o = (OooO00o.AbstractBinderC19662OooO00o.C19663OooO00o) oooO00o;
        c19663OooO00o.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            c19663OooO00o.f84782OooO0o0.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string2 = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return TextUtils.isEmpty(string2) ? "" : string2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
