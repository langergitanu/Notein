package o000o0O0;

import OooO0o.C20424OooO0Oo;
import android.os.Bundle;
import android.os.Parcelable;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Serializable;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o000o0O0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24590OooOooo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f83351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0o f83341OooO0O0 = new OooO0o(false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO f83342OooO0OO = new OooO(false);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C24592OooO0o0 f83343OooO0Oo = new C24592OooO0o0(true);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C24594OooO0oo f83345OooO0o0 = new C24594OooO0oo(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C24593OooO0oO f83344OooO0o = new C24593OooO0oO(true);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C24591OooO0Oo f83346OooO0oO = new C24591OooO0Oo(false);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO0OO f83347OooO0oo = new OooO0OO(true);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO0O0 f83340OooO = new OooO0O0(false);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f83348OooOO0 = new OooO00o(true);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooOO0O f83349OooOO0O = new OooOO0O(true);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooOO0 f83350OooOO0o = new OooOO0(true);

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO */
    public static final class OooO extends AbstractC24590OooOooo<Integer> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final Integer OooO00o(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "reference";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Integer OooO0o0(String value) {
            int i;
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            if (C33595OooOOo.OooOoO0(value, "0x", false)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                io.ktor.utils.p616io.Oooo000.OooO0O0(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Integer num) {
            int iIntValue = num.intValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putInt(key, iIntValue);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO00o */
    public static final class OooO00o extends AbstractC24590OooOooo<boolean[]> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final boolean[] OooO00o(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "boolean[]";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final boolean[] OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, boolean[] zArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC24590OooOooo<Boolean> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final Boolean OooO00o(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "boolean";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Boolean OooO0o0(String value) {
            boolean z;
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            if (value.equals(TelemetryEventStrings.Value.TRUE)) {
                z = true;
            } else {
                if (!value.equals(TelemetryEventStrings.Value.FALSE)) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putBoolean(key, zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0OO */
    public static final class OooO0OO extends AbstractC24590OooOooo<float[]> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final float[] OooO00o(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "float[]";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final float[] OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, float[] fArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24591OooO0Oo extends AbstractC24590OooOooo<Float> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final Float OooO00o(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return (Float) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "float";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Float OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Float f) {
            float fFloatValue = f.floatValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putFloat(key, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0o */
    public static final class OooO0o extends AbstractC24590OooOooo<Integer> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final Integer OooO00o(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "integer";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Integer OooO0o0(String value) {
            int i;
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            if (C33595OooOOo.OooOoO0(value, "0x", false)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                io.ktor.utils.p616io.Oooo000.OooO0O0(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Integer num) {
            int iIntValue = num.intValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putInt(key, iIntValue);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0o0, reason: case insensitive filesystem */
    public static final class C24592OooO0o0 extends AbstractC24590OooOooo<int[]> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final int[] OooO00o(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "integer[]";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final int[] OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, int[] iArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0oO, reason: case insensitive filesystem */
    public static final class C24593OooO0oO extends AbstractC24590OooOooo<long[]> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final long[] OooO00o(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "long[]";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final long[] OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, long[] jArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooO0oo, reason: case insensitive filesystem */
    public static final class C24594OooO0oo extends AbstractC24590OooOooo<Long> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final Long OooO00o(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return (Long) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "long";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Long OooO0o0(String value) {
            String strSubstring;
            long j;
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            if (C33595OooOOo.OooOOo0(value, "L", false)) {
                strSubstring = value.substring(0, value.length() - 1);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = value;
            }
            if (C33595OooOOo.OooOoO0(value, "0x", false)) {
                String strSubstring2 = strSubstring.substring(2);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                io.ktor.utils.p616io.Oooo000.OooO0O0(16);
                j = Long.parseLong(strSubstring2, 16);
            } else {
                j = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Long l) {
            long jLongValue = l.longValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putLong(key, jLongValue);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOO0 */
    public static final class OooOO0 extends AbstractC24590OooOooo<String[]> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final String[] OooO00o(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "string[]";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final String[] OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, String[] strArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOO0O */
    public static final class OooOO0O extends AbstractC24590OooOooo<String> {
        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO00o(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return "string";
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final String OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            return value;
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, String str) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            bundle.putString(key, str);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOO0o, reason: case insensitive filesystem */
    public static final class C24595OooOO0o<D extends Enum<?>> extends C24596OooOOOo<D> {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final Class<D> f83352OooOOO;

        public C24595OooOO0o(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f83352OooOOO = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // o000o0O0.AbstractC24590OooOooo.C24596OooOOOo, o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return this.f83352OooOOO.getName();
        }

        @Override // o000o0O0.AbstractC24590OooOooo.C24596OooOOOo
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D OooO0o0(String value) {
            D d;
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            Class<D> cls = this.f83352OooOOO;
            D[] enumConstants = cls.getEnumConstants();
            kotlin.jvm.internal.OooOOO0.OooO0o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (C33595OooOOo.OooOOo(d.name(), value, true)) {
                    break;
                }
                i++;
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Enum value ", value, " not found for type ");
            sbOooO0o0.append(cls.getName());
            sbOooO0o0.append(FilenameUtils.EXTENSION_SEPARATOR);
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOOO */
    public static final class OooOOO<D> extends AbstractC24590OooOooo<D> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final Class<D> f83353OooOOO0;

        public OooOOO(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f83353OooOOO0 = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final D OooO00o(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return this.f83353OooOOO0.getName();
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final D OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, D d) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            this.f83353OooOOO0.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooOOO.class.equals(obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83353OooOOO0, ((OooOOO) obj).f83353OooOOO0);
        }

        public final int hashCode() {
            return this.f83353OooOOO0.hashCode();
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOOO0 */
    public static final class OooOOO0<D extends Parcelable> extends AbstractC24590OooOooo<D[]> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final Class<D[]> f83354OooOOO0;

        public OooOOO0(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f83354OooOOO0 = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final Object OooO00o(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return this.f83354OooOOO0.getName();
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Object OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            this.f83354OooOOO0.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooOOO0.class.equals(obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83354OooOOO0, ((OooOOO0) obj).f83354OooOOO0);
        }

        public final int hashCode() {
            return this.f83354OooOOO0.hashCode();
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOOOO */
    public static final class OooOOOO<D extends Serializable> extends AbstractC24590OooOooo<D[]> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final Class<D[]> f83355OooOOO0;

        public OooOOOO(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f83355OooOOO0 = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final Object OooO00o(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final String OooO0O0() {
            return this.f83355OooOOO0.getName();
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        /* JADX INFO: renamed from: OooO0OO */
        public final Object OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Object obj) {
            ?? r4 = (Serializable[]) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            this.f83355OooOOO0.cast(r4);
            bundle.putSerializable(key, r4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooOOOO.class.equals(obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83355OooOOO0, ((OooOOOO) obj).f83355OooOOO0);
        }

        public final int hashCode() {
            return this.f83355OooOOO0.hashCode();
        }
    }

    public AbstractC24590OooOooo(boolean z) {
        this.f83351OooO00o = z;
    }

    public abstract T OooO00o(Bundle bundle, String str);

    public abstract String OooO0O0();

    /* JADX INFO: renamed from: OooO0OO */
    public abstract T OooO0o0(String str);

    public abstract void OooO0Oo(Bundle bundle, String str, T t);

    public final String toString() {
        return OooO0O0();
    }

    /* JADX INFO: renamed from: o000o0O0.OooOooo$OooOOOo, reason: case insensitive filesystem */
    public static class C24596OooOOOo<D extends Serializable> extends AbstractC24590OooOooo<D> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final Class<D> f83356OooOOO0;

        public C24596OooOOOo(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.f83356OooOOO0 = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final Object OooO00o(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public String OooO0O0() {
            return this.f83356OooOOO0.getName();
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public final void OooO0Oo(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            this.f83356OooOOO0.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // o000o0O0.AbstractC24590OooOooo
        public D OooO0o0(String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24596OooOOOo)) {
                return false;
            }
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83356OooOOO0, ((C24596OooOOOo) obj).f83356OooOOO0);
        }

        public final int hashCode() {
            return this.f83356OooOOO0.hashCode();
        }

        public C24596OooOOOo(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f83356OooOOO0 = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
