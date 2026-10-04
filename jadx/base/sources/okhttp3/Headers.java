package okhttp3;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.OooO0OO;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0O00.OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/Headers;", "", "LoO00ooO/OooOOO;", "", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Headers implements Iterable<C32443OooOOO<? extends String, ? extends String>>, OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Companion f124123OooOo = new Companion(0);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String[] f124124OooOo0o;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f124125OooO00o = new ArrayList(20);

        public final void OooO00o(String name, String value) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(value, "value");
            Headers.f124123OooOo.getClass();
            Companion.OooO00o(name);
            Companion.OooO0O0(value, name);
            OooO0O0(name, value);
        }

        public final void OooO0O0(String name, String value) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(value, "value");
            ArrayList arrayList = this.f124125OooO00o;
            arrayList.add(name);
            arrayList.add(C33599OooOo0O.Oooooo0(value).toString());
        }

        public final Headers OooO0OO() {
            Object[] array = this.f124125OooO00o.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final void OooO0Oo(String name) {
            OooOOO0.OooO0oO(name, "name");
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f124125OooO00o;
                if (i >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static void OooO00o(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.OooO("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
                i = i2;
            }
        }

        public static void OooO0O0(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(OooOOO0.OooOOO0(Util.OooOOo0(str2) ? "" : OooOOO0.OooOOO0(str, ": "), Util.OooO("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2)).toString());
                }
                i = i2;
            }
        }

        public static Headers OooO0OO(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                String str = strArr2[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i2] = C33599OooOo0O.Oooooo0(str).toString();
                i2 = i3;
            }
            int iOooO0oo = C24217OooO0O0.OooO0oo(0, strArr2.length - 1, 2);
            if (iOooO0oo >= 0) {
                while (true) {
                    int i4 = i + 2;
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    OooO00o(str2);
                    OooO0O0(str3, str2);
                    if (i == iOooO0oo) {
                        break;
                    }
                    i = i4;
                }
            }
            return new Headers(strArr2);
        }

        private Companion() {
        }
    }

    public Headers(String[] strArr) {
        this.f124124OooOo0o = strArr;
    }

    public final String OooO0O0(String name) {
        OooOOO0.OooO0oO(name, "name");
        f124123OooOo.getClass();
        String[] strArr = this.f124124OooOo0o;
        int length = strArr.length - 2;
        int iOooO0oo = C24217OooO0O0.OooO0oo(length, 0, -2);
        if (iOooO0oo > length) {
            return null;
        }
        while (true) {
            int i = length - 2;
            if (C33595OooOOo.OooOOo(name, strArr[length], true)) {
                return strArr[length + 1];
            }
            if (length == iOooO0oo) {
                return null;
            }
            length = i;
        }
    }

    public final String OooO0Oo(int i) {
        return this.f124124OooOo0o[i * 2];
    }

    public final TreeMap OooO0o() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        OooOOO0.OooO0o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strOooO0Oo = OooO0Oo(i);
            Locale US = Locale.US;
            OooOOO0.OooO0o(US, "US");
            String lowerCase = strOooO0Oo.toLowerCase(US);
            OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(OooO0oO(i));
            i = i2;
        }
        return treeMap;
    }

    public final Builder OooO0o0() {
        Builder builder = new Builder();
        C34431OooOo0.OooOo(builder.f124125OooO00o, this.f124124OooOo0o);
        return builder;
    }

    public final String OooO0oO(int i) {
        return this.f124124OooOo0o[(i * 2) + 1];
    }

    public final List<String> OooO0oo(String name) {
        OooOOO0.OooO0oO(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (name.equalsIgnoreCase(OooO0Oo(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(OooO0oO(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        OooOOO0.OooO0o(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f124124OooOo0o, ((Headers) obj).f124124OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f124124OooOo0o);
    }

    @Override // java.lang.Iterable
    public final Iterator<C32443OooOOO<? extends String, ? extends String>> iterator() {
        int size = size();
        C32443OooOOO[] c32443OooOOOArr = new C32443OooOOO[size];
        for (int i = 0; i < size; i++) {
            c32443OooOOOArr[i] = new C32443OooOOO(OooO0Oo(i), OooO0oO(i));
        }
        return OooO0OO.OooO0O0(c32443OooOOOArr);
    }

    public final int size() {
        return this.f124124OooOo0o.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strOooO0Oo = OooO0Oo(i);
            String strOooO0oO = OooO0oO(i);
            sb.append(strOooO0Oo);
            sb.append(": ");
            if (Util.OooOOo0(strOooO0Oo)) {
                strOooO0oO = "██";
            }
            sb.append(strOooO0oO);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            i = i2;
        }
        String string = sb.toString();
        OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
