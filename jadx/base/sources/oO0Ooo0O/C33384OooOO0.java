package oO0Ooo0O;

import Oooo0.C20855OooooOO;
import Oooo0.o000000;
import OooooO0.C21289OooO0o;
import androidx.core.location.LocationRequestCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import io.ktor.utils.p616io.C23988OooooOO;
import io.ktor.utils.p616io.C23993Ooooooo;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.o000OOo;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CoderResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32194OooOo0o;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32272OooO0O0;
import oO00Oo0O.C32273OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33201OooO0Oo;
import oO0Oo0Oo.C33204OooO0oO;
import oO0o0O0o.C33580OooO00o;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo00Oo0.C34515OooOo0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", m80623f = "DefaultTransform.kt", m80624l = {68, 72, 72, 77, 77, 81, 89, 115, 120}, m80625m = "invokeSuspend")
public final class C33384OooOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oOOoOoOO.OooO00o f120692OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33636Oooo00o f120693OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120694OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f120695OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f120696OooOoOO;

    /* JADX INFO: renamed from: oO0Ooo0O.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", m80623f = "DefaultTransform.kt", m80624l = {99}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f120697OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f120698OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC33200OooO0OO f120699OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Object f120700OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Object obj, AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f120700OooOoO0 = obj;
            this.f120699OooOoO = abstractC33200OooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f120700OooOoO0, this.f120699OooOoO, continuation);
            oooO00o.f120697OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f120698OooOo0o;
            AbstractC33200OooO0OO abstractC33200OooO0OO = this.f120699OooOoO;
            try {
                if (i != 0) {
                    try {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                    } catch (Throwable th) {
                        C33204OooO0oO.OooO0OO(abstractC33200OooO0OO);
                        throw th;
                    }
                } else {
                    C32446OooOOOo.OooO0O0(obj);
                    o000OOo o000ooo2 = (o000OOo) this.f120697OooOo;
                    InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = (InterfaceC23986Ooooo0o) this.f120700OooOoO0;
                    InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = o000ooo2.OooO0OO();
                    this.f120698OooOo0o = 1;
                    if (C23988OooooOO.OooO0O0(interfaceC23986Ooooo0o, interfaceC23967Oooo00OOooO0OO, LocationRequestCompat.PASSIVE_INTERVAL, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                C33204OooO0oO.OooO0OO(abstractC33200OooO0OO);
                return C32460OooOooO.f116667OooO00o;
            } catch (CancellationException e) {
                C33633Oooo0.OooO0Oo(abstractC33200OooO0OO, e);
                throw e;
            } catch (Throwable th2) {
                C33633Oooo0.OooO0OO(abstractC33200OooO0OO, "Receive failed", th2);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.OooOO0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33671o00oO0o f120701OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33671o00oO0o c33671o00oO0o) {
            super(1);
            this.f120701OooOo0o = c33671o00oO0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            this.f120701OooOo0o.complete();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C33384OooOO0 c33384OooOO0 = new C33384OooOO0(3, continuation);
        c33384OooOO0.f120694OooOoO = abstractC32246OooO0o0;
        c33384OooOO0.f120696OooOoOO = c33201OooO0Oo;
        return c33384OooOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x058b, code lost:
    
        if (r20 == 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x058d, code lost:
    
        oO00Oo0O.C32273OooO0Oo.OooO00o(r7, r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r3v10, types: [oO0o0OO.Oooo00o, oOOoOoOO.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.nio.charset.CharsetDecoder] */
    /* JADX WARN: Type inference failed for: r8v60, types: [boolean] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        oOOoOoOO.OooO00o oooO00o;
        int i;
        int i2;
        Throwable th;
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o;
        boolean z2;
        C33201OooO0Oo c33201OooO0Oo;
        Object objOooO0o0;
        AbstractC32246OooO0o0 abstractC32246OooO0o02;
        Object objOooO0o02;
        AbstractC33200OooO0OO abstractC33200OooO0OO;
        Object objOooO;
        AbstractC32246OooO0o0 abstractC32246OooO0o03;
        Object objOooOo0O;
        AbstractC32246OooO0o0 abstractC32246OooO0o04;
        AbstractC32246OooO0o0 abstractC32246OooO0o05;
        oOOoOoOO.OooO00o oooO00o2;
        Object objOooOo0O2;
        AbstractC32246OooO0o0 abstractC32246OooO0o06;
        AbstractC32246OooO0o0 abstractC32246OooO0o07;
        oOOoOoOO.OooO00o oooO00o3;
        Object objOooO0o03;
        C33201OooO0Oo c33201OooO0Oo2;
        AbstractC32268OooO0oO abstractC32268OooO0oO;
        String string;
        AbstractC32246OooO0o0 abstractC32246OooO0o08;
        oOOoOoOO.OooO00o oooO00o4;
        AbstractC32246OooO0o0 abstractC32246OooO0o09;
        EnumC32485OooO00o enumC32485OooO00o2;
        AbstractC32246OooO0o0 abstractC32246OooO0o010;
        oOOoOoOO.OooO00o oooO00o5;
        Object objOooO0o04;
        EnumC32485OooO00o enumC32485OooO00o3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C32271OooO00o c32271OooO00oOooO0O0;
        int iPosition;
        int i18;
        int i19;
        ?? r33;
        int i20;
        ?? r11;
        int i21;
        ?? r112;
        C32271OooO00o c32271OooO00oOooO0O02;
        Object objOooO0o05;
        AbstractC32246OooO0o0 abstractC32246OooO0o011;
        byte[] bArr;
        Long lValueOf;
        boolean z3;
        Object objOooO0o06;
        EnumC32485OooO00o enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
        switch (this.f120695OooOoO0) {
            case 0:
                j = 0;
                C32446OooOOOo.OooO0O0(obj);
                abstractC32246OooO0o0 = this.f120694OooOoO;
                C33201OooO0Oo c33201OooO0Oo3 = (C33201OooO0Oo) this.f120696OooOoOO;
                oooO00o = c33201OooO0Oo3.f120151OooO00o;
                Object obj2 = c33201OooO0Oo3.f120152OooO0O0;
                i = -1;
                if (!(obj2 instanceof InterfaceC23986Ooooo0o)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = ((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).OooO0o0();
                InterfaceC34595OooO0Oo<?> interfaceC34595OooO0Oo = oooO00o.f123413OooO00o;
                i2 = 0;
                kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(C32460OooOooO.class))) {
                    InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = (InterfaceC23986Ooooo0o) obj2;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
                    interfaceC23986Ooooo0o.cancel(null);
                    C33201OooO0Oo c33201OooO0Oo4 = new C33201OooO0Oo(oooO00o, C32460OooOooO.f116667OooO00o);
                    this.f120694OooOoO = abstractC32246OooO0o0;
                    this.f120696OooOoOO = oooO00o;
                    this.f120695OooOoO0 = 1;
                    objOooO0o03 = abstractC32246OooO0o0.OooO0o0(c33201OooO0Oo4, this);
                    if (objOooO0o03 != enumC32485OooO00o4) {
                        abstractC32246OooO0o02 = abstractC32246OooO0o0;
                        c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o03;
                        abstractC32246OooO0o0 = abstractC32246OooO0o02;
                        if (c33201OooO0Oo2 != null) {
                            C33385OooOO0O.f120702OooO00o.OooO0oo("Transformed with default transformers response body for " + ((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).OooO0Oo().getUrl() + " to " + oooO00o.f123413OooO00o);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                } else {
                    th = null;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(Integer.TYPE))) {
                        z = true;
                        enumC32485OooO00o = enumC32485OooO00o4;
                        z2 = false;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(C32266OooO0Oo.class)) ? true : kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(AbstractC32268OooO0oO.class))) {
                            this.f120694OooOoO = abstractC32246OooO0o0;
                            this.f120696OooOoOO = oooO00o;
                            this.f120693OooOo0o = abstractC32246OooO0o0;
                            this.f120692OooOo = oooO00o;
                            this.f120695OooOoO0 = 4;
                            objOooOo0O = ((InterfaceC23986Ooooo0o) obj2).OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, this);
                            if (objOooOo0O == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            abstractC32246OooO0o04 = abstractC32246OooO0o0;
                            abstractC32246OooO0o05 = abstractC32246OooO0o04;
                            oooO00o2 = oooO00o;
                            C33201OooO0Oo c33201OooO0Oo5 = new C33201OooO0Oo(oooO00o, objOooOo0O);
                            this.f120694OooOoO = abstractC32246OooO0o05;
                            this.f120696OooOoOO = oooO00o2;
                            this.f120693OooOo0o = null;
                            this.f120692OooOo = null;
                            this.f120695OooOoO0 = 5;
                            objOooO0o05 = abstractC32246OooO0o04.OooO0o0(c33201OooO0Oo5, this);
                            if (objOooO0o05 != enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            abstractC32246OooO0o011 = abstractC32246OooO0o05;
                            c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o05;
                            abstractC32246OooO0o0 = abstractC32246OooO0o011;
                            oooO00o = oooO00o2;
                            if (c33201OooO0Oo2 != null) {
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(byte[].class))) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(InterfaceC23986Ooooo0o.class))) {
                                C33671o00oO0o c33671o00oO0o = new C33671o00oO0o((InterfaceC33672o00ooo) abstractC33200OooO0OOOooO0o0.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o));
                                C23993Ooooooo c23993OooooooOooO0Oo = C24005o00o0O.OooO0Oo(abstractC32246OooO0o0, abstractC33200OooO0OOOooO0o0.OooOOO0(), new OooO00o(obj2, abstractC33200OooO0OOOooO0o0, null), 2);
                                c23993OooooooOooO0Oo.f80791OooOo0o.invokeOnCompletion(new OooO0O0(c33671o00oO0o));
                                C33201OooO0Oo c33201OooO0Oo6 = new C33201OooO0Oo(oooO00o, c23993OooooooOooO0Oo.f80790OooOo);
                                this.f120694OooOoO = abstractC32246OooO0o0;
                                this.f120696OooOoOO = oooO00o;
                                this.f120695OooOoO0 = 8;
                                objOooO0o02 = abstractC32246OooO0o0.OooO0o0(c33201OooO0Oo6, this);
                                if (objOooO0o02 == enumC32485OooO00o) {
                                    return enumC32485OooO00o;
                                }
                                abstractC32246OooO0o02 = abstractC32246OooO0o0;
                                c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o02;
                                abstractC32246OooO0o0 = abstractC32246OooO0o02;
                                if (c33201OooO0Oo2 != null) {
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34595OooO0Oo, oooo0.OooO0O0(C32194OooOo0o.class))) {
                                c33201OooO0Oo = null;
                                c33201OooO0Oo2 = c33201OooO0Oo;
                                if (c33201OooO0Oo2 != null) {
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                            InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2 = (InterfaceC23986Ooooo0o) obj2;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC23986Ooooo0o2, "<this>");
                            interfaceC23986Ooooo0o2.cancel(null);
                            C33201OooO0Oo c33201OooO0Oo7 = new C33201OooO0Oo(oooO00o, abstractC33200OooO0OOOooO0o0.OooO0o());
                            this.f120694OooOoO = abstractC32246OooO0o0;
                            this.f120696OooOoOO = oooO00o;
                            this.f120695OooOoO0 = 9;
                            objOooO0o0 = abstractC32246OooO0o0.OooO0o0(c33201OooO0Oo7, this);
                            if (objOooO0o0 == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            abstractC32246OooO0o02 = abstractC32246OooO0o0;
                            c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o0;
                            abstractC32246OooO0o0 = abstractC32246OooO0o02;
                            if (c33201OooO0Oo2 != null) {
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                        this.f120694OooOoO = abstractC32246OooO0o0;
                        this.f120696OooOoOO = oooO00o;
                        abstractC33200OooO0OO = abstractC33200OooO0OOOooO0o0;
                        this.f120693OooOo0o = abstractC33200OooO0OO;
                        this.f120695OooOoO0 = 6;
                        objOooO = C21289OooO0o.OooO((InterfaceC23986Ooooo0o) obj2, this);
                        if (objOooO == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        abstractC32246OooO0o03 = abstractC32246OooO0o0;
                        bArr = (byte[]) objOooO;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33200OooO0OO, "<this>");
                        oO00O0o0.OooOO0O headers = abstractC33200OooO0OO.getHeaders();
                        List<String> list = C32190OooOOo0.f115537OooO00o;
                        String str = headers.get("Content-Length");
                        lValueOf = str == null ? Long.valueOf(Long.parseLong(str)) : null;
                        boolean z4 = C34515OooOo0.f123700OooO00o;
                        z3 = abstractC33200OooO0OO.getHeaders().get("Content-Encoding") != null ? z : z2;
                        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(((ooOOOOOo.OooO0OO) abstractC32246OooO0o03.f115817OooOo0o).OooO0Oo().getMethod(), C32192OooOo0.f115540OooO0Oo);
                        if (z3 && !zOooO0O0 && lValueOf != null && lValueOf.longValue() > j) {
                            if (!(bArr.length != ((int) lValueOf.longValue()) ? z : z2)) {
                                throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                            }
                        }
                        C33201OooO0Oo c33201OooO0Oo8 = new C33201OooO0Oo(oooO00o, bArr);
                        this.f120694OooOoO = abstractC32246OooO0o03;
                        this.f120696OooOoOO = oooO00o;
                        this.f120693OooOo0o = null;
                        this.f120695OooOoO0 = 7;
                        objOooO0o06 = abstractC32246OooO0o03.OooO0o0(c33201OooO0Oo8, this);
                        if (objOooO0o06 != enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        abstractC32246OooO0o02 = abstractC32246OooO0o03;
                        c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o06;
                        abstractC32246OooO0o0 = abstractC32246OooO0o02;
                        if (c33201OooO0Oo2 != null) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f120694OooOoO = abstractC32246OooO0o0;
                    this.f120696OooOoOO = oooO00o;
                    this.f120693OooOo0o = abstractC32246OooO0o0;
                    this.f120692OooOo = oooO00o;
                    this.f120695OooOoO0 = 2;
                    objOooOo0O2 = ((InterfaceC23986Ooooo0o) obj2).OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, this);
                    if (objOooOo0O2 != enumC32485OooO00o4) {
                        abstractC32246OooO0o06 = abstractC32246OooO0o0;
                        abstractC32246OooO0o07 = abstractC32246OooO0o06;
                        oooO00o3 = oooO00o;
                        abstractC32268OooO0oO = (AbstractC32268OooO0oO) objOooOo0O2;
                        if (abstractC32268OooO0oO.Oooo000()) {
                            long jOooo0 = abstractC32268OooO0oO.Oooo0();
                            if (jOooo0 <= j || Integer.MAX_VALUE < jOooo0) {
                                enumC32485OooO00o2 = enumC32485OooO00o4;
                                StringBuilder sb = new StringBuilder(16);
                                if (abstractC32268OooO0oO.Oooo000()) {
                                    abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                    oooO00o4 = oooO00o;
                                    abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                } else {
                                    C32271OooO00o c32271OooO00oOoOO = abstractC32268OooO0oO.ooOO(1);
                                    if (c32271OooO00oOoOO == null) {
                                        i3 = i2;
                                        i4 = i3;
                                    } else {
                                        i3 = i2;
                                        i4 = i3;
                                        while (true) {
                                            try {
                                                ByteBuffer byteBuffer = c32271OooO00oOoOO.f115944OooO00o;
                                                int i22 = c32271OooO00oOoOO.f115945OooO0O0;
                                                int i23 = c32271OooO00oOoOO.f115946OooO0OO;
                                                int i24 = i22;
                                                while (i24 < i23) {
                                                    try {
                                                        byte b = byteBuffer.get(i24);
                                                        i6 = i3;
                                                        int i25 = b & 255;
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                                                            char c = (char) i25;
                                                            if (i4 == Integer.MAX_VALUE) {
                                                                i9 = i2;
                                                            } else {
                                                                sb.append(c);
                                                                i4++;
                                                                i9 = 1;
                                                            }
                                                            if (i9 != 0) {
                                                                i24++;
                                                                i3 = i6;
                                                                byteBuffer = byteBuffer2;
                                                            }
                                                        }
                                                        c32271OooO00oOoOO.OooO0OO(i24 - i22);
                                                        i7 = i2;
                                                        if (i7 == 0) {
                                                            i3 = i6;
                                                            i8 = 1;
                                                        } else if (i4 == Integer.MAX_VALUE) {
                                                            i3 = i6;
                                                            i8 = i2;
                                                        } else {
                                                            i8 = i2;
                                                            i3 = 1;
                                                        }
                                                        if (i8 != 0) {
                                                            C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO);
                                                        } else {
                                                            try {
                                                                c32271OooO00oOoOO = C32273OooO0Oo.OooO0O0(abstractC32268OooO0oO, c32271OooO00oOoOO);
                                                                if (c32271OooO00oOoOO != null) {
                                                                    th = null;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                i5 = i2;
                                                                if (i5 != 0) {
                                                                    C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO);
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        i5 = 1;
                                                        if (i5 != 0) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i6 = i3;
                                                c32271OooO00oOoOO.OooO0OO(i23 - i22);
                                                i7 = 1;
                                                if (i7 == 0) {
                                                }
                                                if (i8 != 0) {
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                i5 = 1;
                                            }
                                        }
                                    }
                                    if (i3 != 0) {
                                        int i26 = 0 - i4;
                                        int i27 = Integer.MAX_VALUE - i4;
                                        C32271OooO00o c32271OooO00oOoOO2 = abstractC32268OooO0oO.ooOO(1);
                                        if (c32271OooO00oOoOO2 == null) {
                                            abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                            oooO00o4 = oooO00o;
                                            abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                            i13 = i2;
                                        } else {
                                            int i28 = i2;
                                            int i29 = 1;
                                            while (true) {
                                                try {
                                                    int i30 = c32271OooO00oOoOO2.f115946OooO0OO;
                                                    int i31 = i28;
                                                    int i32 = c32271OooO00oOoOO2.f115945OooO0O0;
                                                    int i33 = i30 - i32;
                                                    if (i33 >= i29) {
                                                        try {
                                                            ByteBuffer byteBuffer3 = c32271OooO00oOoOO2.f115944OooO00o;
                                                            oooO00o4 = oooO00o;
                                                            abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                                            int i34 = i32;
                                                            int i35 = i2;
                                                            int i36 = i35;
                                                            int i37 = i36;
                                                            int i38 = i31;
                                                            try {
                                                                try {
                                                                    while (i34 < i30) {
                                                                        int i39 = i30;
                                                                        byte b2 = byteBuffer3.get(i34);
                                                                        ByteBuffer byteBuffer4 = byteBuffer3;
                                                                        int i40 = b2 & 255;
                                                                        abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                                                        int i41 = i34;
                                                                        if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                                                                            if (i35 != 0) {
                                                                                throw new C32272OooO0O0("Expected " + i35 + " more character bytes");
                                                                            }
                                                                            char c2 = (char) i40;
                                                                            if (i38 == i27) {
                                                                                i17 = i2;
                                                                            } else {
                                                                                sb.append(c2);
                                                                                i38++;
                                                                                i17 = 1;
                                                                            }
                                                                            if (i17 == 0) {
                                                                                c32271OooO00oOoOO2.OooO0OO(i41 - i32);
                                                                                i12 = i38;
                                                                                i29 = i;
                                                                                i10 = 1;
                                                                                if (i29 != 0) {
                                                                                    i29 = i10;
                                                                                } else if (i29 <= 0) {
                                                                                    i29 = i2;
                                                                                }
                                                                                int i42 = i12;
                                                                                i33 = c32271OooO00oOoOO2.f115946OooO0OO - c32271OooO00oOoOO2.f115945OooO0O0;
                                                                                i13 = i42;
                                                                            }
                                                                            i34 = i41 + 1;
                                                                            abstractC32246OooO0o06 = abstractC32246OooO0o08;
                                                                            i30 = i39;
                                                                            byteBuffer3 = byteBuffer4;
                                                                        } else if (i35 == 0) {
                                                                            i36 = i40;
                                                                            int i43 = 128;
                                                                            for (int i44 = 1; i44 < 7 && (i36 & i43) != 0; i44++) {
                                                                                i36 &= ~i43;
                                                                                i43 >>= 1;
                                                                                i35++;
                                                                            }
                                                                            int i45 = i35 - 1;
                                                                            if (i35 > i39 - i41) {
                                                                                c32271OooO00oOoOO2.OooO0OO(i41 - i32);
                                                                                i29 = i35;
                                                                                i12 = i38;
                                                                                i10 = 1;
                                                                                if (i29 != 0) {
                                                                                }
                                                                                int i422 = i12;
                                                                                i33 = c32271OooO00oOoOO2.f115946OooO0OO - c32271OooO00oOoOO2.f115945OooO0O0;
                                                                                i13 = i422;
                                                                            } else {
                                                                                i37 = i35;
                                                                                i35 = i45;
                                                                                i34 = i41 + 1;
                                                                                abstractC32246OooO0o06 = abstractC32246OooO0o08;
                                                                                i30 = i39;
                                                                                byteBuffer3 = byteBuffer4;
                                                                            }
                                                                        } else {
                                                                            int i46 = (i36 << 6) | (b2 & Ascii.DEL);
                                                                            i35--;
                                                                            if (i35 == 0) {
                                                                                if (((i46 >>> 16) == 0 ? 1 : i2) != 0) {
                                                                                    char c3 = (char) i46;
                                                                                    if (i38 == i27) {
                                                                                        i16 = i2;
                                                                                    } else {
                                                                                        sb.append(c3);
                                                                                        i38++;
                                                                                        i16 = 1;
                                                                                    }
                                                                                    if (i16 == 0) {
                                                                                        c32271OooO00oOoOO2.OooO0OO(((i41 - i32) - i37) + 1);
                                                                                        i12 = i38;
                                                                                        i29 = i;
                                                                                        i10 = 1;
                                                                                    } else {
                                                                                        i36 = i2;
                                                                                        i34 = i41 + 1;
                                                                                        abstractC32246OooO0o06 = abstractC32246OooO0o08;
                                                                                        i30 = i39;
                                                                                        byteBuffer3 = byteBuffer4;
                                                                                    }
                                                                                } else {
                                                                                    if ((i46 <= 1114111 ? 1 : i2) == 0) {
                                                                                        o000000.OooO0Oo(i46);
                                                                                        throw th;
                                                                                    }
                                                                                    char c4 = (char) ((i46 >>> 10) + 55232);
                                                                                    if (i38 == i27) {
                                                                                        i14 = i2;
                                                                                    } else {
                                                                                        sb.append(c4);
                                                                                        i38++;
                                                                                        i14 = 1;
                                                                                    }
                                                                                    if (i14 != 0) {
                                                                                        char c5 = (char) ((i46 & 1023) + 56320);
                                                                                        if (i38 == i27) {
                                                                                            i15 = i2;
                                                                                        } else {
                                                                                            sb.append(c5);
                                                                                            i38++;
                                                                                            i15 = 1;
                                                                                        }
                                                                                        if (i15 == 0) {
                                                                                        }
                                                                                        i36 = i2;
                                                                                        i34 = i41 + 1;
                                                                                        abstractC32246OooO0o06 = abstractC32246OooO0o08;
                                                                                        i30 = i39;
                                                                                        byteBuffer3 = byteBuffer4;
                                                                                    }
                                                                                    c32271OooO00oOoOO2.OooO0OO(((i41 - i32) - i37) + 1);
                                                                                    i12 = i38;
                                                                                    i29 = i;
                                                                                    i10 = 1;
                                                                                }
                                                                                if (i29 != 0) {
                                                                                }
                                                                                int i4222 = i12;
                                                                                i33 = c32271OooO00oOoOO2.f115946OooO0OO - c32271OooO00oOoOO2.f115945OooO0O0;
                                                                                i13 = i4222;
                                                                            } else {
                                                                                i36 = i46;
                                                                                i34 = i41 + 1;
                                                                                abstractC32246OooO0o06 = abstractC32246OooO0o08;
                                                                                i30 = i39;
                                                                                byteBuffer3 = byteBuffer4;
                                                                            }
                                                                        }
                                                                    }
                                                                    int i42222 = i12;
                                                                    i33 = c32271OooO00oOoOO2.f115946OooO0OO - c32271OooO00oOoOO2.f115945OooO0O0;
                                                                    i13 = i42222;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    i11 = i10;
                                                                    if (i11 != 0) {
                                                                        C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO2);
                                                                    }
                                                                    throw th;
                                                                }
                                                                c32271OooO00oOoOO2.OooO0OO(i33);
                                                                i12 = i38;
                                                                i29 = i2;
                                                                if (i29 != 0) {
                                                                }
                                                            } catch (Throwable th6) {
                                                                throw th6;
                                                            }
                                                            abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                                            i10 = 1;
                                                        } catch (Throwable th7) {
                                                            throw th7;
                                                        }
                                                    } else {
                                                        abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                                        oooO00o4 = oooO00o;
                                                        abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                                        i10 = 1;
                                                        i13 = i31;
                                                    }
                                                    if (i33 == 0) {
                                                        try {
                                                            c32271OooO00oOooO0O0 = C32273OooO0Oo.OooO0O0(abstractC32268OooO0oO, c32271OooO00oOoOO2);
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            i11 = i2;
                                                            if (i11 != 0) {
                                                            }
                                                            throw th;
                                                        }
                                                        break;
                                                    } else if (i33 < i29 || c32271OooO00oOoOO2.f115948OooO0o - c32271OooO00oOoOO2.f115949OooO0o0 < 8) {
                                                        C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO2);
                                                        c32271OooO00oOooO0O0 = abstractC32268OooO0oO.ooOO(i29);
                                                    } else {
                                                        c32271OooO00oOooO0O0 = c32271OooO00oOoOO2;
                                                    }
                                                    if (c32271OooO00oOooO0O0 != null) {
                                                        if (i29 <= 0) {
                                                            c32271OooO00oOoOO2 = c32271OooO00oOooO0O0;
                                                            i2 = i10;
                                                        } else {
                                                            i28 = i13;
                                                            c32271OooO00oOoOO2 = c32271OooO00oOooO0O0;
                                                            abstractC32246OooO0o06 = abstractC32246OooO0o08;
                                                            abstractC32246OooO0o07 = abstractC32246OooO0o09;
                                                            oooO00o = oooO00o4;
                                                        }
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    i10 = 1;
                                                }
                                            }
                                        }
                                        if (i13 < i26) {
                                            throw new C32272OooO0O0(C20855OooooOO.OooO0OO(i26, i13, "Premature end of stream: expected at least ", " chars but had only "));
                                        }
                                    } else {
                                        abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                        oooO00o4 = oooO00o;
                                        abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                        if (i4 < 0) {
                                            throw new C32272OooO0O0(C20855OooooOO.OooO0OO(i2, i4, "Premature end of stream: expected at least ", " chars but had only "));
                                        }
                                    }
                                }
                                string = sb.toString();
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder(capacity).…builderAction).toString()");
                                C33201OooO0Oo c33201OooO0Oo9 = new C33201OooO0Oo(oooO00o3, new Integer(Integer.parseInt(string)));
                                abstractC32246OooO0o010 = abstractC32246OooO0o08;
                                this.f120694OooOoO = abstractC32246OooO0o010;
                                oooO00o5 = oooO00o4;
                                this.f120696OooOoOO = oooO00o5;
                                ?? r3 = th;
                                this.f120693OooOo0o = r3;
                                this.f120692OooOo = r3;
                                this.f120695OooOoO0 = 3;
                                objOooO0o04 = abstractC32246OooO0o09.OooO0o0(c33201OooO0Oo9, this);
                                enumC32485OooO00o3 = enumC32485OooO00o2;
                                if (objOooO0o04 == enumC32485OooO00o3) {
                                }
                                c33201OooO0Oo = (C33201OooO0Oo) objOooO0o04;
                                abstractC32246OooO0o0 = abstractC32246OooO0o010;
                                oooO00o = oooO00o5;
                                c33201OooO0Oo2 = c33201OooO0Oo;
                            } else {
                                int i47 = (int) jOooo0;
                                Charset charset = C33580OooO00o.f121231OooO0O0;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
                                ?? NewDecoder = charset.newDecoder();
                                kotlin.jvm.internal.OooOOO0.OooO0o(NewDecoder, "charset.newDecoder()");
                                CharBuffer charBuffer = oO00Oo00.OooO00o.f115971OooO00o;
                                if (i47 != 0) {
                                    if (abstractC32268OooO0oO.f115968OooOoOO - abstractC32268OooO0oO.f115966OooOoO < i47) {
                                        CharBuffer charBufferAllocate = CharBuffer.allocate(i47);
                                        C32271OooO00o c32271OooO00oOoOO3 = abstractC32268OooO0oO.ooOO(1);
                                        if (c32271OooO00oOoOO3 == null) {
                                            iPosition = i47;
                                            i18 = 1;
                                            enumC32485OooO00o2 = enumC32485OooO00o4;
                                            r112 = i2;
                                        } else {
                                            iPosition = i47;
                                            int i48 = 1;
                                            int i49 = 1;
                                            i18 = 1;
                                            ?? r113 = i2;
                                            while (true) {
                                                try {
                                                    r33 = r113;
                                                    i20 = c32271OooO00oOoOO3.f115946OooO0OO - c32271OooO00oOoOO3.f115945OooO0O0;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    i19 = 1;
                                                }
                                                if (i20 >= i48) {
                                                    try {
                                                        try {
                                                        } finally {
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        i19 = i18;
                                                    }
                                                    if (charBufferAllocate.hasRemaining() && iPosition != 0) {
                                                        ByteBuffer byteBuffer5 = c32271OooO00oOoOO3.f115944OooO00o;
                                                        int i50 = c32271OooO00oOoOO3.f115945OooO0O0;
                                                        int i51 = c32271OooO00oOoOO3.f115946OooO0OO - i50;
                                                        ByteBuffer byteBuffer6 = C32250OooO0O0.f115830OooO00o;
                                                        ByteBuffer byteBufferOooO0o = C23988OooooOO.OooO0o(byteBuffer5, i50, i51);
                                                        int iLimit = byteBufferOooO0o.limit();
                                                        int iPosition2 = byteBufferOooO0o.position();
                                                        enumC32485OooO00o2 = enumC32485OooO00o4;
                                                        ?? r13 = iLimit - iPosition2 >= iPosition ? i18 : i2;
                                                        if (r13 != 0) {
                                                            i21 = iPosition;
                                                            byteBufferOooO0o.limit(iPosition2 + i21);
                                                        } else {
                                                            i21 = iPosition;
                                                        }
                                                        CoderResult coderResultDecode = NewDecoder.decode(byteBufferOooO0o, charBufferAllocate, r13);
                                                        if (coderResultDecode.isMalformed() || coderResultDecode.isUnmappable()) {
                                                            oO00Oo00.OooO00o.OooO0o0(coderResultDecode);
                                                        }
                                                        i49 = (coderResultDecode.isUnderflow() && byteBufferOooO0o.hasRemaining()) ? i49 + 1 : i18;
                                                        byteBufferOooO0o.limit(iLimit);
                                                        iPosition = i21 - (byteBufferOooO0o.position() - iPosition2);
                                                        if (byteBufferOooO0o.limit() != i51) {
                                                            throw new IllegalStateException("Buffer's limit change is not allowed");
                                                        }
                                                        c32271OooO00oOoOO3.OooO0OO(byteBufferOooO0o.position());
                                                        r11 = r13;
                                                        i48 = i49;
                                                        if (i19 != 0) {
                                                            C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO3);
                                                        }
                                                        throw th;
                                                    }
                                                    int i52 = iPosition;
                                                    enumC32485OooO00o2 = enumC32485OooO00o4;
                                                    r11 = r33 == true ? 1 : 0;
                                                    iPosition = i52;
                                                    i48 = i2;
                                                    i20 = c32271OooO00oOoOO3.f115946OooO0OO - c32271OooO00oOoOO3.f115945OooO0O0;
                                                    r112 = r11;
                                                } else {
                                                    enumC32485OooO00o2 = enumC32485OooO00o4;
                                                    r112 = r33 == true ? 1 : 0;
                                                }
                                                if (i20 == 0) {
                                                    try {
                                                        c32271OooO00oOooO0O02 = C32273OooO0Oo.OooO0O0(abstractC32268OooO0oO, c32271OooO00oOoOO3);
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        i19 = i2;
                                                    }
                                                    break;
                                                } else if (i20 < i48 || c32271OooO00oOoOO3.f115948OooO0o - c32271OooO00oOoOO3.f115949OooO0o0 < 8) {
                                                    C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO3);
                                                    c32271OooO00oOooO0O02 = abstractC32268OooO0oO.ooOO(i48);
                                                } else {
                                                    c32271OooO00oOooO0O02 = c32271OooO00oOoOO3;
                                                }
                                                if (c32271OooO00oOooO0O02 != null) {
                                                    c32271OooO00oOoOO3 = c32271OooO00oOooO0O02;
                                                    if (i48 <= 0) {
                                                        i2 = i18;
                                                    } else {
                                                        enumC32485OooO00o4 = enumC32485OooO00o2;
                                                        i18 = 1;
                                                        r113 = r112;
                                                    }
                                                }
                                            }
                                            if (i2 != 0) {
                                                C32273OooO0Oo.OooO00o(abstractC32268OooO0oO, c32271OooO00oOoOO3);
                                            }
                                        }
                                        if (charBufferAllocate.hasRemaining() && r112 == 0) {
                                            CoderResult coderResultDecode2 = NewDecoder.decode(oO00Oo00.OooO00o.f115972OooO0O0, charBufferAllocate, i18);
                                            if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                                oO00Oo00.OooO00o.OooO0o0(coderResultDecode2);
                                            }
                                        }
                                        if (iPosition > 0) {
                                            throw new EOFException("Not enough bytes available: had only " + (i47 - iPosition) + " instead of " + i47);
                                        }
                                        if (iPosition < 0) {
                                            throw new AssertionError("remainingInputBytes < 0");
                                        }
                                        charBufferAllocate.flip();
                                        string = charBufferAllocate.toString();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "cb.toString()");
                                        abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                        oooO00o4 = oooO00o;
                                        abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                        C33201OooO0Oo c33201OooO0Oo92 = new C33201OooO0Oo(oooO00o3, new Integer(Integer.parseInt(string)));
                                        abstractC32246OooO0o010 = abstractC32246OooO0o08;
                                        this.f120694OooOoO = abstractC32246OooO0o010;
                                        oooO00o5 = oooO00o4;
                                        this.f120696OooOoOO = oooO00o5;
                                        ?? r32 = th;
                                        this.f120693OooOo0o = r32;
                                        this.f120692OooOo = r32;
                                        this.f120695OooOoO0 = 3;
                                        objOooO0o04 = abstractC32246OooO0o09.OooO0o0(c33201OooO0Oo92, this);
                                        enumC32485OooO00o3 = enumC32485OooO00o2;
                                        if (objOooO0o04 == enumC32485OooO00o3) {
                                        }
                                        c33201OooO0Oo = (C33201OooO0Oo) objOooO0o04;
                                        abstractC32246OooO0o0 = abstractC32246OooO0o010;
                                        oooO00o = oooO00o5;
                                        c33201OooO0Oo2 = c33201OooO0Oo;
                                    } else if (abstractC32268OooO0oO.f115967OooOoO0.hasArray()) {
                                        ByteBuffer byteBuffer7 = abstractC32268OooO0oO.f115967OooOoO0;
                                        byte[] bArrArray = byteBuffer7.array();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(bArrArray, "bb.array()");
                                        int iPosition3 = byteBuffer7.position() + byteBuffer7.arrayOffset() + abstractC32268OooO0oO.Oooo00o().f115945OooO0O0;
                                        Charset charset2 = NewDecoder.charset();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(charset2, "charset()");
                                        String str2 = new String(bArrArray, iPosition3, i47, charset2);
                                        abstractC32268OooO0oO.OooO00o(i47);
                                        abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                        string = str2;
                                        enumC32485OooO00o2 = enumC32485OooO00o4;
                                        oooO00o4 = oooO00o;
                                        abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                        C33201OooO0Oo c33201OooO0Oo922 = new C33201OooO0Oo(oooO00o3, new Integer(Integer.parseInt(string)));
                                        abstractC32246OooO0o010 = abstractC32246OooO0o08;
                                        this.f120694OooOoO = abstractC32246OooO0o010;
                                        oooO00o5 = oooO00o4;
                                        this.f120696OooOoOO = oooO00o5;
                                        ?? r322 = th;
                                        this.f120693OooOo0o = r322;
                                        this.f120692OooOo = r322;
                                        this.f120695OooOoO0 = 3;
                                        objOooO0o04 = abstractC32246OooO0o09.OooO0o0(c33201OooO0Oo922, this);
                                        enumC32485OooO00o3 = enumC32485OooO00o2;
                                        if (objOooO0o04 == enumC32485OooO00o3) {
                                        }
                                        c33201OooO0Oo = (C33201OooO0Oo) objOooO0o04;
                                        abstractC32246OooO0o0 = abstractC32246OooO0o010;
                                        oooO00o = oooO00o5;
                                        c33201OooO0Oo2 = c33201OooO0Oo;
                                    } else {
                                        CharBuffer charBufferAllocate2 = CharBuffer.allocate(i47);
                                        ByteBuffer byteBuffer8 = abstractC32268OooO0oO.f115967OooOoO0;
                                        int i53 = abstractC32268OooO0oO.Oooo00o().f115945OooO0O0;
                                        ByteBuffer byteBuffer9 = C32250OooO0O0.f115830OooO00o;
                                        ByteBuffer byteBufferOooO0o2 = C23988OooooOO.OooO0o(byteBuffer8, i53, i47);
                                        CoderResult coderResultDecode3 = NewDecoder.decode(byteBufferOooO0o2, charBufferAllocate2, true);
                                        if (coderResultDecode3.isMalformed() || coderResultDecode3.isUnmappable()) {
                                            oO00Oo00.OooO00o.OooO0o0(coderResultDecode3);
                                        }
                                        charBufferAllocate2.flip();
                                        abstractC32268OooO0oO.OooO00o(byteBufferOooO0o2.position());
                                        string = charBufferAllocate2.toString();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "cb.toString()");
                                    }
                                }
                                abstractC32246OooO0o08 = abstractC32246OooO0o06;
                                enumC32485OooO00o2 = enumC32485OooO00o4;
                                oooO00o4 = oooO00o;
                                abstractC32246OooO0o09 = abstractC32246OooO0o07;
                                C33201OooO0Oo c33201OooO0Oo9222 = new C33201OooO0Oo(oooO00o3, new Integer(Integer.parseInt(string)));
                                abstractC32246OooO0o010 = abstractC32246OooO0o08;
                                this.f120694OooOoO = abstractC32246OooO0o010;
                                oooO00o5 = oooO00o4;
                                this.f120696OooOoOO = oooO00o5;
                                ?? r3222 = th;
                                this.f120693OooOo0o = r3222;
                                this.f120692OooOo = r3222;
                                this.f120695OooOoO0 = 3;
                                objOooO0o04 = abstractC32246OooO0o09.OooO0o0(c33201OooO0Oo9222, this);
                                enumC32485OooO00o3 = enumC32485OooO00o2;
                                if (objOooO0o04 == enumC32485OooO00o3) {
                                }
                                c33201OooO0Oo = (C33201OooO0Oo) objOooO0o04;
                                abstractC32246OooO0o0 = abstractC32246OooO0o010;
                                oooO00o = oooO00o5;
                                c33201OooO0Oo2 = c33201OooO0Oo;
                            }
                            break;
                        } else {
                            string = "";
                            abstractC32246OooO0o08 = abstractC32246OooO0o06;
                            enumC32485OooO00o2 = enumC32485OooO00o4;
                            oooO00o4 = oooO00o;
                            abstractC32246OooO0o09 = abstractC32246OooO0o07;
                            C33201OooO0Oo c33201OooO0Oo92222 = new C33201OooO0Oo(oooO00o3, new Integer(Integer.parseInt(string)));
                            abstractC32246OooO0o010 = abstractC32246OooO0o08;
                            this.f120694OooOoO = abstractC32246OooO0o010;
                            oooO00o5 = oooO00o4;
                            this.f120696OooOoOO = oooO00o5;
                            ?? r32222 = th;
                            this.f120693OooOo0o = r32222;
                            this.f120692OooOo = r32222;
                            this.f120695OooOoO0 = 3;
                            objOooO0o04 = abstractC32246OooO0o09.OooO0o0(c33201OooO0Oo92222, this);
                            enumC32485OooO00o3 = enumC32485OooO00o2;
                            if (objOooO0o04 == enumC32485OooO00o3) {
                                return enumC32485OooO00o3;
                            }
                            c33201OooO0Oo = (C33201OooO0Oo) objOooO0o04;
                            abstractC32246OooO0o0 = abstractC32246OooO0o010;
                            oooO00o = oooO00o5;
                            c33201OooO0Oo2 = c33201OooO0Oo;
                        }
                        if (c33201OooO0Oo2 != null) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return enumC32485OooO00o4;
            case 1:
                oOOoOoOO.OooO00o oooO00o6 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o02 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = oooO00o6;
                objOooO0o03 = obj;
                c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o03;
                abstractC32246OooO0o0 = abstractC32246OooO0o02;
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
                oOOoOoOO.OooO00o oooO00o7 = this.f120692OooOo;
                abstractC32246OooO0o07 = (AbstractC32246OooO0o0) this.f120693OooOo0o;
                j = 0;
                oOOoOoOO.OooO00o oooO00o8 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                AbstractC32246OooO0o0 abstractC32246OooO0o012 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooOo0O2 = obj;
                abstractC32246OooO0o06 = abstractC32246OooO0o012;
                th = null;
                oooO00o3 = oooO00o7;
                i = -1;
                i2 = 0;
                oooO00o = oooO00o8;
                abstractC32268OooO0oO = (AbstractC32268OooO0oO) objOooOo0O2;
                if (abstractC32268OooO0oO.Oooo000()) {
                }
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 3:
                oOOoOoOO.OooO00o oooO00o9 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o010 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o5 = oooO00o9;
                objOooO0o04 = obj;
                c33201OooO0Oo = (C33201OooO0Oo) objOooO0o04;
                abstractC32246OooO0o0 = abstractC32246OooO0o010;
                oooO00o = oooO00o5;
                c33201OooO0Oo2 = c33201OooO0Oo;
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                oOOoOoOO.OooO00o oooO00o10 = this.f120692OooOo;
                abstractC32246OooO0o04 = (AbstractC32246OooO0o0) this.f120693OooOo0o;
                oooO00o2 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o05 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = oooO00o10;
                enumC32485OooO00o = enumC32485OooO00o4;
                objOooOo0O = obj;
                C33201OooO0Oo c33201OooO0Oo52 = new C33201OooO0Oo(oooO00o, objOooOo0O);
                this.f120694OooOoO = abstractC32246OooO0o05;
                this.f120696OooOoOO = oooO00o2;
                this.f120693OooOo0o = null;
                this.f120692OooOo = null;
                this.f120695OooOoO0 = 5;
                objOooO0o05 = abstractC32246OooO0o04.OooO0o0(c33201OooO0Oo52, this);
                if (objOooO0o05 != enumC32485OooO00o) {
                }
                break;
            case 5:
                oOOoOoOO.OooO00o oooO00o11 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o011 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o2 = oooO00o11;
                objOooO0o05 = obj;
                c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o05;
                abstractC32246OooO0o0 = abstractC32246OooO0o011;
                oooO00o = oooO00o2;
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 6:
                AbstractC33200OooO0OO abstractC33200OooO0OO2 = (AbstractC33200OooO0OO) this.f120693OooOo0o;
                oOOoOoOO.OooO00o oooO00o12 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o03 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                abstractC33200OooO0OO = abstractC33200OooO0OO2;
                oooO00o = oooO00o12;
                z = true;
                enumC32485OooO00o = enumC32485OooO00o4;
                z2 = false;
                j = 0;
                objOooO = obj;
                bArr = (byte[]) objOooO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33200OooO0OO, "<this>");
                oO00O0o0.OooOO0O headers2 = abstractC33200OooO0OO.getHeaders();
                List<String> list2 = C32190OooOOo0.f115537OooO00o;
                String str3 = headers2.get("Content-Length");
                if (str3 == null) {
                }
                boolean z42 = C34515OooOo0.f123700OooO00o;
                if (abstractC33200OooO0OO.getHeaders().get("Content-Encoding") != null) {
                }
                boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(((ooOOOOOo.OooO0OO) abstractC32246OooO0o03.f115817OooOo0o).OooO0Oo().getMethod(), C32192OooOo0.f115540OooO0Oo);
                if (z3) {
                    if (!(bArr.length != ((int) lValueOf.longValue()) ? z : z2)) {
                    }
                }
                C33201OooO0Oo c33201OooO0Oo82 = new C33201OooO0Oo(oooO00o, bArr);
                this.f120694OooOoO = abstractC32246OooO0o03;
                this.f120696OooOoOO = oooO00o;
                this.f120693OooOo0o = null;
                this.f120695OooOoO0 = 7;
                objOooO0o06 = abstractC32246OooO0o03.OooO0o0(c33201OooO0Oo82, this);
                if (objOooO0o06 != enumC32485OooO00o) {
                }
                break;
            case 7:
                oOOoOoOO.OooO00o oooO00o13 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o02 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = oooO00o13;
                objOooO0o06 = obj;
                c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o06;
                abstractC32246OooO0o0 = abstractC32246OooO0o02;
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 8:
                oOOoOoOO.OooO00o oooO00o14 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o02 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = oooO00o14;
                objOooO0o02 = obj;
                c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o02;
                abstractC32246OooO0o0 = abstractC32246OooO0o02;
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 9:
                oOOoOoOO.OooO00o oooO00o15 = (oOOoOoOO.OooO00o) this.f120696OooOoOO;
                abstractC32246OooO0o02 = this.f120694OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = oooO00o15;
                objOooO0o0 = obj;
                c33201OooO0Oo2 = (C33201OooO0Oo) objOooO0o0;
                abstractC32246OooO0o0 = abstractC32246OooO0o02;
                if (c33201OooO0Oo2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
