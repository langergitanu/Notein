package oO0OOo0o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: oO0OOo0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33065OooOOOo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Logger f119562OooOoO = Logger.getLogger(C33065OooOOOo.class.getName());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C33065OooOOOo f119563OooOoOO = new C33065OooOOOo();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33108Ooooo0o<C33066OooO0Oo<?>, Object> f119564OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f119565OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f119566OooOoO0;

    /* JADX INFO: renamed from: oO0OOo0o.OooOOOo$OooO00o */
    public static final class OooO00o extends C33065OooOOOo implements Closeable {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public ArrayList<OooO0OO> f119567OooOoo0;

        @Override // oO0OOo0o.C33065OooOOOo
        public final void OooO00o(OooO0O0 oooO0O0, Executor executor) {
            C33065OooOOOo.OooOOo0(oooO0O0, "cancellationListener");
            C33065OooOOOo.OooOOo0(executor, "executor");
            Oooo0OO(new OooO0OO(executor, oooO0O0, this));
        }

        @Override // oO0OOo0o.C33065OooOOOo
        public final C33065OooOOOo OooO0OO() {
            throw null;
        }

        @Override // oO0OOo0o.C33065OooOOOo
        public final Throwable OooOOO0() {
            Oooo00o();
            return null;
        }

        @Override // oO0OOo0o.C33065OooOOOo
        public final void OooOooo(C33065OooOOOo c33065OooOOOo) {
            throw null;
        }

        @Override // oO0OOo0o.C33065OooOOOo
        public final void Oooo0(OooO0O0 oooO0O0) {
            ooOO(oooO0O0, this);
        }

        @Override // oO0OOo0o.C33065OooOOOo
        public final void Oooo000() {
        }

        @Override // oO0OOo0o.C33065OooOOOo
        public final boolean Oooo00o() {
            synchronized (this) {
            }
            return true;
        }

        public final void Oooo0OO(OooO0OO oooO0OO) {
            synchronized (this) {
                Oooo00o();
                oooO0OO.getClass();
                try {
                    oooO0OO.f119569OooOo0o.execute(oooO0OO);
                } catch (Throwable th) {
                    C33065OooOOOo.f119562OooOoO.log(Level.INFO, "Exception notifying context listener", th);
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this) {
            }
        }

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
        public final void ooOO(OooO0O0 oooO0O0, C33065OooOOOo c33065OooOOOo) {
            synchronized (this) {
                try {
                    ArrayList<OooO0OO> arrayList = this.f119567OooOoo0;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            OooO0OO oooO0OO = this.f119567OooOoo0.get(size);
                            if (oooO0OO.f119568OooOo == oooO0O0 && oooO0OO.f119570OooOoO0 == c33065OooOOOo) {
                                this.f119567OooOoo0.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.f119567OooOoo0.isEmpty()) {
                            OooO00o oooO00o = this.f119565OooOo0o;
                            if (oooO00o != null) {
                                oooO00o.ooOO(null, oooO00o);
                            }
                            this.f119567OooOoo0 = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooOOOo$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(C33065OooOOOo c33065OooOOOo);
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooOOOo$OooO0OO */
    public static final class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0 f119568OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Executor f119569OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C33065OooOOOo f119570OooOoO0;

        public OooO0OO(Executor executor, OooO0O0 oooO0O0, C33065OooOOOo c33065OooOOOo) {
            this.f119569OooOo0o = executor;
            this.f119568OooOo = oooO0O0;
            this.f119570OooOoO0 = c33065OooOOOo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f119568OooOo.OooO00o(this.f119570OooOoO0);
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooOOOo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C33066OooO0Oo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f119571OooO00o;

        public C33066OooO0Oo() {
            Logger logger = C33065OooOOOo.f119562OooOoO;
            this.f119571OooO00o = "opencensus-trace-span-key";
        }

        public final String toString() {
            return this.f119571OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooOOOo$OooO0o */
    public static abstract class OooO0o {
        public abstract C33065OooOOOo OooO00o();

        public abstract void OooO0O0(C33065OooOOOo c33065OooOOOo, C33065OooOOOo c33065OooOOOo2);

        public abstract C33065OooOOOo OooO0OO(C33065OooOOOo c33065OooOOOo);
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooOOOo$OooO0o0, reason: case insensitive filesystem */
    public static final class C33067OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f119572OooO00o;

        static {
            OooO0o c33120o00oO0o;
            AtomicReference atomicReference = new AtomicReference();
            try {
                c33120o00oO0o = (OooO0o) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(OooO0o.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                c33120o00oO0o = new C33120o00oO0o();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
            f119572OooO00o = c33120o00oO0o;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C33065OooOOOo.f119562OooOoO.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    public C33065OooOOOo(C33065OooOOOo c33065OooOOOo, InterfaceC33108Ooooo0o<C33066OooO0Oo<?>, Object> interfaceC33108Ooooo0o) {
        this.f119565OooOo0o = c33065OooOOOo instanceof OooO00o ? (OooO00o) c33065OooOOOo : c33065OooOOOo.f119565OooOo0o;
        this.f119564OooOo = interfaceC33108Ooooo0o;
        int i = c33065OooOOOo.f119566OooOoO0 + 1;
        this.f119566OooOoO0 = i;
        if (i == 1000) {
            f119562OooOoO.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static void OooOOo0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static C33065OooOOOo OooOOoo() {
        C33065OooOOOo c33065OooOOOoOooO00o = C33067OooO0o0.f119572OooO00o.OooO00o();
        return c33065OooOOOoOooO00o == null ? f119563OooOoOO : c33065OooOOOoOooO00o;
    }

    public void OooO00o(OooO0O0 oooO0O0, Executor executor) {
        OooOOo0(oooO0O0, "cancellationListener");
        OooOOo0(executor, "executor");
        OooO00o oooO00o = this.f119565OooOo0o;
        if (oooO00o == null) {
            return;
        }
        oooO00o.Oooo0OO(new OooO0OO(executor, oooO0O0, this));
    }

    public C33065OooOOOo OooO0OO() {
        C33065OooOOOo c33065OooOOOoOooO0OO = C33067OooO0o0.f119572OooO00o.OooO0OO(this);
        return c33065OooOOOoOooO0OO == null ? f119563OooOoOO : c33065OooOOOoOooO0OO;
    }

    public Throwable OooOOO0() {
        OooO00o oooO00o = this.f119565OooOo0o;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooOOO0();
    }

    public void OooOooo(C33065OooOOOo c33065OooOOOo) {
        OooOOo0(c33065OooOOOo, "toAttach");
        C33067OooO0o0.f119572OooO00o.OooO0O0(this, c33065OooOOOo);
    }

    public void Oooo0(OooO0O0 oooO0O0) {
        OooO00o oooO00o = this.f119565OooOo0o;
        if (oooO00o == null) {
            return;
        }
        oooO00o.ooOO(oooO0O0, this);
    }

    public void Oooo000() {
    }

    public boolean Oooo00o() {
        OooO00o oooO00o = this.f119565OooOo0o;
        if (oooO00o == null) {
            return false;
        }
        return oooO00o.Oooo00o();
    }

    public C33065OooOOOo() {
        this.f119565OooOo0o = null;
        this.f119564OooOo = null;
        this.f119566OooOoO0 = 0;
    }
}
