package o0000oO0;

import androidx.datastore.preferences.protobuf.C21837Oooooo0;
import androidx.datastore.preferences.protobuf.InterfaceC21824OoooO0O;
import androidx.datastore.preferences.protobuf.InterfaceC21831Ooooo00;
import androidx.datastore.preferences.protobuf.OooO;
import androidx.datastore.preferences.protobuf.OooOo;

/* JADX INFO: renamed from: o0000oO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24328OooO0o extends OooOo<C24328OooO0o, OooO00o> implements InterfaceC21824OoooO0O {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C24328OooO0o DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC21831Ooooo00<C24328OooO0o> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: renamed from: o0000oO0.OooO0o$OooO00o */
    public static final class OooO00o extends OooOo.OooO00o<C24328OooO0o, OooO00o> implements InterfaceC21824OoooO0O {
        public OooO00o() {
            super(C24328OooO0o.DEFAULT_INSTANCE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0000oO0.OooO0o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f81897OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f81898OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0O0 f81899OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f81900OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0O0 f81901OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO0O0 f81902OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO0O0 f81903OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO0O0 f81904OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO0O0 f81905OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f81906Oooo000;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("BOOLEAN", 0);
            f81898OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("FLOAT", 1);
            f81897OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("INTEGER", 2);
            f81900OooOoO0 = oooO0O03;
            OooO0O0 oooO0O04 = new OooO0O0("LONG", 3);
            f81899OooOoO = oooO0O04;
            OooO0O0 oooO0O05 = new OooO0O0("STRING", 4);
            f81901OooOoOO = oooO0O05;
            OooO0O0 oooO0O06 = new OooO0O0("STRING_SET", 5);
            f81903OooOoo0 = oooO0O06;
            OooO0O0 oooO0O07 = new OooO0O0("DOUBLE", 6);
            f81902OooOoo = oooO0O07;
            OooO0O0 oooO0O08 = new OooO0O0("BYTES", 7);
            f81904OooOooO = oooO0O08;
            OooO0O0 oooO0O09 = new OooO0O0("VALUE_NOT_SET", 8);
            f81905OooOooo = oooO0O09;
            f81906Oooo000 = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04, oooO0O05, oooO0O06, oooO0O07, oooO0O08, oooO0O09};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f81906Oooo000.clone();
        }
    }

    static {
        C24328OooO0o c24328OooO0o = new C24328OooO0o();
        DEFAULT_INSTANCE = c24328OooO0o;
        OooOo.OooOOO0(C24328OooO0o.class, c24328OooO0o);
    }

    public static void OooOOO(C24328OooO0o c24328OooO0o, long j) {
        c24328OooO0o.valueCase_ = 4;
        c24328OooO0o.value_ = Long.valueOf(j);
    }

    public static void OooOOOO(C24328OooO0o c24328OooO0o, String str) {
        c24328OooO0o.getClass();
        str.getClass();
        c24328OooO0o.valueCase_ = 5;
        c24328OooO0o.value_ = str;
    }

    public static void OooOOOo(C24328OooO0o c24328OooO0o, C24329OooO0o0 c24329OooO0o0) {
        c24328OooO0o.getClass();
        c24328OooO0o.value_ = c24329OooO0o0;
        c24328OooO0o.valueCase_ = 6;
    }

    public static void OooOOo(C24328OooO0o c24328OooO0o, OooO.OooO0o oooO0o) {
        c24328OooO0o.getClass();
        c24328OooO0o.valueCase_ = 8;
        c24328OooO0o.value_ = oooO0o;
    }

    public static void OooOOo0(C24328OooO0o c24328OooO0o, double d) {
        c24328OooO0o.valueCase_ = 7;
        c24328OooO0o.value_ = Double.valueOf(d);
    }

    public static void OooOo0(C24328OooO0o c24328OooO0o, float f) {
        c24328OooO0o.valueCase_ = 2;
        c24328OooO0o.value_ = Float.valueOf(f);
    }

    public static void OooOo00(C24328OooO0o c24328OooO0o, boolean z) {
        c24328OooO0o.valueCase_ = 1;
        c24328OooO0o.value_ = Boolean.valueOf(z);
    }

    public static void OooOo0O(C24328OooO0o c24328OooO0o, int i) {
        c24328OooO0o.valueCase_ = 3;
        c24328OooO0o.value_ = Integer.valueOf(i);
    }

    public static C24328OooO0o OooOoO0() {
        return DEFAULT_INSTANCE;
    }

    public static OooO00o Oooo00O() {
        return (OooO00o) ((OooOo.OooO00o) DEFAULT_INSTANCE.OooO0o(OooOo.OooO0o.f64467OooOoOO));
    }

    @Override // androidx.datastore.preferences.protobuf.OooOo
    public final Object OooO0o(OooOo.OooO0o oooO0o) {
        InterfaceC21831Ooooo00 oooO0O0;
        switch (oooO0o.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C21837Oooooo0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C24329OooO0o0.class});
            case 3:
                return new C24328OooO0o();
            case 4:
                return new OooO00o();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC21831Ooooo00<C24328OooO0o> interfaceC21831Ooooo00 = PARSER;
                if (interfaceC21831Ooooo00 != null) {
                    return interfaceC21831Ooooo00;
                }
                synchronized (C24328OooO0o.class) {
                    try {
                        oooO0O0 = PARSER;
                        if (oooO0O0 == null) {
                            oooO0O0 = new OooOo.OooO0O0();
                            PARSER = oooO0O0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return oooO0O0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final androidx.datastore.preferences.protobuf.OooO OooOo() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.OooO) this.value_ : androidx.datastore.preferences.protobuf.OooO.f64403OooOo;
    }

    public final boolean OooOo0o() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double OooOoO() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float OooOoOO() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final long OooOoo() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final int OooOoo0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final String OooOooO() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final C24329OooO0o0 OooOooo() {
        return this.valueCase_ == 6 ? (C24329OooO0o0) this.value_ : C24329OooO0o0.OooOOOo();
    }

    public final OooO0O0 Oooo000() {
        switch (this.valueCase_) {
            case 0:
                return OooO0O0.f81905OooOooo;
            case 1:
                return OooO0O0.f81898OooOo0o;
            case 2:
                return OooO0O0.f81897OooOo;
            case 3:
                return OooO0O0.f81900OooOoO0;
            case 4:
                return OooO0O0.f81899OooOoO;
            case 5:
                return OooO0O0.f81901OooOoOO;
            case 6:
                return OooO0O0.f81903OooOoo0;
            case 7:
                return OooO0O0.f81902OooOoo;
            case 8:
                return OooO0O0.f81904OooOooO;
            default:
                return null;
        }
    }
}
