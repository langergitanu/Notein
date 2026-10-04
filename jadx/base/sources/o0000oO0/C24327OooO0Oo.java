package o0000oO0;

import androidx.datastore.preferences.protobuf.C21796OooOOOo;
import androidx.datastore.preferences.protobuf.C21807OooOoOO;
import androidx.datastore.preferences.protobuf.C21816Oooo0OO;
import androidx.datastore.preferences.protobuf.C21818Oooo0o0;
import androidx.datastore.preferences.protobuf.C21834OooooOO;
import androidx.datastore.preferences.protobuf.C21837Oooooo0;
import androidx.datastore.preferences.protobuf.EnumC21841o00oO0o;
import androidx.datastore.preferences.protobuf.InterfaceC21824OoooO0O;
import androidx.datastore.preferences.protobuf.InterfaceC21831Ooooo00;
import androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo;
import androidx.datastore.preferences.protobuf.OooOO0;
import androidx.datastore.preferences.protobuf.OooOO0O;
import androidx.datastore.preferences.protobuf.OooOo;
import androidx.datastore.preferences.protobuf.o00O0O;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: o0000oO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24327OooO0Oo extends OooOo<C24327OooO0Oo, OooO00o> implements InterfaceC21824OoooO0O {
    private static final C24327OooO0Oo DEFAULT_INSTANCE;
    private static volatile InterfaceC21831Ooooo00<C24327OooO0Oo> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C21818Oooo0o0<String, C24328OooO0o> preferences_ = C21818Oooo0o0.f64514OooOo;

    /* JADX INFO: renamed from: o0000oO0.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOo.OooO00o<C24327OooO0Oo, OooO00o> implements InterfaceC21824OoooO0O {
        public OooO00o() {
            super(C24327OooO0Oo.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o0000oO0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C21816Oooo0OO<String, C24328OooO0o> f81896OooO00o = new C21816Oooo0OO<>(EnumC21841o00oO0o.f64577OooOoO0, EnumC21841o00oO0o.f64578OooOoOO, C24328OooO0o.OooOoO0());
    }

    static {
        C24327OooO0Oo c24327OooO0Oo = new C24327OooO0Oo();
        DEFAULT_INSTANCE = c24327OooO0Oo;
        OooOo.OooOOO0(C24327OooO0Oo.class, c24327OooO0Oo);
    }

    public static C21818Oooo0o0 OooOOOO(C24327OooO0Oo c24327OooO0Oo) {
        C21818Oooo0o0<String, C24328OooO0o> c21818Oooo0o0 = c24327OooO0Oo.preferences_;
        if (!c21818Oooo0o0.f64515OooOo0o) {
            c24327OooO0Oo.preferences_ = c21818Oooo0o0.OooO0Oo();
        }
        return c24327OooO0Oo.preferences_;
    }

    public static C24327OooO0Oo OooOOo(FileInputStream fileInputStream) throws IOException {
        C24327OooO0Oo c24327OooO0Oo = DEFAULT_INSTANCE;
        OooOO0.OooO0O0 oooO0O0 = new OooOO0.OooO0O0(fileInputStream);
        C21796OooOOOo c21796OooOOOoOooO00o = C21796OooOOOo.OooO00o();
        C24327OooO0Oo c24327OooO0OoOooOO0o = c24327OooO0Oo.OooOO0o();
        try {
            C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
            c21834OooooOO.getClass();
            InterfaceC21836Oooooo interfaceC21836OoooooOooO00o = c21834OooooOO.OooO00o(c24327OooO0OoOooOO0o.getClass());
            OooOO0O oooOO0O = oooO0O0.f64420OooO0Oo;
            if (oooOO0O == null) {
                oooOO0O = new OooOO0O(oooO0O0);
            }
            interfaceC21836OoooooOooO00o.OooO0O0(c24327OooO0OoOooOO0o, oooOO0O, c21796OooOOOoOooO00o);
            interfaceC21836OoooooOooO00o.makeImmutable(c24327OooO0OoOooOO0o);
            if (OooOo.OooO(c24327OooO0OoOooOO0o, true)) {
                return c24327OooO0OoOooOO0o;
            }
            throw new C21807OooOoOO(new o00O0O().getMessage());
        } catch (C21807OooOoOO e) {
            if (e.f64486OooOo0o) {
                throw new C21807OooOoOO(e.getMessage(), e);
            }
            throw e;
        } catch (o00O0O e2) {
            throw new C21807OooOoOO(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof C21807OooOoOO) {
                throw ((C21807OooOoOO) e3.getCause());
            }
            throw new C21807OooOoOO(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C21807OooOoOO) {
                throw ((C21807OooOoOO) e4.getCause());
            }
            throw e4;
        }
    }

    public static OooO00o OooOOo0() {
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
                return new C21837Oooooo0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", OooO0O0.f81896OooO00o});
            case 3:
                return new C24327OooO0Oo();
            case 4:
                return new OooO00o();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC21831Ooooo00<C24327OooO0Oo> interfaceC21831Ooooo00 = PARSER;
                if (interfaceC21831Ooooo00 != null) {
                    return interfaceC21831Ooooo00;
                }
                synchronized (C24327OooO0Oo.class) {
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

    public final Map<String, C24328OooO0o> OooOOOo() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
