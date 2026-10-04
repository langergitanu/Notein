package ooOOOOOo;

import com.microsoft.identity.common.java.constants.FidoConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO000oo.InterfaceC32130OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33201OooO0Oo;
import oO0Oo0Oo.C33204OooO0oO;
import oO0Oo0Oo.C33205OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00Oo0.C34502OooO00o;
import oOo00Oo0.InterfaceC34503OooO0O0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public class OooO0OO implements InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC32130OooO0O0 f125912OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO000o0.OooO0o f125913OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC33200OooO0OO f125914OooOoO0;
    private volatile /* synthetic */ int received;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C34502OooO00o<Object> f125911OooOoOO = new C34502OooO00o<>("CustomResponse");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f125910OooOoO = AtomicIntegerFieldUpdater.newUpdater(OooO0OO.class, "received");

    public OooO0OO(oO000o0.OooO0o client) {
        OooOOO0.OooO0oO(client, "client");
        this.f125913OooOo0o = client;
        this.received = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r8 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:49:0x00b5, B:54:0x00c5, B:57:0x00d5, B:58:0x00ea), top: B:66:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(oOOoOoOO.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        Object obj;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f125909OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f125909OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = oooO0O0.f125908OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f125909OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            try {
                AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = OooO0o0();
                InterfaceC34595OooO0Oo<?> type = oooO00o.f123413OooO00o;
                OooOOO0.OooO0oO(type, "type");
                if (C24217OooO0O0.OooO0Oo(type).isInstance(abstractC33200OooO0OOOooO0o0)) {
                    AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o02 = OooO0o0();
                    C33204OooO0oO.OooO0OO(OooO0o0());
                    return abstractC33200OooO0OOOooO0o02;
                }
                if (!OooO0O0() && !f125910OooOoO.compareAndSet(this, 0, 1)) {
                    throw new C35053OooO00o(this);
                }
                objOooO0OO = getAttributes().OooO0OO(f125911OooOoOO);
                if (objOooO0OO == null) {
                    oooO0O0.f125906OooOo0o = this;
                    oooO0O0.f125905OooOo = oooO00o;
                    oooO0O0.f125909OooOoOO = 1;
                    objOooO0OO = OooO0o();
                }
                oooO0OO2 = this;
            } catch (Throwable th) {
                th = th;
                oooO0OO = this;
                C33633Oooo0.OooO0OO(oooO0OO.OooO0o0(), "Receive failed", th);
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO00o = oooO0O0.f125905OooOo;
                oooO0OO = oooO0O0.f125906OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                    obj = ((C33201OooO0Oo) objOooO0OO).f120152OooO0O0;
                    if (!OooOOO0.OooO0O0(obj, oO00O0oO.OooO0O0.f115612OooO00o)) {
                        obj = null;
                    }
                    if (obj != null) {
                        InterfaceC34595OooO0Oo<?> type2 = oooO00o.f123413OooO00o;
                        OooOOO0.OooO0oO(type2, "type");
                        if (!C24217OooO0O0.OooO0Oo(type2).isInstance(obj)) {
                            throw new C35054OooO0Oo(oooO0OO.OooO0o0(), C24035Oooo00o.f80943OooO00o.OooO0O0(obj.getClass()), oooO00o.f123413OooO00o);
                        }
                    }
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C33633Oooo0.OooO0OO(oooO0OO.OooO0o0(), "Receive failed", th);
                        throw th;
                    } finally {
                        C33204OooO0oO.OooO0OO(oooO0OO.OooO0o0());
                    }
                }
            }
            oooO00o = oooO0O0.f125905OooOo;
            oooO0OO2 = oooO0O0.f125906OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0OO);
            } catch (Throwable th3) {
                th = th3;
                oooO0OO = oooO0OO2;
                C33633Oooo0.OooO0OO(oooO0OO.OooO0o0(), "Receive failed", th);
                throw th;
            }
        }
        C33201OooO0Oo c33201OooO0Oo = new C33201OooO0Oo(oooO00o, objOooO0OO);
        C33205OooO0oo c33205OooO0oo = oooO0OO2.f125913OooOo0o.f114956OooOoo0;
        oooO0O0.f125906OooOo0o = oooO0OO2;
        oooO0O0.f125905OooOo = oooO00o;
        oooO0O0.f125909OooOoOO = 2;
        objOooO0OO = c33205OooO0oo.OooO00o(oooO0OO2, c33201OooO0Oo, oooO0O0);
        if (objOooO0OO != enumC32485OooO00o) {
            oooO0OO = oooO0OO2;
            obj = ((C33201OooO0Oo) objOooO0OO).f120152OooO0O0;
            if (!OooOOO0.OooO0O0(obj, oO00O0oO.OooO0O0.f115612OooO00o)) {
            }
            if (obj != null) {
            }
            return obj;
        }
        return enumC32485OooO00o;
    }

    public boolean OooO0O0() {
        return false;
    }

    public final InterfaceC32130OooO0O0 OooO0Oo() {
        InterfaceC32130OooO0O0 interfaceC32130OooO0O0 = this.f125912OooOo;
        if (interfaceC32130OooO0O0 != null) {
            return interfaceC32130OooO0O0;
        }
        OooOOO0.OooOOOO("request");
        throw null;
    }

    public Object OooO0o() {
        return OooO0o0().OooO0O0();
    }

    public final AbstractC33200OooO0OO OooO0o0() {
        AbstractC33200OooO0OO abstractC33200OooO0OO = this.f125914OooOoO0;
        if (abstractC33200OooO0OO != null) {
            return abstractC33200OooO0OO;
        }
        OooOOO0.OooOOOO(FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY);
        throw null;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return OooO0o0().OooOOO0();
    }

    public final InterfaceC34503OooO0O0 getAttributes() {
        return OooO0Oo().getAttributes();
    }

    public final String toString() {
        return "HttpClientCall[" + OooO0Oo().getUrl() + ", " + OooO0o0().OooO0o() + ']';
    }
}
