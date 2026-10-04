package OooOoo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25074OooO0OO;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOoo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", m80623f = "Scrollable.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
public final class C20636Ooooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC25088OooOoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f59105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59106OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59107OooOoO0;

    /* JADX INFO: renamed from: OooOoo.Ooooo00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", m80623f = "Scrollable.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<InterfaceC25074OooO0OO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f59108OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f59109OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Oooo0oO.o00oO0O f59110OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0oO.o00oO0O o00oo0o, Continuation continuation) {
            super(2, continuation);
            this.f59110OooOoO0 = o00oo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f59110OooOoO0, continuation);
            oooO00o.f59108OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC25074OooO0OO interfaceC25074OooO0OO, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC25074OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0048 A[EDGE_INSN: B:31:0x0048->B:18:0x0048 BREAK  A[LOOP:0: B:13:0x0036->B:17:0x0045], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                oO00ooo0.OooO00o r0 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
                int r1 = r10.f59109OooOo0o
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r10.f59108OooOo
                o00Ooo.OooO0OO r1 = (o00Ooo.InterfaceC25074OooO0OO) r1
                oO00ooO.C32446OooOOOo.OooO0O0(r11)
                goto L2c
            L11:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L19:
                oO00ooO.C32446OooOOOo.OooO0O0(r11)
                java.lang.Object r11 = r10.f59108OooOo
                o00Ooo.OooO0OO r11 = (o00Ooo.InterfaceC25074OooO0OO) r11
                r1 = r11
            L21:
                r10.f59108OooOo = r1
                r10.f59109OooOo0o = r2
                java.lang.Object r11 = OooOoo.C20634OoooOoO.OooO00o(r1, r10)
                if (r11 != r0) goto L2c
                return r0
            L2c:
                o00Ooo.OooOOO0 r11 = (o00Ooo.OooOOO0) r11
                java.util.List<o00Ooo.OooOo00> r3 = r11.f85127OooO00o
                int r4 = r3.size()
                r5 = 0
                r6 = r5
            L36:
                if (r6 >= r4) goto L48
                java.lang.Object r7 = r3.get(r6)
                o00Ooo.OooOo00 r7 = (o00Ooo.OooOo00) r7
                boolean r7 = r7.OooO0O0()
                if (r7 == 0) goto L45
                goto L21
            L45:
                int r6 = r6 + 1
                goto L36
            L48:
                r1.OooO00o()
                long r3 = OooooO0.C21290OooO0o0.f61718OooO0O0
                OooooO0.OooO0o0 r6 = new OooooO0.OooO0o0
                r6.<init>(r3)
                java.util.List<o00Ooo.OooOo00> r11 = r11.f85127OooO00o
                int r3 = r11.size()
                r4 = r5
            L59:
                long r6 = r6.f61722OooO00o
                if (r4 >= r3) goto L72
                java.lang.Object r8 = r11.get(r4)
                o00Ooo.OooOo00 r8 = (o00Ooo.OooOo00) r8
                long r8 = r8.f85143OooO
                long r6 = OooooO0.C21290OooO0o0.OooO0o(r6, r8)
                OooooO0.OooO0o0 r8 = new OooooO0.OooO0o0
                r8.<init>(r6)
                int r4 = r4 + 1
                r6 = r8
                goto L59
            L72:
                r3 = 64
                float r3 = (float) r3
                float r3 = r1.o0OOO0o(r3)
                float r3 = -r3
                long r3 = OooooO0.C21290OooO0o0.OooO0oO(r3, r6)
                Oooo0oO.o00oO0O r6 = r10.f59110OooOoO0
                java.lang.Object r6 = r6.getValue()
                OooOoo.o0OoOo0 r6 = (OooOoo.o0OoOo0) r6
                float r3 = r6.OooO0Oo(r3)
                boolean r4 = r6.f59175OooO0O0
                if (r4 == 0) goto L91
                r4 = -1
                float r4 = (float) r4
                float r3 = r3 * r4
            L91:
                OooOoo.OoooooO r4 = r6.f59177OooO0Oo
                float r3 = r4.OooO0Oo(r3)
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L9d
                goto L21
            L9d:
                int r3 = r11.size()
            La1:
                if (r5 >= r3) goto L21
                java.lang.Object r4 = r11.get(r5)
                o00Ooo.OooOo00 r4 = (o00Ooo.OooOo00) r4
                r4.OooO00o()
                int r5 = r5 + 1
                goto La1
            */
            throw new UnsupportedOperationException("Method not decompiled: OooOoo.C20636Ooooo00.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20636Ooooo00(Oooo0oO.o00oO0O o00oo0o, Continuation continuation) {
        super(2, continuation);
        this.f59107OooOoO0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20636Ooooo00 c20636Ooooo00 = new C20636Ooooo00(this.f59107OooOoO0, continuation);
        c20636Ooooo00.f59105OooOo = obj;
        return c20636Ooooo00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25088OooOoO interfaceC25088OooOoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C20636Ooooo00) create(interfaceC25088OooOoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59106OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC25088OooOoO interfaceC25088OooOoO = (InterfaceC25088OooOoO) this.f59105OooOo;
            OooO00o oooO00o = new OooO00o(this.f59107OooOoO0, null);
            this.f59106OooOo0o = 1;
            if (interfaceC25088OooOoO.Ooooooo(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
