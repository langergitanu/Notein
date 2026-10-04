package o00O0oOO;

/* JADX INFO: renamed from: o00O0oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24943OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f84631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f84632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f84633OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EnumC19660OooO00o f84634OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f84635OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f84636OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f84637OooO0oO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0oOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class EnumC19660OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ EnumC19660OooO00o[] f84638OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC19660OooO00o f84639OooOo0o;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC19660OooO00o EF0;

        static {
            EnumC19660OooO00o enumC19660OooO00o = new EnumC19660OooO00o("LEFT_ALIGN", 0);
            EnumC19660OooO00o enumC19660OooO00o2 = new EnumC19660OooO00o("RIGHT_ALIGN", 1);
            EnumC19660OooO00o enumC19660OooO00o3 = new EnumC19660OooO00o("CENTER", 2);
            f84639OooOo0o = enumC19660OooO00o3;
            f84638OooOo = new EnumC19660OooO00o[]{enumC19660OooO00o, enumC19660OooO00o2, enumC19660OooO00o3};
        }

        public EnumC19660OooO00o() {
            throw null;
        }

        public static EnumC19660OooO00o valueOf(String str) {
            return (EnumC19660OooO00o) Enum.valueOf(EnumC19660OooO00o.class, str);
        }

        public static EnumC19660OooO00o[] values() {
            return (EnumC19660OooO00o[]) f84638OooOo.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.f84634OooO0Oo.ordinal() + (((int) (com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f84631OooO00o.hashCode() * 31, 31, this.f84632OooO0O0) + this.f84633OooO0OO)) * 31)) * 31) + this.f84636OooO0o0;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f84635OooO0o);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f84637OooO0oO;
    }
}
