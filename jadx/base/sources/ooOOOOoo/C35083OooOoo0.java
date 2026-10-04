package ooOOOOoo;

/* JADX INFO: renamed from: ooOOOOoo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35083OooOoo0 {

    /* JADX INFO: renamed from: ooOOOOoo.OooOoo0$OooO00o */
    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f126012OooO00o;

        static {
            int[] iArr = new int[OooO0O0.values().length];
            f126012OooO00o = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126012OooO00o[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126012OooO00o[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ooOOOOoo.OooOoo0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f126013OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f126014OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f126015OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("APP_INTENT", 0);
            f126014OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("FILE", 1);
            OooO0O0 oooO0O03 = new OooO0O0("BROWSER", 2);
            f126013OooOo = oooO0O03;
            f126015OooOoO0 = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f126015OooOoO0.clone();
        }
    }

    public static int OooO00o(OooO0O0 oooO0O0) {
        int i = OooO00o.f126012OooO00o[oooO0O0.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? -1 : 2;
        }
        return 1;
    }
}
