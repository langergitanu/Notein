package o0o0OoOO;

import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21985OooOoO0;
import androidx.lifecycle.o0Oo0oo;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$showTipsDialog$1", m80623f = "DebugFragment.kt", m80624l = {678}, m80625m = "invokeSuspend")
public final class C30709OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109821OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109822OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f109823OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f109824OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f109825OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f109826OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f109827OooOoo0;

    /* JADX INFO: renamed from: o0o0OoOO.OooOoo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f109828OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ String f109829OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f109830OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f109831OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f109832OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ DebugFragment f109833OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, DebugFragment debugFragment) {
            super(0);
            this.f109829OooOo0o = str;
            this.f109828OooOo = str2;
            this.f109831OooOoO0 = onClickListener;
            this.f109830OooOoO = onClickListener2;
            this.f109832OooOoOO = onClickListener3;
            this.f109833OooOoo0 = debugFragment;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(this.f109829OooOo0o, this.f109828OooOo, this.f109831OooOoO0, this.f109830OooOoO, this.f109832OooOoOO, null, 0, null, 384);
            DebugFragment debugFragment = this.f109833OooOoo0;
            if (debugFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                tipsDialogFragment.show(debugFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30709OooOoo0(DebugFragment debugFragment, String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, Continuation continuation) {
        super(2, continuation);
        this.f109821OooOo = debugFragment;
        this.f109824OooOoO0 = str;
        this.f109823OooOoO = str2;
        this.f109825OooOoOO = onClickListener;
        this.f109827OooOoo0 = onClickListener2;
        this.f109826OooOoo = onClickListener3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30709OooOoo0(this.f109821OooOo, this.f109824OooOoO0, this.f109823OooOoO, this.f109825OooOoOO, this.f109827OooOoo0, this.f109826OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30709OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109822OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                DebugFragment debugFragment = this.f109821OooOo;
                String str = this.f109824OooOoO0;
                String str2 = this.f109823OooOoO;
                View.OnClickListener onClickListener = this.f109825OooOoOO;
                View.OnClickListener onClickListener2 = this.f109827OooOoo0;
                View.OnClickListener onClickListener3 = this.f109826OooOoo;
                AbstractC21979OooOOo0 lifecycle = debugFragment.getLifecycle();
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
                boolean zO000OOO = abstractC33687OooO0oOO000OOoO.o000OOO(getContext());
                if (zO000OOO) {
                    OooO00o oooO00o = new OooO00o(str, str2, onClickListener, onClickListener2, onClickListener3, debugFragment);
                    this.f109822OooOo0o = 1;
                    if (o0Oo0oo.OooO00o(lifecycle, zO000OOO, abstractC33687OooO0oOO000OOoO, oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                        throw new C21985OooOoO0();
                    }
                    if (lifecycle.OooO0O0().compareTo(oooO0O0) >= 0) {
                        TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(str, str2, onClickListener, onClickListener2, onClickListener3, null, 0, null, 384);
                        if (debugFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                            tipsDialogFragment.show(debugFragment.getChildFragmentManager(), "TipsDialogFragment");
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (CancellationException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DebugFragment");
            c20358OooO00o.OooO0Oo(e, "showTipsDialog: ", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
