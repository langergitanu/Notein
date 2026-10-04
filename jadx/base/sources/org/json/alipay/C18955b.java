package org.json.alipay;

import androidx.core.content.OooO0OO;
import androidx.core.graphics.OooO0O0;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: org.json.alipay.b */
/* JADX INFO: loaded from: classes10.dex */
public class C18955b {

    /* JADX INFO: renamed from: a */
    public static final Object f58132a = new a(0);

    /* JADX INFO: renamed from: b */
    public Map f58133b;

    /* JADX INFO: renamed from: org.json.alipay.b$a */
    public static final class a {
        public a() {
        }

        public final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public C18955b() {
        this.f58133b = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static void m80649b(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m80650c(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        int i = 0;
        char c = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    stringBuffer.append(cCharAt);
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    str2 = "\\u" + OooO0O0.OooO00o(cCharAt, new StringBuilder("000")).substring(r4.length() - 4);
                                }
                                break;
                        }
                    }
                    stringBuffer.append(cCharAt);
                } else {
                    if (c == '<') {
                    }
                    stringBuffer.append(cCharAt);
                }
                i++;
                c = cCharAt;
            } else {
                str2 = "\\r";
            }
            stringBuffer.append(str2);
            i++;
            c = cCharAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final Object m80651a(String str) throws JSONException {
        Object obj = str == null ? null : this.f58133b.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + m80650c(str) + "] not found.");
    }

    public String toString() {
        try {
            Iterator itM80652a = m80652a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itM80652a.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = itM80652a.next();
                stringBuffer.append(m80650c(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(m80648a(this.f58133b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public C18955b(String str) {
        this(new C18956c(str));
    }

    /* JADX INFO: renamed from: a */
    public static String m80648a(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
        if (!(obj instanceof Number)) {
            return ((obj instanceof Boolean) || (obj instanceof C18955b) || (obj instanceof C18954a)) ? obj.toString() : obj instanceof Map ? new C18955b((Map) obj).toString() : obj instanceof Collection ? new C18954a((Collection) obj).toString() : obj.getClass().isArray() ? new C18954a(obj).toString() : m80650c(obj.toString());
        }
        Number number = (Number) obj;
        m80649b(number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = OooO0OO.OooO00o(1, 0, string);
        }
        return string.endsWith(".") ? OooO0OO.OooO00o(1, 0, string) : string;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80653b(String str) {
        return this.f58133b.containsKey(str);
    }

    public C18955b(Map map) {
        this.f58133b = map == null ? new HashMap() : map;
    }

    public C18955b(C18956c c18956c) throws JSONException {
        this();
        if (c18956c.m80658c() != '{') {
            throw c18956c.m80655a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char cM80658c = c18956c.m80658c();
            if (cM80658c == 0) {
                throw c18956c.m80655a("A JSONObject text must end with '}'");
            }
            if (cM80658c == '}') {
                return;
            }
            c18956c.m80656a();
            String string = c18956c.m80659d().toString();
            char cM80658c2 = c18956c.m80658c();
            if (cM80658c2 == '=') {
                if (c18956c.m80657b() != '>') {
                    c18956c.m80656a();
                }
            } else if (cM80658c2 != ':') {
                throw c18956c.m80655a("Expected a ':' after a key");
            }
            Object objM80659d = c18956c.m80659d();
            if (string == null) {
                throw new JSONException("Null key.");
            }
            if (objM80659d != null) {
                m80649b(objM80659d);
                this.f58133b.put(string, objM80659d);
            } else {
                this.f58133b.remove(string);
            }
            char cM80658c3 = c18956c.m80658c();
            if (cM80658c3 != ',' && cM80658c3 != ';') {
                if (cM80658c3 != '}') {
                    throw c18956c.m80655a("Expected a ',' or '}'");
                }
                return;
            } else if (c18956c.m80658c() == '}') {
                return;
            } else {
                c18956c.m80656a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m80652a() {
        return this.f58133b.keySet().iterator();
    }
}
