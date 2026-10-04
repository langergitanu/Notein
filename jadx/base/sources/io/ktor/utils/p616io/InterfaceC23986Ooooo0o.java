package io.ktor.utils.p616io;

import OooOoOO.C20519OooO0Oo;
import Ooooo00.OooOOO;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOOO;
import oO00O.OooOO0O;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32447OooOOo;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: renamed from: io.ktor.utils.io.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC23986Ooooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f80771OooO00o = OooO00o.f80772OooO00o;

    /* JADX INFO: renamed from: io.ktor.utils.io.Ooooo0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f80772OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C32447OooOOo f80773OooO0O0 = C20519OooO0Oo.OooO0OO(C19593OooO00o.f80774OooOo0o);

        /* JADX INFO: renamed from: io.ktor.utils.io.Ooooo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19593OooO00o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC23967Oooo00O> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C19593OooO00o f80774OooOo0o = new C19593OooO00o(0);

            @Override // oO0O000o.OooO00o
            public final InterfaceC23967Oooo00O invoke() {
                io.ktor.utils.p616io.OooO00o OooO00o2 = OooOOO.OooO00o();
                C23992OoooooO.OooO0O0(OooO00o2);
                return OooO00o2;
            }
        }
    }

    Object OooO(Appendable appendable, int i, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Throwable OooO0O0();

    int OooO0OO();

    Object OooO0o(byte[] bArr, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooO0oO(ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOO(long j, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOOo(C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOoo(ByteBuffer byteBuffer, long j, long j2, long j3, Continuation continuation);

    Object OooOo0(int i, OooOO0O oooOO0O);

    Object OooOo0O(long j, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOo0o(Continuation continuation);

    Object OooOoOO(AbstractC32479OooO0OO abstractC32479OooO0OO);

    boolean OooOoo();

    Object OooOoo0(AbstractC32479OooO0OO abstractC32479OooO0OO);

    boolean cancel(Throwable th);
}
