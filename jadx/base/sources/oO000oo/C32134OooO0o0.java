package oO000oo;

import java.util.Map;
import java.util.Set;
import oO000o.C32084OooO0oo;
import oO000o.InterfaceC32083OooO0oO;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32211OoooO0;
import oO00O0o0.OooOOO0;
import oO0Ooo0O.C33419OoooO0;
import oO0o0OO.C33664o00000Oo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: oO000oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32134OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32211OoooO0 f115215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32192OooOo0 f115216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f115217OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO00O0oO.OooO0OO f115218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oOo00Oo0.OooOOO0 f115219OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33664o00000Oo f115220OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<InterfaceC32083OooO0oO<?>> f115221OooO0oO;

    public C32134OooO0o0(C32211OoooO0 c32211OoooO0, C32192OooOo0 method, OooOOO0 oooOOO0, oO00O0oO.OooO0OO oooO0OO, C33664o00000Oo executionContext, oOo00Oo0.OooOOO0 attributes) {
        Set<InterfaceC32083OooO0oO<?>> setKeySet;
        kotlin.jvm.internal.OooOOO0.OooO0oO(method, "method");
        kotlin.jvm.internal.OooOOO0.OooO0oO(executionContext, "executionContext");
        kotlin.jvm.internal.OooOOO0.OooO0oO(attributes, "attributes");
        this.f115215OooO00o = c32211OoooO0;
        this.f115216OooO0O0 = method;
        this.f115217OooO0OO = oooOOO0;
        this.f115218OooO0Oo = oooO0OO;
        this.f115220OooO0o0 = executionContext;
        this.f115219OooO0o = attributes;
        Map map = (Map) attributes.OooO0OO(C32084OooO0oo.f114926OooO00o);
        this.f115221OooO0oO = (map == null || (setKeySet = map.keySet()) == null) ? C34438OooOoo0.f123458OooOo0o : setKeySet;
    }

    public final Object OooO00o() {
        C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
        Map map = (Map) this.f115219OooO0o.OooO0OO(C32084OooO0oo.f114926OooO00o);
        if (map != null) {
            return map.get(oooO0O0);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f115215OooO00o + ", method=" + this.f115216OooO0O0 + ')';
    }
}
