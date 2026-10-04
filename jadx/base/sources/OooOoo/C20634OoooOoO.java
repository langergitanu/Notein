package OooOoo;

import OoooOoO.InterfaceC21235OooO0oO;
import o00Oo0oO.C25050OooO0O0;
import o00oO0o.C25570OooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: OooOoo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20634OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f59098OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25570OooO<Boolean> f59099OooO0O0 = C25050OooO0O0.OooO0o(OooO0O0.f59101OooOo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f59100OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooOoo.OoooOoO$OooO00o */
    public static final class OooO00o implements InterfaceC21235OooO0oO {
        @Override // oOo0000O.InterfaceC34415OooO0oo
        public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
            return interfaceC32508OooOOOo.invoke(r, this);
        }

        @Override // oOo0000O.InterfaceC34415OooO0oo
        public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> key) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, key);
        }

        @Override // oOo0000O.InterfaceC34415OooO0oo
        public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> key) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, key);
        }

        @Override // OoooOoO.InterfaceC21235OooO0oO
        public final float o00000OO() {
            return 1.0f;
        }

        @Override // oOo0000O.InterfaceC34415OooO0oo
        public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo context) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            return InterfaceC34415OooO0oo.OooO00o.OooO00o(this, context);
        }
    }

    /* JADX INFO: renamed from: OooOoo.OoooOoO$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f59101OooOo0o = new OooO0O0(0);

        @Override // oO0O000o.OooO00o
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: OooOoo.OoooOoO$OooO0OO */
    public static final class OooO0OO implements InterfaceC20633OoooOo0 {
        @Override // OooOoo.InterfaceC20633OoooOo0
        public final float OooO00o(float f) {
            return f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OooO00o(o00Ooo.InterfaceC25074OooO0OO r5, oO00ooo.AbstractC32477OooO00o r6) {
        /*
            boolean r0 = r6 instanceof OooOoo.C20635OoooOoo
            if (r0 == 0) goto L13
            r0 = r6
            OooOoo.OoooOoo r0 = (OooOoo.C20635OoooOoo) r0
            int r1 = r0.f59104OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59104OooOoO0 = r1
            goto L18
        L13:
            OooOoo.OoooOoo r0 = new OooOoo.OoooOoo
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f59102OooOo
            oO00ooo0.OooO00o r1 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
            int r2 = r0.f59104OooOoO0
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o00Ooo.OooO0OO r5 = r0.f59103OooOo0o
            oO00ooO.C32446OooOOOo.OooO0O0(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oO00ooO.C32446OooOOOo.OooO0O0(r6)
        L34:
            r0.f59103OooOo0o = r5
            r0.f59104OooOoO0 = r3
            o00Ooo.OooOOOO r6 = o00Ooo.OooOOOO.f85129OooOo
            java.lang.Object r6 = r5.o00o0O(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            o00Ooo.OooOOO0 r6 = (o00Ooo.OooOOO0) r6
            int r2 = r6.f85128OooO0O0
            r4 = 6
            if (r2 != r4) goto L34
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOoo.C20634OoooOoO.OooO00o(o00Ooo.OooO0OO, oO00ooo.OooO00o):java.lang.Object");
    }
}
