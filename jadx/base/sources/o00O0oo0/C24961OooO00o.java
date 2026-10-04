package o00O0oo0;

import android.graphics.drawable.PictureDrawable;
import java.util.Iterator;
import o00Ooo0o.C25111OooO;
import o00OooO.InterfaceC25145OooOo0o;
import o00o0000.C25239OooO0O0;
import o00o00O0.InterfaceC25253OooO0o0;
import o00o0OO0.C25345OooO0o;
import oO00ooO.C32435OooO0Oo;
import oO0o0OO.InterfaceC33631OooOooo;
import oO0o0Ooo.C33823OooO0Oo;
import oO0o0Ooo.C33825OooO0o0;
import oO0oOoOo.InterfaceC34201OooO0Oo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o00O0oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24961OooO00o implements InterfaceC25253OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84669OooO00o = 0;

    public static final void OooO0O0(Throwable th, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        Throwable runtimeException;
        Iterator<InterfaceC33631OooOooo> it = C33823OooO0Oo.f121917OooO00o.iterator();
        while (it.hasNext()) {
            try {
                it.next().o000O00O(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C32435OooO0Oo.OooO00o(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            C32435OooO0Oo.OooO00o(th, new C33825OooO0o0(interfaceC34415OooO0oo));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void OooO0OO(int i, InterfaceC34201OooO0Oo interfaceC34201OooO0Oo) {
        interfaceC34201OooO0Oo.update((byte) (i >>> 24));
        interfaceC34201OooO0Oo.update((byte) (i >>> 16));
        interfaceC34201OooO0Oo.update((byte) (i >>> 8));
        interfaceC34201OooO0Oo.update((byte) i);
    }

    @Override // o00o00O0.InterfaceC25253OooO0o0
    public InterfaceC25145OooOo0o OooO00o(InterfaceC25145OooOo0o toTranscode, C25111OooO c25111OooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(toTranscode, "toTranscode");
        Object obj = toTranscode.get();
        kotlin.jvm.internal.OooOOO0.OooO0o(obj, "get(...)");
        return new C25239OooO0O0(new PictureDrawable(((C25345OooO0o) obj).OooO0OO()));
    }
}
