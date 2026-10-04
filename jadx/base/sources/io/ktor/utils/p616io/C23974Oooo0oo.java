package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo000;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;

/* JADX INFO: renamed from: io.ktor.utils.io.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase$peekTo$2", m80623f = "ByteChannelSequential.kt", m80624l = {823}, m80625m = "invokeSuspend")
public final class C23974Oooo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0o0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80716OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80717OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f80718OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f80719OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ long f80720OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ long f80721OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f80722OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23974Oooo0oo(long j, Oooo000 oooo000, long j2, ByteBuffer byteBuffer, long j3, Continuation continuation) {
        super(2, continuation);
        this.f80719OooOoO0 = j;
        this.f80718OooOoO = oooo000;
        this.f80720OooOoOO = j2;
        this.f80722OooOoo0 = byteBuffer;
        this.f80721OooOoo = j3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C23974Oooo0oo c23974Oooo0oo = new C23974Oooo0oo(this.f80719OooOoO0, this.f80718OooOoO, this.f80720OooOoOO, this.f80722OooOoo0, this.f80721OooOoo, continuation);
        c23974Oooo0oo.f80716OooOo = obj;
        return c23974Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0o0Oo oo0o0oo, Continuation<? super C32460OooOooO> continuation) {
        return ((C23974Oooo0oo) create(oo0o0oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        oo0o0Oo oo0o0oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80717OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0o0Oo oo0o0oo2 = (oo0o0Oo) this.f80716OooOo;
            long j = this.f80719OooOoO0;
            if (j > 4088) {
                j = 4088;
            }
            this.f80716OooOo = oo0o0oo2;
            this.f80717OooOo0o = 1;
            if (oo0o0oo2.OooOo00((int) j, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oo0o0oo = oo0o0oo2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oo0o0oo = (oo0o0Oo) this.f80716OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        C32271OooO00o c32271OooO00oOooO00o = oo0o0oo.OooO00o(1);
        if (c32271OooO00oOooO00o == null) {
            c32271OooO00oOooO00o = C32271OooO00o.f115978OooOOO0;
        }
        long j2 = c32271OooO00oOooO00o.f115946OooO0OO - c32271OooO00oOooO00o.f115945OooO0O0;
        if (j2 > 0) {
            ByteBuffer destination = this.f80722OooOoo0;
            long jLimit = destination.limit();
            long j3 = this.f80721OooOoo;
            long jMin = Math.min(j2, Math.min(this.f80720OooOoOO, jLimit - j3));
            this.f80718OooOoO.f80941OooOo0o = jMin;
            ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
            OooOOO0.OooO0oO(destination, "destination");
            int i2 = (int) 0;
            if (jMin >= 2147483647L) {
                C33074OooOoO.OooO0o0(jMin, "length");
                throw null;
            }
            int i3 = (int) jMin;
            if (j3 >= 2147483647L) {
                C33074OooOoO.OooO0o0(j3, "destinationOffset");
                throw null;
            }
            C32250OooO0O0.OooO00o(c32271OooO00oOooO00o.f115944OooO00o, destination, i2, i3, (int) j3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
