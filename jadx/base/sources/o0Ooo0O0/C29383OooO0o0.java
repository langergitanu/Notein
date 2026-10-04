package o0Ooo0O0;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.penkit.models.LayerInfo;
import o00o00.C25206OooO0Oo;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29383OooO0o0 implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f104197OooOo0o;

    public /* synthetic */ C29383OooO0o0(PageLayerEditor pageLayerEditor) {
        this.f104197OooOo0o = pageLayerEditor;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        final C30837OooO00o src = (C30837OooO00o) obj;
        final C30837OooO00o dst = (C30837OooO00o) obj2;
        int i = PageLayerEditor.f74865Oooo0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        final PageLayerEditor pageLayerEditor = this.f104197OooOo0o;
        pageLayerEditor.getClass();
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(dst.f110196OooO00o, LayerInfo.PAPER_THEME_LAYER_ID)) {
            Context context = pageLayerEditor.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
            String string = pageLayerEditor.getContext().getString(R.string.toast_can_not_merge_this_paper);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        } else {
            FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(pageLayerEditor).getChildFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            if (childFragmentManager.OooOooo("TipsDialogFragment") == null) {
                ViewOnClickListenerC29384OooO0oO viewOnClickListenerC29384OooO0oO = new ViewOnClickListenerC29384OooO0oO();
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o0Ooo0O0.OooOO0O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PageLayerEditor pageLayerEditor2 = pageLayerEditor;
                        PageLayerEditor.OooO00o oooO00o = pageLayerEditor2.eventListener;
                        if (oooO00o != null) {
                            oooO00o.OooO0O0();
                        }
                        com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = pageLayerEditor2.f74867OooOo0o;
                        if (oooO0OO == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                            throw null;
                        }
                        C30837OooO00o srcVO = src;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(srcVO, "srcVO");
                        C30837OooO00o dstVO = dst;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(dstVO, "dstVO");
                        C34406OooO00o.f123390OooO00o.OooO0o0("mergeLayer start. srcVO=" + srcVO + ", dstVO=" + dstVO, new Object[0]);
                        String str = dstVO.f110196OooO00o;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "none") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.PAPER_THEME_LAYER_ID) || kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.UNSPECIFIED_LAYER_ID)) {
                            return;
                        }
                        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new C29399OooOoO(oooO0OO, srcVO, dstVO, null), 2);
                    }
                };
                String string2 = pageLayerEditor.getContext().getString(R.string.merge_layers);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                String string3 = pageLayerEditor.getContext().getString(R.string.alter_merge_layers);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                new TipsDialogFragment(string2, string3, viewOnClickListenerC29384OooO0oO, onClickListener).show(childFragmentManager, "TipsDialogFragment");
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
