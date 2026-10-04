package oo000o;

import Oooo000.C20901OooOOo0;
import OooooO0.C21293OooOO0;

/* JADX INFO: renamed from: oo000o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC34627OooO0o0 {

    /* JADX INFO: renamed from: oo000o.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20368OooO00o f124810OooO00o = new C20368OooO00o();

        /* JADX INFO: renamed from: oo000o.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20368OooO00o implements InterfaceC34627OooO0o0 {
            @Override // oo000o.InterfaceC34627OooO0o0
            public final long OooO00o(long j, long j2) {
                float fMin = Math.min(C21293OooOO0.OooO0Oo(j2) / C21293OooOO0.OooO0Oo(j), C21293OooOO0.OooO0O0(j2) / C21293OooOO0.OooO0O0(j));
                return C20901OooOOo0.OooO00o(fMin, fMin);
            }
        }

        /* JADX INFO: renamed from: oo000o.OooO0o0$OooO00o$OooO0O0 */
        public static final class OooO0O0 implements InterfaceC34627OooO0o0 {
            @Override // oo000o.InterfaceC34627OooO0o0
            public final long OooO00o(long j, long j2) {
                if (C21293OooOO0.OooO0Oo(j) <= C21293OooOO0.OooO0Oo(j2) && C21293OooOO0.OooO0O0(j) <= C21293OooOO0.OooO0O0(j2)) {
                    return C20901OooOOo0.OooO00o(1.0f, 1.0f);
                }
                float fMin = Math.min(C21293OooOO0.OooO0Oo(j2) / C21293OooOO0.OooO0Oo(j), C21293OooOO0.OooO0O0(j2) / C21293OooOO0.OooO0O0(j));
                return C20901OooOOo0.OooO00o(fMin, fMin);
            }
        }
    }

    long OooO00o(long j, long j2);
}
