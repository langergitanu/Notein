package o0Ooo0O0;

import OoooooO.C21445Oooo;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import kotlin.coroutines.Continuation;
import o0OOooO.C27877OooO0o0;
import o0OOooO.C27881OooOO0O;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$onDeleteLayerButtonClicked$1", m80623f = "PageLayerEditor.kt", m80624l = {468}, m80625m = "invokeSuspend")
public final class C29390OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f104215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104216OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ViewOnClickListenerC29384OooO0oO f104217OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f104218OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ViewOnClickListenerC29386OooOO0 f104219OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f104220OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29390OooOOO0(PageLayerEditor pageLayerEditor, C30837OooO00o c30837OooO00o, ViewOnClickListenerC29384OooO0oO viewOnClickListenerC29384OooO0oO, ViewOnClickListenerC29386OooOO0 viewOnClickListenerC29386OooOO0, FragmentManager fragmentManager, Continuation continuation) {
        super(2, continuation);
        this.f104215OooOo = pageLayerEditor;
        this.f104218OooOoO0 = c30837OooO00o;
        this.f104217OooOoO = viewOnClickListenerC29384OooO0oO;
        this.f104219OooOoOO = viewOnClickListenerC29386OooOO0;
        this.f104220OooOoo0 = fragmentManager;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        ViewOnClickListenerC29386OooOO0 viewOnClickListenerC29386OooOO0 = this.f104219OooOoOO;
        FragmentManager fragmentManager = this.f104220OooOoo0;
        return new C29390OooOOO0(this.f104215OooOo, this.f104218OooOoO0, this.f104217OooOoO, viewOnClickListenerC29386OooOO0, fragmentManager, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29390OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104216OooOo0o;
        C30837OooO00o c30837OooO00o = this.f104218OooOoO0;
        String str = c30837OooO00o.f110196OooO00o;
        String str2 = c30837OooO00o.f110197OooO0O0;
        PageLayerEditor pageLayerEditor = this.f104215OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
            if (oooO0OO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            this.f104216OooOo0o = 1;
            C27881OooOO0O c27881OooOO0O = oooO0OO.f74774OooO0o0;
            c27881OooOO0O.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27877OooO0o0(c27881OooOO0O, str2, str, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PageLayerEditor");
        StringBuilder sb = new StringBuilder("onDeleteLayerButtonClicked, items' count is ");
        sb.append(jLongValue);
        c20358OooO00o.OooO0o0(C21445Oooo.OooO0O0(sb, ", layerId is ", str, ", noteId is ", str2), new Object[0]);
        String string = pageLayerEditor.getContext().getString(R.string.delete_layer);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = pageLayerEditor.getContext().getString(R.string.alter_delete_layers);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        new TipsDialogFragment(string, string2, this.f104217OooOoO, this.f104219OooOoOO).show(this.f104220OooOoo0, "TipsDialogFragment");
        return C32460OooOooO.f116667OooO00o;
    }
}
