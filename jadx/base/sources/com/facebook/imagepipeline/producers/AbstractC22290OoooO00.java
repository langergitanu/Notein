package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o00o0oOo.EnumC25460OooO0OO;
import o00oo0O.EnumC25653OooO0OO;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22290OoooO00<K, T extends Closeable> implements InterfaceC22291OoooO0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f67420OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<T> f67421OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f67422OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f67423OooO0Oo;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooO00$OooO00o */
    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final K f67424OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CopyOnWriteArraySet<Pair<OooO<T>, InterfaceC22288OoooO>> f67425OooO0O0 = new CopyOnWriteArraySet<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public T f67426OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f67427OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0OO f67428OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f67429OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AbstractC22290OoooO00<K, T>.OooO00o.C19103OooO00o f67430OooO0oO;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooO00$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19103OooO00o extends OooO0O0<T> {
            public C19103OooO00o() {
            }

            @Override // com.facebook.imagepipeline.producers.OooO0O0
            public final void OooO(float f) {
                try {
                    C25732OooO0O0.OooO00o();
                    OooO00o.this.OooO0oo(this, f);
                } finally {
                    C25732OooO0O0.OooO00o();
                }
            }

            @Override // com.facebook.imagepipeline.producers.OooO0O0
            public final void OooO0o() {
                try {
                    C25732OooO0O0.OooO00o();
                    OooO00o oooO00o = OooO00o.this;
                    synchronized (oooO00o) {
                        try {
                            if (oooO00o.f67430OooO0oO == this) {
                                oooO00o.f67430OooO0oO = null;
                                oooO00o.f67428OooO0o = null;
                                OooO00o.OooO0O0(oooO00o.f67426OooO0OO);
                                oooO00o.f67426OooO0OO = null;
                                oooO00o.OooO(EnumC25460OooO0OO.f86760OooOoO0);
                            }
                        } finally {
                        }
                    }
                } finally {
                    C25732OooO0O0.OooO00o();
                }
            }

            @Override // com.facebook.imagepipeline.producers.OooO0O0
            public final void OooO0oO(Throwable th) {
                try {
                    C25732OooO0O0.OooO00o();
                    OooO00o.this.OooO0o(this, th);
                } finally {
                    C25732OooO0O0.OooO00o();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.facebook.imagepipeline.producers.OooO0O0
            public final void OooO0oo(int i, Object obj) {
                Closeable closeable = (Closeable) obj;
                try {
                    C25732OooO0O0.OooO00o();
                    OooO00o.this.OooO0oO(this, closeable, i);
                } finally {
                    C25732OooO0O0.OooO00o();
                }
            }
        }

        public OooO00o(K k) {
            this.f67424OooO00o = k;
        }

        public static void OooO0O0(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public final void OooO(EnumC25460OooO0OO enumC25460OooO0OO) {
            synchronized (this) {
                try {
                    boolean z = false;
                    if (!(this.f67428OooO0o == null)) {
                        throw new IllegalArgumentException();
                    }
                    if (!(this.f67430OooO0oO == null)) {
                        throw new IllegalArgumentException();
                    }
                    if (this.f67425OooO0O0.isEmpty()) {
                        AbstractC22290OoooO00.this.OooO0Oo(this.f67424OooO00o, this);
                        return;
                    }
                    InterfaceC22288OoooO interfaceC22288OoooO = (InterfaceC22288OoooO) this.f67425OooO0O0.iterator().next().second;
                    OooO0OO oooO0OO = new OooO0OO(interfaceC22288OoooO.OooOOoo(), interfaceC22288OoooO.getId(), null, interfaceC22288OoooO.OooOOo0(), interfaceC22288OoooO.OooO00o(), interfaceC22288OoooO.o0Oo0oo(), OooO0Oo(), OooO0OO(), OooO0o0(), interfaceC22288OoooO.OooOOO0());
                    this.f67428OooO0o = oooO0OO;
                    oooO0OO.OooOooo(interfaceC22288OoooO.getExtras());
                    if (enumC25460OooO0OO != EnumC25460OooO0OO.f86760OooOoO0) {
                        OooO0OO oooO0OO2 = this.f67428OooO0o;
                        int iOrdinal = enumC25460OooO0OO.ordinal();
                        if (iOrdinal == 0) {
                            z = true;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                throw new IllegalStateException("No boolean equivalent for UNSET");
                            }
                            throw new IllegalStateException("Unrecognized TriState value: " + enumC25460OooO0OO);
                        }
                        oooO0OO2.Oooo000(Boolean.valueOf(z), "started_as_prefetch");
                    }
                    AbstractC22290OoooO00<K, T>.OooO00o.C19103OooO00o c19103OooO00o = new C19103OooO00o();
                    this.f67430OooO0oO = c19103OooO00o;
                    AbstractC22290OoooO00.this.f67421OooO0O0.OooO00o(c19103OooO00o, this.f67428OooO0o);
                } finally {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean OooO00o(OooO<T> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
            OooO00o oooO00o;
            Pair<OooO<T>, InterfaceC22288OoooO> pairCreate = Pair.create(oooO, interfaceC22288OoooO);
            synchronized (this) {
                try {
                    AbstractC22290OoooO00 abstractC22290OoooO00 = AbstractC22290OoooO00.this;
                    K k = this.f67424OooO00o;
                    synchronized (abstractC22290OoooO00) {
                        oooO00o = (OooO00o) abstractC22290OoooO00.f67420OooO00o.get(k);
                    }
                    if (oooO00o != this) {
                        return false;
                    }
                    this.f67425OooO0O0.add(pairCreate);
                    ArrayList arrayListOooOO0O = OooOO0O();
                    ArrayList arrayListOooOO0o = OooOO0o();
                    ArrayList arrayListOooOO0 = OooOO0();
                    Closeable closeableOooO0O0 = this.f67426OooO0OO;
                    float f = this.f67427OooO0Oo;
                    int i = this.f67429OooO0o0;
                    OooO0OO.OooO0Oo(arrayListOooOO0O);
                    OooO0OO.OooO0o(arrayListOooOO0o);
                    OooO0OO.OooO0O0(arrayListOooOO0);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableOooO0O0 != this.f67426OooO0OO) {
                                    closeableOooO0O0 = null;
                                } else if (closeableOooO0O0 != null) {
                                    closeableOooO0O0 = AbstractC22290OoooO00.this.OooO0O0(closeableOooO0O0);
                                }
                            }
                            if (closeableOooO0O0 != null) {
                                if (f > 0.0f) {
                                    oooO.OooO0OO(f);
                                }
                                oooO.OooO00o(i, closeableOooO0O0);
                                OooO0O0(closeableOooO0O0);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    interfaceC22288OoooO.OooO0OO(new C22279Oooo(this, pairCreate));
                    return true;
                } finally {
                }
            }
        }

        public final synchronized boolean OooO0OO() {
            Iterator<Pair<OooO<T>, InterfaceC22288OoooO>> it = this.f67425OooO0O0.iterator();
            while (it.hasNext()) {
                if (((InterfaceC22288OoooO) it.next().second).Oooo0OO()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean OooO0Oo() {
            Iterator<Pair<OooO<T>, InterfaceC22288OoooO>> it = this.f67425OooO0O0.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC22288OoooO) it.next().second).ooOO()) {
                    return false;
                }
            }
            return true;
        }

        public final void OooO0o(AbstractC22290OoooO00<K, T>.OooO00o.C19103OooO00o c19103OooO00o, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f67430OooO0oO != c19103OooO00o) {
                        return;
                    }
                    this.f67425OooO0O0.clear();
                    AbstractC22290OoooO00.this.OooO0Oo(this.f67424OooO00o, this);
                    OooO0O0(this.f67426OooO0OO);
                    this.f67426OooO0OO = null;
                    for (Pair<OooO<T>, InterfaceC22288OoooO> pair : this.f67425OooO0O0) {
                        synchronized (pair) {
                            try {
                                ((InterfaceC22288OoooO) pair.second).OooOOo0().OooOO0O((InterfaceC22288OoooO) pair.second, AbstractC22290OoooO00.this.f67422OooO0OO, th, null);
                                OooO0OO oooO0OO = this.f67428OooO0o;
                                if (oooO0OO != null) {
                                    ((InterfaceC22288OoooO) pair.second).OooOooo(oooO0OO.f67290OooOoo0);
                                }
                                ((OooO) pair.first).onFailure(th);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final synchronized EnumC25653OooO0OO OooO0o0() {
            EnumC25653OooO0OO enumC25653OooO0OO;
            enumC25653OooO0OO = EnumC25653OooO0OO.f87567OooOo;
            Iterator<Pair<OooO<T>, InterfaceC22288OoooO>> it = this.f67425OooO0O0.iterator();
            while (it.hasNext()) {
                EnumC25653OooO0OO priority2 = ((InterfaceC22288OoooO) it.next().second).getPriority();
                EnumC25653OooO0OO.f87568OooOo0o.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(priority2, "priority2");
                if (enumC25653OooO0OO.ordinal() <= priority2.ordinal()) {
                    enumC25653OooO0OO = priority2;
                }
            }
            return enumC25653OooO0OO;
        }

        public final void OooO0oO(AbstractC22290OoooO00<K, T>.OooO00o.C19103OooO00o c19103OooO00o, T t, int i) {
            synchronized (this) {
                try {
                    if (this.f67430OooO0oO != c19103OooO00o) {
                        return;
                    }
                    OooO0O0(this.f67426OooO0OO);
                    this.f67426OooO0OO = null;
                    int size = this.f67425OooO0O0.size();
                    if (OooO0O0.OooO0o0(i)) {
                        this.f67426OooO0OO = (T) AbstractC22290OoooO00.this.OooO0O0(t);
                        this.f67429OooO0o0 = i;
                    } else {
                        this.f67425OooO0O0.clear();
                        AbstractC22290OoooO00.this.OooO0Oo(this.f67424OooO00o, this);
                    }
                    for (Pair<OooO<T>, InterfaceC22288OoooO> pair : this.f67425OooO0O0) {
                        synchronized (pair) {
                            try {
                                if (OooO0O0.OooO0Oo(i)) {
                                    ((InterfaceC22288OoooO) pair.second).OooOOo0().OooO((InterfaceC22288OoooO) pair.second, AbstractC22290OoooO00.this.f67422OooO0OO, null);
                                    OooO0OO oooO0OO = this.f67428OooO0o;
                                    if (oooO0OO != null) {
                                        ((InterfaceC22288OoooO) pair.second).OooOooo(oooO0OO.f67290OooOoo0);
                                    }
                                    ((InterfaceC22288OoooO) pair.second).Oooo000(Integer.valueOf(size), AbstractC22290OoooO00.this.f67423OooO0Oo);
                                }
                                ((OooO) pair.first).OooO00o(i, t);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void OooO0oo(AbstractC22290OoooO00<K, T>.OooO00o.C19103OooO00o c19103OooO00o, float f) {
            synchronized (this) {
                try {
                    if (this.f67430OooO0oO != c19103OooO00o) {
                        return;
                    }
                    this.f67427OooO0Oo = f;
                    for (Pair<OooO<T>, InterfaceC22288OoooO> pair : this.f67425OooO0O0) {
                        synchronized (pair) {
                            ((OooO) pair.first).OooO0OO(f);
                        }
                    }
                } finally {
                }
            }
        }

        public final synchronized ArrayList OooOO0() {
            OooO0OO oooO0OO = this.f67428OooO0o;
            ArrayList arrayList = null;
            if (oooO0OO == null) {
                return null;
            }
            boolean zOooO0OO = OooO0OO();
            synchronized (oooO0OO) {
                if (zOooO0OO != oooO0OO.f67292OooOooo) {
                    oooO0OO.f67292OooOooo = zOooO0OO;
                    arrayList = new ArrayList(oooO0OO.f67294Oooo00O);
                }
            }
            return arrayList;
        }

        public final synchronized ArrayList OooOO0O() {
            OooO0OO oooO0OO = this.f67428OooO0o;
            ArrayList arrayList = null;
            if (oooO0OO == null) {
                return null;
            }
            boolean zOooO0Oo = OooO0Oo();
            synchronized (oooO0OO) {
                if (zOooO0Oo != oooO0OO.f67289OooOoo) {
                    oooO0OO.f67289OooOoo = zOooO0Oo;
                    arrayList = new ArrayList(oooO0OO.f67294Oooo00O);
                }
            }
            return arrayList;
        }

        public final synchronized ArrayList OooOO0o() {
            ArrayList arrayList;
            OooO0OO oooO0OO = this.f67428OooO0o;
            if (oooO0OO == null) {
                return null;
            }
            EnumC25653OooO0OO enumC25653OooO0OOOooO0o0 = OooO0o0();
            synchronized (oooO0OO) {
                if (enumC25653OooO0OOOooO0o0 == oooO0OO.f67291OooOooO) {
                    arrayList = null;
                } else {
                    oooO0OO.f67291OooOooO = enumC25653OooO0OOOooO0o0;
                    arrayList = new ArrayList(oooO0OO.f67294Oooo00O);
                }
            }
            return arrayList;
        }
    }

    public AbstractC22290OoooO00(InterfaceC22291OoooO0O interfaceC22291OoooO0O, String str, String str2) {
        this.f67421OooO0O0 = interfaceC22291OoooO0O;
        this.f67422OooO0OO = str;
        this.f67423OooO0Oo = str2;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<T> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        OooO00o oooO00o;
        boolean z;
        try {
            C25732OooO0O0.OooO00o();
            interfaceC22288OoooO.OooOOo0().OooO0OO(interfaceC22288OoooO, this.f67422OooO0OO);
            Pair pairOooO0OO = OooO0OO(interfaceC22288OoooO);
            do {
                synchronized (this) {
                    synchronized (this) {
                        oooO00o = (OooO00o) this.f67420OooO00o.get(pairOooO0OO);
                    }
                }
                if (oooO00o == null) {
                    synchronized (this) {
                        oooO00o = new OooO00o(pairOooO0OO);
                        this.f67420OooO00o.put(pairOooO0OO, oooO00o);
                        z = true;
                    }
                } else {
                    z = false;
                }
            } while (!oooO00o.OooO00o(oooO, interfaceC22288OoooO));
            if (z) {
                oooO00o.OooO(interfaceC22288OoooO.ooOO() ? EnumC25460OooO0OO.f86758OooOo0o : EnumC25460OooO0OO.f86757OooOo);
            }
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }

    public abstract T OooO0O0(T t);

    public abstract Pair OooO0OO(InterfaceC22288OoooO interfaceC22288OoooO);

    public final synchronized void OooO0Oo(K k, AbstractC22290OoooO00<K, T>.OooO00o oooO00o) {
        if (this.f67420OooO00o.get(k) == oooO00o) {
            this.f67420OooO00o.remove(k);
        }
    }
}
