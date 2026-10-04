package oO0O0o0O;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO0O.OooO00o;
import oO0O.OooO0O0.C20236OooO0O0;
import oO0O.OooO0O0.C32493OooO0Oo;
import oO0O.OooO0O0.OooO0OO;
import oO0O0oO0.C32730OooO0Oo;
import oO0OOO.C32934OooO0o0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33482OooO0oo;
import oO0o0O0o.C33595OooOOo;
import ooOOO0Oo.C35048OooOoo0;
import ooo0o.C35192OooO0oo;
import ooo0o.C35197OooOOoo;
import ooo0o.InterfaceC35196OooOOo0;
import ooo0o.OooO0O0;

/* JADX INFO: renamed from: oO0O0o0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32722OooO0o0 implements InterfaceC35196OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f117648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O.OooO00o f117649OooO0O0;

    /* JADX INFO: renamed from: oO0O0o0O.OooO0o0$OooO00o */
    public static final class OooO00o {
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C32722OooO0o0 OooO00o(Class klass) throws InvocationTargetException {
            oO0O.OooO00o oooO00o;
            InterfaceC35196OooOOo0.OooO00o c32493OooO0Oo;
            OooO00o.EnumC20235OooO00o enumC20235OooO00o;
            OooOOO0.OooO0oO(klass, "klass");
            oO0O.OooO0O0 oooO0O0 = new oO0O.OooO0O0();
            oooO0O0.f116758OooO00o = null;
            oooO0O0.f116759OooO0O0 = null;
            oooO0O0.f116760OooO0OO = 0;
            oooO0O0.f116761OooO0Oo = null;
            oooO0O0.f116763OooO0o0 = null;
            oooO0O0.f116762OooO0o = null;
            oooO0O0.f116764OooO0oO = null;
            oooO0O0.f116765OooO0oo = null;
            Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
            OooOOO0.OooO0o(declaredAnnotations, "klass.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                OooOOO0.OooO0o(annotation, "annotation");
                Class clsOooO0Oo = C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation));
                C33476OooO0O0 c33476OooO0O0OooO00o = C32730OooO0Oo.OooO00o(clsOooO0Oo);
                C33477OooO0OO c33477OooO0OOOooO0O0 = c33476OooO0O0OooO00o.OooO0O0();
                if (c33477OooO0OOOooO0O0.equals(C35048OooOoo0.f125851OooO00o)) {
                    c32493OooO0Oo = oooO0O0.new C20236OooO0O0();
                } else if (c33477OooO0OOOooO0O0.equals(C35048OooOoo0.f125864OooOOOO)) {
                    c32493OooO0Oo = oooO0O0.new OooO0OO();
                } else if (oO0O.OooO0O0.f116756OooO || oooO0O0.f116764OooO0oO != null || (enumC20235OooO00o = (OooO00o.EnumC20235OooO00o) oO0O.OooO0O0.f116757OooOO0.get(c33476OooO0O0OooO00o)) == null) {
                    c32493OooO0Oo = null;
                } else {
                    oooO0O0.f116764OooO0oO = enumC20235OooO00o;
                    c32493OooO0Oo = oooO0O0.new C32493OooO0Oo();
                }
                if (c32493OooO0Oo != null) {
                    C32719OooO0OO.OooO0OO(c32493OooO0Oo, annotation, clsOooO0Oo);
                }
            }
            C32934OooO0o0 c32934OooO0o0 = C32934OooO0o0.f118820OooO0oO;
            if (oooO0O0.f116764OooO0oO == null || oooO0O0.f116758OooO00o == null) {
                oooO00o = null;
            } else {
                C32934OooO0o0 c32934OooO0o02 = new C32934OooO0o0(oooO0O0.f116758OooO00o, (oooO0O0.f116760OooO0OO & 8) != 0);
                if (c32934OooO0o02.OooO0O0(c32934OooO0o0)) {
                    OooO00o.EnumC20235OooO00o enumC20235OooO00o2 = oooO0O0.f116764OooO0oO;
                    if ((enumC20235OooO00o2 == OooO00o.EnumC20235OooO00o.CLASS || enumC20235OooO00o2 == OooO00o.EnumC20235OooO00o.FILE_FACADE || enumC20235OooO00o2 == OooO00o.EnumC20235OooO00o.MULTIFILE_CLASS_PART) && oooO0O0.f116761OooO0Oo == null) {
                    }
                } else {
                    oooO0O0.f116762OooO0o = oooO0O0.f116761OooO0Oo;
                    oooO0O0.f116761OooO0Oo = null;
                }
                String[] strArr = oooO0O0.f116765OooO0oo;
                if (strArr != null) {
                    oO0OOO.OooO00o.OooO00o(strArr);
                }
                oooO00o = new oO0O.OooO00o(oooO0O0.f116764OooO0oO, c32934OooO0o02, oooO0O0.f116761OooO0Oo, oooO0O0.f116762OooO0o, oooO0O0.f116763OooO0o0, oooO0O0.f116759OooO0O0, oooO0O0.f116760OooO0OO);
            }
            if (oooO00o == null) {
                return null;
            }
            return new C32722OooO0o0(klass, oooO00o);
        }
    }

    public C32722OooO0o0() {
        throw null;
    }

    public C32722OooO0o0(Class cls, oO0O.OooO00o oooO00o) {
        this.f117648OooO00o = cls;
        this.f117649OooO0O0 = oooO00o;
    }

    @Override // ooo0o.InterfaceC35196OooOOo0
    public final void OooO00o(ooo0o.OooO0O0 oooO0O0) throws InvocationTargetException {
        Class<?> klass = this.f117648OooO00o;
        OooOOO0.OooO0oO(klass, "klass");
        Method[] declaredMethods = klass.getDeclaredMethods();
        OooOOO0.OooO0o(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C33479OooO0o c33479OooO0oOooO0o0 = C33479OooO0o.OooO0o0(method.getName());
            StringBuilder sb = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            OooOOO0.OooO0o(parameterTypes, "method.parameterTypes");
            for (Class<?> parameterType : parameterTypes) {
                OooOOO0.OooO0o(parameterType, "parameterType");
                sb.append(C32730OooO0Oo.OooO0O0(parameterType));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            OooOOO0.OooO0o(returnType, "method.returnType");
            sb.append(C32730OooO0Oo.OooO0O0(returnType));
            String string = sb.toString();
            OooOOO0.OooO0o(string, "sb.toString()");
            OooO0O0.OooO00o OooO00o2 = oooO0O0.OooO00o(c33479OooO0oOooO0o0, string);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            OooOOO0.OooO0o(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                OooOOO0.OooO0o(annotation, "annotation");
                C32719OooO0OO.OooO0O0(OooO00o2, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            OooOOO0.OooO0o(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                Annotation[] annotations = annotationArr[i2];
                OooOOO0.OooO0o(annotations, "annotations");
                int length3 = annotations.length;
                int i3 = 0;
                while (i3 < length3) {
                    Annotation annotation2 = annotations[i3];
                    Class clsOooO0Oo = C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation2));
                    Class<?> cls = klass;
                    C35192OooO0oo c35192OooO0ooOooO0OO = OooO00o2.OooO0OO(i2, C32730OooO0Oo.OooO00o(clsOooO0Oo), new C32718OooO0O0(annotation2));
                    if (c35192OooO0ooOooO0OO != null) {
                        C32719OooO0OO.OooO0OO(c35192OooO0ooOooO0OO, annotation2, clsOooO0Oo);
                    }
                    i3++;
                    klass = cls;
                }
            }
            OooO00o2.OooO00o();
            i++;
            klass = klass;
        }
        Class<?> cls2 = klass;
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        OooOOO0.OooO0o(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i4 = 0;
        while (i4 < length4) {
            Constructor<?> constructor = declaredConstructors[i4];
            C33479OooO0o c33479OooO0o = C33482OooO0oo.f120988OooO0o0;
            OooOOO0.OooO0o(constructor, "constructor");
            StringBuilder sb2 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            OooOOO0.OooO0o(parameterTypes2, "constructor.parameterTypes");
            for (Class<?> parameterType2 : parameterTypes2) {
                OooOOO0.OooO0o(parameterType2, "parameterType");
                sb2.append(C32730OooO0Oo.OooO0O0(parameterType2));
            }
            sb2.append(")V");
            String string2 = sb2.toString();
            OooOOO0.OooO0o(string2, "sb.toString()");
            OooO0O0.OooO00o OooO00o3 = oooO0O0.OooO00o(c33479OooO0o, string2);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            OooOOO0.OooO0o(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                OooOOO0.OooO0o(annotation3, "annotation");
                C32719OooO0OO.OooO0O0(OooO00o3, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            OooOOO0.OooO0o(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length != 0) {
                int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length6 = parameterAnnotations2.length;
                int i5 = 0;
                while (i5 < length6) {
                    Annotation[] annotations2 = parameterAnnotations2[i5];
                    OooOOO0.OooO0o(annotations2, "annotations");
                    int length7 = annotations2.length;
                    Constructor<?>[] constructorArr = declaredConstructors;
                    int i6 = 0;
                    while (i6 < length7) {
                        int i7 = i6;
                        Annotation annotation4 = annotations2[i7];
                        int i8 = length4;
                        Class clsOooO0Oo2 = C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation4));
                        int i9 = i4;
                        int i10 = length5;
                        Annotation[][] annotationArr2 = parameterAnnotations2;
                        C35192OooO0oo c35192OooO0ooOooO0OO2 = OooO00o3.OooO0OO(i5 + length5, C32730OooO0Oo.OooO00o(clsOooO0Oo2), new C32718OooO0O0(annotation4));
                        if (c35192OooO0ooOooO0OO2 != null) {
                            C32719OooO0OO.OooO0OO(c35192OooO0ooOooO0OO2, annotation4, clsOooO0Oo2);
                        }
                        i6 = i7 + 1;
                        i4 = i9;
                        length4 = i8;
                        length5 = i10;
                        parameterAnnotations2 = annotationArr2;
                    }
                    i5++;
                    declaredConstructors = constructorArr;
                }
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            int i11 = length4;
            int i12 = i4;
            OooO00o3.OooO00o();
            i4 = i12 + 1;
            declaredConstructors = constructorArr2;
            length4 = i11;
        }
        Field[] declaredFields = cls2.getDeclaredFields();
        OooOOO0.OooO0o(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C33479OooO0o c33479OooO0oOooO0o02 = C33479OooO0o.OooO0o0(field.getName());
            Class<?> type = field.getType();
            OooOOO0.OooO0o(type, "field.type");
            String desc = C32730OooO0Oo.OooO0O0(type);
            OooOOO0.OooO0oO(desc, "desc");
            String strOooO0O0 = c33479OooO0oOooO0o02.OooO0O0();
            OooOOO0.OooO0o(strOooO0O0, "name.asString()");
            C35197OooOOoo c35197OooOOoo = new C35197OooOOoo(strOooO0O0 + '#' + desc);
            ArrayList arrayList = new ArrayList();
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            OooOOO0.OooO0o(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                OooOOO0.OooO0o(annotation5, "annotation");
                Class clsOooO0Oo3 = C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation5));
                C35192OooO0oo c35192OooO0ooOooOOo = oooO0O0.f126322OooO00o.OooOOo(C32730OooO0Oo.OooO00o(clsOooO0Oo3), new C32718OooO0O0(annotation5), arrayList);
                if (c35192OooO0ooOooOOo != null) {
                    C32719OooO0OO.OooO0OO(c35192OooO0ooOooOOo, annotation5, clsOooO0Oo3);
                }
            }
            if (!arrayList.isEmpty()) {
                oooO0O0.f126323OooO0O0.put(c35197OooOOoo, arrayList);
            }
        }
    }

    @Override // ooo0o.InterfaceC35196OooOOo0
    public final oO0O.OooO00o OooO0O0() {
        return this.f117649OooO0O0;
    }

    @Override // ooo0o.InterfaceC35196OooOOo0
    public final void OooO0OO(InterfaceC35196OooOOo0.OooO0OO oooO0OO) {
        Class<?> klass = this.f117648OooO00o;
        OooOOO0.OooO0oO(klass, "klass");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        OooOOO0.OooO0o(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            OooOOO0.OooO0o(annotation, "annotation");
            C32719OooO0OO.OooO0O0(oooO0OO, annotation);
        }
        oooO0OO.OooO00o();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32722OooO0o0) {
            return OooOOO0.OooO0O0(this.f117648OooO00o, ((C32722OooO0o0) obj).f117648OooO00o);
        }
        return false;
    }

    @Override // ooo0o.InterfaceC35196OooOOo0
    public final C33476OooO0O0 getClassId() {
        return C32730OooO0Oo.OooO00o(this.f117648OooO00o);
    }

    @Override // ooo0o.InterfaceC35196OooOOo0
    public final String getLocation() {
        return C33595OooOOo.OooOo0(this.f117648OooO00o.getName(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX).concat(".class");
    }

    public final int hashCode() {
        return this.f117648OooO00o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C32722OooO0o0.class, sb, ": ");
        sb.append(this.f117648OooO00o);
        return sb.toString();
    }
}
