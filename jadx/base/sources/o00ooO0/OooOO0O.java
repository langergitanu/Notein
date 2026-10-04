package o00ooO0;

import android.graphics.Bitmap;
import java.util.HashSet;
import o00o0o00.C25438OooO00o;
import o00ooO0.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f87848OooO00o = new HashSet();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0<Bitmap> f87849OooO0O0 = new OooOOO0<>();

    public static boolean OooO0O0(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C25438OooO00o.OooOO0O("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        C25438OooO00o.OooOO0O("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
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
    public final Bitmap OooO00o(int i) {
        Object objPollFirst;
        OooOOO0<Bitmap> oooOOO0 = this.f87849OooO0O0;
        synchronized (oooOOO0) {
            OooOOO0.OooO00o oooO00o = oooOOO0.f87854OooO00o.get(i);
            if (oooO00o == null) {
                objPollFirst = null;
            } else {
                objPollFirst = oooO00o.f87859OooO0OO.pollFirst();
                if (oooOOO0.f87855OooO0O0 != oooO00o) {
                    oooOOO0.OooO00o(oooO00o);
                    OooOOO0.OooO00o oooO00o2 = oooOOO0.f87855OooO0O0;
                    if (oooO00o2 == null) {
                        oooOOO0.f87855OooO0O0 = oooO00o;
                        oooOOO0.f87856OooO0OO = oooO00o;
                    } else {
                        oooO00o.f87860OooO0Oo = oooO00o2;
                        oooO00o2.f87857OooO00o = oooO00o;
                        oooOOO0.f87855OooO0O0 = oooO00o;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                this.f87848OooO00o.remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !OooO0O0(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    public final Bitmap OooO0OO() {
        Bitmap bitmap;
        OooOOO0<Bitmap> oooOOO0 = this.f87849OooO0O0;
        synchronized (oooOOO0) {
            OooOOO0.OooO00o<Bitmap> oooO00o = oooOOO0.f87856OooO0OO;
            if (oooO00o == null) {
                bitmap = null;
            } else {
                Bitmap bitmapPollLast = oooO00o.f87859OooO0OO.pollLast();
                if (oooO00o.f87859OooO0OO.isEmpty()) {
                    oooOOO0.OooO00o(oooO00o);
                    oooOOO0.f87854OooO00o.remove(oooO00o.f87858OooO0O0);
                }
                bitmap = bitmapPollLast;
            }
        }
        if (bitmap == null) {
            return bitmap;
        }
        synchronized (this) {
            this.f87848OooO00o.remove(bitmap);
        }
        return bitmap;
    }
}
