package o00ooO0;

import android.graphics.Bitmap;
import java.util.LinkedList;
import o00ooO0.OooOOO0;
import o00ooOO.C25767OooO0OO;

/* JADX INFO: renamed from: o00ooO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25746OooOo0O implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f87869OooO00o = new OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f87870OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25751OooOoo f87871OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f87872OooO0Oo;

    public C25746OooOo0O(int i, C25751OooOoo c25751OooOoo) {
        this.f87870OooO0O0 = i;
        this.f87871OooO0OO = c25751OooOoo;
    }

    @Override // o00o0o0o.InterfaceC25448OooO0o0
    public final Bitmap get(int i) {
        Bitmap bitmap;
        synchronized (this) {
            if (this.f87872OooO0Oo > 0) {
                synchronized (this) {
                    while (this.f87872OooO0Oo > 0 && (bitmap = (Bitmap) this.f87869OooO00o.OooO0OO()) != null) {
                        this.f87869OooO00o.getClass();
                        this.f87872OooO0Oo -= C25767OooO0OO.OooO0Oo(bitmap);
                        this.f87871OooO0OO.getClass();
                    }
                }
            }
            Bitmap bitmapOooO00o = this.f87869OooO00o.OooO00o(i);
            if (bitmapOooO00o == null) {
                this.f87871OooO0OO.getClass();
                return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
            }
            this.f87869OooO00o.getClass();
            this.f87872OooO0Oo -= C25767OooO0OO.OooO0Oo(bitmapOooO00o);
            this.f87871OooO0OO.getClass();
            return bitmapOooO00o;
        }
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
    @Override // o00o0o.InterfaceC25436OooO0OO
    public final void release(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        this.f87869OooO00o.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
        int iOooO0Oo = C25767OooO0OO.OooO0Oo(bitmap);
        if (iOooO0Oo <= this.f87870OooO0O0) {
            this.f87871OooO0OO.getClass();
            OooOO0O oooOO0O = this.f87869OooO00o;
            oooOO0O.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
            if (OooOO0O.OooO0O0(bitmap)) {
                synchronized (oooOO0O) {
                    zAdd = oooOO0O.f87848OooO00o.add(bitmap);
                }
                if (zAdd) {
                    OooOOO0<Bitmap> oooOOO0 = oooOO0O.f87849OooO0O0;
                    int iOooO0Oo2 = C25767OooO0OO.OooO0Oo(bitmap);
                    synchronized (oooOOO0) {
                        try {
                            OooOOO0.OooO00o oooO00o = (OooOOO0.OooO00o) oooOOO0.f87854OooO00o.get(iOooO0Oo2);
                            OooOOO0.OooO00o oooO00o2 = oooO00o;
                            if (oooO00o == null) {
                                LinkedList<I> linkedList = new LinkedList<>();
                                OooOOO0.OooO00o oooO00o3 = new OooOOO0.OooO00o();
                                oooO00o3.f87857OooO00o = null;
                                oooO00o3.f87858OooO0O0 = iOooO0Oo2;
                                oooO00o3.f87859OooO0OO = linkedList;
                                oooO00o3.f87860OooO0Oo = null;
                                oooOOO0.f87854OooO00o.put(iOooO0Oo2, oooO00o3);
                                oooO00o2 = oooO00o3;
                            }
                            oooO00o2.f87859OooO0OO.addLast(bitmap);
                            if (oooOOO0.f87855OooO0O0 != oooO00o2) {
                                oooOOO0.OooO00o(oooO00o2);
                                OooOOO0.OooO00o oooO00o4 = oooOOO0.f87855OooO0O0;
                                if (oooO00o4 == null) {
                                    oooOOO0.f87855OooO0O0 = oooO00o2;
                                    oooOOO0.f87856OooO0OO = oooO00o2;
                                } else {
                                    oooO00o2.f87860OooO0Oo = oooO00o4;
                                    oooO00o4.f87857OooO00o = oooO00o2;
                                    oooOOO0.f87855OooO0O0 = oooO00o2;
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                this.f87872OooO0Oo += iOooO0Oo;
            }
        }
    }
}
