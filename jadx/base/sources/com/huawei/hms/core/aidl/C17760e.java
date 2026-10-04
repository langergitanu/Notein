package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.aspose.slides.internal.p407st.OooO00o;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.core.aidl.e */
/* JADX INFO: loaded from: classes6.dex */
public class C17760e {
    /* JADX INFO: renamed from: b */
    private void m75903b(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        m75908a(field.getName(), field.get(iMessageEntity), bundle);
        field.setAccessible(zIsAccessible);
    }

    /* JADX INFO: renamed from: a */
    public IMessageEntity m75906a(Bundle bundle, IMessageEntity iMessageEntity) {
        if (bundle == null) {
            return iMessageEntity;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        m75902a(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        Log.e("MessageCodec", "decode, set value of the field exception, field name:" + field.getName());
                    }
                }
            }
        }
        return iMessageEntity;
    }

    /* JADX INFO: renamed from: b */
    private boolean m75904b(String str, Object obj, Bundle bundle) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m75902a(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
        Object objM75901a = m75901a(field, bundle);
        if (objM75901a != null) {
            boolean zIsAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(iMessageEntity, objM75901a);
            field.setAccessible(zIsAccessible);
        }
    }

    /* JADX INFO: renamed from: a */
    private Object m75901a(Field field, Bundle bundle) {
        String name = field.getName();
        Object obj = bundle.get(name);
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i = bundle2.getInt("_val_type_", -1);
                if (i == 1) {
                    return mo75907a(field.getGenericType(), bundle2);
                }
                if (i == 0) {
                    return m75906a((Bundle) obj, (IMessageEntity) field.getType().newInstance());
                }
            } catch (Exception unused) {
                OooO00o.OooO0O0("decode, read value of the field exception, field name: ", name, "MessageCodec");
                return null;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public List<Object> mo75907a(Type type, Bundle bundle) throws IllegalAccessException, InstantiationException {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle2 = bundle.getBundle("_next_item_"); bundle2 != null; bundle2 = bundle2.getBundle("_next_item_")) {
            Object obj = bundle2.get("_value_");
            if (!obj.getClass().isPrimitive() && !(obj instanceof String) && !(obj instanceof Serializable)) {
                if (obj instanceof Bundle) {
                    Bundle bundle3 = (Bundle) obj;
                    int i = bundle3.getInt("_val_type_", -1);
                    if (i == 1) {
                        throw new InstantiationException("Nested List can not be supported");
                    }
                    if (i == 0) {
                        arrayList.add(m75906a(bundle3, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
                    } else {
                        throw new InstantiationException("Unknown type can not be supported");
                    }
                } else {
                    continue;
                }
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m75905a(IMessageEntity iMessageEntity, Bundle bundle) {
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        m75903b(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        Log.e("MessageCodec", "encode, get value of the field exception, field name: " + field.getName());
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public void m75908a(String str, Object obj, Bundle bundle) {
        if (obj == null || m75904b(str, obj, bundle)) {
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
            return;
        }
        if (obj instanceof List) {
            mo75909a(str, (List) obj, bundle);
            return;
        }
        if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else {
            if (obj instanceof IMessageEntity) {
                Bundle bundleM75905a = m75905a((IMessageEntity) obj, new Bundle());
                bundleM75905a.putInt("_val_type_", 0);
                bundle.putBundle(str, bundleM75905a);
                return;
            }
            OooO00o.OooO0O0("cannot support type, ", str, "MessageCodec");
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo75909a(String str, List list, Bundle bundle) {
        Bundle bundleM75900a = null;
        for (Object obj : list) {
            if (bundleM75900a == null) {
                bundleM75900a = new Bundle();
                bundle.putBundle(str, bundleM75900a);
                bundleM75900a.putInt("_val_type_", 1);
            }
            bundleM75900a = m75900a("_value_", bundleM75900a, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private Bundle m75900a(String str, Bundle bundle, Object obj) {
        Bundle bundle2 = new Bundle();
        m75908a(str, obj, bundle2);
        bundle.putBundle("_next_item_", bundle2);
        return bundle2;
    }
}
