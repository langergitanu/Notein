package com.huawei.hms.network.inner.api;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PolicyNetworkService extends NetworkService {
    public static final String NETWORK_CONFIG_PRE = "core_";
    public static final String NETWORK_SWITCH_CONFIG_PRE = "core_switch_";
    public static final String TAG = "PolicyNetworkService";

    public static final class ClientConstants {
        public static final String DISABLE_WEAKNETWORK_RETRY = "core_disable_weaknetwork_retry";
        public static final String ENABLE_PLAINTEXT_URL_PATH = "core_enable_plaintext_url_path";
    }

    public static final class GlobalConstants {
        public static final String CONNECT_KEEP_ALIVE_DURATION = "core_connect_keep_alive_duration";
        public static final String ENABLE_DETECT_WITH_HTTP = "core_enable_detect_with_http";
        public static final String HA_TAG = "core_ha_tag";
        public static final String ENABLE_HTTPDNS = "core_enable_httpdns";
        public static final String ENABLE_PRIVACY_POLICY = "core_enable_privacy_policy";
        public static final String CONNECT_POOL_SIZE = "core_connect_pool_size";
        public static final List<String> GLOBAL_CONSTANTS = Collections.unmodifiableList(Arrays.asList(ENABLE_DETECT_WITH_HTTP, HA_TAG, ENABLE_HTTPDNS, ENABLE_PRIVACY_POLICY, CONNECT_POOL_SIZE));
    }

    public static final class NetworkServiceConstants {
        public static final String IS_CLOUD_SERVICE_ENABLED = "is_cloud_service_enabled";
        public static final String IS_DYNAMIC = "is_dynamic";
    }

    public static final class ProfileConstants {
        public static final String DEFAULT = "default";
        public static final String FILE_MANAGER = "file_manager";
        public static final String RESTFUL = "restful";
        public static final String SCENE_TYPE = "core_scene_type";
        public static final String SCENE_TYPE_OPTION_KEY = "scene_type";
        public static final String SEPARATOR = "|";
    }

    public static final class RequestConstants {
        public static final String INNER_CONNECT_EMPTY_BODY = "core_inner_connect_empty_body";
        public static final String CONNECT_TIMEOUT = "core_connect_timeout";
        public static final String READ_TIMEOUT = "core_read_timeout";
        public static final String WRITE_TIMEOUT = "core_write_timeout";
        public static final String CALL_TIMEOUT = "core_call_timeout";
        public static final String PING_INTERVAL = "core_ping_interval";
        public static final String CONCURRENT_CONNECT_DELAY = "core_concurrent_connect_delay";
        public static final String RETRY_TIME = "core_retry_time";
        public static final String ENABLE_CONCURRENT_CONNECT = "core_enable_concurrent_connect";
        public static final String CONNECT_EMPTY_BODY = "core_connect_empty_body";
        public static final String METRICS_DATA = "core_metrics_data";
        public static final String ENABLE_TRAFFIC_CONTROL_WITH_429 = "core_enable_traffic_control_with_429";
        public static final String MAX_REQUEST_DISCRETE_TIME = "core_max_request_discrete_time";
        public static final String MAX_RETRY_WAITING_TIME = "core_max_retry_waiting_time";
        public static final List<String> REQUEST_CONSTANTS = Collections.unmodifiableList(Arrays.asList(CONNECT_TIMEOUT, READ_TIMEOUT, WRITE_TIMEOUT, CALL_TIMEOUT, PING_INTERVAL, CONCURRENT_CONNECT_DELAY, RETRY_TIME, ENABLE_CONCURRENT_CONNECT, CONNECT_EMPTY_BODY, METRICS_DATA, ENABLE_TRAFFIC_CONTROL_WITH_429, MAX_REQUEST_DISCRETE_TIME, MAX_RETRY_WAITING_TIME));
    }

    public abstract void beginRequest(RequestContext requestContext);

    public abstract void endRequest(RequestContext requestContext);

    public boolean getBoolean(String str, String str2) {
        return StringUtils.stringToBoolean(getValue(str, str2), false);
    }

    public int getInt(String str, String str2) {
        return StringUtils.stringToInteger(getValue(str, str2), -1);
    }

    public long getLong(String str, String str2, long j) {
        return StringUtils.stringToLong(getValue(str, str2), -1L);
    }

    public Map<String, String> getMap(String str, String str2) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(getValue(str, str2));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException unused) {
            Logger.m76963i(TAG, "getMap error " + str2);
        }
        return map;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public abstract String getServiceType();

    public String getString(String str, String str2) {
        return getValue(str, str2);
    }

    public abstract String getValue(String str, String str2);

    public abstract Map<String, String> getValues(String str, String... strArr);
}
