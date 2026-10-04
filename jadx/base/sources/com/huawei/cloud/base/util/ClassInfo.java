package com.huawei.cloud.base.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class ClassInfo {
    private static final Map<Class<?>, ClassInfo> CACHE = new WeakHashMap();
    private static final Map<Class<?>, ClassInfo> CACHE_IGNORE_CASE = new WeakHashMap();
    private final Class<?> clazz;
    private final boolean ignoreCase;
    private final IdentityHashMap<String, FieldInfo> nameToFieldInfoMap = new IdentityHashMap<>();
    final List<String> names;

    private ClassInfo(Class<?> cls, boolean z) {
        this.clazz = cls;
        this.ignoreCase = z;
        Preconditions.checkArgument((z && cls.isEnum()) ? false : true, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: com.huawei.cloud.base.util.ClassInfo.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                if (Objects.equal(str, str2)) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field : cls.getDeclaredFields()) {
            FieldInfo fieldInfoM75687of = FieldInfo.m75687of(field);
            if (fieldInfoM75687of != null) {
                String name = fieldInfoM75687of.getName();
                name = z ? name.toLowerCase(Locale.US).intern() : name;
                FieldInfo fieldInfo = this.nameToFieldInfoMap.get(name);
                Preconditions.checkArgument(fieldInfo == null, "two fields have the same %sname <%s>: %s and %s", z ? "case-insensitive " : "", name, field, fieldInfo == null ? null : fieldInfo.getField());
                this.nameToFieldInfoMap.put(name, fieldInfoM75687of);
                treeSet.add(name);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            ClassInfo classInfoM75685of = m75685of(superclass, z);
            treeSet.addAll(classInfoM75685of.names);
            for (Map.Entry<String, FieldInfo> entry : classInfoM75685of.nameToFieldInfoMap.entrySet()) {
                String key = entry.getKey();
                if (!this.nameToFieldInfoMap.containsKey(key)) {
                    this.nameToFieldInfoMap.put(key, entry.getValue());
                }
            }
        }
        this.names = treeSet.isEmpty() ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* JADX INFO: renamed from: of */
    public static ClassInfo m75684of(Class<?> cls) {
        return m75685of(cls, false);
    }

    public Field getField(String str) {
        FieldInfo fieldInfo = getFieldInfo(str);
        if (fieldInfo == null) {
            return null;
        }
        return fieldInfo.getField();
    }

    public FieldInfo getFieldInfo(String str) {
        if (str != null) {
            if (this.ignoreCase) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.nameToFieldInfoMap.get(str);
    }

    public Collection<FieldInfo> getFieldInfos() {
        return Collections.unmodifiableCollection(this.nameToFieldInfoMap.values());
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public Collection<String> getNames() {
        return this.names;
    }

    public Class<?> getUnderlyingClass() {
        return this.clazz;
    }

    public boolean isEnum() {
        return this.clazz.isEnum();
    }

    /* JADX INFO: renamed from: of */
    public static ClassInfo m75685of(Class<?> cls, boolean z) {
        ClassInfo classInfo;
        if (cls == null) {
            return null;
        }
        Map<Class<?>, ClassInfo> map = z ? CACHE_IGNORE_CASE : CACHE;
        synchronized (map) {
            try {
                classInfo = map.get(cls);
                if (classInfo == null) {
                    classInfo = new ClassInfo(cls, z);
                    map.put(cls, classInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return classInfo;
    }
}
