package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.restclient.hwhttp.ClientConfiguration;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.restclient.Converter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18337r6<T> {

    /* JADX INFO: renamed from: a */
    public static final String f56013a = "ParameterBuilder";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$a */
    public class a extends AbstractC18337r6<Object> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, Object obj) throws IOException {
            if (obj == null) {
                Logger.m76967w(AbstractC18337r6.f56013a, "ParameterBuilder.array.build failed, values == null");
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                AbstractC18337r6.this.mo79448a(c18376u6, Array.get(obj, i));
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$b */
    public class b extends AbstractC18337r6<Iterable<T>> {
        public b() {
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                Logger.m76967w(AbstractC18337r6.f56013a, "ParameterBuilder.iterable.build failed, values == null");
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC18337r6.this.mo79448a(c18376u6, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$c */
    public static final class c<T> extends AbstractC18337r6<T> {

        /* JADX INFO: renamed from: b */
        public final Converter<T, RequestBody> f56016b;

        public c(Converter<T, RequestBody> converter) {
            this.f56016b = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, T t) throws IOException {
            if (t == null) {
                AbstractC18337r6.m79446b("Body parameter value must not be null.");
            }
            c18376u6.m79600a(this.f56016b.convert(t));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$d */
    public static final class d extends AbstractC18337r6<ClientConfiguration> {
        /* JADX INFO: renamed from: a */
        private String m79451a(ClientConfiguration clientConfiguration) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PolicyNetworkService.RequestConstants.CALL_TIMEOUT, clientConfiguration.getCallTimeout());
                jSONObject.put(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT, clientConfiguration.getConnectTimeout());
                jSONObject.put(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY, clientConfiguration.getConnectionAttemptDelay());
                jSONObject.put(PolicyNetworkService.RequestConstants.PING_INTERVAL, clientConfiguration.getPingInterval());
                jSONObject.put(PolicyNetworkService.RequestConstants.READ_TIMEOUT, clientConfiguration.getReadTimeout());
                jSONObject.put(PolicyNetworkService.RequestConstants.WRITE_TIMEOUT, clientConfiguration.getWriteTimeout());
                jSONObject.put(PolicyNetworkService.RequestConstants.RETRY_TIME, clientConfiguration.getRetryTimeOnConnectionFailure());
                return jSONObject.toString();
            } catch (JSONException unused) {
                Logger.m76967w(AbstractC18337r6.f56013a, "JSONException error");
                return "";
            }
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, ClientConfiguration clientConfiguration) {
            c18376u6.setNetworkParameters(m79451a(clientConfiguration));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$e */
    public static final class e<T> extends AbstractC18337r6<Map<String, T>> {

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f56017b;

        public e(Converter<T, String> converter) {
            this.f56017b = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, Map<String, T> map) throws IOException {
            if (map == null) {
                AbstractC18337r6.m79446b("Field map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    AbstractC18337r6.m79446b("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    AbstractC18337r6.m79446b("Field map contained null value for key '" + key + "'.");
                }
                String strConvert = this.f56017b.convert(value);
                if (strConvert == null) {
                    AbstractC18337r6.m79446b("Field map value '" + value + "' converted to null by " + this.f56017b.getClass().getName() + " for key '" + key + "'.");
                }
                c18376u6.m79602a(key, strConvert);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$f */
    public static final class f<T> extends AbstractC18337r6<T> {

        /* JADX INFO: renamed from: b */
        public final String f56018b;

        /* JADX INFO: renamed from: c */
        public final Converter<T, String> f56019c;

        public f(String str, Converter<T, String> converter) {
            if (str == null) {
                AbstractC18337r6.m79446b("Field parameter name must be not null.");
            }
            this.f56018b = str;
            this.f56019c = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f56019c.convert(t)) == null) {
                return;
            }
            c18376u6.m79602a(this.f56018b, strConvert);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$g */
    public static final class g<T> extends AbstractC18337r6<T> {

        /* JADX INFO: renamed from: b */
        public final String f56020b;

        /* JADX INFO: renamed from: c */
        public final Converter<T, String> f56021c;

        public g(String str, Converter<T, String> converter) {
            if (str == null) {
                AbstractC18337r6.m79446b("Header parameter name must be not null.");
            }
            this.f56020b = str;
            this.f56021c = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f56021c.convert(t)) == null) {
                return;
            }
            c18376u6.m79603b(this.f56020b, strConvert);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$h */
    public static final class h<T> extends AbstractC18337r6<Map<String, T>> {

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f56022b;

        public h(Converter<T, String> converter) {
            this.f56022b = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, Map<String, T> map) throws IOException {
            if (map == null) {
                AbstractC18337r6.m79446b("Header map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    AbstractC18337r6.m79446b("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    AbstractC18337r6.m79446b("Header map contained null value for key '" + key + "'.");
                }
                c18376u6.m79603b(key, this.f56022b.convert(value));
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$i */
    public static final class i extends AbstractC18337r6<String> {
        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, String str) {
            c18376u6.setNetworkParameters(str);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$j */
    public static final class j<T> extends AbstractC18337r6<T> {

        /* JADX INFO: renamed from: b */
        public final String f56023b;

        /* JADX INFO: renamed from: c */
        public final Converter<T, String> f56024c;

        public j(String str, Converter<T, String> converter) {
            if (str == null) {
                AbstractC18337r6.m79446b("Path parameter name must be not null.");
            }
            this.f56023b = str;
            this.f56024c = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, T t) throws IOException {
            if (t == null) {
                AbstractC18337r6.m79446b("Path parameter \"" + this.f56023b + "\" value must not be null.");
            }
            c18376u6.m79604c(this.f56023b, this.f56024c.convert(t));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$k */
    public static final class k<T> extends AbstractC18337r6<Map<String, T>> {

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f56025b;

        public k(Converter<T, String> converter) {
            this.f56025b = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, Map<String, T> map) throws IOException {
            if (map == null) {
                AbstractC18337r6.m79446b("Query map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    AbstractC18337r6.m79446b("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    AbstractC18337r6.m79446b("Query map contained null value for key '" + key + "'.");
                }
                String strConvert = this.f56025b.convert(value);
                if (strConvert == null) {
                    AbstractC18337r6.m79446b("Query map value '" + value + "' converted to null by " + this.f56025b.getClass().getName() + " for key '" + key + "'.");
                }
                c18376u6.m79605d(key, strConvert);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$l */
    public static final class l<T> extends AbstractC18337r6<T> {

        /* JADX INFO: renamed from: b */
        public final String f56026b;

        /* JADX INFO: renamed from: c */
        public final Converter<T, String> f56027c;

        public l(String str, Converter<T, String> converter) {
            if (str == null) {
                AbstractC18337r6.m79446b("Query parameter name must be not null.");
            }
            this.f56026b = str;
            this.f56027c = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f56027c.convert(t)) == null) {
                return;
            }
            c18376u6.m79605d(this.f56026b, strConvert);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$m */
    public static final class m<T> extends AbstractC18337r6<Map<String, T>> {

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f56028b;

        public m(Converter<T, String> converter) {
            this.f56028b = converter;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo79448a(C18376u6 c18376u6, Map<String, T> map) throws IOException {
            if (map == null) {
                AbstractC18337r6.m79446b("Record map was null.");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        AbstractC18337r6.m79446b("Record map contained null key.");
                    }
                    T value = entry.getValue();
                    if (value == null) {
                        AbstractC18337r6.m79446b("Record map contained null value for key '" + key + "'.");
                    }
                    String strConvert = this.f56028b.convert(value);
                    if (strConvert == null) {
                        AbstractC18337r6.m79446b("Record map value '" + value + "' converted to null by " + this.f56028b.getClass().getName() + " for key '" + key + "'.");
                    }
                    jSONObject.put(key, strConvert);
                }
                jSONObject2.put(PolicyNetworkService.RequestConstants.METRICS_DATA, jSONObject);
                c18376u6.setMetricsData(jSONObject2.toString());
            } catch (JSONException unused) {
                Logger.m76960e(AbstractC18337r6.f56013a, "parse MetricsData has occurred a JSONException");
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r6$n */
    public static final class n extends AbstractC18337r6<Object> {
        @Override // com.huawei.hms.network.embedded.AbstractC18337r6
        /* JADX INFO: renamed from: a */
        public void mo79448a(C18376u6 c18376u6, Object obj) {
            if (obj == null) {
                AbstractC18337r6.m79446b("@Url parameter is null.");
            }
            if (obj instanceof String) {
                c18376u6.m79601a((String) obj);
            } else {
                AbstractC18337r6.m79446b("@Url parameter must be String.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC18337r6<Object> m79447a() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo79448a(C18376u6 c18376u6, T t) throws IOException;

    /* JADX INFO: renamed from: b */
    public final AbstractC18337r6<Iterable<T>> m79449b() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public static void m79446b(String str) {
        throw new IllegalArgumentException(str);
    }
}
