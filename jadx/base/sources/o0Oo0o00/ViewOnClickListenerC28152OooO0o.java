package o0Oo0o00;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o0OoooO.C29616OooO0OO;
import o0o00OOo.InterfaceC29892OooO0oO;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30025OoooOoo;
import o0o0OoOO.C30703OooOo0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28152OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99772OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99773OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28152OooO0o(Object obj, int i) {
        this.f99773OooOo0o = i;
        this.f99772OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        Object obj = this.f99772OooOo;
        switch (this.f99773OooOo0o) {
            case 0:
                CloudSyncDetailsFragment cloudSyncDetailsFragment = (CloudSyncDetailsFragment) obj;
                RecyclerView recyclerView = cloudSyncDetailsFragment.f71421Oooo;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvIssuesQueue");
                    throw null;
                }
                boolean z = recyclerView.getVisibility() == 0;
                RecyclerView recyclerView2 = cloudSyncDetailsFragment.f71421Oooo;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvIssuesQueue");
                    throw null;
                }
                recyclerView2.setVisibility(z ? 8 : 0);
                View view2 = cloudSyncDetailsFragment.f71431Oooo0oo;
                if (view2 != null) {
                    view2.setActivated(!z);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnIssuesQueueDetails");
                    throw null;
                }
            case 1:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) obj;
                NoteMeta noteMeta = (NoteMeta) baseToolbarChildFragment.Oooo0oo().f105932OooOOO.f121747OooOo0o.getValue();
                boolean unboundedNote = noteMeta != null ? noteMeta.getUnboundedNote() : false;
                NoteMeta noteMeta2 = (NoteMeta) baseToolbarChildFragment.Oooo0oo().f105932OooOOO.f121747OooOo0o.getValue();
                boolean lockAdded = noteMeta2 != null ? noteMeta2.getLockAdded() : false;
                boolean z2 = baseToolbarChildFragment.Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73444OooOoOO;
                InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) baseToolbarChildFragment.f76496OoooOO0.get(1);
                Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                InterfaceC29892OooO0oO interfaceC29892OooO0oO = value instanceof InterfaceC29892OooO0oO ? (InterfaceC29892OooO0oO) value : null;
                if (!baseToolbarChildFragment.Oooo00o().isActivated()) {
                    baseToolbarChildFragment.Oooo00o().setActivated(interfaceC29892OooO0oO != null ? interfaceC29892OooO0oO.OooOOO0(baseToolbarChildFragment.Oooo00o(), unboundedNote, lockAdded, z2) : false);
                    return;
                } else {
                    if (interfaceC29892OooO0oO != null) {
                        interfaceC29892OooO0oO.OooO00o();
                        return;
                    }
                    return;
                }
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                C30025OoooOoo c30025OoooOoo = (C30025OoooOoo) obj;
                C29936OooO0oO c29936OooO0oO = c30025OoooOoo.f106730Oooo00O;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, c30025OoooOoo.f106722OooOoO0);
                    return;
                }
                return;
            case 3:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) obj;
                if (myTemplateFragment.f78636OoooOOO == MyTemplateFragment.OooO00o.f78644OooOoO0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    c20358OooO00o.OooO00o("variant orientation click (books): LANDSCAPE, selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue() + ", tempColor=" + myTemplateFragment.OooOooo().f109026Oooo.getValue(), new Object[0]);
                    myTemplateFragment.OooOooo().OooOoO0(Orientation.LANDSCAPE);
                    return;
                }
                return;
            case 4:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = (DebugFragment) obj;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(debugFragment), null, null, new C30703OooOo0O(debugFragment, null), 3);
                return;
            default:
                StickerCollectionEditFragment stickerCollectionEditFragment = (StickerCollectionEditFragment) obj;
                stickerCollectionEditFragment.f79504Oooo00O.OooOoOO(new C29616OooO0OO(stickerCollectionEditFragment, i));
                return;
        }
    }
}
