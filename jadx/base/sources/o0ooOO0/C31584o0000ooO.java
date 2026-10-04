package o0ooOO0;

import Oooo0oO.C21022OooO0OO;
import androidx.compose.p002ui.platform.AbstractComposeView;
import o0000OoO.C24224OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0ooOO0.o0000ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31584o0000ooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000 f112843OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f112844OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C21022OooO0OO f112845OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31584o0000ooO(AbstractComposeView abstractComposeView, o000 o000Var, C21022OooO0OO c21022OooO0OO) {
        super(0);
        this.f112844OooOo0o = abstractComposeView;
        this.f112843OooOo = o000Var;
        this.f112845OooOoO0 = c21022OooO0OO;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        o000 o000Var = this.f112843OooOo;
        AbstractComposeView abstractComposeView = this.f112844OooOo0o;
        abstractComposeView.removeOnAttachStateChangeListener(o000Var);
        C24224OooO00o.OooO0oO(abstractComposeView).f81467OooO00o.remove(this.f112845OooOoO0);
        return C32460OooOooO.f116667OooO00o;
    }
}
