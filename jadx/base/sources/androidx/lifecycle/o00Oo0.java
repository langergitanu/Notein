package androidx.lifecycle;

import Oooo0oO.C21111o0ooOoO;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import o000o00.AbstractC24555OooO00o;
import o000o00.C24556OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22021o00o0O f65683OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f65684OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC24555OooO00o f65685OooO0OO;

    public static class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static OooO00o f65686OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Application f65687OooO0O0;

        public OooO00o(Application application) {
            this.f65687OooO0O0 = application;
        }

        @Override // androidx.lifecycle.o00Oo0.OooO0OO, androidx.lifecycle.o00Oo0.OooO0O0
        public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
            Application application = this.f65687OooO0O0;
            if (application != null) {
                return (T) OooO0OO(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.o00Oo0.OooO0O0
        public final AbstractC22019Ooooooo OooO0O0(Class cls, C24556OooO0O0 c24556OooO0O0) {
            if (this.f65687OooO0O0 != null) {
                return OooO00o(cls);
            }
            Application application = (Application) c24556OooO0O0.f83135OooO00o.get(o00O0O.f65682OooO00o);
            if (application != null) {
                return OooO0OO(cls, application);
            }
            if (androidx.lifecycle.OooO0O0.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.OooO00o(cls);
        }

        public final <T extends AbstractC22019Ooooooo> T OooO0OO(Class<T> cls, Application application) {
            if (!androidx.lifecycle.OooO0O0.class.isAssignableFrom(cls)) {
                return (T) super.OooO00o(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.OooOOO0.OooO0o(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e4);
            }
        }
    }

    public interface OooO0O0 {
        default <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default AbstractC22019Ooooooo OooO0O0(Class cls, C24556OooO0O0 c24556OooO0O0) {
            return OooO00o(cls);
        }
    }

    public static class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static OooO0OO f65688OooO00o;

        @Override // androidx.lifecycle.o00Oo0.OooO0O0
        public <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) throws InvocationTargetException {
            try {
                T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.OooOOO0.OooO0o(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Cannot create an instance of "), e3);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o00Oo0$OooO0Oo, reason: case insensitive filesystem */
    public static class C22020OooO0Oo {
        public void OooO0OO(AbstractC22019Ooooooo abstractC22019Ooooooo) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00Oo0(C22021o00o0O store, OooO0O0 oooO0O0) {
        this(store, oooO0O0, 0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(store, "store");
    }

    public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) OooO0O0(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final AbstractC22019Ooooooo OooO0O0(Class cls, String key) {
        AbstractC22019Ooooooo viewModel;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        C22021o00o0O c22021o00o0O = this.f65683OooO00o;
        c22021o00o0O.getClass();
        LinkedHashMap linkedHashMap = c22021o00o0O.f65690OooO00o;
        AbstractC22019Ooooooo abstractC22019Ooooooo = (AbstractC22019Ooooooo) linkedHashMap.get(key);
        boolean zIsInstance = cls.isInstance(abstractC22019Ooooooo);
        OooO0O0 oooO0O0 = this.f65684OooO0O0;
        if (zIsInstance) {
            C22020OooO0Oo c22020OooO0Oo = oooO0O0 instanceof C22020OooO0Oo ? (C22020OooO0Oo) oooO0O0 : null;
            if (c22020OooO0Oo != null) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC22019Ooooooo);
                c22020OooO0Oo.OooO0OO(abstractC22019Ooooooo);
            }
            kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC22019Ooooooo, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC22019Ooooooo;
        }
        C24556OooO0O0 c24556OooO0O0 = new C24556OooO0O0(this.f65685OooO0OO);
        c24556OooO0O0.f83135OooO00o.put(o00Ooo.f65689OooO00o, key);
        try {
            viewModel = oooO0O0.OooO0O0(cls, c24556OooO0O0);
        } catch (AbstractMethodError unused) {
            viewModel = oooO0O0.OooO00o(cls);
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        AbstractC22019Ooooooo abstractC22019Ooooooo2 = (AbstractC22019Ooooooo) linkedHashMap.put(key, viewModel);
        if (abstractC22019Ooooooo2 != null) {
            abstractC22019Ooooooo2.OooO0OO();
        }
        return viewModel;
    }

    public o00Oo0(C22021o00o0O store, OooO0O0 factory, AbstractC24555OooO00o defaultCreationExtras) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(store, "store");
        kotlin.jvm.internal.OooOOO0.OooO0oO(factory, "factory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultCreationExtras, "defaultCreationExtras");
        this.f65683OooO00o = store;
        this.f65684OooO0O0 = factory;
        this.f65685OooO0OO = defaultCreationExtras;
    }

    public /* synthetic */ o00Oo0(C22021o00o0O c22021o00o0O, OooO0O0 oooO0O0, int i) {
        this(c22021o00o0O, oooO0O0, AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0);
    }

    public o00Oo0(InterfaceC22023o00ooo interfaceC22023o00ooo) {
        this(interfaceC22023o00ooo.getViewModelStore(), ((OooOOOO) interfaceC22023o00ooo).getDefaultViewModelProviderFactory(), ((OooOOOO) interfaceC22023o00ooo).getDefaultViewModelCreationExtras());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o00Oo0(InterfaceC22023o00ooo owner, OooO0O0 oooO0O0) {
        AbstractC24555OooO00o defaultViewModelCreationExtras;
        kotlin.jvm.internal.OooOOO0.OooO0oO(owner, "owner");
        C22021o00o0O viewModelStore = owner.getViewModelStore();
        if (owner instanceof OooOOOO) {
            defaultViewModelCreationExtras = ((OooOOOO) owner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
        this(viewModelStore, oooO0O0, defaultViewModelCreationExtras);
    }
}
