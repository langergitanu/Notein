package io.ktor.utils.p616io.jvm.javaio;

import androidx.fragment.app.C21904OooOoo0;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24002OooO0o0 extends InputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33671o00oO0o f80860OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC23986Ooooo0o f80861OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[] f80862OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f80863OooOoO0;

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.OooO0o0$OooO00o */
    public static final class OooO00o extends io.ktor.utils.p616io.jvm.javaio.OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ C24002OooO0o0 f80864OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC33672o00ooo interfaceC33672o00ooo, C24002OooO0o0 c24002OooO0o0) {
            super(interfaceC33672o00ooo);
            this.f80864OooO0oO = c24002OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // io.ktor.utils.p616io.jvm.javaio.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            C24001OooO0Oo c24001OooO0Oo;
            int iIntValue;
            OooO00o oooO00o;
            Object obj;
            Continuation continuationOooO0o0;
            if (abstractC32479OooO0OO instanceof C24001OooO0Oo) {
                c24001OooO0Oo = (C24001OooO0Oo) abstractC32479OooO0OO;
                int i = c24001OooO0Oo.f80858OooOoO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c24001OooO0Oo.f80858OooOoO = i - Integer.MIN_VALUE;
                } else {
                    c24001OooO0Oo = new C24001OooO0Oo(this, abstractC32479OooO0OO);
                }
            }
            Object objOooO0o = c24001OooO0Oo.f80856OooOo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c24001OooO0Oo.f80858OooOoO;
            Object obj2 = null;
            if (i2 != 0) {
                if (i2 == 1) {
                    oooO00o = c24001OooO0Oo.f80857OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    OooOOO0.OooO0o0(objOooO0o, "null cannot be cast to non-null type kotlin.ByteArray");
                    InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = oooO00o.f80864OooO0oO.f80861OooOo0o;
                    int i3 = oooO00o.f80846OooO0Oo;
                    int i4 = oooO00o.f80847OooO0o0;
                    c24001OooO0Oo.f80857OooOo0o = oooO00o;
                    c24001OooO0Oo.f80858OooOoO = 2;
                    objOooO0o = interfaceC23986Ooooo0o.OooO0o((byte[]) objOooO0o, i3, i4, c24001OooO0Oo);
                    if (objOooO0o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oooO00o = c24001OooO0Oo.f80857OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                }
                iIntValue = ((Number) objOooO0o).intValue();
                if (iIntValue == -1) {
                    oooO00o.f80864OooO0oO.f80860OooOo.complete();
                    oooO00o.result = iIntValue;
                    return C32460OooOooO.f116667OooO00o;
                }
            } else {
                C32446OooOOOo.OooO0O0(objOooO0o);
                iIntValue = 0;
                oooO00o = this;
            }
            oooO00o.result = iIntValue;
            c24001OooO0Oo.f80857OooOo0o = oooO00o;
            c24001OooO0Oo.f80858OooOoO = 1;
            while (true) {
                Object obj3 = oooO00o.state;
                if (obj3 instanceof Thread) {
                    continuationOooO0o0 = C21904OooOoo0.OooO0o0(c24001OooO0Oo);
                    obj = obj3;
                } else {
                    if (!OooOOO0.OooO0O0(obj3, oooO00o)) {
                        throw new IllegalStateException("Already suspended or in finished state");
                    }
                    obj = obj2;
                    continuationOooO0o0 = C21904OooOoo0.OooO0o0(c24001OooO0Oo);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = io.ktor.utils.p616io.jvm.javaio.OooO00o.f80842OooO0o;
                while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, obj3, continuationOooO0o0)) {
                    if (atomicReferenceFieldUpdater.get(oooO00o) != obj3) {
                        break;
                    }
                }
                if (obj != null) {
                    OooO0o oooO0o = C24003OooO0oO.f80865OooO00o.get();
                    if (oooO0o == null) {
                        oooO0o = OooO0OO.f80855OooO00o;
                    }
                    oooO0o.OooO0O0(obj);
                }
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                return enumC32485OooO00o;
                obj2 = obj;
            }
        }
    }

    public C24002OooO0o0(InterfaceC33672o00ooo interfaceC33672o00ooo, InterfaceC23986Ooooo0o channel) {
        OooOOO0.OooO0oO(channel, "channel");
        this.f80861OooOo0o = channel;
        this.f80860OooOo = new C33671o00oO0o(interfaceC33672o00ooo);
        this.f80863OooOoO0 = new OooO00o(interfaceC33672o00ooo, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f80861OooOo0o.OooO0OO();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = this.f80861OooOo0o;
            OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
            interfaceC23986Ooooo0o.cancel(null);
            if (!this.f80860OooOo.isCompleted()) {
                this.f80860OooOo.cancel((CancellationException) null);
            }
            OooO00o oooO00o = this.f80863OooOoO0;
            InterfaceC33651OoooOoO interfaceC33651OoooOoO = oooO00o.f80845OooO0OO;
            if (interfaceC33651OoooOoO != null) {
                interfaceC33651OoooOoO.dispose();
            }
            oooO00o.f80844OooO0O0.resumeWith(C32446OooOOOo.OooO00o(new CancellationException("Stream closed")));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.f80862OooOoO;
            if (bArr == null) {
                bArr = new byte[1];
                this.f80862OooOoO = bArr;
            }
            int iOooO0O0 = this.f80863OooOoO0.OooO0O0(0, 1, bArr);
            if (iOooO0O0 == -1) {
                return -1;
            }
            if (iOooO0O0 == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iOooO0O0 + " bytes.").toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        OooO00o oooO00o;
        oooO00o = this.f80863OooOoO0;
        OooOOO0.OooO0Oo(bArr);
        return oooO00o.OooO0O0(i, i2, bArr);
    }
}
