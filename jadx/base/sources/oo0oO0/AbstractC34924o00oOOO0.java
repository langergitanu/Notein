package oo0oO0;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27009OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oo0oO0.o00oOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC34924o00oOOO0 {

    /* JADX INFO: renamed from: oo0oO0.o00oOOO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Float f125509OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Float f125510OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Float f125511OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Float f125512OooO0Oo;

        public OooO00o(Float f, Float f2, Float f3, Float f4) {
            this.f125509OooO00o = f;
            this.f125510OooO0O0 = f2;
            this.f125511OooO0OO = f3;
            this.f125512OooO0Oo = f4;
        }

        public final RectF OooO00o() {
            Float f;
            Float f2;
            Float f3;
            Float f4 = this.f125509OooO00o;
            if (f4 == null || (f = this.f125510OooO0O0) == null || (f2 = this.f125511OooO0OO) == null || (f3 = this.f125512OooO0Oo) == null) {
                return null;
            }
            return new RectF(f4.floatValue(), f.floatValue(), f2.floatValue(), f3.floatValue());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125509OooO00o, oooO00o.f125509OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125510OooO0O0, oooO00o.f125510OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125511OooO0OO, oooO00o.f125511OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125512OooO0Oo, oooO00o.f125512OooO0Oo);
        }

        public final int hashCode() {
            Float f = this.f125509OooO00o;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.f125510OooO0O0;
            int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.f125511OooO0OO;
            int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
            Float f4 = this.f125512OooO0Oo;
            return iHashCode3 + (f4 != null ? f4.hashCode() : 0);
        }

        public final String toString() {
            return "BoundingBox(left=" + this.f125509OooO00o + ", top=" + this.f125510OooO0O0 + ", right=" + this.f125511OooO0OO + ", bottom=" + this.f125512OooO0Oo + ")";
        }
    }

    /* JADX INFO: renamed from: oo0oO0.o00oOOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.PageSizeDao", m80623f = "PageSizeDao.kt", m80624l = {30, 33, 36, 39, 42, 45}, m80625m = "getDisplayItemBounds$suspendImpl")
    public static final class OooO0O0 extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f125513OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f125514OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f125515OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public RectF f125516OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f125518OooOoo0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f125515OooOoO = obj;
            this.f125518OooOoo0 |= Integer.MIN_VALUE;
            return AbstractC34924o00oOOO0.OooO0O0(AbstractC34924o00oOOO0.this, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        if (r7 != r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[PHI: r2 r5 r6 r7
      0x00a9: PHI (r2v7 oo0oO0.o00oOOO0) = (r2v4 oo0oO0.o00oOOO0), (r2v9 oo0oO0.o00oOOO0) binds: [B:26:0x00a6, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r5v4 android.graphics.RectF) = (r5v2 android.graphics.RectF), (r5v5 android.graphics.RectF) binds: [B:26:0x00a6, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:26:0x00a6, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r7v9 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:26:0x00a6, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[PHI: r2 r5 r6 r7
      0x00c4: PHI (r2v10 oo0oO0.o00oOOO0) = (r2v7 oo0oO0.o00oOOO0), (r2v12 oo0oO0.o00oOOO0) binds: [B:32:0x00c1, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r5v6 android.graphics.RectF) = (r5v4 android.graphics.RectF), (r5v7 android.graphics.RectF) binds: [B:32:0x00c1, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r6v5 java.lang.String) = (r6v3 java.lang.String), (r6v6 java.lang.String) binds: [B:32:0x00c1, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r7v14 java.lang.Object) = (r7v13 java.lang.Object), (r7v1 java.lang.Object) binds: [B:32:0x00c1, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[PHI: r2 r5 r6 r7
      0x00df: PHI (r2v13 oo0oO0.o00oOOO0) = (r2v10 oo0oO0.o00oOOO0), (r2v15 oo0oO0.o00oOOO0) binds: [B:38:0x00dc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r5v8 android.graphics.RectF) = (r5v6 android.graphics.RectF), (r5v9 android.graphics.RectF) binds: [B:38:0x00dc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r6v7 java.lang.String) = (r6v5 java.lang.String), (r6v8 java.lang.String) binds: [B:38:0x00dc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r7v19 java.lang.Object) = (r7v18 java.lang.Object), (r7v1 java.lang.Object) binds: [B:38:0x00dc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa A[PHI: r2 r5 r6 r7
      0x00fa: PHI (r2v16 oo0oO0.o00oOOO0) = (r2v13 oo0oO0.o00oOOO0), (r2v18 oo0oO0.o00oOOO0) binds: [B:44:0x00f7, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r5v10 android.graphics.RectF) = (r5v8 android.graphics.RectF), (r5v11 android.graphics.RectF) binds: [B:44:0x00f7, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r6v9 java.lang.String) = (r6v7 java.lang.String), (r6v10 java.lang.String) binds: [B:44:0x00f7, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r7v24 java.lang.Object) = (r7v23 java.lang.Object), (r7v1 java.lang.Object) binds: [B:44:0x00f7, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooO0O0(AbstractC34924o00oOOO0 abstractC34924o00oOOO0, String str, Continuation<? super RectF> continuation) {
        OooO0O0 oooO0O0;
        AbstractC34924o00oOOO0 abstractC34924o00oOOO02;
        RectF rectF;
        RectF rectFOooO00o;
        RectF rectFOooO00o2;
        RectF rectFOooO00o3;
        RectF rectFOooO00o4;
        RectF rectFOooO00o5;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f125518OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f125518OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = abstractC34924o00oOOO0.new OooO0O0(continuation);
            }
        }
        Object objOooO0o0 = oooO0O0.f125515OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (oooO0O0.f125518OooOoo0) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0o0);
                RectF rectF2 = new RectF();
                oooO0O0.f125514OooOo0o = abstractC34924o00oOOO0;
                oooO0O0.f125513OooOo = str;
                oooO0O0.f125516OooOoO0 = rectF2;
                oooO0O0.f125518OooOoo0 = 1;
                Object objOooO0oO = abstractC34924o00oOOO0.OooO0oO(str, oooO0O0);
                if (objOooO0oO != enumC32485OooO00o) {
                    abstractC34924o00oOOO02 = abstractC34924o00oOOO0;
                    rectF = rectF2;
                    objOooO0o0 = objOooO0oO;
                    rectFOooO00o = ((OooO00o) objOooO0o0).OooO00o();
                    if (rectFOooO00o != null) {
                        rectF.union(rectFOooO00o);
                    }
                    oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                    oooO0O0.f125513OooOo = str;
                    oooO0O0.f125516OooOoO0 = rectF;
                    oooO0O0.f125518OooOoo0 = 2;
                    objOooO0o0 = abstractC34924o00oOOO02.OooO0o0(str, oooO0O0);
                    if (objOooO0o0 != enumC32485OooO00o) {
                        rectFOooO00o2 = ((OooO00o) objOooO0o0).OooO00o();
                        if (rectFOooO00o2 != null) {
                            rectF.union(rectFOooO00o2);
                        }
                        oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                        oooO0O0.f125513OooOo = str;
                        oooO0O0.f125516OooOoO0 = rectF;
                        oooO0O0.f125518OooOoo0 = 3;
                        objOooO0o0 = abstractC34924o00oOOO02.OooO0oo(str, oooO0O0);
                        if (objOooO0o0 != enumC32485OooO00o) {
                            rectFOooO00o3 = ((OooO00o) objOooO0o0).OooO00o();
                            if (rectFOooO00o3 != null) {
                                rectF.union(rectFOooO00o3);
                            }
                            oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                            oooO0O0.f125513OooOo = str;
                            oooO0O0.f125516OooOoO0 = rectF;
                            oooO0O0.f125518OooOoo0 = 4;
                            objOooO0o0 = abstractC34924o00oOOO02.OooO0o(str, oooO0O0);
                            if (objOooO0o0 != enumC32485OooO00o) {
                                rectFOooO00o4 = ((OooO00o) objOooO0o0).OooO00o();
                                if (rectFOooO00o4 != null) {
                                    rectF.union(rectFOooO00o4);
                                }
                                oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                                oooO0O0.f125513OooOo = str;
                                oooO0O0.f125516OooOoO0 = rectF;
                                oooO0O0.f125518OooOoo0 = 5;
                                objOooO0o0 = abstractC34924o00oOOO02.OooO0Oo(str, oooO0O0);
                                if (objOooO0o0 != enumC32485OooO00o) {
                                    rectFOooO00o5 = ((OooO00o) objOooO0o0).OooO00o();
                                    if (rectFOooO00o5 != null) {
                                        rectF.union(rectFOooO00o5);
                                    }
                                    oooO0O0.f125514OooOo0o = rectF;
                                    oooO0O0.f125513OooOo = null;
                                    oooO0O0.f125516OooOoO0 = null;
                                    oooO0O0.f125518OooOoo0 = 6;
                                    objOooO0o0 = abstractC34924o00oOOO02.OooO0OO(str, oooO0O0);
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                rectF = oooO0O0.f125516OooOoO0;
                str = oooO0O0.f125513OooOo;
                abstractC34924o00oOOO02 = (AbstractC34924o00oOOO0) oooO0O0.f125514OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                rectFOooO00o = ((OooO00o) objOooO0o0).OooO00o();
                if (rectFOooO00o != null) {
                }
                oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                oooO0O0.f125513OooOo = str;
                oooO0O0.f125516OooOoO0 = rectF;
                oooO0O0.f125518OooOoo0 = 2;
                objOooO0o0 = abstractC34924o00oOOO02.OooO0o0(str, oooO0O0);
                if (objOooO0o0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                rectF = oooO0O0.f125516OooOoO0;
                str = oooO0O0.f125513OooOo;
                abstractC34924o00oOOO02 = (AbstractC34924o00oOOO0) oooO0O0.f125514OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                rectFOooO00o2 = ((OooO00o) objOooO0o0).OooO00o();
                if (rectFOooO00o2 != null) {
                }
                oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                oooO0O0.f125513OooOo = str;
                oooO0O0.f125516OooOoO0 = rectF;
                oooO0O0.f125518OooOoo0 = 3;
                objOooO0o0 = abstractC34924o00oOOO02.OooO0oo(str, oooO0O0);
                if (objOooO0o0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                rectF = oooO0O0.f125516OooOoO0;
                str = oooO0O0.f125513OooOo;
                abstractC34924o00oOOO02 = (AbstractC34924o00oOOO0) oooO0O0.f125514OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                rectFOooO00o3 = ((OooO00o) objOooO0o0).OooO00o();
                if (rectFOooO00o3 != null) {
                }
                oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                oooO0O0.f125513OooOo = str;
                oooO0O0.f125516OooOoO0 = rectF;
                oooO0O0.f125518OooOoo0 = 4;
                objOooO0o0 = abstractC34924o00oOOO02.OooO0o(str, oooO0O0);
                if (objOooO0o0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                rectF = oooO0O0.f125516OooOoO0;
                str = oooO0O0.f125513OooOo;
                abstractC34924o00oOOO02 = (AbstractC34924o00oOOO0) oooO0O0.f125514OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                rectFOooO00o4 = ((OooO00o) objOooO0o0).OooO00o();
                if (rectFOooO00o4 != null) {
                }
                oooO0O0.f125514OooOo0o = abstractC34924o00oOOO02;
                oooO0O0.f125513OooOo = str;
                oooO0O0.f125516OooOoO0 = rectF;
                oooO0O0.f125518OooOoo0 = 5;
                objOooO0o0 = abstractC34924o00oOOO02.OooO0Oo(str, oooO0O0);
                if (objOooO0o0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                rectF = oooO0O0.f125516OooOoO0;
                str = oooO0O0.f125513OooOo;
                abstractC34924o00oOOO02 = (AbstractC34924o00oOOO0) oooO0O0.f125514OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                rectFOooO00o5 = ((OooO00o) objOooO0o0).OooO00o();
                if (rectFOooO00o5 != null) {
                }
                oooO0O0.f125514OooOo0o = rectF;
                oooO0O0.f125513OooOo = null;
                oooO0O0.f125516OooOoO0 = null;
                oooO0O0.f125518OooOoo0 = 6;
                objOooO0o0 = abstractC34924o00oOOO02.OooO0OO(str, oooO0O0);
                break;
            case 6:
                rectF = (RectF) oooO0O0.f125514OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                RectF rectFOooO00o6 = ((OooO00o) objOooO0o0).OooO00o();
                if (rectFOooO00o6 != null) {
                    rectF.union(rectFOooO00o6);
                }
                return rectF;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Object OooO00o(String str, C27009OooO0oO c27009OooO0oO) {
        return OooO0O0(this, str, c27009OooO0oO);
    }

    public abstract Object OooO0OO(String str, OooO0O0 oooO0O0);

    public abstract Object OooO0Oo(String str, OooO0O0 oooO0O0);

    public abstract Object OooO0o(String str, OooO0O0 oooO0O0);

    public abstract Object OooO0o0(String str, OooO0O0 oooO0O0);

    public abstract Object OooO0oO(String str, OooO0O0 oooO0O0);

    public abstract Object OooO0oo(String str, OooO0O0 oooO0O0);
}
