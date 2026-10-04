package oO00Ooo;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import oO00Ooo.C32297OooO0o0;
import oO00Ooo.OooOOO;
import oO00Ooo.OooOOO0;
import oO00Ooo0.C32309OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, AbstractC32292OooO00o> f116201OooO0OO = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Set<OooO00o> f116202OooO0Oo = Collections.unmodifiableSet(EnumSet.noneOf(OooO00o.class));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32302OooOOOo f116203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<OooO00o> f116204OooO0O0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f116205OooOo0o = {new OooO00o("RECORD_EVENTS", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        OooO00o EF5;

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f116205OooOo0o.clone();
        }
    }

    public OooOOOO(C32302OooOOOo c32302OooOOOo) {
        C32309OooO00o.OooO00o(c32302OooOOOo, "context");
        this.f116203OooO00o = c32302OooOOOo;
        this.f116204OooO0O0 = f116202OooO0Oo;
    }

    public void OooO00o(OooOOO0 oooOOO0) {
        OooO0O0(new C32296OooO0o(oooOOO0.OooO0Oo() == OooOOO0.OooO0O0.f116198OooOo ? OooOOO.OooO00o.f116195OooOo : OooOOO.OooO00o.f116196OooOo0o, oooOOO0.OooO0OO(), oooOOO0.OooO0o0(), oooOOO0.OooO0O0()));
    }

    @Deprecated
    public void OooO0O0(OooOOO oooOOO) {
        C32297OooO0o0.OooO00o OooO00o2 = OooOOO0.OooO00o(oooOOO.OooO0OO() == OooOOO.OooO00o.f116195OooOo ? OooOOO0.OooO0O0.f116198OooOo : OooOOO0.OooO0O0.f116199OooOo0o, oooOOO.OooO0O0());
        OooO00o2.f116190OooO0OO = Long.valueOf(oooOOO.OooO0Oo());
        OooO00o2.f116191OooO0Oo = Long.valueOf(oooOOO.OooO00o());
        OooO00o(OooO00o2.OooO00o());
    }

    public void OooO0OO(String str, AbstractC32292OooO00o abstractC32292OooO00o) {
        C32309OooO00o.OooO00o(str, "key");
        OooO0Oo(Collections.singletonMap(str, abstractC32292OooO00o));
    }

    public void OooO0Oo(Map<String, AbstractC32292OooO00o> map) {
        C32309OooO00o.OooO00o(map, "attributes");
        OooO0Oo(map);
    }
}
