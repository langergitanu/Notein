package com.huawei.agconnect.core.p569a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.huawei.agconnect.core.ServiceRegistrar;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.core.a.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17594c {

    /* JADX INFO: renamed from: a */
    private final Context f52049a;

    /* JADX INFO: renamed from: com.huawei.agconnect.core.a.c$a */
    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public C17594c(Context context) {
        this.f52049a = context;
    }

    /* JADX INFO: renamed from: a */
    private <T extends ServiceRegistrar> T m75398a(String str) {
        StringBuilder sb;
        String string;
        try {
            Class<?> cls = Class.forName(str);
            if (ServiceRegistrar.class.isAssignableFrom(cls)) {
                return (T) Class.forName(str).newInstance();
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e) {
            string = "Can not found service class, " + e.getMessage();
            Log.e("AGC_Registrar", string);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            string = sb.toString();
            Log.e("AGC_Registrar", string);
            return null;
        } catch (InstantiationException e3) {
            e = e3;
            sb = new StringBuilder("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            string = sb.toString();
            Log.e("AGC_Registrar", string);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private List<String> m75399b() {
        String strConcat;
        ArrayList arrayList = new ArrayList();
        Bundle bundleM75400c = m75400c();
        if (bundleM75400c != null) {
            HashMap map = new HashMap(10);
            for (String str : bundleM75400c.keySet()) {
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(bundleM75400c.getString(str))) {
                    String[] strArrSplit = str.split(C18241k5.f55433h);
                    if (strArrSplit.length == 2) {
                        try {
                            map.put(strArrSplit[0], Integer.valueOf(strArrSplit[1]));
                        } catch (NumberFormatException e) {
                            strConcat = "registrar configuration format error:" + e.getMessage();
                            Log.e("AGC_Registrar", strConcat);
                        }
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0], 1000);
                    } else {
                        strConcat = "registrar configuration error, ".concat(str);
                        Log.e("AGC_Registrar", strConcat);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new a());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private Bundle m75400c() {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.f52049a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f52049a, (Class<?>) ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<Service> m75401a() {
        Log.i("AGC_Registrar", "getServices");
        List<String> listM75399b = m75399b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM75399b.iterator();
        while (it.hasNext()) {
            ServiceRegistrar serviceRegistrarM75398a = m75398a(it.next());
            if (serviceRegistrarM75398a != null) {
                serviceRegistrarM75398a.initialize(this.f52049a);
                List<Service> services = serviceRegistrarM75398a.getServices(this.f52049a);
                if (services != null) {
                    arrayList.addAll(services);
                }
            }
        }
        Log.i("AGC_Registrar", "services:" + arrayList.size());
        return arrayList;
    }
}
