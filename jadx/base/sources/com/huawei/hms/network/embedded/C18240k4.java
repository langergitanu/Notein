package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.CreateFileUtil;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.hquic.HQUICManager;
import com.huawei.hms.network.base.util.HttpUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18240k4 {

    /* JADX INFO: renamed from: d */
    public static final String f55410d = "CronetNegotiateManager";

    /* JADX INFO: renamed from: e */
    public static final String f55411e = "";

    /* JADX INFO: renamed from: f */
    public static final String f55412f = "org.chromium.net.CronetEngine";

    /* JADX INFO: renamed from: g */
    public static final String f55413g = "com.huawei.hms.hquic.HQUICManager";

    /* JADX INFO: renamed from: h */
    public static final int f55414h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f55415i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f55416j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f55417k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f55418l = 5242880;

    /* JADX INFO: renamed from: m */
    public static final int f55419m = 8192;

    /* JADX INFO: renamed from: n */
    public static int f55420n = 443;

    /* JADX INFO: renamed from: o */
    public static volatile C18240k4 f55421o;

    /* JADX INFO: renamed from: b */
    public boolean f55423b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, C18322q4> f55422a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f55424c = 0;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k4$a */
    public class a implements HQUICManager.HQUICInitCallback {
        public a() {
        }

        public void onFail(Exception exc) {
            C18240k4.this.f55424c = 3;
            if (exc instanceof IllegalArgumentException) {
                Logger.m76963i(C18240k4.f55410d, "invalid argument, reason:" + exc.getMessage());
            }
        }

        public void onSuccess() {
            C18240k4.this.f55424c = 2;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k4$b */
    public static class b {
        public void onResponse(String str) {
            C18240k4.getInstance().m78968b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78968b(String str) {
        String strM78971d;
        try {
            strM78971d = m78971d(str);
        } catch (IOException e) {
            e = e;
            strM78971d = null;
        }
        try {
            Logger.m76965v(f55410d, "load Quic config info success.");
        } catch (IOException e2) {
            e = e2;
            Logger.m76969w(f55410d, "read local Quic cache occur error, exception:%s", e.getClass().getSimpleName());
        }
        if (TextUtils.isEmpty(strM78971d)) {
            Logger.m76965v(f55410d, "configInfo is null or empty.");
        } else {
            m78967a(strM78971d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX INFO: renamed from: c */
    private String m78970c(String str) throws Throwable {
        Throwable th;
        IOException e;
        Reader reader;
        ?? r10;
        IOException e2;
        InputStreamReader inputStreamReader;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                str = CreateFileUtil.newFileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                inputStreamReader = new InputStreamReader((InputStream) str, "UTF-8");
            } catch (IOException e3) {
                e = e3;
                e2 = e;
                Logger.m76961e(f55410d, "this method readToBuffer occur error.", e2);
                throw e2;
            } catch (Throwable th3) {
                th = th3;
                reader = null;
                r10 = str;
                IoUtils.closeSecure(reader);
                IoUtils.closeSecure((Reader) inputStreamReader2);
                IoUtils.closeSecure((InputStream) r10);
                throw th;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[8192];
                    do {
                        int i = bufferedReader.read(cArr);
                        if (i <= 0) {
                            IoUtils.closeSecure((Reader) bufferedReader);
                            IoUtils.closeSecure((Reader) inputStreamReader);
                            IoUtils.closeSecure((InputStream) str);
                            return sb.toString();
                        }
                        sb.append(new String(cArr, 0, i));
                    } while (sb.length() <= 5242880);
                    Logger.m76960e(f55410d, "readFromPath failed,file content is very big.");
                    IoUtils.closeSecure((Reader) bufferedReader);
                    IoUtils.closeSecure((Reader) inputStreamReader);
                    IoUtils.closeSecure((InputStream) str);
                    return "";
                } catch (IOException e4) {
                    e2 = e4;
                    Logger.m76961e(f55410d, "this method readToBuffer occur error.", e2);
                    throw e2;
                }
            } catch (IOException e5) {
                e = e5;
                e2 = e;
                Logger.m76961e(f55410d, "this method readToBuffer occur error.", e2);
                throw e2;
            } catch (Throwable th4) {
                th = th4;
                reader = null;
                inputStreamReader2 = inputStreamReader;
                r10 = str;
                IoUtils.closeSecure(reader);
                IoUtils.closeSecure((Reader) inputStreamReader2);
                IoUtils.closeSecure((InputStream) r10);
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Throwable th5) {
            th = th5;
            str = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private String m78971d(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File fileNewFile = CreateFileUtil.newFile(str);
        return (fileNewFile.exists() && fileNewFile.isFile()) ? m78970c(str) : "";
    }

    public static C18240k4 getInstance() {
        if (f55421o == null) {
            synchronized (C18240k4.class) {
                try {
                    if (f55421o == null) {
                        f55421o = new C18240k4();
                    }
                } finally {
                }
            }
        }
        return f55421o;
    }

    public void addQuicHint(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76960e(f55410d, "invalid argument");
            return;
        }
        try {
            URL url = new URL(!HttpUtils.isHttpUrl(str) ? OooO00o.OooO00o("https://", str) : str);
            C18322q4 c18322q4 = this.f55422a.get(url.getHost());
            int port = url.getPort() == -1 ? f55420n : url.getPort();
            if (c18322q4 == null || port != c18322q4.getPort()) {
                c18322q4 = new C18322q4();
                c18322q4.setHost(url.getHost());
                c18322q4.setPort(port);
                c18322q4.setAlternatePort(port);
                c18322q4.setEnableQuic(z);
                Logger.m76967w(f55410d, "QuicHit:" + c18322q4);
            }
            this.f55422a.put(c18322q4.getHost(), c18322q4);
        } catch (MalformedURLException unused) {
            Logger.m76960e(f55410d, "add QuicHit failed，please check domian format:" + str);
        }
    }

    public ConcurrentHashMap<String, C18322q4> getQuicHints() {
        return this.f55422a;
    }

    public boolean isAvailable() {
        Logger.m76963i(f55410d, "initHmsQuicProviderState code is: " + this.f55424c);
        return this.f55424c == 2;
    }

    public Boolean isEnableQuic(String str, int i) {
        Logger.m76966v(f55410d, "isEnableQuic is execute,and the map is: %s", this.f55422a.keySet().toString());
        C18322q4 c18322q4 = this.f55422a.get(str);
        if (c18322q4 == null || !c18322q4.getEnableQuic() || (i != -1 && i != c18322q4.getPort())) {
            return Boolean.FALSE;
        }
        Logger.m76965v(f55410d, "use cronet and request");
        return Boolean.TRUE;
    }

    public boolean isSupportCronet() {
        try {
            Class.forName(f55412f);
            return true;
        } catch (ClassNotFoundException e) {
            Logger.m76969w(f55410d, "load network-quic CronetEngine class failed, exception:%s", e.getClass().getSimpleName());
            return false;
        }
    }

    public void lazyInitHmsQuicLoader() {
        synchronized (this) {
            if (this.f55424c != 0) {
                Logger.m76963i(f55410d, "run lazyInitHmsQuicLoader before");
            } else {
                try {
                    Class.forName(f55413g);
                    this.f55424c = 1;
                    m78965a();
                } catch (ClassNotFoundException e) {
                    Logger.m76969w(f55410d, "load com.huawei.hms.hquic.HQUICManagerclass failed, exception:%s", e.getClass().getSimpleName());
                    this.f55424c = 3;
                }
            }
        }
    }

    public void loadQuicConf() {
        if (m78969b()) {
            Logger.m76963i(f55410d, "begin to loading the config file!");
            synchronized (this) {
                try {
                    if (this.f55423b) {
                        Logger.m76967w(f55410d, "the process is running,and you shouldn't execute it once!");
                    } else {
                        this.f55423b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int mappingCronetErrorCode(Exception exc) {
        if (exc == null) {
            return ExceptionCode.NETWORK_IO_EXCEPTION;
        }
        isAvailable();
        return ExceptionCode.NETWORK_IO_EXCEPTION;
    }

    public void updateQuicHints(String str, int i, boolean z) {
        if (str != null && !z) {
            this.f55422a.remove(str);
        }
        if (str == null) {
            Logger.m76965v(f55410d, "host == null");
            return;
        }
        C18322q4 c18322q4 = this.f55422a.get(str);
        if (c18322q4 == null || !(i == -1 || i == c18322q4.getPort())) {
            Logger.m76966v(f55410d, "server negotiate port is %d, but there is not compatible config or historical success record", Integer.valueOf(i));
        } else {
            Logger.m76966v(f55410d, "the host:%s will use cronet next time", str);
            c18322q4.setEnableQuic(z);
        }
        Logger.m76966v(f55410d, "updateQuicHints is execute,and the map is: %s", this.f55422a.keySet().toString());
    }

    /* JADX INFO: renamed from: a */
    private void m78965a() {
        HQUICManager.asyncInit(ContextHolder.getResourceContext(), new a());
    }

    /* JADX INFO: renamed from: b */
    private boolean m78969b() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m78967a(String str) {
        Logger.m76966v(f55410d, "the configInfo is %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("networkkit").getJSONObject("networkkit_quic").getJSONObject("services");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                if (TextUtils.isEmpty(next) || TextUtils.isEmpty(string)) {
                    Logger.m76960e(f55410d, "config file has been broken.");
                } else if (StringUtils.stringToInteger(string, -1) == 1) {
                    addQuicHint(next, false);
                }
            }
            Logger.m76966v(f55410d, "loadConfigToCache is execute,and the map size is:%s---%s", Integer.valueOf(this.f55422a.size()), this.f55422a.keySet().toString());
        } catch (JSONException e) {
            Logger.m76968w(f55410d, "parse JSON occur error.", e);
        }
    }

    public void addQuicHint(List<String> list, boolean z) {
        if (list == null) {
            Logger.m76960e(f55410d, "invalid argument");
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            addQuicHint(it.next(), z);
        }
    }
}
