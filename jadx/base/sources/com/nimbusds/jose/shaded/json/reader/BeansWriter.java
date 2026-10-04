package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import com.nimbusds.jose.shaded.json.JSONUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class BeansWriter implements JsonWriterI<Object> {
    @Override // com.nimbusds.jose.shaded.json.reader.JsonWriterI
    public <E> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        Method declaredMethod;
        Object objInvoke;
        Class<?> type;
        try {
            jSONStyle.objectStart(appendable);
            boolean z = false;
            for (Class<?> superclass = e.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & 152) <= 0) {
                        if ((modifiers & 1) > 0) {
                            objInvoke = field.get(e);
                        } else {
                            try {
                                declaredMethod = superclass.getDeclaredMethod(JSONUtil.getGetterName(field.getName()), new Class[0]);
                            } catch (Exception unused) {
                                declaredMethod = null;
                            }
                            if (declaredMethod == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                declaredMethod = superclass.getDeclaredMethod(JSONUtil.getIsName(field.getName()), new Class[0]);
                            }
                            if (declaredMethod != null) {
                                objInvoke = declaredMethod.invoke(e, new Object[0]);
                            }
                        }
                        if (objInvoke != null || !jSONStyle.ignoreNull()) {
                            if (z) {
                                jSONStyle.objectNext(appendable);
                            } else {
                                z = true;
                            }
                            JsonWriter.writeJSONKV(field.getName(), objInvoke, appendable, jSONStyle);
                        }
                    }
                }
            }
            jSONStyle.objectStop(appendable);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
