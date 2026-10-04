package o00OoooO;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25115OooO0Oo;
import o00o0O0.C25308OooO00o;

/* JADX INFO: renamed from: o00OoooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25173OooO0OO implements InterfaceC25115OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f85689OooO00o = 0;

    @Override // o00Ooo0o.InterfaceC25115OooO0Oo
    public boolean OooO00o(Object obj, File file, C25111OooO c25111OooO) throws Throwable {
        try {
            C25308OooO00o.OooO0Oo((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
