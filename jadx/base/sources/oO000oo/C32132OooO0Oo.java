package oO000oo;

import OooooO0.C21286OooO0O0;
import java.util.List;
import o00000.OooOO0;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32200OooOooO;
import oO00O0o0.C32206Oooo0OO;
import oO00O0o0.C32211OoooO0;
import oO00O0o0.InterfaceC32191OooOOoo;
import oO0O0OoO.C32710OooO0OO;
import oO0o0OO.C33664o00000Oo;
import oOo00Oo0.C34502OooO00o;
import oOo00Oo0.C34518OooOoO;
import oOo00Oo0.OooOOO0;

/* JADX INFO: renamed from: oO000oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32132OooO0Oo implements InterfaceC32191OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32200OooOooO f115203OooO00o = new C32200OooOooO(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C32192OooOo0 f115204OooO0O0 = C32192OooOo0.f115538OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32187OooOO0o f115205OooO0OO = new C32187OooOO0o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f115206OooO0Oo = C32710OooO0OO.f117616OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C33664o00000Oo f115208OooO0o0 = OooOO0.OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO0 f115207OooO0o = new OooOOO0();

    public final C32134OooO0o0 OooO00o() {
        C32211OoooO0 c32211OoooO0OooO0O0 = this.f115203OooO00o.OooO0O0();
        C32192OooOo0 c32192OooOo0 = this.f115204OooO0O0;
        oO00O0o0.OooOOO0 oooOOO0 = new oO00O0o0.OooOOO0(this.f115205OooO0OO.f123698OooO00o);
        Object obj = this.f115206OooO0Oo;
        oO00O0oO.OooO0OO oooO0OO = obj instanceof oO00O0oO.OooO0OO ? (oO00O0oO.OooO0OO) obj : null;
        if (oooO0OO != null) {
            return new C32134OooO0o0(c32211OoooO0OooO0O0, c32192OooOo0, oooOOO0, oooO0OO, this.f115208OooO0o0, this.f115207OooO0o);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f115206OooO0Oo).toString());
    }

    public final void OooO0O0(Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(obj, "<set-?>");
        this.f115206OooO0Oo = obj;
    }

    public final void OooO0OO(oOOoOoOO.OooO00o oooO00o) {
        OooOOO0 oooOOO0 = this.f115207OooO0o;
        if (oooO00o != null) {
            oooOOO0.OooO0o0(C32128OooO.f115196OooO00o, oooO00o);
            return;
        }
        C34502OooO00o<oOOoOoOO.OooO00o> key = C32128OooO.f115196OooO00o;
        oooOOO0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        oooOOO0.OooO0oO().remove(key);
    }

    public final void OooO0Oo(C32192OooOo0 c32192OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32192OooOo0, "<set-?>");
        this.f115204OooO0O0 = c32192OooOo0;
    }

    public final void OooO0o0(C32132OooO0Oo builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        this.f115208OooO0o0 = builder.f115208OooO0o0;
        this.f115204OooO0O0 = builder.f115204OooO0O0;
        this.f115206OooO0Oo = builder.f115206OooO0Oo;
        C34502OooO00o<oOOoOoOO.OooO00o> c34502OooO00o = C32128OooO.f115196OooO00o;
        OooOOO0 oooOOO0 = builder.f115207OooO0o;
        OooO0OO((oOOoOoOO.OooO00o) oooOOO0.OooO0OO(c34502OooO00o));
        C32200OooOooO c32200OooOooO = builder.f115203OooO00o;
        C32200OooOooO c32200OooOooO2 = this.f115203OooO00o;
        C32206Oooo0OO.OooO0Oo(c32200OooOooO2, c32200OooOooO);
        List<String> list = c32200OooOooO2.f115578OooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<set-?>");
        c32200OooOooO2.f115578OooO0oo = list;
        C34518OooOoO.OooO00o(this.f115205OooO0OO, builder.f115205OooO0OO);
        C21286OooO0O0.OooO0o0(this.f115207OooO0o, oooOOO0);
    }

    @Override // oO00O0o0.InterfaceC32191OooOOoo
    public final C32187OooOO0o getHeaders() {
        return this.f115205OooO0OO;
    }
}
