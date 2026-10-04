package OooooOO;

import OooooO0.C21293OooOO0;
import android.graphics.Shader;

/* JADX INFO: renamed from: OooooOO.oo000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21369oo000o extends AbstractC21341OoooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Shader f61818OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f61819OooO0O0;

    public AbstractC21369oo000o() {
        int i = C21293OooOO0.f61730OooO0Oo;
        this.f61819OooO0O0 = C21293OooOO0.f61729OooO0OO;
    }

    @Override // OooooOO.AbstractC21341OoooOO0
    public final void OooO00o(float f, long j, C21331Oooo0O0 p) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
        Shader shaderOooO0O0 = this.f61818OooO00o;
        if (shaderOooO0O0 == null || !C21293OooOO0.OooO00o(this.f61819OooO0O0, j)) {
            shaderOooO0O0 = OooO0O0();
            this.f61818OooO00o = shaderOooO0O0;
            this.f61819OooO0O0 = j;
        }
        long jOooO0OO = p.OooO0OO();
        long j2 = C21348Ooooo0o.f61761OooO0O0;
        if (!C21348Ooooo0o.OooO0OO(jOooO0OO, j2)) {
            p.OooOO0o(j2);
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(p.OooO0o0(), shaderOooO0O0)) {
            p.OooOOOO(shaderOooO0O0);
        }
        if (p.OooO0O0() == f) {
            return;
        }
        p.OooOO0(f);
    }

    public abstract Shader OooO0O0();
}
