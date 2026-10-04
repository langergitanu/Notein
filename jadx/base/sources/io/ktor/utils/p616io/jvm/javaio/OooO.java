package io.ktor.utils.p616io.jvm.javaio;

import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o000OOo;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import oO00Oo0o.OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", m80623f = "Reading.kt", m80624l = {90}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f80837OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public byte[] f80838OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0o<byte[]> f80839OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f80840OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InputStream f80841OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooO0o<byte[]> oooO0o, InputStream inputStream, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f80839OooOoO = oooO0o;
        this.f80841OooOoOO = inputStream;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO oooO = new OooO(this.f80839OooOoO, this.f80841OooOoOO, continuation);
        oooO.f80840OooOoO0 = obj;
        return oooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        byte[] bArrO0000OoO;
        o000OOo o000ooo2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80837OooOo;
        InputStream inputStream = this.f80841OooOoOO;
        OooO0o<byte[]> oooO0o = this.f80839OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000OOo o000ooo3 = (o000OOo) this.f80840OooOoO0;
            bArrO0000OoO = oooO0o.o0000OoO();
            o000ooo2 = o000ooo3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArrO0000OoO = this.f80838OooOo0o;
            o000ooo2 = (o000OOo) this.f80840OooOoO0;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th) {
                try {
                    o000ooo2.OooO0OO().OooO0Oo(th);
                    oooO0o.o00o0O(bArrO0000OoO);
                } catch (Throwable th2) {
                    oooO0o.o00o0O(bArrO0000OoO);
                    inputStream.close();
                    throw th2;
                }
            }
        }
        while (true) {
            int i2 = inputStream.read(bArrO0000OoO, 0, bArrO0000OoO.length);
            if (i2 < 0) {
                oooO0o.o00o0O(bArrO0000OoO);
                break;
            }
            if (i2 != 0) {
                InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = o000ooo2.OooO0OO();
                this.f80840OooOoO0 = o000ooo2;
                this.f80838OooOo0o = bArrO0000OoO;
                this.f80837OooOo = 1;
                if (interfaceC23967Oooo00OOooO0OO.OooOOO0(bArrO0000OoO, i2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        }
        inputStream.close();
        return C32460OooOooO.f116667OooO00o;
    }
}
