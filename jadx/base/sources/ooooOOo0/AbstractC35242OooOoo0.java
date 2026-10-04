package ooooOOo0;

import OooOoo.C20593OooO0Oo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oOO00oOo.InterfaceC34386OooO;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34388OooO0O0;
import oOO00oOo.InterfaceC34389OooO0OO;
import oOO00oOo.InterfaceC34390OooO0Oo;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34392OooO0o0;
import oOO00oOo.InterfaceC34393OooO0oO;
import oOO00oOo.InterfaceC34394OooO0oo;
import oOO00oOo.InterfaceC34395OooOO0;
import oOO00oOo.InterfaceC34396OooOO0O;
import oOO00oOo.InterfaceC34397OooOO0o;
import oOO00oOo.InterfaceC34398OooOOOo;
import oOO00oOo.InterfaceC34399OooOOo;
import oOO00oOo.InterfaceC34400OooOOo0;
import oOO00oOo.InterfaceC34401OooOOoo;
import oOO00oOo.InterfaceC34402OooOo0;
import oOO00oOo.InterfaceC34403OooOo0O;
import oOO00oOo.InterfaceC34405OooOoO0;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ooooOOo0.AbstractC35220OooOO0o;
import ooooOOo0.AbstractC35231OooOo0O;
import ooooOOo0.C35239OooOoO0;
import ooooOOo0.C35244OooOooo;

