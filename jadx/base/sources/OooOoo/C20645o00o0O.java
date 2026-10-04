package OooOoo;

import OooooO0.C21290OooO0o0;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25074OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32477OooO00o;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: OooOoo.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20645o00o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f59157OooO00o = new OooO00o(3, null);

    /* JADX INFO: renamed from: OooOoo.o00o0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m80623f = "TapGestureDetector.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC20617Oooo, C21290OooO0o0, Continuation<? super C32460OooOooO>, Object> {
        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC20617Oooo interfaceC20617Oooo, C21290OooO0o0 c21290OooO0o0, Continuation<? super C32460OooOooO> continuation) {
            long j = c21290OooO0o0.f61722OooO00o;
            return new OooO00o(3, continuation).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OooO00o(o00Ooo.InterfaceC25074OooO0OO r10, boolean r11, o00Ooo.OooOOOO r12, oO00ooo.AbstractC32477OooO00o r13) {
        /*
            boolean r0 = r13 instanceof OooOoo.C20647o00ooo
            if (r0 == 0) goto L13
            r0 = r13
            OooOoo.o00ooo r0 = (OooOoo.C20647o00ooo) r0
            int r1 = r0.f59173OooOoOO
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59173OooOoOO = r1
            goto L18
        L13:
            OooOoo.o00ooo r0 = new OooOoo.o00ooo
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f59171OooOoO
            oO00ooo0.OooO00o r1 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
            int r2 = r0.f59173OooOoOO
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f59172OooOoO0
            o00Ooo.OooOOOO r11 = r0.f59169OooOo
            o00Ooo.OooO0OO r12 = r0.f59170OooOo0o
            oO00ooO.C32446OooOOOo.OooO0O0(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            oO00ooO.C32446OooOOOo.OooO0O0(r13)
        L3c:
            r0.f59170OooOo0o = r10
            r0.f59169OooOo = r12
            r0.f59172OooOoO0 = r11
            r0.f59173OooOoOO = r3
            java.lang.Object r13 = r10.o00o0O(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            o00Ooo.OooOOO0 r13 = (o00Ooo.OooOOO0) r13
            java.util.List<o00Ooo.OooOo00> r2 = r13.f85127OooO00o
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L81
            java.lang.Object r7 = r2.get(r6)
            o00Ooo.OooOo00 r7 = (o00Ooo.OooOo00) r7
            if (r11 == 0) goto L76
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.OooOOO0.OooO0oO(r7, r8)
            boolean r8 = r7.OooO0O0()
            if (r8 != 0) goto L74
            boolean r8 = r7.f85150OooO0oO
            if (r8 != 0) goto L74
            boolean r7 = r7.f85147OooO0Oo
            if (r7 == 0) goto L74
            r7 = r3
            goto L7a
        L74:
            r7 = r5
            goto L7a
        L76:
            boolean r7 = o00Ooo.OooOOO.OooO00o(r7)
        L7a:
            if (r7 != 0) goto L7e
            r2 = r5
            goto L82
        L7e:
            int r6 = r6 + 1
            goto L55
        L81:
            r2 = r3
        L82:
            if (r2 == 0) goto L3c
            java.util.List<o00Ooo.OooOo00> r10 = r13.f85127OooO00o
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOoo.C20645o00o0O.OooO00o(o00Ooo.OooO0OO, boolean, o00Ooo.OooOOOO, oO00ooo.OooO00o):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c1 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(InterfaceC25074OooO0OO interfaceC25074OooO0OO, o00Ooo.OooOOOO oooOOOO, AbstractC32477OooO00o abstractC32477OooO00o) {
        C20646o00oO0o c20646o00oO0o;
        InterfaceC25074OooO0OO interfaceC25074OooO0OO2;
        C20646o00oO0o c20646o00oO0o2;
        o00Ooo.OooOOOO oooOOOO2;
        InterfaceC25074OooO0OO interfaceC25074OooO0OO3;
        o00Ooo.OooOOOO oooOOOO3;
        o00Ooo.OooOOO0 oooOOO0;
        int size;
        int i;
        List<o00Ooo.OooOo00> list;
        int size2;
        int i2;
        Object objO00o0O;
        if (abstractC32477OooO00o instanceof C20646o00oO0o) {
            c20646o00oO0o = (C20646o00oO0o) abstractC32477OooO00o;
            int i3 = c20646o00oO0o.f59167OooOoO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20646o00oO0o.f59167OooOoO = i3 - Integer.MIN_VALUE;
            } else {
                c20646o00oO0o = new C20646o00oO0o(abstractC32477OooO00o);
            }
        }
        Object objO00o0O2 = c20646o00oO0o.f59168OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c20646o00oO0o.f59167OooOoO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objO00o0O2);
            interfaceC25074OooO0OO2 = interfaceC25074OooO0OO;
            c20646o00oO0o2 = c20646o00oO0o;
            oooOOOO2 = oooOOOO;
            c20646o00oO0o2.f59166OooOo0o = interfaceC25074OooO0OO2;
            c20646o00oO0o2.f59165OooOo = oooOOOO2;
            c20646o00oO0o2.f59167OooOoO = 1;
            objO00o0O = interfaceC25074OooO0OO2.o00o0O(oooOOOO2, c20646o00oO0o2);
            if (objO00o0O != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOOO3 = c20646o00oO0o.f59165OooOo;
            interfaceC25074OooO0OO3 = c20646o00oO0o.f59166OooOo0o;
            C32446OooOOOo.OooO0O0(objO00o0O2);
            o00Ooo.OooOOOO oooOOOO4 = oooOOOO3;
            c20646o00oO0o2 = c20646o00oO0o;
            oooOOOO2 = oooOOOO4;
            List<o00Ooo.OooOo00> list2 = ((o00Ooo.OooOOO0) objO00o0O2).f85127OooO00o;
            int size3 = list2.size();
            for (int i5 = 0; i5 < size3; i5++) {
                if (list2.get(i5).OooO0O0()) {
                    return null;
                }
            }
            interfaceC25074OooO0OO2 = interfaceC25074OooO0OO3;
            c20646o00oO0o2.f59166OooOo0o = interfaceC25074OooO0OO2;
            c20646o00oO0o2.f59165OooOo = oooOOOO2;
            c20646o00oO0o2.f59167OooOoO = 1;
            objO00o0O = interfaceC25074OooO0OO2.o00o0O(oooOOOO2, c20646o00oO0o2);
            if (objO00o0O != enumC32485OooO00o) {
                interfaceC25074OooO0OO3 = interfaceC25074OooO0OO2;
                objO00o0O2 = objO00o0O;
                C20646o00oO0o c20646o00oO0o3 = c20646o00oO0o2;
                oooOOOO3 = oooOOOO2;
                c20646o00oO0o = c20646o00oO0o3;
                oooOOO0 = (o00Ooo.OooOOO0) objO00o0O2;
                List<o00Ooo.OooOo00> list3 = oooOOO0.f85127OooO00o;
                size = list3.size();
                i = 0;
                while (true) {
                    list = oooOOO0.f85127OooO00o;
                    if (i < size) {
                        return list.get(0);
                    }
                    o00Ooo.OooOo00 oooOo00 = list3.get(i);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(oooOo00, "<this>");
                    if (oooOo00.OooO0O0() || !oooOo00.f85150OooO0oO || oooOo00.f85147OooO0Oo) {
                        break;
                    }
                    i++;
                }
                size2 = list.size();
                for (i2 = 0; i2 < size2; i2++) {
                    o00Ooo.OooOo00 oooOo002 = list.get(i2);
                    if (oooOo002.OooO0O0() || o00Ooo.OooOOO.OooO0o0(oooOo002, interfaceC25074OooO0OO3.OooO00o(), interfaceC25074OooO0OO3.OoooooO())) {
                        return null;
                    }
                }
                o00Ooo.OooOOOO oooOOOO5 = o00Ooo.OooOOOO.f85132OooOoO0;
                c20646o00oO0o.f59166OooOo0o = interfaceC25074OooO0OO3;
                c20646o00oO0o.f59165OooOo = oooOOOO3;
                c20646o00oO0o.f59167OooOoO = 2;
                objO00o0O2 = interfaceC25074OooO0OO3.o00o0O(oooOOOO5, c20646o00oO0o);
            }
            return enumC32485OooO00o;
        }
        oooOOOO3 = c20646o00oO0o.f59165OooOo;
        interfaceC25074OooO0OO3 = c20646o00oO0o.f59166OooOo0o;
        C32446OooOOOo.OooO0O0(objO00o0O2);
        oooOOO0 = (o00Ooo.OooOOO0) objO00o0O2;
        List<o00Ooo.OooOo00> list32 = oooOOO0.f85127OooO00o;
        size = list32.size();
        i = 0;
        while (true) {
            list = oooOOO0.f85127OooO00o;
            if (i < size) {
            }
            i++;
        }
        size2 = list.size();
        while (i2 < size2) {
        }
        o00Ooo.OooOOOO oooOOOO52 = o00Ooo.OooOOOO.f85132OooOoO0;
        c20646o00oO0o.f59166OooOo0o = interfaceC25074OooO0OO3;
        c20646o00oO0o.f59165OooOo = oooOOOO3;
        c20646o00oO0o.f59167OooOoO = 2;
        objO00o0O2 = interfaceC25074OooO0OO3.o00o0O(oooOOOO52, c20646o00oO0o);
    }
}
