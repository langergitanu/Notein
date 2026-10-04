package okhttp3;

import com.aspose.slides.internal.p497xc.OooO00o;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Challenge {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f124054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, String> f124055OooO0O0;

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        this.f124054OooO00o = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                OooOOO0.OooO0o(US, "US");
                lowerCase = key.toLowerCase(US);
                OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        OooOOO0.OooO0o(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f124055OooO0O0 = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return OooOOO0.OooO0O0(challenge.f124054OooO00o, this.f124054OooO00o) && OooOOO0.OooO0O0(challenge.f124055OooO0O0, this.f124055OooO0O0);
    }

    public final int hashCode() {
        return this.f124055OooO0O0.hashCode() + OooO00o.OooO0O0(899, 31, this.f124054OooO00o);
    }

    public final String toString() {
        return this.f124054OooO00o + " authParams=" + this.f124055OooO0O0;
    }
}
