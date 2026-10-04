package com.huawei.hms.core.aidl;

import android.os.Bundle;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.core.aidl.f */
/* JADX INFO: loaded from: classes6.dex */
public class C17761f extends C17760e {
    @Override // com.huawei.hms.core.aidl.C17760e
    /* JADX INFO: renamed from: a */
    public List<Object> mo75907a(Type type, Bundle bundle) throws IllegalAccessException, InstantiationException {
        int i = bundle.getInt("_list_size_");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = bundle.get("_list_item_" + i2);
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                int i3 = bundle2.getInt("_val_type_", -1);
                if (i3 == 1) {
                    throw new InstantiationException("Nested List can not be supported");
                }
                if (i3 != 0) {
                    throw new InstantiationException("Unknown type can not be supported");
                }
                arrayList.add(m75906a(bundle2, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else {
                continue;
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.core.aidl.C17760e
    /* JADX INFO: renamed from: a */
    public void mo75909a(String str, List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("_val_type_", 1);
        bundle2.putInt("_list_size_", list.size());
        for (int i = 0; i < list.size(); i++) {
            m75908a(C21532OooOOo.OooO0OO(i, "_list_item_"), list.get(i), bundle2);
        }
        bundle.putBundle(str, bundle2);
    }
}
