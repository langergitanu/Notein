package o0000OOo;

import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.InterfaceC24016OooO0o0;
import kotlin.jvm.internal.OooOOO0;
import o0000OOO.AbstractC24199OooO0o0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: o0000OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24217OooO0O0 {
    public static final Exception OooO00o(AbstractC24199OooO0o0 abstractC24199OooO0o0, String str, C24218OooO0OO c24218OooO0OO) {
        return new C24218OooO0OO(abstractC24199OooO0o0, str);
    }

    public static View OooO0O0(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final InterfaceC34595OooO0Oo OooO0OO(Annotation annotation) {
        OooOOO0.OooO0oO(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        OooOOO0.OooO0o(clsAnnotationType, "annotationType(...)");
        return OooO0oO(clsAnnotationType);
    }

    public static final Class OooO0Oo(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) {
        OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        Class<?> clsOooO = ((InterfaceC24016OooO0o0) interfaceC34595OooO0Oo).OooO();
        OooOOO0.OooO0o0(clsOooO, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsOooO;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class OooO0o(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) {
        OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        Class<?> clsOooO = ((InterfaceC24016OooO0o0) interfaceC34595OooO0Oo).OooO();
        if (clsOooO.isPrimitive()) {
            return clsOooO;
        }
        String name = clsOooO.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class OooO0o0(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) {
        OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        Class<?> clsOooO = ((InterfaceC24016OooO0o0) interfaceC34595OooO0Oo).OooO();
        if (!clsOooO.isPrimitive()) {
            return clsOooO;
        }
        String name = clsOooO.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsOooO;
    }

    public static final InterfaceC34595OooO0Oo OooO0oO(Class cls) {
        OooOOO0.OooO0oO(cls, "<this>");
        return C24035Oooo00o.f80943OooO00o.OooO0O0(cls);
    }

    public static final int OooO0oo(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }
}
