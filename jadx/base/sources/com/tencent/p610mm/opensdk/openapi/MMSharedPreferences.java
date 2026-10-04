package com.tencent.p610mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.google.firebase.remoteconfig.C22788OooO0o0;
import com.huawei.hms.network.embedded.C18437z2;
import com.tencent.p610mm.opensdk.channel.p611a.C18915a;
import com.tencent.p610mm.opensdk.utils.C18922a;
import com.tencent.p610mm.opensdk.utils.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";

    /* JADX INFO: renamed from: cr */
    private final ContentResolver f58124cr;
    private final String[] columns = {"_id", "key", C18437z2.f56754h, "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    public static class REditor implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: cr */
        private ContentResolver f58125cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.f58125cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x003e A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean commit() {
            String str;
            ContentValues contentValues = new ContentValues();
            if (this.clear) {
                this.f58125cr.delete(C18922a.f58126a, null, null);
                this.clear = false;
            }
            Iterator<String> it = this.remove.iterator();
            while (it.hasNext()) {
                this.f58125cr.delete(C18922a.f58126a, "key = ?", new String[]{it.next()});
            }
            Iterator<Map.Entry<String, Object>> it2 = this.values.entrySet().iterator();
            while (true) {
                int i = 1;
                if (!it2.hasNext()) {
                    return true;
                }
                Map.Entry<String, Object> next = it2.next();
                Object value = next.getValue();
                if (value == null) {
                    str = "unresolve failed, null value";
                } else {
                    if (!(value instanceof Integer)) {
                        if (value instanceof Long) {
                            i = 2;
                        } else if (value instanceof String) {
                            i = 3;
                        } else if (value instanceof Boolean) {
                            i = 4;
                        } else if (value instanceof Float) {
                            i = 5;
                        } else if (value instanceof Double) {
                            i = 6;
                        } else {
                            str = "unresolve failed, unknown type=" + value.getClass().toString();
                        }
                    }
                    if (i == 0) {
                        contentValues.put(C18437z2.f56754h, Integer.valueOf(i));
                        contentValues.put("value", value.toString());
                        this.f58125cr.update(C18922a.f58126a, contentValues, "key = ?", new String[]{next.getKey()});
                    }
                }
                Log.m80584e("MicroMsg.SDK.PluginProvider.Resolver", str);
                i = 0;
                if (i == 0) {
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.f58124cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor cursorQuery = this.f58124cr.query(C18922a.f58126a, this.columns, "key = ?", new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            Object objM80567a = cursorQuery.moveToFirst() ? C18915a.m80567a(cursorQuery.getInt(cursorQuery.getColumnIndex(C18437z2.f56754h)), cursorQuery.getString(cursorQuery.getColumnIndex("value"))) : null;
            cursorQuery.close();
            return objM80567a;
        } catch (Exception e) {
            C22788OooO0o0.OooO00o(e, new StringBuilder("getValue exception:"), TAG);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.f58124cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor cursorQuery = this.f58124cr.query(C18922a.f58126a, this.columns, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("key");
            int columnIndex2 = cursorQuery.getColumnIndex(C18437z2.f56754h);
            int columnIndex3 = cursorQuery.getColumnIndex("value");
            while (cursorQuery.moveToNext()) {
                this.values.put(cursorQuery.getString(columnIndex), C18915a.m80567a(cursorQuery.getInt(columnIndex2), cursorQuery.getString(columnIndex3)));
            }
            cursorQuery.close();
            return this.values;
        } catch (Exception e) {
            C22788OooO0o0.OooO00o(e, new StringBuilder("getAll exception:"), TAG);
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
