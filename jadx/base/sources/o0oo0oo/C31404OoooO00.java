package o0oo0oo;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o0oo0oo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31404OoooO00 extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ConcurrentHashMap f112132OooO0o;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        abstractC31397Oooo0O0.OooOOoo();
        abstractC31397Oooo0O0.Oooo000();
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        this.f112132OooO0o = new ConcurrentHashMap(iOoOO);
        for (int i = 0; i < iOoOO; i++) {
            this.f112132OooO0o.put(Integer.valueOf(abstractC31397Oooo0O0.ooOO()), Integer.valueOf(abstractC31397Oooo0O0.Oooo000()));
        }
        this.f112121OooO0Oo = true;
    }
}
