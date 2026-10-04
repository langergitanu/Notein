package com.aspose.slides.internal.p358qe;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p234ko.C5891k4;
import com.aspose.slides.p559ms.System.C14113y2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.ks */
/* JADX INFO: loaded from: classes4.dex */
class C9848ks {

    /* JADX INFO: renamed from: du */
    private kk<C9855yj> f35649du;

    /* JADX INFO: renamed from: k4 */
    private Class f35650k4;

    /* JADX INFO: renamed from: kk */
    private kk<C9843fa> f35651kk;

    /* JADX INFO: renamed from: to */
    private kk<C9852up> f35652to;

    /* JADX INFO: renamed from: x1 */
    private x1 f35653x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.qe.ks$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f35654k4;

        /* JADX INFO: renamed from: x1 */
        private String f35655x1;

        public k4(String str, int i) {
            this.f35654k4 = i;
            this.f35655x1 = str;
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m48577k4(String str) {
            int i = this.f35654k4;
            if (i == 1) {
                String str2 = this.f35655x1;
                return (str2 == null && str != null) || C14113y2.m67363du(str2, str);
            }
            if (i == 2) {
                return C14113y2.m67432to(this.f35655x1, str, (short) 3);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.qe.ks$kk */
    public class kk<T> {

        /* JADX INFO: renamed from: du */
        private final List<String> f35656du;

        /* JADX INFO: renamed from: kk */
        private final Dictionary<String, List<T>> f35658kk;

        /* JADX INFO: renamed from: to */
        private List<T> f35659to;

        /* JADX INFO: renamed from: x1 */
        private final Object f35660x1;

        private kk() {
            this.f35660x1 = new Object();
            this.f35658kk = new Dictionary<>();
            this.f35659to = null;
            this.f35656du = new List<>();
        }

        /* JADX INFO: renamed from: k4 */
        public List<T> m48578k4(String str) {
            synchronized (this.f35660x1) {
                if (str == null) {
                    return this.f35659to;
                }
                Object[] objArr = {null};
                this.f35658kk.tryGetValue(str, objArr);
                return (List) objArr[0];
            }
        }

        public /* synthetic */ kk(C9848ks c9848ks, C9850rv c9850rv) {
            this();
        }

        /* JADX INFO: renamed from: k4 */
        public void m48579k4(String str, List<T> list) {
            synchronized (this.f35660x1) {
                if (str == null) {
                    this.f35659to = list;
                    return;
                }
                try {
                    if (!this.f35658kk.containsKey(str)) {
                        this.f35658kk.addItem(str, list);
                        this.f35656du.addItem(str);
                        if (this.f35656du.size() > 10) {
                            this.f35658kk.removeItemByKey(this.f35656du.get_Item(0));
                            this.f35656du.removeAt(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.qe.ks$x1 */
    public class x1 {

        /* JADX INFO: renamed from: k4 */
        Field[] f35661k4;

        /* JADX INFO: renamed from: kk */
        Method[] f35662kk;

        /* JADX INFO: renamed from: x1 */
        Constructor[] f35664x1;

        private x1() {
        }

        /* JADX INFO: renamed from: k4 */
        public void m48583k4() {
            List<Field> list = new List<>();
            List<Method> list2 = new List<>();
            m48580k4(C9848ks.this.f35650k4, list, list2);
            this.f35661k4 = list.toArray(new Field[0]);
            this.f35664x1 = C9848ks.this.f35650k4.getDeclaredConstructors();
            this.f35662kk = list2.toArray(new Method[0]);
        }

        /* JADX INFO: renamed from: kk */
        public Method[] m48584kk() {
            if (this.f35662kk == null) {
                this.f35662kk = C9848ks.this.f35650k4.getMethods();
            }
            return this.f35662kk;
        }

        /* JADX INFO: renamed from: x1 */
        public Constructor[] m48585x1() {
            if (this.f35664x1 == null) {
                this.f35664x1 = C9848ks.this.f35650k4.getConstructors();
            }
            return this.f35664x1;
        }

        public /* synthetic */ x1(C9848ks c9848ks, C9850rv c9850rv) {
            this();
        }

        /* JADX INFO: renamed from: k4 */
        private void m48580k4(Class cls, List<Field> list, List<Method> list2) {
            if (cls.getSuperclass() != null && cls.getSuperclass() != Object.class) {
                m48580k4(cls.getSuperclass(), list, list2);
            }
            for (Field field : cls.getDeclaredFields()) {
                if (cls.equals(C9848ks.this.f35650k4) || !Modifier.isPrivate(field.getModifiers())) {
                    list.addItem(field);
                }
            }
            for (Method method : cls.getDeclaredMethods()) {
                if ((!Modifier.isPrivate(method.getModifiers()) || cls.equals(C9848ks.this.f35650k4)) && !method.isBridge()) {
                    Method[] methodArr = new Method[1];
                    if (m48581k4(method, list2, methodArr) && !list2.removeItem(methodArr[0])) {
                        throw new IllegalStateException();
                    }
                    list2.addItem(method);
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m48581k4(Method method, List<Method> list, Method[] methodArr) {
            List.Enumerator<Method> it = list.iterator();
            while (it.hasNext()) {
                Method next = it.next();
                if (m48582k4(next, method)) {
                    methodArr[0] = next;
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m48582k4(Method method, Method method2) {
            if (method.getName().equals(method2.getName())) {
                return C5891k4.m23728k4(method, method2.getParameterTypes());
            }
            return false;
        }
    }

    public C9848ks(Class cls) {
        x1 x1Var = new x1(this, null);
        this.f35653x1 = x1Var;
        this.f35650k4 = cls;
        x1Var.m48583k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public List<C9843fa> m48574k4(int i, String str) {
        Object[] objArr = 0;
        if (this.f35651kk == null) {
            this.f35651kk = new kk<>(this, objArr == true ? 1 : 0);
        }
        List<C9843fa> listM48578k4 = this.f35651kk.m48578k4(str);
        if (listM48578k4 != null) {
            return listM48578k4;
        }
        List<C9843fa> listM48570k4 = m48570k4(new k4(C14113y2.m67411k4(str) ? null : str, i));
        this.f35651kk.m48579k4(str, listM48570k4);
        return listM48570k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public List<C9855yj> m48575kk(int i, String str) {
        Object[] objArr = 0;
        if (this.f35649du == null) {
            this.f35649du = new kk<>(this, objArr == true ? 1 : 0);
        }
        List<C9855yj> listM48578k4 = this.f35649du.m48578k4(str);
        if (listM48578k4 != null) {
            return listM48578k4;
        }
        k4 k4Var = new k4(C14113y2.m67411k4(str) ? null : str, i);
        List<C9855yj> list = new List<>();
        m48572k4(k4Var, this.f35650k4, list);
        this.f35649du.m48579k4(str, list);
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public List<C9852up> m48576x1(int i, String str) {
        Object[] objArr = 0;
        if (this.f35652to == null) {
            this.f35652to = new kk<>(this, objArr == true ? 1 : 0);
        }
        List<C9852up> listM48578k4 = this.f35652to.m48578k4(str);
        if (listM48578k4 != null) {
            return listM48578k4;
        }
        List<C9852up> listM48573x1 = m48573x1(new k4(C14113y2.m67411k4(str) ? null : str, i));
        this.f35652to.m48579k4(str, listM48573x1);
        return listM48573x1;
    }

    /* JADX INFO: renamed from: k4 */
    private List<C9843fa> m48570k4(k4 k4Var) {
        List<C9843fa> list = new List<>();
        for (Constructor constructor : this.f35653x1.m48585x1()) {
            if (k4Var.m48577k4(constructor.getName())) {
                int modifiers = constructor.getModifiers();
                list.addItem(new C9843fa(constructor, C9855yj.m48600k4(Modifier.isPublic(modifiers), false, Modifier.isStatic(modifiers))));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private List<C9852up> m48573x1(k4 k4Var) {
        List<C9852up> list = new List<>();
        for (Method method : this.f35653x1.m48584kk()) {
            if (k4Var.m48577k4(method.getName())) {
                int modifiers = method.getModifiers();
                list.addItem(new C9852up(method, C9855yj.m48600k4(Modifier.isPublic(modifiers), false, Modifier.isStatic(modifiers))));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48572k4(k4 k4Var, Class cls, List<C9855yj> list) {
        if (cls.getSuperclass() != null) {
            m48572k4(k4Var, cls.getSuperclass(), list);
        }
        if (cls.isInterface() && k4Var.m48577k4(cls.getSimpleName())) {
            C9855yj c9855yj = new C9855yj(cls);
            if (!list.containsItem(c9855yj)) {
                list.addItem(c9855yj);
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            m48572k4(k4Var, cls2, list);
        }
    }
}
