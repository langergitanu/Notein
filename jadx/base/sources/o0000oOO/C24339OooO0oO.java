package o0000oOO;

import androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o;
import androidx.datastore.preferences.protobuf.C21805OooOoO;
import androidx.datastore.preferences.protobuf.C21807OooOoOO;
import androidx.datastore.preferences.protobuf.OooO;
import com.aspose.slides.C22206OooOOo0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24249OooO0OO;
import o0000o0O.o00O0O;
import o0000o0O.o0Oo0oo;
import o0000oO0.C24327OooO0Oo;
import o0000oO0.C24328OooO0o;
import o0000oO0.C24329OooO0o0;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0000oOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24339OooO0oO implements o00O0O<AbstractC24338OooO0o0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24339OooO0oO f81923OooO00o = new C24339OooO0oO();

    /* JADX INFO: renamed from: o0000oOO.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f81924OooO00o;

        static {
            int[] iArr = new int[C24328OooO0o.OooO0O0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f81924OooO00o = iArr;
        }
    }

    @Override // o0000o0O.o00O0O
    public final AbstractC24338OooO0o0 getDefaultValue() {
        return C24337OooO0o.OooO00o();
    }

    @Override // o0000o0O.o00O0O
    public final Object readFrom(InputStream inputStream, Continuation<? super AbstractC24338OooO0o0> continuation) throws IOException {
        byte[] bArr;
        try {
            C24327OooO0Oo c24327OooO0OoOooOOo = C24327OooO0Oo.OooOOo((FileInputStream) inputStream);
            C24334OooO0O0 c24334OooO0O0 = new C24334OooO0O0(false, 1);
            AbstractC24338OooO0o0.OooO0O0[] pairs = (AbstractC24338OooO0o0.OooO0O0[]) Arrays.copyOf(new AbstractC24338OooO0o0.OooO0O0[0], 0);
            OooOOO0.OooO0oO(pairs, "pairs");
            c24334OooO0O0.OooO0o0();
            if (pairs.length > 0) {
                pairs[0].getClass();
                c24334OooO0O0.OooO0oo(null, null);
                throw null;
            }
            Map<String, C24328OooO0o> mapOooOOOo = c24327OooO0OoOooOOo.OooOOOo();
            OooOOO0.OooO0o(mapOooOOOo, "preferencesProto.preferencesMap");
            for (Map.Entry<String, C24328OooO0o> entry : mapOooOOOo.entrySet()) {
                String name = entry.getKey();
                C24328OooO0o value = entry.getValue();
                OooOOO0.OooO0o(name, "name");
                OooOOO0.OooO0o(value, "value");
                C24328OooO0o.OooO0O0 oooO0O0Oooo000 = value.Oooo000();
                switch (oooO0O0Oooo000 == null ? -1 : OooO00o.f81924OooO00o[oooO0O0Oooo000.ordinal()]) {
                    case -1:
                        throw new C24249OooO0OO("Value case is null.", null);
                    case 0:
                    default:
                        throw new C32442OooOO0o();
                    case 1:
                        c24334OooO0O0.OooO0oo(C24340OooO0oo.OooO00o(name), Boolean.valueOf(value.OooOo0o()));
                        break;
                    case 2:
                        c24334OooO0O0.OooO0oo(C24340OooO0oo.OooO0O0(name), Float.valueOf(value.OooOoOO()));
                        break;
                    case 3:
                        c24334OooO0O0.OooO0oo(new AbstractC24338OooO0o0.OooO00o<>(name), Double.valueOf(value.OooOoO()));
                        break;
                    case 4:
                        c24334OooO0O0.OooO0oo(C24340OooO0oo.OooO0OO(name), Integer.valueOf(value.OooOoo0()));
                        break;
                    case 5:
                        c24334OooO0O0.OooO0oo(C24340OooO0oo.OooO0Oo(name), Long.valueOf(value.OooOoo()));
                        break;
                    case 6:
                        AbstractC24338OooO0o0.OooO00o<String> oooO00oOooO0o0 = C24340OooO0oo.OooO0o0(name);
                        String strOooOooO = value.OooOooO();
                        OooOOO0.OooO0o(strOooOooO, "value.string");
                        c24334OooO0O0.OooO0oo(oooO00oOooO0o0, strOooOooO);
                        break;
                    case 7:
                        AbstractC24338OooO0o0.OooO00o<Set<String>> oooO00oOooO0o = C24340OooO0oo.OooO0o(name);
                        C21805OooOoO.OooO0OO oooO0OOOooOOo0 = value.OooOooo().OooOOo0();
                        OooOOO0.OooO0o(oooO0OOOooOOo0, "value.stringSet.stringsList");
                        c24334OooO0O0.OooO0oo(oooO00oOooO0o, OooOo.o0OO00O(oooO0OOOooOOo0));
                        break;
                    case 8:
                        AbstractC24338OooO0o0.OooO00o<?> oooO00o = new AbstractC24338OooO0o0.OooO00o<>(name);
                        androidx.datastore.preferences.protobuf.OooO oooOOooOo = value.OooOo();
                        int size = oooOOooOo.size();
                        if (size == 0) {
                            bArr = C21805OooOoO.f64483OooO0O0;
                        } else {
                            byte[] bArr2 = new byte[size];
                            oooOOooOo.OooO0o0(size, bArr2);
                            bArr = bArr2;
                        }
                        OooOOO0.OooO0o(bArr, "value.bytes.toByteArray()");
                        c24334OooO0O0.OooO0oo(oooO00o, bArr);
                        break;
                    case 9:
                        throw new C24249OooO0OO("Value not set.", null);
                }
            }
            return new C24334OooO0O0(C34444Oooo0O0.OooOOOO(c24334OooO0O0.OooO00o()), true);
        } catch (C21807OooOoOO e) {
            throw new C24249OooO0OO("Unable to parse preferences proto.", e);
        }
    }

    @Override // o0000o0O.o00O0O
    public final Object writeTo(AbstractC24338OooO0o0 abstractC24338OooO0o0, OutputStream outputStream, Continuation continuation) throws IOException {
        C24328OooO0o c24328OooO0oOooO0OO;
        Map<AbstractC24338OooO0o0.OooO00o<?>, Object> mapOooO00o = abstractC24338OooO0o0.OooO00o();
        C24327OooO0Oo.OooO00o oooO00oOooOOo0 = C24327OooO0Oo.OooOOo0();
        for (Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry : mapOooO00o.entrySet()) {
            AbstractC24338OooO0o0.OooO00o<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f81922OooO00o;
            if (value instanceof Boolean) {
                C24328OooO0o.OooO00o Oooo00O2 = C24328OooO0o.Oooo00O();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                Oooo00O2.OooO0o0();
                C24328OooO0o.OooOo00((C24328OooO0o) Oooo00O2.f64461OooOo, zBooleanValue);
                c24328OooO0oOooO0OO = Oooo00O2.OooO0OO();
            } else if (value instanceof Float) {
                C24328OooO0o.OooO00o Oooo00O3 = C24328OooO0o.Oooo00O();
                float fFloatValue = ((Number) value).floatValue();
                Oooo00O3.OooO0o0();
                C24328OooO0o.OooOo0((C24328OooO0o) Oooo00O3.f64461OooOo, fFloatValue);
                c24328OooO0oOooO0OO = Oooo00O3.OooO0OO();
            } else if (value instanceof Double) {
                C24328OooO0o.OooO00o Oooo00O4 = C24328OooO0o.Oooo00O();
                double dDoubleValue = ((Number) value).doubleValue();
                Oooo00O4.OooO0o0();
                C24328OooO0o.OooOOo0((C24328OooO0o) Oooo00O4.f64461OooOo, dDoubleValue);
                c24328OooO0oOooO0OO = Oooo00O4.OooO0OO();
            } else if (value instanceof Integer) {
                C24328OooO0o.OooO00o Oooo00O5 = C24328OooO0o.Oooo00O();
                int iIntValue = ((Number) value).intValue();
                Oooo00O5.OooO0o0();
                C24328OooO0o.OooOo0O((C24328OooO0o) Oooo00O5.f64461OooOo, iIntValue);
                c24328OooO0oOooO0OO = Oooo00O5.OooO0OO();
            } else if (value instanceof Long) {
                C24328OooO0o.OooO00o Oooo00O6 = C24328OooO0o.Oooo00O();
                long jLongValue = ((Number) value).longValue();
                Oooo00O6.OooO0o0();
                C24328OooO0o.OooOOO((C24328OooO0o) Oooo00O6.f64461OooOo, jLongValue);
                c24328OooO0oOooO0OO = Oooo00O6.OooO0OO();
            } else if (value instanceof String) {
                C24328OooO0o.OooO00o Oooo00O7 = C24328OooO0o.Oooo00O();
                Oooo00O7.OooO0o0();
                C24328OooO0o.OooOOOO((C24328OooO0o) Oooo00O7.f64461OooOo, (String) value);
                c24328OooO0oOooO0OO = Oooo00O7.OooO0OO();
            } else if (value instanceof Set) {
                C24328OooO0o.OooO00o Oooo00O8 = C24328OooO0o.Oooo00O();
                C24329OooO0o0.OooO00o oooO00oOooOOo = C24329OooO0o0.OooOOo();
                OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                oooO00oOooOOo.OooO0o0();
                C24329OooO0o0.OooOOOO((C24329OooO0o0) oooO00oOooOOo.f64461OooOo, (Set) value);
                Oooo00O8.OooO0o0();
                C24328OooO0o.OooOOOo((C24328OooO0o) Oooo00O8.f64461OooOo, oooO00oOooOOo.OooO0OO());
                c24328OooO0oOooO0OO = Oooo00O8.OooO0OO();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException(C22206OooOOo0.OooO0OO(value, "PreferencesSerializer does not support type: "));
                }
                C24328OooO0o.OooO00o Oooo00O9 = C24328OooO0o.Oooo00O();
                byte[] bArr = (byte[]) value;
                OooO.OooO0o oooO0o = androidx.datastore.preferences.protobuf.OooO.f64403OooOo;
                OooO.OooO0o oooO0oOooO0Oo = androidx.datastore.preferences.protobuf.OooO.OooO0Oo(0, bArr.length, bArr);
                Oooo00O9.OooO0o0();
                C24328OooO0o.OooOOo((C24328OooO0o) Oooo00O9.f64461OooOo, oooO0oOooO0Oo);
                c24328OooO0oOooO0OO = Oooo00O9.OooO0OO();
            }
            oooO00oOooOOo0.getClass();
            str.getClass();
            oooO00oOooOOo0.OooO0o0();
            C24327OooO0Oo.OooOOOO((C24327OooO0Oo) oooO00oOooOOo0.f64461OooOo).put(str, c24328OooO0oOooO0OO);
        }
        C24327OooO0Oo c24327OooO0OoOooO0OO = oooO00oOooOOo0.OooO0OO();
        int iOooO0Oo = c24327OooO0OoOooO0OO.OooO0Oo(null);
        Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
        if (iOooO0Oo > 4096) {
            iOooO0Oo = 4096;
        }
        AbstractC21794OooOO0o.C21795OooO0Oo c21795OooO0Oo = new AbstractC21794OooOO0o.C21795OooO0Oo((o0Oo0oo) outputStream, iOooO0Oo);
        c24327OooO0OoOooO0OO.OooO0O0(c21795OooO0Oo);
        if (c21795OooO0Oo.f64444OooO0o > 0) {
            c21795OooO0Oo.Oooo0o();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
