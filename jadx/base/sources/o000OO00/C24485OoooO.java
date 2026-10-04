package o000OO00;

import OooOoOO.C20519OooO0Oo;
import java.util.LinkedHashMap;
import java.util.List;
import o000OO00.C24457OooOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.InterfaceC32440OooOO0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o000OO00.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24485OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32447OooOOo f82782OooO00o = C20519OooO0Oo.OooO0OO(new C24479Oooo0O0());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32447OooOOo f82783OooO0O0 = C20519OooO0Oo.OooO0OO(new C24480Oooo0OO(0));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32447OooOOo f82784OooO0OO = C20519OooO0Oo.OooO0OO(new C24482Oooo0o0());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final LinkedHashMap f82785OooO0Oo;

    /* JADX INFO: renamed from: o000OO00.OoooO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f82786OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f82787OooO0O0;

        static {
            OooO00o oooO00o = new OooO00o();
            f82786OooO00o = oooO00o;
            f82787OooO0O0 = oooO00o;
        }

        public final String toString() {
            return "HighlighterVersion.V1";
        }
    }

    /* JADX INFO: renamed from: o000OO00.OoooO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f82788OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f82789OooO0O0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0();
            f82788OooO00o = oooO0O0;
            f82789OooO0O0 = oooO0O0;
        }

        public final String toString() {
            return "MarkerVersion.V1";
        }
    }

    /* JADX INFO: renamed from: o000OO00.OoooO$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f82790OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0OO f82791OooO0O0;

        static {
            OooO0OO oooO0OO = new OooO0OO();
            f82790OooO00o = oooO0OO;
            f82791OooO0O0 = oooO0OO;
        }

        public final String toString() {
            return "PressurePenVersion.V1";
        }
    }

    static {
        List listOooOO0o = C34429OooOOo0.OooOO0o(Oooo0.f82760OooO0Oo, Oooo0.f82762OooO0o0, Oooo0.f82761OooO0o);
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Object obj : listOooOO0o) {
            final Oooo0 oooo0 = (Oooo0) obj;
            linkedHashMap.put(obj, C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o000OO00.Oooo0o
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    C24457OooOOo.OooO00o oooO00o = C24457OooOOo.f82666OooO0oO;
                    C24488OoooO0O c24488OoooO0O = new C24488OoooO0O(oooo0, 0);
                    oooO00o.getClass();
                    return new C24457OooOOo(c24488OoooO0O, null, null);
                }
            }));
        }
        f82785OooO0Oo = linkedHashMap;
        C20519OooO0Oo.OooO0OO(new C24483Oooo0oO(0));
    }

    public static C24457OooOOo OooO00o() {
        Oooo0 selfOverlap = Oooo0.f82760OooO0Oo;
        OooO00o oooO00o = OooO00o.f82787OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(selfOverlap, "selfOverlap");
        if (!oooO00o.equals(OooO00o.f82786OooO00o)) {
            throw new IllegalArgumentException("Unsupported highlighter version: " + oooO00o);
        }
        Object obj = f82785OooO0Oo.get(selfOverlap);
        if (obj != null) {
            return (C24457OooOOo) ((InterfaceC32440OooOO0) obj).getValue();
        }
        throw new IllegalStateException(("Unrecognized SelfOverlap value: " + selfOverlap).toString());
    }

    public static C24457OooOOo OooO0O0() {
        OooO0O0 oooO0O0 = OooO0O0.f82789OooO0O0;
        if (oooO0O0.equals(OooO0O0.f82788OooO00o)) {
            return (C24457OooOOo) f82783OooO0O0.getValue();
        }
        throw new IllegalArgumentException("Unsupported marker version: " + oooO0O0);
    }

    public static C24457OooOOo OooO0OO() {
        OooO0OO oooO0OO = OooO0OO.f82791OooO0O0;
        if (oooO0OO.equals(OooO0OO.f82790OooO00o)) {
            return (C24457OooOOo) f82784OooO0OO.getValue();
        }
        throw new IllegalArgumentException("Unsupported pressure pen version: " + oooO0OO);
    }
}
