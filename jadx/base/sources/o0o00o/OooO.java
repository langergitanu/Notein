package o0o00o;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import o000o0O0.OooOo;
import o0OoO0oo.C28766o0000Oo;
import o0Ooo0oo.C29535o000O0;
import o0Ooo0oo.C29566o0ooOOo;
import o0o00Ooo.C29920OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0o00Ooo.OooOO0 f106176OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106177OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC21987OooOoo f106178OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<OooOo, C32460OooOooO> f106179OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24019OooOO0o f106180OooOoOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.PenColorSetOnClickListener$onClick$1", m80623f = "PenColorSetOnClickListener.kt", m80624l = {40}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29920OooO0oo f106181OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106182OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO f106183OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C29920OooO0oo c29920OooO0oo, OooO oooO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f106181OooOo = c29920OooO0oo;
            this.f106183OooOoO0 = oooO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f106181OooOo, this.f106183OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106182OooOo0o;
            OooO oooO = this.f106183OooOoO0;
            C29920OooO0oo c29920OooO0oo = this.f106181OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (c29920OooO0oo.f106162OooO0o != 2) {
                    zBooleanValue = false;
                    if (!zBooleanValue) {
                        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = oooO.f106177OooOo0o;
                        oooO0O0.getClass();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29535o000O0(oooO0O0, c29920OooO0oo, null), 2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                ?? r8 = oooO.f106180OooOoOO;
                Integer num = new Integer(20);
                this.f106182OooOo0o = 1;
                obj = r8.invoke(num, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (!zBooleanValue) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, o0o00Ooo.OooOO0 oooOO02, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC21987OooOoo lifecycleOwner, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycleOwner, "lifecycleOwner");
        this.f106177OooOo0o = viewModel;
        this.f106176OooOo = oooOO02;
        this.f106179OooOoO0 = interfaceC32507OooOO0o;
        this.f106178OooOoO = lifecycleOwner;
        this.f106180OooOoOO = (C24019OooOO0o) interfaceC32508OooOOOo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        C29920OooO0oo c29920OooO0oo = tag instanceof C29920OooO0oo ? (C29920OooO0oo) tag : null;
        if (c29920OooO0oo == null) {
            return;
        }
        int id = view.getId();
        String id2 = c29920OooO0oo.f106158OooO00o;
        if (id == R.id.btn_delete) {
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106177OooOo0o;
            oooO0O0.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(id2, "id");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29566o0ooOOo(oooO0O0, id2, null), 2);
            return;
        }
        if (id != R.id.btn_edit_name) {
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this.f106178OooOoO), null, null, new OooO00o(c29920OooO0oo, this, null), 3);
            return;
        }
        this.f106176OooOo.dismiss();
        String name = c29920OooO0oo.f106159OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(id2, "id");
        this.f106179OooOoO0.invoke(new C28766o0000Oo(name, id2));
    }
}
