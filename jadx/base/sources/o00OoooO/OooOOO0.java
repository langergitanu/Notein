package o00OoooO;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 implements OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, List<InterfaceC25184OooOO0o>> f85724OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Map<String, String> f85725OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Map<String, List<InterfaceC25184OooOO0o>> f85726OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Map<String, List<InterfaceC25184OooOO0o>> f85727OooO00o = f85726OooO0O0;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new OooO0O0(property)));
            }
            f85726OooO0O0 = Collections.unmodifiableMap(map);
        }
    }

    public static final class OooO0O0 implements InterfaceC25184OooOO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f85728OooO00o;

        public OooO0O0(String str) {
            this.f85728OooO00o = str;
        }

        @Override // o00OoooO.InterfaceC25184OooOO0o
        public final String OooO00o() {
            return this.f85728OooO00o;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0O0) {
                return this.f85728OooO00o.equals(((OooO0O0) obj).f85728OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f85728OooO00o.hashCode();
        }

        public final String toString() {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("StringHeaderFactory{value='"), this.f85728OooO00o, "'}");
        }
    }

    public OooOOO0(Map<String, List<InterfaceC25184OooOO0o>> map) {
        this.f85724OooO0O0 = Collections.unmodifiableMap(map);
    }

    public final HashMap OooO00o() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC25184OooOO0o>> entry : this.f85724OooO0O0.entrySet()) {
            List<InterfaceC25184OooOO0o> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strOooO00o = value.get(i).OooO00o();
                if (!TextUtils.isEmpty(strOooO00o)) {
                    sb.append(strOooO00o);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map<String, String> OooO0O0() {
        if (this.f85725OooO0OO == null) {
            synchronized (this) {
                try {
                    if (this.f85725OooO0OO == null) {
                        this.f85725OooO0OO = Collections.unmodifiableMap(OooO00o());
                    }
                } finally {
                }
            }
        }
        return this.f85725OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO0) {
            return this.f85724OooO0O0.equals(((OooOOO0) obj).f85724OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f85724OooO0O0.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f85724OooO0O0 + '}';
    }
}
