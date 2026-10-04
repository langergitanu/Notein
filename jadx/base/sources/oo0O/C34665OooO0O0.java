package oo0O;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.json.alipay.C18954a;

/* JADX INFO: renamed from: oo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34665OooO0O0 implements InterfaceC34663OooO, InterfaceC34672OooOO0 {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }

    @Override // oo0O.InterfaceC34663OooO
    public final Object OooO0O0(Object obj, Type type) {
        Collection collectionNoneOf;
        if (!obj.getClass().equals(C18954a.class)) {
            return null;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (!(rawType instanceof ParameterizedType)) {
                throw new IllegalArgumentException("TODO");
            }
            rawType = ((ParameterizedType) rawType).getRawType();
        }
        Class cls = (Class) rawType;
        C18954a c18954a = (C18954a) obj;
        if (cls == AbstractCollection.class) {
            collectionNoneOf = new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            collectionNoneOf = new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            collectionNoneOf = new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            collectionNoneOf = new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            collectionNoneOf = new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            collectionNoneOf = EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        } else {
            try {
                collectionNoneOf = (Collection) cls.newInstance();
            } catch (Exception unused) {
                throw new IllegalArgumentException("create instane error, class ".concat(cls.getName()));
            }
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i = 0; i < c18954a.m80646a(); i++) {
            collectionNoneOf.add(C34669OooO0o0.OooO00o(c18954a.m80647a(i), type2));
        }
        return collectionNoneOf;
    }

    @Override // oo0O.InterfaceC34672OooOO0
    /* JADX INFO: renamed from: a */
    public final Object mo80636a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(C34668OooO0o.OooO0O0(it.next()));
        }
        return arrayList;
    }
}
