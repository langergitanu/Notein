package o00000;

import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: renamed from: o00000.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24071Oooo0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<BaseInputConnection> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24069Oooo0o f81116OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24071Oooo0oO(C24069Oooo0o c24069Oooo0o) {
        super(0);
        this.f81116OooOo0o = c24069Oooo0o;
    }

    @Override // oO0O000o.OooO00o
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f81116OooOo0o.f81095OooO00o, false);
    }
}
