package o00ooO0;

import java.io.InputStream;
import o00o0o0o.C25451OooOO0;

/* JADX INFO: renamed from: o00ooO0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25750OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f87875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25451OooOO0 f87876OooO0O0;

    public C25750OooOoOO(OooOo oooOo, C25451OooOO0 pooledByteStreams) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pooledByteStreams, "pooledByteStreams");
        this.f87875OooO00o = oooOo;
        this.f87876OooO0O0 = pooledByteStreams;
    }

    public final C25748OooOoO OooO00o(InputStream inputStream, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputStream, "inputStream");
        C25752OooOoo0 c25752OooOoo0 = new C25752OooOoo0(this.f87875OooO00o, i);
        try {
            this.f87876OooO0O0.OooO00o(inputStream, c25752OooOoo0);
            return c25752OooOoo0.OooO00o();
        } finally {
            c25752OooOoo0.close();
        }
    }

    public final C25752OooOoo0 OooO0O0() {
        OooOo oooOo = this.f87875OooO00o;
        return new C25752OooOoo0(oooOo, oooOo.f87867OooOO0[0]);
    }
}
