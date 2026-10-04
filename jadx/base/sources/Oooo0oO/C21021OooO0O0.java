package Oooo0oO;

import OooOoOO.C20519OooO0Oo;
import android.os.Looper;

/* JADX INFO: renamed from: Oooo0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21021OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f60881OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f60882OooO0O0 = 0;

    /* JADX INFO: renamed from: Oooo0oO.OooO0O0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC21078Ooooooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f60883OooOo0o = new OooO00o(0);

        @Override // oO0O000o.OooO00o
        public final InterfaceC21078Ooooooo invoke() {
            return Looper.getMainLooper() != null ? C21057Oooo0o0.f60997OooOo0o : C21087o0000Oo.f61135OooOo0o;
        }
    }

    static {
        long id;
        C20519OooO0Oo.OooO0OO(OooO00o.f60883OooOo0o);
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f60881OooO00o = id;
    }
}
