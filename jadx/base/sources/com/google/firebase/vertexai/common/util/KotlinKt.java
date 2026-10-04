package com.google.firebase.vertexai.common.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0003*\u00020\u0004H\u0080\b¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b*\u00060\u0007j\u0002`\bH\u0000¨\u0006\t"}, m80612d2 = {"getAnnotation", "T", "kotlin.jvm.PlatformType", "", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)Ljava/lang/annotation/Annotation;", "removeLast", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class KotlinKt {
    public static final <T extends Annotation> T getAnnotation(Field field) {
        OooOOO0.OooO0oO(field, "<this>");
        OooOOO0.OooOOO();
        throw null;
    }

    public static final StringBuilder removeLast(StringBuilder sb) {
        OooOOO0.OooO0oO(sb, "<this>");
        if (sb.length() == 0) {
            throw new IndexOutOfBoundsException("StringBuilder is empty.");
        }
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(sb.length() - 1);
        OooOOO0.OooO0o(sbDeleteCharAt, "deleteCharAt(length - 1)");
        return sbDeleteCharAt;
    }
}
