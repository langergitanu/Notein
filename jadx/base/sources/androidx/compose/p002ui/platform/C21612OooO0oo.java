package androidx.compose.p002ui.platform;

import Oooo0oO.C21047OooOoo0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.InterfaceC21044OooOoO0;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000oOoO.C24633OooO00o;
import o0ooOO0.C31561Oooooo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: androidx.compose.ui.platform.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21612OooO0oo implements InterfaceC21044OooOoO0, InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C21047OooOoo0 f63513OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AndroidComposeView f63514OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AbstractC21979OooOOo0 f63515OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f63516OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C24633OooO00o f63517OooOoOO = C31561Oooooo0.f112803OooO00o;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.OooO0oo$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<AndroidComposeView.OooO0O0, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24633OooO00o f63518OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24633OooO00o c24633OooO00o) {
            super(1);
            this.f63518OooOo = c24633OooO00o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AndroidComposeView.OooO0O0 oooO0O0) {
            AndroidComposeView.OooO0O0 it = oooO0O0;
            OooOOO0.OooO0oO(it, "it");
            C21612OooO0oo c21612OooO0oo = C21612OooO0oo.this;
            if (!c21612OooO0oo.f63516OooOoO0) {
                AbstractC21979OooOOo0 lifecycle = it.f63432OooO00o.getLifecycle();
                C24633OooO00o c24633OooO00o = this.f63518OooOo;
                c21612OooO0oo.f63517OooOoOO = c24633OooO00o;
                if (c21612OooO0oo.f63515OooOoO == null) {
                    c21612OooO0oo.f63515OooOoO = lifecycle;
                    lifecycle.OooO00o(c21612OooO0oo);
                } else if (lifecycle.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65540OooOoO0) >= 0) {
                    c21612OooO0oo.f63513OooOo.OooOOOO(new C24633OooO00o(-2000640158, true, new C21611OooO0oO(c21612OooO0oo, c24633OooO00o)));
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C21612OooO0oo(AndroidComposeView androidComposeView, C21047OooOoo0 c21047OooOoo0) {
        this.f63514OooOo0o = androidComposeView;
        this.f63513OooOo = c21047OooOoo0;
    }

    @Override // Oooo0oO.InterfaceC21044OooOoO0
    public final boolean OooO0O0() {
        return this.f63513OooOo.f60971Oooo;
    }

    @Override // Oooo0oO.InterfaceC21044OooOoO0
    public final void OooOOOO(InterfaceC32508OooOOOo<? super InterfaceC21033OooOOOO, ? super Integer, C32460OooOooO> content) {
        OooOOO0.OooO0oO(content, "content");
        this.f63514OooOo0o.setOnViewTreeOwnersAvailable(new OooO00o((C24633OooO00o) content));
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
            dispose();
        } else {
            if (oooO00o != AbstractC21979OooOOo0.OooO00o.ON_CREATE || this.f63516OooOoO0) {
                return;
            }
            OooOOOO(this.f63517OooOoOO);
        }
    }

    @Override // Oooo0oO.InterfaceC21044OooOoO0
    public final void dispose() {
        if (!this.f63516OooOoO0) {
            this.f63516OooOoO0 = true;
            this.f63514OooOo0o.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f63515OooOoO;
            if (abstractC21979OooOOo0 != null) {
                abstractC21979OooOOo0.OooO0OO(this);
            }
        }
        this.f63513OooOo.dispose();
    }
}
