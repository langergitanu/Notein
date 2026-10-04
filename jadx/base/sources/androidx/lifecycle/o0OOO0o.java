package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f65693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC21979OooOOo0 f65694OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f65695OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(AbstractC21979OooOOo0 abstractC21979OooOOo0, C33614OooOOO0 c33614OooOOO0, oO0O000o.OooO00o oooO00o) {
        this.f65694OooOo0o = abstractC21979OooOOo0;
        this.f65693OooOo = c33614OooOOO0;
        this.f65695OooOoO0 = (kotlin.jvm.internal.OooOOOO) oooO00o;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        Object objOooO00o;
        AbstractC21979OooOOo0.OooO00o.C19028OooO00o c19028OooO00o = AbstractC21979OooOOo0.OooO00o.Companion;
        AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
        c19028OooO00o.getClass();
        AbstractC21979OooOOo0.OooO00o oooO00oOooO0O0 = AbstractC21979OooOOo0.OooO00o.C19028OooO00o.OooO0O0(oooO0O0);
        C33614OooOOO0 c33614OooOOO0 = this.f65693OooOo;
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65694OooOo0o;
        if (oooO00o != oooO00oOooO0O0) {
            if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
                abstractC21979OooOOo0.OooO0OO(this);
                c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(new C21985OooOoO0()));
                return;
            }
            return;
        }
        abstractC21979OooOOo0.OooO0OO(this);
        try {
            objOooO00o = this.f65695OooOoO0.invoke();
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        c33614OooOOO0.resumeWith(objOooO00o);
    }
}
