package o0o0OoOO;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0o0OoOo.C30722OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OoOO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initHarmonyBackupRestore$2", m80623f = "DebugFragment.kt", m80624l = {545}, m80625m = "invokeSuspend")
public final class C30696OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109782OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109783OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ View f109784OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextView f109785OooOoO0;

    /* JADX INFO: renamed from: o0o0OoOO.OooOOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initHarmonyBackupRestore$2$1", m80623f = "DebugFragment.kt", m80624l = {546}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ DebugFragment f109786OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109787OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ View f109788OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextView f109789OooOoO0;

        /* JADX INFO: renamed from: o0o0OoOO.OooOOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initHarmonyBackupRestore$2$1$1", m80623f = "DebugFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20121OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextView f109790OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f109791OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ View f109792OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20121OooO00o(TextView textView, View view, Continuation<? super C20121OooO00o> continuation) {
                super(2, continuation);
                this.f109790OooOo = textView;
                this.f109792OooOoO0 = view;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20121OooO00o c20121OooO00o = new C20121OooO00o(this.f109790OooOo, this.f109792OooOoO0, continuation);
                c20121OooO00o.f109791OooOo0o = ((Number) obj).intValue();
                return c20121OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C20121OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f109791OooOo0o;
                TextView textView = this.f109790OooOo;
                textView.setText(i + "%");
                boolean z = 1 <= i && i < 100;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(textView);
                textView.setVisibility(z ? 0 : 8);
                View view = this.f109792OooOoO0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                view.setVisibility(z ? 0 : 8);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(DebugFragment debugFragment, TextView textView, View view, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109786OooOo = debugFragment;
            this.f109789OooOoO0 = textView;
            this.f109788OooOoO = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f109786OooOo, this.f109789OooOoO0, this.f109788OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109787OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = this.f109786OooOo.OooOoO();
                C20121OooO00o c20121OooO00o = new C20121OooO00o(this.f109789OooOoO0, this.f109788OooOoO, null);
                this.f109787OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c30722OooO00oOooOoO.f109874OooOo, c20121OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30696OooOOOo(DebugFragment debugFragment, TextView textView, View view, Continuation<? super C30696OooOOOo> continuation) {
        super(2, continuation);
        this.f109782OooOo = debugFragment;
        this.f109785OooOoO0 = textView;
        this.f109784OooOoO = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30696OooOOOo(this.f109782OooOo, this.f109785OooOoO0, this.f109784OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30696OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109783OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
            DebugFragment debugFragment = this.f109782OooOo;
            OooO00o oooO00o = new OooO00o(debugFragment, this.f109785OooOoO0, this.f109784OooOoO, null);
            this.f109783OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(debugFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
