package oO00Oo;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oO00Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32254OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f115846OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<OooO00o> f115847OooO00o = new AtomicReference<>(OooO00o.f115858OooOo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f115848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f115849OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f115850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f115851OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f115852OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f115853OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f115854OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f115855OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Integer f115856OooOO0O;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO00Oo.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f115857OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115858OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f115859OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f115860OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f115861OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("HEADER0", 0);
            f115858OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("LENGTH", 1);
            f115857OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("MASK_KEY", 2);
            f115860OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("BODY", 3);
            f115859OooOoO = oooO00o4;
            f115861OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f115861OooOoOO.clone();
        }
    }

    public final EnumC32257OooO0o0 OooO00o() {
        int i = EnumC32257OooO0o0.f115865OooOoO0;
        int i2 = this.f115853OooO0oO;
        EnumC32257OooO0o0 enumC32257OooO0o0 = (i2 < 0 || i2 > EnumC32257OooO0o0.f115865OooOoO0) ? null : EnumC32257OooO0o0.f115864OooOoO[i2];
        if (enumC32257OooO0o0 != null) {
            return enumC32257OooO0o0;
        }
        throw new IllegalStateException(androidx.core.graphics.OooO0O0.OooO00o(this.f115853OooO0oO, new StringBuilder("Unsupported opcode ")));
    }
}
