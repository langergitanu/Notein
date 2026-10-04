package com.huawei.agconnect.credential.obs;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.s */
/* JADX INFO: loaded from: classes8.dex */
class C17641s {

    /* JADX INFO: renamed from: a */
    private static final String f52186a = "ParcelableSerializer";

    /* JADX INFO: renamed from: a */
    public static <T> T m75595a(String str, Class<T> cls) {
        try {
            return (T) m75596a(Base64.decode(str, 0), cls);
        } catch (IllegalArgumentException unused) {
            Log.e(f52186a, "Base64 decode error");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static <T> byte[] m75598b(T t) {
        if (t == null || !Parcelable.class.isAssignableFrom(t.getClass())) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        ((Parcelable) t).writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m75596a(byte[] bArr, Class<T> cls) {
        StringBuilder sb;
        if (bArr == null || bArr.length == 0 || !Parcelable.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            Parcelable.Creator creator = (Parcelable.Creator) cls.getField("CREATOR").get(null);
            if (creator != null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                T t = (T) creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                return t;
            }
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder("illegal access exception : ");
            sb.append(e.getMessage());
            Logger.m75327e(f52186a, sb.toString());
        } catch (NoSuchFieldException e2) {
            e = e2;
            sb = new StringBuilder("no such field exception : ");
            sb.append(e.getMessage());
            Logger.m75327e(f52186a, sb.toString());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> String m75597a(T t) {
        return Base64.encodeToString(m75598b(t), 0);
    }
}