/* JADX INFO: renamed from: ooooOOo0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35242OooOoo0<T> {
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fa, code lost:
    
        throw ooooOOo0.C35244OooOooo.OooOO0(r9, r8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x085b, code lost:
    
        throw ooooOOo0.C35244OooOooo.OooOO0(r9, r8, "@Body parameters cannot be used with form or multi-part encoding.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        throw ooooOOo0.C35244OooOooo.OooO(r9, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r15);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08ba  */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v113, types: [int] */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r5v0, types: [ooooOOo0.OooOoO0$OooO00o] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC35220OooOO0o OooO0O0(C35240OooOoOO c35240OooOoOO, Method method) {
        Type genericReturnType;
        boolean z;
        Type typeOooO0Oo;
        AbstractC35231OooOo0O<?> abstractC35231OooOo0O;
        Annotation[][] annotationArr;
        int i;
        int i2;
        AbstractC35231OooOo0O<?>[] abstractC35231OooOo0OArr;
        int i3;
        String str;
        AbstractC35231OooOo0O<?> oooOOOO;
        AbstractC35231OooOo0O<?> c35234OooO0oO;
        AbstractC35231OooOo0O<?> c35229OooOo0;
        AbstractC35231OooOo0O<?> c35232OooO0Oo;
        AbstractC35231OooOo0O<?> c35236OooOO0o;
        int i4;
        ?? r2;
        int i5 = -1;
        int i6 = 0;
        ?? r4 = 1;
        ?? oooO00o = new C35239OooOoO0.OooO00o(c35240OooOoOO, method);
        Annotation[] annotationArr2 = oooO00o.f126560OooO0OO;
        int length = annotationArr2.length;
        int i7 = 0;
        loop0: while (true) {
            Method method2 = oooO00o.f126559OooO0O0;
            String str2 = "HEAD";
            if (i7 >= length) {
                if (oooO00o.f126569OooOOO == null) {
                    throw C35244OooOooo.OooO(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!oooO00o.f126571OooOOOO) {
                    if (oooO00o.f126574OooOOo0) {
                        throw C35244OooOooo.OooO(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (oooO00o.f126572OooOOOo) {
                        throw C35244OooOooo.OooO(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = oooO00o.f126561OooO0Oo;
                int length2 = annotationArr3.length;
                oooO00o.f126578OooOo0O = new AbstractC35231OooOo0O[length2];
                int i8 = length2 - 1;
                int i9 = 0;
                loop2: while (i9 < length2) {
                    AbstractC35231OooOo0O<?>[] abstractC35231OooOo0OArr2 = oooO00o.f126578OooOo0O;
                    Type type = oooO00o.f126563OooO0o0[i9];
                    Annotation[] annotationArr4 = annotationArr3[i9];
                    int i10 = i9 == i8 ? 1 : i6;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        abstractC35231OooOo0O = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i6 >= length3) {
                                break;
                            }
                            Annotation annotation = annotationArr4[i6];
                            int i11 = i6;
                            int i12 = length2;
                            if (annotation instanceof InterfaceC34405OooOoO0) {
                                oooO00o.OooO0OO(i9, type);
                                if (oooO00o.f126570OooOOO0) {
                                    throw C35244OooOooo.OooOO0(method2, i9, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (oooO00o.f126557OooO) {
                                    throw C35244OooOooo.OooOO0(method2, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (oooO00o.f126566OooOO0) {
                                    throw C35244OooOooo.OooOO0(method2, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (oooO00o.f126567OooOO0O) {
                                    throw C35244OooOooo.OooOO0(method2, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (oooO00o.f126568OooOO0o) {
                                    throw C35244OooOooo.OooOO0(method2, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (oooO00o.f126573OooOOo != null) {
                                    throw C35244OooOooo.OooOO0(method2, i9, "@Url cannot be used with @%s URL", oooO00o.f126569OooOOO);
                                }
                                oooO00o.f126570OooOOO0 = true;
                                if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    break loop2;
                                }
                                oooOOOO = new AbstractC35231OooOo0O.OooOOO(method2, i9);
                                i = i8;
                            } else {
                                i = i8;
                                boolean z2 = annotation instanceof InterfaceC34401OooOOoo;
                                C35240OooOoOO c35240OooOoOO2 = oooO00o.f126558OooO00o;
                                if (z2) {
                                    oooO00o.OooO0OO(i9, type);
                                    if (oooO00o.f126566OooOO0) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (oooO00o.f126567OooOO0O) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (oooO00o.f126568OooOO0o) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (oooO00o.f126570OooOOO0) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (oooO00o.f126573OooOOo == null) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "@Path can only be used with relative url on @%s", oooO00o.f126569OooOOO);
                                    }
                                    oooO00o.f126557OooO = true;
                                    InterfaceC34401OooOOoo interfaceC34401OooOOoo = (InterfaceC34401OooOOoo) annotation;
                                    String strValue = interfaceC34401OooOOoo.value();
                                    if (!C35239OooOoO0.OooO00o.f126556OooOoO0.matcher(strValue).matches()) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "@Path parameter name must match %s. Found: %s", C35239OooOoO0.OooO00o.f126555OooOo.pattern(), strValue);
                                    }
                                    if (!oooO00o.f126576OooOo0.contains(strValue)) {
                                        throw C35244OooOooo.OooOO0(method2, i9, "URL \"%s\" does not contain \"{%s}\".", oooO00o.f126573OooOOo, strValue);
                                    }
                                    c35240OooOoOO2.OooO0o0(type, annotationArr4);
                                    oooOOOO = new AbstractC35231OooOo0O.OooO(method2, i9, strValue, interfaceC34401OooOOoo.encoded());
                                } else {
                                    i2 = length3;
                                    abstractC35231OooOo0OArr = abstractC35231OooOo0OArr2;
                                    if (annotation instanceof oOO00oOo.OooOo00) {
                                        oooO00o.OooO0OO(i9, type);
                                        oOO00oOo.OooOo00 oooOo00 = (oOO00oOo.OooOo00) annotation;
                                        String strValue2 = oooOo00.value();
                                        boolean zEncoded = oooOo00.encoded();
                                        i3 = i10;
                                        Class<?> clsOooO0o0 = C35244OooOooo.OooO0o0(type);
                                        oooO00o.f126566OooOO0 = true;
                                        if (Iterable.class.isAssignableFrom(clsOooO0o0)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw C35244OooOooo.OooOO0(method2, i9, clsOooO0o0.getSimpleName() + " must include generic type (e.g., " + clsOooO0o0.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type), annotationArr4);
                                            c35236OooOO0o = new C35230OooOo00(new AbstractC35231OooOo0O.OooOO0(strValue2, zEncoded));
                                        } else if (clsOooO0o0.isArray()) {
                                            c35240OooOoOO2.OooO0o0(C35239OooOoO0.OooO00o.OooO00o(clsOooO0o0.getComponentType()), annotationArr4);
                                            c35236OooOO0o = new C35229OooOo0(new AbstractC35231OooOo0O.OooOO0(strValue2, zEncoded));
                                        } else {
                                            c35240OooOoOO2.OooO0o0(type, annotationArr4);
                                            oooOOOO = new AbstractC35231OooOo0O.OooOO0<>(strValue2, zEncoded);
                                            str = str2;
                                        }
                                        oooOOOO = c35236OooOO0o;
                                        str = str2;
                                    } else {
                                        i3 = i10;
                                        if (annotation instanceof InterfaceC34403OooOo0O) {
                                            oooO00o.OooO0OO(i9, type);
                                            boolean zEncoded2 = ((InterfaceC34403OooOo0O) annotation).encoded();
                                            Class<?> clsOooO0o02 = C35244OooOooo.OooO0o0(type);
                                            oooO00o.f126567OooOO0O = true;
                                            if (Iterable.class.isAssignableFrom(clsOooO0o02)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, clsOooO0o02.getSimpleName() + " must include generic type (e.g., " + clsOooO0o02.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type), annotationArr4);
                                                oooOOOO = new C35230OooOo00(new AbstractC35231OooOo0O.C35236OooOO0o(zEncoded2));
                                            } else if (clsOooO0o02.isArray()) {
                                                c35240OooOoOO2.OooO0o0(C35239OooOoO0.OooO00o.OooO00o(clsOooO0o02.getComponentType()), annotationArr4);
                                                oooOOOO = new C35229OooOo0(new AbstractC35231OooOo0O.C35236OooOO0o(zEncoded2));
                                            } else {
                                                c35240OooOoOO2.OooO0o0(type, annotationArr4);
                                                c35236OooOO0o = new AbstractC35231OooOo0O.C35236OooOO0o<>(zEncoded2);
                                                oooOOOO = c35236OooOO0o;
                                            }
                                        } else if (annotation instanceof InterfaceC34402OooOo0) {
                                            oooO00o.OooO0OO(i9, type);
                                            Class<?> clsOooO0o03 = C35244OooOooo.OooO0o0(type);
                                            oooO00o.f126568OooOO0o = true;
                                            if (!Map.class.isAssignableFrom(clsOooO0o03)) {
                                                throw C35244OooOooo.OooOO0(method2, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeOooO0o = C35244OooOooo.OooO0o(type, clsOooO0o03);
                                            if (!(typeOooO0o instanceof ParameterizedType)) {
                                                throw C35244OooOooo.OooOO0(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeOooO0o;
                                            Type typeOooO0Oo2 = C35244OooOooo.OooO0Oo(0, parameterizedType);
                                            if (String.class != typeOooO0Oo2) {
                                                throw C35244OooOooo.OooOO0(method2, i9, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("@QueryMap keys must be of type String: ", typeOooO0Oo2), new Object[0]);
                                            }
                                            c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(1, parameterizedType), annotationArr4);
                                            oooOOOO = new AbstractC35231OooOo0O.OooOO0O<>(i9, method2, ((InterfaceC34402OooOo0) annotation).encoded());
                                        } else {
                                            str = str2;
                                            if (annotation instanceof InterfaceC34386OooO) {
                                                oooO00o.OooO0OO(i9, type);
                                                String strValue3 = ((InterfaceC34386OooO) annotation).value();
                                                Class<?> clsOooO0o04 = C35244OooOooo.OooO0o0(type);
                                                if (Iterable.class.isAssignableFrom(clsOooO0o04)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw C35244OooOooo.OooOO0(method2, i9, clsOooO0o04.getSimpleName() + " must include generic type (e.g., " + clsOooO0o04.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type), annotationArr4);
                                                    oooOOOO = new C35230OooOo00(new AbstractC35231OooOo0O.C35232OooO0Oo(strValue3));
                                                } else if (clsOooO0o04.isArray()) {
                                                    c35240OooOoOO2.OooO0o0(C35239OooOoO0.OooO00o.OooO00o(clsOooO0o04.getComponentType()), annotationArr4);
                                                    oooOOOO = new C35229OooOo0(new AbstractC35231OooOo0O.C35232OooO0Oo(strValue3));
                                                } else {
                                                    c35240OooOoOO2.OooO0o0(type, annotationArr4);
                                                    c35232OooO0Oo = new AbstractC35231OooOo0O.C35232OooO0Oo<>(strValue3);
                                                    oooOOOO = c35232OooO0Oo;
                                                }
                                            } else if (annotation instanceof InterfaceC34395OooOO0) {
                                                if (type == Headers.class) {
                                                    oooOOOO = new AbstractC35231OooOo0O.OooO0o(method2, i9);
                                                } else {
                                                    oooO00o.OooO0OO(i9, type);
                                                    Class<?> clsOooO0o05 = C35244OooOooo.OooO0o0(type);
                                                    if (!Map.class.isAssignableFrom(clsOooO0o05)) {
                                                        throw C35244OooOooo.OooOO0(method2, i9, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeOooO0o2 = C35244OooOooo.OooO0o(type, clsOooO0o05);
                                                    if (!(typeOooO0o2 instanceof ParameterizedType)) {
                                                        throw C35244OooOooo.OooOO0(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeOooO0o2;
                                                    Type typeOooO0Oo3 = C35244OooOooo.OooO0Oo(0, parameterizedType2);
                                                    if (String.class != typeOooO0Oo3) {
                                                        throw C35244OooOooo.OooOO0(method2, i9, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("@HeaderMap keys must be of type String: ", typeOooO0Oo3), new Object[0]);
                                                    }
                                                    c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(1, parameterizedType2), annotationArr4);
                                                    oooOOOO = new AbstractC35231OooOo0O.C35233OooO0o0<>(method2, i9);
                                                }
                                            } else if (annotation instanceof InterfaceC34389OooO0OO) {
                                                oooO00o.OooO0OO(i9, type);
                                                if (!oooO00o.f126572OooOOOo) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC34389OooO0OO interfaceC34389OooO0OO = (InterfaceC34389OooO0OO) annotation;
                                                String strValue4 = interfaceC34389OooO0OO.value();
                                                boolean zEncoded3 = interfaceC34389OooO0OO.encoded();
                                                oooO00o.f126562OooO0o = true;
                                                Class<?> clsOooO0o06 = C35244OooOooo.OooO0o0(type);
                                                if (Iterable.class.isAssignableFrom(clsOooO0o06)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw C35244OooOooo.OooOO0(method2, i9, clsOooO0o06.getSimpleName() + " must include generic type (e.g., " + clsOooO0o06.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type), annotationArr4);
                                                    oooOOOO = new C35230OooOo00(new AbstractC35231OooOo0O.OooO0O0(strValue4, zEncoded3));
                                                } else if (clsOooO0o06.isArray()) {
                                                    c35240OooOoOO2.OooO0o0(C35239OooOoO0.OooO00o.OooO00o(clsOooO0o06.getComponentType()), annotationArr4);
                                                    oooOOOO = new C35229OooOo0(new AbstractC35231OooOo0O.OooO0O0(strValue4, zEncoded3));
                                                } else {
                                                    c35240OooOoOO2.OooO0o0(type, annotationArr4);
                                                    c35234OooO0oO = new AbstractC35231OooOo0O.OooO0O0<>(strValue4, zEncoded3);
                                                    oooOOOO = c35234OooO0oO;
                                                }
                                            } else if (annotation instanceof InterfaceC34390OooO0Oo) {
                                                oooO00o.OooO0OO(i9, type);
                                                if (!oooO00o.f126572OooOOOo) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsOooO0o07 = C35244OooOooo.OooO0o0(type);
                                                if (!Map.class.isAssignableFrom(clsOooO0o07)) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeOooO0o3 = C35244OooOooo.OooO0o(type, clsOooO0o07);
                                                if (!(typeOooO0o3 instanceof ParameterizedType)) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeOooO0o3;
                                                Type typeOooO0Oo4 = C35244OooOooo.OooO0Oo(0, parameterizedType3);
                                                if (String.class != typeOooO0Oo4) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("@FieldMap keys must be of type String: ", typeOooO0Oo4), new Object[0]);
                                                }
                                                c35240OooOoOO2.OooO0o0(C35244OooOooo.OooO0Oo(1, parameterizedType3), annotationArr4);
                                                oooO00o.f126562OooO0o = true;
                                                oooOOOO = new AbstractC35231OooOo0O.OooO0OO<>(i9, method2, ((InterfaceC34390OooO0Oo) annotation).encoded());
                                            } else if (annotation instanceof InterfaceC34400OooOOo0) {
                                                oooO00o.OooO0OO(i9, type);
                                                if (!oooO00o.f126574OooOOo0) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                InterfaceC34400OooOOo0 interfaceC34400OooOOo0 = (InterfaceC34400OooOOo0) annotation;
                                                oooO00o.f126564OooO0oO = true;
                                                String strValue5 = interfaceC34400OooOOo0.value();
                                                Class<?> clsOooO0o08 = C35244OooOooo.OooO0o0(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsOooO0o08);
                                                    c35232OooO0Oo = AbstractC35231OooOo0O.OooOOO0.f126536OooO00o;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, clsOooO0o08.getSimpleName() + " must include generic type (e.g., " + clsOooO0o08.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!MultipartBody.Part.class.isAssignableFrom(C35244OooOooo.OooO0o0(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type)))) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oooOOOO = new C35230OooOo00(c35232OooO0Oo);
                                                    } else if (!clsOooO0o08.isArray()) {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsOooO0o08)) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oooOOOO = c35232OooO0Oo;
                                                    } else {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsOooO0o08.getComponentType())) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c35234OooO0oO = new C35229OooOo0(c35232OooO0Oo);
                                                        oooOOOO = c35234OooO0oO;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", C20593OooO0Oo.OooO0O0("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC34400OooOOo0.encoding()};
                                                    Headers.f124123OooOo.getClass();
                                                    Headers headersOooO0OO = Headers.Companion.OooO0OO(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsOooO0o08)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, clsOooO0o08.getSimpleName() + " must include generic type (e.g., " + clsOooO0o08.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeOooO0Oo5 = C35244OooOooo.OooO0Oo(0, (ParameterizedType) type);
                                                        if (MultipartBody.Part.class.isAssignableFrom(C35244OooOooo.OooO0o0(typeOooO0Oo5))) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c35229OooOo0 = new C35230OooOo00(new AbstractC35231OooOo0O.C35234OooO0oO(method2, i9, headersOooO0OO, c35240OooOoOO2.OooO0OO(typeOooO0Oo5, annotationArr4, annotationArr2)));
                                                    } else if (clsOooO0o08.isArray()) {
                                                        Class<?> clsOooO00o = C35239OooOoO0.OooO00o.OooO00o(clsOooO0o08.getComponentType());
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsOooO00o)) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c35229OooOo0 = new C35229OooOo0(new AbstractC35231OooOo0O.C35234OooO0oO(method2, i9, headersOooO0OO, c35240OooOoOO2.OooO0OO(clsOooO00o, annotationArr4, annotationArr2)));
                                                    } else {
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsOooO0o08)) {
                                                            throw C35244OooOooo.OooOO0(method2, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c35234OooO0oO = new AbstractC35231OooOo0O.C35234OooO0oO<>(method2, i9, headersOooO0OO, c35240OooOoOO2.OooO0OO(type, annotationArr4, annotationArr2));
                                                        oooOOOO = c35234OooO0oO;
                                                    }
                                                    oooOOOO = c35229OooOo0;
                                                }
                                            } else if (annotation instanceof InterfaceC34399OooOOo) {
                                                oooO00o.OooO0OO(i9, type);
                                                if (!oooO00o.f126574OooOOo0) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                oooO00o.f126564OooO0oO = true;
                                                Class<?> clsOooO0o09 = C35244OooOooo.OooO0o0(type);
                                                if (!Map.class.isAssignableFrom(clsOooO0o09)) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeOooO0o4 = C35244OooOooo.OooO0o(type, clsOooO0o09);
                                                if (!(typeOooO0o4 instanceof ParameterizedType)) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeOooO0o4;
                                                Type typeOooO0Oo6 = C35244OooOooo.OooO0Oo(0, parameterizedType4);
                                                if (String.class != typeOooO0Oo6) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("@PartMap keys must be of type String: ", typeOooO0Oo6), new Object[0]);
                                                }
                                                Type typeOooO0Oo7 = C35244OooOooo.OooO0Oo(1, parameterizedType4);
                                                if (MultipartBody.Part.class.isAssignableFrom(C35244OooOooo.OooO0o0(typeOooO0Oo7))) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                oooOOOO = new AbstractC35231OooOo0O.C35235OooO0oo<>(method2, i9, c35240OooOoOO2.OooO0OO(typeOooO0Oo7, annotationArr4, annotationArr2), ((InterfaceC34399OooOOo) annotation).encoding());
                                            } else if (annotation instanceof InterfaceC34387OooO00o) {
                                                oooO00o.OooO0OO(i9, type);
                                                if (oooO00o.f126572OooOOOo || oooO00o.f126574OooOOo0) {
                                                    break loop2;
                                                }
                                                if (oooO00o.f126565OooO0oo) {
                                                    throw C35244OooOooo.OooOO0(method2, i9, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    InterfaceC35214OooO0o<T, RequestBody> interfaceC35214OooO0oOooO0OO = c35240OooOoOO2.OooO0OO(type, annotationArr4, annotationArr2);
                                                    oooO00o.f126565OooO0oo = true;
                                                    oooOOOO = new AbstractC35231OooOo0O.OooO00o<>(method2, i9, interfaceC35214OooO0oOooO0OO);
                                                } catch (RuntimeException e) {
                                                    throw C35244OooOooo.OooOO0O(method2, e, i9, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof oOO00oOo.OooOo) {
                                                oooO00o.OooO0OO(i9, type);
                                                Class<?> clsOooO0o010 = C35244OooOooo.OooO0o0(type);
                                                for (int i13 = i9 - 1; i13 >= 0; i13--) {
                                                    AbstractC35231OooOo0O<?> abstractC35231OooOo0O2 = oooO00o.f126578OooOo0O[i13];
                                                    if ((abstractC35231OooOo0O2 instanceof AbstractC35231OooOo0O.OooOOOO) && ((AbstractC35231OooOo0O.OooOOOO) abstractC35231OooOo0O2).f126537OooO00o.equals(clsOooO0o010)) {
                                                        throw C35244OooOooo.OooOO0(method2, i9, "@Tag type " + clsOooO0o010.getName() + " is duplicate of parameter #" + (i13 + 1) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                oooOOOO = new AbstractC35231OooOo0O.OooOOOO<>(clsOooO0o010);
                                            } else {
                                                oooOOOO = null;
                                            }
                                        }
                                        str = str2;
                                    }
                                    if (oooOOOO != null) {
                                        if (abstractC35231OooOo0O != null) {
                                            throw C35244OooOooo.OooOO0(method2, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        abstractC35231OooOo0O = oooOOOO;
                                    }
                                    i6 = i11 + 1;
                                    annotationArr3 = annotationArr;
                                    i8 = i;
                                    length2 = i12;
                                    i10 = i3;
                                    length3 = i2;
                                    abstractC35231OooOo0OArr2 = abstractC35231OooOo0OArr;
                                    str2 = str;
                                }
                            }
                            str = str2;
                            i2 = length3;
                            abstractC35231OooOo0OArr = abstractC35231OooOo0OArr2;
                            i3 = i10;
                            if (oooOOOO != null) {
                            }
                            i6 = i11 + 1;
                            annotationArr3 = annotationArr;
                            i8 = i;
                            length2 = i12;
                            i10 = i3;
                            length3 = i2;
                            abstractC35231OooOo0OArr2 = abstractC35231OooOo0OArr;
                            str2 = str;
                        }
                    } else {
                        abstractC35231OooOo0O = null;
                        annotationArr = annotationArr3;
                    }
                    int i14 = length2;
                    int i15 = i8;
                    String str3 = str2;
                    AbstractC35231OooOo0O<?>[] abstractC35231OooOo0OArr3 = abstractC35231OooOo0OArr2;
                    int i16 = i10;
                    if (abstractC35231OooOo0O == null) {
                        if (i16 != 0) {
                            try {
                                if (C35244OooOooo.OooO0o0(type) == Continuation.class) {
                                    oooO00o.f126579OooOo0o = true;
                                    abstractC35231OooOo0O = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw C35244OooOooo.OooOO0(method2, i9, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC35231OooOo0OArr3[i9] = abstractC35231OooOo0O;
                    i9++;
                    annotationArr3 = annotationArr;
                    i8 = i15;
                    length2 = i14;
                    str2 = str3;
                    i6 = 0;
                }
                String str4 = str2;
                if (oooO00o.f126573OooOOo == null && !oooO00o.f126570OooOOO0) {
                    throw C35244OooOooo.OooO(method2, null, "Missing either @%s URL or @Url parameter.", oooO00o.f126569OooOOO);
                }
                boolean z3 = oooO00o.f126572OooOOOo;
                if (!z3 && !oooO00o.f126574OooOOo0 && !oooO00o.f126571OooOOOO && oooO00o.f126565OooO0oo) {
                    throw C35244OooOooo.OooO(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z3 && !oooO00o.f126562OooO0o) {
                    throw C35244OooOooo.OooO(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (oooO00o.f126574OooOOo0 && !oooO00o.f126564OooO0oO) {
                    throw C35244OooOooo.OooO(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C35239OooOoO0 c35239OooOoO0 = new C35239OooOoO0(oooO00o);
                Type genericReturnType2 = method.getGenericReturnType();
                if (C35244OooOooo.OooO0oO(genericReturnType2)) {
                    throw C35244OooOooo.OooO(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw C35244OooOooo.OooO(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z4 = c35239OooOoO0.f126554OooOO0O;
                if (z4) {
                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[r4.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (C35244OooOooo.OooO0o0(type2) == C35238OooOoO.class && (type2 instanceof ParameterizedType)) {
                        typeOooO0Oo = C35244OooOooo.OooO0Oo(0, (ParameterizedType) type2);
                        z = true;
                    } else {
                        typeOooO0Oo = type2;
                        z = false;
                    }
                    genericReturnType = new C35244OooOooo.OooO0O0(null, InterfaceC35211OooO0O0.class, typeOooO0Oo);
                    if (!C35244OooOooo.OooO0oo(annotations, InterfaceC35241OooOoo.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = C35243OooOooO.f126595OooO00o;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                }
                try {
                    InterfaceC35212OooO0OO<?, ?> interfaceC35212OooO0OOOooO00o = c35240OooOoOO.OooO00o(genericReturnType, annotations);
                    Type typeOooO00o = interfaceC35212OooO0OOOooO00o.OooO00o();
                    if (typeOooO00o == Response.class) {
                        throw C35244OooOooo.OooO(method, null, "'" + C35244OooOooo.OooO0o0(typeOooO00o).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeOooO00o == C35238OooOoO.class) {
                        throw C35244OooOooo.OooO(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c35239OooOoO0.f126547OooO0OO.equals(str4) && !Void.class.equals(typeOooO00o)) {
                        throw C35244OooOooo.OooO(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC35214OooO0o<ResponseBody, T> interfaceC35214OooO0oOooO0Oo = c35240OooOoOO.OooO0Oo(typeOooO00o, method.getAnnotations());
                        Call.Factory factory = c35240OooOoOO.f126581OooO0O0;
                        return !z4 ? new AbstractC35220OooOO0o.OooO00o(c35239OooOoO0, factory, interfaceC35214OooO0oOooO0Oo, interfaceC35212OooO0OOOooO00o) : z ? new AbstractC35220OooOO0o.OooO0OO(c35239OooOoO0, factory, interfaceC35214OooO0oOooO0Oo, interfaceC35212OooO0OOOooO00o) : new AbstractC35220OooOO0o.OooO0O0(c35239OooOoO0, factory, interfaceC35214OooO0oOooO0Oo, interfaceC35212OooO0OOOooO00o);
                    } catch (RuntimeException e2) {
                        throw C35244OooOooo.OooO(method, e2, "Unable to create converter for %s", typeOooO00o);
                    }
                } catch (RuntimeException e3) {
                    throw C35244OooOooo.OooO(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i7];
            if (annotation2 instanceof InterfaceC34388OooO0O0) {
                oooO00o.OooO0O0("DELETE", ((InterfaceC34388OooO0O0) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC34391OooO0o) {
                oooO00o.OooO0O0("GET", ((InterfaceC34391OooO0o) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC34393OooO0oO) {
                oooO00o.OooO0O0("HEAD", ((InterfaceC34393OooO0oO) annotation2).value(), false);
            } else if (annotation2 instanceof oOO00oOo.OooOOO) {
                oooO00o.OooO0O0("PATCH", ((oOO00oOo.OooOOO) annotation2).value(), r4);
            } else if (annotation2 instanceof oOO00oOo.OooOOOO) {
                oooO00o.OooO0O0("POST", ((oOO00oOo.OooOOOO) annotation2).value(), r4);
            } else if (annotation2 instanceof InterfaceC34398OooOOOo) {
                oooO00o.OooO0O0("PUT", ((InterfaceC34398OooOOOo) annotation2).value(), r4);
            } else if (annotation2 instanceof oOO00oOo.OooOOO0) {
                oooO00o.OooO0O0("OPTIONS", ((oOO00oOo.OooOOO0) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC34394OooO0oo) {
                InterfaceC34394OooO0oo interfaceC34394OooO0oo = (InterfaceC34394OooO0oo) annotation2;
                oooO00o.OooO0O0(interfaceC34394OooO0oo.method(), interfaceC34394OooO0oo.path(), interfaceC34394OooO0oo.hasBody());
            } else {
                if (annotation2 instanceof InterfaceC34396OooOO0O) {
                    String[] strArrValue = ((InterfaceC34396OooOO0O) annotation2).value();
                    if (strArrValue.length == 0) {
                        throw C35244OooOooo.OooO(method2, null, "@Headers annotation is empty.", new Object[0]);
                    }
                    Headers.Builder builder = new Headers.Builder();
                    int length4 = strArrValue.length;
                    int i17 = 0;
                    ?? r42 = r4;
                    while (i17 < length4) {
                        String str5 = strArrValue[i17];
                        ?? r16 = r42;
                        int iIndexOf = str5.indexOf(58);
                        if (iIndexOf == i5 || iIndexOf == 0) {
                            break loop0;
                        }
                        int i18 = i5;
                        if (iIndexOf == str5.length() - 1) {
                            break loop0;
                        }
                        String strSubstring = str5.substring(0, iIndexOf);
                        String strTrim = str5.substring(iIndexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                            try {
                                MediaType.f124148OooO0o0.getClass();
                                oooO00o.f126577OooOo00 = MediaType.Companion.OooO00o(strTrim);
                            } catch (IllegalArgumentException e4) {
                                throw C35244OooOooo.OooO(method2, e4, "Malformed content type: %s", strTrim);
                            }
                        } else {
                            builder.OooO00o(strSubstring, strTrim);
                        }
                        i17++;
                        r42 = r16 == true ? 1 : 0;
                        i5 = i18;
                    }
                    i4 = i5;
                    oooO00o.f126575OooOOoo = builder.OooO0OO();
                    r2 = r42 == true ? 1 : 0;
                } else {
                    i4 = i5;
                    boolean z5 = r4 == true ? 1 : 0;
                    if (!(annotation2 instanceof InterfaceC34397OooOO0o)) {
                        r2 = z5 ? 1 : 0;
                        if (!(annotation2 instanceof InterfaceC34392OooO0o0)) {
                            continue;
                        } else {
                            if (oooO00o.f126574OooOOo0) {
                                throw C35244OooOooo.OooO(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                            oooO00o.f126572OooOOOo = r2;
                        }
                    } else {
                        if (oooO00o.f126572OooOOOo) {
                            throw C35244OooOooo.OooO(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        r2 = z5 ? 1 : 0;
                        oooO00o.f126574OooOOo0 = r2;
                    }
                }
                i7 += r2;
                r4 = r2;
                i5 = i4;
            }
            i4 = i5;
            r2 = r4 == true ? 1 : 0;
            i7 += r2;
            r4 = r2;
            i5 = i4;
        }
    }

    public abstract T OooO00o(Object[] objArr);
}
