package oO00OOoO;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO00OOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32246OooO0o0<TSubject, TContext> implements InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final TContext f115817OooOo0o;

    public AbstractC32246OooO0o0(TContext context) {
        OooOOO0.OooO0oO(context, "context");
        this.f115817OooOo0o = context;
    }

    public abstract Object OooO00o(Object obj, AbstractC32479OooO0OO abstractC32479OooO0OO);

    public abstract TSubject OooO0O0();

    public abstract Object OooO0Oo(Continuation<? super TSubject> continuation);

    public abstract Object OooO0o0(TSubject tsubject, Continuation<? super TSubject> continuation);
}
