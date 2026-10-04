package o00O0oo0;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: renamed from: o00O0oo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24974OooOOOo implements InterfaceC24962OooO0O0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0oo0.OooOOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f84695OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f84696OooOo0o;

        static {
            OooO00o oooO00o = new OooO00o("BUTT", 0);
            f84696OooOo0o = oooO00o;
            f84695OooOo = new OooO00o[]{oooO00o, new OooO00o("ROUND", 1), new OooO00o(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2)};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f84695OooOo.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0oo0.OooOOOo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f84697OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f84698OooOo0o;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("MITER", 0);
            f84698OooOo0o = oooO0O0;
            f84697OooOo = new OooO0O0[]{oooO0O0, new OooO0O0("ROUND", 1), new OooO0O0("BEVEL", 2)};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f84697OooOo.clone();
        }
    }
}
