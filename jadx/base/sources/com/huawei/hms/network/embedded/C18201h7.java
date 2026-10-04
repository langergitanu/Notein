package com.huawei.hms.network.embedded;

import com.aspose.slides.internal.p497xc.OooO00o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18201h7 {

    /* JADX INFO: renamed from: a */
    public final String f55038a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f55039b;

    public C18201h7(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 == null) {
            throw new NullPointerException("realm == null");
        }
        this.f55038a = str;
        this.f55039b = Collections.singletonMap("realm", str2);
    }

    /* JADX INFO: renamed from: a */
    public C18201h7 m78676a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f55039b);
        linkedHashMap.put("charset", charset.name());
        return new C18201h7(this.f55038a, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public Charset m78678b() {
        String str = this.f55039b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    /* JADX INFO: renamed from: c */
    public String m78679c() {
        return this.f55039b.get("realm");
    }

    /* JADX INFO: renamed from: d */
    public String m78680d() {
        return this.f55038a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18201h7)) {
            return false;
        }
        C18201h7 c18201h7 = (C18201h7) obj;
        return c18201h7.f55038a.equals(this.f55038a) && c18201h7.f55039b.equals(this.f55039b);
    }

    public int hashCode() {
        return this.f55039b.hashCode() + OooO00o.OooO0O0(899, 31, this.f55038a);
    }

    public String toString() {
        return this.f55038a + " authParams=" + this.f55039b;
    }

    public C18201h7(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.f55038a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f55039b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m78677a() {
        return this.f55039b;
    }
}
