package o00OooOo;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import o00Ooo00.C25100OooO00o;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.C25129OooO0oO;
import o00OooOo.C25162OooO0O0;

/* JADX INFO: renamed from: o00OooOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25163OooO0OO implements InterfaceC25161OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f85663OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C25100OooO00o f85666OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25162OooO0O0 f85665OooO0Oo = new C25162OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f85664OooO0OO = 262144000;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25168OooO0oo f85662OooO00o = new C25168OooO0oo();

    @Deprecated
    public C25163OooO0OO(File file) {
        this.f85663OooO0O0 = file;
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
    @Override // o00OooOo.InterfaceC25161OooO00o
    public final void OooO00o(InterfaceC25116OooO0o interfaceC25116OooO0o, C25129OooO0oO c25129OooO0oO) {
        C25162OooO0O0.OooO00o oooO00o;
        C25100OooO00o c25100OooO00oOooO0OO;
        boolean z;
        String strOooO00o = this.f85662OooO00o.OooO00o(interfaceC25116OooO0o);
        C25162OooO0O0 c25162OooO0O0 = this.f85665OooO0Oo;
        synchronized (c25162OooO0O0) {
            oooO00o = (C25162OooO0O0.OooO00o) c25162OooO0O0.f85657OooO00o.get(strOooO00o);
            if (oooO00o == null) {
                C25162OooO0O0.C19680OooO0O0 c19680OooO0O0 = c25162OooO0O0.f85658OooO0O0;
                synchronized (c19680OooO0O0.f85661OooO00o) {
                    oooO00o = (C25162OooO0O0.OooO00o) c19680OooO0O0.f85661OooO00o.poll();
                }
                if (oooO00o == null) {
                    oooO00o = new C25162OooO0O0.OooO00o();
                }
                c25162OooO0O0.f85657OooO00o.put(strOooO00o, oooO00o);
            }
            oooO00o.f85660OooO0O0++;
        }
        oooO00o.f85659OooO00o.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strOooO00o + " for for Key: " + interfaceC25116OooO0o);
            }
            try {
                c25100OooO00oOooO0OO = OooO0OO();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (c25100OooO00oOooO0OO.OooOooo(strOooO00o) != null) {
                return;
            }
            C25100OooO00o.OooO0OO oooO0OOOooOOo0 = c25100OooO00oOooO0OO.OooOOo0(strOooO00o);
            if (oooO0OOOooOOo0 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strOooO00o));
            }
            try {
                if (c25129OooO0oO.f85430OooO00o.OooO00o(c25129OooO0oO.f85431OooO0O0, oooO0OOOooOOo0.OooO0O0(), c25129OooO0oO.f85432OooO0OO)) {
                    C25100OooO00o.OooO00o(C25100OooO00o.this, oooO0OOOooOOo0, true);
                    oooO0OOOooOOo0.f85272OooO0OO = true;
                }
                if (!z) {
                    try {
                        oooO0OOOooOOo0.OooO00o();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!oooO0OOOooOOo0.f85272OooO0OO) {
                    try {
                        oooO0OOOooOOo0.OooO00o();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            this.f85665OooO0Oo.OooO00o(strOooO00o);
        }
    }

    @Override // o00OooOo.InterfaceC25161OooO00o
    public final File OooO0O0(InterfaceC25116OooO0o interfaceC25116OooO0o) {
        String strOooO00o = this.f85662OooO00o.OooO00o(interfaceC25116OooO0o);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strOooO00o + " for for Key: " + interfaceC25116OooO0o);
        }
        try {
            C25100OooO00o.C25102OooO0o0 c25102OooO0o0OooOooo = OooO0OO().OooOooo(strOooO00o);
            if (c25102OooO0o0OooOooo != null) {
                return c25102OooO0o0OooOooo.f85281OooO00o[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public final synchronized C25100OooO00o OooO0OO() throws IOException {
        try {
            if (this.f85666OooO0o0 == null) {
                this.f85666OooO0o0 = C25100OooO00o.Oooo00o(this.f85663OooO0O0, this.f85664OooO0OO);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f85666OooO0o0;
    }
}
