package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21979OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<Object> f65535OooO00o = new AtomicReference<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.OooOOo0$OooO00o */
    public static final class OooO00o {
        private static final /* synthetic */ OooO00o[] $VALUES;
        public static final C19028OooO00o Companion;
        public static final OooO00o ON_ANY;
        public static final OooO00o ON_CREATE;
        public static final OooO00o ON_DESTROY;
        public static final OooO00o ON_PAUSE;
        public static final OooO00o ON_RESUME;
        public static final OooO00o ON_START;
        public static final OooO00o ON_STOP;

        /* JADX INFO: renamed from: androidx.lifecycle.OooOOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19028OooO00o {
            public static OooO00o OooO00o(OooO0O0 state) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return OooO00o.ON_DESTROY;
                }
                if (iOrdinal == 3) {
                    return OooO00o.ON_STOP;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return OooO00o.ON_PAUSE;
            }

            public static OooO00o OooO0O0(OooO0O0 state) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return OooO00o.ON_CREATE;
                }
                if (iOrdinal == 3) {
                    return OooO00o.ON_START;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return OooO00o.ON_RESUME;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.OooOOo0$OooO00o$OooO0O0 */
        public /* synthetic */ class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ int[] f65536OooO00o;

            static {
                int[] iArr = new int[OooO00o.values().length];
                try {
                    iArr[OooO00o.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OooO00o.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OooO00o.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OooO00o.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OooO00o.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OooO00o.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OooO00o.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f65536OooO00o = iArr;
            }
        }

        static {
            OooO00o oooO00o = new OooO00o("ON_CREATE", 0);
            ON_CREATE = oooO00o;
            OooO00o oooO00o2 = new OooO00o("ON_START", 1);
            ON_START = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("ON_RESUME", 2);
            ON_RESUME = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("ON_PAUSE", 3);
            ON_PAUSE = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("ON_STOP", 4);
            ON_STOP = oooO00o5;
            OooO00o oooO00o6 = new OooO00o("ON_DESTROY", 5);
            ON_DESTROY = oooO00o6;
            OooO00o oooO00o7 = new OooO00o("ON_ANY", 6);
            ON_ANY = oooO00o7;
            $VALUES = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7};
            Companion = new C19028OooO00o();
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) $VALUES.clone();
        }

        public final OooO0O0 OooO00o() {
            switch (OooO0O0.f65536OooO00o[ordinal()]) {
                case 1:
                case 2:
                    return OooO0O0.f65540OooOoO0;
                case 3:
                case 4:
                    return OooO0O0.f65539OooOoO;
                case 5:
                    return OooO0O0.f65541OooOoOO;
                case 6:
                    return OooO0O0.f65538OooOo0o;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.OooOOo0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f65537OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f65538OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0O0 f65539OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f65540OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0O0 f65541OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f65542OooOoo0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("DESTROYED", 0);
            f65538OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("INITIALIZED", 1);
            f65537OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("CREATED", 2);
            f65540OooOoO0 = oooO0O03;
            OooO0O0 oooO0O04 = new OooO0O0("STARTED", 3);
            f65539OooOoO = oooO0O04;
            OooO0O0 oooO0O05 = new OooO0O0("RESUMED", 4);
            f65541OooOoOO = oooO0O05;
            f65542OooOoo0 = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04, oooO0O05};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f65542OooOoo0.clone();
        }

        public final boolean OooO00o(OooO0O0 oooO0O0) {
            return compareTo(oooO0O0) >= 0;
        }
    }

    public abstract void OooO00o(InterfaceC21988OooOoo0 interfaceC21988OooOoo0);

    public abstract OooO0O0 OooO0O0();

    public abstract void OooO0OO(InterfaceC21988OooOoo0 interfaceC21988OooOoo0);
}
