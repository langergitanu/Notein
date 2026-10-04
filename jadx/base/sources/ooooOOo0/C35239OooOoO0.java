package ooooOOo0;

import com.huawei.hms.network.embedded.C18389v6;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* JADX INFO: renamed from: ooooOOo0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35239OooOoO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f126544OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f126545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HttpUrl f126546OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f126547OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f126548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final MediaType f126549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Headers f126550OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f126551OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f126552OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final AbstractC35231OooOo0O<?>[] f126553OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f126554OooOO0O;

    /* JADX INFO: renamed from: ooooOOo0.OooOoO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final Pattern f126555OooOo = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final Pattern f126556OooOoO0 = Pattern.compile(C18389v6.f56372l);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f126557OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C35240OooOoOO f126558OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f126559OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Annotation[] f126560OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Annotation[][] f126561OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f126562OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type[] f126563OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f126564OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f126565OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f126566OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f126567OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f126568OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public String f126569OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f126570OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f126571OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f126572OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public String f126573OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f126574OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public Headers f126575OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public LinkedHashSet f126576OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public MediaType f126577OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public AbstractC35231OooOo0O<?>[] f126578OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f126579OooOo0o;

        public OooO00o(C35240OooOoOO c35240OooOoOO, Method method) {
            this.f126558OooO00o = c35240OooOoOO;
            this.f126559OooO0O0 = method;
            this.f126560OooO0OO = method.getAnnotations();
            this.f126563OooO0o0 = method.getGenericParameterTypes();
            this.f126561OooO0Oo = method.getParameterAnnotations();
        }

        public static Class<?> OooO00o(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void OooO0O0(String str, String str2, boolean z) {
            String str3 = this.f126569OooOOO;
            Method method = this.f126559OooO0O0;
            if (str3 != null) {
                throw C35244OooOooo.OooO(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f126569OooOOO = str;
            this.f126571OooOOOO = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f126555OooOo;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw C35244OooOooo.OooO(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f126573OooOOo = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f126576OooOo0 = linkedHashSet;
        }

        public final void OooO0OO(int i, Type type) {
            if (C35244OooOooo.OooO0oO(type)) {
                throw C35244OooOooo.OooOO0(this.f126559OooO0O0, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C35239OooOoO0(OooO00o oooO00o) {
        this.f126545OooO00o = oooO00o.f126559OooO0O0;
        this.f126546OooO0O0 = oooO00o.f126558OooO00o.f126582OooO0OO;
        this.f126547OooO0OO = oooO00o.f126569OooOOO;
        this.f126548OooO0Oo = oooO00o.f126573OooOOo;
        this.f126550OooO0o0 = oooO00o.f126575OooOOoo;
        this.f126549OooO0o = oooO00o.f126577OooOo00;
        this.f126551OooO0oO = oooO00o.f126571OooOOOO;
        this.f126552OooO0oo = oooO00o.f126572OooOOOo;
        this.f126544OooO = oooO00o.f126574OooOOo0;
        this.f126553OooOO0 = oooO00o.f126578OooOo0O;
        this.f126554OooOO0O = oooO00o.f126579OooOo0o;
    }
}
