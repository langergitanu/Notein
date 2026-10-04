package o0Ooo0O0;

import android.content.Context;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.global.R;
import com.orion.penkit.models.LayerInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$checkPageLayerName$1", m80623f = "PageLayerViewModel.kt", m80624l = {830}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f104236OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104237OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f104238OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, Context context, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f104236OooOo = oooO0OO;
        this.f104238OooOoO0 = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f104236OooOo, this.f104238OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String name;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104237OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0("checkPageLayerName start.", new Object[0]);
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f104236OooOo;
            List list = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
            if (list == null) {
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0OO("checkPageLayerName. layers is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                PageLayer pageLayer = (PageLayer) obj2;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), "default") && !kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), LayerInfo.PAPER_THEME_LAYER_ID) && ((name = pageLayer.getName()) == null || name.length() == 0)) {
                    linkedHashMap.put(pageLayer.getId(), this.f104238OooOoO0.getString(R.string.page_layer_default_name_template, new Integer(i2 - 1)));
                }
                i2 = i3;
            }
            if (linkedHashMap.isEmpty()) {
                C34406OooO00o.f123390OooO00o.OooO0o0("checkPageLayerName end. all layers have named.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.f123390OooO00o.OooO0o0("checkPageLayerName end. " + linkedHashMap + ".", new Object[0]);
            String str = (String) oooO0OO.f74783OooOOOo.getValue();
            this.f104237OooOo0o = 1;
            Object objOooO0o = oooO0OO.f74774OooO0o0.f98543OooO00o.OooO0o(linkedHashMap, str, this);
            if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == enumC32485OooO00o) {
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
