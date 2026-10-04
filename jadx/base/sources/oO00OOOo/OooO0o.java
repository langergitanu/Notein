package oO00OOOo;

import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements InterfaceC33723OooO0oO<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23990Oooooo f115766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115767OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO f115768OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo.OooO00o f115769OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33911OooO0OO f115770OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Charset f115771OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", m80623f = "KotlinxSerializationJsonExtensions.kt", m80624l = {124, 127}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f115772OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f115773OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public OooO0o f115774OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Object f115776OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f115773OooOo0o = obj;
            this.f115772OooOo |= Integer.MIN_VALUE;
            return OooO0o.this.emit(null, this);
        }
    }

    public OooO0o(InterfaceC23990Oooooo interfaceC23990Oooooo, oO00OOOo.OooO00o oooO00o, OooO oooO, InterfaceC33911OooO0OO interfaceC33911OooO0OO, Charset charset) {
        this.f115766OooOo = interfaceC23990Oooooo;
        this.f115769OooOoO0 = oooO00o;
        this.f115768OooOoO = oooO;
        this.f115770OooOoOO = interfaceC33911OooO0OO;
        this.f115771OooOoo0 = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (io.ktor.utils.p616io.C23992OoooooO.OooO0o(r6.f115766OooOo, r7, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        Object obj2;
        OooO0o oooO0o;
        OooO0o oooO0o2;
        Charset charset;
        Charset charset2;
        byte[] bArrOooO0OO;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f115772OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f115772OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj3 = oooO00o.f115773OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f115772OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj3);
            int i3 = this.f115767OooOo0o;
            this.f115767OooOo0o = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            if (i3 > 0) {
                byte[] bArr = this.f115769OooOoO0.f115760OooO0OO;
                oooO00o.f115774OooOoO = this;
                oooO00o.f115776OooOoOO = obj;
                oooO00o.f115772OooOo = 1;
                if (C23992OoooooO.OooO0o(this.f115766OooOo, bArr, oooO00o) != enumC32485OooO00o) {
                    oooO0o2 = this;
                }
                return enumC32485OooO00o;
            }
            obj2 = obj;
            oooO0o = this;
            String strOooO00o = oooO0o.f115768OooOoO.f115756OooO00o.OooO00o(oooO0o.f115770OooOoOO, obj2);
            charset = C33580OooO00o.f121231OooO0O0;
            charset2 = oooO0o.f115771OooOoo0;
            if (OooOOO0.OooO0O0(charset2, charset)) {
                CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
                OooOOO0.OooO0o(charsetEncoderNewEncoder, "charset.newEncoder()");
                bArrOooO0OO = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder, strOooO00o, strOooO00o.length());
            } else {
                bArrOooO0OO = C33595OooOOo.OooOOOo(strOooO00o);
            }
            oooO00o.f115774OooOoO = oooO0o;
            oooO00o.f115776OooOoOO = null;
            oooO00o.f115772OooOo = 2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0o = oooO00o.f115774OooOoO;
                C32446OooOOOo.OooO0O0(obj3);
                oooO0o.f115766OooOo.flush();
                return C32460OooOooO.f116667OooO00o;
            }
            obj = oooO00o.f115776OooOoOO;
            oooO0o2 = oooO00o.f115774OooOoO;
            C32446OooOOOo.OooO0O0(obj3);
        }
        obj2 = obj;
        oooO0o = oooO0o2;
        String strOooO00o2 = oooO0o.f115768OooOoO.f115756OooO00o.OooO00o(oooO0o.f115770OooOoOO, obj2);
        charset = C33580OooO00o.f121231OooO0O0;
        charset2 = oooO0o.f115771OooOoo0;
        if (OooOOO0.OooO0O0(charset2, charset)) {
        }
        oooO00o.f115774OooOoO = oooO0o;
        oooO00o.f115776OooOoOO = null;
        oooO00o.f115772OooOo = 2;
    }
}
