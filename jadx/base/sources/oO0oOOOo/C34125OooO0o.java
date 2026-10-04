package oO0oOOOo;

import java.util.concurrent.ConcurrentHashMap;
import oO00OoO0.C32286OooO0oO;

/* JADX INFO: renamed from: oO0oOOOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34125OooO0o<T> implements InterfaceC34127OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f122634OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o<T> f122635OooO0O0;

    /* JADX INFO: renamed from: oO0oOOOo.OooO0o$OooO00o */
    public interface OooO00o<T> {
        T OooO00o(C32286OooO0oO c32286OooO0oO);
    }

    public C34125OooO0o(OooO00o<T> oooO00o) {
        this.f122635OooO0O0 = oooO00o;
    }

    public final void OooO00o(C32286OooO0oO c32286OooO0oO) {
        this.f122634OooO00o.put(this.f122635OooO0O0.OooO00o(c32286OooO0oO), c32286OooO0oO);
    }
}
