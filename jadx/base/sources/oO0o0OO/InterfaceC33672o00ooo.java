package oO0o0OO;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0oO0.InterfaceC33886OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33672o00ooo extends InterfaceC34415OooO0oo.OooO0O0 {

    /* JADX INFO: renamed from: oO0o0OO.o00ooo$OooO00o */
    public static final class OooO00o implements InterfaceC34415OooO0oo.OooO0OO<InterfaceC33672o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f121379OooOo0o = new OooO00o();
    }

    InterfaceC33618OooOOo0 attachChild(InterfaceC33619OooOOoo interfaceC33619OooOOoo);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    InterfaceC33569OooO0oo<InterfaceC33672o00ooo> getChildren();

    InterfaceC33886OooO0OO getOnJoin();

    InterfaceC33672o00ooo getParent();

    InterfaceC33651OoooOoO invokeOnCompletion(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o);

    InterfaceC33651OoooOoO invokeOnCompletion(boolean z, boolean z2, InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation<? super C32460OooOooO> continuation);

    InterfaceC33672o00ooo plus(InterfaceC33672o00ooo interfaceC33672o00ooo);

    boolean start();
}
