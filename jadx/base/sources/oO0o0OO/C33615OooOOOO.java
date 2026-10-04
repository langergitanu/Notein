package oO0o0OO;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: oO0o0OO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33615OooOOOO extends C33620OooOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121300OooO0OO = AtomicIntegerFieldUpdater.newUpdater(C33615OooOOOO.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C33615OooOOOO(C33614OooOOO0 c33614OooOOO0, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c33614OooOOO0 + " was cancelled normally");
        }
        super(z, th);
        this._resumed$volatile = 0;
    }
}
