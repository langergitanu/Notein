package ooOOoOO0;

import java.lang.annotation.Annotation;
import oO0o.InterfaceC33531OooO0o0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.InterfaceC34460OooO0oO;

/* JADX INFO: renamed from: ooOOoOO0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35138Oooo00O {
    public static final String OooO00o(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, AbstractC34457OooO0OO json) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        for (Annotation annotation : interfaceC33531OooO0o0.getAnnotations()) {
            if (annotation instanceof InterfaceC34460OooO0oO) {
                return ((InterfaceC34460OooO0oO) annotation).discriminator();
            }
        }
        return json.f123491OooO00o.f123518OooO0oO;
    }
}
