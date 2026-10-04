package com.orion.notein.p607ui.creative_library;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o00oo0Oo.C25686OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$observeState$1", m80623f = "CreativeLibrarySearchFragment.kt", m80624l = {117}, m80625m = "invokeSuspend")
public final class C23039OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreativeLibrarySearchFragment f71138OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71139OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$observeState$1$1", m80623f = "CreativeLibrarySearchFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23040OooOOoo.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreativeLibrarySearchFragment f71140OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71141OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreativeLibrarySearchFragment creativeLibrarySearchFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71140OooOo = creativeLibrarySearchFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f71140OooOo, continuation);
            oooO00o.f71141OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C23040OooOOoo.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C23040OooOOoo.OooO0O0 oooO0O0 = (C23040OooOOoo.OooO0O0) this.f71141OooOo0o;
            CreativeLibrarySearchFragment creativeLibrarySearchFragment = this.f71140OooOo;
            com.orion.notein.p607ui.creative_library.OooO00o oooO00o = creativeLibrarySearchFragment.f70879OooOooO;
            if (oooO00o == null) {
                OooOOO0.OooOOOO("adapter");
                throw null;
            }
            oooO00o.OooO0Oo(oooO0O0.f71159OooO0O0);
            C25686OooO0O0 c25686OooO0O0 = creativeLibrarySearchFragment.f70878OooOoo0;
            OooOOO0.OooO0Oo(c25686OooO0O0);
            boolean z = oooO0O0.f71158OooO00o;
            ((ProgressBar) c25686OooO0O0.f87637OooO0OO).setVisibility(z ? 0 : 8);
            C25686OooO0O0 c25686OooO0O02 = creativeLibrarySearchFragment.f70878OooOoo0;
            OooOOO0.OooO0Oo(c25686OooO0O02);
            List<C23033OooOO0o.OooO00o> list = oooO0O0.f71159OooO0O0;
            ((TextView) c25686OooO0O02.f87636OooO0O0).setVisibility((!z && list.isEmpty() && oooO0O0.f71161OooO0Oo) ? 0 : 8);
            C25686OooO0O0 c25686OooO0O03 = creativeLibrarySearchFragment.f70878OooOoo0;
            OooOOO0.OooO0Oo(c25686OooO0O03);
            ((RecyclerView) c25686OooO0O03.f87638OooO0Oo).setVisibility(list.isEmpty() ? 8 : 0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23039OooOOo0(CreativeLibrarySearchFragment creativeLibrarySearchFragment, Continuation<? super C23039OooOOo0> continuation) {
        super(2, continuation);
        this.f71138OooOo = creativeLibrarySearchFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23039OooOOo0(this.f71138OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23039OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71139OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreativeLibrarySearchFragment creativeLibrarySearchFragment = this.f71138OooOo;
            C23040OooOOoo c23040OooOOooOooOoOO = creativeLibrarySearchFragment.OooOoOO();
            OooO00o oooO00o = new OooO00o(creativeLibrarySearchFragment, null);
            this.f71139OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c23040OooOOooOooOoOO.f71152OooOOO0, oooO00o, this) == enumC32485OooO00o) {
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
