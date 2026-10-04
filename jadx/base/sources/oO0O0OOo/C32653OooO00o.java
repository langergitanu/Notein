package oO0O0OOo;

import java.io.IOException;
import java.nio.channels.spi.AbstractSelector;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33706OooOOo;

/* JADX INFO: renamed from: oO0O0OOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.selector.ActorSelectorManager$1", m80623f = "ActorSelectorManager.kt", m80624l = {43}, m80625m = "invokeSuspend")
public final class C32653OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C32654OooO0O0 f117335OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractSelector f117336OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f117337OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractSelector f117338OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C32654OooO0O0 f117339OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32653OooO00o(C32654OooO0O0 c32654OooO0O0, Continuation<? super C32653OooO00o> continuation) {
        super(2, continuation);
        this.f117339OooOoOO = c32654OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C32653OooO00o(this.f117339OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C32653OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.nio.channels.spi.AbstractSelector] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.nio.channels.spi.AbstractSelector] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.channels.spi.AbstractSelector] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.nio.channels.spi.AbstractSelector] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        C32654OooO0O0 c32654OooO0O0;
        Throwable th;
        ?? r0;
        ?? r2;
        ?? r22;
        ?? r02;
        ?? r03;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f117337OooOoO;
        ?? r23 = 1;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c32654OooO0O0 = this.f117339OooOoOO;
                AbstractSelector abstractSelectorOpenSelector = c32654OooO0O0.f117379OooOo0o.openSelector();
                if (abstractSelectorOpenSelector == null) {
                    throw new IllegalStateException("openSelector() = null");
                }
                c32654OooO0O0.selectorRef = abstractSelectorOpenSelector;
                try {
                    C32662OooO0oo<OooOO0O> c32662OooO0oo = c32654OooO0O0.f117343OooOoo0;
                    this.f117336OooOo0o = abstractSelectorOpenSelector;
                    this.f117335OooOo = c32654OooO0O0;
                    this.f117338OooOoO0 = abstractSelectorOpenSelector;
                    this.f117337OooOoO = 1;
                    if (C32654OooO0O0.Oooo000(c32654OooO0O0, c32662OooO0oo, abstractSelectorOpenSelector, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    AbstractSelector abstractSelector = abstractSelectorOpenSelector;
                    r2 = abstractSelector;
                    r03 = abstractSelector;
                    c32654OooO0O0.closed = true;
                    c32654OooO0O0.f117343OooOoo0.OooO0O0();
                    c32654OooO0O0.selectorRef = null;
                    r02 = r03;
                    r22 = r2;
                } catch (Throwable th2) {
                    r23 = abstractSelectorOpenSelector;
                    th = th2;
                    r0 = r23;
                    c32654OooO0O0.closed = true;
                    C32662OooO0oo<OooOO0O> c32662OooO0oo2 = c32654OooO0O0.f117343OooOoo0;
                    c32662OooO0oo2.OooO0O0();
                    OooOOO.OooOOo0(r0, th);
                    c32654OooO0O0.closed = true;
                    c32662OooO0oo2.OooO0O0();
                    c32654OooO0O0.selectorRef = null;
                    r02 = r0;
                    r22 = r23;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0 = this.f117338OooOoO0;
                c32654OooO0O0 = this.f117335OooOo;
                r23 = this.f117336OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    r03 = r0;
                    r2 = r23;
                    c32654OooO0O0.closed = true;
                    c32654OooO0O0.f117343OooOoo0.OooO0O0();
                    c32654OooO0O0.selectorRef = null;
                    r02 = r03;
                    r22 = r2;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c32654OooO0O0.closed = true;
                        C32662OooO0oo<OooOO0O> c32662OooO0oo22 = c32654OooO0O0.f117343OooOoo0;
                        c32662OooO0oo22.OooO0O0();
                        OooOOO.OooOOo0(r0, th);
                        c32654OooO0O0.closed = true;
                        c32662OooO0oo22.OooO0O0();
                        c32654OooO0O0.selectorRef = null;
                        r02 = r0;
                        r22 = r23;
                    } catch (Throwable th4) {
                        c32654OooO0O0.closed = true;
                        c32654OooO0O0.f117343OooOoo0.OooO0O0();
                        c32654OooO0O0.selectorRef = null;
                        OooOOO.OooOOo0(r0, null);
                        throw th4;
                    }
                }
            }
            OooOOO.OooOOo0(r02, null);
            while (true) {
                OooOO0O oooOO0OOooO0Oo = c32654OooO0O0.f117343OooOoo0.OooO0Oo();
                if (oooOO0OOooO0Oo == null) {
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    oO0O000.OooO00o.OooO00o(r22, null);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO.OooOOoo(oooOO0OOooO0Oo, new C33706OooOOo("Failed to apply interest: selector closed"));
            }
        } finally {
        }
    }
}
