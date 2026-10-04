package com.google.firebase.vertexai.common.util;

import com.google.firebase.vertexai.common.SerializationException;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO0o0ooO.InterfaceC33916OooO0oo;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"(\u0010\t\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m80612d2 = {"", "T", "LoOoo0/OooO0Oo;", "", "enumValues", "(LoOoo0/OooO0Oo;)[Ljava/lang/Enum;", "", "getSerialName", "(Ljava/lang/Enum;)Ljava/lang/String;", "serialName", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SerializationKt {
    public static final <T extends Enum<T>> T[] enumValues(InterfaceC34595OooO0Oo<T> interfaceC34595OooO0Oo) {
        OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        T[] tArr = (T[]) ((Enum[]) C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo).getEnumConstants());
        if (tArr != null) {
            return tArr;
        }
        throw new SerializationException(interfaceC34595OooO0Oo.OooOO0() + " is not a valid enum type.", null, 2, null);
    }

    public static final <T extends Enum<T>> String getSerialName(T t) throws NoSuchFieldException {
        String strValue;
        OooOOO0.OooO0oO(t, "<this>");
        Class declaringClass = t.getDeclaringClass();
        OooOOO0.OooO0o(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        Field field = declaringClass.getField(t.name());
        OooOOO0.OooO0o(field, "declaringJavaClass.getField(name)");
        InterfaceC33916OooO0oo interfaceC33916OooO0oo = (InterfaceC33916OooO0oo) field.getAnnotation(InterfaceC33916OooO0oo.class);
        return (interfaceC33916OooO0oo == null || (strValue = interfaceC33916OooO0oo.value()) == null) ? t.name() : strValue;
    }
}
