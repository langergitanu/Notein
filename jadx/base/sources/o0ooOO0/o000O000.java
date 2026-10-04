package o0ooOO0;

import android.view.View;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.lifecycle.InterfaceC21987OooOoo;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public interface o000O000 {

    public static final class OooO00o implements o000O000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f112848OooO00o = new OooO00o();

        /* JADX INFO: renamed from: o0ooOO0.o000O000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20173OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f112849OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f112850OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20173OooO00o(AbstractComposeView abstractComposeView, OooO0OO oooO0OO) {
                super(0);
                this.f112850OooOo0o = abstractComposeView;
                this.f112849OooOo = oooO0OO;
            }

            @Override // oO0O000o.OooO00o
            public final C32460OooOooO invoke() {
                this.f112850OooOo0o.removeOnAttachStateChangeListener(this.f112849OooOo);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C24034Oooo00O<oO0O000o.OooO00o<C32460OooOooO>> f112851OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(C24034Oooo00O<oO0O000o.OooO00o<C32460OooOooO>> c24034Oooo00O) {
                super(0);
                this.f112851OooOo0o = c24034Oooo00O;
            }

            @Override // oO0O000o.OooO00o
            public final C32460OooOooO invoke() {
                this.f112851OooOo0o.f80942OooOo0o.invoke();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public static final class OooO0OO implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C24034Oooo00O<oO0O000o.OooO00o<C32460OooOooO>> f112852OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f112853OooOo0o;

            public OooO0OO(AbstractComposeView abstractComposeView, C24034Oooo00O<oO0O000o.OooO00o<C32460OooOooO>> c24034Oooo00O) {
                this.f112853OooOo0o = abstractComposeView;
                this.f112852OooOo = c24034Oooo00O;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [T, o0ooOO0.o000OoO] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View v) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
                AbstractComposeView abstractComposeView = this.f112853OooOo0o;
                InterfaceC21987OooOoo interfaceC21987OooOooOooO00o = androidx.lifecycle.oo000o.OooO00o(abstractComposeView);
                if (interfaceC21987OooOooOooO00o != null) {
                    this.f112852OooOo.f80942OooOo0o = C31597o000Ooo.OooO00o(abstractComposeView, interfaceC21987OooOooOooO00o.getLifecycle());
                    abstractComposeView.removeOnAttachStateChangeListener(this);
                } else {
                    throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View v) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, o0ooOO0.o000O000$OooO00o$OooO00o] */
        @Override // o0ooOO0.o000O000
        public final oO0O000o.OooO00o<C32460OooOooO> OooO00o(AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                OooO0OO oooO0OO = new OooO0OO(abstractComposeView, c24034Oooo00O);
                abstractComposeView.addOnAttachStateChangeListener(oooO0OO);
                c24034Oooo00O.f80942OooOo0o = new C20173OooO00o(abstractComposeView, oooO0OO);
                return new OooO0O0(c24034Oooo00O);
            }
            InterfaceC21987OooOoo interfaceC21987OooOooOooO00o = androidx.lifecycle.oo000o.OooO00o(abstractComposeView);
            if (interfaceC21987OooOooOooO00o != null) {
                return C31597o000Ooo.OooO00o(abstractComposeView, interfaceC21987OooOooOooO00o.getLifecycle());
            }
            throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    oO0O000o.OooO00o<C32460OooOooO> OooO00o(AbstractComposeView abstractComposeView);
}
