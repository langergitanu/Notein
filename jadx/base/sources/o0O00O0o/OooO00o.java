package o0O00O0o;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import oOO00Ooo.C34364OooO00o;
import oOO00o0.C34370OooO0o0;
import oOO00o00.C34373OooO0OO;
import oOO00o00.InterfaceC34371OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f88146OooO00o;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: all -> 0x001b, TryCatch #1 {, blocks: (B:4:0x000c, B:6:0x0016, B:14:0x0028, B:15:0x002e, B:17:0x0034, B:18:0x003e, B:10:0x001d), top: B:25:0x000c, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO00o(Context context) {
        int i;
        C34370OooO0o0.OooO0Oo("SDKAccountManager", "init SDKAccountManager");
        ArrayList arrayList = C34373OooO0OO.f123359OooO00o;
        synchronized (C34373OooO0OO.class) {
            String strOooO00o = C34364OooO00o.OooO00o(context);
            if (TextUtils.isEmpty(strOooO00o)) {
                i = -1;
                if (i < 3) {
                }
                C34364OooO00o.OooO0o(context, String.valueOf(3));
            } else {
                try {
                    i = Integer.parseInt(strOooO00o);
                } catch (Exception unused) {
                    C34370OooO0o0.OooO0OO("VersionUpdateHelper", "parse encryptversion error:");
                    i = -1;
                }
                if (i < 3) {
                    Iterator it = C34373OooO0OO.f123359OooO00o.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC34371OooO00o) it.next()).OooO00o(context, i);
                    }
                }
                C34364OooO00o.OooO0o(context, String.valueOf(3));
            }
        }
    }
}
