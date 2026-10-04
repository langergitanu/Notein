package com.huawei.agconnect.core.p569a;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.Service;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.core.a.d */
/* JADX INFO: loaded from: classes8.dex */
public final class C17595d {

    /* JADX INFO: renamed from: a */
    private static Map<Class<?>, Service> f52050a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static Map<Class<?>, Object> f52051b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Map<Class<?>, Service> f52052c = new HashMap();

    /* JADX INFO: renamed from: d */
    private Map<Class<?>, Object> f52053d = new HashMap();

    public C17595d(List<Service> list, Context context) {
        m75407a(list, context);
    }

    /* JADX INFO: renamed from: a */
    private Object m75403a(AGConnectInstance aGConnectInstance, Service service) {
        StringBuilder sb;
        if (service.getInstance() != null) {
            return service.getInstance();
        }
        Class<?> type = service.getType();
        if (type == null) {
            return null;
        }
        try {
            Constructor constructorM75404a = m75404a(type, Context.class, AGConnectInstance.class);
            if (constructorM75404a != null) {
                return constructorM75404a.newInstance(aGConnectInstance.getContext(), aGConnectInstance);
            }
            Constructor constructorM75404a2 = m75404a(type, Context.class);
            return constructorM75404a2 != null ? constructorM75404a2.newInstance(aGConnectInstance.getContext()) : type.newInstance();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        } catch (InstantiationException e2) {
            e = e2;
            sb = new StringBuilder("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        } catch (InvocationTargetException e3) {
            e = e3;
            sb = new StringBuilder("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public <T> T m75406a(AGConnectInstance aGConnectInstance, Class<?> cls) {
        T t;
        Service service = this.f52052c.get(cls);
        if (service == null && (service = f52050a.get(cls)) != null) {
            return (T) f52051b.get(cls);
        }
        if (service == null) {
            return null;
        }
        if (service.isSingleton() && (t = (T) this.f52053d.get(cls)) != null) {
            return t;
        }
        T t2 = (T) m75403a(aGConnectInstance, service);
        if (t2 != null && service.isSingleton()) {
            this.f52053d.put(cls, t2);
        }
        return t2;
    }

    /* JADX INFO: renamed from: a */
    private static Constructor m75404a(Class cls, Class... clsArr) {
        boolean z = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i = 0; i < clsArr.length; i++) {
                    z = parameterTypes[i] == clsArr[i];
                }
                if (z) {
                    return constructor;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m75405a(String str, Exception exc) {
        Log.e("AGC_ServiceRepository", "Instantiate shared service " + str + exc.getLocalizedMessage());
        StringBuilder sb = new StringBuilder("cause message:");
        sb.append(exc.getCause() != null ? exc.getCause().getMessage() : "");
        Log.e("AGC_ServiceRepository", sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public void m75407a(List<Service> list, Context context) {
        Map<Class<?>, Service> map;
        String str;
        Log.d("AGC_ServiceRepository", "addService start");
        if (list == null) {
            return;
        }
        for (Service service : list) {
            if (service.isSharedInstance()) {
                if (!f52050a.containsKey(service.getInterface())) {
                    map = f52050a;
                }
                if (!service.isAutoCreated() && service.getType() != null && !f52051b.containsKey(service.getInterface())) {
                    try {
                        Constructor constructorM75404a = m75404a(service.getType(), Context.class);
                        f52051b.put(service.getInterface(), constructorM75404a != null ? constructorM75404a.newInstance(context) : service.getType().newInstance());
                    } catch (IllegalAccessException e) {
                        e = e;
                        str = "AccessException";
                        m75405a(str, e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        str = "InstantiationException";
                        m75405a(str, e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        str = "TargetException";
                        m75405a(str, e);
                    }
                }
            } else {
                map = this.f52052c;
            }
            map.put(service.getInterface(), service);
            if (!service.isAutoCreated()) {
            }
        }
        Log.d("AGC_ServiceRepository", "addService end");
    }
}
