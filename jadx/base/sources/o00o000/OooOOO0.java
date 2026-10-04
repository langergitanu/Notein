package o00o000;

import o00Ooo0o.C25119OooO0oo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25218OooO0o0 f85890OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f85891OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25217OooO0Oo f85892OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o f85893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C25119OooO0oo<OooOOO0> f85894OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C25217OooO0Oo f85895OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f85896OooO0oO;

    public static class OooO00o extends OooOOO0 {
        @Override // o00o000.OooOOO0
        public final EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4) {
            return EnumC25219OooO0oO.f85897OooOo;
        }

        @Override // o00o000.OooOOO0
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class OooO0O0 extends OooOOO0 {
        @Override // o00o000.OooOOO0
        public final EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4) {
            return EnumC25219OooO0oO.f85898OooOo0o;
        }

        @Override // o00o000.OooOOO0
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    public static class OooO0OO extends OooOOO0 {
        @Override // o00o000.OooOOO0
        public final EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4) {
            return OooO0O0(i, i2, i3, i4) == 1.0f ? EnumC25219OooO0oO.f85897OooOo : OooOOO0.f85890OooO00o.OooO00o(i, i2, i3, i4);
        }

        @Override // o00o000.OooOOO0
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, OooOOO0.f85890OooO00o.OooO0O0(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOOO0$OooO0Oo, reason: case insensitive filesystem */
    public static class C25217OooO0Oo extends OooOOO0 {
        @Override // o00o000.OooOOO0
        public final EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4) {
            return EnumC25219OooO0oO.f85897OooOo;
        }

        @Override // o00o000.OooOOO0
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class OooO0o extends OooOOO0 {
        @Override // o00o000.OooOOO0
        public final EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4) {
            return EnumC25219OooO0oO.f85897OooOo;
        }

        @Override // o00o000.OooOOO0
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOOO0$OooO0o0, reason: case insensitive filesystem */
    public static class C25218OooO0o0 extends OooOOO0 {
        @Override // o00o000.OooOOO0
        public final EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4) {
            return OooOOO0.f85896OooO0oO ? EnumC25219OooO0oO.f85897OooOo : EnumC25219OooO0oO.f85898OooOo0o;
        }

        @Override // o00o000.OooOOO0
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            if (OooOOO0.f85896OooO0oO) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o000.OooOOO0$OooO0oO, reason: case insensitive filesystem */
    public static final class EnumC25219OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC25219OooO0oO f85897OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC25219OooO0oO f85898OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ EnumC25219OooO0oO[] f85899OooOoO0;

        static {
            EnumC25219OooO0oO enumC25219OooO0oO = new EnumC25219OooO0oO("MEMORY", 0);
            f85898OooOo0o = enumC25219OooO0oO;
            EnumC25219OooO0oO enumC25219OooO0oO2 = new EnumC25219OooO0oO("QUALITY", 1);
            f85897OooOo = enumC25219OooO0oO2;
            f85899OooOoO0 = new EnumC25219OooO0oO[]{enumC25219OooO0oO, enumC25219OooO0oO2};
        }

        public EnumC25219OooO0oO() {
            throw null;
        }

        public static EnumC25219OooO0oO valueOf(String str) {
            return (EnumC25219OooO0oO) Enum.valueOf(EnumC25219OooO0oO.class, str);
        }

        public static EnumC25219OooO0oO[] values() {
            return (EnumC25219OooO0oO[]) f85899OooOoO0.clone();
        }
    }

    static {
        new OooO00o();
        new OooO0O0();
        f85890OooO00o = new C25218OooO0o0();
        f85891OooO0O0 = new OooO0OO();
        C25217OooO0Oo c25217OooO0Oo = new C25217OooO0Oo();
        f85892OooO0OO = c25217OooO0Oo;
        f85893OooO0Oo = new OooO0o();
        f85895OooO0o0 = c25217OooO0Oo;
        f85894OooO0o = C25119OooO0oo.OooO00o(c25217OooO0Oo, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f85896OooO0oO = true;
    }

    public abstract EnumC25219OooO0oO OooO00o(int i, int i2, int i3, int i4);

    public abstract float OooO0O0(int i, int i2, int i3, int i4);
}
