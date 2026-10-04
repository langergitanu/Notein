package ooooOOo0;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35212OooO0OO;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: ooooOOo0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35240OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f126580OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Call.Factory f126581OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HttpUrl f126582OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<InterfaceC35214OooO0o.OooO00o> f126583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Executor f126584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<InterfaceC35212OooO0OO.OooO00o> f126585OooO0o0;

    /* JADX INFO: renamed from: ooooOOo0.OooOoOO$OooO00o */
    public class OooO00o implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C35237OooOo0o f126586OooO00o = C35237OooOo0o.f126538OooO0O0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object[] f126587OooO0O0 = new Object[0];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Class f126588OooO0OO;

        public OooO00o(Class cls) {
            this.f126588OooO0OO = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            AbstractC35242OooOoo0 abstractC35242OooOoo0OooO0O0;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f126587OooO0O0;
            }
            C35237OooOo0o c35237OooOo0o = this.f126586OooO00o;
            c35237OooOo0o.getClass();
            if (method.isDefault()) {
                Class<?> cls = this.f126588OooO0OO;
                Constructor<MethodHandles.Lookup> constructor = c35237OooOo0o.f126539OooO00o;
                return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
            }
            C35240OooOoOO c35240OooOoOO = C35240OooOoOO.this;
            AbstractC35242OooOoo0 abstractC35242OooOoo0 = (AbstractC35242OooOoo0) c35240OooOoOO.f126580OooO00o.get(method);
            if (abstractC35242OooOoo0 == null) {
                synchronized (c35240OooOoOO.f126580OooO00o) {
                    try {
                        abstractC35242OooOoo0OooO0O0 = (AbstractC35242OooOoo0) c35240OooOoOO.f126580OooO00o.get(method);
                        if (abstractC35242OooOoo0OooO0O0 == null) {
                            abstractC35242OooOoo0OooO0O0 = AbstractC35242OooOoo0.OooO0O0(c35240OooOoOO, method);
                            c35240OooOoOO.f126580OooO00o.put(method, abstractC35242OooOoo0OooO0O0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                abstractC35242OooOoo0 = abstractC35242OooOoo0OooO0O0;
            }
            return abstractC35242OooOoo0.OooO00o(objArr);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOoOO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C35237OooOo0o f126590OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Call.Factory f126591OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public HttpUrl f126592OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f126593OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f126594OooO0o0;

        public OooO0O0() {
            C35237OooOo0o c35237OooOo0o = C35237OooOo0o.f126538OooO0O0;
            this.f126593OooO0Oo = new ArrayList();
            this.f126594OooO0o0 = new ArrayList();
            this.f126590OooO00o = c35237OooOo0o;
        }

        public final void OooO00o(String str) {
            HttpUrl.f124126OooOO0O.getClass();
            HttpUrl httpUrlOooO0OO = HttpUrl.Companion.OooO0OO(str);
            if ("".equals(httpUrlOooO0OO.f124133OooO0o.get(r0.size() - 1))) {
                this.f126592OooO0OO = httpUrlOooO0OO;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrlOooO0OO);
            }
        }

        public final C35240OooOoOO OooO0O0() {
            if (this.f126592OooO0OO == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f126591OooO0O0;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executorOooO00o = this.f126590OooO00o.OooO00o();
            ArrayList arrayList = new ArrayList(this.f126594OooO0o0);
            arrayList.addAll(Arrays.asList(C35215OooO0o0.f126431OooO00o, new C35218OooOO0(executorOooO00o)));
            ArrayList arrayList2 = this.f126593OooO0Oo;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
            C35208OooO00o c35208OooO00o = new C35208OooO00o();
            c35208OooO00o.f126424OooO00o = true;
            arrayList3.add(c35208OooO00o);
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(Collections.singletonList(C35227OooOOoo.f126480OooO00o));
            return new C35240OooOoOO(factory, this.f126592OooO0OO, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executorOooO00o);
        }
    }

    public C35240OooOoOO(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.f126581OooO0O0 = factory;
        this.f126582OooO0OO = httpUrl;
        this.f126583OooO0Oo = list;
        this.f126585OooO0o0 = list2;
        this.f126584OooO0o = executor;
    }

    public final InterfaceC35212OooO0OO<?, ?> OooO00o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC35212OooO0OO.OooO00o> list = this.f126585OooO0o0;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC35212OooO0OO<?, ?> interfaceC35212OooO0OOOooO00o = list.get(i).OooO00o(type, annotationArr);
            if (interfaceC35212OooO0OOOooO00o != null) {
                return interfaceC35212OooO0OOOooO00o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T OooO0O0(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new OooO00o(cls));
    }

    public final <T> InterfaceC35214OooO0o<T, RequestBody> OooO0OO(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<InterfaceC35214OooO0o.OooO00o> list = this.f126583OooO0Oo;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC35214OooO0o<T, RequestBody> interfaceC35214OooO0oOooO00o = list.get(i).OooO00o(type);
            if (interfaceC35214OooO0oOooO00o != null) {
                return interfaceC35214OooO0oOooO00o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC35214OooO0o<ResponseBody, T> OooO0Oo(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC35214OooO0o.OooO00o> list = this.f126583OooO0Oo;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC35214OooO0o<ResponseBody, T> interfaceC35214OooO0o = (InterfaceC35214OooO0o<ResponseBody, T>) list.get(i).OooO0O0(type, annotationArr, this);
            if (interfaceC35214OooO0o != null) {
                return interfaceC35214OooO0o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void OooO0o0(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<InterfaceC35214OooO0o.OooO00o> list = this.f126583OooO0Oo;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
