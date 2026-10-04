package com.huawei.agconnect.core;

import com.huawei.agconnect.annotation.AutoCreated;
import com.huawei.agconnect.annotation.SharedInstance;
import com.huawei.agconnect.annotation.Singleton;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes8.dex */
public class Service {

    /* JADX INFO: renamed from: a */
    private final Class<?> f52026a;

    /* JADX INFO: renamed from: b */
    private final Class<?> f52027b;

    /* JADX INFO: renamed from: c */
    private final Object f52028c;

    /* JADX INFO: renamed from: d */
    private boolean f52029d;

    /* JADX INFO: renamed from: e */
    private boolean f52030e;

    /* JADX INFO: renamed from: f */
    private boolean f52031f;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        Class<?> f52032a;

        /* JADX INFO: renamed from: b */
        Class<?> f52033b;

        /* JADX INFO: renamed from: c */
        Object f52034c;

        /* JADX INFO: renamed from: d */
        private boolean f52035d;

        /* JADX INFO: renamed from: e */
        private boolean f52036e;

        /* JADX INFO: renamed from: f */
        private boolean f52037f;

        public Service build() {
            Class<?> cls = this.f52032a;
            if (cls == null) {
                throw new IllegalArgumentException("the interface parameter cannot be NULL");
            }
            Class<?> cls2 = this.f52033b;
            if (cls2 == null) {
                Object obj = this.f52034c;
                if (obj == null) {
                    throw new IllegalArgumentException("the clazz or object parameter must set one");
                }
                Service service = new Service(cls, obj);
                service.f52029d = this.f52035d;
                return service;
            }
            if (cls2.isInterface() || !Modifier.isPublic(this.f52033b.getModifiers())) {
                throw new IllegalArgumentException("the clazz parameter cant be interface type or not public");
            }
            Service service2 = new Service((Class) this.f52032a, (Class) this.f52033b);
            service2.f52029d = this.f52035d;
            service2.f52030e = this.f52036e;
            service2.f52031f = this.f52037f;
            return service2;
        }

        public Builder isAutoCreated(boolean z) {
            this.f52037f = z;
            return this;
        }

        public Builder isSharedInstance(boolean z) {
            this.f52036e = z;
            return this;
        }

        public Builder isSingleton(boolean z) {
            this.f52035d = z;
            return this;
        }

        public Builder setClass(Class<?> cls) {
            this.f52033b = cls;
            return this;
        }

        public Builder setInterface(Class<?> cls) {
            this.f52032a = cls;
            return this;
        }

        public Builder setObject(Object obj) {
            this.f52034c = obj;
            return this;
        }
    }

    private Service(Class<?> cls, Class<?> cls2) {
        this.f52026a = cls;
        this.f52027b = cls2;
        this.f52028c = null;
    }

    public static Builder builder(Class<?> cls) {
        return new Builder().setInterface(cls).setClass(cls).isSingleton(cls.isAnnotationPresent(Singleton.class)).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    public Object getInstance() {
        return this.f52028c;
    }

    public Class<?> getInterface() {
        return this.f52026a;
    }

    public Class<?> getType() {
        return this.f52027b;
    }

    public boolean isAutoCreated() {
        return this.f52031f;
    }

    public boolean isSharedInstance() {
        return this.f52030e;
    }

    public boolean isSingleton() {
        return this.f52029d;
    }

    public static Builder builder(Class<?> cls, Class<?> cls2) {
        return new Builder().setInterface(cls).setClass(cls2).isSingleton(cls2.isAnnotationPresent(Singleton.class)).isSharedInstance(cls2.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls2.isAnnotationPresent(AutoCreated.class));
    }

    private Service(Class<?> cls, Object obj) {
        this.f52026a = cls;
        this.f52027b = null;
        this.f52028c = obj;
    }

    public static Builder builder(Class<?> cls, Object obj) {
        return new Builder().setInterface(cls).setObject(obj).isSingleton(true).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }
}
