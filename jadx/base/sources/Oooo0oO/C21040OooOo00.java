package Oooo0oO;

import Oooo.C20811OooO00o;
import Oooo0oo.C21113OooO00o;
import Oooo0oo.C21114OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: Oooo0oO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21040OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21113OooO00o f60954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21035OooOOo f60955OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f60956OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C21092o0000o0 f60957OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21040OooOo00(C21035OooOOo c21035OooOOo, C21113OooO00o c21113OooO00o, C21092o0000o0 c21092o0000o0, o00Oo0 o00oo02) {
        super(0);
        this.f60955OooOo0o = c21035OooOOo;
        this.f60954OooOo = c21113OooO00o;
        this.f60957OooOoO0 = c21092o0000o0;
        this.f60956OooOoO = o00oo02;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        C21035OooOOo c21035OooOOo = this.f60955OooOo0o;
        C21114OooO0O0 c21114OooO0O0 = c21035OooOOo.f60934Oooo0o0;
        C21113OooO00o c21113OooO00o = this.f60954OooOo;
        C21092o0000o0 c21092o0000o0 = this.f60957OooOoO0;
        o00Oo0 o00oo02 = this.f60956OooOoO;
        C21113OooO00o c21113OooO00o2 = c21114OooO0O0.f61273OooO0O0;
        try {
            c21114OooO0O0.f61273OooO0O0 = c21113OooO00o;
            C21092o0000o0 c21092o0000o02 = c21035OooOOo.f60928Oooo000;
            int[] iArr = c21035OooOOo.f60907OooOOO;
            C20811OooO00o c20811OooO00o = c21035OooOOo.f60915OooOo0;
            c21035OooOOo.f60907OooOOO = null;
            c21035OooOOo.f60915OooOo0 = null;
            try {
                c21035OooOOo.f60928Oooo000 = c21092o0000o0;
                boolean z = c21114OooO0O0.f61277OooO0o0;
                try {
                    c21114OooO0O0.f61277OooO0o0 = false;
                    C21035OooOOo.OooOooo(c21035OooOOo, o00oo02.f61249OooO00o, o00oo02.f61255OooO0oO, o00oo02.f61250OooO0O0);
                    c21114OooO0O0.f61277OooO0o0 = z;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    c21114OooO0O0.f61273OooO0O0 = c21113OooO00o2;
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    c21114OooO0O0.f61277OooO0o0 = z;
                    throw th;
                }
            } finally {
                c21035OooOOo.f60928Oooo000 = c21092o0000o02;
                c21035OooOOo.f60907OooOOO = iArr;
                c21035OooOOo.f60915OooOo0 = c20811OooO00o;
            }
        } catch (Throwable th2) {
            c21114OooO0O0.f61273OooO0O0 = c21113OooO00o2;
            throw th2;
        }
    }
}
