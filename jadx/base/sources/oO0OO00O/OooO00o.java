package oO0OO00O;

import java.util.concurrent.Callable;
import oO00o0o0.C32377OooO0O0;
import oO00o0o0.C32378OooO0OO;
import oO00o0o0.C32379OooO0Oo;
import oO00o0o0.C32384OooOO0;
import oO00o0o0.C32385OooOO0O;
import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AbstractC33500OooOOOo f118536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AbstractC33500OooOOOo f118537OooO0O0;

    /* JADX INFO: renamed from: oO0OO00O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20271OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32377OooO0O0 f118538OooO00o = new C32377OooO0O0();
    }

    public static final class OooO0O0 implements Callable<AbstractC33500OooOOOo> {
        @Override // java.util.concurrent.Callable
        public final AbstractC33500OooOOOo call() throws Exception {
            return C20271OooO00o.f118538OooO00o;
        }
    }

    public static final class OooO0OO implements Callable<AbstractC33500OooOOOo> {
        @Override // java.util.concurrent.Callable
        public final AbstractC33500OooOOOo call() throws Exception {
            return C32897OooO0Oo.f118539OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0OO00O.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32897OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32378OooO0OO f118539OooO00o = new C32378OooO0OO();
    }

    public static final class OooO0o implements Callable<AbstractC33500OooOOOo> {
        @Override // java.util.concurrent.Callable
        public final AbstractC33500OooOOOo call() throws Exception {
            return C32898OooO0o0.f118540OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0OO00O.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C32898OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32379OooO0Oo f118540OooO00o = new C32379OooO0Oo();
    }

    /* JADX INFO: renamed from: oO0OO00O.OooO00o$OooO0oO, reason: case insensitive filesystem */
    public static final class C32899OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32384OooOO0 f118541OooO00o = new C32384OooOO0();
    }

    /* JADX INFO: renamed from: oO0OO00O.OooO00o$OooO0oo, reason: case insensitive filesystem */
    public static final class CallableC32900OooO0oo implements Callable<AbstractC33500OooOOOo> {
        @Override // java.util.concurrent.Callable
        public final AbstractC33500OooOOOo call() throws Exception {
            return C32899OooO0oO.f118541OooO00o;
        }
    }

    static {
        oO0OOO0O.OooO00o.OooO00o(new CallableC32900OooO0oo());
        f118536OooO00o = oO0OOO0O.OooO00o.OooO00o(new OooO0O0());
        f118537OooO0O0 = oO0OOO0O.OooO00o.OooO00o(new OooO0OO());
        int i = C32385OooOO0O.f116461OooO00o;
        oO0OOO0O.OooO00o.OooO00o(new OooO0o());
    }
}
