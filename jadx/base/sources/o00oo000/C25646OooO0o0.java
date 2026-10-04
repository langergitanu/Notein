package o00oo000;

import OooOoo0.OooOo00;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import o00o0Ooo.InterfaceC25423OooO;
import o00oO00O.AbstractC25474OooO00o;
import o00oO00O.C25475OooO0O0;
import o00oOooo.InterfaceC25632OooO00o;
import o00oo0O0.C25670OooOOOO;
import o00oo0Oo.C25701OooOOo0;
import o00oo0Oo.C25703OooOo0;

/* JADX INFO: renamed from: o00oo000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25646OooO0o0 implements InterfaceC25423OooO<C25645OooO0Oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f87531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25701OooOOo0 f87532OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f87533OooO0OO;

    public C25646OooO0o0(Context context) {
        C25475OooO0O0 c25475OooO0O0;
        C25703OooOo0 c25703OooOo0 = C25703OooOo0.f87726OooOOOo;
        OooOo00.OooO0o0(c25703OooOo0, "ImagePipelineFactory was not initialized!");
        this.f87531OooO00o = context;
        C25701OooOOo0 c25701OooOOo0OooO0o0 = c25703OooOo0.OooO0o0();
        this.f87532OooO0O0 = c25701OooOOo0OooO0o0;
        OooO0o oooO0o = new OooO0o();
        this.f87533OooO0OO = oooO0o;
        Resources resources = context.getResources();
        synchronized (AbstractC25474OooO00o.class) {
            try {
                if (AbstractC25474OooO00o.f86788OooO00o == null) {
                    AbstractC25474OooO00o.f86788OooO00o = new C25475OooO0O0();
                }
                c25475OooO0O0 = AbstractC25474OooO00o.f86788OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC25632OooO00o interfaceC25632OooO00oOooO00o = c25703OooOo0.OooO00o();
        o0O0o.OooO00o OooO00o2 = interfaceC25632OooO00oOooO00o == null ? null : interfaceC25632OooO00oOooO00o.OooO00o();
        c25703OooOo0.f87730OooO0O0.f87693OooOo0O.getClass();
        if (o00o0Oo.OooO0o.f86694OooOo == null) {
            o00o0Oo.OooO0o.f86694OooOo = new o00o0Oo.OooO0o(new Handler(Looper.getMainLooper()));
        }
        o00o0Oo.OooO0o oooO0o2 = o00o0Oo.OooO0o.f86694OooOo;
        C25670OooOOOO c25670OooOOOO = c25701OooOOo0OooO0o0.f87706OooO0Oo;
        oooO0o.f87526OooO00o = resources;
        oooO0o.f87527OooO0O0 = c25475OooO0O0;
        oooO0o.f87528OooO0OO = OooO00o2;
        oooO0o.f87529OooO0Oo = oooO0o2;
        oooO0o.f87530OooO0o0 = c25670OooOOOO;
    }

    @Override // o00o0Ooo.InterfaceC25423OooO
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final C25645OooO0Oo get() {
        return new C25645OooO0Oo(this.f87531OooO00o, this.f87533OooO0OO, this.f87532OooO0O0);
    }
}
