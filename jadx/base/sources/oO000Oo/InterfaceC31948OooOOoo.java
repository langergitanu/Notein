package oO000Oo;

import oO0OOo0o.C33094OoooO;

/* JADX INFO: renamed from: oO000Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31948OooOOoo extends InterfaceC32049o0000oOO {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO000Oo.OooOOoo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f114033OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f114034OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f114035OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f114036OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f114037OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("PROCESSED", 0);
            f114034OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("REFUSED", 1);
            f114033OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("DROPPED", 2);
            f114036OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("MISCARRIED", 3);
            f114035OooOoO = oooO00o4;
            f114037OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f114037OooOoOO.clone();
        }
    }

    void OooO0O0(C33094OoooO c33094OoooO);

    void OooO0OO(oO0OOo0o.o00Oo0 o00oo02, OooO00o oooO00o, C33094OoooO c33094OoooO);
}
