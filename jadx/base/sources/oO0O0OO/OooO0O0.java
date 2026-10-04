package oO0O0OO;

import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO0O0 extends oO0O0OO.OooO00o, InterfaceC32612OooOoO {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f117221OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117222OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f117223OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f117224OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f117225OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("DECLARATION", 0);
            f117222OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("FAKE_OVERRIDE", 1);
            f117221OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("DELEGATION", 2);
            f117224OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("SYNTHESIZED", 3);
            f117223OooOoO = oooO00o4;
            f117225OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f117225OooOoOO.clone();
        }
    }

    @Override // oO0O0OO.OooO00o, oO0O0OO.OooOO0O
    OooO0O0 OooO00o();

    @Override // oO0O0OO.OooO00o
    Collection<? extends OooO0O0> OooOO0o();

    OooO0O0 OooOOoo(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32600OooOOOo abstractC32600OooOOOo);

    void Oooo0oO(Collection<? extends OooO0O0> collection);

    OooO00o getKind();
}
