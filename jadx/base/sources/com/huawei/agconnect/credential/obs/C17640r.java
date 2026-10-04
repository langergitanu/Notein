package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.Parcelable;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.r */
/* JADX INFO: loaded from: classes8.dex */
public class C17640r<T> extends C17642t<T> {

    /* JADX INFO: renamed from: c */
    private static final String f52184c = "CryptoSharePreferenceDataStore";

    /* JADX INFO: renamed from: d */
    private final InterfaceC17638p f52185d;

    public C17640r(Context context, String str, Class<T> cls, InterfaceC17638p interfaceC17638p) {
        super(context, str, cls);
        this.f52185d = interfaceC17638p;
    }

    /* JADX INFO: renamed from: d */
    private Object m75594d(String str) {
        try {
            if (Integer.class.equals(this.f52189b)) {
                return Integer.valueOf(str);
            }
            if (Long.class.equals(this.f52189b)) {
                return Long.valueOf(str);
            }
            if (Float.class.equals(this.f52189b)) {
                return Float.valueOf(str);
            }
            if (Boolean.class.equals(this.f52189b)) {
                return Boolean.valueOf(str);
            }
            if (String.class.equals(this.f52189b)) {
                return str;
            }
            if (Parcelable.class.isAssignableFrom(this.f52189b)) {
                return C17641s.m75595a(str, this.f52189b);
            }
            Logger.m75331w(f52184c, "stringToObject not support object type");
            return null;
        } catch (NumberFormatException unused) {
            Logger.m75327e(f52184c, "number format exception");
            return null;
        }
    }

    @Override // com.huawei.agconnect.credential.obs.C17642t, com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: a */
    public T mo75588a(String str, T t) {
        T t2;
        String str2 = (String) m75599a(str, null, String.class);
        return (str2 == null || (t2 = (T) m75594d(this.f52185d.decrypt(str2))) == null) ? t : t2;
    }

    @Override // com.huawei.agconnect.credential.obs.C17642t, com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: b */
    public T mo75590b(String str) {
        return mo75588a(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private String m75593a(T t) {
        if (!Integer.class.equals(this.f52189b) && !Long.class.equals(this.f52189b) && !Float.class.equals(this.f52189b) && !Boolean.class.equals(this.f52189b)) {
            if (String.class.equals(this.f52189b)) {
                return (String) t;
            }
            if (Parcelable.class.isAssignableFrom(this.f52189b)) {
                return C17641s.m75597a((Parcelable) t);
            }
            Logger.m75331w(f52184c, "objectToString not support object type");
            return null;
        }
        return t.toString();
    }

    @Override // com.huawei.agconnect.credential.obs.C17642t, com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: b */
    public void mo75591b(String str, T t) {
        if (t == null) {
            return;
        }
        super.m75600b(str, this.f52185d.encrypt(m75593a(t)), String.class);
    }
}
