package o000oo0;

import androidx.room.AbstractC22083OooO0oo;
import o00O0OoO.CallableC24881OooOo0;

/* JADX INFO: renamed from: o000oo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24670OooOOo0<T> extends AbstractC22083OooO0oo<T> {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final CallableC24881OooOo0 f83564OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24670OooOOo0(AbstractC24673OooOo0O abstractC24673OooOo0O, C24660OooO0o0 container, String[] strArr, CallableC24881OooOo0 callableC24881OooOo0) {
        super(abstractC24673OooOo0O, container, strArr);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        this.f83564OooOOoo = callableC24881OooOo0;
    }

    @Override // androidx.room.AbstractC22083OooO0oo
    public final Object OooOO0o() {
        return this.f83564OooOOoo.call();
    }
}
