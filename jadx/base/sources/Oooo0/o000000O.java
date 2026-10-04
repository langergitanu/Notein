package Oooo0;

import android.content.res.Resources;
import android.text.Spanned;
import android.util.TypedValue;
import java.text.BreakIterator;
import o000O000.C24382OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {
    public static boolean OooO(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-6f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o000O000.OooO0oo] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int OooO00o(int i, String str) {
        androidx.emoji2.text.OooO0OO oooO0OOOooO00o;
        ?? r3;
        ?? r32;
        int spanEnd;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        Integer num = null;
        if (androidx.emoji2.text.OooO0OO.OooO0OO()) {
            oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
            if (oooO0OOOooO00o.OooO0O0() != 1) {
                oooO0OOOooO00o = null;
            }
        }
        if (oooO0OOOooO00o != null) {
            ?? r2 = oooO0OOOooO00o.f64713OooO0o0.f64716OooO0O0;
            r2.getClass();
            if (i < 0 || i >= str.length()) {
                r32 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                o000O000.OooO[] oooOArr = (o000O000.OooO[]) spanned.getSpans(i, i + 1, o000O000.OooO.class);
                if (oooOArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(oooOArr[0]);
                    r32 = str;
                } else {
                    ?? r33 = str;
                    spanEnd = ((C24382OooO0oo.OooO0OO) r2.OooO0OO(r33, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new C24382OooO0oo.OooO0OO(i))).f82266OooO0OO;
                    r32 = r33;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r3 = r32;
            if (spanEnd != -1) {
                num = numValueOf;
                r3 = r32;
            }
        } else {
            r3 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r3);
        return characterInstance.following(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o000O000.OooO0oo] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.CharSequence] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int OooO0O0(int i, String str) {
        androidx.emoji2.text.OooO0OO oooO0OOOooO00o;
        ?? r5;
        ?? r52;
        int spanStart;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        Integer num = null;
        if (androidx.emoji2.text.OooO0OO.OooO0OO()) {
            oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
            if (oooO0OOOooO00o.OooO0O0() != 1) {
                oooO0OOOooO00o = null;
            }
        }
        if (oooO0OOOooO00o != null) {
            int iMax = Math.max(0, i - 1);
            ?? r4 = oooO0OOOooO00o.f64713OooO0o0.f64716OooO0O0;
            r4.getClass();
            if (iMax < 0 || iMax >= str.length()) {
                r52 = str;
                spanStart = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                o000O000.OooO[] oooOArr = (o000O000.OooO[]) spanned.getSpans(iMax, iMax + 1, o000O000.OooO.class);
                if (oooOArr.length > 0) {
                    spanStart = spanned.getSpanStart(oooOArr[0]);
                    r52 = str;
                } else {
                    ?? r53 = str;
                    spanStart = ((C24382OooO0oo.OooO0OO) r4.OooO0OO(r53, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new C24382OooO0oo.OooO0OO(iMax))).f82265OooO0O0;
                    r52 = r53;
                }
            }
            Integer numValueOf = Integer.valueOf(spanStart);
            r5 = r52;
            if (spanStart != -1) {
                num = numValueOf;
                r5 = r52;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.preceding(i);
    }

    public static final int OooO0OO(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float OooO0Oo(float f) {
        return TypedValue.applyDimension(5, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final int OooO0o(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float OooO0o0(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float OooO0oO(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float OooO0oo(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }
}
