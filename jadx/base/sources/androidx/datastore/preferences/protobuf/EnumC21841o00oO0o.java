package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class EnumC21841o00oO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO0O0 f64576OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f64577OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO0OO f64578OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ EnumC21841o00oO0o[] f64579OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f64580OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00oO0O f64581OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21841o00oO0o EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21841o00oO0o EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21841o00oO0o EF12;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00oO0o$OooO00o */
    public enum OooO00o extends EnumC21841o00oO0o {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00oO0o$OooO0O0 */
    public enum OooO0O0 extends EnumC21841o00oO0o {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00oO0o$OooO0OO */
    public enum OooO0OO extends EnumC21841o00oO0o {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00oO0o$OooO0Oo, reason: case insensitive filesystem */
    public enum C21842OooO0Oo extends EnumC21841o00oO0o {
    }

    static {
        EnumC21841o00oO0o enumC21841o00oO0o = new EnumC21841o00oO0o("DOUBLE", 0, o00oO0O.DOUBLE, 1);
        EnumC21841o00oO0o enumC21841o00oO0o2 = new EnumC21841o00oO0o("FLOAT", 1, o00oO0O.FLOAT, 5);
        o00oO0O o00oo0o = o00oO0O.LONG;
        EnumC21841o00oO0o enumC21841o00oO0o3 = new EnumC21841o00oO0o("INT64", 2, o00oo0o, 0);
        EnumC21841o00oO0o enumC21841o00oO0o4 = new EnumC21841o00oO0o("UINT64", 3, o00oo0o, 0);
        o00oO0O o00oo0o2 = o00oO0O.INT;
        EnumC21841o00oO0o enumC21841o00oO0o5 = new EnumC21841o00oO0o("INT32", 4, o00oo0o2, 0);
        EnumC21841o00oO0o enumC21841o00oO0o6 = new EnumC21841o00oO0o("FIXED64", 5, o00oo0o, 1);
        EnumC21841o00oO0o enumC21841o00oO0o7 = new EnumC21841o00oO0o("FIXED32", 6, o00oo0o2, 5);
        EnumC21841o00oO0o enumC21841o00oO0o8 = new EnumC21841o00oO0o("BOOL", 7, o00oO0O.BOOLEAN, 0);
        OooO00o oooO00o = new OooO00o("STRING", 8, o00oO0O.STRING, 2);
        f64577OooOoO0 = oooO00o;
        o00oO0O o00oo0o3 = o00oO0O.MESSAGE;
        OooO0O0 oooO0O0 = new OooO0O0("GROUP", 9, o00oo0o3, 3);
        f64576OooOoO = oooO0O0;
        OooO0OO oooO0OO = new OooO0OO("MESSAGE", 10, o00oo0o3, 2);
        f64578OooOoOO = oooO0OO;
        f64579OooOoo0 = new EnumC21841o00oO0o[]{enumC21841o00oO0o, enumC21841o00oO0o2, enumC21841o00oO0o3, enumC21841o00oO0o4, enumC21841o00oO0o5, enumC21841o00oO0o6, enumC21841o00oO0o7, enumC21841o00oO0o8, oooO00o, oooO0O0, oooO0OO, new C21842OooO0Oo("BYTES", 11, o00oO0O.BYTE_STRING, 2), new EnumC21841o00oO0o("UINT32", 12, o00oo0o2, 0), new EnumC21841o00oO0o("ENUM", 13, o00oO0O.ENUM, 0), new EnumC21841o00oO0o("SFIXED32", 14, o00oo0o2, 5), new EnumC21841o00oO0o("SFIXED64", 15, o00oo0o, 1), new EnumC21841o00oO0o("SINT32", 16, o00oo0o2, 0), new EnumC21841o00oO0o("SINT64", 17, o00oo0o, 0)};
    }

    public EnumC21841o00oO0o(String str, int i, o00oO0O o00oo0o, int i2) {
        this.f64581OooOo0o = o00oo0o;
        this.f64580OooOo = i2;
    }

    public static EnumC21841o00oO0o valueOf(String str) {
        return (EnumC21841o00oO0o) Enum.valueOf(EnumC21841o00oO0o.class, str);
    }

    public static EnumC21841o00oO0o[] values() {
        return (EnumC21841o00oO0o[]) f64579OooOoo0.clone();
    }
}
