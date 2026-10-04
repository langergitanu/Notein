package o0Oo00o;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.lang.reflect.Field;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Oo00o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28030OooO0oO implements ExclusionStrategy {
    @Override // com.google.gson.ExclusionStrategy
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.ExclusionStrategy
    public final boolean shouldSkipField(FieldAttributes fieldAttributes) {
        Field declaredField;
        OooOOO0.OooO0oO(fieldAttributes, "fieldAttributes");
        String name = fieldAttributes.getName();
        OooOOO0.OooO0o(name, "getName(...)");
        Class<?> declaringClass = fieldAttributes.getDeclaringClass();
        OooOOO0.OooO0o(declaringClass, "getDeclaringClass(...)");
        for (Class<? super Object> superclass = declaringClass.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(name);
            } catch (Exception unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                return true;
            }
        }
        return false;
    }
}
