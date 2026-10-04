package oO0OOOo;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import oO0O0OO.InterfaceC32596OooO0o0;

/* JADX INFO: renamed from: oO0OOOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC32991OooOO0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OOOo.OooOO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f119361OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f119362OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f119363OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f119364OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("CONFLICTS_ONLY", 0);
            f119362OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("SUCCESS_ONLY", 1);
            f119361OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("BOTH", 2);
            f119364OooOoO0 = oooO00o3;
            f119363OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f119363OooOoO.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OOOo.OooOO0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f119365OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f119366OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f119367OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f119368OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("OVERRIDABLE", 0);
            f119366OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("CONFLICT", 1);
            OooO0O0 oooO0O03 = new OooO0O0("INCOMPATIBLE", 2);
            f119365OooOo = oooO0O03;
            OooO0O0 oooO0O04 = new OooO0O0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
            f119368OooOoO0 = oooO0O04;
            f119367OooOoO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f119367OooOoO.clone();
        }
    }

    OooO0O0 OooO00o(oO0O0OO.OooO00o oooO00o, oO0O0OO.OooO00o oooO00o2, InterfaceC32596OooO0o0 interfaceC32596OooO0o0);

    OooO00o OooO0O0();
}
