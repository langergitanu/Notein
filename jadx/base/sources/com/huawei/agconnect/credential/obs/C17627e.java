package com.huawei.agconnect.credential.obs;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.e */
/* JADX INFO: loaded from: classes8.dex */
public class C17627e {

    /* JADX INFO: renamed from: b */
    private static final String f52158b = "";

    /* JADX INFO: renamed from: c */
    private static final String f52159c = "move_to_de_records";

    /* JADX INFO: renamed from: a */
    protected SharedPreferences f52160a;

    public C17627e(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("context is null!");
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(f52159c, 0);
        if (sharedPreferences.getBoolean(str, false)) {
            context = contextCreateDeviceProtectedStorageContext;
        } else if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
            context = contextCreateDeviceProtectedStorageContext;
        }
        this.f52160a = context.getSharedPreferences(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public ContentValues m75533a() {
        Map<String, ?> all;
        Float fValueOf;
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                contentValues.put(key, String.valueOf(value));
            } else if ((value instanceof Integer) || (value instanceof Short) || (value instanceof Byte)) {
                contentValues.put(key, (Integer) value);
            } else if (value instanceof Long) {
                contentValues.put(key, (Long) value);
            } else {
                if (value instanceof Float) {
                    fValueOf = (Float) value;
                } else if (value instanceof Double) {
                    fValueOf = Float.valueOf((float) ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    contentValues.put(key, (Boolean) value);
                }
                contentValues.put(key, fValueOf);
            }
        }
        return contentValues;
    }

    /* JADX INFO: renamed from: b */
    public String m75543b(String str) {
        SharedPreferences sharedPreferences = this.f52160a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    /* JADX INFO: renamed from: c */
    public int m75545c(String str) {
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public long m75547d(String str) {
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public boolean m75548e(String str) {
        SharedPreferences sharedPreferences = this.f52160a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m75549f(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (editorEdit = this.f52160a.edit()) == null) {
            return false;
        }
        return editorEdit.remove(str).commit();
    }

    /* JADX INFO: renamed from: a */
    public void m75534a(String str, Integer num) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putInt(str, num.intValue()).commit();
    }

    /* JADX INFO: renamed from: b */
    public Map<String, ?> m75544b() {
        SharedPreferences sharedPreferences = this.f52160a;
        return sharedPreferences != null ? sharedPreferences.getAll() : new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public boolean m75546c() {
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().clear().commit();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m75535a(String str, Long l) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong(str, l.longValue()).commit();
    }

    /* JADX INFO: renamed from: a */
    public void m75536a(String str, boolean z) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putBoolean(str, z).commit();
    }

    /* JADX INFO: renamed from: a */
    public void m75537a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m75540a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m75538a(ContentValues contentValues) {
        if (this.f52160a == null || contentValues == null) {
            return false;
        }
        boolean z = true;
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            if (!m75540a(entry.getKey(), entry.getValue())) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75539a(String str) {
        SharedPreferences sharedPreferences = this.f52160a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m75540a(String str, Object obj) {
        float fDoubleValue;
        int iByteValue;
        SharedPreferences.Editor editorEdit = this.f52160a.edit();
        if (obj instanceof String) {
            editorEdit.putString(str, String.valueOf(obj));
        } else {
            if (obj instanceof Integer) {
                iByteValue = ((Integer) obj).intValue();
            } else if (obj instanceof Short) {
                iByteValue = ((Short) obj).shortValue();
            } else if (obj instanceof Byte) {
                iByteValue = ((Byte) obj).byteValue();
            } else if (obj instanceof Long) {
                editorEdit.putLong(str, ((Long) obj).longValue());
            } else {
                if (obj instanceof Float) {
                    fDoubleValue = ((Float) obj).floatValue();
                } else if (obj instanceof Double) {
                    fDoubleValue = (float) ((Double) obj).doubleValue();
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                }
                editorEdit.putFloat(str, fDoubleValue);
            }
            editorEdit.putInt(str, iByteValue);
        }
        return editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public boolean m75541a(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f52160a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }

    /* JADX INFO: renamed from: a */
    public boolean m75542a(String[] strArr) {
        if (this.f52160a == null) {
            return false;
        }
        for (String str : strArr) {
            if (this.f52160a.contains(str)) {
                this.f52160a.edit().remove(str);
            }
        }
        this.f52160a.edit().commit();
        return true;
    }
}
