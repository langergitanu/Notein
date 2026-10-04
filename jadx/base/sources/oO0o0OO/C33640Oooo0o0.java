package oO0o0OO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0o0Ooo.C33824OooO0o;

/* JADX INFO: renamed from: oO0o0OO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33640Oooo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f121323OooO00o = 0;

    public static final String OooO00o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String OooO0O0(Continuation continuation) {
        Object objOooO00o;
        if (continuation instanceof C33824OooO0o) {
            return ((C33824OooO0o) continuation).toString();
        }
        try {
            objOooO00o = continuation + '@' + OooO00o(continuation);
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (C32445OooOOOO.OooO00o(objOooO00o) != null) {
            objOooO00o = continuation.getClass().getName() + '@' + OooO00o(continuation);
        }
        return (String) objOooO00o;
    }
}
