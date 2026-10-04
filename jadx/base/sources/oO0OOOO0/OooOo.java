package oO0OOOO0;

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
/* JADX INFO: loaded from: classes10.dex */
public class OooOo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooOo f119119OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooOo f119120OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO0O0 f119121OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooOo f119122OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO0OO f119123OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ OooOo[] f119124OooOooO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f119125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final EnumC32967OooOoO0 f119126OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    OooOo EF10;

    /* JADX INFO: Fake field, exist only in values array */
    OooOo EF11;

    /* JADX INFO: Fake field, exist only in values array */
    OooOo EF12;

    public enum OooO00o extends OooOo {
    }

    public enum OooO0O0 extends OooOo {
        @Override // oO0OOOO0.OooOo
        public final boolean OooO00o() {
            return false;
        }
    }

    public enum OooO0OO extends OooOo {
        @Override // oO0OOOO0.OooOo
        public final boolean OooO00o() {
            return false;
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOo$OooO0Oo, reason: case insensitive filesystem */
    public enum C32962OooO0Oo extends OooOo {
        @Override // oO0OOOO0.OooOo
        public final boolean OooO00o() {
            return false;
        }
    }

    static {
        OooOo oooOo = new OooOo("DOUBLE", 0, EnumC32967OooOoO0.DOUBLE, 1);
        OooOo oooOo2 = new OooOo("FLOAT", 1, EnumC32967OooOoO0.FLOAT, 5);
        EnumC32967OooOoO0 enumC32967OooOoO0 = EnumC32967OooOoO0.LONG;
        OooOo oooOo3 = new OooOo("INT64", 2, enumC32967OooOoO0, 0);
        OooOo oooOo4 = new OooOo("UINT64", 3, enumC32967OooOoO0, 0);
        EnumC32967OooOoO0 enumC32967OooOoO02 = EnumC32967OooOoO0.INT;
        OooOo oooOo5 = new OooOo("INT32", 4, enumC32967OooOoO02, 0);
        f119120OooOoO0 = oooOo5;
        OooOo oooOo6 = new OooOo("FIXED64", 5, enumC32967OooOoO0, 1);
        OooOo oooOo7 = new OooOo("FIXED32", 6, enumC32967OooOoO02, 5);
        OooOo oooOo8 = new OooOo("BOOL", 7, EnumC32967OooOoO0.BOOLEAN, 0);
        f119119OooOoO = oooOo8;
        OooO00o oooO00o = new OooO00o("STRING", 8, EnumC32967OooOoO0.STRING, 2);
        EnumC32967OooOoO0 enumC32967OooOoO03 = EnumC32967OooOoO0.MESSAGE;
        OooO0O0 oooO0O0 = new OooO0O0("GROUP", 9, enumC32967OooOoO03, 3);
        f119121OooOoOO = oooO0O0;
        OooO0OO oooO0OO = new OooO0OO("MESSAGE", 10, enumC32967OooOoO03, 2);
        f119123OooOoo0 = oooO0OO;
        C32962OooO0Oo c32962OooO0Oo = new C32962OooO0Oo("BYTES", 11, EnumC32967OooOoO0.BYTE_STRING, 2);
        OooOo oooOo9 = new OooOo("UINT32", 12, enumC32967OooOoO02, 0);
        OooOo oooOo10 = new OooOo("ENUM", 13, EnumC32967OooOoO0.ENUM, 0);
        f119122OooOoo = oooOo10;
        f119124OooOooO = new OooOo[]{oooOo, oooOo2, oooOo3, oooOo4, oooOo5, oooOo6, oooOo7, oooOo8, oooO00o, oooO0O0, oooO0OO, c32962OooO0Oo, oooOo9, oooOo10, new OooOo("SFIXED32", 14, enumC32967OooOoO02, 5), new OooOo("SFIXED64", 15, enumC32967OooOoO0, 1), new OooOo("SINT32", 16, enumC32967OooOoO02, 0), new OooOo("SINT64", 17, enumC32967OooOoO0, 0)};
    }

    public OooOo(String str, int i, EnumC32967OooOoO0 enumC32967OooOoO0, int i2) {
        this.f119126OooOo0o = enumC32967OooOoO0;
        this.f119125OooOo = i2;
    }

    public static OooOo valueOf(String str) {
        return (OooOo) Enum.valueOf(OooOo.class, str);
    }

    public static OooOo[] values() {
        return (OooOo[]) f119124OooOooO.clone();
    }

    public boolean OooO00o() {
        return !(this instanceof OooO00o);
    }
}
