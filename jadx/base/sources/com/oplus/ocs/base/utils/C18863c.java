package com.oplus.ocs.base.utils;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: renamed from: com.oplus.ocs.base.utils.c */
/* JADX INFO: loaded from: classes9.dex */
public class C18863c {

    /* JADX INFO: renamed from: a */
    public static final String f57608a = "c";

    /* JADX INFO: renamed from: b */
    private static final HashMap<ClassLoader, HashMap<String, Parcelable.Creator<?>>> f57609b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static final <T extends Parcelable> T m80550a(Parcel parcel, ClassLoader classLoader, String str) {
        Parcelable.Creator<?> creatorM80552b = m80552b(parcel, classLoader, str);
        if (creatorM80552b == null) {
            return null;
        }
        return creatorM80552b instanceof Parcelable.ClassLoaderCreator ? (T) ((Parcelable.ClassLoaderCreator) creatorM80552b).createFromParcel(parcel, classLoader) : (T) creatorM80552b.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    private static Parcelable.Creator<?> m80552b(Parcel parcel, ClassLoader classLoader, String str) {
        HashMap<String, Parcelable.Creator<?>> map;
        Parcelable.Creator<?> creator;
        if (parcel.readString() == null) {
            return null;
        }
        HashMap<ClassLoader, HashMap<String, Parcelable.Creator<?>>> map2 = f57609b;
        synchronized (map2) {
            try {
                map = map2.get(classLoader);
                if (map == null) {
                    map = new HashMap<>();
                    map2.put(classLoader, map);
                }
                creator = map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (creator != null) {
            return creator;
        }
        try {
            Class<?> cls = Class.forName(str, false, classLoader);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new BadParcelableException("Parcelable protocol requires subclassing from Parcelable on class ".concat(String.valueOf(str)));
            }
            Field field = cls.getField("CREATOR");
            if ((field.getModifiers() & 8) == 0) {
                throw new BadParcelableException("Parcelable protocol requires the CREATOR object to be static on class ".concat(String.valueOf(str)));
            }
            if (!Parcelable.Creator.class.isAssignableFrom(field.getType())) {
                throw new BadParcelableException("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ".concat(String.valueOf(str)));
            }
            Parcelable.Creator<?> creator2 = (Parcelable.Creator) field.get(null);
            if (creator2 == null) {
                throw new BadParcelableException("Parcelable protocol requires a non-null Parcelable.Creator object called CREATOR on class ".concat(String.valueOf(str)));
            }
            synchronized (map2) {
                map.put(str, creator2);
            }
            return creator2;
        } catch (ClassNotFoundException e) {
            Log.e(f57608a, "Class not found when unmarshalling: ".concat(String.valueOf(str)), e);
            throw new BadParcelableException("ClassNotFoundException when unmarshalling: ".concat(String.valueOf(str)));
        } catch (IllegalAccessException e2) {
            Log.e(f57608a, "Illegal access when unmarshalling: ".concat(String.valueOf(str)), e2);
            throw new BadParcelableException("IllegalAccessException when unmarshalling: ".concat(String.valueOf(str)));
        } catch (NoSuchFieldException unused) {
            throw new BadParcelableException("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m80551a(Parcel parcel, Parcelable parcelable, String str) {
        if (parcelable == null) {
            parcel.writeString(null);
        } else {
            parcel.writeString(str);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
