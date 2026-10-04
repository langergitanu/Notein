package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.t */
/* JADX INFO: loaded from: classes8.dex */
public class C17642t<T> implements InterfaceC17639q<T> {

    /* JADX INFO: renamed from: c */
    private static final String f52187c = "SharePreferenceDataStore";

    /* JADX INFO: renamed from: a */
    final SharedPreferences f52188a;

    /* JADX INFO: renamed from: b */
    final Class<T> f52189b;

    public C17642t(Context context, String str, Class<T> cls) {
        this.f52188a = context.getSharedPreferences(str, 0);
        this.f52189b = cls;
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: a */
    public T mo75588a(String str, T t) {
        return (T) m75599a(str, t, this.f52189b);
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: b */
    public T mo75590b(String str) {
        return mo75588a(str, null);
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: c */
    public void mo75592c(String str) {
        this.f52188a.edit().remove(str).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public Object m75599a(String str, T t, Class<?> cls) {
        if (Integer.class.equals(cls)) {
            return Integer.valueOf(this.f52188a.getInt(str, ((Integer) t).intValue()));
        }
        if (Long.class.equals(cls)) {
            return Long.valueOf(this.f52188a.getLong(str, ((Long) t).longValue()));
        }
        if (Float.class.equals(cls)) {
            return Float.valueOf(this.f52188a.getFloat(str, ((Float) t).floatValue()));
        }
        if (Boolean.class.equals(cls)) {
            return Boolean.valueOf(this.f52188a.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (String.class.equals(cls)) {
            return this.f52188a.getString(str, (String) t);
        }
        if (Parcelable.class.isAssignableFrom(cls)) {
            return C17641s.m75595a(this.f52188a.getString(str, null), cls);
        }
        Logger.m75331w(f52187c, "read not support object type");
        return t;
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: b */
    public void mo75591b(String str, T t) {
        m75600b(str, t, this.f52189b);
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17639q
    /* JADX INFO: renamed from: a */
    public boolean mo75589a(String str) {
        return this.f52188a.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public void m75600b(String str, Object obj, Class<?> cls) {
        if (Integer.class.equals(cls)) {
            this.f52188a.edit().putInt(str, ((Integer) obj).intValue()).apply();
            return;
        }
        if (Long.class.equals(cls)) {
            this.f52188a.edit().putLong(str, ((Long) obj).longValue()).apply();
            return;
        }
        if (Float.class.equals(cls)) {
            this.f52188a.edit().putFloat(str, ((Float) obj).floatValue()).apply();
            return;
        }
        if (Boolean.class.equals(cls)) {
            this.f52188a.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            return;
        }
        if (String.class.equals(cls)) {
            this.f52188a.edit().putString(str, (String) obj).apply();
        } else if (!Parcelable.class.isAssignableFrom(cls)) {
            Logger.m75331w(f52187c, "write not support object type");
        } else {
            this.f52188a.edit().putString(str, C17641s.m75597a((Parcelable) obj)).apply();
        }
    }
}
