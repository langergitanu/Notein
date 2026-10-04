package ooooOOo0;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import oOo00OoO.C34524OooO0Oo;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import ooooOOo0.C35208OooO00o;

/* JADX INFO: renamed from: ooooOOo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35231OooOo0O<T> {

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO */
    public static final class OooO<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126499OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126500OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f126501OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C35208OooO00o.C35209OooO0Oo f126502OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f126503OooO0o0;

        public OooO(Method method, int i, String str, boolean z) {
            C35208OooO00o.C35209OooO0Oo c35209OooO0Oo = C35208OooO00o.C35209OooO0Oo.f126428OooO00o;
            this.f126499OooO00o = method;
            this.f126500OooO0O0 = i;
            Objects.requireNonNull(str, "name == null");
            this.f126501OooO0OO = str;
            this.f126502OooO0Oo = c35209OooO0Oo;
            this.f126503OooO0o0 = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
        @Override // ooooOOo0.AbstractC35231OooOo0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o(C35228OooOo c35228OooOo, T t) throws IOException {
            String strO00000OO;
            String strReplace;
            String str = this.f126501OooO0OO;
            if (t == null) {
                throw C35244OooOooo.OooOO0(this.f126499OooO00o, this.f126500OooO0O0, C20593OooO0Oo.OooO0O0("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            this.f126502OooO0Oo.getClass();
            String string = t.toString();
            if (c35228OooOo.f126487OooO0OO == null) {
                throw new AssertionError();
            }
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                boolean z = this.f126503OooO0o0;
                int i = 47;
                int i2 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                    c34524OooO0Oo.o000Oo0O(0, iCharCount, string);
                    C34524OooO0Oo c34524OooO0Oo2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = string.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (c34524OooO0Oo2 == null) {
                                    c34524OooO0Oo2 = new C34524OooO0Oo();
                                }
                                c34524OooO0Oo2.o000Oo(iCodePointAt2);
                                while (!c34524OooO0Oo2.o0000o0O()) {
                                    byte b = c34524OooO0Oo2.readByte();
                                    c34524OooO0Oo.o0OoO0o(37);
                                    char[] cArr = C35228OooOo.f126482OooOO0o;
                                    c34524OooO0Oo.o0OoO0o(cArr[((b & 255) >> 4) & 15]);
                                    c34524OooO0Oo.o0OoO0o(cArr[b & 15]);
                                }
                            } else {
                                c34524OooO0Oo.o000Oo(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    strO00000OO = c34524OooO0Oo.o00000OO();
                    strReplace = c35228OooOo.f126487OooO0OO.replace("{" + str + "}", strO00000OO);
                    if (!C35228OooOo.f126483OooOOO0.matcher(strReplace).matches()) {
                        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
                    }
                    c35228OooOo.f126487OooO0OO = strReplace;
                    return;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            strO00000OO = string;
            strReplace = c35228OooOo.f126487OooO0OO.replace("{" + str + "}", strO00000OO);
            if (!C35228OooOo.f126483OooOOO0.matcher(strReplace).matches()) {
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO00o */
    public static final class OooO00o<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126504OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126505OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC35214OooO0o<T, RequestBody> f126506OooO0OO;

        public OooO00o(Method method, int i, InterfaceC35214OooO0o<T, RequestBody> interfaceC35214OooO0o) {
            this.f126504OooO00o = method;
            this.f126505OooO0O0 = i;
            this.f126506OooO0OO = interfaceC35214OooO0o;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) {
            Method method = this.f126504OooO00o;
            int i = this.f126505OooO0O0;
            if (t == null) {
                throw C35244OooOooo.OooOO0(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c35228OooOo.f126494OooOO0O = this.f126506OooO0OO.convert(t);
            } catch (IOException e) {
                throw C35244OooOooo.OooOO0O(method, e, i, C20485OooOoO.OooO0O0("Unable to convert ", t, " to RequestBody"), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f126507OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C35208OooO00o.C35209OooO0Oo f126508OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f126509OooO0OO;

        public OooO0O0(String str, boolean z) {
            C35208OooO00o.C35209OooO0Oo c35209OooO0Oo = C35208OooO00o.C35209OooO0Oo.f126428OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f126507OooO00o = str;
            this.f126508OooO0O0 = c35209OooO0Oo;
            this.f126509OooO0OO = z;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) throws IOException {
            if (t == null) {
                return;
            }
            this.f126508OooO0O0.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            c35228OooOo.OooO00o(this.f126507OooO00o, string, this.f126509OooO0OO);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC35231OooOo0O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126510OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126511OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f126512OooO0OO;

        public OooO0OO(int i, Method method, boolean z) {
            this.f126510OooO00o = method;
            this.f126511OooO0O0 = i;
            this.f126512OooO0OO = z;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f126510OooO00o;
            int i = this.f126511OooO0O0;
            if (map == null) {
                throw C35244OooOooo.OooOO0(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C35244OooOooo.OooOO0(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C35244OooOooo.OooOO0(method, i, C20593OooO0Oo.OooO0O0("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw C35244OooOooo.OooOO0(method, i, "Field map value '" + value + "' converted to null by " + C35208OooO00o.C35209OooO0Oo.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                c35228OooOo.OooO00o(str, string, this.f126512OooO0OO);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0Oo, reason: case insensitive filesystem */
    public static final class C35232OooO0Oo<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f126513OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C35208OooO00o.C35209OooO0Oo f126514OooO0O0;

        public C35232OooO0Oo(String str) {
            C35208OooO00o.C35209OooO0Oo c35209OooO0Oo = C35208OooO00o.C35209OooO0Oo.f126428OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f126513OooO00o = str;
            this.f126514OooO0O0 = c35209OooO0Oo;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) throws IOException {
            if (t == null) {
                return;
            }
            this.f126514OooO0O0.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            c35228OooOo.OooO0O0(this.f126513OooO00o, string);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0o */
    public static final class OooO0o extends AbstractC35231OooOo0O<Headers> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126515OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126516OooO0O0;

        public OooO0o(Method method, int i) {
            this.f126515OooO00o = method;
            this.f126516OooO0O0 = i;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, Headers headers) throws IOException {
            Headers headers2 = headers;
            if (headers2 == null) {
                throw C35244OooOooo.OooOO0(this.f126515OooO00o, this.f126516OooO0O0, "Headers parameter must not be null.", new Object[0]);
            }
            Headers.Builder builder = c35228OooOo.f126489OooO0o;
            builder.getClass();
            int size = headers2.size();
            for (int i = 0; i < size; i++) {
                builder.OooO0O0(headers2.OooO0Oo(i), headers2.OooO0oO(i));
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0o0, reason: case insensitive filesystem */
    public static final class C35233OooO0o0<T> extends AbstractC35231OooOo0O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126517OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126518OooO0O0;

        public C35233OooO0o0(Method method, int i) {
            this.f126517OooO00o = method;
            this.f126518OooO0O0 = i;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f126517OooO00o;
            int i = this.f126518OooO0O0;
            if (map == null) {
                throw C35244OooOooo.OooOO0(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C35244OooOooo.OooOO0(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C35244OooOooo.OooOO0(method, i, C20593OooO0Oo.OooO0O0("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                c35228OooOo.OooO0O0(str, value.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0oO, reason: case insensitive filesystem */
    public static final class C35234OooO0oO<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126519OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126520OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Headers f126521OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC35214OooO0o<T, RequestBody> f126522OooO0Oo;

        public C35234OooO0oO(Method method, int i, Headers headers, InterfaceC35214OooO0o<T, RequestBody> interfaceC35214OooO0o) {
            this.f126519OooO00o = method;
            this.f126520OooO0O0 = i;
            this.f126521OooO0OO = headers;
            this.f126522OooO0Oo = interfaceC35214OooO0o;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) {
            if (t == null) {
                return;
            }
            try {
                RequestBody body = this.f126522OooO0Oo.convert(t);
                Headers headers = this.f126521OooO0OO;
                MultipartBody.Builder builder = c35228OooOo.f126484OooO;
                builder.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(body, "body");
                MultipartBody.Part.f124167OooO0OO.getClass();
                builder.f124166OooO0OO.add(MultipartBody.Part.Companion.OooO00o(headers, body));
            } catch (IOException e) {
                throw C35244OooOooo.OooOO0(this.f126519OooO00o, this.f126520OooO0O0, C20485OooOoO.OooO0O0("Unable to convert ", t, " to RequestBody"), e);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooO0oo, reason: case insensitive filesystem */
    public static final class C35235OooO0oo<T> extends AbstractC35231OooOo0O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126523OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126524OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC35214OooO0o<T, RequestBody> f126525OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f126526OooO0Oo;

        public C35235OooO0oo(Method method, int i, InterfaceC35214OooO0o<T, RequestBody> interfaceC35214OooO0o, String str) {
            this.f126523OooO00o = method;
            this.f126524OooO0O0 = i;
            this.f126525OooO0OO = interfaceC35214OooO0o;
            this.f126526OooO0Oo = str;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f126523OooO00o;
            int i = this.f126524OooO0O0;
            if (map == null) {
                throw C35244OooOooo.OooOO0(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C35244OooOooo.OooOO0(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C35244OooOooo.OooOO0(method, i, C20593OooO0Oo.OooO0O0("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                String[] strArr = {"Content-Disposition", C20593OooO0Oo.OooO0O0("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f126526OooO0Oo};
                Headers.f124123OooOo.getClass();
                Headers headersOooO0OO = Headers.Companion.OooO0OO(strArr);
                RequestBody body = this.f126525OooO0OO.convert((T) value);
                MultipartBody.Builder builder = c35228OooOo.f126484OooO;
                builder.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(body, "body");
                MultipartBody.Part.f124167OooO0OO.getClass();
                builder.f124166OooO0OO.add(MultipartBody.Part.Companion.OooO00o(headersOooO0OO, body));
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooOO0 */
    public static final class OooOO0<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f126527OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C35208OooO00o.C35209OooO0Oo f126528OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f126529OooO0OO;

        public OooOO0(String str, boolean z) {
            C35208OooO00o.C35209OooO0Oo c35209OooO0Oo = C35208OooO00o.C35209OooO0Oo.f126428OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f126527OooO00o = str;
            this.f126528OooO0O0 = c35209OooO0Oo;
            this.f126529OooO0OO = z;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) throws IOException {
            if (t == null) {
                return;
            }
            this.f126528OooO0O0.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            c35228OooOo.OooO0OO(this.f126527OooO00o, string, this.f126529OooO0OO);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooOO0O */
    public static final class OooOO0O<T> extends AbstractC35231OooOo0O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126530OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126531OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f126532OooO0OO;

        public OooOO0O(int i, Method method, boolean z) {
            this.f126530OooO00o = method;
            this.f126531OooO0O0 = i;
            this.f126532OooO0OO = z;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f126530OooO00o;
            int i = this.f126531OooO0O0;
            if (map == null) {
                throw C35244OooOooo.OooOO0(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C35244OooOooo.OooOO0(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C35244OooOooo.OooOO0(method, i, C20593OooO0Oo.OooO0O0("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw C35244OooOooo.OooOO0(method, i, "Query map value '" + value + "' converted to null by " + C35208OooO00o.C35209OooO0Oo.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                c35228OooOo.OooO0OO(str, string, this.f126532OooO0OO);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooOO0o, reason: case insensitive filesystem */
    public static final class C35236OooOO0o<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f126533OooO00o;

        public C35236OooOO0o(boolean z) {
            this.f126533OooO00o = z;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) throws IOException {
            if (t == null) {
                return;
            }
            c35228OooOo.OooO0OO(t.toString(), null, this.f126533OooO00o);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooOOO */
    public static final class OooOOO extends AbstractC35231OooOo0O<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f126534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126535OooO0O0;

        public OooOOO(Method method, int i) {
            this.f126534OooO00o = method;
            this.f126535OooO0O0 = i;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, Object obj) {
            if (obj != null) {
                c35228OooOo.f126487OooO0OO = obj.toString();
            } else {
                throw C35244OooOooo.OooOO0(this.f126534OooO00o, this.f126535OooO0O0, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooOOO0 */
    public static final class OooOOO0 extends AbstractC35231OooOo0O<MultipartBody.Part> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO0 f126536OooO00o = new OooOOO0();

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, MultipartBody.Part part) throws IOException {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                MultipartBody.Builder builder = c35228OooOo.f126484OooO;
                builder.getClass();
                builder.f124166OooO0OO.add(part2);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOo0O$OooOOOO */
    public static final class OooOOOO<T> extends AbstractC35231OooOo0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f126537OooO00o;

        public OooOOOO(Class<T> cls) {
            this.f126537OooO00o = cls;
        }

        @Override // ooooOOo0.AbstractC35231OooOo0O
        public final void OooO00o(C35228OooOo c35228OooOo, T t) {
            c35228OooOo.f126490OooO0o0.OooO0o0(this.f126537OooO00o, t);
        }
    }

    public abstract void OooO00o(C35228OooOo c35228OooOo, T t) throws IOException;
}
